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
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
EntityResolver	TokenNameIdentifier	 Entity Resolver
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
/** * This class wraps a SAX entity resolver in an XNI entity resolver. * * @see EntityResolver * * @author Andy Clark, IBM * * @version $Id: EntityResolverWrapper.java 699892 2008-09-28 21:08:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This class wraps a SAX entity resolver in an XNI entity resolver. * @see EntityResolver * @author Andy Clark, IBM * @version $Id: EntityResolverWrapper.java 699892 2008-09-28 21:08:27Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
EntityResolverWrapper	TokenNameIdentifier	 Entity Resolver Wrapper
implements	TokenNameimplements	
XMLEntityResolver	TokenNameIdentifier	 XML Entity Resolver
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** The SAX entity resolver. */	TokenNameCOMMENT_JAVADOC	 The SAX entity resolver. 
protected	TokenNameprotected	
EntityResolver	TokenNameIdentifier	 Entity Resolver
fEntityResolver	TokenNameIdentifier	 f Entity Resolver
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
EntityResolverWrapper	TokenNameIdentifier	 Entity Resolver Wrapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** Wraps the specified SAX entity resolver. */	TokenNameCOMMENT_JAVADOC	 Wraps the specified SAX entity resolver. 
public	TokenNamepublic	
EntityResolverWrapper	TokenNameIdentifier	 Entity Resolver Wrapper
(	TokenNameLPAREN	
EntityResolver	TokenNameIdentifier	 Entity Resolver
entityResolver	TokenNameIdentifier	 entity Resolver
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setEntityResolver	TokenNameIdentifier	 set Entity Resolver
(	TokenNameLPAREN	
entityResolver	TokenNameIdentifier	 entity Resolver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(EntityResolver) 	TokenNameCOMMENT_LINE	<init>(EntityResolver) 
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
/** Sets the SAX entity resolver. */	TokenNameCOMMENT_JAVADOC	 Sets the SAX entity resolver. 
public	TokenNamepublic	
void	TokenNamevoid	
setEntityResolver	TokenNameIdentifier	 set Entity Resolver
(	TokenNameLPAREN	
EntityResolver	TokenNameIdentifier	 Entity Resolver
entityResolver	TokenNameIdentifier	 entity Resolver
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fEntityResolver	TokenNameIdentifier	 f Entity Resolver
=	TokenNameEQUAL	
entityResolver	TokenNameIdentifier	 entity Resolver
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setEntityResolver(EntityResolver) 	TokenNameCOMMENT_LINE	setEntityResolver(EntityResolver) 
/** Returns the SAX entity resolver. */	TokenNameCOMMENT_JAVADOC	 Returns the SAX entity resolver. 
public	TokenNamepublic	
EntityResolver	TokenNameIdentifier	 Entity Resolver
getEntityResolver	TokenNameIdentifier	 get Entity Resolver
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fEntityResolver	TokenNameIdentifier	 f Entity Resolver
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getEntityResolver():EntityResolver 	TokenNameCOMMENT_LINE	getEntityResolver():EntityResolver 
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
// When both pubId and sysId are null, the user's entity resolver 	TokenNameCOMMENT_LINE	When both pubId and sysId are null, the user's entity resolver 
// can do nothing about it. We'd better not bother calling it. 	TokenNameCOMMENT_LINE	can do nothing about it. We'd better not bother calling it. 
// This happens when the resourceIdentifier is a GrammarDescription, 	TokenNameCOMMENT_LINE	This happens when the resourceIdentifier is a GrammarDescription, 
// which describes a schema grammar of some namespace, but without 	TokenNameCOMMENT_LINE	which describes a schema grammar of some namespace, but without 
// any schema location hint. -Sg 	TokenNameCOMMENT_LINE	any schema location hint. -Sg 
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
getExpandedSystemId	TokenNameIdentifier	 get Expanded System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// resolve entity using SAX entity resolver 	TokenNameCOMMENT_LINE	resolve entity using SAX entity resolver 
if	TokenNameif	
(	TokenNameLPAREN	
fEntityResolver	TokenNameIdentifier	 f Entity Resolver
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
resourceIdentifier	TokenNameIdentifier	 resource Identifier
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
InputSource	TokenNameIdentifier	 Input Source
inputSource	TokenNameIdentifier	 input Source
=	TokenNameEQUAL	
fEntityResolver	TokenNameIdentifier	 f Entity Resolver
.	TokenNameDOT	
resolveEntity	TokenNameIdentifier	 resolve Entity
(	TokenNameLPAREN	
pubId	TokenNameIdentifier	 pub Id
,	TokenNameCOMMA	
sysId	TokenNameIdentifier	 sys Id
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
resourceIdentifier	TokenNameIdentifier	 resource Identifier
.	TokenNameDOT	
getBaseSystemId	TokenNameIdentifier	 get Base System Id
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
// resolveEntity(String,String,String):XMLInputSource 	TokenNameCOMMENT_LINE	resolveEntity(String,String,String):XMLInputSource 
}	TokenNameRBRACE	
