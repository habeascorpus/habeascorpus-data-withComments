/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: SerializerFactory.java 468654 2006-10-28 07:09:23Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: SerializerFactory.java 468654 2006-10-28 07:09:23Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
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
Properties	TokenNameIdentifier	 Properties
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
OutputKeys	TokenNameIdentifier	 Output Keys
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
MsgKey	TokenNameIdentifier	 Msg Key
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
Utils	TokenNameIdentifier	 Utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ContentHandler	TokenNameIdentifier	 Content Handler
;	TokenNameSEMICOLON	
/** * This class is a public API, it is a factory for creating serializers. * * The properties object passed to the getSerializer() method should be created by * the OutputPropertiesFactory. Although the properties object * used to create a serializer does not need to be obtained * from OutputPropertiesFactory, * using this factory ensures that the default key/value properties * are set for the given output "method". * * <p> * The standard property keys supported are: "method", "version", "encoding", * "omit-xml-declaration", "standalone", doctype-public", * "doctype-system", "cdata-section-elements", "indent", "media-type". * These property keys and their values are described in the XSLT recommendation, * see {@link <a href="http://www.w3.org/TR/1999/REC-xslt-19991116"> XSLT 1.0 recommendation</a>} * * <p> * The value of the "cdata-section-elements" property key is a whitespace * separated list of elements. If the element is in a namespace then * value is passed in this format: {uri}localName * * <p> * The non-standard property keys supported are defined in {@link OutputPropertiesFactory}. * * @see OutputPropertiesFactory * @see Method * @see Serializer */	TokenNameCOMMENT_JAVADOC	 This class is a public API, it is a factory for creating serializers. * The properties object passed to the getSerializer() method should be created by the OutputPropertiesFactory. Although the properties object used to create a serializer does not need to be obtained from OutputPropertiesFactory, using this factory ensures that the default key/value properties are set for the given output "method". * <p> The standard property keys supported are: "method", "version", "encoding", "omit-xml-declaration", "standalone", doctype-public", "doctype-system", "cdata-section-elements", "indent", "media-type". These property keys and their values are described in the XSLT recommendation, see {@link <a href="http://www.w3.org/TR/1999/REC-xslt-19991116"> XSLT 1.0 recommendation</a>} * <p> The value of the "cdata-section-elements" property key is a whitespace separated list of elements. If the element is in a namespace then value is passed in this format: {uri}localName * <p> The non-standard property keys supported are defined in {@link OutputPropertiesFactory}. * @see OutputPropertiesFactory @see Method @see Serializer 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
SerializerFactory	TokenNameIdentifier	 Serializer Factory
{	TokenNameLBRACE	
/** * This constructor is private just to prevent the creation of such an object. */	TokenNameCOMMENT_JAVADOC	 This constructor is private just to prevent the creation of such an object. 
private	TokenNameprivate	
SerializerFactory	TokenNameIdentifier	 Serializer Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Associates output methods to default output formats. */	TokenNameCOMMENT_JAVADOC	 Associates output methods to default output formats. 
private	TokenNameprivate	
static	TokenNamestatic	
Hashtable	TokenNameIdentifier	 Hashtable
m_formats	TokenNameIdentifier	 m formats
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns a serializer for the specified output method. The output method * is specified by the value of the property associated with the "method" key. * If no implementation exists that supports the specified output method * an exception of some type will be thrown. * For a list of the output "method" key values see {@link Method}. * * @param format The output format, minimally the "method" property must be set. * @return A suitable serializer. * @throws IllegalArgumentException if method is * null or an appropriate serializer can't be found * @throws Exception if the class for the serializer is found but does not * implement ContentHandler. * @throws WrappedRuntimeException if an exception is thrown while trying to find serializer */	TokenNameCOMMENT_JAVADOC	 Returns a serializer for the specified output method. The output method is specified by the value of the property associated with the "method" key. If no implementation exists that supports the specified output method an exception of some type will be thrown. For a list of the output "method" key values see {@link Method}. * @param format The output format, minimally the "method" property must be set. @return A suitable serializer. @throws IllegalArgumentException if method is null or an appropriate serializer can't be found @throws Exception if the class for the serializer is found but does not implement ContentHandler. @throws WrappedRuntimeException if an exception is thrown while trying to find serializer 
public	TokenNamepublic	
static	TokenNamestatic	
Serializer	TokenNameIdentifier	 Serializer
getSerializer	TokenNameIdentifier	 get Serializer
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Serializer	TokenNameIdentifier	 Serializer
ser	TokenNameIdentifier	 ser
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
METHOD	TokenNameIdentifier	 METHOD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
method	TokenNameIdentifier	 method
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
Utils	TokenNameIdentifier	 Utils
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_FACTORY_PROPERTY_MISSING	TokenNameIdentifier	 ER  FACTORY  PROPERTY  MISSING
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
METHOD	TokenNameIdentifier	 METHOD
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
OutputPropertiesFactory	TokenNameIdentifier	 Output Properties Factory
.	TokenNameDOT	
S_KEY_CONTENT_HANDLER	TokenNameIdentifier	 S  KEY  CONTENT  HANDLER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Missing Content Handler property, load default using OutputPropertiesFactory 	TokenNameCOMMENT_LINE	Missing Content Handler property, load default using OutputPropertiesFactory 
Properties	TokenNameIdentifier	 Properties
methodDefaults	TokenNameIdentifier	 method Defaults
=	TokenNameEQUAL	
OutputPropertiesFactory	TokenNameIdentifier	 Output Properties Factory
.	TokenNameDOT	
getDefaultMethodProperties	TokenNameIdentifier	 get Default Method Properties
(	TokenNameLPAREN	
method	TokenNameIdentifier	 method
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
methodDefaults	TokenNameIdentifier	 method Defaults
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
OutputPropertiesFactory	TokenNameIdentifier	 Output Properties Factory
.	TokenNameDOT	
S_KEY_CONTENT_HANDLER	TokenNameIdentifier	 S  KEY  CONTENT  HANDLER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
Utils	TokenNameIdentifier	 Utils
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_FACTORY_PROPERTY_MISSING	TokenNameIdentifier	 ER  FACTORY  PROPERTY  MISSING
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
OutputPropertiesFactory	TokenNameIdentifier	 Output Properties Factory
.	TokenNameDOT	
S_KEY_CONTENT_HANDLER	TokenNameIdentifier	 S  KEY  CONTENT  HANDLER
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
ClassLoader	TokenNameIdentifier	 Class Loader
loader	TokenNameIdentifier	 loader
=	TokenNameEQUAL	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findClassLoader	TokenNameIdentifier	 find Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
cls	TokenNameIdentifier	 cls
=	TokenNameEQUAL	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findProviderClass	TokenNameIdentifier	 find Provider Class
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
,	TokenNameCOMMA	
loader	TokenNameIdentifier	 loader
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// _serializers.put(method, cls); 	TokenNameCOMMENT_LINE	_serializers.put(method, cls); 
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
cls	TokenNameIdentifier	 cls
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
instanceof	TokenNameinstanceof	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this is one of the supplied serializers 	TokenNameCOMMENT_LINE	this is one of the supplied serializers 
ser	TokenNameIdentifier	 ser
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Serializer	TokenNameIdentifier	 Serializer
)	TokenNameRPAREN	
cls	TokenNameIdentifier	 cls
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ser	TokenNameIdentifier	 ser
.	TokenNameDOT	
setOutputFormat	TokenNameIdentifier	 set Output Format
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
/* * This must be a user defined Serializer. * It had better implement ContentHandler. */	TokenNameCOMMENT_BLOCK	 This must be a user defined Serializer. It had better implement ContentHandler. 
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
instanceof	TokenNameinstanceof	
ContentHandler	TokenNameIdentifier	 Content Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* * The user defined serializer defines ContentHandler, * but we need to wrap it with ToXMLSAXHandler which * will collect SAX-like events and emit true * SAX ContentHandler events to the users handler. */	TokenNameCOMMENT_BLOCK	 The user defined serializer defines ContentHandler, but we need to wrap it with ToXMLSAXHandler which will collect SAX-like events and emit true SAX ContentHandler events to the users handler. 
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
SerializerConstants	TokenNameIdentifier	 Serializer Constants
.	TokenNameDOT	
DEFAULT_SAX_SERIALIZER	TokenNameIdentifier	 DEFAULT  SAX  SERIALIZER
;	TokenNameSEMICOLON	
cls	TokenNameIdentifier	 cls
=	TokenNameEQUAL	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findProviderClass	TokenNameIdentifier	 find Provider Class
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
,	TokenNameCOMMA	
loader	TokenNameIdentifier	 loader
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
sh	TokenNameIdentifier	 sh
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
)	TokenNameRPAREN	
cls	TokenNameIdentifier	 cls
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sh	TokenNameIdentifier	 sh
.	TokenNameDOT	
setContentHandler	TokenNameIdentifier	 set Content Handler
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ContentHandler	TokenNameIdentifier	 Content Handler
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sh	TokenNameIdentifier	 sh
.	TokenNameDOT	
setOutputFormat	TokenNameIdentifier	 set Output Format
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ser	TokenNameIdentifier	 ser
=	TokenNameEQUAL	
sh	TokenNameIdentifier	 sh
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// user defined serializer does not implement 	TokenNameCOMMENT_LINE	user defined serializer does not implement 
// ContentHandler, ... very bad 	TokenNameCOMMENT_LINE	ContentHandler, ... very bad 
throw	TokenNamethrow	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
Utils	TokenNameIdentifier	 Utils
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
MsgKey	TokenNameIdentifier	 Msg Key
.	TokenNameDOT	
ER_SERIALIZER_NOT_CONTENTHANDLER	TokenNameIdentifier	 ER  SERIALIZER  NOT  CONTENTHANDLER
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
className	TokenNameIdentifier	 class Name
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If we make it to here ser is not null. 	TokenNameCOMMENT_LINE	If we make it to here ser is not null. 
return	TokenNamereturn	
ser	TokenNameIdentifier	 ser
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
