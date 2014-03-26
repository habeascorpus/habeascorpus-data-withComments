/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
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
IOException	TokenNameIdentifier	 IO Exception
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
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
;	TokenNameSEMICOLON	
/** * This class describes the XML resources needed to use the various batik * modules. * * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> * @version $Id: XMLResourceDescriptor.java 478169 2006-11-22 14:23:24Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class describes the XML resources needed to use the various batik modules. * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> @version $Id: XMLResourceDescriptor.java 478169 2006-11-22 14:23:24Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
XMLResourceDescriptor	TokenNameIdentifier	 XML Resource Descriptor
{	TokenNameLBRACE	
/** * The XML parser class name key. */	TokenNameCOMMENT_JAVADOC	 The XML parser class name key. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XML_PARSER_CLASS_NAME_KEY	TokenNameIdentifier	 XML  PARSER  CLASS  NAME  KEY
=	TokenNameEQUAL	
"org.xml.sax.driver"	TokenNameStringLiteral	org.xml.sax.driver
;	TokenNameSEMICOLON	
/** * The CSS parser class name key. */	TokenNameCOMMENT_JAVADOC	 The CSS parser class name key. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CSS_PARSER_CLASS_NAME_KEY	TokenNameIdentifier	 CSS  PARSER  CLASS  NAME  KEY
=	TokenNameEQUAL	
"org.w3c.css.sac.driver"	TokenNameStringLiteral	org.w3c.css.sac.driver
;	TokenNameSEMICOLON	
/** * The resources file name */	TokenNameCOMMENT_JAVADOC	 The resources file name 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
RESOURCES	TokenNameIdentifier	 RESOURCES
=	TokenNameEQUAL	
"resources/XMLResourceDescriptor.properties"	TokenNameStringLiteral	resources/XMLResourceDescriptor.properties
;	TokenNameSEMICOLON	
/** * The resource bundle */	TokenNameCOMMENT_JAVADOC	 The resource bundle 
protected	TokenNameprotected	
static	TokenNamestatic	
Properties	TokenNameIdentifier	 Properties
parserProps	TokenNameIdentifier	 parser Props
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * The class name of the XML parser to use. */	TokenNameCOMMENT_JAVADOC	 The class name of the XML parser to use. 
protected	TokenNameprotected	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
xmlParserClassName	TokenNameIdentifier	 xml Parser Class Name
;	TokenNameSEMICOLON	
/** * The class name of the CSS parser to use. */	TokenNameCOMMENT_JAVADOC	 The class name of the CSS parser to use. 
protected	TokenNameprotected	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
cssParserClassName	TokenNameIdentifier	 css Parser Class Name
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
synchronized	TokenNamesynchronized	
Properties	TokenNameIdentifier	 Properties
getParserProps	TokenNameIdentifier	 get Parser Props
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
parserProps	TokenNameIdentifier	 parser Props
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
parserProps	TokenNameIdentifier	 parser Props
;	TokenNameSEMICOLON	
parserProps	TokenNameIdentifier	 parser Props
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
cls	TokenNameIdentifier	 cls
=	TokenNameEQUAL	
XMLResourceDescriptor	TokenNameIdentifier	 XML Resource Descriptor
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
cls	TokenNameIdentifier	 cls
.	TokenNameDOT	
getResourceAsStream	TokenNameIdentifier	 get Resource As Stream
(	TokenNameLPAREN	
RESOURCES	TokenNameIdentifier	 RESOURCES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parserProps	TokenNameIdentifier	 parser Props
.	TokenNameDOT	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
(	TokenNameLPAREN	
ioe	TokenNameIdentifier	 ioe
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
RESOURCES	TokenNameIdentifier	 RESOURCES
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
parserProps	TokenNameIdentifier	 parser Props
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the class name of the XML parser to use. * * <p>This method first checks if any XML parser has been specified using * the <tt>setXMLParserClassName</tt> method. If any, this method will * return the value of the property 'org.xml.sax.driver' specified in the * <tt>resources/XMLResourceDescriptor.properties</tt> resource file. */	TokenNameCOMMENT_JAVADOC	 Returns the class name of the XML parser to use. * <p>This method first checks if any XML parser has been specified using the <tt>setXMLParserClassName</tt> method. If any, this method will return the value of the property 'org.xml.sax.driver' specified in the <tt>resources/XMLResourceDescriptor.properties</tt> resource file. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getXMLParserClassName	TokenNameIdentifier	 get XML Parser Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
xmlParserClassName	TokenNameIdentifier	 xml Parser Class Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
xmlParserClassName	TokenNameIdentifier	 xml Parser Class Name
=	TokenNameEQUAL	
getParserProps	TokenNameIdentifier	 get Parser Props
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
XML_PARSER_CLASS_NAME_KEY	TokenNameIdentifier	 XML  PARSER  CLASS  NAME  KEY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
xmlParserClassName	TokenNameIdentifier	 xml Parser Class Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the class name of the XML parser to use. * * @param xmlParserClassName the classname of the XML parser */	TokenNameCOMMENT_JAVADOC	 Sets the class name of the XML parser to use. * @param xmlParserClassName the classname of the XML parser 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
setXMLParserClassName	TokenNameIdentifier	 set XML Parser Class Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
xmlParserClassName	TokenNameIdentifier	 xml Parser Class Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XMLResourceDescriptor	TokenNameIdentifier	 XML Resource Descriptor
.	TokenNameDOT	
xmlParserClassName	TokenNameIdentifier	 xml Parser Class Name
=	TokenNameEQUAL	
xmlParserClassName	TokenNameIdentifier	 xml Parser Class Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the class name of the CSS parser to use. * * <p>This method first checks if any CSS parser has been * specified using the <tt>setCSSParserClassName</tt> method. If * any, this method will return the value of the property * 'org.w3c.css.sac.driver' specified in the * <tt>resources/XMLResourceDescriptor.properties</tt> resource * file. */	TokenNameCOMMENT_JAVADOC	 Returns the class name of the CSS parser to use. * <p>This method first checks if any CSS parser has been specified using the <tt>setCSSParserClassName</tt> method. If any, this method will return the value of the property 'org.w3c.css.sac.driver' specified in the <tt>resources/XMLResourceDescriptor.properties</tt> resource file. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getCSSParserClassName	TokenNameIdentifier	 get CSS Parser Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cssParserClassName	TokenNameIdentifier	 css Parser Class Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cssParserClassName	TokenNameIdentifier	 css Parser Class Name
=	TokenNameEQUAL	
getParserProps	TokenNameIdentifier	 get Parser Props
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
CSS_PARSER_CLASS_NAME_KEY	TokenNameIdentifier	 CSS  PARSER  CLASS  NAME  KEY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
cssParserClassName	TokenNameIdentifier	 css Parser Class Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the class name of the CSS parser to use. * * @param cssParserClassName the classname of the CSS parser */	TokenNameCOMMENT_JAVADOC	 Sets the class name of the CSS parser to use. * @param cssParserClassName the classname of the CSS parser 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
setCSSParserClassName	TokenNameIdentifier	 set CSS Parser Class Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
cssParserClassName	TokenNameIdentifier	 css Parser Class Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XMLResourceDescriptor	TokenNameIdentifier	 XML Resource Descriptor
.	TokenNameDOT	
cssParserClassName	TokenNameIdentifier	 css Parser Class Name
=	TokenNameEQUAL	
cssParserClassName	TokenNameIdentifier	 css Parser Class Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
