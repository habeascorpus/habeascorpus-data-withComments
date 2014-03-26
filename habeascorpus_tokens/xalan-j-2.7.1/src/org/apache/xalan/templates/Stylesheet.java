/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: Stylesheet.java 468643 2006-10-28 06:56:03Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: Stylesheet.java 468643 2006-10-28 06:56:03Z minchau $ 
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
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
Stack	TokenNameIdentifier	 Stack
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
SourceLocator	TokenNameIdentifier	 Source Locator
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
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTM	TokenNameIdentifier	 DTM
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
StringVector	TokenNameIdentifier	 String Vector
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
SystemIDResolver	TokenNameIdentifier	 System ID Resolver
;	TokenNameSEMICOLON	
/** * Represents a stylesheet element. * <p>All properties in this class have a fixed form of bean-style property * accessors for all properties that represent XSL attributes or elements. * These properties have setter method names accessed generically by the * processor, and so these names must be fixed according to the system * defined in the <a href="XSLTAttributeDef#getSetterMethodName">getSetterMethodName</a> * function.</p> * <p><pre> * <!ENTITY % top-level " * (xsl:import*, * (xsl:include * | xsl:strip-space * | xsl:preserve-space * | xsl:output * | xsl:key * | xsl:decimal-format * | xsl:attribute-set * | xsl:variable * | xsl:param * | xsl:template * | xsl:namespace-alias * %non-xsl-top-level;)*) * "> * * <!ENTITY % top-level-atts ' * extension-element-prefixes CDATA #IMPLIED * exclude-result-prefixes CDATA #IMPLIED * id ID #IMPLIED * version NMTOKEN #REQUIRED * xmlns:xsl CDATA #FIXED "http://www.w3.org/1999/XSL/Transform" * %space-att; * '> * * <!ELEMENT xsl:stylesheet %top-level;> * <!ATTLIST xsl:stylesheet %top-level-atts;> * * <!ELEMENT xsl:transform %top-level;> * <!ATTLIST xsl:transform %top-level-atts;> * * </p></pre> * @see <a href="http://www.w3.org/TR/xslt#section-Stylesheet-Structure">section-Stylesheet-Structure in XSLT Specification</a> */	TokenNameCOMMENT_JAVADOC	 Represents a stylesheet element. <p>All properties in this class have a fixed form of bean-style property accessors for all properties that represent XSL attributes or elements. These properties have setter method names accessed generically by the processor, and so these names must be fixed according to the system defined in the <a href="XSLTAttributeDef#getSetterMethodName">getSetterMethodName</a> function.</p> <p><pre> <!ENTITY % top-level " (xsl:import*, (xsl:include | xsl:strip-space | xsl:preserve-space | xsl:output | xsl:key | xsl:decimal-format | xsl:attribute-set | xsl:variable | xsl:param | xsl:template | xsl:namespace-alias %non-xsl-top-level;)*) "> * <!ENTITY % top-level-atts ' extension-element-prefixes CDATA #IMPLIED exclude-result-prefixes CDATA #IMPLIED id ID #IMPLIED version NMTOKEN #REQUIRED xmlns:xsl CDATA #FIXED "http://www.w3.org/1999/XSL/Transform" %space-att; '> * <!ELEMENT xsl:stylesheet %top-level;> <!ATTLIST xsl:stylesheet %top-level-atts;> * <!ELEMENT xsl:transform %top-level;> <!ATTLIST xsl:transform %top-level-atts;> * </p></pre> @see <a href="http://www.w3.org/TR/xslt#section-Stylesheet-Structure">section-Stylesheet-Structure in XSLT Specification</a> 
public	TokenNamepublic	
class	TokenNameclass	
Stylesheet	TokenNameIdentifier	 Stylesheet
extends	TokenNameextends	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
implements	TokenNameimplements	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
/* , Document */	TokenNameCOMMENT_BLOCK	 , Document 
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
2085337282743043776L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Constructor for a Stylesheet. * @param parent The including or importing stylesheet. */	TokenNameCOMMENT_JAVADOC	 Constructor for a Stylesheet. @param parent The including or importing stylesheet. 
public	TokenNamepublic	
Stylesheet	TokenNameIdentifier	 Stylesheet
(	TokenNameLPAREN	
Stylesheet	TokenNameIdentifier	 Stylesheet
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_stylesheetParent	TokenNameIdentifier	 m stylesheet Parent
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
m_stylesheetRoot	TokenNameIdentifier	 m stylesheet Root
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getStylesheetRoot	TokenNameIdentifier	 get Stylesheet Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the owning stylesheet. This looks up the * inheritance chain until it calls getStylesheet * on a Stylesheet object, which will return itself. * * @return The owning stylesheet, itself. */	TokenNameCOMMENT_JAVADOC	 Get the owning stylesheet. This looks up the inheritance chain until it calls getStylesheet on a Stylesheet object, which will return itself. * @return The owning stylesheet, itself. 
public	TokenNamepublic	
Stylesheet	TokenNameIdentifier	 Stylesheet
getStylesheet	TokenNameIdentifier	 get Stylesheet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if this can be cast to a StylesheetComposed, meaning, you * can ask questions from getXXXComposed functions. * * @return False if this is not a StylesheetComposed */	TokenNameCOMMENT_JAVADOC	 Tell if this can be cast to a StylesheetComposed, meaning, you can ask questions from getXXXComposed functions. * @return False if this is not a StylesheetComposed 
public	TokenNamepublic	
boolean	TokenNameboolean	
isAggregatedType	TokenNameIdentifier	 is Aggregated Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if this is the root of the stylesheet tree. * * @return False is this is not the root of the stylesheet tree. */	TokenNameCOMMENT_JAVADOC	 Tell if this is the root of the stylesheet tree. * @return False is this is not the root of the stylesheet tree. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isRoot	TokenNameIdentifier	 is Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Extension to be used when serializing to disk. */	TokenNameCOMMENT_JAVADOC	 Extension to be used when serializing to disk. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
STYLESHEET_EXT	TokenNameIdentifier	 STYLESHEET  EXT
=	TokenNameEQUAL	
".lxc"	TokenNameStringLiteral	.lxc
;	TokenNameSEMICOLON	
/** * Read the stylesheet from a serialization stream. * * @param stream Input stream to read from * * @throws IOException * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Read the stylesheet from a serialization stream. * @param stream Input stream to read from * @throws IOException @throws TransformerException 
private	TokenNameprivate	
void	TokenNamevoid	
readObject	TokenNameIdentifier	 read Object
(	TokenNameLPAREN	
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
// System.out.println("Reading Stylesheet"); 	TokenNameCOMMENT_LINE	System.out.println("Reading Stylesheet"); 
try	TokenNametry	
{	TokenNameLBRACE	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
defaultReadObject	TokenNameIdentifier	 default Read Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
cnfe	TokenNameIdentifier	 cnfe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
cnfe	TokenNameIdentifier	 cnfe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// System.out.println("Done reading Stylesheet"); 	TokenNameCOMMENT_LINE	System.out.println("Done reading Stylesheet"); 
}	TokenNameRBRACE	
/** * Write out the given output stream * * * @param stream The output stream to write out * * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Write out the given output stream * @param stream The output stream to write out * @throws IOException 
private	TokenNameprivate	
void	TokenNamevoid	
writeObject	TokenNameIdentifier	 write Object
(	TokenNameLPAREN	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// System.out.println("Writing Stylesheet"); 	TokenNameCOMMENT_LINE	System.out.println("Writing Stylesheet"); 
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
defaultWriteObject	TokenNameIdentifier	 default Write Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("Done writing Stylesheet"); 	TokenNameCOMMENT_LINE	System.out.println("Done writing Stylesheet"); 
}	TokenNameRBRACE	
//============== XSLT Properties ================= 	TokenNameCOMMENT_LINE	============== XSLT Properties ================= 
/** * The "xmlns:xsl" property. * @serial */	TokenNameCOMMENT_JAVADOC	 The "xmlns:xsl" property. @serial 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_XmlnsXsl	TokenNameIdentifier	 m  Xmlns Xsl
;	TokenNameSEMICOLON	
/** * Set the "xmlns:xsl" property. * @see <a href="http://www.w3.org/TR/xslt#xslt-namespace">xslt-namespace in XSLT Specification</a> * * @param v The value to be set for the "xmlns:xsl" property. */	TokenNameCOMMENT_JAVADOC	 Set the "xmlns:xsl" property. @see <a href="http://www.w3.org/TR/xslt#xslt-namespace">xslt-namespace in XSLT Specification</a> * @param v The value to be set for the "xmlns:xsl" property. 
public	TokenNamepublic	
void	TokenNamevoid	
setXmlnsXsl	TokenNameIdentifier	 set Xmlns Xsl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_XmlnsXsl	TokenNameIdentifier	 m  Xmlns Xsl
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the "xmlns:xsl" property. * @see <a href="http://www.w3.org/TR/xslt#xslt-namespace">xslt-namespace in XSLT Specification</a> * * @return The value of the "xmlns:xsl" property. */	TokenNameCOMMENT_JAVADOC	 Get the "xmlns:xsl" property. @see <a href="http://www.w3.org/TR/xslt#xslt-namespace">xslt-namespace in XSLT Specification</a> * @return The value of the "xmlns:xsl" property. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getXmlnsXsl	TokenNameIdentifier	 get Xmlns Xsl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_XmlnsXsl	TokenNameIdentifier	 m  Xmlns Xsl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The "extension-element-prefixes" property, actually contains URIs. * @serial */	TokenNameCOMMENT_JAVADOC	 The "extension-element-prefixes" property, actually contains URIs. @serial 
private	TokenNameprivate	
StringVector	TokenNameIdentifier	 String Vector
m_ExtensionElementURIs	TokenNameIdentifier	 m  Extension Element UR Is
;	TokenNameSEMICOLON	
/** * Set the "extension-element-prefixes" property. * @see <a href="http://www.w3.org/TR/xslt#extension-element">extension-element in XSLT Specification</a> * * @param v The value to be set for the "extension-element-prefixes" * property: a vector of extension element URIs. */	TokenNameCOMMENT_JAVADOC	 Set the "extension-element-prefixes" property. @see <a href="http://www.w3.org/TR/xslt#extension-element">extension-element in XSLT Specification</a> * @param v The value to be set for the "extension-element-prefixes" property: a vector of extension element URIs. 
public	TokenNamepublic	
void	TokenNamevoid	
setExtensionElementPrefixes	TokenNameIdentifier	 set Extension Element Prefixes
(	TokenNameLPAREN	
StringVector	TokenNameIdentifier	 String Vector
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_ExtensionElementURIs	TokenNameIdentifier	 m  Extension Element UR Is
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get and "extension-element-prefix" property. * @see <a href="http://www.w3.org/TR/xslt#extension-element">extension-element in XSLT Specification</a> * * @param i Index of extension element URI in list * * @return The extension element URI at the given index * * @throws ArrayIndexOutOfBoundsException */	TokenNameCOMMENT_JAVADOC	 Get and "extension-element-prefix" property. @see <a href="http://www.w3.org/TR/xslt#extension-element">extension-element in XSLT Specification</a> * @param i Index of extension element URI in list * @return The extension element URI at the given index * @throws ArrayIndexOutOfBoundsException 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getExtensionElementPrefix	TokenNameIdentifier	 get Extension Element Prefix
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_ExtensionElementURIs	TokenNameIdentifier	 m  Extension Element UR Is
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
m_ExtensionElementURIs	TokenNameIdentifier	 m  Extension Element UR Is
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the number of "extension-element-prefixes" Strings. * @see <a href="http://www.w3.org/TR/xslt#extension-element">extension-element in XSLT Specification</a> * * @return Number of URIs in the list */	TokenNameCOMMENT_JAVADOC	 Get the number of "extension-element-prefixes" Strings. @see <a href="http://www.w3.org/TR/xslt#extension-element">extension-element in XSLT Specification</a> * @return Number of URIs in the list 
public	TokenNamepublic	
int	TokenNameint	
getExtensionElementPrefixCount	TokenNameIdentifier	 get Extension Element Prefix Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_ExtensionElementURIs	TokenNameIdentifier	 m  Extension Element UR Is
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_ExtensionElementURIs	TokenNameIdentifier	 m  Extension Element UR Is
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Find out if this contains a given "extension-element-prefix" property. * @see <a href="http://www.w3.org/TR/xslt#extension-element">extension-element in XSLT Specification</a> * * @param uri URI of extension element to look for * * @return True if the given URI was found in the list */	TokenNameCOMMENT_JAVADOC	 Find out if this contains a given "extension-element-prefix" property. @see <a href="http://www.w3.org/TR/xslt#extension-element">extension-element in XSLT Specification</a> * @param uri URI of extension element to look for * @return True if the given URI was found in the list 
public	TokenNamepublic	
boolean	TokenNameboolean	
containsExtensionElementURI	TokenNameIdentifier	 contains Extension Element URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_ExtensionElementURIs	TokenNameIdentifier	 m  Extension Element UR Is
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
m_ExtensionElementURIs	TokenNameIdentifier	 m  Extension Element UR Is
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The "exclude-result-prefixes" property. * @serial */	TokenNameCOMMENT_JAVADOC	 The "exclude-result-prefixes" property. @serial 
private	TokenNameprivate	
StringVector	TokenNameIdentifier	 String Vector
m_ExcludeResultPrefixs	TokenNameIdentifier	 m  Exclude Result Prefixs
;	TokenNameSEMICOLON	
/** * Set the "exclude-result-prefixes" property. * The designation of a namespace as an excluded namespace is * effective within the subtree of the stylesheet rooted at * the element bearing the exclude-result-prefixes or * xsl:exclude-result-prefixes attribute; a subtree rooted * at an xsl:stylesheet element does not include any stylesheets * imported or included by children of that xsl:stylesheet element. * @see <a href="http://www.w3.org/TR/xslt#literal-result-element">literal-result-element in XSLT Specification</a> * * @param v A StringVector of prefixes to exclude */	TokenNameCOMMENT_JAVADOC	 Set the "exclude-result-prefixes" property. The designation of a namespace as an excluded namespace is effective within the subtree of the stylesheet rooted at the element bearing the exclude-result-prefixes or xsl:exclude-result-prefixes attribute; a subtree rooted at an xsl:stylesheet element does not include any stylesheets imported or included by children of that xsl:stylesheet element. @see <a href="http://www.w3.org/TR/xslt#literal-result-element">literal-result-element in XSLT Specification</a> * @param v A StringVector of prefixes to exclude 
public	TokenNamepublic	
void	TokenNamevoid	
setExcludeResultPrefixes	TokenNameIdentifier	 set Exclude Result Prefixes
(	TokenNameLPAREN	
StringVector	TokenNameIdentifier	 String Vector
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_ExcludeResultPrefixs	TokenNameIdentifier	 m  Exclude Result Prefixs
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an "exclude-result-prefix" property. * The designation of a namespace as an excluded namespace is * effective within the subtree of the stylesheet rooted at * the element bearing the exclude-result-prefixes or * xsl:exclude-result-prefixes attribute; a subtree rooted * at an xsl:stylesheet element does not include any stylesheets * imported or included by children of that xsl:stylesheet element. * @see <a href="http://www.w3.org/TR/xslt#literal-result-element">literal-result-element in XSLT Specification</a> * * @param i Index of prefix to get in list * * @return Prefix to be excluded at the given index * * @throws ArrayIndexOutOfBoundsException */	TokenNameCOMMENT_JAVADOC	 Get an "exclude-result-prefix" property. The designation of a namespace as an excluded namespace is effective within the subtree of the stylesheet rooted at the element bearing the exclude-result-prefixes or xsl:exclude-result-prefixes attribute; a subtree rooted at an xsl:stylesheet element does not include any stylesheets imported or included by children of that xsl:stylesheet element. @see <a href="http://www.w3.org/TR/xslt#literal-result-element">literal-result-element in XSLT Specification</a> * @param i Index of prefix to get in list * @return Prefix to be excluded at the given index * @throws ArrayIndexOutOfBoundsException 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getExcludeResultPrefix	TokenNameIdentifier	 get Exclude Result Prefix
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_ExcludeResultPrefixs	TokenNameIdentifier	 m  Exclude Result Prefixs
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
m_ExcludeResultPrefixs	TokenNameIdentifier	 m  Exclude Result Prefixs
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the number of "exclude-result-prefixes" Strings. * @see <a href="http://www.w3.org/TR/xslt#literal-result-element">literal-result-element in XSLT Specification</a> * * @return The number of prefix strings to be excluded. */	TokenNameCOMMENT_JAVADOC	 Get the number of "exclude-result-prefixes" Strings. @see <a href="http://www.w3.org/TR/xslt#literal-result-element">literal-result-element in XSLT Specification</a> * @return The number of prefix strings to be excluded. 
public	TokenNamepublic	
int	TokenNameint	
getExcludeResultPrefixCount	TokenNameIdentifier	 get Exclude Result Prefix Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_ExcludeResultPrefixs	TokenNameIdentifier	 m  Exclude Result Prefixs
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_ExcludeResultPrefixs	TokenNameIdentifier	 m  Exclude Result Prefixs
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get whether or not the passed prefix is contained flagged by * the "exclude-result-prefixes" property. * @see <a href="http://www.w3.org/TR/xslt#literal-result-element">literal-result-element in XSLT Specification</a> * * @param prefix non-null reference to prefix that might be excluded. * @param uri reference to namespace that prefix maps to * * @return true if the prefix should normally be excluded.> */	TokenNameCOMMENT_JAVADOC	 Get whether or not the passed prefix is contained flagged by the "exclude-result-prefixes" property. @see <a href="http://www.w3.org/TR/xslt#literal-result-element">literal-result-element in XSLT Specification</a> * @param prefix non-null reference to prefix that might be excluded. @param uri reference to namespace that prefix maps to * @return true if the prefix should normally be excluded.> 
public	TokenNamepublic	
boolean	TokenNameboolean	
containsExcludeResultPrefix	TokenNameIdentifier	 contains Exclude Result Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_ExcludeResultPrefixs	TokenNameIdentifier	 m  Exclude Result Prefixs
||	TokenNameOR_OR	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// This loop is ok here because this code only runs during 	TokenNameCOMMENT_LINE	This loop is ok here because this code only runs during 
// stylesheet compile time. 	TokenNameCOMMENT_LINE	stylesheet compile time. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
m_ExcludeResultPrefixs	TokenNameIdentifier	 m  Exclude Result Prefixs
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
getNamespaceForPrefix	TokenNameIdentifier	 get Namespace For Prefix
(	TokenNameLPAREN	
m_ExcludeResultPrefixs	TokenNameIdentifier	 m  Exclude Result Prefixs
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/* if (prefix.length() == 0) prefix = Constants.ATTRVAL_DEFAULT_PREFIX; return m_ExcludeResultPrefixs.contains(prefix); */	TokenNameCOMMENT_BLOCK	 if (prefix.length() == 0) prefix = Constants.ATTRVAL_DEFAULT_PREFIX; return m_ExcludeResultPrefixs.contains(prefix); 
}	TokenNameRBRACE	
/** * The "id" property. * @serial */	TokenNameCOMMENT_JAVADOC	 The "id" property. @serial 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_Id	TokenNameIdentifier	 m  Id
;	TokenNameSEMICOLON	
/** * Set the "id" property. * @see <a href="http://www.w3.org/TR/xslt#section-Embedding-Stylesheets">section-Embedding-Stylesheets in XSLT Specification</a> * * @param v Value for the "id" property. */	TokenNameCOMMENT_JAVADOC	 Set the "id" property. @see <a href="http://www.w3.org/TR/xslt#section-Embedding-Stylesheets">section-Embedding-Stylesheets in XSLT Specification</a> * @param v Value for the "id" property. 
public	TokenNamepublic	
void	TokenNamevoid	
setId	TokenNameIdentifier	 set Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_Id	TokenNameIdentifier	 m  Id
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the "id" property. * @see <a href="http://www.w3.org/TR/xslt#section-Embedding-Stylesheets">section-Embedding-Stylesheets in XSLT Specification</a> * * @return The value of the "id" property. */	TokenNameCOMMENT_JAVADOC	 Get the "id" property. @see <a href="http://www.w3.org/TR/xslt#section-Embedding-Stylesheets">section-Embedding-Stylesheets in XSLT Specification</a> * @return The value of the "id" property. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_Id	TokenNameIdentifier	 m  Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The "version" property. * @serial */	TokenNameCOMMENT_JAVADOC	 The "version" property. @serial 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_Version	TokenNameIdentifier	 m  Version
;	TokenNameSEMICOLON	
/** * Whether or not the stylesheet is in "Forward Compatibility Mode" * @serial */	TokenNameCOMMENT_JAVADOC	 Whether or not the stylesheet is in "Forward Compatibility Mode" @serial 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_isCompatibleMode	TokenNameIdentifier	 m is Compatible Mode
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Set the "version" property. * @see <a href="http://www.w3.org/TR/xslt#forwards">forwards in XSLT Specification</a> * * @param v Value for the "version" property. */	TokenNameCOMMENT_JAVADOC	 Set the "version" property. @see <a href="http://www.w3.org/TR/xslt#forwards">forwards in XSLT Specification</a> * @param v Value for the "version" property. 
public	TokenNamepublic	
void	TokenNamevoid	
setVersion	TokenNameIdentifier	 set Version
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_Version	TokenNameIdentifier	 m  Version
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
m_isCompatibleMode	TokenNameIdentifier	 m is Compatible Mode
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XSLTVERSUPPORTED	TokenNameIdentifier	 XSLTVERSUPPORTED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get whether or not the stylesheet is in "Forward Compatibility Mode" * * @return true if in forward compatible mode, false otherwise */	TokenNameCOMMENT_JAVADOC	 Get whether or not the stylesheet is in "Forward Compatibility Mode" * @return true if in forward compatible mode, false otherwise 
public	TokenNamepublic	
boolean	TokenNameboolean	
getCompatibleMode	TokenNameIdentifier	 get Compatible Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_isCompatibleMode	TokenNameIdentifier	 m is Compatible Mode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the "version" property. * @see <a href="http://www.w3.org/TR/xslt#forwards">forwards in XSLT Specification</a> * * @return The value of the "version" property. */	TokenNameCOMMENT_JAVADOC	 Get the "version" property. @see <a href="http://www.w3.org/TR/xslt#forwards">forwards in XSLT Specification</a> * @return The value of the "version" property. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_Version	TokenNameIdentifier	 m  Version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The "xsl:import" list. * @serial */	TokenNameCOMMENT_JAVADOC	 The "xsl:import" list. @serial 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
m_imports	TokenNameIdentifier	 m imports
;	TokenNameSEMICOLON	
/** * Add a stylesheet to the "import" list. * @see <a href="http://www.w3.org/TR/xslt#import">import in XSLT Specification</a> * * @param v Stylesheet to add to the import list */	TokenNameCOMMENT_JAVADOC	 Add a stylesheet to the "import" list. @see <a href="http://www.w3.org/TR/xslt#import">import in XSLT Specification</a> * @param v Stylesheet to add to the import list 
public	TokenNamepublic	
void	TokenNamevoid	
setImport	TokenNameIdentifier	 set Import
(	TokenNameLPAREN	
StylesheetComposed	TokenNameIdentifier	 Stylesheet Composed
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_imports	TokenNameIdentifier	 m imports
)	TokenNameRPAREN	
m_imports	TokenNameIdentifier	 m imports
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// I'm going to insert the elements in backwards order, 	TokenNameCOMMENT_LINE	I'm going to insert the elements in backwards order, 
// so I can walk them 0 to n. 	TokenNameCOMMENT_LINE	so I can walk them 0 to n. 
m_imports	TokenNameIdentifier	 m imports
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a stylesheet from the "import" list. * @see <a href="http://www.w3.org/TR/xslt#import">import in XSLT Specification</a> * * @param i Index of the stylesheet to get * * @return The stylesheet at the given index * * @throws ArrayIndexOutOfBoundsException */	TokenNameCOMMENT_JAVADOC	 Get a stylesheet from the "import" list. @see <a href="http://www.w3.org/TR/xslt#import">import in XSLT Specification</a> * @param i Index of the stylesheet to get * @return The stylesheet at the given index * @throws ArrayIndexOutOfBoundsException 
public	TokenNamepublic	
StylesheetComposed	TokenNameIdentifier	 Stylesheet Composed
getImport	TokenNameIdentifier	 get Import
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_imports	TokenNameIdentifier	 m imports
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
StylesheetComposed	TokenNameIdentifier	 Stylesheet Composed
)	TokenNameRPAREN	
m_imports	TokenNameIdentifier	 m imports
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the number of imported stylesheets. * @see <a href="http://www.w3.org/TR/xslt#import">import in XSLT Specification</a> * * @return the number of imported stylesheets. */	TokenNameCOMMENT_JAVADOC	 Get the number of imported stylesheets. @see <a href="http://www.w3.org/TR/xslt#import">import in XSLT Specification</a> * @return the number of imported stylesheets. 
public	TokenNamepublic	
int	TokenNameint	
getImportCount	TokenNameIdentifier	 get Import Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_imports	TokenNameIdentifier	 m imports
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_imports	TokenNameIdentifier	 m imports
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The "xsl:include" properties. * @serial */	TokenNameCOMMENT_JAVADOC	 The "xsl:include" properties. @serial 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
m_includes	TokenNameIdentifier	 m includes
;	TokenNameSEMICOLON	
/** * Add a stylesheet to the "include" list. * @see <a href="http://www.w3.org/TR/xslt#include">include in XSLT Specification</a> * * @param v Stylesheet to add to the "include" list */	TokenNameCOMMENT_JAVADOC	 Add a stylesheet to the "include" list. @see <a href="http://www.w3.org/TR/xslt#include">include in XSLT Specification</a> * @param v Stylesheet to add to the "include" list 
public	TokenNamepublic	
void	TokenNamevoid	
setInclude	TokenNameIdentifier	 set Include
(	TokenNameLPAREN	
Stylesheet	TokenNameIdentifier	 Stylesheet
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_includes	TokenNameIdentifier	 m includes
)	TokenNameRPAREN	
m_includes	TokenNameIdentifier	 m includes
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_includes	TokenNameIdentifier	 m includes
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the stylesheet at the given in index in "include" list * @see <a href="http://www.w3.org/TR/xslt#include">include in XSLT Specification</a> * * @param i Index of stylesheet to get * * @return Stylesheet at the given index * * @throws ArrayIndexOutOfBoundsException */	TokenNameCOMMENT_JAVADOC	 Get the stylesheet at the given in index in "include" list @see <a href="http://www.w3.org/TR/xslt#include">include in XSLT Specification</a> * @param i Index of stylesheet to get * @return Stylesheet at the given index * @throws ArrayIndexOutOfBoundsException 
public	TokenNamepublic	
Stylesheet	TokenNameIdentifier	 Stylesheet
getInclude	TokenNameIdentifier	 get Include
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_includes	TokenNameIdentifier	 m includes
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
Stylesheet	TokenNameIdentifier	 Stylesheet
)	TokenNameRPAREN	
m_includes	TokenNameIdentifier	 m includes
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the number of included stylesheets. * @see <a href="http://www.w3.org/TR/xslt#import">import in XSLT Specification</a> * * @return the number of included stylesheets. */	TokenNameCOMMENT_JAVADOC	 Get the number of included stylesheets. @see <a href="http://www.w3.org/TR/xslt#import">import in XSLT Specification</a> * @return the number of included stylesheets. 
public	TokenNamepublic	
int	TokenNameint	
getIncludeCount	TokenNameIdentifier	 get Include Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_includes	TokenNameIdentifier	 m includes
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_includes	TokenNameIdentifier	 m includes
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Table of tables of element decimal-format. * @see DecimalFormatProperties * @serial */	TokenNameCOMMENT_JAVADOC	 Table of tables of element decimal-format. @see DecimalFormatProperties @serial 
Stack	TokenNameIdentifier	 Stack
m_DecimalFormatDeclarations	TokenNameIdentifier	 m  Decimal Format Declarations
;	TokenNameSEMICOLON	
/** * Process the xsl:decimal-format element. * * @param edf Decimal-format element to push into stack */	TokenNameCOMMENT_JAVADOC	 Process the xsl:decimal-format element. * @param edf Decimal-format element to push into stack 
public	TokenNamepublic	
void	TokenNamevoid	
setDecimalFormat	TokenNameIdentifier	 set Decimal Format
(	TokenNameLPAREN	
DecimalFormatProperties	TokenNameIdentifier	 Decimal Format Properties
edf	TokenNameIdentifier	 edf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_DecimalFormatDeclarations	TokenNameIdentifier	 m  Decimal Format Declarations
)	TokenNameRPAREN	
m_DecimalFormatDeclarations	TokenNameIdentifier	 m  Decimal Format Declarations
=	TokenNameEQUAL	
new	TokenNamenew	
Stack	TokenNameIdentifier	 Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Elements are pushed in by order of importance 	TokenNameCOMMENT_LINE	Elements are pushed in by order of importance 
// so that when recomposed, they get overiden properly. 	TokenNameCOMMENT_LINE	so that when recomposed, they get overiden properly. 
m_DecimalFormatDeclarations	TokenNameIdentifier	 m  Decimal Format Declarations
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
edf	TokenNameIdentifier	 edf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an "xsl:decimal-format" property. * * @see DecimalFormatProperties * @see <a href="http://www.w3.org/TR/xslt#format-number">format-number in XSLT Specification</a> * * @param name The qualified name of the decimal format property. * @return null if not found, otherwise a DecimalFormatProperties * object, from which you can get a DecimalFormatSymbols object. */	TokenNameCOMMENT_JAVADOC	 Get an "xsl:decimal-format" property. * @see DecimalFormatProperties @see <a href="http://www.w3.org/TR/xslt#format-number">format-number in XSLT Specification</a> * @param name The qualified name of the decimal format property. @return null if not found, otherwise a DecimalFormatProperties object, from which you can get a DecimalFormatSymbols object. 
public	TokenNamepublic	
DecimalFormatProperties	TokenNameIdentifier	 Decimal Format Properties
getDecimalFormat	TokenNameIdentifier	 get Decimal Format
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_DecimalFormatDeclarations	TokenNameIdentifier	 m  Decimal Format Declarations
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
getDecimalFormatCount	TokenNameIdentifier	 get Decimal Format Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DecimalFormatProperties	TokenNameIdentifier	 Decimal Format Properties
dfp	TokenNameIdentifier	 dfp
=	TokenNameEQUAL	
getDecimalFormat	TokenNameIdentifier	 get Decimal Format
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dfp	TokenNameIdentifier	 dfp
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
dfp	TokenNameIdentifier	 dfp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an "xsl:decimal-format" property. * @see <a href="http://www.w3.org/TR/xslt#format-number">format-number in XSLT Specification</a> * @see DecimalFormatProperties * * @param i Index of decimal-format property in stack * * @return The decimal-format property at the given index * * @throws ArrayIndexOutOfBoundsException */	TokenNameCOMMENT_JAVADOC	 Get an "xsl:decimal-format" property. @see <a href="http://www.w3.org/TR/xslt#format-number">format-number in XSLT Specification</a> @see DecimalFormatProperties * @param i Index of decimal-format property in stack * @return The decimal-format property at the given index * @throws ArrayIndexOutOfBoundsException 
public	TokenNamepublic	
DecimalFormatProperties	TokenNameIdentifier	 Decimal Format Properties
getDecimalFormat	TokenNameIdentifier	 get Decimal Format
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_DecimalFormatDeclarations	TokenNameIdentifier	 m  Decimal Format Declarations
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
DecimalFormatProperties	TokenNameIdentifier	 Decimal Format Properties
)	TokenNameRPAREN	
m_DecimalFormatDeclarations	TokenNameIdentifier	 m  Decimal Format Declarations
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the number of xsl:decimal-format declarations. * @see DecimalFormatProperties * * @return the number of xsl:decimal-format declarations. */	TokenNameCOMMENT_JAVADOC	 Get the number of xsl:decimal-format declarations. @see DecimalFormatProperties * @return the number of xsl:decimal-format declarations. 
public	TokenNamepublic	
int	TokenNameint	
getDecimalFormatCount	TokenNameIdentifier	 get Decimal Format Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_DecimalFormatDeclarations	TokenNameIdentifier	 m  Decimal Format Declarations
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_DecimalFormatDeclarations	TokenNameIdentifier	 m  Decimal Format Declarations
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The "xsl:strip-space" properties, * A lookup table of all space stripping elements. * @serial */	TokenNameCOMMENT_JAVADOC	 The "xsl:strip-space" properties, A lookup table of all space stripping elements. @serial 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
m_whitespaceStrippingElements	TokenNameIdentifier	 m whitespace Stripping Elements
;	TokenNameSEMICOLON	
/** * Set the "xsl:strip-space" properties. * @see <a href="http://www.w3.org/TR/xslt#strip">strip in XSLT Specification</a> * * @param wsi WhiteSpaceInfo element to add to list */	TokenNameCOMMENT_JAVADOC	 Set the "xsl:strip-space" properties. @see <a href="http://www.w3.org/TR/xslt#strip">strip in XSLT Specification</a> * @param wsi WhiteSpaceInfo element to add to list 
public	TokenNamepublic	
void	TokenNamevoid	
setStripSpaces	TokenNameIdentifier	 set Strip Spaces
(	TokenNameLPAREN	
WhiteSpaceInfo	TokenNameIdentifier	 White Space Info
wsi	TokenNameIdentifier	 wsi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_whitespaceStrippingElements	TokenNameIdentifier	 m whitespace Stripping Elements
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_whitespaceStrippingElements	TokenNameIdentifier	 m whitespace Stripping Elements
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_whitespaceStrippingElements	TokenNameIdentifier	 m whitespace Stripping Elements
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
wsi	TokenNameIdentifier	 wsi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an "xsl:strip-space" property. * @see <a href="http://www.w3.org/TR/xslt#strip">strip in XSLT Specification</a> * * @param i Index of WhiteSpaceInfo to get * * @return WhiteSpaceInfo at given index * * @throws ArrayIndexOutOfBoundsException */	TokenNameCOMMENT_JAVADOC	 Get an "xsl:strip-space" property. @see <a href="http://www.w3.org/TR/xslt#strip">strip in XSLT Specification</a> * @param i Index of WhiteSpaceInfo to get * @return WhiteSpaceInfo at given index * @throws ArrayIndexOutOfBoundsException 
public	TokenNamepublic	
WhiteSpaceInfo	TokenNameIdentifier	 White Space Info
getStripSpace	TokenNameIdentifier	 get Strip Space
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_whitespaceStrippingElements	TokenNameIdentifier	 m whitespace Stripping Elements
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
WhiteSpaceInfo	TokenNameIdentifier	 White Space Info
)	TokenNameRPAREN	
m_whitespaceStrippingElements	TokenNameIdentifier	 m whitespace Stripping Elements
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the number of "xsl:strip-space" properties. * @see <a href="http://www.w3.org/TR/xslt#strip">strip in XSLT Specification</a> * * @return the number of "xsl:strip-space" properties. */	TokenNameCOMMENT_JAVADOC	 Get the number of "xsl:strip-space" properties. @see <a href="http://www.w3.org/TR/xslt#strip">strip in XSLT Specification</a> * @return the number of "xsl:strip-space" properties. 
public	TokenNamepublic	
int	TokenNameint	
getStripSpaceCount	TokenNameIdentifier	 get Strip Space Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_whitespaceStrippingElements	TokenNameIdentifier	 m whitespace Stripping Elements
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_whitespaceStrippingElements	TokenNameIdentifier	 m whitespace Stripping Elements
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The "xsl:preserve-space" property, * A lookup table of all space preserving elements. * @serial */	TokenNameCOMMENT_JAVADOC	 The "xsl:preserve-space" property, A lookup table of all space preserving elements. @serial 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
m_whitespacePreservingElements	TokenNameIdentifier	 m whitespace Preserving Elements
;	TokenNameSEMICOLON	
/** * Set the "xsl:preserve-space" property. * @see <a href="http://www.w3.org/TR/xslt#strip">strip in XSLT Specification</a> * * @param wsi WhiteSpaceInfo element to add to list */	TokenNameCOMMENT_JAVADOC	 Set the "xsl:preserve-space" property. @see <a href="http://www.w3.org/TR/xslt#strip">strip in XSLT Specification</a> * @param wsi WhiteSpaceInfo element to add to list 
public	TokenNamepublic	
void	TokenNamevoid	
setPreserveSpaces	TokenNameIdentifier	 set Preserve Spaces
(	TokenNameLPAREN	
WhiteSpaceInfo	TokenNameIdentifier	 White Space Info
wsi	TokenNameIdentifier	 wsi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_whitespacePreservingElements	TokenNameIdentifier	 m whitespace Preserving Elements
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_whitespacePreservingElements	TokenNameIdentifier	 m whitespace Preserving Elements
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_whitespacePreservingElements	TokenNameIdentifier	 m whitespace Preserving Elements
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
wsi	TokenNameIdentifier	 wsi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a "xsl:preserve-space" property. * @see <a href="http://www.w3.org/TR/xslt#strip">strip in XSLT Specification</a> * * @param i Index of WhiteSpaceInfo to get * * @return WhiteSpaceInfo at the given index * * @throws ArrayIndexOutOfBoundsException */	TokenNameCOMMENT_JAVADOC	 Get a "xsl:preserve-space" property. @see <a href="http://www.w3.org/TR/xslt#strip">strip in XSLT Specification</a> * @param i Index of WhiteSpaceInfo to get * @return WhiteSpaceInfo at the given index * @throws ArrayIndexOutOfBoundsException 
public	TokenNamepublic	
WhiteSpaceInfo	TokenNameIdentifier	 White Space Info
getPreserveSpace	TokenNameIdentifier	 get Preserve Space
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_whitespacePreservingElements	TokenNameIdentifier	 m whitespace Preserving Elements
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
WhiteSpaceInfo	TokenNameIdentifier	 White Space Info
)	TokenNameRPAREN	
m_whitespacePreservingElements	TokenNameIdentifier	 m whitespace Preserving Elements
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the number of "xsl:preserve-space" properties. * @see <a href="http://www.w3.org/TR/xslt#strip">strip in XSLT Specification</a> * * @return the number of "xsl:preserve-space" properties. */	TokenNameCOMMENT_JAVADOC	 Get the number of "xsl:preserve-space" properties. @see <a href="http://www.w3.org/TR/xslt#strip">strip in XSLT Specification</a> * @return the number of "xsl:preserve-space" properties. 
public	TokenNamepublic	
int	TokenNameint	
getPreserveSpaceCount	TokenNameIdentifier	 get Preserve Space Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_whitespacePreservingElements	TokenNameIdentifier	 m whitespace Preserving Elements
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_whitespacePreservingElements	TokenNameIdentifier	 m whitespace Preserving Elements
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The "xsl:output" properties. This is a vector of OutputProperties objects. * @serial */	TokenNameCOMMENT_JAVADOC	 The "xsl:output" properties. This is a vector of OutputProperties objects. @serial 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
m_output	TokenNameIdentifier	 m output
;	TokenNameSEMICOLON	
/** * Set the "xsl:output" property. * @see <a href="http://www.w3.org/TR/xslt#output">output in XSLT Specification</a> * * @param v non-null reference to the OutputProperties object to be * added to the collection. */	TokenNameCOMMENT_JAVADOC	 Set the "xsl:output" property. @see <a href="http://www.w3.org/TR/xslt#output">output in XSLT Specification</a> * @param v non-null reference to the OutputProperties object to be added to the collection. 
public	TokenNamepublic	
void	TokenNamevoid	
setOutput	TokenNameIdentifier	 set Output
(	TokenNameLPAREN	
OutputProperties	TokenNameIdentifier	 Output Properties
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_output	TokenNameIdentifier	 m output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_output	TokenNameIdentifier	 m output
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_output	TokenNameIdentifier	 m output
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an "xsl:output" property. * @see <a href="http://www.w3.org/TR/xslt#output">output in XSLT Specification</a> * * @param i Index of OutputFormatExtended to get * * @return non-null reference to an OutputProperties object. * * @throws ArrayIndexOutOfBoundsException */	TokenNameCOMMENT_JAVADOC	 Get an "xsl:output" property. @see <a href="http://www.w3.org/TR/xslt#output">output in XSLT Specification</a> * @param i Index of OutputFormatExtended to get * @return non-null reference to an OutputProperties object. * @throws ArrayIndexOutOfBoundsException 
public	TokenNamepublic	
OutputProperties	TokenNameIdentifier	 Output Properties
getOutput	TokenNameIdentifier	 get Output
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_output	TokenNameIdentifier	 m output
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
OutputProperties	TokenNameIdentifier	 Output Properties
)	TokenNameRPAREN	
m_output	TokenNameIdentifier	 m output
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the number of "xsl:output" properties. * @see <a href="http://www.w3.org/TR/xslt#output">output in XSLT Specification</a> * * @return The number of OutputProperties objects contained in this stylesheet. */	TokenNameCOMMENT_JAVADOC	 Get the number of "xsl:output" properties. @see <a href="http://www.w3.org/TR/xslt#output">output in XSLT Specification</a> * @return The number of OutputProperties objects contained in this stylesheet. 
public	TokenNamepublic	
int	TokenNameint	
getOutputCount	TokenNameIdentifier	 get Output Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_output	TokenNameIdentifier	 m output
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_output	TokenNameIdentifier	 m output
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The "xsl:key" property. * @serial */	TokenNameCOMMENT_JAVADOC	 The "xsl:key" property. @serial 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
m_keyDeclarations	TokenNameIdentifier	 m key Declarations
;	TokenNameSEMICOLON	
/** * Set the "xsl:key" property. * @see <a href="http://www.w3.org/TR/xslt#key">key in XSLT Specification</a> * * @param v KeyDeclaration element to add to the list of key declarations */	TokenNameCOMMENT_JAVADOC	 Set the "xsl:key" property. @see <a href="http://www.w3.org/TR/xslt#key">key in XSLT Specification</a> * @param v KeyDeclaration element to add to the list of key declarations 
public	TokenNamepublic	
void	TokenNamevoid	
setKey	TokenNameIdentifier	 set Key
(	TokenNameLPAREN	
KeyDeclaration	TokenNameIdentifier	 Key Declaration
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_keyDeclarations	TokenNameIdentifier	 m key Declarations
)	TokenNameRPAREN	
m_keyDeclarations	TokenNameIdentifier	 m key Declarations
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_keyDeclarations	TokenNameIdentifier	 m key Declarations
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an "xsl:key" property. * @see <a href="http://www.w3.org/TR/xslt#key">key in XSLT Specification</a> * * @param i Index of KeyDeclaration element to get * * @return KeyDeclaration element at given index in list * * @throws ArrayIndexOutOfBoundsException */	TokenNameCOMMENT_JAVADOC	 Get an "xsl:key" property. @see <a href="http://www.w3.org/TR/xslt#key">key in XSLT Specification</a> * @param i Index of KeyDeclaration element to get * @return KeyDeclaration element at given index in list * @throws ArrayIndexOutOfBoundsException 
public	TokenNamepublic	
KeyDeclaration	TokenNameIdentifier	 Key Declaration
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_keyDeclarations	TokenNameIdentifier	 m key Declarations
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
KeyDeclaration	TokenNameIdentifier	 Key Declaration
)	TokenNameRPAREN	
m_keyDeclarations	TokenNameIdentifier	 m key Declarations
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the number of "xsl:key" properties. * @see <a href="http://www.w3.org/TR/xslt#key">key in XSLT Specification</a> * * @return the number of "xsl:key" properties. */	TokenNameCOMMENT_JAVADOC	 Get the number of "xsl:key" properties. @see <a href="http://www.w3.org/TR/xslt#key">key in XSLT Specification</a> * @return the number of "xsl:key" properties. 
public	TokenNamepublic	
int	TokenNameint	
getKeyCount	TokenNameIdentifier	 get Key Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_keyDeclarations	TokenNameIdentifier	 m key Declarations
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_keyDeclarations	TokenNameIdentifier	 m key Declarations
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The "xsl:attribute-set" property. * @serial */	TokenNameCOMMENT_JAVADOC	 The "xsl:attribute-set" property. @serial 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
m_attributeSets	TokenNameIdentifier	 m attribute Sets
;	TokenNameSEMICOLON	
/** * Set the "xsl:attribute-set" property. * @see <a href="http://www.w3.org/TR/xslt#attribute-sets">attribute-sets in XSLT Specification</a> * * @param attrSet ElemAttributeSet to add to the list of attribute sets */	TokenNameCOMMENT_JAVADOC	 Set the "xsl:attribute-set" property. @see <a href="http://www.w3.org/TR/xslt#attribute-sets">attribute-sets in XSLT Specification</a> * @param attrSet ElemAttributeSet to add to the list of attribute sets 
public	TokenNamepublic	
void	TokenNamevoid	
setAttributeSet	TokenNameIdentifier	 set Attribute Set
(	TokenNameLPAREN	
ElemAttributeSet	TokenNameIdentifier	 Elem Attribute Set
attrSet	TokenNameIdentifier	 attr Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_attributeSets	TokenNameIdentifier	 m attribute Sets
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_attributeSets	TokenNameIdentifier	 m attribute Sets
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_attributeSets	TokenNameIdentifier	 m attribute Sets
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
attrSet	TokenNameIdentifier	 attr Set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an "xsl:attribute-set" property. * @see <a href="http://www.w3.org/TR/xslt#attribute-sets">attribute-sets in XSLT Specification</a> * * @param i Index of ElemAttributeSet to get in list * * @return ElemAttributeSet at the given index * * @throws ArrayIndexOutOfBoundsException */	TokenNameCOMMENT_JAVADOC	 Get an "xsl:attribute-set" property. @see <a href="http://www.w3.org/TR/xslt#attribute-sets">attribute-sets in XSLT Specification</a> * @param i Index of ElemAttributeSet to get in list * @return ElemAttributeSet at the given index * @throws ArrayIndexOutOfBoundsException 
public	TokenNamepublic	
ElemAttributeSet	TokenNameIdentifier	 Elem Attribute Set
getAttributeSet	TokenNameIdentifier	 get Attribute Set
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_attributeSets	TokenNameIdentifier	 m attribute Sets
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
ElemAttributeSet	TokenNameIdentifier	 Elem Attribute Set
)	TokenNameRPAREN	
m_attributeSets	TokenNameIdentifier	 m attribute Sets
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the number of "xsl:attribute-set" properties. * @see <a href="http://www.w3.org/TR/xslt#attribute-sets">attribute-sets in XSLT Specification</a> * * @return the number of "xsl:attribute-set" properties. */	TokenNameCOMMENT_JAVADOC	 Get the number of "xsl:attribute-set" properties. @see <a href="http://www.w3.org/TR/xslt#attribute-sets">attribute-sets in XSLT Specification</a> * @return the number of "xsl:attribute-set" properties. 
public	TokenNamepublic	
int	TokenNameint	
getAttributeSetCount	TokenNameIdentifier	 get Attribute Set Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_attributeSets	TokenNameIdentifier	 m attribute Sets
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_attributeSets	TokenNameIdentifier	 m attribute Sets
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The "xsl:variable" and "xsl:param" properties. * @serial */	TokenNameCOMMENT_JAVADOC	 The "xsl:variable" and "xsl:param" properties. @serial 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
m_topLevelVariables	TokenNameIdentifier	 m top Level Variables
;	TokenNameSEMICOLON	
/** * Set the "xsl:variable" property. * @see <a href="http://www.w3.org/TR/xslt#top-level-variables">top-level-variables in XSLT Specification</a> * * @param v ElemVariable object to add to list of top level variables */	TokenNameCOMMENT_JAVADOC	 Set the "xsl:variable" property. @see <a href="http://www.w3.org/TR/xslt#top-level-variables">top-level-variables in XSLT Specification</a> * @param v ElemVariable object to add to list of top level variables 
public	TokenNamepublic	
void	TokenNamevoid	
setVariable	TokenNameIdentifier	 set Variable
(	TokenNameLPAREN	
ElemVariable	TokenNameIdentifier	 Elem Variable
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_topLevelVariables	TokenNameIdentifier	 m top Level Variables
)	TokenNameRPAREN	
m_topLevelVariables	TokenNameIdentifier	 m top Level Variables
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_topLevelVariables	TokenNameIdentifier	 m top Level Variables
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an "xsl:variable" or "xsl:param" property. * @see <a href="http://www.w3.org/TR/xslt#top-level-variables">top-level-variables in XSLT Specification</a> * * @param qname non-null reference to the qualified name of the variable. * * @return The ElemVariable with the given name in the list or null */	TokenNameCOMMENT_JAVADOC	 Get an "xsl:variable" or "xsl:param" property. @see <a href="http://www.w3.org/TR/xslt#top-level-variables">top-level-variables in XSLT Specification</a> * @param qname non-null reference to the qualified name of the variable. * @return The ElemVariable with the given name in the list or null 
public	TokenNamepublic	
ElemVariable	TokenNameIdentifier	 Elem Variable
getVariableOrParam	TokenNameIdentifier	 get Variable Or Param
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_topLevelVariables	TokenNameIdentifier	 m top Level Variables
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
getVariableOrParamCount	TokenNameIdentifier	 get Variable Or Param Count
(	TokenNameLPAREN	
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
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemVariable	TokenNameIdentifier	 Elem Variable
var	TokenNameIdentifier	 var
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemVariable	TokenNameIdentifier	 Elem Variable
)	TokenNameRPAREN	
getVariableOrParam	TokenNameIdentifier	 get Variable Or Param
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
var	TokenNameIdentifier	 var
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
var	TokenNameIdentifier	 var
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an "xsl:variable" property. * @see <a href="http://www.w3.org/TR/xslt#top-level-variables">top-level-variables in XSLT Specification</a> * * @param qname Qualified name of the xsl:variable to get * * @return reference to the variable named by qname, or null if not found. */	TokenNameCOMMENT_JAVADOC	 Get an "xsl:variable" property. @see <a href="http://www.w3.org/TR/xslt#top-level-variables">top-level-variables in XSLT Specification</a> * @param qname Qualified name of the xsl:variable to get * @return reference to the variable named by qname, or null if not found. 
public	TokenNamepublic	
ElemVariable	TokenNameIdentifier	 Elem Variable
getVariable	TokenNameIdentifier	 get Variable
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_topLevelVariables	TokenNameIdentifier	 m top Level Variables
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
getVariableOrParamCount	TokenNameIdentifier	 get Variable Or Param Count
(	TokenNameLPAREN	
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
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemVariable	TokenNameIdentifier	 Elem Variable
var	TokenNameIdentifier	 var
=	TokenNameEQUAL	
getVariableOrParam	TokenNameIdentifier	 get Variable Or Param
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
var	TokenNameIdentifier	 var
.	TokenNameDOT	
getXSLToken	TokenNameIdentifier	 get XSL Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_VARIABLE	TokenNameIdentifier	 ELEMNAME  VARIABLE
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
var	TokenNameIdentifier	 var
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
var	TokenNameIdentifier	 var
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an "xsl:variable" property. * @see <a href="http://www.w3.org/TR/xslt#top-level-variables">top-level-variables in XSLT Specification</a> * * @param i Index of variable to get in the list * * @return ElemVariable at the given index in the list * * @throws ArrayIndexOutOfBoundsException */	TokenNameCOMMENT_JAVADOC	 Get an "xsl:variable" property. @see <a href="http://www.w3.org/TR/xslt#top-level-variables">top-level-variables in XSLT Specification</a> * @param i Index of variable to get in the list * @return ElemVariable at the given index in the list * @throws ArrayIndexOutOfBoundsException 
public	TokenNamepublic	
ElemVariable	TokenNameIdentifier	 Elem Variable
getVariableOrParam	TokenNameIdentifier	 get Variable Or Param
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_topLevelVariables	TokenNameIdentifier	 m top Level Variables
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
ElemVariable	TokenNameIdentifier	 Elem Variable
)	TokenNameRPAREN	
m_topLevelVariables	TokenNameIdentifier	 m top Level Variables
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the number of "xsl:variable" properties. * @see <a href="http://www.w3.org/TR/xslt#top-level-variables">top-level-variables in XSLT Specification</a> * * @return the number of "xsl:variable" properties. */	TokenNameCOMMENT_JAVADOC	 Get the number of "xsl:variable" properties. @see <a href="http://www.w3.org/TR/xslt#top-level-variables">top-level-variables in XSLT Specification</a> * @return the number of "xsl:variable" properties. 
public	TokenNamepublic	
int	TokenNameint	
getVariableOrParamCount	TokenNameIdentifier	 get Variable Or Param Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_topLevelVariables	TokenNameIdentifier	 m top Level Variables
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_topLevelVariables	TokenNameIdentifier	 m top Level Variables
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set an "xsl:param" property. * @see <a href="http://www.w3.org/TR/xslt#top-level-variables">top-level-variables in XSLT Specification</a> * * @param v A non-null ElemParam reference. */	TokenNameCOMMENT_JAVADOC	 Set an "xsl:param" property. @see <a href="http://www.w3.org/TR/xslt#top-level-variables">top-level-variables in XSLT Specification</a> * @param v A non-null ElemParam reference. 
public	TokenNamepublic	
void	TokenNamevoid	
setParam	TokenNameIdentifier	 set Param
(	TokenNameLPAREN	
ElemParam	TokenNameIdentifier	 Elem Param
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setVariable	TokenNameIdentifier	 set Variable
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an "xsl:param" property. * @see <a href="http://www.w3.org/TR/xslt#top-level-variables">top-level-variables in XSLT Specification</a> * * @param qname non-null reference to qualified name of the parameter. * * @return ElemParam with the given name in the list or null */	TokenNameCOMMENT_JAVADOC	 Get an "xsl:param" property. @see <a href="http://www.w3.org/TR/xslt#top-level-variables">top-level-variables in XSLT Specification</a> * @param qname non-null reference to qualified name of the parameter. * @return ElemParam with the given name in the list or null 
public	TokenNamepublic	
ElemParam	TokenNameIdentifier	 Elem Param
getParam	TokenNameIdentifier	 get Param
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_topLevelVariables	TokenNameIdentifier	 m top Level Variables
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
getVariableOrParamCount	TokenNameIdentifier	 get Variable Or Param Count
(	TokenNameLPAREN	
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
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemVariable	TokenNameIdentifier	 Elem Variable
var	TokenNameIdentifier	 var
=	TokenNameEQUAL	
getVariableOrParam	TokenNameIdentifier	 get Variable Or Param
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
var	TokenNameIdentifier	 var
.	TokenNameDOT	
getXSLToken	TokenNameIdentifier	 get XSL Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_PARAMVARIABLE	TokenNameIdentifier	 ELEMNAME  PARAMVARIABLE
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
var	TokenNameIdentifier	 var
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
ElemParam	TokenNameIdentifier	 Elem Param
)	TokenNameRPAREN	
var	TokenNameIdentifier	 var
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The "xsl:template" properties. * @serial */	TokenNameCOMMENT_JAVADOC	 The "xsl:template" properties. @serial 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
m_templates	TokenNameIdentifier	 m templates
;	TokenNameSEMICOLON	
/** * Set an "xsl:template" property. * @see <a href="http://www.w3.org/TR/xslt#section-Defining-Template-Rules">section-Defining-Template-Rules in XSLT Specification</a> * * @param v ElemTemplate to add to list of templates */	TokenNameCOMMENT_JAVADOC	 Set an "xsl:template" property. @see <a href="http://www.w3.org/TR/xslt#section-Defining-Template-Rules">section-Defining-Template-Rules in XSLT Specification</a> * @param v ElemTemplate to add to list of templates 
public	TokenNamepublic	
void	TokenNamevoid	
setTemplate	TokenNameIdentifier	 set Template
(	TokenNameLPAREN	
ElemTemplate	TokenNameIdentifier	 Elem Template
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_templates	TokenNameIdentifier	 m templates
)	TokenNameRPAREN	
m_templates	TokenNameIdentifier	 m templates
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_templates	TokenNameIdentifier	 m templates
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
setStylesheet	TokenNameIdentifier	 set Stylesheet
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an "xsl:template" property. * @see <a href="http://www.w3.org/TR/xslt#section-Defining-Template-Rules">section-Defining-Template-Rules in XSLT Specification</a> * * @param i Index of ElemTemplate in the list to get * * @return ElemTemplate at the given index in the list * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Get an "xsl:template" property. @see <a href="http://www.w3.org/TR/xslt#section-Defining-Template-Rules">section-Defining-Template-Rules in XSLT Specification</a> * @param i Index of ElemTemplate in the list to get * @return ElemTemplate at the given index in the list * @throws TransformerException 
public	TokenNamepublic	
ElemTemplate	TokenNameIdentifier	 Elem Template
getTemplate	TokenNameIdentifier	 get Template
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_templates	TokenNameIdentifier	 m templates
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
ElemTemplate	TokenNameIdentifier	 Elem Template
)	TokenNameRPAREN	
m_templates	TokenNameIdentifier	 m templates
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the number of "xsl:template" properties. * @see <a href="http://www.w3.org/TR/xslt#section-Defining-Template-Rules">section-Defining-Template-Rules in XSLT Specification</a> * * @return the number of "xsl:template" properties. */	TokenNameCOMMENT_JAVADOC	 Get the number of "xsl:template" properties. @see <a href="http://www.w3.org/TR/xslt#section-Defining-Template-Rules">section-Defining-Template-Rules in XSLT Specification</a> * @return the number of "xsl:template" properties. 
public	TokenNamepublic	
int	TokenNameint	
getTemplateCount	TokenNameIdentifier	 get Template Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_templates	TokenNameIdentifier	 m templates
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_templates	TokenNameIdentifier	 m templates
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The "xsl:namespace-alias" properties. * @serial */	TokenNameCOMMENT_JAVADOC	 The "xsl:namespace-alias" properties. @serial 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
m_prefix_aliases	TokenNameIdentifier	 m prefix aliases
;	TokenNameSEMICOLON	
/** * Set the "xsl:namespace-alias" property. * @see <a href="http://www.w3.org/TR/xslt#literal-result-element">literal-result-element in XSLT Specification</a> * * @param na NamespaceAlias elemeent to add to the list */	TokenNameCOMMENT_JAVADOC	 Set the "xsl:namespace-alias" property. @see <a href="http://www.w3.org/TR/xslt#literal-result-element">literal-result-element in XSLT Specification</a> * @param na NamespaceAlias elemeent to add to the list 
public	TokenNamepublic	
void	TokenNamevoid	
setNamespaceAlias	TokenNameIdentifier	 set Namespace Alias
(	TokenNameLPAREN	
NamespaceAlias	TokenNameIdentifier	 Namespace Alias
na	TokenNameIdentifier	 na
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_prefix_aliases	TokenNameIdentifier	 m prefix aliases
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_prefix_aliases	TokenNameIdentifier	 m prefix aliases
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_prefix_aliases	TokenNameIdentifier	 m prefix aliases
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
na	TokenNameIdentifier	 na
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an "xsl:namespace-alias" property. * @see <a href="http://www.w3.org/TR/xslt#literal-result-element">literal-result-element in XSLT Specification</a> * * @param i Index of NamespaceAlias element to get from the list * * @return NamespaceAlias element at the given index in the list * * @throws ArrayIndexOutOfBoundsException */	TokenNameCOMMENT_JAVADOC	 Get an "xsl:namespace-alias" property. @see <a href="http://www.w3.org/TR/xslt#literal-result-element">literal-result-element in XSLT Specification</a> * @param i Index of NamespaceAlias element to get from the list * @return NamespaceAlias element at the given index in the list * @throws ArrayIndexOutOfBoundsException 
public	TokenNamepublic	
NamespaceAlias	TokenNameIdentifier	 Namespace Alias
getNamespaceAlias	TokenNameIdentifier	 get Namespace Alias
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_prefix_aliases	TokenNameIdentifier	 m prefix aliases
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
NamespaceAlias	TokenNameIdentifier	 Namespace Alias
)	TokenNameRPAREN	
m_prefix_aliases	TokenNameIdentifier	 m prefix aliases
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the number of "xsl:namespace-alias" properties. * @see <a href="http://www.w3.org/TR/xslt#top-level-variables">top-level-variables in XSLT Specification</a> * * @return the number of "xsl:namespace-alias" properties. */	TokenNameCOMMENT_JAVADOC	 Get the number of "xsl:namespace-alias" properties. @see <a href="http://www.w3.org/TR/xslt#top-level-variables">top-level-variables in XSLT Specification</a> * @return the number of "xsl:namespace-alias" properties. 
public	TokenNamepublic	
int	TokenNameint	
getNamespaceAliasCount	TokenNameIdentifier	 get Namespace Alias Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_prefix_aliases	TokenNameIdentifier	 m prefix aliases
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_prefix_aliases	TokenNameIdentifier	 m prefix aliases
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The "non-xsl-top-level" properties. * @serial */	TokenNameCOMMENT_JAVADOC	 The "non-xsl-top-level" properties. @serial 
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
m_NonXslTopLevel	TokenNameIdentifier	 m  Non Xsl Top Level
;	TokenNameSEMICOLON	
/** * Set found a non-xslt element. * @see <a href="http://www.w3.org/TR/xslt#stylesheet-element">stylesheet-element in XSLT Specification</a> * * @param name Qualified name of the element * @param obj The element object */	TokenNameCOMMENT_JAVADOC	 Set found a non-xslt element. @see <a href="http://www.w3.org/TR/xslt#stylesheet-element">stylesheet-element in XSLT Specification</a> * @param name Qualified name of the element @param obj The element object 
public	TokenNamepublic	
void	TokenNamevoid	
setNonXslTopLevel	TokenNameIdentifier	 set Non Xsl Top Level
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_NonXslTopLevel	TokenNameIdentifier	 m  Non Xsl Top Level
)	TokenNameRPAREN	
m_NonXslTopLevel	TokenNameIdentifier	 m  Non Xsl Top Level
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_NonXslTopLevel	TokenNameIdentifier	 m  Non Xsl Top Level
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a non-xslt element. * @see <a href="http://www.w3.org/TR/xslt#stylesheet-element">stylesheet-element in XSLT Specification</a> * * @param name Qualified name of the element to get * * @return The object associate with the given name */	TokenNameCOMMENT_JAVADOC	 Get a non-xslt element. @see <a href="http://www.w3.org/TR/xslt#stylesheet-element">stylesheet-element in XSLT Specification</a> * @param name Qualified name of the element to get * @return The object associate with the given name 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getNonXslTopLevel	TokenNameIdentifier	 get Non Xsl Top Level
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_NonXslTopLevel	TokenNameIdentifier	 m  Non Xsl Top Level
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_NonXslTopLevel	TokenNameIdentifier	 m  Non Xsl Top Level
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// =========== End top-level XSLT properties =========== 	TokenNameCOMMENT_LINE	=========== End top-level XSLT properties =========== 
/** * The base URL of the XSL document. * @serial */	TokenNameCOMMENT_JAVADOC	 The base URL of the XSL document. @serial 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_href	TokenNameIdentifier	 m href
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** The doctype-public element. * @serial */	TokenNameCOMMENT_JAVADOC	 The doctype-public element. @serial 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_publicId	TokenNameIdentifier	 m public Id
;	TokenNameSEMICOLON	
/** The doctype-system element. * @serial */	TokenNameCOMMENT_JAVADOC	 The doctype-system element. @serial 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_systemId	TokenNameIdentifier	 m system Id
;	TokenNameSEMICOLON	
/** * Get the base identifier with which this stylesheet is associated. * * @return the base identifier with which this stylesheet is associated. */	TokenNameCOMMENT_JAVADOC	 Get the base identifier with which this stylesheet is associated. * @return the base identifier with which this stylesheet is associated. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getHref	TokenNameIdentifier	 get Href
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_href	TokenNameIdentifier	 m href
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the base identifier with which this stylesheet is associated. * * @param baseIdent the base identifier with which this stylesheet is associated. */	TokenNameCOMMENT_JAVADOC	 Set the base identifier with which this stylesheet is associated. * @param baseIdent the base identifier with which this stylesheet is associated. 
public	TokenNamepublic	
void	TokenNamevoid	
setHref	TokenNameIdentifier	 set Href
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
baseIdent	TokenNameIdentifier	 base Ident
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_href	TokenNameIdentifier	 m href
=	TokenNameEQUAL	
baseIdent	TokenNameIdentifier	 base Ident
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the location information for this element. * * @param locator SourceLocator object with location information */	TokenNameCOMMENT_JAVADOC	 Set the location information for this element. * @param locator SourceLocator object with location information 
public	TokenNamepublic	
void	TokenNamevoid	
setLocaterInfo	TokenNameIdentifier	 set Locater Info
(	TokenNameLPAREN	
SourceLocator	TokenNameIdentifier	 Source Locator
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_publicId	TokenNameIdentifier	 m public Id
=	TokenNameEQUAL	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_systemId	TokenNameIdentifier	 m system Id
=	TokenNameEQUAL	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_systemId	TokenNameIdentifier	 m system Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
m_href	TokenNameIdentifier	 m href
=	TokenNameEQUAL	
SystemIDResolver	TokenNameIdentifier	 System ID Resolver
.	TokenNameDOT	
getAbsoluteURI	TokenNameIdentifier	 get Absolute URI
(	TokenNameLPAREN	
m_systemId	TokenNameIdentifier	 m system Id
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Ignore this for right now 	TokenNameCOMMENT_LINE	Ignore this for right now 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setLocaterInfo	TokenNameIdentifier	 set Locater Info
(	TokenNameLPAREN	
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The root of the stylesheet, where all the tables common * to all stylesheets are kept. * @serial */	TokenNameCOMMENT_JAVADOC	 The root of the stylesheet, where all the tables common to all stylesheets are kept. @serial 
private	TokenNameprivate	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
m_stylesheetRoot	TokenNameIdentifier	 m stylesheet Root
;	TokenNameSEMICOLON	
/** * Get the root of the stylesheet, where all the tables common * to all stylesheets are kept. * * @return the root of the stylesheet */	TokenNameCOMMENT_JAVADOC	 Get the root of the stylesheet, where all the tables common to all stylesheets are kept. * @return the root of the stylesheet 
public	TokenNamepublic	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
getStylesheetRoot	TokenNameIdentifier	 get Stylesheet Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_stylesheetRoot	TokenNameIdentifier	 m stylesheet Root
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the root of the stylesheet, where all the tables common * to all stylesheets are kept. * * @param v the root of the stylesheet */	TokenNameCOMMENT_JAVADOC	 Set the root of the stylesheet, where all the tables common to all stylesheets are kept. * @param v the root of the stylesheet 
public	TokenNamepublic	
void	TokenNamevoid	
setStylesheetRoot	TokenNameIdentifier	 set Stylesheet Root
(	TokenNameLPAREN	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_stylesheetRoot	TokenNameIdentifier	 m stylesheet Root
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The parent of the stylesheet. This will be null if this * is the root stylesheet. * @serial */	TokenNameCOMMENT_JAVADOC	 The parent of the stylesheet. This will be null if this is the root stylesheet. @serial 
private	TokenNameprivate	
Stylesheet	TokenNameIdentifier	 Stylesheet
m_stylesheetParent	TokenNameIdentifier	 m stylesheet Parent
;	TokenNameSEMICOLON	
/** * Get the parent of the stylesheet. This will be null if this * is the root stylesheet. * * @return the parent of the stylesheet. */	TokenNameCOMMENT_JAVADOC	 Get the parent of the stylesheet. This will be null if this is the root stylesheet. * @return the parent of the stylesheet. 
public	TokenNamepublic	
Stylesheet	TokenNameIdentifier	 Stylesheet
getStylesheetParent	TokenNameIdentifier	 get Stylesheet Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_stylesheetParent	TokenNameIdentifier	 m stylesheet Parent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the parent of the stylesheet. This should be null if this * is the root stylesheet. * * @param v the parent of the stylesheet. */	TokenNameCOMMENT_JAVADOC	 Set the parent of the stylesheet. This should be null if this is the root stylesheet. * @param v the parent of the stylesheet. 
public	TokenNamepublic	
void	TokenNamevoid	
setStylesheetParent	TokenNameIdentifier	 set Stylesheet Parent
(	TokenNameLPAREN	
Stylesheet	TokenNameIdentifier	 Stylesheet
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_stylesheetParent	TokenNameIdentifier	 m stylesheet Parent
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the owning aggregated stylesheet, or this * stylesheet if it is aggregated. * * @return the owning aggregated stylesheet or itself */	TokenNameCOMMENT_JAVADOC	 Get the owning aggregated stylesheet, or this stylesheet if it is aggregated. * @return the owning aggregated stylesheet or itself 
public	TokenNamepublic	
StylesheetComposed	TokenNameIdentifier	 Stylesheet Composed
getStylesheetComposed	TokenNameIdentifier	 get Stylesheet Composed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Stylesheet	TokenNameIdentifier	 Stylesheet
sheet	TokenNameIdentifier	 sheet
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
sheet	TokenNameIdentifier	 sheet
.	TokenNameDOT	
isAggregatedType	TokenNameIdentifier	 is Aggregated Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sheet	TokenNameIdentifier	 sheet
=	TokenNameEQUAL	
sheet	TokenNameIdentifier	 sheet
.	TokenNameDOT	
getStylesheetParent	TokenNameIdentifier	 get Stylesheet Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
StylesheetComposed	TokenNameIdentifier	 Stylesheet Composed
)	TokenNameRPAREN	
sheet	TokenNameIdentifier	 sheet
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the type of the node. We'll pretend we're a Document. * * @return the type of the node: document node. */	TokenNameCOMMENT_JAVADOC	 Get the type of the node. We'll pretend we're a Document. * @return the type of the node: document node. 
public	TokenNamepublic	
short	TokenNameshort	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an integer representation of the element type. * * @return An integer representation of the element, defined in the * Constants class. * @see org.apache.xalan.templates.Constants */	TokenNameCOMMENT_JAVADOC	 Get an integer representation of the element type. * @return An integer representation of the element, defined in the Constants class. @see org.apache.xalan.templates.Constants 
public	TokenNamepublic	
int	TokenNameint	
getXSLToken	TokenNameIdentifier	 get XSL Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_STYLESHEET	TokenNameIdentifier	 ELEMNAME  STYLESHEET
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the node name. * * @return The node name */	TokenNameCOMMENT_JAVADOC	 Return the node name. * @return The node name 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_STYLESHEET_STRING	TokenNameIdentifier	 ELEMNAME  STYLESHEET  STRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Replace an "xsl:template" property. * This is a hook for CompilingStylesheetHandler, to allow * us to access a template, compile it, instantiate it, * and replace the original with the compiled instance. * ADDED 9/5/2000 to support compilation experiment * * @param v Compiled template to replace with * @param i Index of template to be replaced * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Replace an "xsl:template" property. This is a hook for CompilingStylesheetHandler, to allow us to access a template, compile it, instantiate it, and replace the original with the compiled instance. ADDED 9/5/2000 to support compilation experiment * @param v Compiled template to replace with @param i Index of template to be replaced * @throws TransformerException 
public	TokenNamepublic	
void	TokenNamevoid	
replaceTemplate	TokenNameIdentifier	 replace Template
(	TokenNameLPAREN	
ElemTemplate	TokenNameIdentifier	 Elem Template
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_templates	TokenNameIdentifier	 m templates
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
replaceChild	TokenNameIdentifier	 replace Child
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
)	TokenNameRPAREN	
m_templates	TokenNameIdentifier	 m templates
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_templates	TokenNameIdentifier	 m templates
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
setStylesheet	TokenNameIdentifier	 set Stylesheet
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Call the children visitors. * @param visitor The visitor whose appropriate method will be called. */	TokenNameCOMMENT_JAVADOC	 Call the children visitors. @param visitor The visitor whose appropriate method will be called. 
protected	TokenNameprotected	
void	TokenNamevoid	
callChildVisitors	TokenNameIdentifier	 call Child Visitors
(	TokenNameLPAREN	
XSLTVisitor	TokenNameIdentifier	 XSLT Visitor
visitor	TokenNameIdentifier	 visitor
,	TokenNameCOMMA	
boolean	TokenNameboolean	
callAttrs	TokenNameIdentifier	 call Attrs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
getImportCount	TokenNameIdentifier	 get Import Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getImport	TokenNameIdentifier	 get Import
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
.	TokenNameDOT	
callVisitors	TokenNameIdentifier	 call Visitors
(	TokenNameLPAREN	
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
getIncludeCount	TokenNameIdentifier	 get Include Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getInclude	TokenNameIdentifier	 get Include
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
.	TokenNameDOT	
callVisitors	TokenNameIdentifier	 call Visitors
(	TokenNameLPAREN	
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
getOutputCount	TokenNameIdentifier	 get Output Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
visitor	TokenNameIdentifier	 visitor
.	TokenNameDOT	
visitTopLevelInstruction	TokenNameIdentifier	 visit Top Level Instruction
(	TokenNameLPAREN	
getOutput	TokenNameIdentifier	 get Output
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Next, add in the attribute-set elements 	TokenNameCOMMENT_LINE	Next, add in the attribute-set elements 
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
getAttributeSetCount	TokenNameIdentifier	 get Attribute Set Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemAttributeSet	TokenNameIdentifier	 Elem Attribute Set
attrSet	TokenNameIdentifier	 attr Set
=	TokenNameEQUAL	
getAttributeSet	TokenNameIdentifier	 get Attribute Set
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
visitor	TokenNameIdentifier	 visitor
.	TokenNameDOT	
visitTopLevelInstruction	TokenNameIdentifier	 visit Top Level Instruction
(	TokenNameLPAREN	
attrSet	TokenNameIdentifier	 attr Set
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attrSet	TokenNameIdentifier	 attr Set
.	TokenNameDOT	
callChildVisitors	TokenNameIdentifier	 call Child Visitors
(	TokenNameLPAREN	
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Now the decimal-formats 	TokenNameCOMMENT_LINE	Now the decimal-formats 
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
getDecimalFormatCount	TokenNameIdentifier	 get Decimal Format Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
visitor	TokenNameIdentifier	 visitor
.	TokenNameDOT	
visitTopLevelInstruction	TokenNameIdentifier	 visit Top Level Instruction
(	TokenNameLPAREN	
getDecimalFormat	TokenNameIdentifier	 get Decimal Format
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Now the keys 	TokenNameCOMMENT_LINE	Now the keys 
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
getKeyCount	TokenNameIdentifier	 get Key Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
visitor	TokenNameIdentifier	 visitor
.	TokenNameDOT	
visitTopLevelInstruction	TokenNameIdentifier	 visit Top Level Instruction
(	TokenNameLPAREN	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// And the namespace aliases 	TokenNameCOMMENT_LINE	And the namespace aliases 
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
getNamespaceAliasCount	TokenNameIdentifier	 get Namespace Alias Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
visitor	TokenNameIdentifier	 visitor
.	TokenNameDOT	
visitTopLevelInstruction	TokenNameIdentifier	 visit Top Level Instruction
(	TokenNameLPAREN	
getNamespaceAlias	TokenNameIdentifier	 get Namespace Alias
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Next comes the templates 	TokenNameCOMMENT_LINE	Next comes the templates 
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
getTemplateCount	TokenNameIdentifier	 get Template Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ElemTemplate	TokenNameIdentifier	 Elem Template
template	TokenNameIdentifier	 template
=	TokenNameEQUAL	
getTemplate	TokenNameIdentifier	 get Template
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
visitor	TokenNameIdentifier	 visitor
.	TokenNameDOT	
visitTopLevelInstruction	TokenNameIdentifier	 visit Top Level Instruction
(	TokenNameLPAREN	
template	TokenNameIdentifier	 template
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
template	TokenNameIdentifier	 template
.	TokenNameDOT	
callChildVisitors	TokenNameIdentifier	 call Child Visitors
(	TokenNameLPAREN	
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
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
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Then, the variables 	TokenNameCOMMENT_LINE	Then, the variables 
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
getVariableOrParamCount	TokenNameIdentifier	 get Variable Or Param Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemVariable	TokenNameIdentifier	 Elem Variable
var	TokenNameIdentifier	 var
=	TokenNameEQUAL	
getVariableOrParam	TokenNameIdentifier	 get Variable Or Param
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
visitor	TokenNameIdentifier	 visitor
.	TokenNameDOT	
visitTopLevelVariableOrParamDecl	TokenNameIdentifier	 visit Top Level Variable Or Param Decl
(	TokenNameLPAREN	
var	TokenNameIdentifier	 var
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
var	TokenNameIdentifier	 var
.	TokenNameDOT	
callChildVisitors	TokenNameIdentifier	 call Child Visitors
(	TokenNameLPAREN	
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// And lastly the whitespace preserving and stripping elements 	TokenNameCOMMENT_LINE	And lastly the whitespace preserving and stripping elements 
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
getStripSpaceCount	TokenNameIdentifier	 get Strip Space Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
visitor	TokenNameIdentifier	 visitor
.	TokenNameDOT	
visitTopLevelInstruction	TokenNameIdentifier	 visit Top Level Instruction
(	TokenNameLPAREN	
getStripSpace	TokenNameIdentifier	 get Strip Space
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
getPreserveSpaceCount	TokenNameIdentifier	 get Preserve Space Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
visitor	TokenNameIdentifier	 visitor
.	TokenNameDOT	
visitTopLevelInstruction	TokenNameIdentifier	 visit Top Level Instruction
(	TokenNameLPAREN	
getPreserveSpace	TokenNameIdentifier	 get Preserve Space
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_NonXslTopLevel	TokenNameIdentifier	 m  Non Xsl Top Level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
elements	TokenNameIdentifier	 elements
=	TokenNameEQUAL	
m_NonXslTopLevel	TokenNameIdentifier	 m  Non Xsl Top Level
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
elements	TokenNameIdentifier	 elements
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
elem	TokenNameIdentifier	 elem
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
)	TokenNameRPAREN	
elements	TokenNameIdentifier	 elements
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
visitor	TokenNameIdentifier	 visitor
.	TokenNameDOT	
visitTopLevelInstruction	TokenNameIdentifier	 visit Top Level Instruction
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
callChildVisitors	TokenNameIdentifier	 call Child Visitors
(	TokenNameLPAREN	
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Accept a visitor and call the appropriate method * for this class. * * @param visitor The visitor whose appropriate method will be called. * @return true if the children of the object should be visited. */	TokenNameCOMMENT_JAVADOC	 Accept a visitor and call the appropriate method for this class. * @param visitor The visitor whose appropriate method will be called. @return true if the children of the object should be visited. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
XSLTVisitor	TokenNameIdentifier	 XSLT Visitor
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
visitor	TokenNameIdentifier	 visitor
.	TokenNameDOT	
visitStylesheet	TokenNameIdentifier	 visit Stylesheet
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
