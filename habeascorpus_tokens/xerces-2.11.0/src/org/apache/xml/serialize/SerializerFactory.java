/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStream	TokenNameIdentifier	 Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
;	TokenNameSEMICOLON	
/** * @deprecated This class was deprecated in Xerces 2.9.0. It is recommended * that new applications use the DOM Level 3 LSSerializer or JAXP's Transformation * API for XML (TrAX) for serializing XML and HTML. See the Xerces documentation for more * information. * @version $Revision: 699892 $ $Date: 2008-09-28 17:08:27 -0400 (Sun, 28 Sep 2008) $ * @author <a href="mailto:Scott_Boag/CAM/Lotus@lotus.com">Scott Boag</a> * @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a> */	TokenNameCOMMENT_JAVADOC	 @deprecated This class was deprecated in Xerces 2.9.0. It is recommended that new applications use the DOM Level 3 LSSerializer or JAXP's Transformation API for XML (TrAX) for serializing XML and HTML. See the Xerces documentation for more information. @version $Revision: 699892 $ $Date: 2008-09-28 17:08:27 -0400 (Sun, 28 Sep 2008) $ @author <a href="mailto:Scott_Boag/CAM/Lotus@lotus.com">Scott Boag</a> @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a> 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
SerializerFactory	TokenNameIdentifier	 Serializer Factory
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FactoriesProperty	TokenNameIdentifier	 Factories Property
=	TokenNameEQUAL	
"org.apache.xml.serialize.factories"	TokenNameStringLiteral	org.apache.xml.serialize.factories
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
Hashtable	TokenNameIdentifier	 Hashtable
_factories	TokenNameIdentifier	 factories
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
SerializerFactory	TokenNameIdentifier	 Serializer Factory
factory	TokenNameIdentifier	 factory
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
list	TokenNameIdentifier	 list
;	TokenNameSEMICOLON	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
;	TokenNameSEMICOLON	
// The default factories are always registered first, 	TokenNameCOMMENT_LINE	The default factories are always registered first, 
// any factory specified in the properties file and supporting 	TokenNameCOMMENT_LINE	any factory specified in the properties file and supporting 
// the same method will override the default factory. 	TokenNameCOMMENT_LINE	the same method will override the default factory. 
factory	TokenNameIdentifier	 factory
=	TokenNameEQUAL	
new	TokenNamenew	
SerializerFactoryImpl	TokenNameIdentifier	 Serializer Factory Impl
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
.	TokenNameDOT	
XML	TokenNameIdentifier	 XML
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
registerSerializerFactory	TokenNameIdentifier	 register Serializer Factory
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factory	TokenNameIdentifier	 factory
=	TokenNameEQUAL	
new	TokenNamenew	
SerializerFactoryImpl	TokenNameIdentifier	 Serializer Factory Impl
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
.	TokenNameDOT	
HTML	TokenNameIdentifier	 HTML
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
registerSerializerFactory	TokenNameIdentifier	 register Serializer Factory
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factory	TokenNameIdentifier	 factory
=	TokenNameEQUAL	
new	TokenNamenew	
SerializerFactoryImpl	TokenNameIdentifier	 Serializer Factory Impl
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
.	TokenNameDOT	
XHTML	TokenNameIdentifier	 XHTML
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
registerSerializerFactory	TokenNameIdentifier	 register Serializer Factory
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factory	TokenNameIdentifier	 factory
=	TokenNameEQUAL	
new	TokenNamenew	
SerializerFactoryImpl	TokenNameIdentifier	 Serializer Factory Impl
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
.	TokenNameDOT	
TEXT	TokenNameIdentifier	 TEXT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
registerSerializerFactory	TokenNameIdentifier	 register Serializer Factory
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
SecuritySupport	TokenNameIdentifier	 Security Support
.	TokenNameDOT	
getSystemProperty	TokenNameIdentifier	 get System Property
(	TokenNameLPAREN	
FactoriesProperty	TokenNameIdentifier	 Factories Property
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
,	TokenNameCOMMA	
" ;,:"	TokenNameStringLiteral	 ;,:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
factory	TokenNameIdentifier	 factory
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SerializerFactory	TokenNameIdentifier	 Serializer Factory
)	TokenNameRPAREN	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
,	TokenNameCOMMA	
SerializerFactory	TokenNameIdentifier	 Serializer Factory
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_factories	TokenNameIdentifier	 factories
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
getSupportedMethod	TokenNameIdentifier	 get Supported Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
_factories	TokenNameIdentifier	 factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
getSupportedMethod	TokenNameIdentifier	 get Supported Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
factory	TokenNameIdentifier	 factory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
except	TokenNameIdentifier	 except
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Register a serializer factory, keyed by the given * method string. */	TokenNameCOMMENT_JAVADOC	 Register a serializer factory, keyed by the given method string. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
registerSerializerFactory	TokenNameIdentifier	 register Serializer Factory
(	TokenNameLPAREN	
SerializerFactory	TokenNameIdentifier	 Serializer Factory
factory	TokenNameIdentifier	 factory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
method	TokenNameIdentifier	 method
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
_factories	TokenNameIdentifier	 factories
)	TokenNameRPAREN	
{	TokenNameLBRACE	
method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
getSupportedMethod	TokenNameIdentifier	 get Supported Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_factories	TokenNameIdentifier	 factories
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
method	TokenNameIdentifier	 method
,	TokenNameCOMMA	
factory	TokenNameIdentifier	 factory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Register a serializer factory, keyed by the given * method string. */	TokenNameCOMMENT_JAVADOC	 Register a serializer factory, keyed by the given method string. 
public	TokenNamepublic	
static	TokenNamestatic	
SerializerFactory	TokenNameIdentifier	 Serializer Factory
getSerializerFactory	TokenNameIdentifier	 get Serializer Factory
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
method	TokenNameIdentifier	 method
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
SerializerFactory	TokenNameIdentifier	 Serializer Factory
)	TokenNameRPAREN	
_factories	TokenNameIdentifier	 factories
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
method	TokenNameIdentifier	 method
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the method supported by this factory and used to register * the factory. This call is required so factories can be added from * a properties file by knowing only the class name. This method is * protected, it is only required by this class but must be implemented * in derived classes. */	TokenNameCOMMENT_JAVADOC	 Returns the method supported by this factory and used to register the factory. This call is required so factories can be added from a properties file by knowing only the class name. This method is protected, it is only required by this class but must be implemented in derived classes. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
String	TokenNameIdentifier	 String
getSupportedMethod	TokenNameIdentifier	 get Supported Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Create a new serializer based on the {@link OutputFormat}. * If this method is used to create the serializer, the {@link * Serializer#setOutputByteStream} or {@link Serializer#setOutputCharStream} * methods must be called before serializing a document. */	TokenNameCOMMENT_JAVADOC	 Create a new serializer based on the {@link OutputFormat}. If this method is used to create the serializer, the {@link Serializer#setOutputByteStream} or {@link Serializer#setOutputCharStream} methods must be called before serializing a document. 
public	TokenNamepublic	
abstract	TokenNameabstract	
Serializer	TokenNameIdentifier	 Serializer
makeSerializer	TokenNameIdentifier	 make Serializer
(	TokenNameLPAREN	
OutputFormat	TokenNameIdentifier	 Output Format
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Create a new serializer, based on the {@link OutputFormat} and * using the writer as the output character stream. If this * method is used, the encoding property will be ignored. */	TokenNameCOMMENT_JAVADOC	 Create a new serializer, based on the {@link OutputFormat} and using the writer as the output character stream. If this method is used, the encoding property will be ignored. 
public	TokenNamepublic	
abstract	TokenNameabstract	
Serializer	TokenNameIdentifier	 Serializer
makeSerializer	TokenNameIdentifier	 make Serializer
(	TokenNameLPAREN	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
OutputFormat	TokenNameIdentifier	 Output Format
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Create a new serializer, based on the {@link OutputFormat} and * using the output byte stream and the encoding specified in the * output format. * * @throws UnsupportedEncodingException The specified encoding is * not supported */	TokenNameCOMMENT_JAVADOC	 Create a new serializer, based on the {@link OutputFormat} and using the output byte stream and the encoding specified in the output format. * @throws UnsupportedEncodingException The specified encoding is not supported 
public	TokenNamepublic	
abstract	TokenNameabstract	
Serializer	TokenNameIdentifier	 Serializer
makeSerializer	TokenNameIdentifier	 make Serializer
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
OutputFormat	TokenNameIdentifier	 Output Format
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
