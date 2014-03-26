/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: Method.java 468654 2006-10-28 07:09:23Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: Method.java 468654 2006-10-28 07:09:23Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
;	TokenNameSEMICOLON	
/** * This class defines the constants which are the names of the four default * output methods. * <p> * The default output methods defined are: * <ul> * <li>XML * <li>TEXT * <li>HTML * </ul> * These constants can be used as an argument to the * OutputPropertiesFactory.getDefaultMethodProperties() method to get * the properties to create a serializer. * * This class is a public API. * * @see OutputPropertiesFactory * @see Serializer * * @xsl.usage general */	TokenNameCOMMENT_JAVADOC	 This class defines the constants which are the names of the four default output methods. <p> The default output methods defined are: <ul> <li>XML <li>TEXT <li>HTML </ul> These constants can be used as an argument to the OutputPropertiesFactory.getDefaultMethodProperties() method to get the properties to create a serializer. * This class is a public API. * @see OutputPropertiesFactory @see Serializer * @xsl.usage general 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
Method	TokenNameIdentifier	 Method
{	TokenNameLBRACE	
/** * A private constructor to prevent the creation of such a class. */	TokenNameCOMMENT_JAVADOC	 A private constructor to prevent the creation of such a class. 
private	TokenNameprivate	
Method	TokenNameIdentifier	 Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * The output method type for XML documents: <tt>xml</tt>. */	TokenNameCOMMENT_JAVADOC	 The output method type for XML documents: <tt>xml</tt>. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XML	TokenNameIdentifier	 XML
=	TokenNameEQUAL	
"xml"	TokenNameStringLiteral	xml
;	TokenNameSEMICOLON	
/** * The output method type for HTML documents: <tt>html</tt>. */	TokenNameCOMMENT_JAVADOC	 The output method type for HTML documents: <tt>html</tt>. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HTML	TokenNameIdentifier	 HTML
=	TokenNameEQUAL	
"html"	TokenNameStringLiteral	html
;	TokenNameSEMICOLON	
/** * The output method for XHTML documents: <tt>xhtml</tt>. * <p> * This method type is not currently supported. */	TokenNameCOMMENT_JAVADOC	 The output method for XHTML documents: <tt>xhtml</tt>. <p> This method type is not currently supported. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XHTML	TokenNameIdentifier	 XHTML
=	TokenNameEQUAL	
"xhtml"	TokenNameStringLiteral	xhtml
;	TokenNameSEMICOLON	
/** * The output method type for text documents: <tt>text</tt>. */	TokenNameCOMMENT_JAVADOC	 The output method type for text documents: <tt>text</tt>. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TEXT	TokenNameIdentifier	 TEXT
=	TokenNameEQUAL	
"text"	TokenNameStringLiteral	text
;	TokenNameSEMICOLON	
/** * The "internal" method, just used when no method is * specified in the style sheet, and a serializer of this type wraps either an * XML or HTML type (depending on the first tag in the output being html or * not) */	TokenNameCOMMENT_JAVADOC	 The "internal" method, just used when no method is specified in the style sheet, and a serializer of this type wraps either an XML or HTML type (depending on the first tag in the output being html or not) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UNKNOWN	TokenNameIdentifier	 UNKNOWN
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
