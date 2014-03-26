/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XSLOutputAttributes.java 468654 2006-10-28 07:09:23Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XSLOutputAttributes.java 468654 2006-10-28 07:09:23Z minchau $ 
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
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
/** * This interface has methods associated with the XSLT xsl:output attribues * specified in the stylesheet that effect the format of the document output. * * In an XSLT stylesheet these attributes appear for example as: * <pre> * <xsl:output method="xml" omit-xml-declaration="no" indent="yes"/> * </pre> * The xsl:output attributes covered in this interface are: * <pre> * version * encoding * omit-xml-declarations * standalone * doctype-public * doctype-system * cdata-section-elements * indent * media-type * </pre> * * The one attribute not covered in this interface is <code>method</code> as * this value is implicitly chosen by the serializer that is created, for * example ToXMLStream vs. ToHTMLStream or another one. * * This interface is only used internally within Xalan. * * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 This interface has methods associated with the XSLT xsl:output attribues specified in the stylesheet that effect the format of the document output. * In an XSLT stylesheet these attributes appear for example as: <pre> <xsl:output method="xml" omit-xml-declaration="no" indent="yes"/> </pre> The xsl:output attributes covered in this interface are: <pre> version encoding omit-xml-declarations standalone doctype-public doctype-system cdata-section-elements indent media-type </pre> * The one attribute not covered in this interface is <code>method</code> as this value is implicitly chosen by the serializer that is created, for example ToXMLStream vs. ToHTMLStream or another one. * This interface is only used internally within Xalan. * @xsl.usage internal 
interface	TokenNameinterface	
XSLOutputAttributes	TokenNameIdentifier	 XSL Output Attributes
{	TokenNameLBRACE	
/** * Returns the previously set value of the value to be used as the public * identifier in the document type declaration (DTD). * *@return the public identifier to be used in the DOCTYPE declaration in the * output document. */	TokenNameCOMMENT_JAVADOC	 Returns the previously set value of the value to be used as the public identifier in the document type declaration (DTD). *@return the public identifier to be used in the DOCTYPE declaration in the output document. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDoctypePublic	TokenNameIdentifier	 get Doctype Public
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the previously set value of the value to be used * as the system identifier in the document type declaration (DTD). * @return the system identifier to be used in the DOCTYPE declaration in * the output document. * */	TokenNameCOMMENT_JAVADOC	 Returns the previously set value of the value to be used as the system identifier in the document type declaration (DTD). @return the system identifier to be used in the DOCTYPE declaration in the output document. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDoctypeSystem	TokenNameIdentifier	 get Doctype System
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return the character encoding to be used in the output document. */	TokenNameCOMMENT_JAVADOC	 @return the character encoding to be used in the output document. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getEncoding	TokenNameIdentifier	 get Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return true if the output document should be indented to visually * indicate its structure. */	TokenNameCOMMENT_JAVADOC	 @return true if the output document should be indented to visually indicate its structure. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getIndent	TokenNameIdentifier	 get Indent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return the number of spaces to indent for each indentation level. */	TokenNameCOMMENT_JAVADOC	 @return the number of spaces to indent for each indentation level. 
public	TokenNamepublic	
int	TokenNameint	
getIndentAmount	TokenNameIdentifier	 get Indent Amount
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return the mediatype the media-type or MIME type associated with the * output document. */	TokenNameCOMMENT_JAVADOC	 @return the mediatype the media-type or MIME type associated with the output document. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getMediaType	TokenNameIdentifier	 get Media Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return true if the XML declaration is to be omitted from the output * document. */	TokenNameCOMMENT_JAVADOC	 @return true if the XML declaration is to be omitted from the output document. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getOmitXMLDeclaration	TokenNameIdentifier	 get Omit XML Declaration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return a value of "yes" if the <code>standalone</code> delaration is to * be included in the output document. */	TokenNameCOMMENT_JAVADOC	 @return a value of "yes" if the <code>standalone</code> delaration is to be included in the output document. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getStandalone	TokenNameIdentifier	 get Standalone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return the version of the output format. */	TokenNameCOMMENT_JAVADOC	 @return the version of the output format. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the value coming from the xsl:output cdata-section-elements * stylesheet property. * * This sets the elements whose text elements are to be output as CDATA * sections. * @param URI_and_localNames pairs of namespace URI and local names that * identify elements whose text elements are to be output as CDATA sections. * The namespace of the local element must be the given URI to match. The * qName is not given because the prefix does not matter, only the namespace * URI to which that prefix would map matters, so the prefix itself is not * relevant in specifying which elements have their text to be output as * CDATA sections. */	TokenNameCOMMENT_JAVADOC	 Sets the value coming from the xsl:output cdata-section-elements stylesheet property. * This sets the elements whose text elements are to be output as CDATA sections. @param URI_and_localNames pairs of namespace URI and local names that identify elements whose text elements are to be output as CDATA sections. The namespace of the local element must be the given URI to match. The qName is not given because the prefix does not matter, only the namespace URI to which that prefix would map matters, so the prefix itself is not relevant in specifying which elements have their text to be output as CDATA sections. 
public	TokenNamepublic	
void	TokenNamevoid	
setCdataSectionElements	TokenNameIdentifier	 set Cdata Section Elements
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
URI_and_localNames	TokenNameIdentifier	 URI and local Names
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Set the value coming from the xsl:output doctype-public and doctype-system stylesheet properties * @param system the system identifier to be used in the DOCTYPE declaration * in the output document. * @param pub the public identifier to be used in the DOCTYPE declaration in * the output document. */	TokenNameCOMMENT_JAVADOC	 Set the value coming from the xsl:output doctype-public and doctype-system stylesheet properties @param system the system identifier to be used in the DOCTYPE declaration in the output document. @param pub the public identifier to be used in the DOCTYPE declaration in the output document. 
public	TokenNamepublic	
void	TokenNamevoid	
setDoctype	TokenNameIdentifier	 set Doctype
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
system	TokenNameIdentifier	 system
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
pub	TokenNameIdentifier	 pub
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Set the value coming from the xsl:output doctype-public stylesheet attribute. * @param doctype the public identifier to be used in the DOCTYPE * declaration in the output document. */	TokenNameCOMMENT_JAVADOC	 Set the value coming from the xsl:output doctype-public stylesheet attribute. @param doctype the public identifier to be used in the DOCTYPE declaration in the output document. 
public	TokenNamepublic	
void	TokenNamevoid	
setDoctypePublic	TokenNameIdentifier	 set Doctype Public
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
doctype	TokenNameIdentifier	 doctype
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Set the value coming from the xsl:output doctype-system stylesheet attribute. * @param doctype the system identifier to be used in the DOCTYPE * declaration in the output document. */	TokenNameCOMMENT_JAVADOC	 Set the value coming from the xsl:output doctype-system stylesheet attribute. @param doctype the system identifier to be used in the DOCTYPE declaration in the output document. 
public	TokenNamepublic	
void	TokenNamevoid	
setDoctypeSystem	TokenNameIdentifier	 set Doctype System
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
doctype	TokenNameIdentifier	 doctype
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the character encoding coming from the xsl:output encoding stylesheet attribute. * @param encoding the character encoding */	TokenNameCOMMENT_JAVADOC	 Sets the character encoding coming from the xsl:output encoding stylesheet attribute. @param encoding the character encoding 
public	TokenNamepublic	
void	TokenNamevoid	
setEncoding	TokenNameIdentifier	 set Encoding
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the value coming from the xsl:output indent stylesheet * attribute. * @param indent true if the output document should be indented to visually * indicate its structure. */	TokenNameCOMMENT_JAVADOC	 Sets the value coming from the xsl:output indent stylesheet attribute. @param indent true if the output document should be indented to visually indicate its structure. 
public	TokenNamepublic	
void	TokenNamevoid	
setIndent	TokenNameIdentifier	 set Indent
(	TokenNameLPAREN	
boolean	TokenNameboolean	
indent	TokenNameIdentifier	 indent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the value coming from the xsl:output media-type stylesheet attribute. * @param mediatype the media-type or MIME type associated with the output * document. */	TokenNameCOMMENT_JAVADOC	 Sets the value coming from the xsl:output media-type stylesheet attribute. @param mediatype the media-type or MIME type associated with the output document. 
public	TokenNamepublic	
void	TokenNamevoid	
setMediaType	TokenNameIdentifier	 set Media Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
mediatype	TokenNameIdentifier	 mediatype
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the value coming from the xsl:output omit-xml-declaration stylesheet attribute * @param b true if the XML declaration is to be omitted from the output * document. */	TokenNameCOMMENT_JAVADOC	 Sets the value coming from the xsl:output omit-xml-declaration stylesheet attribute @param b true if the XML declaration is to be omitted from the output document. 
public	TokenNamepublic	
void	TokenNamevoid	
setOmitXMLDeclaration	TokenNameIdentifier	 set Omit XML Declaration
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the value coming from the xsl:output standalone stylesheet attribute. * @param standalone a value of "yes" indicates that the * <code>standalone</code> delaration is to be included in the output * document. */	TokenNameCOMMENT_JAVADOC	 Sets the value coming from the xsl:output standalone stylesheet attribute. @param standalone a value of "yes" indicates that the <code>standalone</code> delaration is to be included in the output document. 
public	TokenNamepublic	
void	TokenNamevoid	
setStandalone	TokenNameIdentifier	 set Standalone
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
standalone	TokenNameIdentifier	 standalone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the value coming from the xsl:output version attribute. * @param version the version of the output format. */	TokenNameCOMMENT_JAVADOC	 Sets the value coming from the xsl:output version attribute. @param version the version of the output format. 
public	TokenNamepublic	
void	TokenNamevoid	
setVersion	TokenNameIdentifier	 set Version
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the value for a property that affects seraialization, * if a property was set return that value, otherwise return * the default value, otherwise return null. * @param name The name of the property, which is just the local name * if it is in no namespace, but is the URI in curly braces followed by * the local name if it is in a namespace, for example: * <ul> * <li> "encoding" * <li> "method" * <li> "{http://xml.apache.org/xalan}indent-amount" * <li> "{http://xml.apache.org/xalan}line-separator" * </ul> * @return The value of the parameter */	TokenNameCOMMENT_JAVADOC	 Get the value for a property that affects seraialization, if a property was set return that value, otherwise return the default value, otherwise return null. @param name The name of the property, which is just the local name if it is in no namespace, but is the URI in curly braces followed by the local name if it is in a namespace, for example: <ul> <li> "encoding" <li> "method" <li> "{http://xml.apache.org/xalan}indent-amount" <li> "{http://xml.apache.org/xalan}line-separator" </ul> @return The value of the parameter 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOutputProperty	TokenNameIdentifier	 get Output Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the default value for a property that affects seraialization, * or null if there is none. It is possible that a non-default value * was set for the property, however the value returned by this method * is unaffected by any non-default settings. * @param name The name of the property. * @return The default value of the parameter, or null if there is no default value. */	TokenNameCOMMENT_JAVADOC	 Get the default value for a property that affects seraialization, or null if there is none. It is possible that a non-default value was set for the property, however the value returned by this method is unaffected by any non-default settings. @param name The name of the property. @return The default value of the parameter, or null if there is no default value. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOutputPropertyDefault	TokenNameIdentifier	 get Output Property Default
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Set the non-default value for a property that affects seraialization. * @param name The name of the property, which is just the local name * if it is in no namespace, but is the URI in curly braces followed by * the local name if it is in a namespace, for example: * <ul> * <li> "encoding" * <li> "method" * <li> "{http://xml.apache.org/xalan}indent-amount" * <li> "{http://xml.apache.org/xalan}line-separator" * </ul> * @val The non-default value of the parameter */	TokenNameCOMMENT_JAVADOC	 Set the non-default value for a property that affects seraialization. @param name The name of the property, which is just the local name if it is in no namespace, but is the URI in curly braces followed by the local name if it is in a namespace, for example: <ul> <li> "encoding" <li> "method" <li> "{http://xml.apache.org/xalan}indent-amount" <li> "{http://xml.apache.org/xalan}line-separator" </ul> @val The non-default value of the parameter 
public	TokenNamepublic	
void	TokenNamevoid	
setOutputProperty	TokenNameIdentifier	 set Output Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Set the default value for a property that affects seraialization. * @param name The name of the property, which is just the local name * if it is in no namespace, but is the URI in curly braces followed by * the local name if it is in a namespace, for example: * <ul> * <li> "encoding" * <li> "method" * <li> "{http://xml.apache.org/xalan}indent-amount" * <li> "{http://xml.apache.org/xalan}line-separator" * </ul> * @val The default value of the parameter */	TokenNameCOMMENT_JAVADOC	 Set the default value for a property that affects seraialization. @param name The name of the property, which is just the local name if it is in no namespace, but is the URI in curly braces followed by the local name if it is in a namespace, for example: <ul> <li> "encoding" <li> "method" <li> "{http://xml.apache.org/xalan}indent-amount" <li> "{http://xml.apache.org/xalan}line-separator" </ul> @val The default value of the parameter 
public	TokenNamepublic	
void	TokenNamevoid	
setOutputPropertyDefault	TokenNameIdentifier	 set Output Property Default
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
