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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
ExternalSubsetResolver	TokenNameIdentifier	 External Subset Resolver
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
XMLEntityDescription	TokenNameIdentifier	 XML Entity Description
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
XMLDTDDescription	TokenNameIdentifier	 XMLDTD Description
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
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
InputSource	TokenNameIdentifier	 Input Source
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
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
EntityResolver2	TokenNameIdentifier	 Entity Resolver2
;	TokenNameSEMICOLON	
/** * <p>This class wraps a SAX entity resolver (EntityResolver2) in an XNI entity resolver.</p> * * @author Michael Glavassevich, IBM * * @version $Id: EntityResolver2Wrapper.java 699892 2008-09-28 21:08:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 <p>This class wraps a SAX entity resolver (EntityResolver2) in an XNI entity resolver.</p> * @author Michael Glavassevich, IBM * @version $Id: EntityResolver2Wrapper.java 699892 2008-09-28 21:08:27Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
EntityResolver2Wrapper	TokenNameIdentifier	 Entity Resolver2 Wrapper
implements	TokenNameimplements	
ExternalSubsetResolver	TokenNameIdentifier	 External Subset Resolver
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** An instance of SAX2 Extensions 1.1's EntityResolver2. */	TokenNameCOMMENT_JAVADOC	 An instance of SAX2 Extensions 1.1's EntityResolver2. 
protected	TokenNameprotected	
EntityResolver2	TokenNameIdentifier	 Entity Resolver2
fEntityResolver	TokenNameIdentifier	 f Entity Resolver
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
EntityResolver2Wrapper	TokenNameIdentifier	 Entity Resolver2 Wrapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * <p>Creates a new instance wrapping the given SAX entity resolver.</p> * * @param entityResolver the SAX entity resolver to wrap */	TokenNameCOMMENT_JAVADOC	 <p>Creates a new instance wrapping the given SAX entity resolver.</p> * @param entityResolver the SAX entity resolver to wrap 
public	TokenNamepublic	
EntityResolver2Wrapper	TokenNameIdentifier	 Entity Resolver2 Wrapper
(	TokenNameLPAREN	
EntityResolver2	TokenNameIdentifier	 Entity Resolver2
entityResolver	TokenNameIdentifier	 entity Resolver
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setEntityResolver	TokenNameIdentifier	 set Entity Resolver
(	TokenNameLPAREN	
entityResolver	TokenNameIdentifier	 entity Resolver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(EntityResolver2) 	TokenNameCOMMENT_LINE	<init>(EntityResolver2) 
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
/** * <p>Sets the SAX entity resolver wrapped by this object.</p> * * @param entityResolver the SAX entity resolver to wrap */	TokenNameCOMMENT_JAVADOC	 <p>Sets the SAX entity resolver wrapped by this object.</p> * @param entityResolver the SAX entity resolver to wrap 
public	TokenNamepublic	
void	TokenNamevoid	
setEntityResolver	TokenNameIdentifier	 set Entity Resolver
(	TokenNameLPAREN	
EntityResolver2	TokenNameIdentifier	 Entity Resolver2
entityResolver	TokenNameIdentifier	 entity Resolver
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fEntityResolver	TokenNameIdentifier	 f Entity Resolver
=	TokenNameEQUAL	
entityResolver	TokenNameIdentifier	 entity Resolver
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setEntityResolver(EntityResolver2) 	TokenNameCOMMENT_LINE	setEntityResolver(EntityResolver2) 
/** * <p>Returns the SAX entity resolver wrapped by this object.</p> * * @return the SAX entity resolver wrapped by this object */	TokenNameCOMMENT_JAVADOC	 <p>Returns the SAX entity resolver wrapped by this object.</p> * @return the SAX entity resolver wrapped by this object 
public	TokenNamepublic	
EntityResolver2	TokenNameIdentifier	 Entity Resolver2
getEntityResolver	TokenNameIdentifier	 get Entity Resolver
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fEntityResolver	TokenNameIdentifier	 f Entity Resolver
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getEntityResolver():EntityResolver2 	TokenNameCOMMENT_LINE	getEntityResolver():EntityResolver2 
// 	TokenNameCOMMENT_LINE	 
// ExternalSubsetResolver methods 	TokenNameCOMMENT_LINE	ExternalSubsetResolver methods 
// 	TokenNameCOMMENT_LINE	 
/** * <p>Locates an external subset for documents which do not explicitly * provide one. If no external subset is provided, this method should * return <code>null</code>.</p> * * @param grammarDescription a description of the DTD * * @throws XNIException Thrown on general error. * @throws IOException Thrown if resolved entity stream cannot be * opened or some other i/o error occurs. */	TokenNameCOMMENT_JAVADOC	 <p>Locates an external subset for documents which do not explicitly provide one. If no external subset is provided, this method should return <code>null</code>.</p> * @param grammarDescription a description of the DTD * @throws XNIException Thrown on general error. @throws IOException Thrown if resolved entity stream cannot be opened or some other i/o error occurs. 
public	TokenNamepublic	
XMLInputSource	TokenNameIdentifier	 XML Input Source
getExternalSubset	TokenNameIdentifier	 get External Subset
(	TokenNameLPAREN	
XMLDTDDescription	TokenNameIdentifier	 XMLDTD Description
grammarDescription	TokenNameIdentifier	 grammar Description
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fEntityResolver	TokenNameIdentifier	 f Entity Resolver
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
grammarDescription	TokenNameIdentifier	 grammar Description
.	TokenNameDOT	
getRootName	TokenNameIdentifier	 get Root Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
baseURI	TokenNameIdentifier	 base URI
=	TokenNameEQUAL	
grammarDescription	TokenNameIdentifier	 grammar Description
.	TokenNameDOT	
getBaseSystemId	TokenNameIdentifier	 get Base System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Resolve using EntityResolver2 	TokenNameCOMMENT_LINE	Resolve using EntityResolver2 
try	TokenNametry	
{	TokenNameLBRACE	
InputSource	TokenNameIdentifier	 Input Source
inputSource	TokenNameIdentifier	 input Source
=	TokenNameEQUAL	
fEntityResolver	TokenNameIdentifier	 f Entity Resolver
.	TokenNameDOT	
getExternalSubset	TokenNameIdentifier	 get External Subset
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
baseURI	TokenNameIdentifier	 base URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
inputSource	TokenNameIdentifier	 input Source
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
createXMLInputSource	TokenNameIdentifier	 create XML Input Source
(	TokenNameLPAREN	
inputSource	TokenNameIdentifier	 input Source
,	TokenNameCOMMA	
baseURI	TokenNameIdentifier	 base URI
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// error resolving external subset 	TokenNameCOMMENT_LINE	error resolving external subset 
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ex	TokenNameIdentifier	 ex
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
XNIException	TokenNameIdentifier	 XNI Exception
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// unable to resolve external subset 	TokenNameCOMMENT_LINE	unable to resolve external subset 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getExternalSubset(XMLDTDDescription):XMLInputSource 	TokenNameCOMMENT_LINE	getExternalSubset(XMLDTDDescription):XMLInputSource 
// 	TokenNameCOMMENT_LINE	 
// XMLEntityResolver methods 	TokenNameCOMMENT_LINE	XMLEntityResolver methods 
// 	TokenNameCOMMENT_LINE	 
/** * Resolves an external parsed entity. If the entity cannot be * resolved, this method should return null. * * @param resourceIdentifier contains the physical co-ordinates of the resource to be resolved * * @throws XNIException Thrown on general error. * @throws IOException Thrown if resolved entity stream cannot be * opened or some other i/o error occurs. */	TokenNameCOMMENT_JAVADOC	 Resolves an external parsed entity. If the entity cannot be resolved, this method should return null. * @param resourceIdentifier contains the physical co-ordinates of the resource to be resolved * @throws XNIException Thrown on general error. @throws IOException Thrown if resolved entity stream cannot be opened or some other i/o error occurs. 
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
if	TokenNameif	
(	TokenNameLPAREN	
fEntityResolver	TokenNameIdentifier	 f Entity Resolver
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
pubId	TokenNameIdentifier	 pub Id
=	TokenNameEQUAL	
resourceIdentifier	TokenNameIdentifier	 resource Identifier
.	TokenNameDOT	
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
sysId	TokenNameIdentifier	 sys Id
=	TokenNameEQUAL	
resourceIdentifier	TokenNameIdentifier	 resource Identifier
.	TokenNameDOT	
getLiteralSystemId	TokenNameIdentifier	 get Literal System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
baseURI	TokenNameIdentifier	 base URI
=	TokenNameEQUAL	
resourceIdentifier	TokenNameIdentifier	 resource Identifier
.	TokenNameDOT	
getBaseSystemId	TokenNameIdentifier	 get Base System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
resourceIdentifier	TokenNameIdentifier	 resource Identifier
instanceof	TokenNameinstanceof	
XMLDTDDescription	TokenNameIdentifier	 XMLDTD Description
)	TokenNameRPAREN	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
"[dtd]"	TokenNameStringLiteral	[dtd]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
resourceIdentifier	TokenNameIdentifier	 resource Identifier
instanceof	TokenNameinstanceof	
XMLEntityDescription	TokenNameIdentifier	 XML Entity Description
)	TokenNameRPAREN	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XMLEntityDescription	TokenNameIdentifier	 XML Entity Description
)	TokenNameRPAREN	
resourceIdentifier	TokenNameIdentifier	 resource Identifier
)	TokenNameRPAREN	
.	TokenNameDOT	
getEntityName	TokenNameIdentifier	 get Entity Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// When both pubId and sysId are null, the user's entity resolver 	TokenNameCOMMENT_LINE	When both pubId and sysId are null, the user's entity resolver 
// can do nothing about it. We'd better not bother calling it. 	TokenNameCOMMENT_LINE	can do nothing about it. We'd better not bother calling it. 
// This happens when the resourceIdentifier is a GrammarDescription, 	TokenNameCOMMENT_LINE	This happens when the resourceIdentifier is a GrammarDescription, 
// which describes a schema grammar of some namespace, but without 	TokenNameCOMMENT_LINE	which describes a schema grammar of some namespace, but without 
// any schema location hint. -Sg 	TokenNameCOMMENT_LINE	any schema location hint. -Sg 
if	TokenNameif	
(	TokenNameLPAREN	
pubId	TokenNameIdentifier	 pub Id
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
sysId	TokenNameIdentifier	 sys Id
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Resolve using EntityResolver2 	TokenNameCOMMENT_LINE	Resolve using EntityResolver2 
try	TokenNametry	
{	TokenNameLBRACE	
InputSource	TokenNameIdentifier	 Input Source
inputSource	TokenNameIdentifier	 input Source
=	TokenNameEQUAL	
fEntityResolver	TokenNameIdentifier	 f Entity Resolver
.	TokenNameDOT	
resolveEntity	TokenNameIdentifier	 resolve Entity
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
pubId	TokenNameIdentifier	 pub Id
,	TokenNameCOMMA	
baseURI	TokenNameIdentifier	 base URI
,	TokenNameCOMMA	
sysId	TokenNameIdentifier	 sys Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
inputSource	TokenNameIdentifier	 input Source
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
createXMLInputSource	TokenNameIdentifier	 create XML Input Source
(	TokenNameLPAREN	
inputSource	TokenNameIdentifier	 input Source
,	TokenNameCOMMA	
baseURI	TokenNameIdentifier	 base URI
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// error resolving entity 	TokenNameCOMMENT_LINE	error resolving entity 
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ex	TokenNameIdentifier	 ex
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
XNIException	TokenNameIdentifier	 XNI Exception
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// unable to resolve entity 	TokenNameCOMMENT_LINE	unable to resolve entity 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// resolveEntity(XMLResourceIdentifier):XMLInputSource 	TokenNameCOMMENT_LINE	resolveEntity(XMLResourceIdentifier):XMLInputSource 
/** * Creates an XMLInputSource from a SAX InputSource. */	TokenNameCOMMENT_JAVADOC	 Creates an XMLInputSource from a SAX InputSource. 
private	TokenNameprivate	
XMLInputSource	TokenNameIdentifier	 XML Input Source
createXMLInputSource	TokenNameIdentifier	 create XML Input Source
(	TokenNameLPAREN	
InputSource	TokenNameIdentifier	 Input Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
baseURI	TokenNameIdentifier	 base URI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
baseSystemId	TokenNameIdentifier	 base System Id
=	TokenNameEQUAL	
baseURI	TokenNameIdentifier	 base URI
;	TokenNameSEMICOLON	
InputStream	TokenNameIdentifier	 Input Stream
byteStream	TokenNameIdentifier	 byte Stream
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getByteStream	TokenNameIdentifier	 get Byte Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Reader	TokenNameIdentifier	 Reader
charStream	TokenNameIdentifier	 char Stream
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getCharacterStream	TokenNameIdentifier	 get Character Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getEncoding	TokenNameIdentifier	 get Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
xmlInputSource	TokenNameIdentifier	 xml Input Source
.	TokenNameDOT	
setByteStream	TokenNameIdentifier	 set Byte Stream
(	TokenNameLPAREN	
byteStream	TokenNameIdentifier	 byte Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xmlInputSource	TokenNameIdentifier	 xml Input Source
.	TokenNameDOT	
setCharacterStream	TokenNameIdentifier	 set Character Stream
(	TokenNameLPAREN	
charStream	TokenNameIdentifier	 char Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
// createXMLInputSource(InputSource,String):XMLInputSource 	TokenNameCOMMENT_LINE	createXMLInputSource(InputSource,String):XMLInputSource 
}	TokenNameRBRACE	
// class EntityResolver2Wrapper 	TokenNameCOMMENT_LINE	class EntityResolver2Wrapper 
