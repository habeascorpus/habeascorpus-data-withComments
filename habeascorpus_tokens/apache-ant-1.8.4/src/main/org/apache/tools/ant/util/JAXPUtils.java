/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
DocumentBuilder	TokenNameIdentifier	 Document Builder
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
FactoryConfigurationError	TokenNameIdentifier	 Factory Configuration Error
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
SAXParser	TokenNameIdentifier	 SAX Parser
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
SAXParserFactory	TokenNameIdentifier	 SAX Parser Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
Parser	TokenNameIdentifier	 Parser
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
XMLReader	TokenNameIdentifier	 XML Reader
;	TokenNameSEMICOLON	
// CheckStyle:HideUtilityClassConstructorCheck OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:HideUtilityClassConstructorCheck OFF - bc 
/** * Collection of helper methods that retrieve a ParserFactory or * Parsers and Readers. * * <p>This class will create only a single factory instance.</p> * * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Collection of helper methods that retrieve a ParserFactory or Parsers and Readers. * <p>This class will create only a single factory instance.</p> * @since Ant 1.5 
public	TokenNamepublic	
class	TokenNameclass	
JAXPUtils	TokenNameIdentifier	 JAXP Utils
{	TokenNameLBRACE	
/** * Helper for systemId. * * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Helper for systemId. * @since Ant 1.6 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
FileUtils	TokenNameIdentifier	 File Utils
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
=	TokenNameEQUAL	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
getFileUtils	TokenNameIdentifier	 get File Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Parser factory to use to create parsers. * @see #getParserFactory * * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Parser factory to use to create parsers. @see #getParserFactory * @since Ant 1.5 
private	TokenNameprivate	
static	TokenNamestatic	
SAXParserFactory	TokenNameIdentifier	 SAX Parser Factory
parserFactory	TokenNameIdentifier	 parser Factory
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Parser Factory to create Namespace aware parsers. * * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Parser Factory to create Namespace aware parsers. * @since Ant 1.6 
private	TokenNameprivate	
static	TokenNamestatic	
SAXParserFactory	TokenNameIdentifier	 SAX Parser Factory
nsParserFactory	TokenNameIdentifier	 ns Parser Factory
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Parser factory to use to create document builders. * * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Parser factory to use to create document builders. * @since Ant 1.6 
private	TokenNameprivate	
static	TokenNamestatic	
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
builderFactory	TokenNameIdentifier	 builder Factory
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Returns the parser factory to use. Only one parser factory is * ever created by this method and is then cached for future use. * * @return a SAXParserFactory to use. * @throws BuildException on error. * * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Returns the parser factory to use. Only one parser factory is ever created by this method and is then cached for future use. * @return a SAXParserFactory to use. @throws BuildException on error. * @since Ant 1.5 
public	TokenNamepublic	
static	TokenNamestatic	
synchronized	TokenNamesynchronized	
SAXParserFactory	TokenNameIdentifier	 SAX Parser Factory
getParserFactory	TokenNameIdentifier	 get Parser Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
parserFactory	TokenNameIdentifier	 parser Factory
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parserFactory	TokenNameIdentifier	 parser Factory
=	TokenNameEQUAL	
newParserFactory	TokenNameIdentifier	 new Parser Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
parserFactory	TokenNameIdentifier	 parser Factory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the parser factory to use to create namespace aware parsers. * * @return a SAXParserFactory to use which supports manufacture of * namespace aware parsers. * @throws BuildException on error. * * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Returns the parser factory to use to create namespace aware parsers. * @return a SAXParserFactory to use which supports manufacture of namespace aware parsers. @throws BuildException on error. * @since Ant 1.6 
public	TokenNamepublic	
static	TokenNamestatic	
synchronized	TokenNamesynchronized	
SAXParserFactory	TokenNameIdentifier	 SAX Parser Factory
getNSParserFactory	TokenNameIdentifier	 get NS Parser Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nsParserFactory	TokenNameIdentifier	 ns Parser Factory
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nsParserFactory	TokenNameIdentifier	 ns Parser Factory
=	TokenNameEQUAL	
newParserFactory	TokenNameIdentifier	 new Parser Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nsParserFactory	TokenNameIdentifier	 ns Parser Factory
.	TokenNameDOT	
setNamespaceAware	TokenNameIdentifier	 set Namespace Aware
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
nsParserFactory	TokenNameIdentifier	 ns Parser Factory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a new parser factory instance. * * @return the parser factory. * @throws BuildException on error. * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Returns a new parser factory instance. * @return the parser factory. @throws BuildException on error. @since Ant 1.5 
public	TokenNamepublic	
static	TokenNamestatic	
SAXParserFactory	TokenNameIdentifier	 SAX Parser Factory
newParserFactory	TokenNameIdentifier	 new Parser Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
SAXParserFactory	TokenNameIdentifier	 SAX Parser Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
FactoryConfigurationError	TokenNameIdentifier	 Factory Configuration Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"XML parser factory has not been "	TokenNameStringLiteral	XML parser factory has not been 
+	TokenNamePLUS	
"configured correctly: "	TokenNameStringLiteral	configured correctly: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns a newly created SAX 1 Parser, using the default parser * factory. * * @return a SAX 1 Parser. * @throws BuildException on error. * @see #getParserFactory * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Returns a newly created SAX 1 Parser, using the default parser factory. * @return a SAX 1 Parser. @throws BuildException on error. @see #getParserFactory @since Ant 1.5 
public	TokenNamepublic	
static	TokenNamestatic	
Parser	TokenNameIdentifier	 Parser
getParser	TokenNameIdentifier	 get Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSAXParser	TokenNameIdentifier	 new SAX Parser
(	TokenNameLPAREN	
getParserFactory	TokenNameIdentifier	 get Parser Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getParser	TokenNameIdentifier	 get Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
convertToBuildException	TokenNameIdentifier	 convert To Build Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns a newly created SAX 2 XMLReader, using the default parser * factory. * * @return a SAX 2 XMLReader. * @throws BuildException on error. * @see #getParserFactory * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Returns a newly created SAX 2 XMLReader, using the default parser factory. * @return a SAX 2 XMLReader. @throws BuildException on error. @see #getParserFactory @since Ant 1.5 
public	TokenNamepublic	
static	TokenNamestatic	
XMLReader	TokenNameIdentifier	 XML Reader
getXMLReader	TokenNameIdentifier	 get XML Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSAXParser	TokenNameIdentifier	 new SAX Parser
(	TokenNameLPAREN	
getParserFactory	TokenNameIdentifier	 get Parser Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getXMLReader	TokenNameIdentifier	 get XML Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
convertToBuildException	TokenNameIdentifier	 convert To Build Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns a newly created SAX 2 XMLReader, which is namespace aware * * @return a SAX 2 XMLReader. * @throws BuildException on error. * @see #getParserFactory * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Returns a newly created SAX 2 XMLReader, which is namespace aware * @return a SAX 2 XMLReader. @throws BuildException on error. @see #getParserFactory @since Ant 1.6 
public	TokenNamepublic	
static	TokenNamestatic	
XMLReader	TokenNameIdentifier	 XML Reader
getNamespaceXMLReader	TokenNameIdentifier	 get Namespace XML Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
newSAXParser	TokenNameIdentifier	 new SAX Parser
(	TokenNameLPAREN	
getNSParserFactory	TokenNameIdentifier	 get NS Parser Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getXMLReader	TokenNameIdentifier	 get XML Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
convertToBuildException	TokenNameIdentifier	 convert To Build Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This is a best attempt to provide a URL.toExternalForm() from * a file URL. Some parsers like Crimson choke on uri that are made of * backslashed paths (ie windows) as it is does not conform * URI specifications. * @param file the file to create the system id from. * @return the systemid corresponding to the given file. * @since Ant 1.5.2 */	TokenNameCOMMENT_JAVADOC	 This is a best attempt to provide a URL.toExternalForm() from a file URL. Some parsers like Crimson choke on uri that are made of backslashed paths (ie windows) as it is does not conform URI specifications. @param file the file to create the system id from. @return the systemid corresponding to the given file. @since Ant 1.5.2 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
toURI	TokenNameIdentifier	 to URI
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a newly created DocumentBuilder. * * @return a DocumentBuilder. * @throws BuildException on error. * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Returns a newly created DocumentBuilder. * @return a DocumentBuilder. @throws BuildException on error. @since Ant 1.6 
public	TokenNamepublic	
static	TokenNamestatic	
DocumentBuilder	TokenNameIdentifier	 Document Builder
getDocumentBuilder	TokenNameIdentifier	 get Document Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
getDocumentBuilderFactory	TokenNameIdentifier	 get Document Builder Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
newDocumentBuilder	TokenNameIdentifier	 new Document Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @return a new SAXParser instance as helper for getParser and * getXMLReader. * * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 @return a new SAXParser instance as helper for getParser and getXMLReader. * @since Ant 1.5 
private	TokenNameprivate	
static	TokenNamestatic	
SAXParser	TokenNameIdentifier	 SAX Parser
newSAXParser	TokenNameIdentifier	 new SAX Parser
(	TokenNameLPAREN	
SAXParserFactory	TokenNameIdentifier	 SAX Parser Factory
factory	TokenNameIdentifier	 factory
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
newSAXParser	TokenNameIdentifier	 new SAX Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Cannot create parser for the given "	TokenNameStringLiteral	Cannot create parser for the given 
+	TokenNamePLUS	
"configuration: "	TokenNameStringLiteral	configuration: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
convertToBuildException	TokenNameIdentifier	 convert To Build Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Translate a SAXException into a BuildException * * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Translate a SAXException into a BuildException * @since Ant 1.5 
private	TokenNameprivate	
static	TokenNamestatic	
BuildException	TokenNameIdentifier	 Build Exception
convertToBuildException	TokenNameIdentifier	 convert To Build Exception
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Exception	TokenNameIdentifier	 Exception
nested	TokenNameIdentifier	 nested
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nested	TokenNameIdentifier	 nested
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
nested	TokenNameIdentifier	 nested
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Obtains the default builder factory if not already. * * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Obtains the default builder factory if not already. * @since Ant 1.6 
private	TokenNameprivate	
static	TokenNamestatic	
synchronized	TokenNamesynchronized	
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
getDocumentBuilderFactory	TokenNameIdentifier	 get Document Builder Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
builderFactory	TokenNameIdentifier	 builder Factory
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
builderFactory	TokenNameIdentifier	 builder Factory
=	TokenNameEQUAL	
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
FactoryConfigurationError	TokenNameIdentifier	 Factory Configuration Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Document builder factory has not "	TokenNameStringLiteral	Document builder factory has not 
+	TokenNamePLUS	
"been configured correctly: "	TokenNameStringLiteral	been configured correctly: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
builderFactory	TokenNameIdentifier	 builder Factory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
