/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
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
HashMap	TokenNameIdentifier	 Hash Map
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
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
XMLComponentManager	TokenNameIdentifier	 XML Component Manager
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
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
;	TokenNameSEMICOLON	
/** * This class implements the basic operations for managing parser * configuration features and properties. This utility class can * be used as a base class for parser configurations or separately * to encapsulate a number of parser settings as a component * manager. * <p> * This class can be constructed with a "parent" settings object * (in the form of an <code>XMLComponentManager</code>) that allows * parser configuration settings to be "chained" together. * * @author Andy Clark, IBM * * @version $Id: ParserConfigurationSettings.java 447241 2006-09-18 05:12:57Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This class implements the basic operations for managing parser configuration features and properties. This utility class can be used as a base class for parser configurations or separately to encapsulate a number of parser settings as a component manager. <p> This class can be constructed with a "parent" settings object (in the form of an <code>XMLComponentManager</code>) that allows parser configuration settings to be "chained" together. * @author Andy Clark, IBM * @version $Id: ParserConfigurationSettings.java 447241 2006-09-18 05:12:57Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
ParserConfigurationSettings	TokenNameIdentifier	 Parser Configuration Settings
implements	TokenNameimplements	
XMLComponentManager	TokenNameIdentifier	 XML Component Manager
{	TokenNameLBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PARSER_SETTINGS	TokenNameIdentifier	 PARSER  SETTINGS
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_FEATURE_PREFIX	TokenNameIdentifier	 XERCES  FEATURE  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
PARSER_SETTINGS	TokenNameIdentifier	 PARSER  SETTINGS
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
// data 	TokenNameCOMMENT_LINE	data 
/** Recognized properties. */	TokenNameCOMMENT_JAVADOC	 Recognized properties. 
protected	TokenNameprotected	
ArrayList	TokenNameIdentifier	 Array List
fRecognizedProperties	TokenNameIdentifier	 f Recognized Properties
;	TokenNameSEMICOLON	
/** Properties. */	TokenNameCOMMENT_JAVADOC	 Properties. 
protected	TokenNameprotected	
HashMap	TokenNameIdentifier	 Hash Map
fProperties	TokenNameIdentifier	 f Properties
;	TokenNameSEMICOLON	
/** Recognized features. */	TokenNameCOMMENT_JAVADOC	 Recognized features. 
protected	TokenNameprotected	
ArrayList	TokenNameIdentifier	 Array List
fRecognizedFeatures	TokenNameIdentifier	 f Recognized Features
;	TokenNameSEMICOLON	
/** Features. */	TokenNameCOMMENT_JAVADOC	 Features. 
protected	TokenNameprotected	
HashMap	TokenNameIdentifier	 Hash Map
fFeatures	TokenNameIdentifier	 f Features
;	TokenNameSEMICOLON	
/** Parent parser configuration settings. */	TokenNameCOMMENT_JAVADOC	 Parent parser configuration settings. 
protected	TokenNameprotected	
XMLComponentManager	TokenNameIdentifier	 XML Component Manager
fParentSettings	TokenNameIdentifier	 f Parent Settings
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Default Constructor. */	TokenNameCOMMENT_JAVADOC	 Default Constructor. 
public	TokenNamepublic	
ParserConfigurationSettings	TokenNameIdentifier	 Parser Configuration Settings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>() 	TokenNameCOMMENT_LINE	<init>() 
/** * Constructs a parser configuration settings object with a * parent settings object. */	TokenNameCOMMENT_JAVADOC	 Constructs a parser configuration settings object with a parent settings object. 
public	TokenNamepublic	
ParserConfigurationSettings	TokenNameIdentifier	 Parser Configuration Settings
(	TokenNameLPAREN	
XMLComponentManager	TokenNameIdentifier	 XML Component Manager
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// create storage for recognized features and properties 	TokenNameCOMMENT_LINE	create storage for recognized features and properties 
fRecognizedFeatures	TokenNameIdentifier	 f Recognized Features
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fRecognizedProperties	TokenNameIdentifier	 f Recognized Properties
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// create table for features and properties 	TokenNameCOMMENT_LINE	create table for features and properties 
fFeatures	TokenNameIdentifier	 f Features
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fProperties	TokenNameIdentifier	 f Properties
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// save parent 	TokenNameCOMMENT_LINE	save parent 
fParentSettings	TokenNameIdentifier	 f Parent Settings
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(XMLComponentManager) 	TokenNameCOMMENT_LINE	<init>(XMLComponentManager) 
// 	TokenNameCOMMENT_LINE	 
// XMLParserConfiguration methods 	TokenNameCOMMENT_LINE	XMLParserConfiguration methods 
// 	TokenNameCOMMENT_LINE	 
/** * Allows a parser to add parser specific features to be recognized * and managed by the parser configuration. * * @param featureIds An array of the additional feature identifiers * to be recognized. */	TokenNameCOMMENT_JAVADOC	 Allows a parser to add parser specific features to be recognized and managed by the parser configuration. * @param featureIds An array of the additional feature identifiers to be recognized. 
public	TokenNamepublic	
void	TokenNamevoid	
addRecognizedFeatures	TokenNameIdentifier	 add Recognized Features
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
featureIds	TokenNameIdentifier	 feature Ids
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// add recognized features 	TokenNameCOMMENT_LINE	add recognized features 
int	TokenNameint	
featureIdsCount	TokenNameIdentifier	 feature Ids Count
=	TokenNameEQUAL	
featureIds	TokenNameIdentifier	 feature Ids
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
featureIds	TokenNameIdentifier	 feature Ids
.	TokenNameDOT	
length	TokenNameIdentifier	 length
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
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
featureIdsCount	TokenNameIdentifier	 feature Ids Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
featureId	TokenNameIdentifier	 feature Id
=	TokenNameEQUAL	
featureIds	TokenNameIdentifier	 feature Ids
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fRecognizedFeatures	TokenNameIdentifier	 f Recognized Features
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
featureId	TokenNameIdentifier	 feature Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fRecognizedFeatures	TokenNameIdentifier	 f Recognized Features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
featureId	TokenNameIdentifier	 feature Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// addRecognizedFeatures(String[]) 	TokenNameCOMMENT_LINE	addRecognizedFeatures(String[]) 
/** * Set the state of a feature. * * Set the state of any feature in a SAX2 parser. The parser * might not recognize the feature, and if it does recognize * it, it might not be able to fulfill the request. * * @param featureId The unique identifier (URI) of the feature. * @param state The requested state of the feature (true or false). * * @exception org.apache.xerces.xni.parser.XMLConfigurationException If the * requested feature is not known. */	TokenNameCOMMENT_JAVADOC	 Set the state of a feature. * Set the state of any feature in a SAX2 parser. The parser might not recognize the feature, and if it does recognize it, it might not be able to fulfill the request. * @param featureId The unique identifier (URI) of the feature. @param state The requested state of the feature (true or false). * @exception org.apache.xerces.xni.parser.XMLConfigurationException If the requested feature is not known. 
public	TokenNamepublic	
void	TokenNamevoid	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
featureId	TokenNameIdentifier	 feature Id
,	TokenNameCOMMA	
boolean	TokenNameboolean	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
{	TokenNameLBRACE	
// check and store 	TokenNameCOMMENT_LINE	check and store 
checkFeature	TokenNameIdentifier	 check Feature
(	TokenNameLPAREN	
featureId	TokenNameIdentifier	 feature Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fFeatures	TokenNameIdentifier	 f Features
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
featureId	TokenNameIdentifier	 feature Id
,	TokenNameCOMMA	
state	TokenNameIdentifier	 state
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
}	TokenNameRBRACE	
// setFeature(String,boolean) 	TokenNameCOMMENT_LINE	setFeature(String,boolean) 
/** * Allows a parser to add parser specific properties to be recognized * and managed by the parser configuration. * * @param propertyIds An array of the additional property identifiers * to be recognized. */	TokenNameCOMMENT_JAVADOC	 Allows a parser to add parser specific properties to be recognized and managed by the parser configuration. * @param propertyIds An array of the additional property identifiers to be recognized. 
public	TokenNamepublic	
void	TokenNamevoid	
addRecognizedProperties	TokenNameIdentifier	 add Recognized Properties
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
propertyIds	TokenNameIdentifier	 property Ids
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// add recognizedProperties 	TokenNameCOMMENT_LINE	add recognizedProperties 
int	TokenNameint	
propertyIdsCount	TokenNameIdentifier	 property Ids Count
=	TokenNameEQUAL	
propertyIds	TokenNameIdentifier	 property Ids
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
propertyIds	TokenNameIdentifier	 property Ids
.	TokenNameDOT	
length	TokenNameIdentifier	 length
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
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
propertyIdsCount	TokenNameIdentifier	 property Ids Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
propertyId	TokenNameIdentifier	 property Id
=	TokenNameEQUAL	
propertyIds	TokenNameIdentifier	 property Ids
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fRecognizedProperties	TokenNameIdentifier	 f Recognized Properties
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
propertyId	TokenNameIdentifier	 property Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fRecognizedProperties	TokenNameIdentifier	 f Recognized Properties
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
propertyId	TokenNameIdentifier	 property Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// addRecognizedProperties(String[]) 	TokenNameCOMMENT_LINE	addRecognizedProperties(String[]) 
/** * setProperty * * @param propertyId * @param value * @exception org.apache.xerces.xni.parser.XMLConfigurationException If the * requested feature is not known. */	TokenNameCOMMENT_JAVADOC	 setProperty * @param propertyId @param value @exception org.apache.xerces.xni.parser.XMLConfigurationException If the requested feature is not known. 
public	TokenNamepublic	
void	TokenNamevoid	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
propertyId	TokenNameIdentifier	 property Id
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
{	TokenNameLBRACE	
// check and store 	TokenNameCOMMENT_LINE	check and store 
checkProperty	TokenNameIdentifier	 check Property
(	TokenNameLPAREN	
propertyId	TokenNameIdentifier	 property Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fProperties	TokenNameIdentifier	 f Properties
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
propertyId	TokenNameIdentifier	 property Id
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setProperty(String,Object) 	TokenNameCOMMENT_LINE	setProperty(String,Object) 
// 	TokenNameCOMMENT_LINE	 
// XMLComponentManager methods 	TokenNameCOMMENT_LINE	XMLComponentManager methods 
// 	TokenNameCOMMENT_LINE	 
/** * Returns the state of a feature. * * @param featureId The feature identifier. * @return true if the feature is supported * * @throws XMLConfigurationException Thrown for configuration error. * In general, components should * only throw this exception if * it is <strong>really</strong> * a critical error. */	TokenNameCOMMENT_JAVADOC	 Returns the state of a feature. * @param featureId The feature identifier. @return true if the feature is supported * @throws XMLConfigurationException Thrown for configuration error. In general, components should only throw this exception if it is <strong>really</strong> a critical error. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getFeature	TokenNameIdentifier	 get Feature
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
featureId	TokenNameIdentifier	 feature Id
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
{	TokenNameLBRACE	
Boolean	TokenNameIdentifier	 Boolean
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
fFeatures	TokenNameIdentifier	 f Features
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
featureId	TokenNameIdentifier	 feature Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkFeature	TokenNameIdentifier	 check Feature
(	TokenNameLPAREN	
featureId	TokenNameIdentifier	 feature Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getFeature(String):boolean 	TokenNameCOMMENT_LINE	getFeature(String):boolean 
/** * Returns the value of a property. * * @param propertyId The property identifier. * @return the value of the property * * @throws XMLConfigurationException Thrown for configuration error. * In general, components should * only throw this exception if * it is <strong>really</strong> * a critical error. */	TokenNameCOMMENT_JAVADOC	 Returns the value of a property. * @param propertyId The property identifier. @return the value of the property * @throws XMLConfigurationException Thrown for configuration error. In general, components should only throw this exception if it is <strong>really</strong> a critical error. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
propertyId	TokenNameIdentifier	 property Id
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
propertyValue	TokenNameIdentifier	 property Value
=	TokenNameEQUAL	
fProperties	TokenNameIdentifier	 f Properties
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
propertyId	TokenNameIdentifier	 property Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
propertyValue	TokenNameIdentifier	 property Value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkProperty	TokenNameIdentifier	 check Property
(	TokenNameLPAREN	
propertyId	TokenNameIdentifier	 property Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
propertyValue	TokenNameIdentifier	 property Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getProperty(String):Object 	TokenNameCOMMENT_LINE	getProperty(String):Object 
// 	TokenNameCOMMENT_LINE	 
// Protected methods 	TokenNameCOMMENT_LINE	Protected methods 
// 	TokenNameCOMMENT_LINE	 
/** * Check a feature. If feature is known and supported, this method simply * returns. Otherwise, the appropriate exception is thrown. * * @param featureId The unique identifier (URI) of the feature. * * @exception org.apache.xerces.xni.parser.XMLConfigurationException If the * requested feature is not known. */	TokenNameCOMMENT_JAVADOC	 Check a feature. If feature is known and supported, this method simply returns. Otherwise, the appropriate exception is thrown. * @param featureId The unique identifier (URI) of the feature. * @exception org.apache.xerces.xni.parser.XMLConfigurationException If the requested feature is not known. 
protected	TokenNameprotected	
void	TokenNamevoid	
checkFeature	TokenNameIdentifier	 check Feature
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
featureId	TokenNameIdentifier	 feature Id
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
{	TokenNameLBRACE	
// check feature 	TokenNameCOMMENT_LINE	check feature 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fRecognizedFeatures	TokenNameIdentifier	 f Recognized Features
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
featureId	TokenNameIdentifier	 feature Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fParentSettings	TokenNameIdentifier	 f Parent Settings
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fParentSettings	TokenNameIdentifier	 f Parent Settings
.	TokenNameDOT	
getFeature	TokenNameIdentifier	 get Feature
(	TokenNameLPAREN	
featureId	TokenNameIdentifier	 feature Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
short	TokenNameshort	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
.	TokenNameDOT	
NOT_RECOGNIZED	TokenNameIdentifier	 NOT  RECOGNIZED
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
featureId	TokenNameIdentifier	 feature Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// checkFeature(String) 	TokenNameCOMMENT_LINE	checkFeature(String) 
/** * Check a property. If the property is known and supported, this method * simply returns. Otherwise, the appropriate exception is thrown. * * @param propertyId The unique identifier (URI) of the property * being set. * @exception org.apache.xerces.xni.parser.XMLConfigurationException If the * requested feature is not known. */	TokenNameCOMMENT_JAVADOC	 Check a property. If the property is known and supported, this method simply returns. Otherwise, the appropriate exception is thrown. * @param propertyId The unique identifier (URI) of the property being set. @exception org.apache.xerces.xni.parser.XMLConfigurationException If the requested feature is not known. 
protected	TokenNameprotected	
void	TokenNamevoid	
checkProperty	TokenNameIdentifier	 check Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
propertyId	TokenNameIdentifier	 property Id
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
{	TokenNameLBRACE	
// check property 	TokenNameCOMMENT_LINE	check property 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fRecognizedProperties	TokenNameIdentifier	 f Recognized Properties
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
propertyId	TokenNameIdentifier	 property Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fParentSettings	TokenNameIdentifier	 f Parent Settings
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fParentSettings	TokenNameIdentifier	 f Parent Settings
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
propertyId	TokenNameIdentifier	 property Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
short	TokenNameshort	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
.	TokenNameDOT	
NOT_RECOGNIZED	TokenNameIdentifier	 NOT  RECOGNIZED
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
propertyId	TokenNameIdentifier	 property Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// checkProperty(String) 	TokenNameCOMMENT_LINE	checkProperty(String) 
}	TokenNameRBRACE	
// class ParserConfigurationSettings 	TokenNameCOMMENT_LINE	class ParserConfigurationSettings 
