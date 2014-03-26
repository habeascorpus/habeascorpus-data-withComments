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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
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
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
XMLInputSource	TokenNameIdentifier	 XML Input Source
;	TokenNameSEMICOLON	
/** * This class represents an input source for an XML resource * retrievable over HTTP. In addition to the properties * provided by an <code>XMLInputSource</code> an HTTP input * source also has HTTP request properties and a preference * whether HTTP redirects will be followed. Note that these * properties will only be used if reading this input source * will induce an HTTP connection. * * @author Michael Glavassevich, IBM * * @version $Id: HTTPInputSource.java 699892 2008-09-28 21:08:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This class represents an input source for an XML resource retrievable over HTTP. In addition to the properties provided by an <code>XMLInputSource</code> an HTTP input source also has HTTP request properties and a preference whether HTTP redirects will be followed. Note that these properties will only be used if reading this input source will induce an HTTP connection. * @author Michael Glavassevich, IBM * @version $Id: HTTPInputSource.java 699892 2008-09-28 21:08:27Z mrglavas $ 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
HTTPInputSource	TokenNameIdentifier	 HTTP Input Source
extends	TokenNameextends	
XMLInputSource	TokenNameIdentifier	 XML Input Source
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Preference for whether HTTP redirects should be followed. **/	TokenNameCOMMENT_JAVADOC	 Preference for whether HTTP redirects should be followed. *
protected	TokenNameprotected	
boolean	TokenNameboolean	
fFollowRedirects	TokenNameIdentifier	 f Follow Redirects
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** HTTP request properties. **/	TokenNameCOMMENT_JAVADOC	 HTTP request properties. *
protected	TokenNameprotected	
Map	TokenNameIdentifier	 Map
fHTTPRequestProperties	TokenNameIdentifier	 f HTTP Request Properties
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** * Constructs an input source from just the public and system * identifiers, leaving resolution of the entity and opening of * the input stream up to the caller. * * @param publicId The public identifier, if known. * @param systemId The system identifier. This value should * always be set, if possible, and can be * relative or absolute. If the system identifier * is relative, then the base system identifier * should be set. * @param baseSystemId The base system identifier. This value should * always be set to the fully expanded URI of the * base system identifier, if possible. */	TokenNameCOMMENT_JAVADOC	 Constructs an input source from just the public and system identifiers, leaving resolution of the entity and opening of the input stream up to the caller. * @param publicId The public identifier, if known. @param systemId The system identifier. This value should always be set, if possible, and can be relative or absolute. If the system identifier is relative, then the base system identifier should be set. @param baseSystemId The base system identifier. This value should always be set to the fully expanded URI of the base system identifier, if possible. 
public	TokenNamepublic	
HTTPInputSource	TokenNameIdentifier	 HTTP Input Source
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
baseSystemId	TokenNameIdentifier	 base System Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
systemId	TokenNameIdentifier	 system Id
,	TokenNameCOMMA	
baseSystemId	TokenNameIdentifier	 base System Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(String,String,String) 	TokenNameCOMMENT_LINE	<init>(String,String,String) 
/** * Constructs an input source from a XMLResourceIdentifier * object, leaving resolution of the entity and opening of * the input stream up to the caller. * * @param resourceIdentifier the XMLResourceIdentifier containing the information */	TokenNameCOMMENT_JAVADOC	 Constructs an input source from a XMLResourceIdentifier object, leaving resolution of the entity and opening of the input stream up to the caller. * @param resourceIdentifier the XMLResourceIdentifier containing the information 
public	TokenNamepublic	
HTTPInputSource	TokenNameIdentifier	 HTTP Input Source
(	TokenNameLPAREN	
XMLResourceIdentifier	TokenNameIdentifier	 XML Resource Identifier
resourceIdentifier	TokenNameIdentifier	 resource Identifier
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
resourceIdentifier	TokenNameIdentifier	 resource Identifier
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(XMLResourceIdentifier) 	TokenNameCOMMENT_LINE	<init>(XMLResourceIdentifier) 
/** * Constructs an input source from a byte stream. * * @param publicId The public identifier, if known. * @param systemId The system identifier. This value should * always be set, if possible, and can be * relative or absolute. If the system identifier * is relative, then the base system identifier * should be set. * @param baseSystemId The base system identifier. This value should * always be set to the fully expanded URI of the * base system identifier, if possible. * @param byteStream The byte stream. * @param encoding The encoding of the byte stream, if known. */	TokenNameCOMMENT_JAVADOC	 Constructs an input source from a byte stream. * @param publicId The public identifier, if known. @param systemId The system identifier. This value should always be set, if possible, and can be relative or absolute. If the system identifier is relative, then the base system identifier should be set. @param baseSystemId The base system identifier. This value should always be set to the fully expanded URI of the base system identifier, if possible. @param byteStream The byte stream. @param encoding The encoding of the byte stream, if known. 
public	TokenNamepublic	
HTTPInputSource	TokenNameIdentifier	 HTTP Input Source
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
baseSystemId	TokenNameIdentifier	 base System Id
,	TokenNameCOMMA	
InputStream	TokenNameIdentifier	 Input Stream
byteStream	TokenNameIdentifier	 byte Stream
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
systemId	TokenNameIdentifier	 system Id
,	TokenNameCOMMA	
baseSystemId	TokenNameIdentifier	 base System Id
,	TokenNameCOMMA	
byteStream	TokenNameIdentifier	 byte Stream
,	TokenNameCOMMA	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(String,String,String,InputStream,String) 	TokenNameCOMMENT_LINE	<init>(String,String,String,InputStream,String) 
/** * Constructs an input source from a character stream. * * @param publicId The public identifier, if known. * @param systemId The system identifier. This value should * always be set, if possible, and can be * relative or absolute. If the system identifier * is relative, then the base system identifier * should be set. * @param baseSystemId The base system identifier. This value should * always be set to the fully expanded URI of the * base system identifier, if possible. * @param charStream The character stream. * @param encoding The original encoding of the byte stream * used by the reader, if known. */	TokenNameCOMMENT_JAVADOC	 Constructs an input source from a character stream. * @param publicId The public identifier, if known. @param systemId The system identifier. This value should always be set, if possible, and can be relative or absolute. If the system identifier is relative, then the base system identifier should be set. @param baseSystemId The base system identifier. This value should always be set to the fully expanded URI of the base system identifier, if possible. @param charStream The character stream. @param encoding The original encoding of the byte stream used by the reader, if known. 
public	TokenNamepublic	
HTTPInputSource	TokenNameIdentifier	 HTTP Input Source
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
baseSystemId	TokenNameIdentifier	 base System Id
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
charStream	TokenNameIdentifier	 char Stream
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
systemId	TokenNameIdentifier	 system Id
,	TokenNameCOMMA	
baseSystemId	TokenNameIdentifier	 base System Id
,	TokenNameCOMMA	
charStream	TokenNameIdentifier	 char Stream
,	TokenNameCOMMA	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(String,String,String,Reader,String) 	TokenNameCOMMENT_LINE	<init>(String,String,String,Reader,String) 
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
/** * Returns the preference whether HTTP redirects should * be followed. By default HTTP redirects will be followed. */	TokenNameCOMMENT_JAVADOC	 Returns the preference whether HTTP redirects should be followed. By default HTTP redirects will be followed. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getFollowHTTPRedirects	TokenNameIdentifier	 get Follow HTTP Redirects
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fFollowRedirects	TokenNameIdentifier	 f Follow Redirects
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getFollowHTTPRedirects():boolean 	TokenNameCOMMENT_LINE	getFollowHTTPRedirects():boolean 
/** * Sets the preference whether HTTP redirects should * be followed. By default HTTP redirects will be followed. */	TokenNameCOMMENT_JAVADOC	 Sets the preference whether HTTP redirects should be followed. By default HTTP redirects will be followed. 
public	TokenNamepublic	
void	TokenNamevoid	
setFollowHTTPRedirects	TokenNameIdentifier	 set Follow HTTP Redirects
(	TokenNameLPAREN	
boolean	TokenNameboolean	
followRedirects	TokenNameIdentifier	 follow Redirects
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fFollowRedirects	TokenNameIdentifier	 f Follow Redirects
=	TokenNameEQUAL	
followRedirects	TokenNameIdentifier	 follow Redirects
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setFollowHTTPRedirects(boolean) 	TokenNameCOMMENT_LINE	setFollowHTTPRedirects(boolean) 
/** * Returns the value of the request property * associated with the given property name. * * @param key the name of the request property * @return the value of the request property or * <code>null</code> if this property has not * been set */	TokenNameCOMMENT_JAVADOC	 Returns the value of the request property associated with the given property name. * @param key the name of the request property @return the value of the request property or <code>null</code> if this property has not been set 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getHTTPRequestProperty	TokenNameIdentifier	 get HTTP Request Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
fHTTPRequestProperties	TokenNameIdentifier	 f HTTP Request Properties
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getHTTPRequestProperty(String):String 	TokenNameCOMMENT_LINE	getHTTPRequestProperty(String):String 
/** * Returns an iterator for the request properties this * input source contains. Each object returned by the * iterator is an instance of <code>java.util.Map.Entry</code> * where each key and value are a pair of strings corresponding * to the name and value of a request property. * * @return an iterator for the request properties this * input source contains */	TokenNameCOMMENT_JAVADOC	 Returns an iterator for the request properties this input source contains. Each object returned by the iterator is an instance of <code>java.util.Map.Entry</code> where each key and value are a pair of strings corresponding to the name and value of a request property. * @return an iterator for the request properties this input source contains 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
getHTTPRequestProperties	TokenNameIdentifier	 get HTTP Request Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fHTTPRequestProperties	TokenNameIdentifier	 f HTTP Request Properties
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getHTTPRequestProperties():Iterator 	TokenNameCOMMENT_LINE	getHTTPRequestProperties():Iterator 
/** * Sets the value of the request property * associated with the given property name. * * @param key the name of the request property * @param value the value of the request property */	TokenNameCOMMENT_JAVADOC	 Sets the value of the request property associated with the given property name. * @param key the name of the request property @param value the value of the request property 
public	TokenNamepublic	
void	TokenNamevoid	
setHTTPRequestProperty	TokenNameIdentifier	 set HTTP Request Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fHTTPRequestProperties	TokenNameIdentifier	 f HTTP Request Properties
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fHTTPRequestProperties	TokenNameIdentifier	 f HTTP Request Properties
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// setHTTPRequestProperty(String,String) 	TokenNameCOMMENT_LINE	setHTTPRequestProperty(String,String) 
}	TokenNameRBRACE	
// class HTTPInputSource 	TokenNameCOMMENT_LINE	class HTTPInputSource 
