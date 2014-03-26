/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
Constants	TokenNameIdentifier	 Constants
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
XMLInputSource	TokenNameIdentifier	 XML Input Source
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
XMLParserConfiguration	TokenNameIdentifier	 XML Parser Configuration
;	TokenNameSEMICOLON	
/** * Base class of all XML-related parsers. * <p> * In addition to the features and properties recognized by the parser * configuration, this parser recognizes these additional features and * properties: * <ul> * <li>Properties * <ul> * <li>http://apache.org/xml/properties/internal/error-handler</li> * <li>http://apache.org/xml/properties/internal/entity-resolver</li> * </ul> * </ul> * * @author Arnaud Le Hors, IBM * @author Andy Clark, IBM * * @version $Id: XMLParser.java 699985 2008-09-29 04:29:03Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Base class of all XML-related parsers. <p> In addition to the features and properties recognized by the parser configuration, this parser recognizes these additional features and properties: <ul> <li>Properties <ul> <li>http://apache.org/xml/properties/internal/error-handler</li> <li>http://apache.org/xml/properties/internal/entity-resolver</li> </ul> </ul> * @author Arnaud Le Hors, IBM @author Andy Clark, IBM * @version $Id: XMLParser.java 699985 2008-09-29 04:29:03Z mrglavas $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
XMLParser	TokenNameIdentifier	 XML Parser
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
// properties 	TokenNameCOMMENT_LINE	properties 
/** Property identifier: entity resolver. */	TokenNameCOMMENT_JAVADOC	 Property identifier: entity resolver. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ENTITY_RESOLVER	TokenNameIdentifier	 ENTITY  RESOLVER
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_PROPERTY_PREFIX	TokenNameIdentifier	 XERCES  PROPERTY  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ENTITY_RESOLVER_PROPERTY	TokenNameIdentifier	 ENTITY  RESOLVER  PROPERTY
;	TokenNameSEMICOLON	
/** Property identifier: error handler. */	TokenNameCOMMENT_JAVADOC	 Property identifier: error handler. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_HANDLER	TokenNameIdentifier	 ERROR  HANDLER
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_PROPERTY_PREFIX	TokenNameIdentifier	 XERCES  PROPERTY  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ERROR_HANDLER_PROPERTY	TokenNameIdentifier	 ERROR  HANDLER  PROPERTY
;	TokenNameSEMICOLON	
/** Recognized properties. */	TokenNameCOMMENT_JAVADOC	 Recognized properties. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
RECOGNIZED_PROPERTIES	TokenNameIdentifier	 RECOGNIZED  PROPERTIES
=	TokenNameEQUAL	
{	TokenNameLBRACE	
ENTITY_RESOLVER	TokenNameIdentifier	 ENTITY  RESOLVER
,	TokenNameCOMMA	
ERROR_HANDLER	TokenNameIdentifier	 ERROR  HANDLER
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** The parser configuration. */	TokenNameCOMMENT_JAVADOC	 The parser configuration. 
protected	TokenNameprotected	
final	TokenNamefinal	
XMLParserConfiguration	TokenNameIdentifier	 XML Parser Configuration
fConfiguration	TokenNameIdentifier	 f Configuration
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** * Default Constructor. */	TokenNameCOMMENT_JAVADOC	 Default Constructor. 
protected	TokenNameprotected	
XMLParser	TokenNameIdentifier	 XML Parser
(	TokenNameLPAREN	
XMLParserConfiguration	TokenNameIdentifier	 XML Parser Configuration
config	TokenNameIdentifier	 config
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// save configuration 	TokenNameCOMMENT_LINE	save configuration 
fConfiguration	TokenNameIdentifier	 f Configuration
=	TokenNameEQUAL	
config	TokenNameIdentifier	 config
;	TokenNameSEMICOLON	
// add default recognized properties 	TokenNameCOMMENT_LINE	add default recognized properties 
fConfiguration	TokenNameIdentifier	 f Configuration
.	TokenNameDOT	
addRecognizedProperties	TokenNameIdentifier	 add Recognized Properties
(	TokenNameLPAREN	
RECOGNIZED_PROPERTIES	TokenNameIdentifier	 RECOGNIZED  PROPERTIES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(XMLParserConfiguration) 	TokenNameCOMMENT_LINE	<init>(XMLParserConfiguration) 
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
/** * parse * * @param inputSource * * @exception XNIException * @exception java.io.IOException */	TokenNameCOMMENT_JAVADOC	 parse * @param inputSource * @exception XNIException @exception java.io.IOException 
public	TokenNamepublic	
void	TokenNamevoid	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
XMLInputSource	TokenNameIdentifier	 XML Input Source
inputSource	TokenNameIdentifier	 input Source
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fConfiguration	TokenNameIdentifier	 f Configuration
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
inputSource	TokenNameIdentifier	 input Source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// parse(XMLInputSource) 	TokenNameCOMMENT_LINE	parse(XMLInputSource) 
// 	TokenNameCOMMENT_LINE	 
// Protected methods 	TokenNameCOMMENT_LINE	Protected methods 
// 	TokenNameCOMMENT_LINE	 
/** * reset all components before parsing */	TokenNameCOMMENT_JAVADOC	 reset all components before parsing 
protected	TokenNameprotected	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// reset() 	TokenNameCOMMENT_LINE	reset() 
}	TokenNameRBRACE	
// class XMLParser 	TokenNameCOMMENT_LINE	class XMLParser 
