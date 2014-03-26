/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
sax	TokenNameIdentifier	 sax
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintWriter	TokenNameIdentifier	 Print Writer
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
Parser	TokenNameIdentifier	 Parser
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXNotRecognizedException	TokenNameIdentifier	 SAX Not Recognized Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXNotSupportedException	TokenNameIdentifier	 SAX Not Supported Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
XMLReader	TokenNameIdentifier	 XML Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
DefaultHandler	TokenNameIdentifier	 Default Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
ParserAdapter	TokenNameIdentifier	 Parser Adapter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
ParserFactory	TokenNameIdentifier	 Parser Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
XMLReaderFactory	TokenNameIdentifier	 XML Reader Factory
;	TokenNameSEMICOLON	
/** * A sample SAX2 counter. This sample program illustrates how to * register a SAX2 ContentHandler and receive the callbacks in * order to print information about the document. The output of * this program shows the time and count of elements, attributes, * ignorable whitespaces, and characters appearing in the document. * <p> * This class is useful as a "poor-man's" performance tester to * compare the speed and accuracy of various SAX parsers. However, * it is important to note that the first parse time of a parser * will include both VM class load time and parser initialization * that would not be present in subsequent parses with the same * file. * <p> * <strong>Note:</strong> The results produced by this program * should never be accepted as true performance measurements. * * @author Andy Clark, IBM * * @version $Id: Counter.java 944773 2010-05-16 08:29:07Z mukulg $ */	TokenNameCOMMENT_JAVADOC	 A sample SAX2 counter. This sample program illustrates how to register a SAX2 ContentHandler and receive the callbacks in order to print information about the document. The output of this program shows the time and count of elements, attributes, ignorable whitespaces, and characters appearing in the document. <p> This class is useful as a "poor-man's" performance tester to compare the speed and accuracy of various SAX parsers. However, it is important to note that the first parse time of a parser will include both VM class load time and parser initialization that would not be present in subsequent parses with the same file. <p> <strong>Note:</strong> The results produced by this program should never be accepted as true performance measurements. * @author Andy Clark, IBM * @version $Id: Counter.java 944773 2010-05-16 08:29:07Z mukulg $ 
public	TokenNamepublic	
class	TokenNameclass	
Counter	TokenNameIdentifier	 Counter
extends	TokenNameextends	
DefaultHandler	TokenNameIdentifier	 Default Handler
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
// feature ids 	TokenNameCOMMENT_LINE	feature ids 
/** Namespaces feature id (http://xml.org/sax/features/namespaces). */	TokenNameCOMMENT_JAVADOC	 Namespaces feature id (http://xml.org/sax/features/namespaces). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NAMESPACES_FEATURE_ID	TokenNameIdentifier	 NAMESPACES  FEATURE  ID
=	TokenNameEQUAL	
"http://xml.org/sax/features/namespaces"	TokenNameStringLiteral	http://xml.org/sax/features/namespaces
;	TokenNameSEMICOLON	
/** Namespace prefixes feature id (http://xml.org/sax/features/namespace-prefixes). */	TokenNameCOMMENT_JAVADOC	 Namespace prefixes feature id (http://xml.org/sax/features/namespace-prefixes). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NAMESPACE_PREFIXES_FEATURE_ID	TokenNameIdentifier	 NAMESPACE  PREFIXES  FEATURE  ID
=	TokenNameEQUAL	
"http://xml.org/sax/features/namespace-prefixes"	TokenNameStringLiteral	http://xml.org/sax/features/namespace-prefixes
;	TokenNameSEMICOLON	
/** Validation feature id (http://xml.org/sax/features/validation). */	TokenNameCOMMENT_JAVADOC	 Validation feature id (http://xml.org/sax/features/validation). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
VALIDATION_FEATURE_ID	TokenNameIdentifier	 VALIDATION  FEATURE  ID
=	TokenNameEQUAL	
"http://xml.org/sax/features/validation"	TokenNameStringLiteral	http://xml.org/sax/features/validation
;	TokenNameSEMICOLON	
/** Schema validation feature id (http://apache.org/xml/features/validation/schema). */	TokenNameCOMMENT_JAVADOC	 Schema validation feature id (http://apache.org/xml/features/validation/schema). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SCHEMA_VALIDATION_FEATURE_ID	TokenNameIdentifier	 SCHEMA  VALIDATION  FEATURE  ID
=	TokenNameEQUAL	
"http://apache.org/xml/features/validation/schema"	TokenNameStringLiteral	http://apache.org/xml/features/validation/schema
;	TokenNameSEMICOLON	
/** Schema full checking feature id (http://apache.org/xml/features/validation/schema-full-checking). */	TokenNameCOMMENT_JAVADOC	 Schema full checking feature id (http://apache.org/xml/features/validation/schema-full-checking). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SCHEMA_FULL_CHECKING_FEATURE_ID	TokenNameIdentifier	 SCHEMA  FULL  CHECKING  FEATURE  ID
=	TokenNameEQUAL	
"http://apache.org/xml/features/validation/schema-full-checking"	TokenNameStringLiteral	http://apache.org/xml/features/validation/schema-full-checking
;	TokenNameSEMICOLON	
/** Honour all schema locations feature id (http://apache.org/xml/features/honour-all-schemaLocations). */	TokenNameCOMMENT_JAVADOC	 Honour all schema locations feature id (http://apache.org/xml/features/honour-all-schemaLocations). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HONOUR_ALL_SCHEMA_LOCATIONS_ID	TokenNameIdentifier	 HONOUR  ALL  SCHEMA  LOCATIONS  ID
=	TokenNameEQUAL	
"http://apache.org/xml/features/honour-all-schemaLocations"	TokenNameStringLiteral	http://apache.org/xml/features/honour-all-schemaLocations
;	TokenNameSEMICOLON	
/** Validate schema annotations feature id (http://apache.org/xml/features/validate-annotations) */	TokenNameCOMMENT_JAVADOC	 Validate schema annotations feature id (http://apache.org/xml/features/validate-annotations) 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
VALIDATE_ANNOTATIONS_ID	TokenNameIdentifier	 VALIDATE  ANNOTATIONS  ID
=	TokenNameEQUAL	
"http://apache.org/xml/features/validate-annotations"	TokenNameStringLiteral	http://apache.org/xml/features/validate-annotations
;	TokenNameSEMICOLON	
/** Dynamic validation feature id (http://apache.org/xml/features/validation/dynamic). */	TokenNameCOMMENT_JAVADOC	 Dynamic validation feature id (http://apache.org/xml/features/validation/dynamic). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DYNAMIC_VALIDATION_FEATURE_ID	TokenNameIdentifier	 DYNAMIC  VALIDATION  FEATURE  ID
=	TokenNameEQUAL	
"http://apache.org/xml/features/validation/dynamic"	TokenNameStringLiteral	http://apache.org/xml/features/validation/dynamic
;	TokenNameSEMICOLON	
/** XInclude feature id (http://apache.org/xml/features/xinclude). */	TokenNameCOMMENT_JAVADOC	 XInclude feature id (http://apache.org/xml/features/xinclude). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XINCLUDE_FEATURE_ID	TokenNameIdentifier	 XINCLUDE  FEATURE  ID
=	TokenNameEQUAL	
"http://apache.org/xml/features/xinclude"	TokenNameStringLiteral	http://apache.org/xml/features/xinclude
;	TokenNameSEMICOLON	
/** XInclude fixup base URIs feature id (http://apache.org/xml/features/xinclude/fixup-base-uris). */	TokenNameCOMMENT_JAVADOC	 XInclude fixup base URIs feature id (http://apache.org/xml/features/xinclude/fixup-base-uris). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XINCLUDE_FIXUP_BASE_URIS_FEATURE_ID	TokenNameIdentifier	 XINCLUDE  FIXUP  BASE  URIS  FEATURE  ID
=	TokenNameEQUAL	
"http://apache.org/xml/features/xinclude/fixup-base-uris"	TokenNameStringLiteral	http://apache.org/xml/features/xinclude/fixup-base-uris
;	TokenNameSEMICOLON	
/** XInclude fixup language feature id (http://apache.org/xml/features/xinclude/fixup-language). */	TokenNameCOMMENT_JAVADOC	 XInclude fixup language feature id (http://apache.org/xml/features/xinclude/fixup-language). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XINCLUDE_FIXUP_LANGUAGE_FEATURE_ID	TokenNameIdentifier	 XINCLUDE  FIXUP  LANGUAGE  FEATURE  ID
=	TokenNameEQUAL	
"http://apache.org/xml/features/xinclude/fixup-language"	TokenNameStringLiteral	http://apache.org/xml/features/xinclude/fixup-language
;	TokenNameSEMICOLON	
// default settings 	TokenNameCOMMENT_LINE	default settings 
/** Default parser name. */	TokenNameCOMMENT_JAVADOC	 Default parser name. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_PARSER_NAME	TokenNameIdentifier	 DEFAULT  PARSER  NAME
=	TokenNameEQUAL	
"org.apache.xerces.parsers.SAXParser"	TokenNameStringLiteral	org.apache.xerces.parsers.SAXParser
;	TokenNameSEMICOLON	
/** Default repetition (1). */	TokenNameCOMMENT_JAVADOC	 Default repetition (1). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_REPETITION	TokenNameIdentifier	 DEFAULT  REPETITION
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Default namespaces support (true). */	TokenNameCOMMENT_JAVADOC	 Default namespaces support (true). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEFAULT_NAMESPACES	TokenNameIdentifier	 DEFAULT  NAMESPACES
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** Default namespace prefixes (false). */	TokenNameCOMMENT_JAVADOC	 Default namespace prefixes (false). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEFAULT_NAMESPACE_PREFIXES	TokenNameIdentifier	 DEFAULT  NAMESPACE  PREFIXES
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Default validation support (false). */	TokenNameCOMMENT_JAVADOC	 Default validation support (false). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEFAULT_VALIDATION	TokenNameIdentifier	 DEFAULT  VALIDATION
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Default Schema validation support (false). */	TokenNameCOMMENT_JAVADOC	 Default Schema validation support (false). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEFAULT_SCHEMA_VALIDATION	TokenNameIdentifier	 DEFAULT  SCHEMA  VALIDATION
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Default Schema full checking support (false). */	TokenNameCOMMENT_JAVADOC	 Default Schema full checking support (false). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEFAULT_SCHEMA_FULL_CHECKING	TokenNameIdentifier	 DEFAULT  SCHEMA  FULL  CHECKING
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Default honour all schema locations (false). */	TokenNameCOMMENT_JAVADOC	 Default honour all schema locations (false). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEFAULT_HONOUR_ALL_SCHEMA_LOCATIONS	TokenNameIdentifier	 DEFAULT  HONOUR  ALL  SCHEMA  LOCATIONS
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Default validate schema annotations (false). */	TokenNameCOMMENT_JAVADOC	 Default validate schema annotations (false). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEFAULT_VALIDATE_ANNOTATIONS	TokenNameIdentifier	 DEFAULT  VALIDATE  ANNOTATIONS
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Default dynamic validation support (false). */	TokenNameCOMMENT_JAVADOC	 Default dynamic validation support (false). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEFAULT_DYNAMIC_VALIDATION	TokenNameIdentifier	 DEFAULT  DYNAMIC  VALIDATION
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Default XInclude processing support (false). */	TokenNameCOMMENT_JAVADOC	 Default XInclude processing support (false). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEFAULT_XINCLUDE	TokenNameIdentifier	 DEFAULT  XINCLUDE
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Default XInclude fixup base URIs support (true). */	TokenNameCOMMENT_JAVADOC	 Default XInclude fixup base URIs support (true). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEFAULT_XINCLUDE_FIXUP_BASE_URIS	TokenNameIdentifier	 DEFAULT  XINCLUDE  FIXUP  BASE  URIS
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** Default XInclude fixup language support (true). */	TokenNameCOMMENT_JAVADOC	 Default XInclude fixup language support (true). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEFAULT_XINCLUDE_FIXUP_LANGUAGE	TokenNameIdentifier	 DEFAULT  XINCLUDE  FIXUP  LANGUAGE
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** Default memory usage report (false). */	TokenNameCOMMENT_JAVADOC	 Default memory usage report (false). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEFAULT_MEMORY_USAGE	TokenNameIdentifier	 DEFAULT  MEMORY  USAGE
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Default "tagginess" report (false). */	TokenNameCOMMENT_JAVADOC	 Default "tagginess" report (false). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEFAULT_TAGGINESS	TokenNameIdentifier	 DEFAULT  TAGGINESS
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Number of elements. */	TokenNameCOMMENT_JAVADOC	 Number of elements. 
protected	TokenNameprotected	
long	TokenNamelong	
fElements	TokenNameIdentifier	 f Elements
;	TokenNameSEMICOLON	
/** Number of attributes. */	TokenNameCOMMENT_JAVADOC	 Number of attributes. 
protected	TokenNameprotected	
long	TokenNamelong	
fAttributes	TokenNameIdentifier	 f Attributes
;	TokenNameSEMICOLON	
/** Number of characters. */	TokenNameCOMMENT_JAVADOC	 Number of characters. 
protected	TokenNameprotected	
long	TokenNamelong	
fCharacters	TokenNameIdentifier	 f Characters
;	TokenNameSEMICOLON	
/** Number of ignorable whitespace characters. */	TokenNameCOMMENT_JAVADOC	 Number of ignorable whitespace characters. 
protected	TokenNameprotected	
long	TokenNamelong	
fIgnorableWhitespace	TokenNameIdentifier	 f Ignorable Whitespace
;	TokenNameSEMICOLON	
/** Number of characters of tags. */	TokenNameCOMMENT_JAVADOC	 Number of characters of tags. 
protected	TokenNameprotected	
long	TokenNamelong	
fTagCharacters	TokenNameIdentifier	 f Tag Characters
;	TokenNameSEMICOLON	
/** Number of other content characters for the "tagginess" calculation. */	TokenNameCOMMENT_JAVADOC	 Number of other content characters for the "tagginess" calculation. 
protected	TokenNameprotected	
long	TokenNamelong	
fOtherCharacters	TokenNameIdentifier	 f Other Characters
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
Counter	TokenNameIdentifier	 Counter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// <init>() 	TokenNameCOMMENT_LINE	<init>() 
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
/** Prints the results. */	TokenNameCOMMENT_JAVADOC	 Prints the results. 
public	TokenNamepublic	
void	TokenNamevoid	
printResults	TokenNameIdentifier	 print Results
(	TokenNameLPAREN	
PrintWriter	TokenNameIdentifier	 Print Writer
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
long	TokenNamelong	
time	TokenNameIdentifier	 time
,	TokenNameCOMMA	
long	TokenNamelong	
memory	TokenNameIdentifier	 memory
,	TokenNameCOMMA	
boolean	TokenNameboolean	
tagginess	TokenNameIdentifier	 tagginess
,	TokenNameCOMMA	
int	TokenNameint	
repetition	TokenNameIdentifier	 repetition
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// filename.xml: 631 ms (4 elems, 0 attrs, 78 spaces, 0 chars) 	TokenNameCOMMENT_LINE	filename.xml: 631 ms (4 elems, 0 attrs, 78 spaces, 0 chars) 
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
": "	TokenNameStringLiteral	: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
repetition	TokenNameIdentifier	 repetition
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
repetition	TokenNameIdentifier	 repetition
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
'='	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
/	TokenNameDIVIDE	
repetition	TokenNameIdentifier	 repetition
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" ms"	TokenNameStringLiteral	 ms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
memory	TokenNameIdentifier	 memory
!=	TokenNameNOT_EQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
", "	TokenNameStringLiteral	, 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
memory	TokenNameIdentifier	 memory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" bytes"	TokenNameStringLiteral	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" ("	TokenNameStringLiteral	 (
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fElements	TokenNameIdentifier	 f Elements
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" elems, "	TokenNameStringLiteral	 elems, 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fAttributes	TokenNameIdentifier	 f Attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" attrs, "	TokenNameStringLiteral	 attrs, 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fIgnorableWhitespace	TokenNameIdentifier	 f Ignorable Whitespace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" spaces, "	TokenNameStringLiteral	 spaces, 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCharacters	TokenNameIdentifier	 f Characters
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" chars)"	TokenNameStringLiteral	 chars)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tagginess	TokenNameIdentifier	 tagginess
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
totalCharacters	TokenNameIdentifier	 total Characters
=	TokenNameEQUAL	
fTagCharacters	TokenNameIdentifier	 f Tag Characters
+	TokenNamePLUS	
fOtherCharacters	TokenNameIdentifier	 f Other Characters
+	TokenNamePLUS	
fCharacters	TokenNameIdentifier	 f Characters
+	TokenNamePLUS	
fIgnorableWhitespace	TokenNameIdentifier	 f Ignorable Whitespace
;	TokenNameSEMICOLON	
long	TokenNamelong	
tagValue	TokenNameIdentifier	 tag Value
=	TokenNameEQUAL	
fTagCharacters	TokenNameIdentifier	 f Tag Characters
*	TokenNameMULTIPLY	
100	TokenNameIntegerLiteral	
/	TokenNameDIVIDE	
totalCharacters	TokenNameIdentifier	 total Characters
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
tagValue	TokenNameIdentifier	 tag Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"% tagginess"	TokenNameStringLiteral	% tagginess
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// printResults(PrintWriter,String,long) 	TokenNameCOMMENT_LINE	printResults(PrintWriter,String,long) 
// 	TokenNameCOMMENT_LINE	 
// ContentHandler methods 	TokenNameCOMMENT_LINE	ContentHandler methods 
// 	TokenNameCOMMENT_LINE	 
/** Start document. */	TokenNameCOMMENT_JAVADOC	 Start document. 
public	TokenNamepublic	
void	TokenNamevoid	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
fElements	TokenNameIdentifier	 f Elements
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fAttributes	TokenNameIdentifier	 f Attributes
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fCharacters	TokenNameIdentifier	 f Characters
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fIgnorableWhitespace	TokenNameIdentifier	 f Ignorable Whitespace
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fTagCharacters	TokenNameIdentifier	 f Tag Characters
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// startDocument() 	TokenNameCOMMENT_LINE	startDocument() 
/** Start element. */	TokenNameCOMMENT_JAVADOC	 Start element. 
public	TokenNamepublic	
void	TokenNamevoid	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
local	TokenNameIdentifier	 local
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
raw	TokenNameIdentifier	 raw
,	TokenNameCOMMA	
Attributes	TokenNameIdentifier	 Attributes
attrs	TokenNameIdentifier	 attrs
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
fElements	TokenNameIdentifier	 f Elements
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
fTagCharacters	TokenNameIdentifier	 f Tag Characters
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// open angle bracket 	TokenNameCOMMENT_LINE	open angle bracket 
fTagCharacters	TokenNameIdentifier	 f Tag Characters
+=	TokenNamePLUS_EQUAL	
raw	TokenNameIdentifier	 raw
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attrs	TokenNameIdentifier	 attrs
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
attrCount	TokenNameIdentifier	 attr Count
=	TokenNameEQUAL	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fAttributes	TokenNameIdentifier	 f Attributes
+=	TokenNamePLUS_EQUAL	
attrCount	TokenNameIdentifier	 attr Count
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
attrCount	TokenNameIdentifier	 attr Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fTagCharacters	TokenNameIdentifier	 f Tag Characters
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// space 	TokenNameCOMMENT_LINE	space 
fTagCharacters	TokenNameIdentifier	 f Tag Characters
+=	TokenNamePLUS_EQUAL	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
getQName	TokenNameIdentifier	 get Q Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTagCharacters	TokenNameIdentifier	 f Tag Characters
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// '=' 	TokenNameCOMMENT_LINE	'=' 
fTagCharacters	TokenNameIdentifier	 f Tag Characters
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// open quote 	TokenNameCOMMENT_LINE	open quote 
fOtherCharacters	TokenNameIdentifier	 f Other Characters
+=	TokenNamePLUS_EQUAL	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fTagCharacters	TokenNameIdentifier	 f Tag Characters
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// close quote 	TokenNameCOMMENT_LINE	close quote 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
fTagCharacters	TokenNameIdentifier	 f Tag Characters
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// close angle bracket 	TokenNameCOMMENT_LINE	close angle bracket 
}	TokenNameRBRACE	
// startElement(String,String,StringAttributes) 	TokenNameCOMMENT_LINE	startElement(String,String,StringAttributes) 
/** Characters. */	TokenNameCOMMENT_JAVADOC	 Characters. 
public	TokenNamepublic	
void	TokenNamevoid	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
fCharacters	TokenNameIdentifier	 f Characters
+=	TokenNamePLUS_EQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// characters(char[],int,int); 	TokenNameCOMMENT_LINE	characters(char[],int,int); 
/** Ignorable whitespace. */	TokenNameCOMMENT_JAVADOC	 Ignorable whitespace. 
public	TokenNamepublic	
void	TokenNamevoid	
ignorableWhitespace	TokenNameIdentifier	 ignorable Whitespace
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
fIgnorableWhitespace	TokenNameIdentifier	 f Ignorable Whitespace
+=	TokenNamePLUS_EQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ignorableWhitespace(char[],int,int); 	TokenNameCOMMENT_LINE	ignorableWhitespace(char[],int,int); 
/** Processing instruction. */	TokenNameCOMMENT_JAVADOC	 Processing instruction. 
public	TokenNamepublic	
void	TokenNamevoid	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
fTagCharacters	TokenNameIdentifier	 f Tag Characters
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// "<?" 	TokenNameCOMMENT_LINE	"<?" 
fTagCharacters	TokenNameIdentifier	 f Tag Characters
+=	TokenNamePLUS_EQUAL	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fTagCharacters	TokenNameIdentifier	 f Tag Characters
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// space 	TokenNameCOMMENT_LINE	space 
fOtherCharacters	TokenNameIdentifier	 f Other Characters
+=	TokenNamePLUS_EQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fTagCharacters	TokenNameIdentifier	 f Tag Characters
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// "?>" 	TokenNameCOMMENT_LINE	"?>" 
}	TokenNameRBRACE	
// processingInstruction(String,String) 	TokenNameCOMMENT_LINE	processingInstruction(String,String) 
// 	TokenNameCOMMENT_LINE	 
// ErrorHandler methods 	TokenNameCOMMENT_LINE	ErrorHandler methods 
// 	TokenNameCOMMENT_LINE	 
/** Warning. */	TokenNameCOMMENT_JAVADOC	 Warning. 
public	TokenNamepublic	
void	TokenNamevoid	
warning	TokenNameIdentifier	 warning
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
printError	TokenNameIdentifier	 print Error
(	TokenNameLPAREN	
"Warning"	TokenNameStringLiteral	Warning
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// warning(SAXParseException) 	TokenNameCOMMENT_LINE	warning(SAXParseException) 
/** Error. */	TokenNameCOMMENT_JAVADOC	 Error. 
public	TokenNamepublic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
printError	TokenNameIdentifier	 print Error
(	TokenNameLPAREN	
"Error"	TokenNameStringLiteral	Error
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// error(SAXParseException) 	TokenNameCOMMENT_LINE	error(SAXParseException) 
/** Fatal error. */	TokenNameCOMMENT_JAVADOC	 Fatal error. 
public	TokenNamepublic	
void	TokenNamevoid	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
printError	TokenNameIdentifier	 print Error
(	TokenNameLPAREN	
"Fatal Error"	TokenNameStringLiteral	Fatal Error
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//throw ex; 	TokenNameCOMMENT_LINE	throw ex; 
}	TokenNameRBRACE	
// fatalError(SAXParseException) 	TokenNameCOMMENT_LINE	fatalError(SAXParseException) 
// 	TokenNameCOMMENT_LINE	 
// Protected methods 	TokenNameCOMMENT_LINE	Protected methods 
// 	TokenNameCOMMENT_LINE	 
/** Prints the error message. */	TokenNameCOMMENT_JAVADOC	 Prints the error message. 
protected	TokenNameprotected	
void	TokenNamevoid	
printError	TokenNameIdentifier	 print Error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"["	TokenNameStringLiteral	[
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"] "	TokenNameStringLiteral	] 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"!!!"	TokenNameStringLiteral	!!!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
=	TokenNameEQUAL	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
systemId	TokenNameIdentifier	 system Id
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
systemId	TokenNameIdentifier	 system Id
=	TokenNameEQUAL	
systemId	TokenNameIdentifier	 system Id
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
": "	TokenNameStringLiteral	: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// printError(String,SAXParseException) 	TokenNameCOMMENT_LINE	printError(String,SAXParseException) 
// 	TokenNameCOMMENT_LINE	 
// MAIN 	TokenNameCOMMENT_LINE	MAIN 
// 	TokenNameCOMMENT_LINE	 
/** Main program entry point. */	TokenNameCOMMENT_JAVADOC	 Main program entry point. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
argv	TokenNameIdentifier	 argv
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// is there anything to do? 	TokenNameCOMMENT_LINE	is there anything to do? 
if	TokenNameif	
(	TokenNameLPAREN	
argv	TokenNameIdentifier	 argv
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printUsage	TokenNameIdentifier	 print Usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// variables 	TokenNameCOMMENT_LINE	variables 
Counter	TokenNameIdentifier	 Counter
counter	TokenNameIdentifier	 counter
=	TokenNameEQUAL	
new	TokenNamenew	
Counter	TokenNameIdentifier	 Counter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PrintWriter	TokenNameIdentifier	 Print Writer
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLReader	TokenNameIdentifier	 XML Reader
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
repetition	TokenNameIdentifier	 repetition
=	TokenNameEQUAL	
DEFAULT_REPETITION	TokenNameIdentifier	 DEFAULT  REPETITION
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
namespaces	TokenNameIdentifier	 namespaces
=	TokenNameEQUAL	
DEFAULT_NAMESPACES	TokenNameIdentifier	 DEFAULT  NAMESPACES
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
namespacePrefixes	TokenNameIdentifier	 namespace Prefixes
=	TokenNameEQUAL	
DEFAULT_NAMESPACE_PREFIXES	TokenNameIdentifier	 DEFAULT  NAMESPACE  PREFIXES
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
validation	TokenNameIdentifier	 validation
=	TokenNameEQUAL	
DEFAULT_VALIDATION	TokenNameIdentifier	 DEFAULT  VALIDATION
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
schemaValidation	TokenNameIdentifier	 schema Validation
=	TokenNameEQUAL	
DEFAULT_SCHEMA_VALIDATION	TokenNameIdentifier	 DEFAULT  SCHEMA  VALIDATION
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
schemaFullChecking	TokenNameIdentifier	 schema Full Checking
=	TokenNameEQUAL	
DEFAULT_SCHEMA_FULL_CHECKING	TokenNameIdentifier	 DEFAULT  SCHEMA  FULL  CHECKING
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
honourAllSchemaLocations	TokenNameIdentifier	 honour All Schema Locations
=	TokenNameEQUAL	
DEFAULT_HONOUR_ALL_SCHEMA_LOCATIONS	TokenNameIdentifier	 DEFAULT  HONOUR  ALL  SCHEMA  LOCATIONS
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
validateAnnotations	TokenNameIdentifier	 validate Annotations
=	TokenNameEQUAL	
DEFAULT_VALIDATE_ANNOTATIONS	TokenNameIdentifier	 DEFAULT  VALIDATE  ANNOTATIONS
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
dynamicValidation	TokenNameIdentifier	 dynamic Validation
=	TokenNameEQUAL	
DEFAULT_DYNAMIC_VALIDATION	TokenNameIdentifier	 DEFAULT  DYNAMIC  VALIDATION
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
xincludeProcessing	TokenNameIdentifier	 xinclude Processing
=	TokenNameEQUAL	
DEFAULT_XINCLUDE	TokenNameIdentifier	 DEFAULT  XINCLUDE
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
xincludeFixupBaseURIs	TokenNameIdentifier	 xinclude Fixup Base UR Is
=	TokenNameEQUAL	
DEFAULT_XINCLUDE_FIXUP_BASE_URIS	TokenNameIdentifier	 DEFAULT  XINCLUDE  FIXUP  BASE  URIS
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
xincludeFixupLanguage	TokenNameIdentifier	 xinclude Fixup Language
=	TokenNameEQUAL	
DEFAULT_XINCLUDE_FIXUP_LANGUAGE	TokenNameIdentifier	 DEFAULT  XINCLUDE  FIXUP  LANGUAGE
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
memoryUsage	TokenNameIdentifier	 memory Usage
=	TokenNameEQUAL	
DEFAULT_MEMORY_USAGE	TokenNameIdentifier	 DEFAULT  MEMORY  USAGE
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
tagginess	TokenNameIdentifier	 tagginess
=	TokenNameEQUAL	
DEFAULT_TAGGINESS	TokenNameIdentifier	 DEFAULT  TAGGINESS
;	TokenNameSEMICOLON	
// process arguments 	TokenNameCOMMENT_LINE	process arguments 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
argv	TokenNameIdentifier	 argv
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
argv	TokenNameIdentifier	 argv
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"-"	TokenNameStringLiteral	-
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
option	TokenNameIdentifier	 option
=	TokenNameEQUAL	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"p"	TokenNameStringLiteral	p
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// get parser name 	TokenNameCOMMENT_LINE	get parser name 
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
argv	TokenNameIdentifier	 argv
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"error: Missing argument to -p option."	TokenNameStringLiteral	error: Missing argument to -p option.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
parserName	TokenNameIdentifier	 parser Name
=	TokenNameEQUAL	
argv	TokenNameIdentifier	 argv
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// create parser 	TokenNameCOMMENT_LINE	create parser 
try	TokenNametry	
{	TokenNameLBRACE	
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
XMLReaderFactory	TokenNameIdentifier	 XML Reader Factory
.	TokenNameDOT	
createXMLReader	TokenNameIdentifier	 create XML Reader
(	TokenNameLPAREN	
parserName	TokenNameIdentifier	 parser Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Parser	TokenNameIdentifier	 Parser
sax1Parser	TokenNameIdentifier	 sax1 Parser
=	TokenNameEQUAL	
ParserFactory	TokenNameIdentifier	 Parser Factory
.	TokenNameDOT	
makeParser	TokenNameIdentifier	 make Parser
(	TokenNameLPAREN	
parserName	TokenNameIdentifier	 parser Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
new	TokenNamenew	
ParserAdapter	TokenNameIdentifier	 Parser Adapter
(	TokenNameLPAREN	
sax1Parser	TokenNameIdentifier	 sax1 Parser
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"warning: Features and properties not supported on SAX1 parsers."	TokenNameStringLiteral	warning: Features and properties not supported on SAX1 parsers.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"error: Unable to instantiate parser ("	TokenNameStringLiteral	error: Unable to instantiate parser (
+	TokenNamePLUS	
parserName	TokenNameIdentifier	 parser Name
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"x"	TokenNameStringLiteral	x
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
argv	TokenNameIdentifier	 argv
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"error: Missing argument to -x option."	TokenNameStringLiteral	error: Missing argument to -x option.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
number	TokenNameIdentifier	 number
=	TokenNameEQUAL	
argv	TokenNameIdentifier	 argv
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"error: Repetition must be at least 1."	TokenNameStringLiteral	error: Repetition must be at least 1.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
repetition	TokenNameIdentifier	 repetition
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"error: invalid number ("	TokenNameStringLiteral	error: invalid number (
+	TokenNamePLUS	
number	TokenNameIdentifier	 number
+	TokenNamePLUS	
")."	TokenNameStringLiteral	).
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"n"	TokenNameStringLiteral	n
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
namespaces	TokenNameIdentifier	 namespaces
=	TokenNameEQUAL	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"n"	TokenNameStringLiteral	n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"np"	TokenNameStringLiteral	np
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
namespacePrefixes	TokenNameIdentifier	 namespace Prefixes
=	TokenNameEQUAL	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"np"	TokenNameStringLiteral	np
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"v"	TokenNameStringLiteral	v
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
validation	TokenNameIdentifier	 validation
=	TokenNameEQUAL	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"v"	TokenNameStringLiteral	v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"s"	TokenNameStringLiteral	s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
schemaValidation	TokenNameIdentifier	 schema Validation
=	TokenNameEQUAL	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"s"	TokenNameStringLiteral	s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
schemaFullChecking	TokenNameIdentifier	 schema Full Checking
=	TokenNameEQUAL	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"hs"	TokenNameStringLiteral	hs
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
honourAllSchemaLocations	TokenNameIdentifier	 honour All Schema Locations
=	TokenNameEQUAL	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"hs"	TokenNameStringLiteral	hs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"va"	TokenNameStringLiteral	va
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
validateAnnotations	TokenNameIdentifier	 validate Annotations
=	TokenNameEQUAL	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"va"	TokenNameStringLiteral	va
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"dv"	TokenNameStringLiteral	dv
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dynamicValidation	TokenNameIdentifier	 dynamic Validation
=	TokenNameEQUAL	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"dv"	TokenNameStringLiteral	dv
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"xi"	TokenNameStringLiteral	xi
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
xincludeProcessing	TokenNameIdentifier	 xinclude Processing
=	TokenNameEQUAL	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xi"	TokenNameStringLiteral	xi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"xb"	TokenNameStringLiteral	xb
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
xincludeFixupBaseURIs	TokenNameIdentifier	 xinclude Fixup Base UR Is
=	TokenNameEQUAL	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xb"	TokenNameStringLiteral	xb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"xl"	TokenNameStringLiteral	xl
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
xincludeFixupLanguage	TokenNameIdentifier	 xinclude Fixup Language
=	TokenNameEQUAL	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xl"	TokenNameStringLiteral	xl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"m"	TokenNameStringLiteral	m
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
memoryUsage	TokenNameIdentifier	 memory Usage
=	TokenNameEQUAL	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"m"	TokenNameStringLiteral	m
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"t"	TokenNameStringLiteral	t
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tagginess	TokenNameIdentifier	 tagginess
=	TokenNameEQUAL	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"t"	TokenNameStringLiteral	t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"-rem"	TokenNameStringLiteral	-rem
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
argv	TokenNameIdentifier	 argv
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"error: Missing argument to -# option."	TokenNameStringLiteral	error: Missing argument to -# option.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"# "	TokenNameStringLiteral	# 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
argv	TokenNameIdentifier	 argv
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"h"	TokenNameStringLiteral	h
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printUsage	TokenNameIdentifier	 print Usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"error: unknown option ("	TokenNameStringLiteral	error: unknown option (
+	TokenNamePLUS	
option	TokenNameIdentifier	 option
+	TokenNamePLUS	
")."	TokenNameStringLiteral	).
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// use default parser? 	TokenNameCOMMENT_LINE	use default parser? 
if	TokenNameif	
(	TokenNameLPAREN	
parser	TokenNameIdentifier	 parser
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// create parser 	TokenNameCOMMENT_LINE	create parser 
try	TokenNametry	
{	TokenNameLBRACE	
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
XMLReaderFactory	TokenNameIdentifier	 XML Reader Factory
.	TokenNameDOT	
createXMLReader	TokenNameIdentifier	 create XML Reader
(	TokenNameLPAREN	
DEFAULT_PARSER_NAME	TokenNameIdentifier	 DEFAULT  PARSER  NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"error: Unable to instantiate parser ("	TokenNameStringLiteral	error: Unable to instantiate parser (
+	TokenNamePLUS	
DEFAULT_PARSER_NAME	TokenNameIdentifier	 DEFAULT  PARSER  NAME
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// set parser features 	TokenNameCOMMENT_LINE	set parser features 
try	TokenNametry	
{	TokenNameLBRACE	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
NAMESPACES_FEATURE_ID	TokenNameIdentifier	 NAMESPACES  FEATURE  ID
,	TokenNameCOMMA	
namespaces	TokenNameIdentifier	 namespaces
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"warning: Parser does not support feature ("	TokenNameStringLiteral	warning: Parser does not support feature (
+	TokenNamePLUS	
NAMESPACES_FEATURE_ID	TokenNameIdentifier	 NAMESPACES  FEATURE  ID
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
NAMESPACE_PREFIXES_FEATURE_ID	TokenNameIdentifier	 NAMESPACE  PREFIXES  FEATURE  ID
,	TokenNameCOMMA	
namespacePrefixes	TokenNameIdentifier	 namespace Prefixes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"warning: Parser does not support feature ("	TokenNameStringLiteral	warning: Parser does not support feature (
+	TokenNamePLUS	
NAMESPACE_PREFIXES_FEATURE_ID	TokenNameIdentifier	 NAMESPACE  PREFIXES  FEATURE  ID
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
VALIDATION_FEATURE_ID	TokenNameIdentifier	 VALIDATION  FEATURE  ID
,	TokenNameCOMMA	
validation	TokenNameIdentifier	 validation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"warning: Parser does not support feature ("	TokenNameStringLiteral	warning: Parser does not support feature (
+	TokenNamePLUS	
VALIDATION_FEATURE_ID	TokenNameIdentifier	 VALIDATION  FEATURE  ID
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
SCHEMA_VALIDATION_FEATURE_ID	TokenNameIdentifier	 SCHEMA  VALIDATION  FEATURE  ID
,	TokenNameCOMMA	
schemaValidation	TokenNameIdentifier	 schema Validation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXNotRecognizedException	TokenNameIdentifier	 SAX Not Recognized Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"warning: Parser does not recognize feature ("	TokenNameStringLiteral	warning: Parser does not recognize feature (
+	TokenNamePLUS	
SCHEMA_VALIDATION_FEATURE_ID	TokenNameIdentifier	 SCHEMA  VALIDATION  FEATURE  ID
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXNotSupportedException	TokenNameIdentifier	 SAX Not Supported Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"warning: Parser does not support feature ("	TokenNameStringLiteral	warning: Parser does not support feature (
+	TokenNamePLUS	
SCHEMA_VALIDATION_FEATURE_ID	TokenNameIdentifier	 SCHEMA  VALIDATION  FEATURE  ID
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
SCHEMA_FULL_CHECKING_FEATURE_ID	TokenNameIdentifier	 SCHEMA  FULL  CHECKING  FEATURE  ID
,	TokenNameCOMMA	
schemaFullChecking	TokenNameIdentifier	 schema Full Checking
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXNotRecognizedException	TokenNameIdentifier	 SAX Not Recognized Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"warning: Parser does not recognize feature ("	TokenNameStringLiteral	warning: Parser does not recognize feature (
+	TokenNamePLUS	
SCHEMA_FULL_CHECKING_FEATURE_ID	TokenNameIdentifier	 SCHEMA  FULL  CHECKING  FEATURE  ID
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXNotSupportedException	TokenNameIdentifier	 SAX Not Supported Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"warning: Parser does not support feature ("	TokenNameStringLiteral	warning: Parser does not support feature (
+	TokenNamePLUS	
SCHEMA_FULL_CHECKING_FEATURE_ID	TokenNameIdentifier	 SCHEMA  FULL  CHECKING  FEATURE  ID
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
HONOUR_ALL_SCHEMA_LOCATIONS_ID	TokenNameIdentifier	 HONOUR  ALL  SCHEMA  LOCATIONS  ID
,	TokenNameCOMMA	
honourAllSchemaLocations	TokenNameIdentifier	 honour All Schema Locations
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXNotRecognizedException	TokenNameIdentifier	 SAX Not Recognized Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"warning: Parser does not recognize feature ("	TokenNameStringLiteral	warning: Parser does not recognize feature (
+	TokenNamePLUS	
HONOUR_ALL_SCHEMA_LOCATIONS_ID	TokenNameIdentifier	 HONOUR  ALL  SCHEMA  LOCATIONS  ID
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXNotSupportedException	TokenNameIdentifier	 SAX Not Supported Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"warning: Parser does not support feature ("	TokenNameStringLiteral	warning: Parser does not support feature (
+	TokenNamePLUS	
HONOUR_ALL_SCHEMA_LOCATIONS_ID	TokenNameIdentifier	 HONOUR  ALL  SCHEMA  LOCATIONS  ID
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
VALIDATE_ANNOTATIONS_ID	TokenNameIdentifier	 VALIDATE  ANNOTATIONS  ID
,	TokenNameCOMMA	
validateAnnotations	TokenNameIdentifier	 validate Annotations
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXNotRecognizedException	TokenNameIdentifier	 SAX Not Recognized Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"warning: Parser does not recognize feature ("	TokenNameStringLiteral	warning: Parser does not recognize feature (
+	TokenNamePLUS	
VALIDATE_ANNOTATIONS_ID	TokenNameIdentifier	 VALIDATE  ANNOTATIONS  ID
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXNotSupportedException	TokenNameIdentifier	 SAX Not Supported Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"warning: Parser does not support feature ("	TokenNameStringLiteral	warning: Parser does not support feature (
+	TokenNamePLUS	
VALIDATE_ANNOTATIONS_ID	TokenNameIdentifier	 VALIDATE  ANNOTATIONS  ID
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
DYNAMIC_VALIDATION_FEATURE_ID	TokenNameIdentifier	 DYNAMIC  VALIDATION  FEATURE  ID
,	TokenNameCOMMA	
dynamicValidation	TokenNameIdentifier	 dynamic Validation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXNotRecognizedException	TokenNameIdentifier	 SAX Not Recognized Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"warning: Parser does not recognize feature ("	TokenNameStringLiteral	warning: Parser does not recognize feature (
+	TokenNamePLUS	
DYNAMIC_VALIDATION_FEATURE_ID	TokenNameIdentifier	 DYNAMIC  VALIDATION  FEATURE  ID
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXNotSupportedException	TokenNameIdentifier	 SAX Not Supported Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"warning: Parser does not support feature ("	TokenNameStringLiteral	warning: Parser does not support feature (
+	TokenNamePLUS	
DYNAMIC_VALIDATION_FEATURE_ID	TokenNameIdentifier	 DYNAMIC  VALIDATION  FEATURE  ID
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
XINCLUDE_FEATURE_ID	TokenNameIdentifier	 XINCLUDE  FEATURE  ID
,	TokenNameCOMMA	
xincludeProcessing	TokenNameIdentifier	 xinclude Processing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXNotRecognizedException	TokenNameIdentifier	 SAX Not Recognized Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"warning: Parser does not recognize feature ("	TokenNameStringLiteral	warning: Parser does not recognize feature (
+	TokenNamePLUS	
XINCLUDE_FEATURE_ID	TokenNameIdentifier	 XINCLUDE  FEATURE  ID
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXNotSupportedException	TokenNameIdentifier	 SAX Not Supported Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"warning: Parser does not support feature ("	TokenNameStringLiteral	warning: Parser does not support feature (
+	TokenNamePLUS	
XINCLUDE_FEATURE_ID	TokenNameIdentifier	 XINCLUDE  FEATURE  ID
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
XINCLUDE_FIXUP_BASE_URIS_FEATURE_ID	TokenNameIdentifier	 XINCLUDE  FIXUP  BASE  URIS  FEATURE  ID
,	TokenNameCOMMA	
xincludeFixupBaseURIs	TokenNameIdentifier	 xinclude Fixup Base UR Is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXNotRecognizedException	TokenNameIdentifier	 SAX Not Recognized Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"warning: Parser does not recognize feature ("	TokenNameStringLiteral	warning: Parser does not recognize feature (
+	TokenNamePLUS	
XINCLUDE_FIXUP_BASE_URIS_FEATURE_ID	TokenNameIdentifier	 XINCLUDE  FIXUP  BASE  URIS  FEATURE  ID
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXNotSupportedException	TokenNameIdentifier	 SAX Not Supported Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"warning: Parser does not support feature ("	TokenNameStringLiteral	warning: Parser does not support feature (
+	TokenNamePLUS	
XINCLUDE_FIXUP_BASE_URIS_FEATURE_ID	TokenNameIdentifier	 XINCLUDE  FIXUP  BASE  URIS  FEATURE  ID
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
XINCLUDE_FIXUP_LANGUAGE_FEATURE_ID	TokenNameIdentifier	 XINCLUDE  FIXUP  LANGUAGE  FEATURE  ID
,	TokenNameCOMMA	
xincludeFixupLanguage	TokenNameIdentifier	 xinclude Fixup Language
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXNotRecognizedException	TokenNameIdentifier	 SAX Not Recognized Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"warning: Parser does not recognize feature ("	TokenNameStringLiteral	warning: Parser does not recognize feature (
+	TokenNamePLUS	
XINCLUDE_FIXUP_LANGUAGE_FEATURE_ID	TokenNameIdentifier	 XINCLUDE  FIXUP  LANGUAGE  FEATURE  ID
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXNotSupportedException	TokenNameIdentifier	 SAX Not Supported Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"warning: Parser does not support feature ("	TokenNameStringLiteral	warning: Parser does not support feature (
+	TokenNamePLUS	
XINCLUDE_FIXUP_LANGUAGE_FEATURE_ID	TokenNameIdentifier	 XINCLUDE  FIXUP  LANGUAGE  FEATURE  ID
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// parse file 	TokenNameCOMMENT_LINE	parse file 
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
setContentHandler	TokenNameIdentifier	 set Content Handler
(	TokenNameLPAREN	
counter	TokenNameIdentifier	 counter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
setErrorHandler	TokenNameIdentifier	 set Error Handler
(	TokenNameLPAREN	
counter	TokenNameIdentifier	 counter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
long	TokenNamelong	
timeBefore	TokenNameIdentifier	 time Before
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
memoryBefore	TokenNameIdentifier	 memory Before
=	TokenNameEQUAL	
Runtime	TokenNameIdentifier	 Runtime
.	TokenNameDOT	
getRuntime	TokenNameIdentifier	 get Runtime
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
freeMemory	TokenNameIdentifier	 free Memory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
repetition	TokenNameIdentifier	 repetition
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
long	TokenNamelong	
memoryAfter	TokenNameIdentifier	 memory After
=	TokenNameEQUAL	
Runtime	TokenNameIdentifier	 Runtime
.	TokenNameDOT	
getRuntime	TokenNameIdentifier	 get Runtime
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
freeMemory	TokenNameIdentifier	 free Memory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
timeAfter	TokenNameIdentifier	 time After
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
time	TokenNameIdentifier	 time
=	TokenNameEQUAL	
timeAfter	TokenNameIdentifier	 time After
-	TokenNameMINUS	
timeBefore	TokenNameIdentifier	 time Before
;	TokenNameSEMICOLON	
long	TokenNamelong	
memory	TokenNameIdentifier	 memory
=	TokenNameEQUAL	
memoryUsage	TokenNameIdentifier	 memory Usage
?	TokenNameQUESTION	
memoryBefore	TokenNameIdentifier	 memory Before
-	TokenNameMINUS	
memoryAfter	TokenNameIdentifier	 memory After
:	TokenNameCOLON	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
;	TokenNameSEMICOLON	
counter	TokenNameIdentifier	 counter
.	TokenNameDOT	
printResults	TokenNameIdentifier	 print Results
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
arg	TokenNameIdentifier	 arg
,	TokenNameCOMMA	
time	TokenNameIdentifier	 time
,	TokenNameCOMMA	
memory	TokenNameIdentifier	 memory
,	TokenNameCOMMA	
tagginess	TokenNameIdentifier	 tagginess
,	TokenNameCOMMA	
repetition	TokenNameIdentifier	 repetition
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore 	TokenNameCOMMENT_LINE	ignore 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"error: Parse error occurred - "	TokenNameStringLiteral	error: Parse error occurred - 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Exception	TokenNameIdentifier	 Exception
se	TokenNameIdentifier	 se
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
instanceof	TokenNameinstanceof	
SAXException	TokenNameIdentifier	 SAX Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
se	TokenNameIdentifier	 se
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
se	TokenNameIdentifier	 se
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
se	TokenNameIdentifier	 se
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// main(String[]) 	TokenNameCOMMENT_LINE	main(String[]) 
// 	TokenNameCOMMENT_LINE	 
// Private static methods 	TokenNameCOMMENT_LINE	Private static methods 
// 	TokenNameCOMMENT_LINE	 
/** Prints the usage. */	TokenNameCOMMENT_JAVADOC	 Prints the usage. 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
printUsage	TokenNameIdentifier	 print Usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"usage: java sax.Counter (options) uri ..."	TokenNameStringLiteral	usage: java sax.Counter (options) uri ...
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"options:"	TokenNameStringLiteral	options:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -p name Select parser by name."	TokenNameStringLiteral	 -p name Select parser by name.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -x number Select number of repetitions."	TokenNameStringLiteral	 -x number Select number of repetitions.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -n | -N Turn on/off namespace processing."	TokenNameStringLiteral	 -n | -N Turn on/off namespace processing.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -np | -NP Turn on/off namespace prefixes."	TokenNameStringLiteral	 -np | -NP Turn on/off namespace prefixes.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" NOTE: Requires use of -n."	TokenNameStringLiteral	 NOTE: Requires use of -n.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -v | -V Turn on/off validation."	TokenNameStringLiteral	 -v | -V Turn on/off validation.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -s | -S Turn on/off Schema validation support."	TokenNameStringLiteral	 -s | -S Turn on/off Schema validation support.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" NOTE: Not supported by all parsers."	TokenNameStringLiteral	 NOTE: Not supported by all parsers.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -f | -F Turn on/off Schema full checking."	TokenNameStringLiteral	 -f | -F Turn on/off Schema full checking.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" NOTE: Requires use of -s and not supported by all parsers."	TokenNameStringLiteral	 NOTE: Requires use of -s and not supported by all parsers.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -hs | -HS Turn on/off honouring of all schema locations."	TokenNameStringLiteral	 -hs | -HS Turn on/off honouring of all schema locations.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" NOTE: Requires use of -s and not supported by all parsers."	TokenNameStringLiteral	 NOTE: Requires use of -s and not supported by all parsers.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -va | -VA Turn on/off validation of schema annotations."	TokenNameStringLiteral	 -va | -VA Turn on/off validation of schema annotations.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" NOTE: Requires use of -s and not supported by all parsers."	TokenNameStringLiteral	 NOTE: Requires use of -s and not supported by all parsers.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -dv | -DV Turn on/off dynamic validation."	TokenNameStringLiteral	 -dv | -DV Turn on/off dynamic validation.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" NOTE: Not supported by all parsers."	TokenNameStringLiteral	 NOTE: Not supported by all parsers.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -xi | -XI Turn on/off XInclude processing."	TokenNameStringLiteral	 -xi | -XI Turn on/off XInclude processing.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" NOTE: Not supported by all parsers."	TokenNameStringLiteral	 NOTE: Not supported by all parsers.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -xb | -XB Turn on/off base URI fixup during XInclude processing."	TokenNameStringLiteral	 -xb | -XB Turn on/off base URI fixup during XInclude processing.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" NOTE: Requires use of -xi and not supported by all parsers."	TokenNameStringLiteral	 NOTE: Requires use of -xi and not supported by all parsers.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -xl | -XL Turn on/off language fixup during XInclude processing."	TokenNameStringLiteral	 -xl | -XL Turn on/off language fixup during XInclude processing.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" NOTE: Requires use of -xi and not supported by all parsers."	TokenNameStringLiteral	 NOTE: Requires use of -xi and not supported by all parsers.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -m | -M Turn on/off memory usage report"	TokenNameStringLiteral	 -m | -M Turn on/off memory usage report
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -t | -T Turn on/off "tagginess" report."	TokenNameStringLiteral	 -t | -T Turn on/off "tagginess" report.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" --rem text Output user defined comment before next parse."	TokenNameStringLiteral	 --rem text Output user defined comment before next parse.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -h This help screen."	TokenNameStringLiteral	 -h This help screen.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"defaults:"	TokenNameStringLiteral	defaults:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" Parser: "	TokenNameStringLiteral	 Parser: 
+	TokenNamePLUS	
DEFAULT_PARSER_NAME	TokenNameIdentifier	 DEFAULT  PARSER  NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" Repetition: "	TokenNameStringLiteral	 Repetition: 
+	TokenNamePLUS	
DEFAULT_REPETITION	TokenNameIdentifier	 DEFAULT  REPETITION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" Namespaces: "	TokenNameStringLiteral	 Namespaces: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
DEFAULT_NAMESPACES	TokenNameIdentifier	 DEFAULT  NAMESPACES
?	TokenNameQUESTION	
"on"	TokenNameStringLiteral	on
:	TokenNameCOLON	
"off"	TokenNameStringLiteral	off
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" Prefixes: "	TokenNameStringLiteral	 Prefixes: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
DEFAULT_NAMESPACE_PREFIXES	TokenNameIdentifier	 DEFAULT  NAMESPACE  PREFIXES
?	TokenNameQUESTION	
"on"	TokenNameStringLiteral	on
:	TokenNameCOLON	
"off"	TokenNameStringLiteral	off
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" Validation: "	TokenNameStringLiteral	 Validation: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
DEFAULT_VALIDATION	TokenNameIdentifier	 DEFAULT  VALIDATION
?	TokenNameQUESTION	
"on"	TokenNameStringLiteral	on
:	TokenNameCOLON	
"off"	TokenNameStringLiteral	off
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" Schema: "	TokenNameStringLiteral	 Schema: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
DEFAULT_SCHEMA_VALIDATION	TokenNameIdentifier	 DEFAULT  SCHEMA  VALIDATION
?	TokenNameQUESTION	
"on"	TokenNameStringLiteral	on
:	TokenNameCOLON	
"off"	TokenNameStringLiteral	off
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" Schema full checking: "	TokenNameStringLiteral	 Schema full checking: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
DEFAULT_SCHEMA_FULL_CHECKING	TokenNameIdentifier	 DEFAULT  SCHEMA  FULL  CHECKING
?	TokenNameQUESTION	
"on"	TokenNameStringLiteral	on
:	TokenNameCOLON	
"off"	TokenNameStringLiteral	off
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" Honour all schema locations: "	TokenNameStringLiteral	 Honour all schema locations: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
DEFAULT_HONOUR_ALL_SCHEMA_LOCATIONS	TokenNameIdentifier	 DEFAULT  HONOUR  ALL  SCHEMA  LOCATIONS
?	TokenNameQUESTION	
"on"	TokenNameStringLiteral	on
:	TokenNameCOLON	
"off"	TokenNameStringLiteral	off
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" Validate annotations: "	TokenNameStringLiteral	 Validate annotations: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
DEFAULT_VALIDATE_ANNOTATIONS	TokenNameIdentifier	 DEFAULT  VALIDATE  ANNOTATIONS
?	TokenNameQUESTION	
"on"	TokenNameStringLiteral	on
:	TokenNameCOLON	
"off"	TokenNameStringLiteral	off
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" Dynamic: "	TokenNameStringLiteral	 Dynamic: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
DEFAULT_DYNAMIC_VALIDATION	TokenNameIdentifier	 DEFAULT  DYNAMIC  VALIDATION
?	TokenNameQUESTION	
"on"	TokenNameStringLiteral	on
:	TokenNameCOLON	
"off"	TokenNameStringLiteral	off
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" XInclude: "	TokenNameStringLiteral	 XInclude: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
DEFAULT_XINCLUDE	TokenNameIdentifier	 DEFAULT  XINCLUDE
?	TokenNameQUESTION	
"on"	TokenNameStringLiteral	on
:	TokenNameCOLON	
"off"	TokenNameStringLiteral	off
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" XInclude base URI fixup: "	TokenNameStringLiteral	 XInclude base URI fixup: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
DEFAULT_XINCLUDE_FIXUP_BASE_URIS	TokenNameIdentifier	 DEFAULT  XINCLUDE  FIXUP  BASE  URIS
?	TokenNameQUESTION	
"on"	TokenNameStringLiteral	on
:	TokenNameCOLON	
"off"	TokenNameStringLiteral	off
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" XInclude language fixup: "	TokenNameStringLiteral	 XInclude language fixup: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
DEFAULT_XINCLUDE_FIXUP_LANGUAGE	TokenNameIdentifier	 DEFAULT  XINCLUDE  FIXUP  LANGUAGE
?	TokenNameQUESTION	
"on"	TokenNameStringLiteral	on
:	TokenNameCOLON	
"off"	TokenNameStringLiteral	off
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" Memory: "	TokenNameStringLiteral	 Memory: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
DEFAULT_MEMORY_USAGE	TokenNameIdentifier	 DEFAULT  MEMORY  USAGE
?	TokenNameQUESTION	
"on"	TokenNameStringLiteral	on
:	TokenNameCOLON	
"off"	TokenNameStringLiteral	off
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" Tagginess: "	TokenNameStringLiteral	 Tagginess: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
DEFAULT_TAGGINESS	TokenNameIdentifier	 DEFAULT  TAGGINESS
?	TokenNameQUESTION	
"on"	TokenNameStringLiteral	on
:	TokenNameCOLON	
"off"	TokenNameStringLiteral	off
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"notes:"	TokenNameStringLiteral	notes:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" The speed and memory results from this program should NOT be used as the"	TokenNameStringLiteral	 The speed and memory results from this program should NOT be used as the
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" basis of parser performance comparison! Real analytical methods should be"	TokenNameStringLiteral	 basis of parser performance comparison! Real analytical methods should be
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" used. For better results, perform multiple document parses within the same"	TokenNameStringLiteral	 used. For better results, perform multiple document parses within the same
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" virtual machine to remove class loading from parse time and memory usage."	TokenNameStringLiteral	 virtual machine to remove class loading from parse time and memory usage.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" The "tagginess" measurement gives a rough estimate of the percentage of"	TokenNameStringLiteral	 The "tagginess" measurement gives a rough estimate of the percentage of
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" markup versus content in the XML document. The percent tagginess of a "	TokenNameStringLiteral	 markup versus content in the XML document. The percent tagginess of a 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" document is equal to the minimum amount of tag characters required for "	TokenNameStringLiteral	 document is equal to the minimum amount of tag characters required for 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" elements, attributes, and processing instructions divided by the total"	TokenNameStringLiteral	 elements, attributes, and processing instructions divided by the total
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" amount of characters (characters, ignorable whitespace, and tag characters)"	TokenNameStringLiteral	 amount of characters (characters, ignorable whitespace, and tag characters)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" in the document."	TokenNameStringLiteral	 in the document.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" Not all features are supported by different parsers."	TokenNameStringLiteral	 Not all features are supported by different parsers.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// printUsage() 	TokenNameCOMMENT_LINE	printUsage() 
}	TokenNameRBRACE	
// class Counter 	TokenNameCOMMENT_LINE	class Counter 
