/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: TransformerFactoryImpl.java 577935 2007-09-20 21:35:20Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: TransformerFactoryImpl.java 577935 2007-09-20 21:35:20Z minchau $ 
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileInputStream	TokenNameIdentifier	 File Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FilenameFilter	TokenNameIdentifier	 Filename Filter
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
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
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
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
ZipEntry	TokenNameIdentifier	 Zip Entry
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
ZipFile	TokenNameIdentifier	 Zip File
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
SourceLoader	TokenNameIdentifier	 Source Loader
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
XSLTC	TokenNameIdentifier	 XSLTC
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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
XSLTCDTMManager	TokenNameIdentifier	 XSLTCDTM Manager
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
StopParseException	TokenNameIdentifier	 Stop Parse Exception
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
StylesheetPIHandler	TokenNameIdentifier	 Stylesheet PI Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
InputSource	TokenNameIdentifier	 Input Source
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
XMLReader	TokenNameIdentifier	 XML Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
XMLReaderFactory	TokenNameIdentifier	 XML Reader Factory
;	TokenNameSEMICOLON	
/** * Implementation of a JAXP1.1 TransformerFactory for Translets. * @author G. Todd Miller * @author Morten Jorgensen * @author Santiago Pericas-Geertsen */	TokenNameCOMMENT_JAVADOC	 Implementation of a JAXP1.1 TransformerFactory for Translets. @author G. Todd Miller @author Morten Jorgensen @author Santiago Pericas-Geertsen 
public	TokenNamepublic	
class	TokenNameclass	
TransformerFactoryImpl	TokenNameIdentifier	 Transformer Factory Impl
extends	TokenNameextends	
SAXTransformerFactory	TokenNameIdentifier	 SAX Transformer Factory
implements	TokenNameimplements	
SourceLoader	TokenNameIdentifier	 Source Loader
,	TokenNameCOMMA	
ErrorListener	TokenNameIdentifier	 Error Listener
{	TokenNameLBRACE	
// Public constants for attributes supported by the XSLTC TransformerFactory. 	TokenNameCOMMENT_LINE	Public constants for attributes supported by the XSLTC TransformerFactory. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
TRANSLET_NAME	TokenNameIdentifier	 TRANSLET  NAME
=	TokenNameEQUAL	
"translet-name"	TokenNameStringLiteral	translet-name
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
DESTINATION_DIRECTORY	TokenNameIdentifier	 DESTINATION  DIRECTORY
=	TokenNameEQUAL	
"destination-directory"	TokenNameStringLiteral	destination-directory
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
PACKAGE_NAME	TokenNameIdentifier	 PACKAGE  NAME
=	TokenNameEQUAL	
"package-name"	TokenNameStringLiteral	package-name
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
JAR_NAME	TokenNameIdentifier	 JAR  NAME
=	TokenNameEQUAL	
"jar-name"	TokenNameStringLiteral	jar-name
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
GENERATE_TRANSLET	TokenNameIdentifier	 GENERATE  TRANSLET
=	TokenNameEQUAL	
"generate-translet"	TokenNameStringLiteral	generate-translet
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
AUTO_TRANSLET	TokenNameIdentifier	 AUTO  TRANSLET
=	TokenNameEQUAL	
"auto-translet"	TokenNameStringLiteral	auto-translet
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
USE_CLASSPATH	TokenNameIdentifier	 USE  CLASSPATH
=	TokenNameEQUAL	
"use-classpath"	TokenNameStringLiteral	use-classpath
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
DEBUG	TokenNameIdentifier	 DEBUG
=	TokenNameEQUAL	
"debug"	TokenNameStringLiteral	debug
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
ENABLE_INLINING	TokenNameIdentifier	 ENABLE  INLINING
=	TokenNameEQUAL	
"enable-inlining"	TokenNameStringLiteral	enable-inlining
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
INDENT_NUMBER	TokenNameIdentifier	 INDENT  NUMBER
=	TokenNameEQUAL	
"indent-number"	TokenNameStringLiteral	indent-number
;	TokenNameSEMICOLON	
/** * This error listener is used only for this factory and is not passed to * the Templates or Transformer objects that we create. */	TokenNameCOMMENT_JAVADOC	 This error listener is used only for this factory and is not passed to the Templates or Transformer objects that we create. 
private	TokenNameprivate	
ErrorListener	TokenNameIdentifier	 Error Listener
_errorListener	TokenNameIdentifier	 error Listener
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
/** * This URIResolver is passed to all created Templates and Transformers */	TokenNameCOMMENT_JAVADOC	 This URIResolver is passed to all created Templates and Transformers 
private	TokenNameprivate	
URIResolver	TokenNameIdentifier	 URI Resolver
_uriResolver	TokenNameIdentifier	 uri Resolver
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * As Gregor Samsa awoke one morning from uneasy dreams he found himself * transformed in his bed into a gigantic insect. He was lying on his hard, * as it were armour plated, back, and if he lifted his head a little he * could see his big, brown belly divided into stiff, arched segments, on * top of which the bed quilt could hardly keep in position and was about * to slide off completely. His numerous legs, which were pitifully thin * compared to the rest of his bulk, waved helplessly before his eyes. * "What has happened to me?", he thought. It was no dream.... */	TokenNameCOMMENT_JAVADOC	 As Gregor Samsa awoke one morning from uneasy dreams he found himself transformed in his bed into a gigantic insect. He was lying on his hard, as it were armour plated, back, and if he lifted his head a little he could see his big, brown belly divided into stiff, arched segments, on top of which the bed quilt could hardly keep in position and was about to slide off completely. His numerous legs, which were pitifully thin compared to the rest of his bulk, waved helplessly before his eyes. "What has happened to me?", he thought. It was no dream.... 
protected	TokenNameprotected	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
DEFAULT_TRANSLET_NAME	TokenNameIdentifier	 DEFAULT  TRANSLET  NAME
=	TokenNameEQUAL	
"GregorSamsa"	TokenNameStringLiteral	GregorSamsa
;	TokenNameSEMICOLON	
/** * The class name of the translet */	TokenNameCOMMENT_JAVADOC	 The class name of the translet 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
_transletName	TokenNameIdentifier	 translet Name
=	TokenNameEQUAL	
DEFAULT_TRANSLET_NAME	TokenNameIdentifier	 DEFAULT  TRANSLET  NAME
;	TokenNameSEMICOLON	
/** * The destination directory for the translet */	TokenNameCOMMENT_JAVADOC	 The destination directory for the translet 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
_destinationDirectory	TokenNameIdentifier	 destination Directory
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * The package name prefix for all generated translet classes */	TokenNameCOMMENT_JAVADOC	 The package name prefix for all generated translet classes 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
_packageName	TokenNameIdentifier	 package Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * The jar file name which the translet classes are packaged into */	TokenNameCOMMENT_JAVADOC	 The jar file name which the translet classes are packaged into 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
_jarFileName	TokenNameIdentifier	 jar File Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * This Hashtable is used to store parameters for locating * <?xml-stylesheet ...?> processing instructions in XML docs. */	TokenNameCOMMENT_JAVADOC	 This Hashtable is used to store parameters for locating <?xml-stylesheet ...?> processing instructions in XML docs. 
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
_piParams	TokenNameIdentifier	 pi Params
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * The above hashtable stores objects of this class. */	TokenNameCOMMENT_JAVADOC	 The above hashtable stores objects of this class. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
PIParamWrapper	TokenNameIdentifier	 PI Param Wrapper
{	TokenNameLBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
_media	TokenNameIdentifier	 media
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
_title	TokenNameIdentifier	 title
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
_charset	TokenNameIdentifier	 charset
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
PIParamWrapper	TokenNameIdentifier	 PI Param Wrapper
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
media	TokenNameIdentifier	 media
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
title	TokenNameIdentifier	 title
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
charset	TokenNameIdentifier	 charset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_media	TokenNameIdentifier	 media
=	TokenNameEQUAL	
media	TokenNameIdentifier	 media
;	TokenNameSEMICOLON	
_title	TokenNameIdentifier	 title
=	TokenNameEQUAL	
title	TokenNameIdentifier	 title
;	TokenNameSEMICOLON	
_charset	TokenNameIdentifier	 charset
=	TokenNameEQUAL	
charset	TokenNameIdentifier	 charset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Set to <code>true</code> when debugging is enabled. */	TokenNameCOMMENT_JAVADOC	 Set to <code>true</code> when debugging is enabled. 
private	TokenNameprivate	
boolean	TokenNameboolean	
_debug	TokenNameIdentifier	 debug
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Set to <code>true</code> when templates are inlined. */	TokenNameCOMMENT_JAVADOC	 Set to <code>true</code> when templates are inlined. 
private	TokenNameprivate	
boolean	TokenNameboolean	
_enableInlining	TokenNameIdentifier	 enable Inlining
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Set to <code>true</code> when we want to generate * translet classes from the stylesheet. */	TokenNameCOMMENT_JAVADOC	 Set to <code>true</code> when we want to generate translet classes from the stylesheet. 
private	TokenNameprivate	
boolean	TokenNameboolean	
_generateTranslet	TokenNameIdentifier	 generate Translet
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * If this is set to <code>true</code>, we attempt to use translet classes * for transformation if possible without compiling the stylesheet. The * translet class is only used if its timestamp is newer than the timestamp * of the stylesheet. */	TokenNameCOMMENT_JAVADOC	 If this is set to <code>true</code>, we attempt to use translet classes for transformation if possible without compiling the stylesheet. The translet class is only used if its timestamp is newer than the timestamp of the stylesheet. 
private	TokenNameprivate	
boolean	TokenNameboolean	
_autoTranslet	TokenNameIdentifier	 auto Translet
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * If this is set to <code>true</code>, we attempt to load the translet * from the CLASSPATH. */	TokenNameCOMMENT_JAVADOC	 If this is set to <code>true</code>, we attempt to load the translet from the CLASSPATH. 
private	TokenNameprivate	
boolean	TokenNameboolean	
_useClasspath	TokenNameIdentifier	 use Classpath
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Number of indent spaces when indentation is turned on. */	TokenNameCOMMENT_JAVADOC	 Number of indent spaces when indentation is turned on. 
private	TokenNameprivate	
int	TokenNameint	
_indentNumber	TokenNameIdentifier	 indent Number
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The provider of the XSLTC DTM Manager service. This is fixed for any * instance of this class. In order to change service providers, a new * XSLTC <code>TransformerFactory</code> must be instantiated. * @see XSLTCDTMManager#getDTMManagerClass() */	TokenNameCOMMENT_JAVADOC	 The provider of the XSLTC DTM Manager service. This is fixed for any instance of this class. In order to change service providers, a new XSLTC <code>TransformerFactory</code> must be instantiated. @see XSLTCDTMManager#getDTMManagerClass() 
private	TokenNameprivate	
Class	TokenNameIdentifier	 Class
m_DTMManagerClass	TokenNameIdentifier	 m  DTM Manager Class
;	TokenNameSEMICOLON	
/** * <p>State of secure processing feature.</p> */	TokenNameCOMMENT_JAVADOC	 <p>State of secure processing feature.</p> 
private	TokenNameprivate	
boolean	TokenNameboolean	
_isSecureProcessing	TokenNameIdentifier	 is Secure Processing
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * javax.xml.transform.sax.TransformerFactory implementation. */	TokenNameCOMMENT_JAVADOC	 javax.xml.transform.sax.TransformerFactory implementation. 
public	TokenNamepublic	
TransformerFactoryImpl	TokenNameIdentifier	 Transformer Factory Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_DTMManagerClass	TokenNameIdentifier	 m  DTM Manager Class
=	TokenNameEQUAL	
XSLTCDTMManager	TokenNameIdentifier	 XSLTCDTM Manager
.	TokenNameDOT	
getDTMManagerClass	TokenNameIdentifier	 get DTM Manager Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * javax.xml.transform.sax.TransformerFactory implementation. * Set the error event listener for the TransformerFactory, which is used * for the processing of transformation instructions, and not for the * transformation itself. * * @param listener The error listener to use with the TransformerFactory * @throws IllegalArgumentException */	TokenNameCOMMENT_JAVADOC	 javax.xml.transform.sax.TransformerFactory implementation. Set the error event listener for the TransformerFactory, which is used for the processing of transformation instructions, and not for the transformation itself. * @param listener The error listener to use with the TransformerFactory @throws IllegalArgumentException 
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
if	TokenNameif	
(	TokenNameLPAREN	
listener	TokenNameIdentifier	 listener
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
ERROR_LISTENER_NULL_ERR	TokenNameIdentifier	 ERROR  LISTENER  NULL  ERR
,	TokenNameCOMMA	
"TransformerFactory"	TokenNameStringLiteral	TransformerFactory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_errorListener	TokenNameIdentifier	 error Listener
=	TokenNameEQUAL	
listener	TokenNameIdentifier	 listener
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * javax.xml.transform.sax.TransformerFactory implementation. * Get the error event handler for the TransformerFactory. * * @return The error listener used with the TransformerFactory */	TokenNameCOMMENT_JAVADOC	 javax.xml.transform.sax.TransformerFactory implementation. Get the error event handler for the TransformerFactory. * @return The error listener used with the TransformerFactory 
public	TokenNamepublic	
ErrorListener	TokenNameIdentifier	 Error Listener
getErrorListener	TokenNameIdentifier	 get Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_errorListener	TokenNameIdentifier	 error Listener
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * javax.xml.transform.sax.TransformerFactory implementation. * Returns the value set for a TransformerFactory attribute * * @param name The attribute name * @return An object representing the attribute value * @throws IllegalArgumentException */	TokenNameCOMMENT_JAVADOC	 javax.xml.transform.sax.TransformerFactory implementation. Returns the value set for a TransformerFactory attribute * @param name The attribute name @return An object representing the attribute value @throws IllegalArgumentException 
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
// Return value for attribute 'translet-name' 	TokenNameCOMMENT_LINE	Return value for attribute 'translet-name' 
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
TRANSLET_NAME	TokenNameIdentifier	 TRANSLET  NAME
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_transletName	TokenNameIdentifier	 translet Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
GENERATE_TRANSLET	TokenNameIdentifier	 GENERATE  TRANSLET
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Boolean	TokenNameIdentifier	 Boolean
(	TokenNameLPAREN	
_generateTranslet	TokenNameIdentifier	 generate Translet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
AUTO_TRANSLET	TokenNameIdentifier	 AUTO  TRANSLET
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Boolean	TokenNameIdentifier	 Boolean
(	TokenNameLPAREN	
_autoTranslet	TokenNameIdentifier	 auto Translet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ENABLE_INLINING	TokenNameIdentifier	 ENABLE  INLINING
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_enableInlining	TokenNameIdentifier	 enable Inlining
)	TokenNameRPAREN	
return	TokenNamereturn	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Throw an exception for all other attributes 	TokenNameCOMMENT_LINE	Throw an exception for all other attributes 
ErrorMsg	TokenNameIdentifier	 Error Msg
err	TokenNameIdentifier	 err
=	TokenNameEQUAL	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_INVALID_ATTR_ERR	TokenNameIdentifier	 JAXP  INVALID  ATTR  ERR
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * javax.xml.transform.sax.TransformerFactory implementation. * Sets the value for a TransformerFactory attribute. * * @param name The attribute name * @param value An object representing the attribute value * @throws IllegalArgumentException */	TokenNameCOMMENT_JAVADOC	 javax.xml.transform.sax.TransformerFactory implementation. Sets the value for a TransformerFactory attribute. * @param name The attribute name @param value An object representing the attribute value @throws IllegalArgumentException 
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
// Set the default translet name (ie. class name), which will be used 	TokenNameCOMMENT_LINE	Set the default translet name (ie. class name), which will be used 
// for translets that cannot be given a name from their system-id. 	TokenNameCOMMENT_LINE	for translets that cannot be given a name from their system-id. 
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
TRANSLET_NAME	TokenNameIdentifier	 TRANSLET  NAME
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
value	TokenNameIdentifier	 value
instanceof	TokenNameinstanceof	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_transletName	TokenNameIdentifier	 translet Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
DESTINATION_DIRECTORY	TokenNameIdentifier	 DESTINATION  DIRECTORY
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
value	TokenNameIdentifier	 value
instanceof	TokenNameinstanceof	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_destinationDirectory	TokenNameIdentifier	 destination Directory
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
PACKAGE_NAME	TokenNameIdentifier	 PACKAGE  NAME
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
value	TokenNameIdentifier	 value
instanceof	TokenNameinstanceof	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_packageName	TokenNameIdentifier	 package Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
JAR_NAME	TokenNameIdentifier	 JAR  NAME
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
value	TokenNameIdentifier	 value
instanceof	TokenNameinstanceof	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_jarFileName	TokenNameIdentifier	 jar File Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
GENERATE_TRANSLET	TokenNameIdentifier	 GENERATE  TRANSLET
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
instanceof	TokenNameinstanceof	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_generateTranslet	TokenNameIdentifier	 generate Translet
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
instanceof	TokenNameinstanceof	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_generateTranslet	TokenNameIdentifier	 generate Translet
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"true"	TokenNameStringLiteral	true
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
AUTO_TRANSLET	TokenNameIdentifier	 AUTO  TRANSLET
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
instanceof	TokenNameinstanceof	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_autoTranslet	TokenNameIdentifier	 auto Translet
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
instanceof	TokenNameinstanceof	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_autoTranslet	TokenNameIdentifier	 auto Translet
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"true"	TokenNameStringLiteral	true
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
USE_CLASSPATH	TokenNameIdentifier	 USE  CLASSPATH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
instanceof	TokenNameinstanceof	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_useClasspath	TokenNameIdentifier	 use Classpath
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
instanceof	TokenNameinstanceof	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_useClasspath	TokenNameIdentifier	 use Classpath
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"true"	TokenNameStringLiteral	true
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
instanceof	TokenNameinstanceof	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_debug	TokenNameIdentifier	 debug
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
instanceof	TokenNameinstanceof	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_debug	TokenNameIdentifier	 debug
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"true"	TokenNameStringLiteral	true
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ENABLE_INLINING	TokenNameIdentifier	 ENABLE  INLINING
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
instanceof	TokenNameinstanceof	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_enableInlining	TokenNameIdentifier	 enable Inlining
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
instanceof	TokenNameinstanceof	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_enableInlining	TokenNameIdentifier	 enable Inlining
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"true"	TokenNameStringLiteral	true
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
INDENT_NUMBER	TokenNameIdentifier	 INDENT  NUMBER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
instanceof	TokenNameinstanceof	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
_indentNumber	TokenNameIdentifier	 indent Number
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Falls through 	TokenNameCOMMENT_LINE	Falls through 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
instanceof	TokenNameinstanceof	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_indentNumber	TokenNameIdentifier	 indent Number
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Throw an exception for all other attributes 	TokenNameCOMMENT_LINE	Throw an exception for all other attributes 
final	TokenNamefinal	
ErrorMsg	TokenNameIdentifier	 Error Msg
err	TokenNameIdentifier	 err
=	TokenNameEQUAL	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
JAXP_INVALID_ATTR_ERR	TokenNameIdentifier	 JAXP  INVALID  ATTR  ERR
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Set a feature for this <code>TransformerFactory</code> and <code>Transformer</code>s * or <code>Template</code>s created by this factory.</p> * * <p> * Feature names are fully qualified {@link java.net.URI}s. * Implementations may define their own features. * An {@link TransformerConfigurationException} is thrown if this <code>TransformerFactory</code> or the * <code>Transformer</code>s or <code>Template</code>s it creates cannot support the feature. * It is possible for an <code>TransformerFactory</code> to expose a feature value but be unable to change its state. * </p> * * <p>See {@link javax.xml.transform.TransformerFactory} for full documentation of specific features.</p> * * @param name Feature name. * @param value Is feature state <code>true</code> or <code>false</code>. * * @throws TransformerConfigurationException if this <code>TransformerFactory</code> * or the <code>Transformer</code>s or <code>Template</code>s it creates cannot support this feature. * @throws NullPointerException If the <code>name</code> parameter is null. */	TokenNameCOMMENT_JAVADOC	 <p>Set a feature for this <code>TransformerFactory</code> and <code>Transformer</code>s or <code>Template</code>s created by this factory.</p> * <p> Feature names are fully qualified {@link java.net.URI}s. Implementations may define their own features. An {@link TransformerConfigurationException} is thrown if this <code>TransformerFactory</code> or the <code>Transformer</code>s or <code>Template</code>s it creates cannot support the feature. It is possible for an <code>TransformerFactory</code> to expose a feature value but be unable to change its state. </p> * <p>See {@link javax.xml.transform.TransformerFactory} for full documentation of specific features.</p> * @param name Feature name. @param value Is feature state <code>true</code> or <code>false</code>. * @throws TransformerConfigurationException if this <code>TransformerFactory</code> or the <code>Transformer</code>s or <code>Template</code>s it creates cannot support this feature. @throws NullPointerException If the <code>name</code> parameter is null. 
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
_isSecureProcessing	TokenNameIdentifier	 is Secure Processing
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
,	TokenNameCOMMA	
SAXTransformerFactory	TokenNameIdentifier	 SAX Transformer Factory
.	TokenNameDOT	
FEATURE	TokenNameIdentifier	 FEATURE
,	TokenNameCOMMA	
SAXTransformerFactory	TokenNameIdentifier	 SAX Transformer Factory
.	TokenNameDOT	
FEATURE_XMLFILTER	TokenNameIdentifier	 FEATURE  XMLFILTER
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
// Inefficient, but array is small 	TokenNameCOMMENT_LINE	Inefficient, but array is small 
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
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
_isSecureProcessing	TokenNameIdentifier	 is Secure Processing
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Feature not supported 	TokenNameCOMMENT_LINE	Feature not supported 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * javax.xml.transform.sax.TransformerFactory implementation. * Get the object that is used by default during the transformation to * resolve URIs used in document(), xsl:import, or xsl:include. * * @return The URLResolver used for this TransformerFactory and all * Templates and Transformer objects created using this factory */	TokenNameCOMMENT_JAVADOC	 javax.xml.transform.sax.TransformerFactory implementation. Get the object that is used by default during the transformation to resolve URIs used in document(), xsl:import, or xsl:include. * @return The URLResolver used for this TransformerFactory and all Templates and Transformer objects created using this factory 
public	TokenNamepublic	
URIResolver	TokenNameIdentifier	 URI Resolver
getURIResolver	TokenNameIdentifier	 get URI Resolver
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_uriResolver	TokenNameIdentifier	 uri Resolver
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * javax.xml.transform.sax.TransformerFactory implementation. * Set the object that is used by default during the transformation to * resolve URIs used in document(), xsl:import, or xsl:include. Note that * this does not affect Templates and Transformers that are already * created with this factory. * * @param resolver The URLResolver used for this TransformerFactory and all * Templates and Transformer objects created using this factory */	TokenNameCOMMENT_JAVADOC	 javax.xml.transform.sax.TransformerFactory implementation. Set the object that is used by default during the transformation to resolve URIs used in document(), xsl:import, or xsl:include. Note that this does not affect Templates and Transformers that are already created with this factory. * @param resolver The URLResolver used for this TransformerFactory and all Templates and Transformer objects created using this factory 
public	TokenNamepublic	
void	TokenNamevoid	
setURIResolver	TokenNameIdentifier	 set URI Resolver
(	TokenNameLPAREN	
URIResolver	TokenNameIdentifier	 URI Resolver
resolver	TokenNameIdentifier	 resolver
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_uriResolver	TokenNameIdentifier	 uri Resolver
=	TokenNameEQUAL	
resolver	TokenNameIdentifier	 resolver
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * javax.xml.transform.sax.TransformerFactory implementation. * Get the stylesheet specification(s) associated via the xml-stylesheet * processing instruction (see http://www.w3.org/TR/xml-stylesheet/) with * the document document specified in the source parameter, and that match * the given criteria. * * @param source The XML source document. * @param media The media attribute to be matched. May be null, in which * case the prefered templates will be used (i.e. alternate = no). * @param title The value of the title attribute to match. May be null. * @param charset The value of the charset attribute to match. May be null. * @return A Source object suitable for passing to the TransformerFactory. * @throws TransformerConfigurationException */	TokenNameCOMMENT_JAVADOC	 javax.xml.transform.sax.TransformerFactory implementation. Get the stylesheet specification(s) associated via the xml-stylesheet processing instruction (see http://www.w3.org/TR/xml-stylesheet/) with the document document specified in the source parameter, and that match the given criteria. * @param source The XML source document. @param media The media attribute to be matched. May be null, in which case the prefered templates will be used (i.e. alternate = no). @param title The value of the title attribute to match. May be null. @param charset The value of the charset attribute to match. May be null. @return A Source object suitable for passing to the TransformerFactory. @throws TransformerConfigurationException 
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
String	TokenNameIdentifier	 String
baseId	TokenNameIdentifier	 base Id
;	TokenNameSEMICOLON	
XMLReader	TokenNameIdentifier	 XML Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
InputSource	TokenNameIdentifier	 Input Source
isource	TokenNameIdentifier	 isource
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Fix for bugzilla bug 24187 */	TokenNameCOMMENT_JAVADOC	 Fix for bugzilla bug 24187 
StylesheetPIHandler	TokenNameIdentifier	 Stylesheet PI Handler
_stylesheetPIHandler	TokenNameIdentifier	 stylesheet PI Handler
=	TokenNameEQUAL	
new	TokenNamenew	
StylesheetPIHandler	TokenNameIdentifier	 Stylesheet PI Handler
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
media	TokenNameIdentifier	 media
,	TokenNameCOMMA	
title	TokenNameIdentifier	 title
,	TokenNameCOMMA	
charset	TokenNameIdentifier	 charset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
instanceof	TokenNameinstanceof	
DOMSource	TokenNameIdentifier	 DOM Source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
DOMSource	TokenNameIdentifier	 DOM Source
domsrc	TokenNameIdentifier	 domsrc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DOMSource	TokenNameIdentifier	 DOM Source
)	TokenNameRPAREN	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
baseId	TokenNameIdentifier	 base Id
=	TokenNameEQUAL	
domsrc	TokenNameIdentifier	 domsrc
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
domsrc	TokenNameIdentifier	 domsrc
.	TokenNameDOT	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
DOM2SAX	TokenNameIdentifier	 DO M2 SAX
dom2sax	TokenNameIdentifier	 dom2sax
=	TokenNameEQUAL	
new	TokenNamenew	
DOM2SAX	TokenNameIdentifier	 DO M2 SAX
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_stylesheetPIHandler	TokenNameIdentifier	 stylesheet PI Handler
.	TokenNameDOT	
setBaseId	TokenNameIdentifier	 set Base Id
(	TokenNameLPAREN	
baseId	TokenNameIdentifier	 base Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dom2sax	TokenNameIdentifier	 dom2sax
.	TokenNameDOT	
setContentHandler	TokenNameIdentifier	 set Content Handler
(	TokenNameLPAREN	
_stylesheetPIHandler	TokenNameIdentifier	 stylesheet PI Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dom2sax	TokenNameIdentifier	 dom2sax
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
isource	TokenNameIdentifier	 isource
=	TokenNameEQUAL	
SAXSource	TokenNameIdentifier	 SAX Source
.	TokenNameDOT	
sourceToInputSource	TokenNameIdentifier	 source To Input Source
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
baseId	TokenNameIdentifier	 base Id
=	TokenNameEQUAL	
isource	TokenNameIdentifier	 isource
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SAXParserFactory	TokenNameIdentifier	 SAX Parser Factory
factory	TokenNameIdentifier	 factory
=	TokenNameEQUAL	
SAXParserFactory	TokenNameIdentifier	 SAX Parser Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
setNamespaceAware	TokenNameIdentifier	 set Namespace Aware
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_isSecureProcessing	TokenNameIdentifier	 is Secure Processing
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
FEATURE_SECURE_PROCESSING	TokenNameIdentifier	 FEATURE  SECURE  PROCESSING
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
SAXParser	TokenNameIdentifier	 SAX Parser
jaxpParser	TokenNameIdentifier	 jaxp Parser
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
newSAXParser	TokenNameIdentifier	 new SAX Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
jaxpParser	TokenNameIdentifier	 jaxp Parser
.	TokenNameDOT	
getXMLReader	TokenNameIdentifier	 get XML Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
XMLReaderFactory	TokenNameIdentifier	 XML Reader Factory
.	TokenNameDOT	
createXMLReader	TokenNameIdentifier	 create XML Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_stylesheetPIHandler	TokenNameIdentifier	 stylesheet PI Handler
.	TokenNameDOT	
setBaseId	TokenNameIdentifier	 set Base Id
(	TokenNameLPAREN	
baseId	TokenNameIdentifier	 base Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
setContentHandler	TokenNameIdentifier	 set Content Handler
(	TokenNameLPAREN	
_stylesheetPIHandler	TokenNameIdentifier	 stylesheet PI Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
isource	TokenNameIdentifier	 isource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_uriResolver	TokenNameIdentifier	 uri Resolver
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_stylesheetPIHandler	TokenNameIdentifier	 stylesheet PI Handler
.	TokenNameDOT	
setURIResolver	TokenNameIdentifier	 set URI Resolver
(	TokenNameLPAREN	
_uriResolver	TokenNameIdentifier	 uri Resolver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
StopParseException	TokenNameIdentifier	 Stop Parse Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// startElement encountered so do not parse further 	TokenNameCOMMENT_LINE	startElement encountered so do not parse further 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
(	TokenNameLPAREN	
"getAssociatedStylesheets failed"	TokenNameStringLiteral	getAssociatedStylesheets failed
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
(	TokenNameLPAREN	
"getAssociatedStylesheets failed"	TokenNameStringLiteral	getAssociatedStylesheets failed
,	TokenNameCOMMA	
se	TokenNameIdentifier	 se
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
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
(	TokenNameLPAREN	
"getAssociatedStylesheets failed"	TokenNameStringLiteral	getAssociatedStylesheets failed
,	TokenNameCOMMA	
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
_stylesheetPIHandler	TokenNameIdentifier	 stylesheet PI Handler
.	TokenNameDOT	
getAssociatedStylesheet	TokenNameIdentifier	 get Associated Stylesheet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * javax.xml.transform.sax.TransformerFactory implementation. * Create a Transformer object that copies the input document to the result. * * @return A Transformer object that simply copies the source to the result. * @throws TransformerConfigurationException */	TokenNameCOMMENT_JAVADOC	 javax.xml.transform.sax.TransformerFactory implementation. Create a Transformer object that copies the input document to the result. * @return A Transformer object that simply copies the source to the result. @throws TransformerConfigurationException 
public	TokenNamepublic	
Transformer	TokenNameIdentifier	 Transformer
newTransformer	TokenNameIdentifier	 new Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
{	TokenNameLBRACE	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
(	TokenNameLPAREN	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
_indentNumber	TokenNameIdentifier	 indent Number
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_uriResolver	TokenNameIdentifier	 uri Resolver
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
setURIResolver	TokenNameIdentifier	 set URI Resolver
(	TokenNameLPAREN	
_uriResolver	TokenNameIdentifier	 uri Resolver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_isSecureProcessing	TokenNameIdentifier	 is Secure Processing
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
setSecureProcessing	TokenNameIdentifier	 set Secure Processing
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * javax.xml.transform.sax.TransformerFactory implementation. * Process the Source into a Templates object, which is a a compiled * representation of the source. Note that this method should not be * used with XSLTC, as the time-consuming compilation is done for each * and every transformation. * * @return A Templates object that can be used to create Transformers. * @throws TransformerConfigurationException */	TokenNameCOMMENT_JAVADOC	 javax.xml.transform.sax.TransformerFactory implementation. Process the Source into a Templates object, which is a a compiled representation of the source. Note that this method should not be used with XSLTC, as the time-consuming compilation is done for each and every transformation. * @return A Templates object that can be used to create Transformers. @throws TransformerConfigurationException 
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
final	TokenNamefinal	
Templates	TokenNameIdentifier	 Templates
templates	TokenNameIdentifier	 templates
=	TokenNameEQUAL	
newTemplates	TokenNameIdentifier	 new Templates
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Transformer	TokenNameIdentifier	 Transformer
transformer	TokenNameIdentifier	 transformer
=	TokenNameEQUAL	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
newTransformer	TokenNameIdentifier	 new Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_uriResolver	TokenNameIdentifier	 uri Resolver
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
setURIResolver	TokenNameIdentifier	 set URI Resolver
(	TokenNameLPAREN	
_uriResolver	TokenNameIdentifier	 uri Resolver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
transformer	TokenNameIdentifier	 transformer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pass warning messages from the compiler to the error listener */	TokenNameCOMMENT_JAVADOC	 Pass warning messages from the compiler to the error listener 
private	TokenNameprivate	
void	TokenNamevoid	
passWarningsToListener	TokenNameIdentifier	 pass Warnings To Listener
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
messages	TokenNameIdentifier	 messages
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_errorListener	TokenNameIdentifier	 error Listener
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
messages	TokenNameIdentifier	 messages
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Pass messages to listener, one by one 	TokenNameCOMMENT_LINE	Pass messages to listener, one by one 
final	TokenNamefinal	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
)	TokenNameRPAREN	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Workaround for the TCK failure ErrorListener.errorTests.error001. 	TokenNameCOMMENT_LINE	Workaround for the TCK failure ErrorListener.errorTests.error001. 
if	TokenNameif	
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
isWarningError	TokenNameIdentifier	 is Warning Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
_errorListener	TokenNameIdentifier	 error Listener
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
new	TokenNamenew	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
_errorListener	TokenNameIdentifier	 error Listener
.	TokenNameDOT	
warning	TokenNameIdentifier	 warning
(	TokenNameLPAREN	
new	TokenNamenew	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Pass error messages from the compiler to the error listener */	TokenNameCOMMENT_JAVADOC	 Pass error messages from the compiler to the error listener 
private	TokenNameprivate	
void	TokenNamevoid	
passErrorsToListener	TokenNameIdentifier	 pass Errors To Listener
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
messages	TokenNameIdentifier	 messages
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_errorListener	TokenNameIdentifier	 error Listener
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
messages	TokenNameIdentifier	 messages
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Pass messages to listener, one by one 	TokenNameCOMMENT_LINE	Pass messages to listener, one by one 
final	TokenNamefinal	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_errorListener	TokenNameIdentifier	 error Listener
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// nada 	TokenNameCOMMENT_LINE	nada 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * javax.xml.transform.sax.TransformerFactory implementation. * Process the Source into a Templates object, which is a a compiled * representation of the source. * * @param source The input stylesheet - DOMSource not supported!!! * @return A Templates object that can be used to create Transformers. * @throws TransformerConfigurationException */	TokenNameCOMMENT_JAVADOC	 javax.xml.transform.sax.TransformerFactory implementation. Process the Source into a Templates object, which is a a compiled representation of the source. * @param source The input stylesheet - DOMSource not supported!!! @return A Templates object that can be used to create Transformers. @throws TransformerConfigurationException 
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
// If the _useClasspath attribute is true, try to load the translet from 	TokenNameCOMMENT_LINE	If the _useClasspath attribute is true, try to load the translet from 
// the CLASSPATH and create a template object using the loaded 	TokenNameCOMMENT_LINE	the CLASSPATH and create a template object using the loaded 
// translet. 	TokenNameCOMMENT_LINE	translet. 
if	TokenNameif	
(	TokenNameLPAREN	
_useClasspath	TokenNameIdentifier	 use Classpath
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
transletName	TokenNameIdentifier	 translet Name
=	TokenNameEQUAL	
getTransletBaseName	TokenNameIdentifier	 get Translet Base Name
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_packageName	TokenNameIdentifier	 package Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
transletName	TokenNameIdentifier	 translet Name
=	TokenNameEQUAL	
_packageName	TokenNameIdentifier	 package Name
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
transletName	TokenNameIdentifier	 translet Name
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findProviderClass	TokenNameIdentifier	 find Provider Class
(	TokenNameLPAREN	
transletName	TokenNameIdentifier	 translet Name
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
resetTransientAttributes	TokenNameIdentifier	 reset Transient Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
TemplatesImpl	TokenNameIdentifier	 Templates Impl
(	TokenNameLPAREN	
new	TokenNamenew	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
clazz	TokenNameIdentifier	 clazz
}	TokenNameRBRACE	
,	TokenNameCOMMA	
transletName	TokenNameIdentifier	 translet Name
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
_indentNumber	TokenNameIdentifier	 indent Number
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
cnfe	TokenNameIdentifier	 cnfe
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
CLASS_NOT_FOUND_ERR	TokenNameIdentifier	 CLASS  NOT  FOUND  ERR
,	TokenNameCOMMA	
transletName	TokenNameIdentifier	 translet Name
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
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
err	TokenNameIdentifier	 err
=	TokenNameEQUAL	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
RUNTIME_ERROR_KEY	TokenNameIdentifier	 RUNTIME  ERROR  KEY
)	TokenNameRPAREN	
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
// If _autoTranslet is true, we will try to load the bytecodes 	TokenNameCOMMENT_LINE	If _autoTranslet is true, we will try to load the bytecodes 
// from the translet classes without compiling the stylesheet. 	TokenNameCOMMENT_LINE	from the translet classes without compiling the stylesheet. 
if	TokenNameif	
(	TokenNameLPAREN	
_autoTranslet	TokenNameIdentifier	 auto Translet
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytecodes	TokenNameIdentifier	 bytecodes
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
transletClassName	TokenNameIdentifier	 translet Class Name
=	TokenNameEQUAL	
getTransletBaseName	TokenNameIdentifier	 get Translet Base Name
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_packageName	TokenNameIdentifier	 package Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
transletClassName	TokenNameIdentifier	 translet Class Name
=	TokenNameEQUAL	
_packageName	TokenNameIdentifier	 package Name
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
transletClassName	TokenNameIdentifier	 translet Class Name
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_jarFileName	TokenNameIdentifier	 jar File Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
bytecodes	TokenNameIdentifier	 bytecodes
=	TokenNameEQUAL	
getBytecodesFromJar	TokenNameIdentifier	 get Bytecodes From Jar
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
transletClassName	TokenNameIdentifier	 translet Class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
bytecodes	TokenNameIdentifier	 bytecodes
=	TokenNameEQUAL	
getBytecodesFromClasses	TokenNameIdentifier	 get Bytecodes From Classes
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
transletClassName	TokenNameIdentifier	 translet Class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bytecodes	TokenNameIdentifier	 bytecodes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_debug	TokenNameIdentifier	 debug
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_jarFileName	TokenNameIdentifier	 jar File Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
TRANSFORM_WITH_JAR_STR	TokenNameIdentifier	 TRANSFORM  WITH  JAR  STR
,	TokenNameCOMMA	
transletClassName	TokenNameIdentifier	 translet Class Name
,	TokenNameCOMMA	
_jarFileName	TokenNameIdentifier	 jar File Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
TRANSFORM_WITH_TRANSLET_STR	TokenNameIdentifier	 TRANSFORM  WITH  TRANSLET  STR
,	TokenNameCOMMA	
transletClassName	TokenNameIdentifier	 translet Class Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Reset the per-session attributes to their default values 	TokenNameCOMMENT_LINE	Reset the per-session attributes to their default values 
// after each newTemplates() call. 	TokenNameCOMMENT_LINE	after each newTemplates() call. 
resetTransientAttributes	TokenNameIdentifier	 reset Transient Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
TemplatesImpl	TokenNameIdentifier	 Templates Impl
(	TokenNameLPAREN	
bytecodes	TokenNameIdentifier	 bytecodes
,	TokenNameCOMMA	
transletClassName	TokenNameIdentifier	 translet Class Name
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
_indentNumber	TokenNameIdentifier	 indent Number
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Create and initialize a stylesheet compiler 	TokenNameCOMMENT_LINE	Create and initialize a stylesheet compiler 
final	TokenNamefinal	
XSLTC	TokenNameIdentifier	 XSLTC
xsltc	TokenNameIdentifier	 xsltc
=	TokenNameEQUAL	
new	TokenNamenew	
XSLTC	TokenNameIdentifier	 XSLTC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_debug	TokenNameIdentifier	 debug
)	TokenNameRPAREN	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
setDebug	TokenNameIdentifier	 set Debug
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_enableInlining	TokenNameIdentifier	 enable Inlining
)	TokenNameRPAREN	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
setTemplateInlining	TokenNameIdentifier	 set Template Inlining
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
setTemplateInlining	TokenNameIdentifier	 set Template Inlining
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_isSecureProcessing	TokenNameIdentifier	 is Secure Processing
)	TokenNameRPAREN	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
setSecureProcessing	TokenNameIdentifier	 set Secure Processing
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Set a document loader (for xsl:include/import) if defined 	TokenNameCOMMENT_LINE	Set a document loader (for xsl:include/import) if defined 
if	TokenNameif	
(	TokenNameLPAREN	
_uriResolver	TokenNameIdentifier	 uri Resolver
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
setSourceLoader	TokenNameIdentifier	 set Source Loader
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Pass parameters to the Parser to make sure it locates the correct 	TokenNameCOMMENT_LINE	Pass parameters to the Parser to make sure it locates the correct 
// <?xml-stylesheet ...?> PI in an XML input document 	TokenNameCOMMENT_LINE	<?xml-stylesheet ...?> PI in an XML input document 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
_piParams	TokenNameIdentifier	 pi Params
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
_piParams	TokenNameIdentifier	 pi Params
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Get the parameters for this Source object 	TokenNameCOMMENT_LINE	Get the parameters for this Source object 
PIParamWrapper	TokenNameIdentifier	 PI Param Wrapper
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PIParamWrapper	TokenNameIdentifier	 PI Param Wrapper
)	TokenNameRPAREN	
_piParams	TokenNameIdentifier	 pi Params
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Pass them on to the compiler (which will pass then to the parser) 	TokenNameCOMMENT_LINE	Pass them on to the compiler (which will pass then to the parser) 
if	TokenNameif	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
setPIParameters	TokenNameIdentifier	 set PI Parameters
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
_media	TokenNameIdentifier	 media
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
_title	TokenNameIdentifier	 title
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
_charset	TokenNameIdentifier	 charset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Set the attributes for translet generation 	TokenNameCOMMENT_LINE	Set the attributes for translet generation 
int	TokenNameint	
outputType	TokenNameIdentifier	 output Type
=	TokenNameEQUAL	
XSLTC	TokenNameIdentifier	 XSLTC
.	TokenNameDOT	
BYTEARRAY_OUTPUT	TokenNameIdentifier	 BYTEARRAY  OUTPUT
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_generateTranslet	TokenNameIdentifier	 generate Translet
||	TokenNameOR_OR	
_autoTranslet	TokenNameIdentifier	 auto Translet
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Set the translet name 	TokenNameCOMMENT_LINE	Set the translet name 
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
setClassName	TokenNameIdentifier	 set Class Name
(	TokenNameLPAREN	
getTransletBaseName	TokenNameIdentifier	 get Translet Base Name
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_destinationDirectory	TokenNameIdentifier	 destination Directory
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
setDestDirectory	TokenNameIdentifier	 set Dest Directory
(	TokenNameLPAREN	
_destinationDirectory	TokenNameIdentifier	 destination Directory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
xslName	TokenNameIdentifier	 xsl Name
=	TokenNameEQUAL	
getStylesheetFileName	TokenNameIdentifier	 get Stylesheet File Name
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
xslName	TokenNameIdentifier	 xsl Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
xslFile	TokenNameIdentifier	 xsl File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
xslName	TokenNameIdentifier	 xsl Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
xslDir	TokenNameIdentifier	 xsl Dir
=	TokenNameEQUAL	
xslFile	TokenNameIdentifier	 xsl File
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
xslDir	TokenNameIdentifier	 xsl Dir
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
setDestDirectory	TokenNameIdentifier	 set Dest Directory
(	TokenNameLPAREN	
xslDir	TokenNameIdentifier	 xsl Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_packageName	TokenNameIdentifier	 package Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
setPackageName	TokenNameIdentifier	 set Package Name
(	TokenNameLPAREN	
_packageName	TokenNameIdentifier	 package Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_jarFileName	TokenNameIdentifier	 jar File Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
setJarFileName	TokenNameIdentifier	 set Jar File Name
(	TokenNameLPAREN	
_jarFileName	TokenNameIdentifier	 jar File Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputType	TokenNameIdentifier	 output Type
=	TokenNameEQUAL	
XSLTC	TokenNameIdentifier	 XSLTC
.	TokenNameDOT	
BYTEARRAY_AND_JAR_OUTPUT	TokenNameIdentifier	 BYTEARRAY  AND  JAR  OUTPUT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
outputType	TokenNameIdentifier	 output Type
=	TokenNameEQUAL	
XSLTC	TokenNameIdentifier	 XSLTC
.	TokenNameDOT	
BYTEARRAY_AND_FILE_OUTPUT	TokenNameIdentifier	 BYTEARRAY  AND  FILE  OUTPUT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Compile the stylesheet 	TokenNameCOMMENT_LINE	Compile the stylesheet 
final	TokenNamefinal	
InputSource	TokenNameIdentifier	 Input Source
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
Util	TokenNameIdentifier	 Util
.	TokenNameDOT	
getInputSource	TokenNameIdentifier	 get Input Source
(	TokenNameLPAREN	
xsltc	TokenNameIdentifier	 xsltc
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytecodes	TokenNameIdentifier	 bytecodes
=	TokenNameEQUAL	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
outputType	TokenNameIdentifier	 output Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
transletName	TokenNameIdentifier	 translet Name
=	TokenNameEQUAL	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Output to the jar file if the jar file name is set. 	TokenNameCOMMENT_LINE	Output to the jar file if the jar file name is set. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
_generateTranslet	TokenNameIdentifier	 generate Translet
||	TokenNameOR_OR	
_autoTranslet	TokenNameIdentifier	 auto Translet
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
bytecodes	TokenNameIdentifier	 bytecodes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
_jarFileName	TokenNameIdentifier	 jar File Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
outputToJar	TokenNameIdentifier	 output To Jar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Reset the per-session attributes to their default values 	TokenNameCOMMENT_LINE	Reset the per-session attributes to their default values 
// after each newTemplates() call. 	TokenNameCOMMENT_LINE	after each newTemplates() call. 
resetTransientAttributes	TokenNameIdentifier	 reset Transient Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Pass compiler warnings to the error listener 	TokenNameCOMMENT_LINE	Pass compiler warnings to the error listener 
if	TokenNameif	
(	TokenNameLPAREN	
_errorListener	TokenNameIdentifier	 error Listener
!=	TokenNameNOT_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
passWarningsToListener	TokenNameIdentifier	 pass Warnings To Listener
(	TokenNameLPAREN	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
getWarnings	TokenNameIdentifier	 get Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
printWarnings	TokenNameIdentifier	 print Warnings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Check that the transformation went well before returning 	TokenNameCOMMENT_LINE	Check that the transformation went well before returning 
if	TokenNameif	
(	TokenNameLPAREN	
bytecodes	TokenNameIdentifier	 bytecodes
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
JAXP_COMPILE_ERR	TokenNameIdentifier	 JAXP  COMPILE  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
exc	TokenNameIdentifier	 exc
=	TokenNameEQUAL	
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
// Pass compiler errors to the error listener 	TokenNameCOMMENT_LINE	Pass compiler errors to the error listener 
if	TokenNameif	
(	TokenNameLPAREN	
_errorListener	TokenNameIdentifier	 error Listener
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
passErrorsToListener	TokenNameIdentifier	 pass Errors To Listener
(	TokenNameLPAREN	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
getErrors	TokenNameIdentifier	 get Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// As required by TCK 1.2, send a fatalError to the 	TokenNameCOMMENT_LINE	As required by TCK 1.2, send a fatalError to the 
// error listener because compilation of the stylesheet 	TokenNameCOMMENT_LINE	error listener because compilation of the stylesheet 
// failed and no further processing will be possible. 	TokenNameCOMMENT_LINE	failed and no further processing will be possible. 
try	TokenNametry	
{	TokenNameLBRACE	
_errorListener	TokenNameIdentifier	 error Listener
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
exc	TokenNameIdentifier	 exc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// well, we tried. 	TokenNameCOMMENT_LINE	well, we tried. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
printErrors	TokenNameIdentifier	 print Errors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
exc	TokenNameIdentifier	 exc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TemplatesImpl	TokenNameIdentifier	 Templates Impl
(	TokenNameLPAREN	
bytecodes	TokenNameIdentifier	 bytecodes
,	TokenNameCOMMA	
transletName	TokenNameIdentifier	 translet Name
,	TokenNameCOMMA	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
getOutputProperties	TokenNameIdentifier	 get Output Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
_indentNumber	TokenNameIdentifier	 indent Number
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * javax.xml.transform.sax.SAXTransformerFactory implementation. * Get a TemplatesHandler object that can process SAX ContentHandler * events into a Templates object. * * @return A TemplatesHandler object that can handle SAX events * @throws TransformerConfigurationException */	TokenNameCOMMENT_JAVADOC	 javax.xml.transform.sax.SAXTransformerFactory implementation. Get a TemplatesHandler object that can process SAX ContentHandler events into a Templates object. * @return A TemplatesHandler object that can handle SAX events @throws TransformerConfigurationException 
public	TokenNamepublic	
TemplatesHandler	TokenNameIdentifier	 Templates Handler
newTemplatesHandler	TokenNameIdentifier	 new Templates Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
TemplatesHandlerImpl	TokenNameIdentifier	 Templates Handler Impl
handler	TokenNameIdentifier	 handler
=	TokenNameEQUAL	
new	TokenNamenew	
TemplatesHandlerImpl	TokenNameIdentifier	 Templates Handler Impl
(	TokenNameLPAREN	
_indentNumber	TokenNameIdentifier	 indent Number
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_uriResolver	TokenNameIdentifier	 uri Resolver
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
setURIResolver	TokenNameIdentifier	 set URI Resolver
(	TokenNameLPAREN	
_uriResolver	TokenNameIdentifier	 uri Resolver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
handler	TokenNameIdentifier	 handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * javax.xml.transform.sax.SAXTransformerFactory implementation. * Get a TransformerHandler object that can process SAX ContentHandler * events into a Result. This method will return a pure copy transformer. * * @return A TransformerHandler object that can handle SAX events * @throws TransformerConfigurationException */	TokenNameCOMMENT_JAVADOC	 javax.xml.transform.sax.SAXTransformerFactory implementation. Get a TransformerHandler object that can process SAX ContentHandler events into a Result. This method will return a pure copy transformer. * @return A TransformerHandler object that can handle SAX events @throws TransformerConfigurationException 
public	TokenNamepublic	
TransformerHandler	TokenNameIdentifier	 Transformer Handler
newTransformerHandler	TokenNameIdentifier	 new Transformer Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
Transformer	TokenNameIdentifier	 Transformer
transformer	TokenNameIdentifier	 transformer
=	TokenNameEQUAL	
newTransformer	TokenNameIdentifier	 new Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_uriResolver	TokenNameIdentifier	 uri Resolver
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
setURIResolver	TokenNameIdentifier	 set URI Resolver
(	TokenNameLPAREN	
_uriResolver	TokenNameIdentifier	 uri Resolver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TransformerHandlerImpl	TokenNameIdentifier	 Transformer Handler Impl
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
)	TokenNameRPAREN	
transformer	TokenNameIdentifier	 transformer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * javax.xml.transform.sax.SAXTransformerFactory implementation. * Get a TransformerHandler object that can process SAX ContentHandler * events into a Result, based on the transformation instructions * specified by the argument. * * @param src The source of the transformation instructions. * @return A TransformerHandler object that can handle SAX events * @throws TransformerConfigurationException */	TokenNameCOMMENT_JAVADOC	 javax.xml.transform.sax.SAXTransformerFactory implementation. Get a TransformerHandler object that can process SAX ContentHandler events into a Result, based on the transformation instructions specified by the argument. * @param src The source of the transformation instructions. @return A TransformerHandler object that can handle SAX events @throws TransformerConfigurationException 
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
final	TokenNamefinal	
Transformer	TokenNameIdentifier	 Transformer
transformer	TokenNameIdentifier	 transformer
=	TokenNameEQUAL	
newTransformer	TokenNameIdentifier	 new Transformer
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_uriResolver	TokenNameIdentifier	 uri Resolver
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
setURIResolver	TokenNameIdentifier	 set URI Resolver
(	TokenNameLPAREN	
_uriResolver	TokenNameIdentifier	 uri Resolver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TransformerHandlerImpl	TokenNameIdentifier	 Transformer Handler Impl
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
)	TokenNameRPAREN	
transformer	TokenNameIdentifier	 transformer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * javax.xml.transform.sax.SAXTransformerFactory implementation. * Get a TransformerHandler object that can process SAX ContentHandler * events into a Result, based on the transformation instructions * specified by the argument. * * @param templates Represents a pre-processed stylesheet * @return A TransformerHandler object that can handle SAX events * @throws TransformerConfigurationException */	TokenNameCOMMENT_JAVADOC	 javax.xml.transform.sax.SAXTransformerFactory implementation. Get a TransformerHandler object that can process SAX ContentHandler events into a Result, based on the transformation instructions specified by the argument. * @param templates Represents a pre-processed stylesheet @return A TransformerHandler object that can handle SAX events @throws TransformerConfigurationException 
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
final	TokenNamefinal	
Transformer	TokenNameIdentifier	 Transformer
transformer	TokenNameIdentifier	 transformer
=	TokenNameEQUAL	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
newTransformer	TokenNameIdentifier	 new Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
internal	TokenNameIdentifier	 internal
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
)	TokenNameRPAREN	
transformer	TokenNameIdentifier	 transformer
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
TransformerHandlerImpl	TokenNameIdentifier	 Transformer Handler Impl
(	TokenNameLPAREN	
internal	TokenNameIdentifier	 internal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * javax.xml.transform.sax.SAXTransformerFactory implementation. * Create an XMLFilter that uses the given source as the * transformation instructions. * * @param src The source of the transformation instructions. * @return An XMLFilter object, or null if this feature is not supported. * @throws TransformerConfigurationException */	TokenNameCOMMENT_JAVADOC	 javax.xml.transform.sax.SAXTransformerFactory implementation. Create an XMLFilter that uses the given source as the transformation instructions. * @param src The source of the transformation instructions. @return An XMLFilter object, or null if this feature is not supported. @throws TransformerConfigurationException 
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
Templates	TokenNameIdentifier	 Templates
templates	TokenNameIdentifier	 templates
=	TokenNameEQUAL	
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
/** * javax.xml.transform.sax.SAXTransformerFactory implementation. * Create an XMLFilter that uses the given source as the * transformation instructions. * * @param templates The source of the transformation instructions. * @return An XMLFilter object, or null if this feature is not supported. * @throws TransformerConfigurationException */	TokenNameCOMMENT_JAVADOC	 javax.xml.transform.sax.SAXTransformerFactory implementation. Create an XMLFilter that uses the given source as the transformation instructions. * @param templates The source of the transformation instructions. @return An XMLFilter object, or null if this feature is not supported. @throws TransformerConfigurationException 
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
_errorListener	TokenNameIdentifier	 error Listener
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
_errorListener	TokenNameIdentifier	 error Listener
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
/** * Receive notification of a recoverable error. * The transformer must continue to provide normal parsing events after * invoking this method. It should still be possible for the application * to process the document through to the end. * * @param e The warning information encapsulated in a transformer * exception. * @throws TransformerException if the application chooses to discontinue * the transformation (always does in our case). */	TokenNameCOMMENT_JAVADOC	 Receive notification of a recoverable error. The transformer must continue to provide normal parsing events after invoking this method. It should still be possible for the application to process the document through to the end. * @param e The warning information encapsulated in a transformer exception. @throws TransformerException if the application chooses to discontinue the transformation (always does in our case). 
public	TokenNamepublic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
Throwable	TokenNameIdentifier	 Throwable
wrapped	TokenNameIdentifier	 wrapped
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
wrapped	TokenNameIdentifier	 wrapped
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ERROR_PLUS_WRAPPED_MSG	TokenNameIdentifier	 ERROR  PLUS  WRAPPED  MSG
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessageAndLocation	TokenNameIdentifier	 get Message And Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
wrapped	TokenNameIdentifier	 wrapped
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ERROR_MSG	TokenNameIdentifier	 ERROR  MSG
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessageAndLocation	TokenNameIdentifier	 get Message And Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of a non-recoverable error. * The application must assume that the transformation cannot continue * after the Transformer has invoked this method, and should continue * (if at all) only to collect addition error messages. In fact, * Transformers are free to stop reporting events once this method has * been invoked. * * @param e warning information encapsulated in a transformer * exception. * @throws TransformerException if the application chooses to discontinue * the transformation (always does in our case). */	TokenNameCOMMENT_JAVADOC	 Receive notification of a non-recoverable error. The application must assume that the transformation cannot continue after the Transformer has invoked this method, and should continue (if at all) only to collect addition error messages. In fact, Transformers are free to stop reporting events once this method has been invoked. * @param e warning information encapsulated in a transformer exception. @throws TransformerException if the application chooses to discontinue the transformation (always does in our case). 
public	TokenNamepublic	
void	TokenNamevoid	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
Throwable	TokenNameIdentifier	 Throwable
wrapped	TokenNameIdentifier	 wrapped
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
wrapped	TokenNameIdentifier	 wrapped
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
FATAL_ERR_PLUS_WRAPPED_MSG	TokenNameIdentifier	 FATAL  ERR  PLUS  WRAPPED  MSG
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessageAndLocation	TokenNameIdentifier	 get Message And Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
wrapped	TokenNameIdentifier	 wrapped
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
FATAL_ERR_MSG	TokenNameIdentifier	 FATAL  ERR  MSG
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessageAndLocation	TokenNameIdentifier	 get Message And Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of a warning. * Transformers can use this method to report conditions that are not * errors or fatal errors. The default behaviour is to take no action. * After invoking this method, the Transformer must continue with the * transformation. It should still be possible for the application to * process the document through to the end. * * @param e The warning information encapsulated in a transformer * exception. * @throws TransformerException if the application chooses to discontinue * the transformation (never does in our case). */	TokenNameCOMMENT_JAVADOC	 Receive notification of a warning. Transformers can use this method to report conditions that are not errors or fatal errors. The default behaviour is to take no action. After invoking this method, the Transformer must continue with the transformation. It should still be possible for the application to process the document through to the end. * @param e The warning information encapsulated in a transformer exception. @throws TransformerException if the application chooses to discontinue the transformation (never does in our case). 
public	TokenNamepublic	
void	TokenNamevoid	
warning	TokenNameIdentifier	 warning
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
Throwable	TokenNameIdentifier	 Throwable
wrapped	TokenNameIdentifier	 wrapped
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
wrapped	TokenNameIdentifier	 wrapped
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
WARNING_PLUS_WRAPPED_MSG	TokenNameIdentifier	 WARNING  PLUS  WRAPPED  MSG
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessageAndLocation	TokenNameIdentifier	 get Message And Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
wrapped	TokenNameIdentifier	 wrapped
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
WARNING_MSG	TokenNameIdentifier	 WARNING  MSG
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessageAndLocation	TokenNameIdentifier	 get Message And Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This method implements XSLTC's SourceLoader interface. It is used to * glue a TrAX URIResolver to the XSLTC compiler's Input and Import classes. * * @param href The URI of the document to load * @param context The URI of the currently loaded document * @param xsltc The compiler that resuests the document * @return An InputSource with the loaded document */	TokenNameCOMMENT_JAVADOC	 This method implements XSLTC's SourceLoader interface. It is used to glue a TrAX URIResolver to the XSLTC compiler's Input and Import classes. * @param href The URI of the document to load @param context The URI of the currently loaded document @param xsltc The compiler that resuests the document @return An InputSource with the loaded document 
public	TokenNamepublic	
InputSource	TokenNameIdentifier	 Input Source
loadSource	TokenNameIdentifier	 load Source
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
href	TokenNameIdentifier	 href
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
XSLTC	TokenNameIdentifier	 XSLTC
xsltc	TokenNameIdentifier	 xsltc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_uriResolver	TokenNameIdentifier	 uri Resolver
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Source	TokenNameIdentifier	 Source
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
_uriResolver	TokenNameIdentifier	 uri Resolver
.	TokenNameDOT	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
href	TokenNameIdentifier	 href
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Util	TokenNameIdentifier	 Util
.	TokenNameDOT	
getInputSource	TokenNameIdentifier	 get Input Source
(	TokenNameLPAREN	
xsltc	TokenNameIdentifier	 xsltc
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Falls through 	TokenNameCOMMENT_LINE	Falls through 
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reset the per-session attributes to their default values */	TokenNameCOMMENT_JAVADOC	 Reset the per-session attributes to their default values 
private	TokenNameprivate	
void	TokenNamevoid	
resetTransientAttributes	TokenNameIdentifier	 reset Transient Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_transletName	TokenNameIdentifier	 translet Name
=	TokenNameEQUAL	
DEFAULT_TRANSLET_NAME	TokenNameIdentifier	 DEFAULT  TRANSLET  NAME
;	TokenNameSEMICOLON	
_destinationDirectory	TokenNameIdentifier	 destination Directory
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
_packageName	TokenNameIdentifier	 package Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
_jarFileName	TokenNameIdentifier	 jar File Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Load the translet classes from local .class files and return * the bytecode array. * * @param source The xsl source * @param fullClassName The full name of the translet * @return The bytecode array */	TokenNameCOMMENT_JAVADOC	 Load the translet classes from local .class files and return the bytecode array. * @param source The xsl source @param fullClassName The full name of the translet @return The bytecode array 
private	TokenNameprivate	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getBytecodesFromClasses	TokenNameIdentifier	 get Bytecodes From Classes
(	TokenNameLPAREN	
Source	TokenNameIdentifier	 Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fullClassName	TokenNameIdentifier	 full Class Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fullClassName	TokenNameIdentifier	 full Class Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
xslFileName	TokenNameIdentifier	 xsl File Name
=	TokenNameEQUAL	
getStylesheetFileName	TokenNameIdentifier	 get Stylesheet File Name
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
xslFile	TokenNameIdentifier	 xsl File
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
xslFileName	TokenNameIdentifier	 xsl File Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
xslFile	TokenNameIdentifier	 xsl File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
xslFileName	TokenNameIdentifier	 xsl File Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Find the base name of the translet 	TokenNameCOMMENT_LINE	Find the base name of the translet 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
transletName	TokenNameIdentifier	 translet Name
;	TokenNameSEMICOLON	
int	TokenNameint	
lastDotIndex	TokenNameIdentifier	 last Dot Index
=	TokenNameEQUAL	
fullClassName	TokenNameIdentifier	 full Class Name
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lastDotIndex	TokenNameIdentifier	 last Dot Index
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
transletName	TokenNameIdentifier	 translet Name
=	TokenNameEQUAL	
fullClassName	TokenNameIdentifier	 full Class Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
lastDotIndex	TokenNameIdentifier	 last Dot Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
transletName	TokenNameIdentifier	 translet Name
=	TokenNameEQUAL	
fullClassName	TokenNameIdentifier	 full Class Name
;	TokenNameSEMICOLON	
// Construct the path name for the translet class file 	TokenNameCOMMENT_LINE	Construct the path name for the translet class file 
String	TokenNameIdentifier	 String
transletPath	TokenNameIdentifier	 translet Path
=	TokenNameEQUAL	
fullClassName	TokenNameIdentifier	 full Class Name
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_destinationDirectory	TokenNameIdentifier	 destination Directory
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transletPath	TokenNameIdentifier	 translet Path
=	TokenNameEQUAL	
_destinationDirectory	TokenNameIdentifier	 destination Directory
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
+	TokenNamePLUS	
transletPath	TokenNameIdentifier	 translet Path
+	TokenNamePLUS	
".class"	TokenNameStringLiteral	.class
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
xslFile	TokenNameIdentifier	 xsl File
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
xslFile	TokenNameIdentifier	 xsl File
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
transletPath	TokenNameIdentifier	 translet Path
=	TokenNameEQUAL	
xslFile	TokenNameIdentifier	 xsl File
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
+	TokenNamePLUS	
transletPath	TokenNameIdentifier	 translet Path
+	TokenNamePLUS	
".class"	TokenNameStringLiteral	.class
;	TokenNameSEMICOLON	
else	TokenNameelse	
transletPath	TokenNameIdentifier	 translet Path
=	TokenNameEQUAL	
transletPath	TokenNameIdentifier	 translet Path
+	TokenNamePLUS	
".class"	TokenNameStringLiteral	.class
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Return null if the translet class file does not exist. 	TokenNameCOMMENT_LINE	Return null if the translet class file does not exist. 
File	TokenNameIdentifier	 File
transletFile	TokenNameIdentifier	 translet File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
transletPath	TokenNameIdentifier	 translet Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
transletFile	TokenNameIdentifier	 translet File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Compare the timestamps of the translet and the xsl file. 	TokenNameCOMMENT_LINE	Compare the timestamps of the translet and the xsl file. 
// If the translet is older than the xsl file, return null 	TokenNameCOMMENT_LINE	If the translet is older than the xsl file, return null 
// so that the xsl file is used for the transformation and 	TokenNameCOMMENT_LINE	so that the xsl file is used for the transformation and 
// the translet is regenerated. 	TokenNameCOMMENT_LINE	the translet is regenerated. 
if	TokenNameif	
(	TokenNameLPAREN	
xslFile	TokenNameIdentifier	 xsl File
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
xslFile	TokenNameIdentifier	 xsl File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
xslTimestamp	TokenNameIdentifier	 xsl Timestamp
=	TokenNameEQUAL	
xslFile	TokenNameIdentifier	 xsl File
.	TokenNameDOT	
lastModified	TokenNameIdentifier	 last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
transletTimestamp	TokenNameIdentifier	 translet Timestamp
=	TokenNameEQUAL	
transletFile	TokenNameIdentifier	 translet File
.	TokenNameDOT	
lastModified	TokenNameIdentifier	 last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
transletTimestamp	TokenNameIdentifier	 translet Timestamp
<	TokenNameLESS	
xslTimestamp	TokenNameIdentifier	 xsl Timestamp
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Load the translet into a bytecode array. 	TokenNameCOMMENT_LINE	Load the translet into a bytecode array. 
List	TokenNameIdentifier	 List
bytecodes	TokenNameIdentifier	 bytecodes
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
fileLength	TokenNameIdentifier	 file Length
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
transletFile	TokenNameIdentifier	 translet File
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fileLength	TokenNameIdentifier	 file Length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FileInputStream	TokenNameIdentifier	 File Input Stream
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
transletFile	TokenNameIdentifier	 translet File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
fileLength	TokenNameIdentifier	 file Length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
readFromInputStream	TokenNameIdentifier	 read From Input Stream
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
fileLength	TokenNameIdentifier	 file Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bytecodes	TokenNameIdentifier	 bytecodes
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Find the parent directory of the translet. 	TokenNameCOMMENT_LINE	Find the parent directory of the translet. 
String	TokenNameIdentifier	 String
transletParentDir	TokenNameIdentifier	 translet Parent Dir
=	TokenNameEQUAL	
transletFile	TokenNameIdentifier	 translet File
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
transletParentDir	TokenNameIdentifier	 translet Parent Dir
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
transletParentDir	TokenNameIdentifier	 translet Parent Dir
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"user.dir"	TokenNameStringLiteral	user.dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
transletParentFile	TokenNameIdentifier	 translet Parent File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
transletParentDir	TokenNameIdentifier	 translet Parent Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Find all the auxiliary files which have a name pattern of "transletClass$nnn.class". 	TokenNameCOMMENT_LINE	Find all the auxiliary files which have a name pattern of "transletClass$nnn.class". 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
transletAuxPrefix	TokenNameIdentifier	 translet Aux Prefix
=	TokenNameEQUAL	
transletName	TokenNameIdentifier	 translet Name
+	TokenNamePLUS	
"$"	TokenNameStringLiteral	$
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
auxfiles	TokenNameIdentifier	 auxfiles
=	TokenNameEQUAL	
transletParentFile	TokenNameIdentifier	 translet Parent File
.	TokenNameDOT	
listFiles	TokenNameIdentifier	 list Files
(	TokenNameLPAREN	
new	TokenNamenew	
FilenameFilter	TokenNameIdentifier	 Filename Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
".class"	TokenNameStringLiteral	.class
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
transletAuxPrefix	TokenNameIdentifier	 translet Aux Prefix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Load the auxiliary class files and add them to the bytecode array. 	TokenNameCOMMENT_LINE	Load the auxiliary class files and add them to the bytecode array. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
auxfiles	TokenNameIdentifier	 auxfiles
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
auxfile	TokenNameIdentifier	 auxfile
=	TokenNameEQUAL	
auxfiles	TokenNameIdentifier	 auxfiles
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
auxlength	TokenNameIdentifier	 auxlength
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
auxfile	TokenNameIdentifier	 auxfile
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
auxlength	TokenNameIdentifier	 auxlength
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FileInputStream	TokenNameIdentifier	 File Input Stream
auxinput	TokenNameIdentifier	 auxinput
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
auxinput	TokenNameIdentifier	 auxinput
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
auxfile	TokenNameIdentifier	 auxfile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
auxlength	TokenNameIdentifier	 auxlength
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
readFromInputStream	TokenNameIdentifier	 read From Input Stream
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
auxinput	TokenNameIdentifier	 auxinput
,	TokenNameCOMMA	
auxlength	TokenNameIdentifier	 auxlength
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
auxinput	TokenNameIdentifier	 auxinput
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bytecodes	TokenNameIdentifier	 bytecodes
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Convert the Vector of byte[] to byte[][]. 	TokenNameCOMMENT_LINE	Convert the Vector of byte[] to byte[][]. 
final	TokenNamefinal	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
bytecodes	TokenNameIdentifier	 bytecodes
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
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
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
bytecodes	TokenNameIdentifier	 bytecodes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Load the translet classes from the jar file and return the bytecode. * * @param source The xsl source * @param fullClassName The full name of the translet * @return The bytecode array */	TokenNameCOMMENT_JAVADOC	 Load the translet classes from the jar file and return the bytecode. * @param source The xsl source @param fullClassName The full name of the translet @return The bytecode array 
private	TokenNameprivate	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getBytecodesFromJar	TokenNameIdentifier	 get Bytecodes From Jar
(	TokenNameLPAREN	
Source	TokenNameIdentifier	 Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fullClassName	TokenNameIdentifier	 full Class Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
xslFileName	TokenNameIdentifier	 xsl File Name
=	TokenNameEQUAL	
getStylesheetFileName	TokenNameIdentifier	 get Stylesheet File Name
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
xslFile	TokenNameIdentifier	 xsl File
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
xslFileName	TokenNameIdentifier	 xsl File Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
xslFile	TokenNameIdentifier	 xsl File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
xslFileName	TokenNameIdentifier	 xsl File Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Construct the path for the jar file 	TokenNameCOMMENT_LINE	Construct the path for the jar file 
String	TokenNameIdentifier	 String
jarPath	TokenNameIdentifier	 jar Path
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_destinationDirectory	TokenNameIdentifier	 destination Directory
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
jarPath	TokenNameIdentifier	 jar Path
=	TokenNameEQUAL	
_destinationDirectory	TokenNameIdentifier	 destination Directory
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
+	TokenNamePLUS	
_jarFileName	TokenNameIdentifier	 jar File Name
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
xslFile	TokenNameIdentifier	 xsl File
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
xslFile	TokenNameIdentifier	 xsl File
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
jarPath	TokenNameIdentifier	 jar Path
=	TokenNameEQUAL	
xslFile	TokenNameIdentifier	 xsl File
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
+	TokenNamePLUS	
_jarFileName	TokenNameIdentifier	 jar File Name
;	TokenNameSEMICOLON	
else	TokenNameelse	
jarPath	TokenNameIdentifier	 jar Path
=	TokenNameEQUAL	
_jarFileName	TokenNameIdentifier	 jar File Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Return null if the jar file does not exist. 	TokenNameCOMMENT_LINE	Return null if the jar file does not exist. 
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
jarPath	TokenNameIdentifier	 jar Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Compare the timestamps of the jar file and the xsl file. Return null 	TokenNameCOMMENT_LINE	Compare the timestamps of the jar file and the xsl file. Return null 
// if the xsl file is newer than the jar file. 	TokenNameCOMMENT_LINE	if the xsl file is newer than the jar file. 
if	TokenNameif	
(	TokenNameLPAREN	
xslFile	TokenNameIdentifier	 xsl File
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
xslFile	TokenNameIdentifier	 xsl File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
xslTimestamp	TokenNameIdentifier	 xsl Timestamp
=	TokenNameEQUAL	
xslFile	TokenNameIdentifier	 xsl File
.	TokenNameDOT	
lastModified	TokenNameIdentifier	 last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
transletTimestamp	TokenNameIdentifier	 translet Timestamp
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
lastModified	TokenNameIdentifier	 last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
transletTimestamp	TokenNameIdentifier	 translet Timestamp
<	TokenNameLESS	
xslTimestamp	TokenNameIdentifier	 xsl Timestamp
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Create a ZipFile object for the jar file 	TokenNameCOMMENT_LINE	Create a ZipFile object for the jar file 
ZipFile	TokenNameIdentifier	 Zip File
jarFile	TokenNameIdentifier	 jar File
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
jarFile	TokenNameIdentifier	 jar File
=	TokenNameEQUAL	
new	TokenNamenew	
ZipFile	TokenNameIdentifier	 Zip File
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
transletPath	TokenNameIdentifier	 translet Path
=	TokenNameEQUAL	
fullClassName	TokenNameIdentifier	 full Class Name
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
transletAuxPrefix	TokenNameIdentifier	 translet Aux Prefix
=	TokenNameEQUAL	
transletPath	TokenNameIdentifier	 translet Path
+	TokenNamePLUS	
"$"	TokenNameStringLiteral	$
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
transletFullName	TokenNameIdentifier	 translet Full Name
=	TokenNameEQUAL	
transletPath	TokenNameIdentifier	 translet Path
+	TokenNamePLUS	
".class"	TokenNameStringLiteral	.class
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
bytecodes	TokenNameIdentifier	 bytecodes
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Iterate through all entries in the jar file to find the 	TokenNameCOMMENT_LINE	Iterate through all entries in the jar file to find the 
// translet and auxiliary classes. 	TokenNameCOMMENT_LINE	translet and auxiliary classes. 
Enumeration	TokenNameIdentifier	 Enumeration
entries	TokenNameIdentifier	 entries
=	TokenNameEQUAL	
jarFile	TokenNameIdentifier	 jar File
.	TokenNameDOT	
entries	TokenNameIdentifier	 entries
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ZipEntry	TokenNameIdentifier	 Zip Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ZipEntry	TokenNameIdentifier	 Zip Entry
)	TokenNameRPAREN	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
entryName	TokenNameIdentifier	 entry Name
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
entryName	TokenNameIdentifier	 entry Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
transletFullName	TokenNameIdentifier	 translet Full Name
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
entryName	TokenNameIdentifier	 entry Name
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
".class"	TokenNameStringLiteral	.class
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
entryName	TokenNameIdentifier	 entry Name
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
transletAuxPrefix	TokenNameIdentifier	 translet Aux Prefix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
InputStream	TokenNameIdentifier	 Input Stream
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
jarFile	TokenNameIdentifier	 jar File
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
readFromInputStream	TokenNameIdentifier	 read From Input Stream
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bytecodes	TokenNameIdentifier	 bytecodes
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Convert the Vector of byte[] to byte[][]. 	TokenNameCOMMENT_LINE	Convert the Vector of byte[] to byte[][]. 
final	TokenNamefinal	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
bytecodes	TokenNameIdentifier	 bytecodes
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
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
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
bytecodes	TokenNameIdentifier	 bytecodes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Read a given number of bytes from the InputStream into a byte array. * * @param bytes The byte array to store the input content. * @param input The input stream. * @param size The number of bytes to read. */	TokenNameCOMMENT_JAVADOC	 Read a given number of bytes from the InputStream into a byte array. * @param bytes The byte array to store the input content. @param input The input stream. @param size The number of bytes to read. 
private	TokenNameprivate	
void	TokenNamevoid	
readFromInputStream	TokenNameIdentifier	 read From Input Stream
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
InputStream	TokenNameIdentifier	 Input Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Return the base class name of the translet. * The translet name is resolved using the following rules: * 1. if the _transletName attribute is set and its value is not "GregorSamsa", * then _transletName is returned. * 2. otherwise get the translet name from the base name of the system ID * 3. return "GregorSamsa" if the result from step 2 is null. * * @param source The input Source * @return The name of the translet class */	TokenNameCOMMENT_JAVADOC	 Return the base class name of the translet. The translet name is resolved using the following rules: 1. if the _transletName attribute is set and its value is not "GregorSamsa", then _transletName is returned. 2. otherwise get the translet name from the base name of the system ID 3. return "GregorSamsa" if the result from step 2 is null. * @param source The input Source @return The name of the translet class 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getTransletBaseName	TokenNameIdentifier	 get Translet Base Name
(	TokenNameLPAREN	
Source	TokenNameIdentifier	 Source
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
transletBaseName	TokenNameIdentifier	 translet Base Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
_transletName	TokenNameIdentifier	 translet Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
DEFAULT_TRANSLET_NAME	TokenNameIdentifier	 DEFAULT  TRANSLET  NAME
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
_transletName	TokenNameIdentifier	 translet Name
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
baseName	TokenNameIdentifier	 base Name
=	TokenNameEQUAL	
Util	TokenNameIdentifier	 Util
.	TokenNameDOT	
baseName	TokenNameIdentifier	 base Name
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
baseName	TokenNameIdentifier	 base Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
baseName	TokenNameIdentifier	 base Name
=	TokenNameEQUAL	
Util	TokenNameIdentifier	 Util
.	TokenNameDOT	
noExtName	TokenNameIdentifier	 no Ext Name
(	TokenNameLPAREN	
baseName	TokenNameIdentifier	 base Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transletBaseName	TokenNameIdentifier	 translet Base Name
=	TokenNameEQUAL	
Util	TokenNameIdentifier	 Util
.	TokenNameDOT	
toJavaName	TokenNameIdentifier	 to Java Name
(	TokenNameLPAREN	
baseName	TokenNameIdentifier	 base Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
transletBaseName	TokenNameIdentifier	 translet Base Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
transletBaseName	TokenNameIdentifier	 translet Base Name
:	TokenNameCOLON	
DEFAULT_TRANSLET_NAME	TokenNameIdentifier	 DEFAULT  TRANSLET  NAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the local file name from the systemId of the Source object * * @param source The Source * @return The file name in the local filesystem, or null if the * systemId does not represent a local file. */	TokenNameCOMMENT_JAVADOC	 Return the local file name from the systemId of the Source object * @param source The Source @return The file name in the local filesystem, or null if the systemId does not represent a local file. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getStylesheetFileName	TokenNameIdentifier	 get Stylesheet File Name
(	TokenNameLPAREN	
Source	TokenNameIdentifier	 Source
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
systemId	TokenNameIdentifier	 system Id
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
URL	TokenNameIdentifier	 URL
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
"file"	TokenNameStringLiteral	file
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
getProtocol	TokenNameIdentifier	 get Protocol
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the Class object the provides the XSLTC DTM Manager service. */	TokenNameCOMMENT_JAVADOC	 Returns the Class object the provides the XSLTC DTM Manager service. 
protected	TokenNameprotected	
Class	TokenNameIdentifier	 Class
getDTMManagerClass	TokenNameIdentifier	 get DTM Manager Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_DTMManagerClass	TokenNameIdentifier	 m  DTM Manager Class
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
