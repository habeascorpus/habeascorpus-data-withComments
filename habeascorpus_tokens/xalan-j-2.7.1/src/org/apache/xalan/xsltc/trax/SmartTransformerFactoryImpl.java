/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: SmartTransformerFactoryImpl.java 468653 2006-10-28 07:07:05Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: SmartTransformerFactoryImpl.java 468653 2006-10-28 07:07:05Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
trax	TokenNameIdentifier	 trax
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
XMLConstants	TokenNameIdentifier	 XML Constants
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
ErrorListener	TokenNameIdentifier	 Error Listener
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
Source	TokenNameIdentifier	 Source
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
Templates	TokenNameIdentifier	 Templates
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
Transformer	TokenNameIdentifier	 Transformer
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
URIResolver	TokenNameIdentifier	 URI Resolver
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMResult	TokenNameIdentifier	 DOM Result
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMSource	TokenNameIdentifier	 DOM Source
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXResult	TokenNameIdentifier	 SAX Result
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXSource	TokenNameIdentifier	 SAX Source
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXTransformerFactory	TokenNameIdentifier	 SAX Transformer Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
TemplatesHandler	TokenNameIdentifier	 Templates Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
TransformerHandler	TokenNameIdentifier	 Transformer Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
StreamResult	TokenNameIdentifier	 Stream Result
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
StreamSource	TokenNameIdentifier	 Stream Source
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ErrorMsg	TokenNameIdentifier	 Error Msg
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
XMLFilter	TokenNameIdentifier	 XML Filter
;	TokenNameSEMICOLON	
/** * Implementation of a transformer factory that uses an XSLTC * transformer factory for the creation of Templates objects * and uses the Xalan processor transformer factory for the * creation of Transformer objects. * @author G. Todd Miller */	TokenNameCOMMENT_JAVADOC	 Implementation of a transformer factory that uses an XSLTC transformer factory for the creation of Templates objects and uses the Xalan processor transformer factory for the creation of Transformer objects. @author G. Todd Miller 
public	TokenNamepublic	
class	TokenNameclass	
SmartTransformerFactoryImpl	TokenNameIdentifier	 Smart Transformer Factory Impl
extends	TokenNameextends	
SAXTransformerFactory	TokenNameIdentifier	 SAX Transformer Factory
{	TokenNameLBRACE	
/** * <p>Name of class as a constant to use for debugging.</p> */	TokenNameCOMMENT_JAVADOC	 <p>Name of class as a constant to use for debugging.</p> 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CLASS_NAME	TokenNameIdentifier	 CLASS  NAME
=	TokenNameEQUAL	
"SmartTransformerFactoryImpl"	TokenNameStringLiteral	SmartTransformerFactoryImpl
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SAXTransformerFactory	TokenNameIdentifier	 SAX Transformer Factory
_xsltcFactory	TokenNameIdentifier	 xsltc Factory
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SAXTransformerFactory	TokenNameIdentifier	 SAX Transformer Factory
_xalanFactory	TokenNameIdentifier	 xalan Factory
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SAXTransformerFactory	TokenNameIdentifier	 SAX Transformer Factory
_currFactory	TokenNameIdentifier	 curr Factory
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ErrorListener	TokenNameIdentifier	 Error Listener
_errorlistener	TokenNameIdentifier	 errorlistener
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
URIResolver	TokenNameIdentifier	 URI Resolver
_uriresolver	TokenNameIdentifier	 uriresolver
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * <p>State of secure processing feature.</p> */	TokenNameCOMMENT_JAVADOC	 <p>State of secure processing feature.</p> 
private	TokenNameprivate	
boolean	TokenNameboolean	
featureSecureProcessing	TokenNameIdentifier	 feature Secure Processing
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * implementation of the SmartTransformerFactory. This factory * uses org.apache.xalan.xsltc.trax.TransformerFactory * to return Templates objects; and uses * org.apache.xalan.processor.TransformerFactory * to return Transformer objects. */	TokenNameCOMMENT_JAVADOC	 implementation of the SmartTransformerFactory. This factory uses org.apache.xalan.xsltc.trax.TransformerFactory to return Templates objects; and uses org.apache.xalan.processor.TransformerFactory to return Transformer objects. 
public	TokenNamepublic	
SmartTransformerFactoryImpl	TokenNameIdentifier	 Smart Transformer Factory Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
createXSLTCTransformerFactory	TokenNameIdentifier	 create XSLTC Transformer Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_xsltcFactory	TokenNameIdentifier	 xsltc Factory
=	TokenNameEQUAL	
new	TokenNamenew	
TransformerFactoryImpl	TokenNameIdentifier	 Transformer Factory Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_currFactory	TokenNameIdentifier	 curr Factory
=	TokenNameEQUAL	
_xsltcFactory	TokenNameIdentifier	 xsltc Factory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
createXalanTransformerFactory	TokenNameIdentifier	 create Xalan Transformer Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
xalanMessage	TokenNameIdentifier	 xalan Message
=	TokenNameEQUAL	
"org.apache.xalan.xsltc.trax.SmartTransformerFactoryImpl "	TokenNameStringLiteral	org.apache.xalan.xsltc.trax.SmartTransformerFactoryImpl 
+	TokenNamePLUS	
"could not create an "	TokenNameStringLiteral	could not create an 
+	TokenNamePLUS	
"org.apache.xalan.processor.TransformerFactoryImpl."	TokenNameStringLiteral	org.apache.xalan.processor.TransformerFactoryImpl.
;	TokenNameSEMICOLON	
// try to create instance of Xalan factory... 	TokenNameCOMMENT_LINE	try to create instance of Xalan factory... 
try	TokenNametry	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
xalanFactClass	TokenNameIdentifier	 xalan Fact Class
=	TokenNameEQUAL	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findProviderClass	TokenNameIdentifier	 find Provider Class
(	TokenNameLPAREN	
"org.apache.xalan.processor.TransformerFactoryImpl"	TokenNameStringLiteral	org.apache.xalan.processor.TransformerFactoryImpl
,	TokenNameCOMMA	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findClassLoader	TokenNameIdentifier	 find Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_xalanFactory	TokenNameIdentifier	 xalan Factory
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SAXTransformerFactory	TokenNameIdentifier	 SAX Transformer Factory
)	TokenNameRPAREN	
xalanFactClass	TokenNameIdentifier	 xalan Fact Class
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
xalanMessage	TokenNameIdentifier	 xalan Message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InstantiationException	TokenNameIdentifier	 Instantiation Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
xalanMessage	TokenNameIdentifier	 xalan Message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
xalanMessage	TokenNameIdentifier	 xalan Message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_currFactory	TokenNameIdentifier	 curr Factory
=	TokenNameEQUAL	
_xalanFactory	TokenNameIdentifier	 xalan Factory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setErrorListener	TokenNameIdentifier	 set Error Listener
(	TokenNameLPAREN	
ErrorListener	TokenNameIdentifier	 Error Listener
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
_errorlistener	TokenNameIdentifier	 errorlistener
=	TokenNameEQUAL	
listener	TokenNameIdentifier	 listener
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ErrorListener	TokenNameIdentifier	 Error Listener
getErrorListener	TokenNameIdentifier	 get Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_errorlistener	TokenNameIdentifier	 errorlistener
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
// GTM: NB: 'debug' should change to something more unique... 	TokenNameCOMMENT_LINE	GTM: NB: 'debug' should change to something more unique... 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"translet-name"	TokenNameStringLiteral	translet-name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"debug"	TokenNameStringLiteral	debug
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_xsltcFactory	TokenNameIdentifier	 xsltc Factory
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createXSLTCTransformerFactory	TokenNameIdentifier	 create XSLTC Transformer Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
_xsltcFactory	TokenNameIdentifier	 xsltc Factory
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_xalanFactory	TokenNameIdentifier	 xalan Factory
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createXalanTransformerFactory	TokenNameIdentifier	 create Xalan Transformer Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
_xalanFactory	TokenNameIdentifier	 xalan Factory
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
// GTM: NB: 'debug' should change to something more unique... 	TokenNameCOMMENT_LINE	GTM: NB: 'debug' should change to something more unique... 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"translet-name"	TokenNameStringLiteral	translet-name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"debug"	TokenNameStringLiteral	debug
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_xsltcFactory	TokenNameIdentifier	 xsltc Factory
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createXSLTCTransformerFactory	TokenNameIdentifier	 create XSLTC Transformer Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_xsltcFactory	TokenNameIdentifier	 xsltc Factory
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_xalanFactory	TokenNameIdentifier	 xalan Factory
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createXalanTransformerFactory	TokenNameIdentifier	 create Xalan Transformer Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_xalanFactory	TokenNameIdentifier	 xalan Factory
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * <p>Set a feature for this <code>SmartTransformerFactory</code> and <code>Transformer</code>s * or <code>Template</code>s created by this factory.</p> * * <p> * Feature names are fully qualified {@link java.net.URI}s. * Implementations may define their own features. * An {@link TransformerConfigurationException} is thrown if this <code>TransformerFactory</code> or the * <code>Transformer</code>s or <code>Template</code>s it creates cannot support the feature. * It is possible for an <code>TransformerFactory</code> to expose a feature value but be unable to change its state. * </p> * * <p>See {@link javax.xml.transform.TransformerFactory} for full documentation of specific features.</p> * * @param name Feature name. * @param value Is feature state <code>true</code> or <code>false</code>. * * @throws TransformerConfigurationException if this <code>TransformerFactory</code> * or the <code>Transformer</code>s or <code>Template</code>s it creates cannot support this feature. * @throws NullPointerException If the <code>name</code> parameter is null. */	TokenNameCOMMENT_JAVADOC	 <p>Set a feature for this <code>SmartTransformerFactory</code> and <code>Transformer</code>s or <code>Template</code>s created by this factory.</p> * <p> Feature names are fully qualified {@link java.net.URI}s. Implementations may define their own features. An {@link TransformerConfigurationException} is thrown if this <code>TransformerFactory</code> or the <code>Transformer</code>s or <code>Template</code>s it creates cannot support the feature. It is possible for an <code>TransformerFactory</code> to expose a feature value but be unable to change its state. </p> * <p>See {@link javax.xml.transform.TransformerFactory} for full documentation of specific features.</p> * @param name Feature name. @param value Is feature state <code>true</code> or <code>false</code>. * @throws TransformerConfigurationException if this <code>TransformerFactory</code> or the <code>Transformer</code>s or <code>Template</code>s it creates cannot support this feature. @throws NullPointerException If the <code>name</code> parameter is null. 
public	TokenNamepublic	
void	TokenNamevoid	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
{	TokenNameLBRACE	
// feature name cannot be null 	TokenNameCOMMENT_LINE	feature name cannot be null 
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
err	TokenNameIdentifier	 err
=	TokenNameEQUAL	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_SET_FEATURE_NULL_NAME	TokenNameIdentifier	 JAXP  SET  FEATURE  NULL  NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// secure processing? 	TokenNameCOMMENT_LINE	secure processing? 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
FEATURE_SECURE_PROCESSING	TokenNameIdentifier	 FEATURE  SECURE  PROCESSING
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
featureSecureProcessing	TokenNameIdentifier	 feature Secure Processing
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
// all done processing feature 	TokenNameCOMMENT_LINE	all done processing feature 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// unknown feature 	TokenNameCOMMENT_LINE	unknown feature 
ErrorMsg	TokenNameIdentifier	 Error Msg
err	TokenNameIdentifier	 err
=	TokenNameEQUAL	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_UNSUPPORTED_FEATURE	TokenNameIdentifier	 JAXP  UNSUPPORTED  FEATURE
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
(	TokenNameLPAREN	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * javax.xml.transform.sax.TransformerFactory implementation. * Look up the value of a feature (to see if it is supported). * This method must be updated as the various methods and features of this * class are implemented. * * @param name The feature name * @return 'true' if feature is supported, 'false' if not */	TokenNameCOMMENT_JAVADOC	 javax.xml.transform.sax.TransformerFactory implementation. Look up the value of a feature (to see if it is supported). This method must be updated as the various methods and features of this class are implemented. * @param name The feature name @return 'true' if feature is supported, 'false' if not 
public	TokenNamepublic	
boolean	TokenNameboolean	
getFeature	TokenNameIdentifier	 get Feature
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// All supported features should be listed here 	TokenNameCOMMENT_LINE	All supported features should be listed here 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
features	TokenNameIdentifier	 features
=	TokenNameEQUAL	
{	TokenNameLBRACE	
DOMSource	TokenNameIdentifier	 DOM Source
.	TokenNameDOT	
FEATURE	TokenNameIdentifier	 FEATURE
,	TokenNameCOMMA	
DOMResult	TokenNameIdentifier	 DOM Result
.	TokenNameDOT	
FEATURE	TokenNameIdentifier	 FEATURE
,	TokenNameCOMMA	
SAXSource	TokenNameIdentifier	 SAX Source
.	TokenNameDOT	
FEATURE	TokenNameIdentifier	 FEATURE
,	TokenNameCOMMA	
SAXResult	TokenNameIdentifier	 SAX Result
.	TokenNameDOT	
FEATURE	TokenNameIdentifier	 FEATURE
,	TokenNameCOMMA	
StreamSource	TokenNameIdentifier	 Stream Source
.	TokenNameDOT	
FEATURE	TokenNameIdentifier	 FEATURE
,	TokenNameCOMMA	
StreamResult	TokenNameIdentifier	 Stream Result
.	TokenNameDOT	
FEATURE	TokenNameIdentifier	 FEATURE
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// feature name cannot be null 	TokenNameCOMMENT_LINE	feature name cannot be null 
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
err	TokenNameIdentifier	 err
=	TokenNameEQUAL	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_GET_FEATURE_NULL_NAME	TokenNameIdentifier	 JAXP  GET  FEATURE  NULL  NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Inefficient, but it really does not matter in a function like this 	TokenNameCOMMENT_LINE	Inefficient, but it really does not matter in a function like this 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
features	TokenNameIdentifier	 features
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// secure processing? 	TokenNameCOMMENT_LINE	secure processing? 
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
FEATURE_SECURE_PROCESSING	TokenNameIdentifier	 FEATURE  SECURE  PROCESSING
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
featureSecureProcessing	TokenNameIdentifier	 feature Secure Processing
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// unknown feature 	TokenNameCOMMENT_LINE	unknown feature 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
URIResolver	TokenNameIdentifier	 URI Resolver
getURIResolver	TokenNameIdentifier	 get URI Resolver
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_uriresolver	TokenNameIdentifier	 uriresolver
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setURIResolver	TokenNameIdentifier	 set URI Resolver
(	TokenNameLPAREN	
URIResolver	TokenNameIdentifier	 URI Resolver
resolver	TokenNameIdentifier	 resolver
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_uriresolver	TokenNameIdentifier	 uriresolver
=	TokenNameEQUAL	
resolver	TokenNameIdentifier	 resolver
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Source	TokenNameIdentifier	 Source
getAssociatedStylesheet	TokenNameIdentifier	 get Associated Stylesheet
(	TokenNameLPAREN	
Source	TokenNameIdentifier	 Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
media	TokenNameIdentifier	 media
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
title	TokenNameIdentifier	 title
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
charset	TokenNameIdentifier	 charset
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_currFactory	TokenNameIdentifier	 curr Factory
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createXSLTCTransformerFactory	TokenNameIdentifier	 create XSLTC Transformer Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
_currFactory	TokenNameIdentifier	 curr Factory
.	TokenNameDOT	
getAssociatedStylesheet	TokenNameIdentifier	 get Associated Stylesheet
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
media	TokenNameIdentifier	 media
,	TokenNameCOMMA	
title	TokenNameIdentifier	 title
,	TokenNameCOMMA	
charset	TokenNameIdentifier	 charset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a Transformer object that copies the input document to the * result. Uses the org.apache.xalan.processor.TransformerFactory. * @return A Transformer object. */	TokenNameCOMMENT_JAVADOC	 Create a Transformer object that copies the input document to the result. Uses the org.apache.xalan.processor.TransformerFactory. @return A Transformer object. 
public	TokenNamepublic	
Transformer	TokenNameIdentifier	 Transformer
newTransformer	TokenNameIdentifier	 new Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_xalanFactory	TokenNameIdentifier	 xalan Factory
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createXalanTransformerFactory	TokenNameIdentifier	 create Xalan Transformer Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_errorlistener	TokenNameIdentifier	 errorlistener
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_xalanFactory	TokenNameIdentifier	 xalan Factory
.	TokenNameDOT	
setErrorListener	TokenNameIdentifier	 set Error Listener
(	TokenNameLPAREN	
_errorlistener	TokenNameIdentifier	 errorlistener
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_uriresolver	TokenNameIdentifier	 uriresolver
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_xalanFactory	TokenNameIdentifier	 xalan Factory
.	TokenNameDOT	
setURIResolver	TokenNameIdentifier	 set URI Resolver
(	TokenNameLPAREN	
_uriresolver	TokenNameIdentifier	 uriresolver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_currFactory	TokenNameIdentifier	 curr Factory
=	TokenNameEQUAL	
_xalanFactory	TokenNameIdentifier	 xalan Factory
;	TokenNameSEMICOLON	
return	TokenNamereturn	
_currFactory	TokenNameIdentifier	 curr Factory
.	TokenNameDOT	
newTransformer	TokenNameIdentifier	 new Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a Transformer object that from the input stylesheet * Uses the org.apache.xalan.processor.TransformerFactory. * @param source the stylesheet. * @return A Transformer object. */	TokenNameCOMMENT_JAVADOC	 Create a Transformer object that from the input stylesheet Uses the org.apache.xalan.processor.TransformerFactory. @param source the stylesheet. @return A Transformer object. 
public	TokenNamepublic	
Transformer	TokenNameIdentifier	 Transformer
newTransformer	TokenNameIdentifier	 new Transformer
(	TokenNameLPAREN	
Source	TokenNameIdentifier	 Source
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_xalanFactory	TokenNameIdentifier	 xalan Factory
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createXalanTransformerFactory	TokenNameIdentifier	 create Xalan Transformer Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_errorlistener	TokenNameIdentifier	 errorlistener
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_xalanFactory	TokenNameIdentifier	 xalan Factory
.	TokenNameDOT	
setErrorListener	TokenNameIdentifier	 set Error Listener
(	TokenNameLPAREN	
_errorlistener	TokenNameIdentifier	 errorlistener
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_uriresolver	TokenNameIdentifier	 uriresolver
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_xalanFactory	TokenNameIdentifier	 xalan Factory
.	TokenNameDOT	
setURIResolver	TokenNameIdentifier	 set URI Resolver
(	TokenNameLPAREN	
_uriresolver	TokenNameIdentifier	 uriresolver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_currFactory	TokenNameIdentifier	 curr Factory
=	TokenNameEQUAL	
_xalanFactory	TokenNameIdentifier	 xalan Factory
;	TokenNameSEMICOLON	
return	TokenNamereturn	
_currFactory	TokenNameIdentifier	 curr Factory
.	TokenNameDOT	
newTransformer	TokenNameIdentifier	 new Transformer
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a Templates object that from the input stylesheet * Uses the org.apache.xalan.xsltc.trax.TransformerFactory. * @param source the stylesheet. * @return A Templates object. */	TokenNameCOMMENT_JAVADOC	 Create a Templates object that from the input stylesheet Uses the org.apache.xalan.xsltc.trax.TransformerFactory. @param source the stylesheet. @return A Templates object. 
public	TokenNamepublic	
Templates	TokenNameIdentifier	 Templates
newTemplates	TokenNameIdentifier	 new Templates
(	TokenNameLPAREN	
Source	TokenNameIdentifier	 Source
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_xsltcFactory	TokenNameIdentifier	 xsltc Factory
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createXSLTCTransformerFactory	TokenNameIdentifier	 create XSLTC Transformer Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_errorlistener	TokenNameIdentifier	 errorlistener
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_xsltcFactory	TokenNameIdentifier	 xsltc Factory
.	TokenNameDOT	
setErrorListener	TokenNameIdentifier	 set Error Listener
(	TokenNameLPAREN	
_errorlistener	TokenNameIdentifier	 errorlistener
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_uriresolver	TokenNameIdentifier	 uriresolver
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_xsltcFactory	TokenNameIdentifier	 xsltc Factory
.	TokenNameDOT	
setURIResolver	TokenNameIdentifier	 set URI Resolver
(	TokenNameLPAREN	
_uriresolver	TokenNameIdentifier	 uriresolver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_currFactory	TokenNameIdentifier	 curr Factory
=	TokenNameEQUAL	
_xsltcFactory	TokenNameIdentifier	 xsltc Factory
;	TokenNameSEMICOLON	
return	TokenNamereturn	
_currFactory	TokenNameIdentifier	 curr Factory
.	TokenNameDOT	
newTemplates	TokenNameIdentifier	 new Templates
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a TemplatesHandler object that can process SAX ContentHandler * events into a Templates object. Uses the * org.apache.xalan.xsltc.trax.TransformerFactory. */	TokenNameCOMMENT_JAVADOC	 Get a TemplatesHandler object that can process SAX ContentHandler events into a Templates object. Uses the org.apache.xalan.xsltc.trax.TransformerFactory. 
public	TokenNamepublic	
TemplatesHandler	TokenNameIdentifier	 Templates Handler
newTemplatesHandler	TokenNameIdentifier	 new Templates Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_xsltcFactory	TokenNameIdentifier	 xsltc Factory
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createXSLTCTransformerFactory	TokenNameIdentifier	 create XSLTC Transformer Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_errorlistener	TokenNameIdentifier	 errorlistener
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_xsltcFactory	TokenNameIdentifier	 xsltc Factory
.	TokenNameDOT	
setErrorListener	TokenNameIdentifier	 set Error Listener
(	TokenNameLPAREN	
_errorlistener	TokenNameIdentifier	 errorlistener
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_uriresolver	TokenNameIdentifier	 uriresolver
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_xsltcFactory	TokenNameIdentifier	 xsltc Factory
.	TokenNameDOT	
setURIResolver	TokenNameIdentifier	 set URI Resolver
(	TokenNameLPAREN	
_uriresolver	TokenNameIdentifier	 uriresolver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
_xsltcFactory	TokenNameIdentifier	 xsltc Factory
.	TokenNameDOT	
newTemplatesHandler	TokenNameIdentifier	 new Templates Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a TransformerHandler object that can process SAX ContentHandler * events based on a copy transformer. * Uses org.apache.xalan.processor.TransformerFactory. */	TokenNameCOMMENT_JAVADOC	 Get a TransformerHandler object that can process SAX ContentHandler events based on a copy transformer. Uses org.apache.xalan.processor.TransformerFactory. 
public	TokenNamepublic	
TransformerHandler	TokenNameIdentifier	 Transformer Handler
newTransformerHandler	TokenNameIdentifier	 new Transformer Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_xalanFactory	TokenNameIdentifier	 xalan Factory
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createXalanTransformerFactory	TokenNameIdentifier	 create Xalan Transformer Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_errorlistener	TokenNameIdentifier	 errorlistener
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_xalanFactory	TokenNameIdentifier	 xalan Factory
.	TokenNameDOT	
setErrorListener	TokenNameIdentifier	 set Error Listener
(	TokenNameLPAREN	
_errorlistener	TokenNameIdentifier	 errorlistener
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_uriresolver	TokenNameIdentifier	 uriresolver
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_xalanFactory	TokenNameIdentifier	 xalan Factory
.	TokenNameDOT	
setURIResolver	TokenNameIdentifier	 set URI Resolver
(	TokenNameLPAREN	
_uriresolver	TokenNameIdentifier	 uriresolver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
_xalanFactory	TokenNameIdentifier	 xalan Factory
.	TokenNameDOT	
newTransformerHandler	TokenNameIdentifier	 new Transformer Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a TransformerHandler object that can process SAX ContentHandler * events based on a transformer specified by the stylesheet Source. * Uses org.apache.xalan.processor.TransformerFactory. */	TokenNameCOMMENT_JAVADOC	 Get a TransformerHandler object that can process SAX ContentHandler events based on a transformer specified by the stylesheet Source. Uses org.apache.xalan.processor.TransformerFactory. 
public	TokenNamepublic	
TransformerHandler	TokenNameIdentifier	 Transformer Handler
newTransformerHandler	TokenNameIdentifier	 new Transformer Handler
(	TokenNameLPAREN	
Source	TokenNameIdentifier	 Source
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_xalanFactory	TokenNameIdentifier	 xalan Factory
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createXalanTransformerFactory	TokenNameIdentifier	 create Xalan Transformer Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_errorlistener	TokenNameIdentifier	 errorlistener
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_xalanFactory	TokenNameIdentifier	 xalan Factory
.	TokenNameDOT	
setErrorListener	TokenNameIdentifier	 set Error Listener
(	TokenNameLPAREN	
_errorlistener	TokenNameIdentifier	 errorlistener
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_uriresolver	TokenNameIdentifier	 uriresolver
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_xalanFactory	TokenNameIdentifier	 xalan Factory
.	TokenNameDOT	
setURIResolver	TokenNameIdentifier	 set URI Resolver
(	TokenNameLPAREN	
_uriresolver	TokenNameIdentifier	 uriresolver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
_xalanFactory	TokenNameIdentifier	 xalan Factory
.	TokenNameDOT	
newTransformerHandler	TokenNameIdentifier	 new Transformer Handler
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a TransformerHandler object that can process SAX ContentHandler * events based on a transformer specified by the stylesheet Source. * Uses org.apache.xalan.xsltc.trax.TransformerFactory. */	TokenNameCOMMENT_JAVADOC	 Get a TransformerHandler object that can process SAX ContentHandler events based on a transformer specified by the stylesheet Source. Uses org.apache.xalan.xsltc.trax.TransformerFactory. 
public	TokenNamepublic	
TransformerHandler	TokenNameIdentifier	 Transformer Handler
newTransformerHandler	TokenNameIdentifier	 new Transformer Handler
(	TokenNameLPAREN	
Templates	TokenNameIdentifier	 Templates
templates	TokenNameIdentifier	 templates
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_xsltcFactory	TokenNameIdentifier	 xsltc Factory
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createXSLTCTransformerFactory	TokenNameIdentifier	 create XSLTC Transformer Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_errorlistener	TokenNameIdentifier	 errorlistener
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_xsltcFactory	TokenNameIdentifier	 xsltc Factory
.	TokenNameDOT	
setErrorListener	TokenNameIdentifier	 set Error Listener
(	TokenNameLPAREN	
_errorlistener	TokenNameIdentifier	 errorlistener
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_uriresolver	TokenNameIdentifier	 uriresolver
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_xsltcFactory	TokenNameIdentifier	 xsltc Factory
.	TokenNameDOT	
setURIResolver	TokenNameIdentifier	 set URI Resolver
(	TokenNameLPAREN	
_uriresolver	TokenNameIdentifier	 uriresolver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
_xsltcFactory	TokenNameIdentifier	 xsltc Factory
.	TokenNameDOT	
newTransformerHandler	TokenNameIdentifier	 new Transformer Handler
(	TokenNameLPAREN	
templates	TokenNameIdentifier	 templates
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create an XMLFilter that uses the given source as the * transformation instructions. Uses * org.apache.xalan.xsltc.trax.TransformerFactory. */	TokenNameCOMMENT_JAVADOC	 Create an XMLFilter that uses the given source as the transformation instructions. Uses org.apache.xalan.xsltc.trax.TransformerFactory. 
public	TokenNamepublic	
XMLFilter	TokenNameIdentifier	 XML Filter
newXMLFilter	TokenNameIdentifier	 new XML Filter
(	TokenNameLPAREN	
Source	TokenNameIdentifier	 Source
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_xsltcFactory	TokenNameIdentifier	 xsltc Factory
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createXSLTCTransformerFactory	TokenNameIdentifier	 create XSLTC Transformer Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_errorlistener	TokenNameIdentifier	 errorlistener
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_xsltcFactory	TokenNameIdentifier	 xsltc Factory
.	TokenNameDOT	
setErrorListener	TokenNameIdentifier	 set Error Listener
(	TokenNameLPAREN	
_errorlistener	TokenNameIdentifier	 errorlistener
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_uriresolver	TokenNameIdentifier	 uriresolver
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_xsltcFactory	TokenNameIdentifier	 xsltc Factory
.	TokenNameDOT	
setURIResolver	TokenNameIdentifier	 set URI Resolver
(	TokenNameLPAREN	
_uriresolver	TokenNameIdentifier	 uriresolver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Templates	TokenNameIdentifier	 Templates
templates	TokenNameIdentifier	 templates
=	TokenNameEQUAL	
_xsltcFactory	TokenNameIdentifier	 xsltc Factory
.	TokenNameDOT	
newTemplates	TokenNameIdentifier	 new Templates
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
templates	TokenNameIdentifier	 templates
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newXMLFilter	TokenNameIdentifier	 new XML Filter
(	TokenNameLPAREN	
templates	TokenNameIdentifier	 templates
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Create an XMLFilter that uses the given source as the * transformation instructions. Uses * org.apache.xalan.xsltc.trax.TransformerFactory. */	TokenNameCOMMENT_BLOCK	 Create an XMLFilter that uses the given source as the transformation instructions. Uses org.apache.xalan.xsltc.trax.TransformerFactory. 
public	TokenNamepublic	
XMLFilter	TokenNameIdentifier	 XML Filter
newXMLFilter	TokenNameIdentifier	 new XML Filter
(	TokenNameLPAREN	
Templates	TokenNameIdentifier	 Templates
templates	TokenNameIdentifier	 templates
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
trax	TokenNameIdentifier	 trax
.	TokenNameDOT	
TrAXFilter	TokenNameIdentifier	 Tr AX Filter
(	TokenNameLPAREN	
templates	TokenNameIdentifier	 templates
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
e1	TokenNameIdentifier	 e1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_xsltcFactory	TokenNameIdentifier	 xsltc Factory
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createXSLTCTransformerFactory	TokenNameIdentifier	 create XSLTC Transformer Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ErrorListener	TokenNameIdentifier	 Error Listener
errorListener	TokenNameIdentifier	 error Listener
=	TokenNameEQUAL	
_xsltcFactory	TokenNameIdentifier	 xsltc Factory
.	TokenNameDOT	
getErrorListener	TokenNameIdentifier	 get Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
errorListener	TokenNameIdentifier	 error Listener
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
errorListener	TokenNameIdentifier	 error Listener
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
e1	TokenNameIdentifier	 e1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
e2	TokenNameIdentifier	 e2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
new	TokenNamenew	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
(	TokenNameLPAREN	
e2	TokenNameIdentifier	 e2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
throw	TokenNamethrow	
e1	TokenNameIdentifier	 e1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
