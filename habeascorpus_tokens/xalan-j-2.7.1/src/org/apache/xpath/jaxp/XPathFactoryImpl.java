/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
// $Id: XPathFactoryImpl.java 468655 2006-10-28 07:12:06Z minchau $ 	TokenNameCOMMENT_LINE	$Id: XPathFactoryImpl.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
jaxp	TokenNameIdentifier	 jaxp
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XSLMessages	TokenNameIdentifier	 XSL Messages
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
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathFactory	TokenNameIdentifier	 X Path Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathFactoryConfigurationException	TokenNameIdentifier	 X Path Factory Configuration Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathFunctionResolver	TokenNameIdentifier	 X Path Function Resolver
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathVariableResolver	TokenNameIdentifier	 X Path Variable Resolver
;	TokenNameSEMICOLON	
/** * The XPathFactory builds XPaths. * * @version $Revision$ * @author Ramesh Mandava */	TokenNameCOMMENT_JAVADOC	 The XPathFactory builds XPaths. * @version $Revision$ @author Ramesh Mandava 
public	TokenNamepublic	
class	TokenNameclass	
XPathFactoryImpl	TokenNameIdentifier	 X Path Factory Impl
extends	TokenNameextends	
XPathFactory	TokenNameIdentifier	 X Path Factory
{	TokenNameLBRACE	
/** * <p>Name of class as a constant to use for debugging.</p> */	TokenNameCOMMENT_JAVADOC	 <p>Name of class as a constant to use for debugging.</p> 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CLASS_NAME	TokenNameIdentifier	 CLASS  NAME
=	TokenNameEQUAL	
"XPathFactoryImpl"	TokenNameStringLiteral	XPathFactoryImpl
;	TokenNameSEMICOLON	
/** *<p>XPathFunctionResolver for this XPathFactory and created XPaths.</p> */	TokenNameCOMMENT_JAVADOC	 *<p>XPathFunctionResolver for this XPathFactory and created XPaths.</p> 
private	TokenNameprivate	
XPathFunctionResolver	TokenNameIdentifier	 X Path Function Resolver
xPathFunctionResolver	TokenNameIdentifier	 x Path Function Resolver
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * <p>XPathVariableResolver for this XPathFactory and created XPaths</p> */	TokenNameCOMMENT_JAVADOC	 <p>XPathVariableResolver for this XPathFactory and created XPaths</p> 
private	TokenNameprivate	
XPathVariableResolver	TokenNameIdentifier	 X Path Variable Resolver
xPathVariableResolver	TokenNameIdentifier	 x Path Variable Resolver
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
/** * <p>Is specified object model supported by this * <code>XPathFactory</code>?</p> * * @param objectModel Specifies the object model which the returned * <code>XPathFactory</code> will understand. * * @return <code>true</code> if <code>XPathFactory</code> supports * <code>objectModel</code>, else <code>false</code>. * * @throws NullPointerException If <code>objectModel</code> is <code>null</code>. * @throws IllegalArgumentException If <code>objectModel.length() == 0</code>. */	TokenNameCOMMENT_JAVADOC	 <p>Is specified object model supported by this <code>XPathFactory</code>?</p> * @param objectModel Specifies the object model which the returned <code>XPathFactory</code> will understand. * @return <code>true</code> if <code>XPathFactory</code> supports <code>objectModel</code>, else <code>false</code>. * @throws NullPointerException If <code>objectModel</code> is <code>null</code>. @throws IllegalArgumentException If <code>objectModel.length() == 0</code>. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isObjectModelSupported	TokenNameIdentifier	 is Object Model Supported
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
objectModel	TokenNameIdentifier	 object Model
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
objectModel	TokenNameIdentifier	 object Model
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
fmsg	TokenNameIdentifier	 fmsg
=	TokenNameEQUAL	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_OBJECT_MODEL_NULL	TokenNameIdentifier	 ER  OBJECT  MODEL  NULL
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
fmsg	TokenNameIdentifier	 fmsg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
objectModel	TokenNameIdentifier	 object Model
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
fmsg	TokenNameIdentifier	 fmsg
=	TokenNameEQUAL	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_OBJECT_MODEL_EMPTY	TokenNameIdentifier	 ER  OBJECT  MODEL  EMPTY
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
fmsg	TokenNameIdentifier	 fmsg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// know how to support default object model, W3C DOM 	TokenNameCOMMENT_LINE	know how to support default object model, W3C DOM 
if	TokenNameif	
(	TokenNameLPAREN	
objectModel	TokenNameIdentifier	 object Model
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
XPathFactory	TokenNameIdentifier	 X Path Factory
.	TokenNameDOT	
DEFAULT_OBJECT_MODEL_URI	TokenNameIdentifier	 DEFAULT  OBJECT  MODEL  URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// don't know how to support anything else 	TokenNameCOMMENT_LINE	don't know how to support anything else 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Returns a new <code>XPath</code> object using the underlying * object model determined when the factory was instantiated.</p> * * @return New <code>XPath</code> */	TokenNameCOMMENT_JAVADOC	 <p>Returns a new <code>XPath</code> object using the underlying object model determined when the factory was instantiated.</p> * @return New <code>XPath</code> 
public	TokenNamepublic	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPath	TokenNameIdentifier	 X Path
newXPath	TokenNameIdentifier	 new X Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
jaxp	TokenNameIdentifier	 jaxp
.	TokenNameDOT	
XPathImpl	TokenNameIdentifier	 X Path Impl
(	TokenNameLPAREN	
xPathVariableResolver	TokenNameIdentifier	 x Path Variable Resolver
,	TokenNameCOMMA	
xPathFunctionResolver	TokenNameIdentifier	 x Path Function Resolver
,	TokenNameCOMMA	
featureSecureProcessing	TokenNameIdentifier	 feature Secure Processing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Set a feature for this <code>XPathFactory</code> and * <code>XPath</code>s created by this factory.</p> * * <p> * Feature names are fully qualified {@link java.net.URI}s. * Implementations may define their own features. * An {@link XPathFactoryConfigurationException} is thrown if this * <code>XPathFactory</code> or the <code>XPath</code>s * it creates cannot support the feature. * It is possible for an <code>XPathFactory</code> to expose a feature * value but be unable to change its state. * </p> * * <p>See {@link javax.xml.xpath.XPathFactory} for full documentation * of specific features.</p> * * @param name Feature name. * @param value Is feature state <code>true</code> or <code>false</code>. * * @throws XPathFactoryConfigurationException if this * <code>XPathFactory</code> or the <code>XPath</code>s * it creates cannot support this feature. * @throws NullPointerException if <code>name</code> is * <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 <p>Set a feature for this <code>XPathFactory</code> and <code>XPath</code>s created by this factory.</p> * <p> Feature names are fully qualified {@link java.net.URI}s. Implementations may define their own features. An {@link XPathFactoryConfigurationException} is thrown if this <code>XPathFactory</code> or the <code>XPath</code>s it creates cannot support the feature. It is possible for an <code>XPathFactory</code> to expose a feature value but be unable to change its state. </p> * <p>See {@link javax.xml.xpath.XPathFactory} for full documentation of specific features.</p> * @param name Feature name. @param value Is feature state <code>true</code> or <code>false</code>. * @throws XPathFactoryConfigurationException if this <code>XPathFactory</code> or the <code>XPath</code>s it creates cannot support this feature. @throws NullPointerException if <code>name</code> is <code>null</code>. 
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
XPathFactoryConfigurationException	TokenNameIdentifier	 X Path Factory Configuration Exception
{	TokenNameLBRACE	
// feature name cannot be null 	TokenNameCOMMENT_LINE	feature name cannot be null 
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
fmsg	TokenNameIdentifier	 fmsg
=	TokenNameEQUAL	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_FEATURE_NAME_NULL	TokenNameIdentifier	 ER  FEATURE  NAME  NULL
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
CLASS_NAME	TokenNameIdentifier	 CLASS  NAME
,	TokenNameCOMMA	
new	TokenNamenew	
Boolean	TokenNameIdentifier	 Boolean
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
fmsg	TokenNameIdentifier	 fmsg
)	TokenNameRPAREN	
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
featureSecureProcessing	TokenNameIdentifier	 feature Secure Processing
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
// all done processing feature 	TokenNameCOMMENT_LINE	all done processing feature 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// unknown feature 	TokenNameCOMMENT_LINE	unknown feature 
String	TokenNameIdentifier	 String
fmsg	TokenNameIdentifier	 fmsg
=	TokenNameEQUAL	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_FEATURE_UNKNOWN	TokenNameIdentifier	 ER  FEATURE  UNKNOWN
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
CLASS_NAME	TokenNameIdentifier	 CLASS  NAME
,	TokenNameCOMMA	
new	TokenNamenew	
Boolean	TokenNameIdentifier	 Boolean
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
XPathFactoryConfigurationException	TokenNameIdentifier	 X Path Factory Configuration Exception
(	TokenNameLPAREN	
fmsg	TokenNameIdentifier	 fmsg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Get the state of the named feature.</p> * * <p> * Feature names are fully qualified {@link java.net.URI}s. * Implementations may define their own features. * An {@link XPathFactoryConfigurationException} is thrown if this * <code>XPathFactory</code> or the <code>XPath</code>s * it creates cannot support the feature. * It is possible for an <code>XPathFactory</code> to expose a feature * value but be unable to change its state. * </p> * * @param name Feature name. * * @return State of the named feature. * * @throws XPathFactoryConfigurationException if this * <code>XPathFactory</code> or the <code>XPath</code>s * it creates cannot support this feature. * @throws NullPointerException if <code>name</code> is * <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 <p>Get the state of the named feature.</p> * <p> Feature names are fully qualified {@link java.net.URI}s. Implementations may define their own features. An {@link XPathFactoryConfigurationException} is thrown if this <code>XPathFactory</code> or the <code>XPath</code>s it creates cannot support the feature. It is possible for an <code>XPathFactory</code> to expose a feature value but be unable to change its state. </p> * @param name Feature name. * @return State of the named feature. * @throws XPathFactoryConfigurationException if this <code>XPathFactory</code> or the <code>XPath</code>s it creates cannot support this feature. @throws NullPointerException if <code>name</code> is <code>null</code>. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getFeature	TokenNameIdentifier	 get Feature
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
XPathFactoryConfigurationException	TokenNameIdentifier	 X Path Factory Configuration Exception
{	TokenNameLBRACE	
// feature name cannot be null 	TokenNameCOMMENT_LINE	feature name cannot be null 
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
fmsg	TokenNameIdentifier	 fmsg
=	TokenNameEQUAL	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_GETTING_NULL_FEATURE	TokenNameIdentifier	 ER  GETTING  NULL  FEATURE
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
CLASS_NAME	TokenNameIdentifier	 CLASS  NAME
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
fmsg	TokenNameIdentifier	 fmsg
)	TokenNameRPAREN	
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
String	TokenNameIdentifier	 String
fmsg	TokenNameIdentifier	 fmsg
=	TokenNameEQUAL	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_GETTING_UNKNOWN_FEATURE	TokenNameIdentifier	 ER  GETTING  UNKNOWN  FEATURE
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
CLASS_NAME	TokenNameIdentifier	 CLASS  NAME
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
XPathFactoryConfigurationException	TokenNameIdentifier	 X Path Factory Configuration Exception
(	TokenNameLPAREN	
fmsg	TokenNameIdentifier	 fmsg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Establish a default function resolver.</p> * * <p>Any <code>XPath</code> objects constructed from this factory will use * the specified resolver by default.</p> * * <p>A <code>NullPointerException</code> is thrown if * <code>resolver</code> is <code>null</code>.</p> * * @param resolver XPath function resolver. * * @throws NullPointerException If <code>resolver</code> is * <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 <p>Establish a default function resolver.</p> * <p>Any <code>XPath</code> objects constructed from this factory will use the specified resolver by default.</p> * <p>A <code>NullPointerException</code> is thrown if <code>resolver</code> is <code>null</code>.</p> * @param resolver XPath function resolver. * @throws NullPointerException If <code>resolver</code> is <code>null</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
setXPathFunctionResolver	TokenNameIdentifier	 set X Path Function Resolver
(	TokenNameLPAREN	
XPathFunctionResolver	TokenNameIdentifier	 X Path Function Resolver
resolver	TokenNameIdentifier	 resolver
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// resolver cannot be null 	TokenNameCOMMENT_LINE	resolver cannot be null 
if	TokenNameif	
(	TokenNameLPAREN	
resolver	TokenNameIdentifier	 resolver
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
fmsg	TokenNameIdentifier	 fmsg
=	TokenNameEQUAL	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_NULL_XPATH_FUNCTION_RESOLVER	TokenNameIdentifier	 ER  NULL  XPATH  FUNCTION  RESOLVER
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
CLASS_NAME	TokenNameIdentifier	 CLASS  NAME
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
fmsg	TokenNameIdentifier	 fmsg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
xPathFunctionResolver	TokenNameIdentifier	 x Path Function Resolver
=	TokenNameEQUAL	
resolver	TokenNameIdentifier	 resolver
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Establish a default variable resolver.</p> * * <p>Any <code>XPath</code> objects constructed from this factory will use * the specified resolver by default.</p> * * <p>A <code>NullPointerException</code> is thrown if <code>resolver</code> is <code>null</code>.</p> * * @param resolver Variable resolver. * * @throws NullPointerException If <code>resolver</code> is * <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 <p>Establish a default variable resolver.</p> * <p>Any <code>XPath</code> objects constructed from this factory will use the specified resolver by default.</p> * <p>A <code>NullPointerException</code> is thrown if <code>resolver</code> is <code>null</code>.</p> * @param resolver Variable resolver. * @throws NullPointerException If <code>resolver</code> is <code>null</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
setXPathVariableResolver	TokenNameIdentifier	 set X Path Variable Resolver
(	TokenNameLPAREN	
XPathVariableResolver	TokenNameIdentifier	 X Path Variable Resolver
resolver	TokenNameIdentifier	 resolver
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// resolver cannot be null 	TokenNameCOMMENT_LINE	resolver cannot be null 
if	TokenNameif	
(	TokenNameLPAREN	
resolver	TokenNameIdentifier	 resolver
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
fmsg	TokenNameIdentifier	 fmsg
=	TokenNameEQUAL	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_NULL_XPATH_VARIABLE_RESOLVER	TokenNameIdentifier	 ER  NULL  XPATH  VARIABLE  RESOLVER
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
CLASS_NAME	TokenNameIdentifier	 CLASS  NAME
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
fmsg	TokenNameIdentifier	 fmsg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
xPathVariableResolver	TokenNameIdentifier	 x Path Variable Resolver
=	TokenNameEQUAL	
resolver	TokenNameIdentifier	 resolver
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
