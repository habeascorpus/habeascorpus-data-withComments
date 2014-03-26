/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
StringReader	TokenNameIdentifier	 String Reader
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
grammars	TokenNameIdentifier	 grammars
.	TokenNameDOT	
XMLGrammarDescription	TokenNameIdentifier	 XML Grammar Description
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
XMLEntityResolver	TokenNameIdentifier	 XML Entity Resolver
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
ls	TokenNameIdentifier	 ls
.	TokenNameDOT	
LSInput	TokenNameIdentifier	 LS Input
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
ls	TokenNameIdentifier	 ls
.	TokenNameDOT	
LSResourceResolver	TokenNameIdentifier	 LS Resource Resolver
;	TokenNameSEMICOLON	
/** * This class wraps DOM entity resolver to XNI entity resolver. * * @see LSResourceResolver * * @author Gopal Sharma, SUN MicroSystems Inc. * @author Elena Litani, IBM * @author Ramesh Mandava, Sun Microsystems * @version $Id: DOMEntityResolverWrapper.java 699892 2008-09-28 21:08:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This class wraps DOM entity resolver to XNI entity resolver. * @see LSResourceResolver * @author Gopal Sharma, SUN MicroSystems Inc. @author Elena Litani, IBM @author Ramesh Mandava, Sun Microsystems @version $Id: DOMEntityResolverWrapper.java 699892 2008-09-28 21:08:27Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
DOMEntityResolverWrapper	TokenNameIdentifier	 DOM Entity Resolver Wrapper
implements	TokenNameimplements	
XMLEntityResolver	TokenNameIdentifier	 XML Entity Resolver
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** XML 1.0 type constant according to DOM L3 LS CR spec "http://www.w3.org/TR/2003/CR-DOM-Level-3-LS-20031107" */	TokenNameCOMMENT_JAVADOC	 XML 1.0 type constant according to DOM L3 LS CR spec "http://www.w3.org/TR/2003/CR-DOM-Level-3-LS-20031107" 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XML_TYPE	TokenNameIdentifier	 XML  TYPE
=	TokenNameEQUAL	
"http://www.w3.org/TR/REC-xml"	TokenNameStringLiteral	http://www.w3.org/TR/REC-xml
;	TokenNameSEMICOLON	
/** XML Schema constant according to DOM L3 LS CR spec "http://www.w3.org/TR/2003/CR-DOM-Level-3-LS-20031107" */	TokenNameCOMMENT_JAVADOC	 XML Schema constant according to DOM L3 LS CR spec "http://www.w3.org/TR/2003/CR-DOM-Level-3-LS-20031107" 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XSD_TYPE	TokenNameIdentifier	 XSD  TYPE
=	TokenNameEQUAL	
"http://www.w3.org/2001/XMLSchema"	TokenNameStringLiteral	http://www.w3.org/2001/XMLSchema
;	TokenNameSEMICOLON	
/** The DOM entity resolver. */	TokenNameCOMMENT_JAVADOC	 The DOM entity resolver. 
protected	TokenNameprotected	
LSResourceResolver	TokenNameIdentifier	 LS Resource Resolver
fEntityResolver	TokenNameIdentifier	 f Entity Resolver
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
DOMEntityResolverWrapper	TokenNameIdentifier	 DOM Entity Resolver Wrapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** Wraps the specified DOM entity resolver. */	TokenNameCOMMENT_JAVADOC	 Wraps the specified DOM entity resolver. 
public	TokenNamepublic	
DOMEntityResolverWrapper	TokenNameIdentifier	 DOM Entity Resolver Wrapper
(	TokenNameLPAREN	
LSResourceResolver	TokenNameIdentifier	 LS Resource Resolver
entityResolver	TokenNameIdentifier	 entity Resolver
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setEntityResolver	TokenNameIdentifier	 set Entity Resolver
(	TokenNameLPAREN	
entityResolver	TokenNameIdentifier	 entity Resolver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// LSResourceResolver 	TokenNameCOMMENT_LINE	LSResourceResolver 
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
/** Sets the DOM entity resolver. */	TokenNameCOMMENT_JAVADOC	 Sets the DOM entity resolver. 
public	TokenNamepublic	
void	TokenNamevoid	
setEntityResolver	TokenNameIdentifier	 set Entity Resolver
(	TokenNameLPAREN	
LSResourceResolver	TokenNameIdentifier	 LS Resource Resolver
entityResolver	TokenNameIdentifier	 entity Resolver
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fEntityResolver	TokenNameIdentifier	 f Entity Resolver
=	TokenNameEQUAL	
entityResolver	TokenNameIdentifier	 entity Resolver
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setEntityResolver(LSResourceResolver) 	TokenNameCOMMENT_LINE	setEntityResolver(LSResourceResolver) 
/** Returns the DOM entity resolver. */	TokenNameCOMMENT_JAVADOC	 Returns the DOM entity resolver. 
public	TokenNamepublic	
LSResourceResolver	TokenNameIdentifier	 LS Resource Resolver
getEntityResolver	TokenNameIdentifier	 get Entity Resolver
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fEntityResolver	TokenNameIdentifier	 f Entity Resolver
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getEntityResolver():LSResourceResolver 	TokenNameCOMMENT_LINE	getEntityResolver():LSResourceResolver 
// 	TokenNameCOMMENT_LINE	 
// XMLEntityResolver methods 	TokenNameCOMMENT_LINE	XMLEntityResolver methods 
// 	TokenNameCOMMENT_LINE	 
/** * Resolves an external parsed entity. If the entity cannot be * resolved, this method should return null. * * @param resourceIdentifier description of the resource to be revsoved * @throws XNIException Thrown on general error. * @throws IOException Thrown if resolved entity stream cannot be * opened or some other i/o error occurs. */	TokenNameCOMMENT_JAVADOC	 Resolves an external parsed entity. If the entity cannot be resolved, this method should return null. * @param resourceIdentifier description of the resource to be revsoved @throws XNIException Thrown on general error. @throws IOException Thrown if resolved entity stream cannot be opened or some other i/o error occurs. 
public	TokenNamepublic	
XMLInputSource	TokenNameIdentifier	 XML Input Source
resolveEntity	TokenNameIdentifier	 resolve Entity
(	TokenNameLPAREN	
XMLResourceIdentifier	TokenNameIdentifier	 XML Resource Identifier
resourceIdentifier	TokenNameIdentifier	 resource Identifier
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// resolve entity using DOM entity resolver 	TokenNameCOMMENT_LINE	resolve entity using DOM entity resolver 
if	TokenNameif	
(	TokenNameLPAREN	
fEntityResolver	TokenNameIdentifier	 f Entity Resolver
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// For entity resolution the type of the resource would be XML TYPE 	TokenNameCOMMENT_LINE	For entity resolution the type of the resource would be XML TYPE 
// DOM L3 LS spec mention only the XML 1.0 recommendation right now 	TokenNameCOMMENT_LINE	DOM L3 LS spec mention only the XML 1.0 recommendation right now 
LSInput	TokenNameIdentifier	 LS Input
inputSource	TokenNameIdentifier	 input Source
=	TokenNameEQUAL	
resourceIdentifier	TokenNameIdentifier	 resource Identifier
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
fEntityResolver	TokenNameIdentifier	 f Entity Resolver
.	TokenNameDOT	
resolveResource	TokenNameIdentifier	 resolve Resource
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
:	TokenNameCOLON	
fEntityResolver	TokenNameIdentifier	 f Entity Resolver
.	TokenNameDOT	
resolveResource	TokenNameIdentifier	 resolve Resource
(	TokenNameLPAREN	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
resourceIdentifier	TokenNameIdentifier	 resource Identifier
)	TokenNameRPAREN	
,	TokenNameCOMMA	
resourceIdentifier	TokenNameIdentifier	 resource Identifier
.	TokenNameDOT	
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
resourceIdentifier	TokenNameIdentifier	 resource Identifier
.	TokenNameDOT	
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
resourceIdentifier	TokenNameIdentifier	 resource Identifier
.	TokenNameDOT	
getLiteralSystemId	TokenNameIdentifier	 get Literal System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
resourceIdentifier	TokenNameIdentifier	 resource Identifier
.	TokenNameDOT	
getBaseSystemId	TokenNameIdentifier	 get Base System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
inputSource	TokenNameIdentifier	 input Source
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
=	TokenNameEQUAL	
inputSource	TokenNameIdentifier	 input Source
.	TokenNameDOT	
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
=	TokenNameEQUAL	
inputSource	TokenNameIdentifier	 input Source
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
baseSystemId	TokenNameIdentifier	 base System Id
=	TokenNameEQUAL	
inputSource	TokenNameIdentifier	 input Source
.	TokenNameDOT	
getBaseURI	TokenNameIdentifier	 get Base URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InputStream	TokenNameIdentifier	 Input Stream
byteStream	TokenNameIdentifier	 byte Stream
=	TokenNameEQUAL	
inputSource	TokenNameIdentifier	 input Source
.	TokenNameDOT	
getByteStream	TokenNameIdentifier	 get Byte Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Reader	TokenNameIdentifier	 Reader
charStream	TokenNameIdentifier	 char Stream
=	TokenNameEQUAL	
inputSource	TokenNameIdentifier	 input Source
.	TokenNameDOT	
getCharacterStream	TokenNameIdentifier	 get Character Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
inputSource	TokenNameIdentifier	 input Source
.	TokenNameDOT	
getEncoding	TokenNameIdentifier	 get Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
inputSource	TokenNameIdentifier	 input Source
.	TokenNameDOT	
getStringData	TokenNameIdentifier	 get String Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * An LSParser looks at inputs specified in LSInput in * the following order: characterStream, byteStream, * stringData, systemId, publicId. */	TokenNameCOMMENT_JAVADOC	 An LSParser looks at inputs specified in LSInput in the following order: characterStream, byteStream, stringData, systemId, publicId. 
XMLInputSource	TokenNameIdentifier	 XML Input Source
xmlInputSource	TokenNameIdentifier	 xml Input Source
=	TokenNameEQUAL	
new	TokenNamenew	
XMLInputSource	TokenNameIdentifier	 XML Input Source
(	TokenNameLPAREN	
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
systemId	TokenNameIdentifier	 system Id
,	TokenNameCOMMA	
baseSystemId	TokenNameIdentifier	 base System Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
charStream	TokenNameIdentifier	 char Stream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
xmlInputSource	TokenNameIdentifier	 xml Input Source
.	TokenNameDOT	
setCharacterStream	TokenNameIdentifier	 set Character Stream
(	TokenNameLPAREN	
charStream	TokenNameIdentifier	 char Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
byteStream	TokenNameIdentifier	 byte Stream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
xmlInputSource	TokenNameIdentifier	 xml Input Source
.	TokenNameDOT	
setByteStream	TokenNameIdentifier	 set Byte Stream
(	TokenNameLPAREN	
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
)	TokenNameRPAREN	
byteStream	TokenNameIdentifier	 byte Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
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
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
xmlInputSource	TokenNameIdentifier	 xml Input Source
.	TokenNameDOT	
setCharacterStream	TokenNameIdentifier	 set Character Stream
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
xmlInputSource	TokenNameIdentifier	 xml Input Source
.	TokenNameDOT	
setEncoding	TokenNameIdentifier	 set Encoding
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
xmlInputSource	TokenNameIdentifier	 xml Input Source
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// unable to resolve entity 	TokenNameCOMMENT_LINE	unable to resolve entity 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// resolveEntity(String,String,String):XMLInputSource 	TokenNameCOMMENT_LINE	resolveEntity(String,String,String):XMLInputSource 
/** Determines the type of resource being resolved **/	TokenNameCOMMENT_JAVADOC	 Determines the type of resource being resolved *
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
XMLResourceIdentifier	TokenNameIdentifier	 XML Resource Identifier
resourceIdentifier	TokenNameIdentifier	 resource Identifier
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
resourceIdentifier	TokenNameIdentifier	 resource Identifier
instanceof	TokenNameinstanceof	
XMLGrammarDescription	TokenNameIdentifier	 XML Grammar Description
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XMLGrammarDescription	TokenNameIdentifier	 XML Grammar Description
desc	TokenNameIdentifier	 desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XMLGrammarDescription	TokenNameIdentifier	 XML Grammar Description
)	TokenNameRPAREN	
resourceIdentifier	TokenNameIdentifier	 resource Identifier
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
XMLGrammarDescription	TokenNameIdentifier	 XML Grammar Description
.	TokenNameDOT	
XML_SCHEMA	TokenNameIdentifier	 XML  SCHEMA
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
getGrammarType	TokenNameIdentifier	 get Grammar Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
XSD_TYPE	TokenNameIdentifier	 XSD  TYPE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
XML_TYPE	TokenNameIdentifier	 XML  TYPE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getType(XMLResourceIdentifier):String 	TokenNameCOMMENT_LINE	getType(XMLResourceIdentifier):String 
}	TokenNameRBRACE	
// DOMEntityResolverWrapper 	TokenNameCOMMENT_LINE	DOMEntityResolverWrapper 
