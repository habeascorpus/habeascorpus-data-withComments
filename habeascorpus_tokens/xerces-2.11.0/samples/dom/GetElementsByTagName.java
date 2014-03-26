/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
dom	TokenNameIdentifier	 dom
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
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Attr	TokenNameIdentifier	 Attr
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
NamedNodeMap	TokenNameIdentifier	 Named Node Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
NodeList	TokenNameIdentifier	 Node List
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
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
;	TokenNameSEMICOLON	
/** * A sample DOM filter. This sample program illustrates how to * use the Document#getElementsByTagName() method to quickly * and easily locate elements by name. * * @author Jeffrey Rodriguez, IBM * @author Andy Clark, IBM * * @version $Id: GetElementsByTagName.java 447683 2006-09-19 02:36:31Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 A sample DOM filter. This sample program illustrates how to use the Document#getElementsByTagName() method to quickly and easily locate elements by name. * @author Jeffrey Rodriguez, IBM @author Andy Clark, IBM * @version $Id: GetElementsByTagName.java 447683 2006-09-19 02:36:31Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
GetElementsByTagName	TokenNameIdentifier	 Get Elements By Tag Name
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
/** Validate schema annotations feature id (http://apache.org/xml/features/validate-annotations). */	TokenNameCOMMENT_JAVADOC	 Validate schema annotations feature id (http://apache.org/xml/features/validate-annotations). 
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
/** Default parser name (dom.wrappers.Xerces). */	TokenNameCOMMENT_JAVADOC	 Default parser name (dom.wrappers.Xerces). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_PARSER_NAME	TokenNameIdentifier	 DEFAULT  PARSER  NAME
=	TokenNameEQUAL	
"dom.wrappers.Xerces"	TokenNameStringLiteral	dom.wrappers.Xerces
;	TokenNameSEMICOLON	
/** Default element name (*). */	TokenNameCOMMENT_JAVADOC	 Default element name (*). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_ELEMENT_NAME	TokenNameIdentifier	 DEFAULT  ELEMENT  NAME
=	TokenNameEQUAL	
"*"	TokenNameStringLiteral	*
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
// 	TokenNameCOMMENT_LINE	 
// Public static methods 	TokenNameCOMMENT_LINE	Public static methods 
// 	TokenNameCOMMENT_LINE	 
/** Prints the specified elements in the given document. */	TokenNameCOMMENT_JAVADOC	 Prints the specified elements in the given document. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
PrintWriter	TokenNameIdentifier	 Print Writer
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
Document	TokenNameIdentifier	 Document
document	TokenNameIdentifier	 document
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
elementName	TokenNameIdentifier	 element Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attributeName	TokenNameIdentifier	 attribute Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// get elements that match 	TokenNameCOMMENT_LINE	get elements that match 
NodeList	TokenNameIdentifier	 Node List
elements	TokenNameIdentifier	 elements
=	TokenNameEQUAL	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
getElementsByTagName	TokenNameIdentifier	 get Elements By Tag Name
(	TokenNameLPAREN	
elementName	TokenNameIdentifier	 element Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// is there anything to do? 	TokenNameCOMMENT_LINE	is there anything to do? 
if	TokenNameif	
(	TokenNameLPAREN	
elements	TokenNameIdentifier	 elements
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// print all elements 	TokenNameCOMMENT_LINE	print all elements 
if	TokenNameif	
(	TokenNameLPAREN	
attributeName	TokenNameIdentifier	 attribute Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
elementCount	TokenNameIdentifier	 element Count
=	TokenNameEQUAL	
elements	TokenNameIdentifier	 elements
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
elementCount	TokenNameIdentifier	 element Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
elements	TokenNameIdentifier	 elements
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// print elements with given attribute name 	TokenNameCOMMENT_LINE	print elements with given attribute name 
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
elementCount	TokenNameIdentifier	 element Count
=	TokenNameEQUAL	
elements	TokenNameIdentifier	 elements
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
elementCount	TokenNameIdentifier	 element Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
elements	TokenNameIdentifier	 elements
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NamedNodeMap	TokenNameIdentifier	 Named Node Map
attributes	TokenNameIdentifier	 attributes
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getNamedItem	TokenNameIdentifier	 get Named Item
(	TokenNameLPAREN	
attributeName	TokenNameIdentifier	 attribute Name
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// print(PrintWriter,Document,String,String) 	TokenNameCOMMENT_LINE	print(PrintWriter,Document,String,String) 
// 	TokenNameCOMMENT_LINE	 
// Protected static methods 	TokenNameCOMMENT_LINE	Protected static methods 
// 	TokenNameCOMMENT_LINE	 
/** Prints the specified element. */	TokenNameCOMMENT_JAVADOC	 Prints the specified element. 
protected	TokenNameprotected	
static	TokenNamestatic	
void	TokenNamevoid	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
PrintWriter	TokenNameIdentifier	 Print Writer
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
NamedNodeMap	TokenNameIdentifier	 Named Node Map
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
'<'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
attributeCount	TokenNameIdentifier	 attribute Count
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
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
attributeCount	TokenNameIdentifier	 attribute Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Attr	TokenNameIdentifier	 Attr
attribute	TokenNameIdentifier	 attribute
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Attr	TokenNameIdentifier	 Attr
)	TokenNameRPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"=""	TokenNameStringLiteral	="
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
'"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// print(PrintWriter,Element,NamedNodeMap) 	TokenNameCOMMENT_LINE	print(PrintWriter,Element,NamedNodeMap) 
/** Normalizes the given string. */	TokenNameCOMMENT_JAVADOC	 Normalizes the given string. 
protected	TokenNameprotected	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'<'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"&lt;"	TokenNameStringLiteral	&lt;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
'>'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"&gt;"	TokenNameStringLiteral	&gt;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
'&'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"&amp;"	TokenNameStringLiteral	&amp;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
'"'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"&quot;"	TokenNameStringLiteral	&quot;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
'\r'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'\n'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"&#"	TokenNameStringLiteral	&#
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
{	TokenNameLBRACE	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// normalize(String):String 	TokenNameCOMMENT_LINE	normalize(String):String 
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
ParserWrapper	TokenNameIdentifier	 Parser Wrapper
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
elementName	TokenNameIdentifier	 element Name
=	TokenNameEQUAL	
DEFAULT_ELEMENT_NAME	TokenNameIdentifier	 DEFAULT  ELEMENT  NAME
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
attributeName	TokenNameIdentifier	 attribute Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
namespaces	TokenNameIdentifier	 namespaces
=	TokenNameEQUAL	
DEFAULT_NAMESPACES	TokenNameIdentifier	 DEFAULT  NAMESPACES
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
(	TokenNameLPAREN	
ParserWrapper	TokenNameIdentifier	 Parser Wrapper
)	TokenNameRPAREN	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
parserName	TokenNameIdentifier	 parser Name
)	TokenNameRPAREN	
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
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
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
option	TokenNameIdentifier	 option
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"e"	TokenNameStringLiteral	e
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
"error: Missing argument to -e option."	TokenNameStringLiteral	error: Missing argument to -e option.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
elementName	TokenNameIdentifier	 element Name
=	TokenNameEQUAL	
argv	TokenNameIdentifier	 argv
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
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
"a"	TokenNameStringLiteral	a
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
"error: Missing argument to -a option."	TokenNameStringLiteral	error: Missing argument to -a option.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
attributeName	TokenNameIdentifier	 attribute Name
=	TokenNameEQUAL	
argv	TokenNameIdentifier	 argv
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
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
(	TokenNameLPAREN	
ParserWrapper	TokenNameIdentifier	 Parser Wrapper
)	TokenNameRPAREN	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
DEFAULT_PARSER_NAME	TokenNameIdentifier	 DEFAULT  PARSER  NAME
)	TokenNameRPAREN	
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
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
XINCLUDE_FIXUP_LANGUAGE_FEATURE_ID	TokenNameIdentifier	 XINCLUDE  FIXUP  LANGUAGE  FEATURE  ID
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// parse file 	TokenNameCOMMENT_LINE	parse file 
try	TokenNametry	
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
document	TokenNameIdentifier	 document
=	TokenNameEQUAL	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GetElementsByTagName	TokenNameIdentifier	 Get Elements By Tag Name
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
document	TokenNameIdentifier	 document
,	TokenNameCOMMA	
elementName	TokenNameIdentifier	 element Name
,	TokenNameCOMMA	
attributeName	TokenNameIdentifier	 attribute Name
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
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
instanceof	TokenNameinstanceof	
SAXException	TokenNameIdentifier	 SAX Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Exception	TokenNameIdentifier	 Exception
nested	TokenNameIdentifier	 nested
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
if	TokenNameif	
(	TokenNameLPAREN	
nested	TokenNameIdentifier	 nested
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
nested	TokenNameIdentifier	 nested
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
"usage: java dom.GetElementsByTagName (options) uri ..."	TokenNameStringLiteral	usage: java dom.GetElementsByTagName (options) uri ...
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
" -e name Specify element name for search."	TokenNameStringLiteral	 -e name Specify element name for search.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -a name Specify attribute name for specified elements."	TokenNameStringLiteral	 -a name Specify attribute name for specified elements.
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
" Element: "	TokenNameStringLiteral	 Element: 
+	TokenNamePLUS	
DEFAULT_ELEMENT_NAME	TokenNameIdentifier	 DEFAULT  ELEMENT  NAME
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
}	TokenNameRBRACE	
// printUsage() 	TokenNameCOMMENT_LINE	printUsage() 
}	TokenNameRBRACE	
// class GetElementsByTagName 	TokenNameCOMMENT_LINE	class GetElementsByTagName 
