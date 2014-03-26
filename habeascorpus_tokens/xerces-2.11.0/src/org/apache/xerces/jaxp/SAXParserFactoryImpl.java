/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
jaxp	TokenNameIdentifier	 jaxp
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
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
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
validation	TokenNameIdentifier	 validation
.	TokenNameDOT	
Schema	TokenNameIdentifier	 Schema
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
SAXNotRecognizedException	TokenNameIdentifier	 SAX Not Recognized Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXNotSupportedException	TokenNameIdentifier	 SAX Not Supported Exception
;	TokenNameSEMICOLON	
/** * This is the implementation specific class for the * <code>javax.xml.parsers.SAXParserFactory</code>. This is the platform * default implementation for the platform. * * @author Rajiv Mordani * @author Edwin Goei * * @version $Id: SAXParserFactoryImpl.java 447237 2006-09-18 05:03:10Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This is the implementation specific class for the <code>javax.xml.parsers.SAXParserFactory</code>. This is the platform default implementation for the platform. * @author Rajiv Mordani @author Edwin Goei * @version $Id: SAXParserFactoryImpl.java 447237 2006-09-18 05:03:10Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
SAXParserFactoryImpl	TokenNameIdentifier	 SAX Parser Factory Impl
extends	TokenNameextends	
SAXParserFactory	TokenNameIdentifier	 SAX Parser Factory
{	TokenNameLBRACE	
/** Feature identifier: namespaces. */	TokenNameCOMMENT_JAVADOC	 Feature identifier: namespaces. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NAMESPACES_FEATURE	TokenNameIdentifier	 NAMESPACES  FEATURE
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SAX_FEATURE_PREFIX	TokenNameIdentifier	 SAX  FEATURE  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
NAMESPACES_FEATURE	TokenNameIdentifier	 NAMESPACES  FEATURE
;	TokenNameSEMICOLON	
/** Feature identifier: validation. */	TokenNameCOMMENT_JAVADOC	 Feature identifier: validation. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
VALIDATION_FEATURE	TokenNameIdentifier	 VALIDATION  FEATURE
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SAX_FEATURE_PREFIX	TokenNameIdentifier	 SAX  FEATURE  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
VALIDATION_FEATURE	TokenNameIdentifier	 VALIDATION  FEATURE
;	TokenNameSEMICOLON	
/** Feature identifier: XInclude processing */	TokenNameCOMMENT_JAVADOC	 Feature identifier: XInclude processing 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XINCLUDE_FEATURE	TokenNameIdentifier	 XINCLUDE  FEATURE
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_FEATURE_PREFIX	TokenNameIdentifier	 XERCES  FEATURE  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XINCLUDE_FEATURE	TokenNameIdentifier	 XINCLUDE  FEATURE
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
features	TokenNameIdentifier	 features
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Schema	TokenNameIdentifier	 Schema
grammar	TokenNameIdentifier	 grammar
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
isXIncludeAware	TokenNameIdentifier	 is X Include Aware
;	TokenNameSEMICOLON	
/** * State of the secure processing feature, initially <code>false</code> */	TokenNameCOMMENT_JAVADOC	 State of the secure processing feature, initially <code>false</code> 
private	TokenNameprivate	
boolean	TokenNameboolean	
fSecureProcess	TokenNameIdentifier	 f Secure Process
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Creates a new instance of <code>SAXParser</code> using the currently * configured factory parameters. * @return javax.xml.parsers.SAXParser */	TokenNameCOMMENT_JAVADOC	 Creates a new instance of <code>SAXParser</code> using the currently configured factory parameters. @return javax.xml.parsers.SAXParser 
public	TokenNamepublic	
SAXParser	TokenNameIdentifier	 SAX Parser
newSAXParser	TokenNameIdentifier	 new SAX Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
{	TokenNameLBRACE	
SAXParser	TokenNameIdentifier	 SAX Parser
saxParserImpl	TokenNameIdentifier	 sax Parser Impl
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
saxParserImpl	TokenNameIdentifier	 sax Parser Impl
=	TokenNameEQUAL	
new	TokenNamenew	
SAXParserImpl	TokenNameIdentifier	 SAX Parser Impl
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
features	TokenNameIdentifier	 features
,	TokenNameCOMMA	
fSecureProcess	TokenNameIdentifier	 f Secure Process
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Translate to ParserConfigurationException 	TokenNameCOMMENT_LINE	Translate to ParserConfigurationException 
throw	TokenNamethrow	
new	TokenNamenew	
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
(	TokenNameLPAREN	
se	TokenNameIdentifier	 se
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
saxParserImpl	TokenNameIdentifier	 sax Parser Impl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Common code for translating exceptions */	TokenNameCOMMENT_JAVADOC	 Common code for translating exceptions 
private	TokenNameprivate	
SAXParserImpl	TokenNameIdentifier	 SAX Parser Impl
newSAXParserImpl	TokenNameIdentifier	 new SAX Parser Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
,	TokenNameCOMMA	
SAXNotRecognizedException	TokenNameIdentifier	 SAX Not Recognized Exception
,	TokenNameCOMMA	
SAXNotSupportedException	TokenNameIdentifier	 SAX Not Supported Exception
{	TokenNameLBRACE	
SAXParserImpl	TokenNameIdentifier	 SAX Parser Impl
saxParserImpl	TokenNameIdentifier	 sax Parser Impl
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
saxParserImpl	TokenNameIdentifier	 sax Parser Impl
=	TokenNameEQUAL	
new	TokenNamenew	
SAXParserImpl	TokenNameIdentifier	 SAX Parser Impl
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
features	TokenNameIdentifier	 features
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXNotSupportedException	TokenNameIdentifier	 SAX Not Supported Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXNotRecognizedException	TokenNameIdentifier	 SAX Not Recognized Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
(	TokenNameLPAREN	
se	TokenNameIdentifier	 se
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
saxParserImpl	TokenNameIdentifier	 sax Parser Impl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the particular feature in the underlying implementation of * org.xml.sax.XMLReader. */	TokenNameCOMMENT_JAVADOC	 Sets the particular feature in the underlying implementation of org.xml.sax.XMLReader. 
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
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
,	TokenNameCOMMA	
SAXNotRecognizedException	TokenNameIdentifier	 SAX Not Recognized Exception
,	TokenNameCOMMA	
SAXNotSupportedException	TokenNameIdentifier	 SAX Not Supported Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If this is the secure processing feature, save it then return. 	TokenNameCOMMENT_LINE	If this is the secure processing feature, save it then return. 
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
fSecureProcess	TokenNameIdentifier	 f Secure Process
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Keep built-in settings in synch with the feature values. 	TokenNameCOMMENT_LINE	Keep built-in settings in synch with the feature values. 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
NAMESPACES_FEATURE	TokenNameIdentifier	 NAMESPACES  FEATURE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setNamespaceAware	TokenNameIdentifier	 set Namespace Aware
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
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
VALIDATION_FEATURE	TokenNameIdentifier	 VALIDATION  FEATURE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setValidating	TokenNameIdentifier	 set Validating
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
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
XINCLUDE_FEATURE	TokenNameIdentifier	 XINCLUDE  FEATURE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setXIncludeAware	TokenNameIdentifier	 set X Include Aware
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// XXX This is ugly. We have to collect the features and then 	TokenNameCOMMENT_LINE	XXX This is ugly. We have to collect the features and then 
// later create an XMLReader to verify the features. 	TokenNameCOMMENT_LINE	later create an XMLReader to verify the features. 
if	TokenNameif	
(	TokenNameLPAREN	
features	TokenNameIdentifier	 features
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
features	TokenNameIdentifier	 features
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
?	TokenNameQUESTION	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
:	TokenNameCOLON	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Test the feature by possibly throwing SAX exceptions 	TokenNameCOMMENT_LINE	Test the feature by possibly throwing SAX exceptions 
try	TokenNametry	
{	TokenNameLBRACE	
newSAXParserImpl	TokenNameIdentifier	 new SAX Parser Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXNotSupportedException	TokenNameIdentifier	 SAX Not Supported Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXNotRecognizedException	TokenNameIdentifier	 SAX Not Recognized Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * returns the particular property requested for in the underlying * implementation of org.xml.sax.XMLReader. */	TokenNameCOMMENT_JAVADOC	 returns the particular property requested for in the underlying implementation of org.xml.sax.XMLReader. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getFeature	TokenNameIdentifier	 get Feature
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
,	TokenNameCOMMA	
SAXNotRecognizedException	TokenNameIdentifier	 SAX Not Recognized Exception
,	TokenNameCOMMA	
SAXNotSupportedException	TokenNameIdentifier	 SAX Not Supported Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
fSecureProcess	TokenNameIdentifier	 f Secure Process
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
NAMESPACES_FEATURE	TokenNameIdentifier	 NAMESPACES  FEATURE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isNamespaceAware	TokenNameIdentifier	 is Namespace Aware
(	TokenNameLPAREN	
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
VALIDATION_FEATURE	TokenNameIdentifier	 VALIDATION  FEATURE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isValidating	TokenNameIdentifier	 is Validating
(	TokenNameLPAREN	
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
XINCLUDE_FEATURE	TokenNameIdentifier	 XINCLUDE  FEATURE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isXIncludeAware	TokenNameIdentifier	 is X Include Aware
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Check for valid name by creating a dummy XMLReader to get 	TokenNameCOMMENT_LINE	Check for valid name by creating a dummy XMLReader to get 
// feature value 	TokenNameCOMMENT_LINE	feature value 
return	TokenNamereturn	
newSAXParserImpl	TokenNameIdentifier	 new SAX Parser Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getXMLReader	TokenNameIdentifier	 get XML Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getFeature	TokenNameIdentifier	 get Feature
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Schema	TokenNameIdentifier	 Schema
getSchema	TokenNameIdentifier	 get Schema
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
grammar	TokenNameIdentifier	 grammar
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setSchema	TokenNameIdentifier	 set Schema
(	TokenNameLPAREN	
Schema	TokenNameIdentifier	 Schema
grammar	TokenNameIdentifier	 grammar
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
grammar	TokenNameIdentifier	 grammar
=	TokenNameEQUAL	
grammar	TokenNameIdentifier	 grammar
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isXIncludeAware	TokenNameIdentifier	 is X Include Aware
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
isXIncludeAware	TokenNameIdentifier	 is X Include Aware
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setXIncludeAware	TokenNameIdentifier	 set X Include Aware
(	TokenNameLPAREN	
boolean	TokenNameboolean	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
isXIncludeAware	TokenNameIdentifier	 is X Include Aware
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
