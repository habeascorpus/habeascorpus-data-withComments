/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: OutputProperties.java 468643 2006-10-28 06:56:03Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: OutputProperties.java 468643 2006-10-28 06:56:03Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
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
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
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
OutputPropertiesFactory	TokenNameIdentifier	 Output Properties Factory
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
OutputPropertyUtils	TokenNameIdentifier	 Output Property Utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
QName	TokenNameIdentifier	 Q Name
;	TokenNameSEMICOLON	
/** * This class provides information from xsl:output elements. It is mainly * a wrapper for {@link java.util.Properties}, but can not extend that class * because it must be part of the {@link org.apache.xalan.templates.ElemTemplateElement} * heararchy. * <p>An OutputProperties list can contain another OutputProperties list as * its "defaults"; this second property list is searched if the property key * is not found in the original property list.</p> * @see <a href="http://www.w3.org/TR/xslt#dtd">XSLT DTD</a> * @see <a href="http://www.w3.org/TR/xslt#output">xsl:output in XSLT Specification</a> * */	TokenNameCOMMENT_JAVADOC	 This class provides information from xsl:output elements. It is mainly a wrapper for {@link java.util.Properties}, but can not extend that class because it must be part of the {@link org.apache.xalan.templates.ElemTemplateElement} heararchy. <p>An OutputProperties list can contain another OutputProperties list as its "defaults"; this second property list is searched if the property key is not found in the original property list.</p> @see <a href="http://www.w3.org/TR/xslt#dtd">XSLT DTD</a> @see <a href="http://www.w3.org/TR/xslt#output">xsl:output in XSLT Specification</a> 
public	TokenNamepublic	
class	TokenNameclass	
OutputProperties	TokenNameIdentifier	 Output Properties
extends	TokenNameextends	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
6975274363881785488L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Creates an empty OutputProperties with no default values. */	TokenNameCOMMENT_JAVADOC	 Creates an empty OutputProperties with no default values. 
public	TokenNamepublic	
OutputProperties	TokenNameIdentifier	 Output Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
Method	TokenNameIdentifier	 Method
.	TokenNameDOT	
XML	TokenNameIdentifier	 XML
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates an empty OutputProperties with the specified defaults. * * @param defaults the defaults. */	TokenNameCOMMENT_JAVADOC	 Creates an empty OutputProperties with the specified defaults. * @param defaults the defaults. 
public	TokenNamepublic	
OutputProperties	TokenNameIdentifier	 Output Properties
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
defaults	TokenNameIdentifier	 defaults
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_properties	TokenNameIdentifier	 m properties
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
defaults	TokenNameIdentifier	 defaults
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates an empty OutputProperties with the defaults specified by * a property file. The method argument is used to construct a string of * the form output_[method].properties (for instance, output_html.properties). * The output_xml.properties file is always used as the base. * <p>At the moment, anything other than 'text', 'xml', and 'html', will * use the output_xml.properties file.</p> * * @param method non-null reference to method name. */	TokenNameCOMMENT_JAVADOC	 Creates an empty OutputProperties with the defaults specified by a property file. The method argument is used to construct a string of the form output_[method].properties (for instance, output_html.properties). The output_xml.properties file is always used as the base. <p>At the moment, anything other than 'text', 'xml', and 'html', will use the output_xml.properties file.</p> * @param method non-null reference to method name. 
public	TokenNamepublic	
OutputProperties	TokenNameIdentifier	 Output Properties
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
method	TokenNameIdentifier	 method
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_properties	TokenNameIdentifier	 m properties
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
OutputPropertiesFactory	TokenNameIdentifier	 Output Properties Factory
.	TokenNameDOT	
getDefaultMethodProperties	TokenNameIdentifier	 get Default Method Properties
(	TokenNameLPAREN	
method	TokenNameIdentifier	 method
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Clone this OutputProperties, including a clone of the wrapped Properties * reference. * * @return A new OutputProperties reference, mutation of which should not * effect this object. */	TokenNameCOMMENT_JAVADOC	 Clone this OutputProperties, including a clone of the wrapped Properties reference. * @return A new OutputProperties reference, mutation of which should not effect this object. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
OutputProperties	TokenNameIdentifier	 Output Properties
cloned	TokenNameIdentifier	 cloned
=	TokenNameEQUAL	
(	TokenNameLPAREN	
OutputProperties	TokenNameIdentifier	 Output Properties
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cloned	TokenNameIdentifier	 cloned
.	TokenNameDOT	
m_properties	TokenNameIdentifier	 m properties
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
)	TokenNameRPAREN	
cloned	TokenNameIdentifier	 cloned
.	TokenNameDOT	
m_properties	TokenNameIdentifier	 m properties
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cloned	TokenNameIdentifier	 cloned
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Set an output property. * * @param key the key to be placed into the property list. * @param value the value corresponding to <tt>key</tt>. * @see javax.xml.transform.OutputKeys */	TokenNameCOMMENT_JAVADOC	 Set an output property. * @param key the key to be placed into the property list. @param value the value corresponding to <tt>key</tt>. @see javax.xml.transform.OutputKeys 
public	TokenNamepublic	
void	TokenNamevoid	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
toNamespacedString	TokenNameIdentifier	 to Namespaced String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set an output property. * * @param key the key to be placed into the property list. * @param value the value corresponding to <tt>key</tt>. * @see javax.xml.transform.OutputKeys */	TokenNameCOMMENT_JAVADOC	 Set an output property. * @param key the key to be placed into the property list. @param value the value corresponding to <tt>key</tt>. @see javax.xml.transform.OutputKeys 
public	TokenNamepublic	
void	TokenNamevoid	
setProperty	TokenNameIdentifier	 set Property
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
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
METHOD	TokenNameIdentifier	 METHOD
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setMethodDefaults	TokenNameIdentifier	 set Method Defaults
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
OutputPropertiesFactory	TokenNameIdentifier	 Output Properties Factory
.	TokenNameDOT	
S_BUILTIN_OLD_EXTENSIONS_UNIVERSAL	TokenNameIdentifier	 S  BUILTIN  OLD  EXTENSIONS  UNIVERSAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
OutputPropertiesFactory	TokenNameIdentifier	 Output Properties Factory
.	TokenNameDOT	
S_BUILTIN_EXTENSIONS_UNIVERSAL	TokenNameIdentifier	 S  BUILTIN  EXTENSIONS  UNIVERSAL
+	TokenNamePLUS	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
OutputPropertiesFactory	TokenNameIdentifier	 Output Properties Factory
.	TokenNameDOT	
S_BUILTIN_OLD_EXTENSIONS_UNIVERSAL_LEN	TokenNameIdentifier	 S  BUILTIN  OLD  EXTENSIONS  UNIVERSAL  LEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_properties	TokenNameIdentifier	 m properties
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Searches for the property with the specified key in the property list. * If the key is not found in this property list, the default property list, * and its defaults, recursively, are then checked. The method returns * <code>null</code> if the property is not found. * * @param key the property key. * @return the value in this property list with the specified key value. */	TokenNameCOMMENT_JAVADOC	 Searches for the property with the specified key in the property list. If the key is not found in this property list, the default property list, and its defaults, recursively, are then checked. The method returns <code>null</code> if the property is not found. * @param key the property key. @return the value in this property list with the specified key value. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_properties	TokenNameIdentifier	 m properties
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
toNamespacedString	TokenNameIdentifier	 to Namespaced String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Searches for the property with the specified key in the property list. * If the key is not found in this property list, the default property list, * and its defaults, recursively, are then checked. The method returns * <code>null</code> if the property is not found. * * @param key the property key. * @return the value in this property list with the specified key value. */	TokenNameCOMMENT_JAVADOC	 Searches for the property with the specified key in the property list. If the key is not found in this property list, the default property list, and its defaults, recursively, are then checked. The method returns <code>null</code> if the property is not found. * @param key the property key. @return the value in this property list with the specified key value. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
OutputPropertiesFactory	TokenNameIdentifier	 Output Properties Factory
.	TokenNameDOT	
S_BUILTIN_OLD_EXTENSIONS_UNIVERSAL	TokenNameIdentifier	 S  BUILTIN  OLD  EXTENSIONS  UNIVERSAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
OutputPropertiesFactory	TokenNameIdentifier	 Output Properties Factory
.	TokenNameDOT	
S_BUILTIN_EXTENSIONS_UNIVERSAL	TokenNameIdentifier	 S  BUILTIN  EXTENSIONS  UNIVERSAL
+	TokenNamePLUS	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
OutputPropertiesFactory	TokenNameIdentifier	 Output Properties Factory
.	TokenNameDOT	
S_BUILTIN_OLD_EXTENSIONS_UNIVERSAL_LEN	TokenNameIdentifier	 S  BUILTIN  OLD  EXTENSIONS  UNIVERSAL  LEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
m_properties	TokenNameIdentifier	 m properties
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set an output property. * * @param key the key to be placed into the property list. * @param value the value corresponding to <tt>key</tt>. * @see javax.xml.transform.OutputKeys */	TokenNameCOMMENT_JAVADOC	 Set an output property. * @param key the key to be placed into the property list. @param value the value corresponding to <tt>key</tt>. @see javax.xml.transform.OutputKeys 
public	TokenNamepublic	
void	TokenNamevoid	
setBooleanProperty	TokenNameIdentifier	 set Boolean Property
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
boolean	TokenNameboolean	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_properties	TokenNameIdentifier	 m properties
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
toNamespacedString	TokenNameIdentifier	 to Namespaced String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
?	TokenNameQUESTION	
"yes"	TokenNameStringLiteral	yes
:	TokenNameCOLON	
"no"	TokenNameStringLiteral	no
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set an output property. * * @param key the key to be placed into the property list. * @param value the value corresponding to <tt>key</tt>. * @see javax.xml.transform.OutputKeys */	TokenNameCOMMENT_JAVADOC	 Set an output property. * @param key the key to be placed into the property list. @param value the value corresponding to <tt>key</tt>. @see javax.xml.transform.OutputKeys 
public	TokenNamepublic	
void	TokenNamevoid	
setBooleanProperty	TokenNameIdentifier	 set Boolean Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
boolean	TokenNameboolean	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_properties	TokenNameIdentifier	 m properties
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
?	TokenNameQUESTION	
"yes"	TokenNameStringLiteral	yes
:	TokenNameCOLON	
"no"	TokenNameStringLiteral	no
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Searches for the boolean property with the specified key in the property list. * If the key is not found in this property list, the default property list, * and its defaults, recursively, are then checked. The method returns * <code>false</code> if the property is not found, or if the value is other * than "yes". * * @param key the property key. * @return the value in this property list as a boolean value, or false * if null or not "yes". */	TokenNameCOMMENT_JAVADOC	 Searches for the boolean property with the specified key in the property list. If the key is not found in this property list, the default property list, and its defaults, recursively, are then checked. The method returns <code>false</code> if the property is not found, or if the value is other than "yes". * @param key the property key. @return the value in this property list as a boolean value, or false if null or not "yes". 
public	TokenNamepublic	
boolean	TokenNameboolean	
getBooleanProperty	TokenNameIdentifier	 get Boolean Property
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getBooleanProperty	TokenNameIdentifier	 get Boolean Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
toNamespacedString	TokenNameIdentifier	 to Namespaced String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Searches for the boolean property with the specified key in the property list. * If the key is not found in this property list, the default property list, * and its defaults, recursively, are then checked. The method returns * <code>false</code> if the property is not found, or if the value is other * than "yes". * * @param key the property key. * @return the value in this property list as a boolean value, or false * if null or not "yes". */	TokenNameCOMMENT_JAVADOC	 Searches for the boolean property with the specified key in the property list. If the key is not found in this property list, the default property list, and its defaults, recursively, are then checked. The method returns <code>false</code> if the property is not found, or if the value is other than "yes". * @param key the property key. @return the value in this property list as a boolean value, or false if null or not "yes". 
public	TokenNamepublic	
boolean	TokenNameboolean	
getBooleanProperty	TokenNameIdentifier	 get Boolean Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
OutputPropertyUtils	TokenNameIdentifier	 Output Property Utils
.	TokenNameDOT	
getBooleanProperty	TokenNameIdentifier	 get Boolean Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
m_properties	TokenNameIdentifier	 m properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set an output property. * * @param key the key to be placed into the property list. * @param value the value corresponding to <tt>key</tt>. * @see javax.xml.transform.OutputKeys */	TokenNameCOMMENT_JAVADOC	 Set an output property. * @param key the key to be placed into the property list. @param value the value corresponding to <tt>key</tt>. @see javax.xml.transform.OutputKeys 
public	TokenNamepublic	
void	TokenNamevoid	
setIntProperty	TokenNameIdentifier	 set Int Property
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
int	TokenNameint	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setIntProperty	TokenNameIdentifier	 set Int Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
toNamespacedString	TokenNameIdentifier	 to Namespaced String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set an output property. * * @param key the key to be placed into the property list. * @param value the value corresponding to <tt>key</tt>. * @see javax.xml.transform.OutputKeys */	TokenNameCOMMENT_JAVADOC	 Set an output property. * @param key the key to be placed into the property list. @param value the value corresponding to <tt>key</tt>. @see javax.xml.transform.OutputKeys 
public	TokenNamepublic	
void	TokenNamevoid	
setIntProperty	TokenNameIdentifier	 set Int Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
int	TokenNameint	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_properties	TokenNameIdentifier	 m properties
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Searches for the int property with the specified key in the property list. * If the key is not found in this property list, the default property list, * and its defaults, recursively, are then checked. The method returns * <code>false</code> if the property is not found, or if the value is other * than "yes". * * @param key the property key. * @return the value in this property list as a int value, or false * if null or not a number. */	TokenNameCOMMENT_JAVADOC	 Searches for the int property with the specified key in the property list. If the key is not found in this property list, the default property list, and its defaults, recursively, are then checked. The method returns <code>false</code> if the property is not found, or if the value is other than "yes". * @param key the property key. @return the value in this property list as a int value, or false if null or not a number. 
public	TokenNamepublic	
int	TokenNameint	
getIntProperty	TokenNameIdentifier	 get Int Property
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getIntProperty	TokenNameIdentifier	 get Int Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
toNamespacedString	TokenNameIdentifier	 to Namespaced String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Searches for the int property with the specified key in the property list. * If the key is not found in this property list, the default property list, * and its defaults, recursively, are then checked. The method returns * <code>false</code> if the property is not found, or if the value is other * than "yes". * * @param key the property key. * @return the value in this property list as a int value, or false * if null or not a number. */	TokenNameCOMMENT_JAVADOC	 Searches for the int property with the specified key in the property list. If the key is not found in this property list, the default property list, and its defaults, recursively, are then checked. The method returns <code>false</code> if the property is not found, or if the value is other than "yes". * @param key the property key. @return the value in this property list as a int value, or false if null or not a number. 
public	TokenNamepublic	
int	TokenNameint	
getIntProperty	TokenNameIdentifier	 get Int Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
OutputPropertyUtils	TokenNameIdentifier	 Output Property Utils
.	TokenNameDOT	
getIntProperty	TokenNameIdentifier	 get Int Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
m_properties	TokenNameIdentifier	 m properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set an output property with a QName value. The QName will be turned * into a string with the namespace in curly brackets. * * @param key the key to be placed into the property list. * @param value the value corresponding to <tt>key</tt>. * @see javax.xml.transform.OutputKeys */	TokenNameCOMMENT_JAVADOC	 Set an output property with a QName value. The QName will be turned into a string with the namespace in curly brackets. * @param key the key to be placed into the property list. @param value the value corresponding to <tt>key</tt>. @see javax.xml.transform.OutputKeys 
public	TokenNamepublic	
void	TokenNamevoid	
setQNameProperty	TokenNameIdentifier	 set Q Name Property
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
QName	TokenNameIdentifier	 Q Name
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setQNameProperty	TokenNameIdentifier	 set Q Name Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
toNamespacedString	TokenNameIdentifier	 to Namespaced String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reset the default properties based on the method. * * @param method the method value. * @see javax.xml.transform.OutputKeys */	TokenNameCOMMENT_JAVADOC	 Reset the default properties based on the method. * @param method the method value. @see javax.xml.transform.OutputKeys 
public	TokenNamepublic	
void	TokenNamevoid	
setMethodDefaults	TokenNameIdentifier	 set Method Defaults
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
method	TokenNameIdentifier	 method
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
defaultMethod	TokenNameIdentifier	 default Method
=	TokenNameEQUAL	
m_properties	TokenNameIdentifier	 m properties
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
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
defaultMethod	TokenNameIdentifier	 default Method
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
defaultMethod	TokenNameIdentifier	 default Method
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
method	TokenNameIdentifier	 method
)	TokenNameRPAREN	
// bjm - add the next condition as a hack 	TokenNameCOMMENT_LINE	bjm - add the next condition as a hack 
// but it is because both output_xml.properties and 	TokenNameCOMMENT_LINE	but it is because both output_xml.properties and 
// output_unknown.properties have the same method=xml 	TokenNameCOMMENT_LINE	output_unknown.properties have the same method=xml 
// for their default. Otherwise we end up with 	TokenNameCOMMENT_LINE	for their default. Otherwise we end up with 
// a ToUnknownStream wraping a ToXMLStream even 	TokenNameCOMMENT_LINE	a ToUnknownStream wraping a ToXMLStream even 
// when the users says method="xml" 	TokenNameCOMMENT_LINE	when the users says method="xml" 
// 	TokenNameCOMMENT_LINE	 
||	TokenNameOR_OR	
defaultMethod	TokenNameIdentifier	 default Method
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xml"	TokenNameStringLiteral	xml
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Properties	TokenNameIdentifier	 Properties
savedProps	TokenNameIdentifier	 saved Props
=	TokenNameEQUAL	
m_properties	TokenNameIdentifier	 m properties
;	TokenNameSEMICOLON	
Properties	TokenNameIdentifier	 Properties
newDefaults	TokenNameIdentifier	 new Defaults
=	TokenNameEQUAL	
OutputPropertiesFactory	TokenNameIdentifier	 Output Properties Factory
.	TokenNameDOT	
getDefaultMethodProperties	TokenNameIdentifier	 get Default Method Properties
(	TokenNameLPAREN	
method	TokenNameIdentifier	 method
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_properties	TokenNameIdentifier	 m properties
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
newDefaults	TokenNameIdentifier	 new Defaults
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
copyFrom	TokenNameIdentifier	 copy From
(	TokenNameLPAREN	
savedProps	TokenNameIdentifier	 saved Props
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Set an output property with a QName value. The QName will be turned * into a string with the namespace in curly brackets. * * @param key the key to be placed into the property list. * @param value the value corresponding to <tt>key</tt>. * @see javax.xml.transform.OutputKeys */	TokenNameCOMMENT_JAVADOC	 Set an output property with a QName value. The QName will be turned into a string with the namespace in curly brackets. * @param key the key to be placed into the property list. @param value the value corresponding to <tt>key</tt>. @see javax.xml.transform.OutputKeys 
public	TokenNamepublic	
void	TokenNamevoid	
setQNameProperty	TokenNameIdentifier	 set Q Name Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
QName	TokenNameIdentifier	 Q Name
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
toNamespacedString	TokenNameIdentifier	 to Namespaced String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Searches for the qname property with the specified key in the property list. * If the key is not found in this property list, the default property list, * and its defaults, recursively, are then checked. The method returns * <code>null</code> if the property is not found. * * @param key the property key. * @return the value in this property list as a QName value, or false * if null or not "yes". */	TokenNameCOMMENT_JAVADOC	 Searches for the qname property with the specified key in the property list. If the key is not found in this property list, the default property list, and its defaults, recursively, are then checked. The method returns <code>null</code> if the property is not found. * @param key the property key. @return the value in this property list as a QName value, or false if null or not "yes". 
public	TokenNamepublic	
QName	TokenNameIdentifier	 Q Name
getQNameProperty	TokenNameIdentifier	 get Q Name Property
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getQNameProperty	TokenNameIdentifier	 get Q Name Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
toNamespacedString	TokenNameIdentifier	 to Namespaced String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Searches for the qname property with the specified key in the property list. * If the key is not found in this property list, the default property list, * and its defaults, recursively, are then checked. The method returns * <code>null</code> if the property is not found. * * @param key the property key. * @return the value in this property list as a QName value, or false * if null or not "yes". */	TokenNameCOMMENT_JAVADOC	 Searches for the qname property with the specified key in the property list. If the key is not found in this property list, the default property list, and its defaults, recursively, are then checked. The method returns <code>null</code> if the property is not found. * @param key the property key. @return the value in this property list as a QName value, or false if null or not "yes". 
public	TokenNamepublic	
QName	TokenNameIdentifier	 Q Name
getQNameProperty	TokenNameIdentifier	 get Q Name Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getQNameProperty	TokenNameIdentifier	 get Q Name Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
m_properties	TokenNameIdentifier	 m properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Searches for the qname property with the specified key in the property list. * If the key is not found in this property list, the default property list, * and its defaults, recursively, are then checked. The method returns * <code>null</code> if the property is not found. * * @param key the property key. * @param props the list of properties to search in. * @return the value in this property list as a QName value, or false * if null or not "yes". */	TokenNameCOMMENT_JAVADOC	 Searches for the qname property with the specified key in the property list. If the key is not found in this property list, the default property list, and its defaults, recursively, are then checked. The method returns <code>null</code> if the property is not found. * @param key the property key. @param props the list of properties to search in. @return the value in this property list as a QName value, or false if null or not "yes". 
public	TokenNamepublic	
static	TokenNamestatic	
QName	TokenNameIdentifier	 Q Name
getQNameProperty	TokenNameIdentifier	 get Q Name Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
return	TokenNamereturn	
QName	TokenNameIdentifier	 Q Name
.	TokenNameDOT	
getQNameFromString	TokenNameIdentifier	 get Q Name From String
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set an output property with a QName list value. The QNames will be turned * into strings with the namespace in curly brackets. * * @param key the key to be placed into the property list. * @param v non-null list of QNames corresponding to <tt>key</tt>. * @see javax.xml.transform.OutputKeys */	TokenNameCOMMENT_JAVADOC	 Set an output property with a QName list value. The QNames will be turned into strings with the namespace in curly brackets. * @param key the key to be placed into the property list. @param v non-null list of QNames corresponding to <tt>key</tt>. @see javax.xml.transform.OutputKeys 
public	TokenNamepublic	
void	TokenNamevoid	
setQNameProperties	TokenNameIdentifier	 set Q Name Properties
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setQNameProperties	TokenNameIdentifier	 set Q Name Properties
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
toNamespacedString	TokenNameIdentifier	 to Namespaced String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set an output property with a QName list value. The QNames will be turned * into strings with the namespace in curly brackets. * * @param key the key to be placed into the property list. * @param v non-null list of QNames corresponding to <tt>key</tt>. * @see javax.xml.transform.OutputKeys */	TokenNameCOMMENT_JAVADOC	 Set an output property with a QName list value. The QNames will be turned into strings with the namespace in curly brackets. * @param key the key to be placed into the property list. @param v non-null list of QNames corresponding to <tt>key</tt>. @see javax.xml.transform.OutputKeys 
public	TokenNamepublic	
void	TokenNamevoid	
setQNameProperties	TokenNameIdentifier	 set Q Name Properties
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Just an initial guess at reasonable tuning parameters 	TokenNameCOMMENT_LINE	Just an initial guess at reasonable tuning parameters 
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
fsb	TokenNameIdentifier	 fsb
=	TokenNameEQUAL	
new	TokenNamenew	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
(	TokenNameLPAREN	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
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
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
QName	TokenNameIdentifier	 Q Name
qname	TokenNameIdentifier	 qname
=	TokenNameEQUAL	
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fsb	TokenNameIdentifier	 fsb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
toNamespacedString	TokenNameIdentifier	 to Namespaced String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Don't append space after last value 	TokenNameCOMMENT_LINE	Don't append space after last value 
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
s	TokenNameIdentifier	 s
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
fsb	TokenNameIdentifier	 fsb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_properties	TokenNameIdentifier	 m properties
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
fsb	TokenNameIdentifier	 fsb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Searches for the list of qname properties with the specified key in * the property list. * If the key is not found in this property list, the default property list, * and its defaults, recursively, are then checked. The method returns * <code>null</code> if the property is not found. * * @param key the property key. * @return the value in this property list as a vector of QNames, or false * if null or not "yes". */	TokenNameCOMMENT_JAVADOC	 Searches for the list of qname properties with the specified key in the property list. If the key is not found in this property list, the default property list, and its defaults, recursively, are then checked. The method returns <code>null</code> if the property is not found. * @param key the property key. @return the value in this property list as a vector of QNames, or false if null or not "yes". 
public	TokenNamepublic	
Vector	TokenNameIdentifier	 Vector
getQNameProperties	TokenNameIdentifier	 get Q Name Properties
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getQNameProperties	TokenNameIdentifier	 get Q Name Properties
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
toNamespacedString	TokenNameIdentifier	 to Namespaced String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Searches for the list of qname properties with the specified key in * the property list. * If the key is not found in this property list, the default property list, * and its defaults, recursively, are then checked. The method returns * <code>null</code> if the property is not found. * * @param key the property key. * @return the value in this property list as a vector of QNames, or false * if null or not "yes". */	TokenNameCOMMENT_JAVADOC	 Searches for the list of qname properties with the specified key in the property list. If the key is not found in this property list, the default property list, and its defaults, recursively, are then checked. The method returns <code>null</code> if the property is not found. * @param key the property key. @return the value in this property list as a vector of QNames, or false if null or not "yes". 
public	TokenNamepublic	
Vector	TokenNameIdentifier	 Vector
getQNameProperties	TokenNameIdentifier	 get Q Name Properties
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getQNameProperties	TokenNameIdentifier	 get Q Name Properties
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
m_properties	TokenNameIdentifier	 m properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Searches for the list of qname properties with the specified key in * the property list. * If the key is not found in this property list, the default property list, * and its defaults, recursively, are then checked. The method returns * <code>null</code> if the property is not found. * * @param key the property key. * @param props the list of properties to search in. * @return the value in this property list as a vector of QNames, or false * if null or not "yes". */	TokenNameCOMMENT_JAVADOC	 Searches for the list of qname properties with the specified key in the property list. If the key is not found in this property list, the default property list, and its defaults, recursively, are then checked. The method returns <code>null</code> if the property is not found. * @param key the property key. @param props the list of properties to search in. @return the value in this property list as a vector of QNames, or false if null or not "yes". 
public	TokenNamepublic	
static	TokenNamestatic	
Vector	TokenNameIdentifier	 Vector
getQNameProperties	TokenNameIdentifier	 get Q Name Properties
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Vector	TokenNameIdentifier	 Vector
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
inCurly	TokenNameIdentifier	 in Curly
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// parse through string, breaking on whitespaces. I do this instead 	TokenNameCOMMENT_LINE	parse through string, breaking on whitespaces. I do this instead 
// of a tokenizer so I can track whitespace inside of curly brackets, 	TokenNameCOMMENT_LINE	of a tokenizer so I can track whitespace inside of curly brackets, 
// which theoretically shouldn't happen if they contain legal URLs. 	TokenNameCOMMENT_LINE	which theoretically shouldn't happen if they contain legal URLs. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isWhitespace	TokenNameIdentifier	 is Whitespace
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
inCurly	TokenNameIdentifier	 in Curly
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
QName	TokenNameIdentifier	 Q Name
qname	TokenNameIdentifier	 qname
=	TokenNameEQUAL	
QName	TokenNameIdentifier	 Q Name
.	TokenNameDOT	
getQNameFromString	TokenNameIdentifier	 get Q Name From String
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
'{'	TokenNameCharacterLiteral	
==	TokenNameEQUAL_EQUAL	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
inCurly	TokenNameIdentifier	 in Curly
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
'}'	TokenNameCharacterLiteral	
==	TokenNameEQUAL_EQUAL	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
inCurly	TokenNameIdentifier	 in Curly
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
QName	TokenNameIdentifier	 Q Name
qname	TokenNameIdentifier	 qname
=	TokenNameEQUAL	
QName	TokenNameIdentifier	 Q Name
.	TokenNameDOT	
getQNameFromString	TokenNameIdentifier	 get Q Name From String
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This function is called to recompose all of the output format extended elements. * * @param root non-null reference to the stylesheet root object. */	TokenNameCOMMENT_JAVADOC	 This function is called to recompose all of the output format extended elements. * @param root non-null reference to the stylesheet root object. 
public	TokenNamepublic	
void	TokenNamevoid	
recompose	TokenNameIdentifier	 recompose
(	TokenNameLPAREN	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
recomposeOutput	TokenNameIdentifier	 recompose Output
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This function is called after everything else has been * recomposed, and allows the template to set remaining * values that may be based on some other property that * depends on recomposition. */	TokenNameCOMMENT_JAVADOC	 This function is called after everything else has been recomposed, and allows the template to set remaining values that may be based on some other property that depends on recomposition. 
public	TokenNamepublic	
void	TokenNamevoid	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
sroot	TokenNameIdentifier	 sroot
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
sroot	TokenNameIdentifier	 sroot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the Properties object that this class wraps. * * @return non-null reference to Properties object. */	TokenNameCOMMENT_JAVADOC	 Get the Properties object that this class wraps. * @return non-null reference to Properties object. 
public	TokenNamepublic	
Properties	TokenNameIdentifier	 Properties
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_properties	TokenNameIdentifier	 m properties
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Copy the keys and values from the source to this object. This will * not copy the default values. This is meant to be used by going from * a higher precedence object to a lower precedence object, so that if a * key already exists, this method will not reset it. * * @param src non-null reference to the source properties. */	TokenNameCOMMENT_JAVADOC	 Copy the keys and values from the source to this object. This will not copy the default values. This is meant to be used by going from a higher precedence object to a lower precedence object, so that if a key already exists, this method will not reset it. * @param src non-null reference to the source properties. 
public	TokenNamepublic	
void	TokenNamevoid	
copyFrom	TokenNameIdentifier	 copy From
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
{	TokenNameLBRACE	
copyFrom	TokenNameIdentifier	 copy From
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Copy the keys and values from the source to this object. This will * not copy the default values. This is meant to be used by going from * a higher precedence object to a lower precedence object, so that if a * key already exists, this method will not reset it. * * @param src non-null reference to the source properties. * @param shouldResetDefaults true if the defaults should be reset based on * the method property. */	TokenNameCOMMENT_JAVADOC	 Copy the keys and values from the source to this object. This will not copy the default values. This is meant to be used by going from a higher precedence object to a lower precedence object, so that if a key already exists, this method will not reset it. * @param src non-null reference to the source properties. @param shouldResetDefaults true if the defaults should be reset based on the method property. 
public	TokenNamepublic	
void	TokenNamevoid	
copyFrom	TokenNameIdentifier	 copy From
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
boolean	TokenNameboolean	
shouldResetDefaults	TokenNameIdentifier	 should Reset Defaults
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Enumeration	TokenNameIdentifier	 Enumeration
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isLegalPropertyKey	TokenNameIdentifier	 is Legal Property Key
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_OUTPUT_PROPERTY_NOT_RECOGNIZED	TokenNameIdentifier	 ER  OUTPUT  PROPERTY  NOT  RECOGNIZED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
key	TokenNameIdentifier	 key
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"output property not recognized: " 	TokenNameCOMMENT_LINE	"output property not recognized: " 
Object	TokenNameIdentifier	 Object
oldValue	TokenNameIdentifier	 old Value
=	TokenNameEQUAL	
m_properties	TokenNameIdentifier	 m properties
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
oldValue	TokenNameIdentifier	 old Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
shouldResetDefaults	TokenNameIdentifier	 should Reset Defaults
&&	TokenNameAND_AND	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
METHOD	TokenNameIdentifier	 METHOD
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setMethodDefaults	TokenNameIdentifier	 set Method Defaults
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_properties	TokenNameIdentifier	 m properties
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
CDATA_SECTION_ELEMENTS	TokenNameIdentifier	 CDATA  SECTION  ELEMENTS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_properties	TokenNameIdentifier	 m properties
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
oldValue	TokenNameIdentifier	 old Value
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Copy the keys and values from the source to this object. This will * not copy the default values. This is meant to be used by going from * a higher precedence object to a lower precedence object, so that if a * key already exists, this method will not reset it. * * @param opsrc non-null reference to an OutputProperties. */	TokenNameCOMMENT_JAVADOC	 Copy the keys and values from the source to this object. This will not copy the default values. This is meant to be used by going from a higher precedence object to a lower precedence object, so that if a key already exists, this method will not reset it. * @param opsrc non-null reference to an OutputProperties. 
public	TokenNamepublic	
void	TokenNamevoid	
copyFrom	TokenNameIdentifier	 copy From
(	TokenNameLPAREN	
OutputProperties	TokenNameIdentifier	 Output Properties
opsrc	TokenNameIdentifier	 opsrc
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
// Bugzilla 6157: recover from xsl:output statements 	TokenNameCOMMENT_LINE	Bugzilla 6157: recover from xsl:output statements 
// checkDuplicates(opsrc); 	TokenNameCOMMENT_LINE	checkDuplicates(opsrc); 
copyFrom	TokenNameIdentifier	 copy From
(	TokenNameLPAREN	
opsrc	TokenNameIdentifier	 opsrc
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Report if the key given as an argument is a legal xsl:output key. * * @param key non-null reference to key name. * * @return true if key is legal. */	TokenNameCOMMENT_JAVADOC	 Report if the key given as an argument is a legal xsl:output key. * @param key non-null reference to key name. * @return true if key is legal. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isLegalPropertyKey	TokenNameIdentifier	 is Legal Property Key
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
CDATA_SECTION_ELEMENTS	TokenNameIdentifier	 CDATA  SECTION  ELEMENTS
)	TokenNameRPAREN	
||	TokenNameOR_OR	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
DOCTYPE_PUBLIC	TokenNameIdentifier	 DOCTYPE  PUBLIC
)	TokenNameRPAREN	
||	TokenNameOR_OR	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
DOCTYPE_SYSTEM	TokenNameIdentifier	 DOCTYPE  SYSTEM
)	TokenNameRPAREN	
||	TokenNameOR_OR	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
ENCODING	TokenNameIdentifier	 ENCODING
)	TokenNameRPAREN	
||	TokenNameOR_OR	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
INDENT	TokenNameIdentifier	 INDENT
)	TokenNameRPAREN	
||	TokenNameOR_OR	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
MEDIA_TYPE	TokenNameIdentifier	 MEDIA  TYPE
)	TokenNameRPAREN	
||	TokenNameOR_OR	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
METHOD	TokenNameIdentifier	 METHOD
)	TokenNameRPAREN	
||	TokenNameOR_OR	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
OMIT_XML_DECLARATION	TokenNameIdentifier	 OMIT  XML  DECLARATION
)	TokenNameRPAREN	
||	TokenNameOR_OR	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
STANDALONE	TokenNameIdentifier	 STANDALONE
)	TokenNameRPAREN	
||	TokenNameOR_OR	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
OutputKeys	TokenNameIdentifier	 Output Keys
.	TokenNameDOT	
VERSION	TokenNameIdentifier	 VERSION
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'{'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'{'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'}'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'}'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'}'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The output properties. * @serial */	TokenNameCOMMENT_JAVADOC	 The output properties. @serial 
private	TokenNameprivate	
Properties	TokenNameIdentifier	 Properties
m_properties	TokenNameIdentifier	 m properties
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Creates an empty OutputProperties with the defaults specified by * a property file. The method argument is used to construct a string of * the form output_[method].properties (for instance, output_html.properties). * The output_xml.properties file is always used as the base. * <p>At the moment, anything other than 'text', 'xml', and 'html', will * use the output_xml.properties file.</p> * * @param method non-null reference to method name. * * @return Properties object that holds the defaults for the given method. * * @deprecated Use org.apache.xml.serializer.OuputPropertiesFactory. * getDefaultMethodProperties directly. */	TokenNameCOMMENT_JAVADOC	 Creates an empty OutputProperties with the defaults specified by a property file. The method argument is used to construct a string of the form output_[method].properties (for instance, output_html.properties). The output_xml.properties file is always used as the base. <p>At the moment, anything other than 'text', 'xml', and 'html', will use the output_xml.properties file.</p> * @param method non-null reference to method name. * @return Properties object that holds the defaults for the given method. * @deprecated Use org.apache.xml.serializer.OuputPropertiesFactory. getDefaultMethodProperties directly. 
static	TokenNamestatic	
public	TokenNamepublic	
Properties	TokenNameIdentifier	 Properties
getDefaultMethodProperties	TokenNameIdentifier	 get Default Method Properties
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
method	TokenNameIdentifier	 method
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
OutputPropertiesFactory	TokenNameIdentifier	 Output Properties Factory
.	TokenNameDOT	
getDefaultMethodProperties	TokenNameIdentifier	 get Default Method Properties
(	TokenNameLPAREN	
method	TokenNameIdentifier	 method
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
