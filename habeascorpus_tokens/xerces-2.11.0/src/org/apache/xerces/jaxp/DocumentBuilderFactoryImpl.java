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
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
DOMParser	TokenNameIdentifier	 DOM Parser
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
SAXMessageFormatter	TokenNameIdentifier	 SAX Message Formatter
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
/** * @author Rajiv Mordani * @author Edwin Goei * @version $Id: DocumentBuilderFactoryImpl.java 447237 2006-09-18 05:03:10Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 @author Rajiv Mordani @author Edwin Goei @version $Id: DocumentBuilderFactoryImpl.java 447237 2006-09-18 05:03:10Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
DocumentBuilderFactoryImpl	TokenNameIdentifier	 Document Builder Factory Impl
extends	TokenNameextends	
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
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
/** Feature identifier: validation */	TokenNameCOMMENT_JAVADOC	 Feature identifier: validation 
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
/** Feature identifier: include ignorable white space. */	TokenNameCOMMENT_JAVADOC	 Feature identifier: include ignorable white space. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
INCLUDE_IGNORABLE_WHITESPACE	TokenNameIdentifier	 INCLUDE  IGNORABLE  WHITESPACE
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_FEATURE_PREFIX	TokenNameIdentifier	 XERCES  FEATURE  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
INCLUDE_IGNORABLE_WHITESPACE	TokenNameIdentifier	 INCLUDE  IGNORABLE  WHITESPACE
;	TokenNameSEMICOLON	
/** Feature identifier: create entiry ref nodes feature. */	TokenNameCOMMENT_JAVADOC	 Feature identifier: create entiry ref nodes feature. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CREATE_ENTITY_REF_NODES_FEATURE	TokenNameIdentifier	 CREATE  ENTITY  REF  NODES  FEATURE
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_FEATURE_PREFIX	TokenNameIdentifier	 XERCES  FEATURE  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
CREATE_ENTITY_REF_NODES_FEATURE	TokenNameIdentifier	 CREATE  ENTITY  REF  NODES  FEATURE
;	TokenNameSEMICOLON	
/** Feature identifier: include comments feature. */	TokenNameCOMMENT_JAVADOC	 Feature identifier: include comments feature. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
INCLUDE_COMMENTS_FEATURE	TokenNameIdentifier	 INCLUDE  COMMENTS  FEATURE
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_FEATURE_PREFIX	TokenNameIdentifier	 XERCES  FEATURE  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
INCLUDE_COMMENTS_FEATURE	TokenNameIdentifier	 INCLUDE  COMMENTS  FEATURE
;	TokenNameSEMICOLON	
/** Feature identifier: create cdata nodes feature. */	TokenNameCOMMENT_JAVADOC	 Feature identifier: create cdata nodes feature. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CREATE_CDATA_NODES_FEATURE	TokenNameIdentifier	 CREATE  CDATA  NODES  FEATURE
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_FEATURE_PREFIX	TokenNameIdentifier	 XERCES  FEATURE  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
CREATE_CDATA_NODES_FEATURE	TokenNameIdentifier	 CREATE  CDATA  NODES  FEATURE
;	TokenNameSEMICOLON	
/** These are DocumentBuilderFactory attributes not DOM attributes */	TokenNameCOMMENT_JAVADOC	 These are DocumentBuilderFactory attributes not DOM attributes 
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
attributes	TokenNameIdentifier	 attributes
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
/** * Creates a new instance of a {@link javax.xml.parsers.DocumentBuilder} * using the currently configured parameters. */	TokenNameCOMMENT_JAVADOC	 Creates a new instance of a {@link javax.xml.parsers.DocumentBuilder} using the currently configured parameters. 
public	TokenNamepublic	
DocumentBuilder	TokenNameIdentifier	 Document Builder
newDocumentBuilder	TokenNameIdentifier	 new Document Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
{	TokenNameLBRACE	
/** Check that if a Schema has been specified that neither of the schema properties have been set. */	TokenNameCOMMENT_JAVADOC	 Check that if a Schema has been specified that neither of the schema properties have been set. 
if	TokenNameif	
(	TokenNameLPAREN	
grammar	TokenNameIdentifier	 grammar
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
attributes	TokenNameIdentifier	 attributes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
JAXPConstants	TokenNameIdentifier	 JAXP Constants
.	TokenNameDOT	
JAXP_SCHEMA_LANGUAGE	TokenNameIdentifier	 JAXP  SCHEMA  LANGUAGE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
(	TokenNameLPAREN	
SAXMessageFormatter	TokenNameIdentifier	 SAX Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"schema-already-specified"	TokenNameStringLiteral	schema-already-specified
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
JAXPConstants	TokenNameIdentifier	 JAXP Constants
.	TokenNameDOT	
JAXP_SCHEMA_LANGUAGE	TokenNameIdentifier	 JAXP  SCHEMA  LANGUAGE
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
JAXPConstants	TokenNameIdentifier	 JAXP Constants
.	TokenNameDOT	
JAXP_SCHEMA_SOURCE	TokenNameIdentifier	 JAXP  SCHEMA  SOURCE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
(	TokenNameLPAREN	
SAXMessageFormatter	TokenNameIdentifier	 SAX Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"schema-already-specified"	TokenNameStringLiteral	schema-already-specified
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
JAXPConstants	TokenNameIdentifier	 JAXP Constants
.	TokenNameDOT	
JAXP_SCHEMA_SOURCE	TokenNameIdentifier	 JAXP  SCHEMA  SOURCE
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DocumentBuilderImpl	TokenNameIdentifier	 Document Builder Impl
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
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
// Handles both SAXNotSupportedException, SAXNotRecognizedException 	TokenNameCOMMENT_LINE	Handles both SAXNotSupportedException, SAXNotRecognizedException 
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
}	TokenNameRBRACE	
/** * Allows the user to set specific attributes on the underlying * implementation. * @param name name of attribute * @param value null means to remove attribute */	TokenNameCOMMENT_JAVADOC	 Allows the user to set specific attributes on the underlying implementation. @param name name of attribute @param value null means to remove attribute 
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
// This handles removal of attributes 	TokenNameCOMMENT_LINE	This handles removal of attributes 
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Unrecognized attributes do not cause an exception 	TokenNameCOMMENT_LINE	Unrecognized attributes do not cause an exception 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// This is ugly. We have to collect the attributes and then 	TokenNameCOMMENT_LINE	This is ugly. We have to collect the attributes and then 
// later create a DocumentBuilderImpl to verify the attributes. 	TokenNameCOMMENT_LINE	later create a DocumentBuilderImpl to verify the attributes. 
// Create Hashtable if none existed before 	TokenNameCOMMENT_LINE	Create Hashtable if none existed before 
if	TokenNameif	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attributes	TokenNameIdentifier	 attributes
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Test the attribute name by possibly throwing an exception 	TokenNameCOMMENT_LINE	Test the attribute name by possibly throwing an exception 
try	TokenNametry	
{	TokenNameLBRACE	
new	TokenNamenew	
DocumentBuilderImpl	TokenNameIdentifier	 Document Builder Impl
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
features	TokenNameIdentifier	 features
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Allows the user to retrieve specific attributes on the underlying * implementation. */	TokenNameCOMMENT_JAVADOC	 Allows the user to retrieve specific attributes on the underlying implementation. 
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
// See if it's in the attributes Hashtable 	TokenNameCOMMENT_LINE	See if it's in the attributes Hashtable 
if	TokenNameif	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
DOMParser	TokenNameIdentifier	 DOM Parser
domParser	TokenNameIdentifier	 dom Parser
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// We create a dummy DocumentBuilderImpl in case the attribute 	TokenNameCOMMENT_LINE	We create a dummy DocumentBuilderImpl in case the attribute 
// name is not one that is in the attributes hashtable. 	TokenNameCOMMENT_LINE	name is not one that is in the attributes hashtable. 
domParser	TokenNameIdentifier	 dom Parser
=	TokenNameEQUAL	
new	TokenNamenew	
DocumentBuilderImpl	TokenNameIdentifier	 Document Builder Impl
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
features	TokenNameIdentifier	 features
)	TokenNameRPAREN	
.	TokenNameDOT	
getDOMParser	TokenNameIdentifier	 get DOM Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
domParser	TokenNameIdentifier	 dom Parser
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
se1	TokenNameIdentifier	 se1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// assert(name is not recognized or not supported), try feature 	TokenNameCOMMENT_LINE	assert(name is not recognized or not supported), try feature 
try	TokenNametry	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
domParser	TokenNameIdentifier	 dom Parser
.	TokenNameDOT	
getFeature	TokenNameIdentifier	 get Feature
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Must have been a feature 	TokenNameCOMMENT_LINE	Must have been a feature 
return	TokenNamereturn	
result	TokenNameIdentifier	 result
?	TokenNameQUESTION	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
:	TokenNameCOLON	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
se2	TokenNameIdentifier	 se2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Not a property or a feature 	TokenNameCOMMENT_LINE	Not a property or a feature 
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
se1	TokenNameIdentifier	 se1
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
public	TokenNamepublic	
boolean	TokenNameboolean	
getFeature	TokenNameIdentifier	 get Feature
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
{	TokenNameLBRACE	
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
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
INCLUDE_IGNORABLE_WHITESPACE	TokenNameIdentifier	 INCLUDE  IGNORABLE  WHITESPACE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
isIgnoringElementContentWhitespace	TokenNameIdentifier	 is Ignoring Element Content Whitespace
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
CREATE_ENTITY_REF_NODES_FEATURE	TokenNameIdentifier	 CREATE  ENTITY  REF  NODES  FEATURE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
isExpandEntityReferences	TokenNameIdentifier	 is Expand Entity References
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
INCLUDE_COMMENTS_FEATURE	TokenNameIdentifier	 INCLUDE  COMMENTS  FEATURE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
isIgnoringComments	TokenNameIdentifier	 is Ignoring Comments
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
CREATE_CDATA_NODES_FEATURE	TokenNameIdentifier	 CREATE  CDATA  NODES  FEATURE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
isCoalescing	TokenNameIdentifier	 is Coalescing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// See if it's in the features Hashtable 	TokenNameCOMMENT_LINE	See if it's in the features Hashtable 
if	TokenNameif	
(	TokenNameLPAREN	
features	TokenNameIdentifier	 features
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
DOMParser	TokenNameIdentifier	 DOM Parser
domParser	TokenNameIdentifier	 dom Parser
=	TokenNameEQUAL	
new	TokenNamenew	
DocumentBuilderImpl	TokenNameIdentifier	 Document Builder Impl
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
features	TokenNameIdentifier	 features
)	TokenNameRPAREN	
.	TokenNameDOT	
getDOMParser	TokenNameIdentifier	 get DOM Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
domParser	TokenNameIdentifier	 dom Parser
.	TokenNameDOT	
getFeature	TokenNameIdentifier	 get Feature
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
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
new	TokenNamenew	
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
{	TokenNameLBRACE	
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
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
INCLUDE_IGNORABLE_WHITESPACE	TokenNameIdentifier	 INCLUDE  IGNORABLE  WHITESPACE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setIgnoringElementContentWhitespace	TokenNameIdentifier	 set Ignoring Element Content Whitespace
(	TokenNameLPAREN	
!	TokenNameNOT	
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
CREATE_ENTITY_REF_NODES_FEATURE	TokenNameIdentifier	 CREATE  ENTITY  REF  NODES  FEATURE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setExpandEntityReferences	TokenNameIdentifier	 set Expand Entity References
(	TokenNameLPAREN	
!	TokenNameNOT	
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
INCLUDE_COMMENTS_FEATURE	TokenNameIdentifier	 INCLUDE  COMMENTS  FEATURE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setIgnoringComments	TokenNameIdentifier	 set Ignoring Comments
(	TokenNameLPAREN	
!	TokenNameNOT	
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
CREATE_CDATA_NODES_FEATURE	TokenNameIdentifier	 CREATE  CDATA  NODES  FEATURE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setCoalescing	TokenNameIdentifier	 set Coalescing
(	TokenNameLPAREN	
!	TokenNameNOT	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
new	TokenNamenew	
DocumentBuilderImpl	TokenNameIdentifier	 Document Builder Impl
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
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
features	TokenNameIdentifier	 features
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
new	TokenNamenew	
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
