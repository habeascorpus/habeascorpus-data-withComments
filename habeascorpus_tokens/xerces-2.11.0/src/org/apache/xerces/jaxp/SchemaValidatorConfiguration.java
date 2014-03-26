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
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
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
validation	TokenNameIdentifier	 validation
.	TokenNameDOT	
ValidationManager	TokenNameIdentifier	 Validation Manager
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
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
XSMessageFormatter	TokenNameIdentifier	 XS Message Formatter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
jaxp	TokenNameIdentifier	 jaxp
.	TokenNameDOT	
validation	TokenNameIdentifier	 validation
.	TokenNameDOT	
XSGrammarPoolContainer	TokenNameIdentifier	 XS Grammar Pool Container
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
grammars	TokenNameIdentifier	 grammars
.	TokenNameDOT	
XMLGrammarPool	TokenNameIdentifier	 XML Grammar Pool
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
/** * <p>Parser configuration for Xerces' XMLSchemaValidator.</p> * * @version $Id: SchemaValidatorConfiguration.java 447237 2006-09-18 05:03:10Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 <p>Parser configuration for Xerces' XMLSchemaValidator.</p> * @version $Id: SchemaValidatorConfiguration.java 447237 2006-09-18 05:03:10Z mrglavas $ 
final	TokenNamefinal	
class	TokenNameclass	
SchemaValidatorConfiguration	TokenNameIdentifier	 Schema Validator Configuration
implements	TokenNameimplements	
XMLComponentManager	TokenNameIdentifier	 XML Component Manager
{	TokenNameLBRACE	
// feature identifiers 	TokenNameCOMMENT_LINE	feature identifiers 
/** Feature identifier: schema validation. */	TokenNameCOMMENT_JAVADOC	 Feature identifier: schema validation. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SCHEMA_VALIDATION	TokenNameIdentifier	 SCHEMA  VALIDATION
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_FEATURE_PREFIX	TokenNameIdentifier	 XERCES  FEATURE  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SCHEMA_VALIDATION_FEATURE	TokenNameIdentifier	 SCHEMA  VALIDATION  FEATURE
;	TokenNameSEMICOLON	
/** Feature identifier: validation. */	TokenNameCOMMENT_JAVADOC	 Feature identifier: validation. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
VALIDATION	TokenNameIdentifier	 VALIDATION
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SAX_FEATURE_PREFIX	TokenNameIdentifier	 SAX  FEATURE  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
VALIDATION_FEATURE	TokenNameIdentifier	 VALIDATION  FEATURE
;	TokenNameSEMICOLON	
/** Feature identifier: use grammar pool only. */	TokenNameCOMMENT_JAVADOC	 Feature identifier: use grammar pool only. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
USE_GRAMMAR_POOL_ONLY	TokenNameIdentifier	 USE  GRAMMAR  POOL  ONLY
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_FEATURE_PREFIX	TokenNameIdentifier	 XERCES  FEATURE  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
USE_GRAMMAR_POOL_ONLY_FEATURE	TokenNameIdentifier	 USE  GRAMMAR  POOL  ONLY  FEATURE
;	TokenNameSEMICOLON	
/** Feature identifier: parser settings. */	TokenNameCOMMENT_JAVADOC	 Feature identifier: parser settings. 
private	TokenNameprivate	
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
// property identifiers 	TokenNameCOMMENT_LINE	property identifiers 
/** Property identifier: error reporter. */	TokenNameCOMMENT_JAVADOC	 Property identifier: error reporter. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_REPORTER	TokenNameIdentifier	 ERROR  REPORTER
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_PROPERTY_PREFIX	TokenNameIdentifier	 XERCES  PROPERTY  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ERROR_REPORTER_PROPERTY	TokenNameIdentifier	 ERROR  REPORTER  PROPERTY
;	TokenNameSEMICOLON	
/** Property identifier: validation manager. */	TokenNameCOMMENT_JAVADOC	 Property identifier: validation manager. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
VALIDATION_MANAGER	TokenNameIdentifier	 VALIDATION  MANAGER
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_PROPERTY_PREFIX	TokenNameIdentifier	 XERCES  PROPERTY  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
VALIDATION_MANAGER_PROPERTY	TokenNameIdentifier	 VALIDATION  MANAGER  PROPERTY
;	TokenNameSEMICOLON	
/** Property identifier: grammar pool. */	TokenNameCOMMENT_JAVADOC	 Property identifier: grammar pool. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XMLGRAMMAR_POOL	TokenNameIdentifier	 XMLGRAMMAR  POOL
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_PROPERTY_PREFIX	TokenNameIdentifier	 XERCES  PROPERTY  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XMLGRAMMAR_POOL_PROPERTY	TokenNameIdentifier	 XMLGRAMMAR  POOL  PROPERTY
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Parent component manager. **/	TokenNameCOMMENT_JAVADOC	 Parent component manager. *
private	TokenNameprivate	
final	TokenNamefinal	
XMLComponentManager	TokenNameIdentifier	 XML Component Manager
fParentComponentManager	TokenNameIdentifier	 f Parent Component Manager
;	TokenNameSEMICOLON	
/** The Schema's grammar pool. **/	TokenNameCOMMENT_JAVADOC	 The Schema's grammar pool. *
private	TokenNameprivate	
final	TokenNamefinal	
XMLGrammarPool	TokenNameIdentifier	 XML Grammar Pool
fGrammarPool	TokenNameIdentifier	 f Grammar Pool
;	TokenNameSEMICOLON	
/** * Tracks whether the validator should use components from * the grammar pool to the exclusion of all others. */	TokenNameCOMMENT_JAVADOC	 Tracks whether the validator should use components from the grammar pool to the exclusion of all others. 
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
fUseGrammarPoolOnly	TokenNameIdentifier	 f Use Grammar Pool Only
;	TokenNameSEMICOLON	
/** Validation manager. */	TokenNameCOMMENT_JAVADOC	 Validation manager. 
private	TokenNameprivate	
final	TokenNamefinal	
ValidationManager	TokenNameIdentifier	 Validation Manager
fValidationManager	TokenNameIdentifier	 f Validation Manager
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SchemaValidatorConfiguration	TokenNameIdentifier	 Schema Validator Configuration
(	TokenNameLPAREN	
XMLComponentManager	TokenNameIdentifier	 XML Component Manager
parentManager	TokenNameIdentifier	 parent Manager
,	TokenNameCOMMA	
XSGrammarPoolContainer	TokenNameIdentifier	 XS Grammar Pool Container
grammarContainer	TokenNameIdentifier	 grammar Container
,	TokenNameCOMMA	
ValidationManager	TokenNameIdentifier	 Validation Manager
validationManager	TokenNameIdentifier	 validation Manager
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fParentComponentManager	TokenNameIdentifier	 f Parent Component Manager
=	TokenNameEQUAL	
parentManager	TokenNameIdentifier	 parent Manager
;	TokenNameSEMICOLON	
fGrammarPool	TokenNameIdentifier	 f Grammar Pool
=	TokenNameEQUAL	
grammarContainer	TokenNameIdentifier	 grammar Container
.	TokenNameDOT	
getGrammarPool	TokenNameIdentifier	 get Grammar Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fUseGrammarPoolOnly	TokenNameIdentifier	 f Use Grammar Pool Only
=	TokenNameEQUAL	
grammarContainer	TokenNameIdentifier	 grammar Container
.	TokenNameDOT	
isFullyComposed	TokenNameIdentifier	 is Fully Composed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fValidationManager	TokenNameIdentifier	 f Validation Manager
=	TokenNameEQUAL	
validationManager	TokenNameIdentifier	 validation Manager
;	TokenNameSEMICOLON	
// add schema message formatter to error reporter 	TokenNameCOMMENT_LINE	add schema message formatter to error reporter 
try	TokenNametry	
{	TokenNameLBRACE	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
errorReporter	TokenNameIdentifier	 error Reporter
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
)	TokenNameRPAREN	
fParentComponentManager	TokenNameIdentifier	 f Parent Component Manager
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
ERROR_REPORTER	TokenNameIdentifier	 ERROR  REPORTER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
errorReporter	TokenNameIdentifier	 error Reporter
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorReporter	TokenNameIdentifier	 error Reporter
.	TokenNameDOT	
putMessageFormatter	TokenNameIdentifier	 put Message Formatter
(	TokenNameLPAREN	
XSMessageFormatter	TokenNameIdentifier	 XS Message Formatter
.	TokenNameDOT	
SCHEMA_DOMAIN	TokenNameIdentifier	 SCHEMA  DOMAIN
,	TokenNameCOMMA	
new	TokenNamenew	
XSMessageFormatter	TokenNameIdentifier	 XS Message Formatter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Ignore exception. 	TokenNameCOMMENT_LINE	Ignore exception. 
catch	TokenNamecatch	
(	TokenNameLPAREN	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
exc	TokenNameIdentifier	 exc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
if	TokenNameif	
(	TokenNameLPAREN	
PARSER_SETTINGS	TokenNameIdentifier	 PARSER  SETTINGS
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
featureId	TokenNameIdentifier	 feature Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fParentComponentManager	TokenNameIdentifier	 f Parent Component Manager
.	TokenNameDOT	
getFeature	TokenNameIdentifier	 get Feature
(	TokenNameLPAREN	
featureId	TokenNameIdentifier	 feature Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
VALIDATION	TokenNameIdentifier	 VALIDATION
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
featureId	TokenNameIdentifier	 feature Id
)	TokenNameRPAREN	
||	TokenNameOR_OR	
SCHEMA_VALIDATION	TokenNameIdentifier	 SCHEMA  VALIDATION
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
featureId	TokenNameIdentifier	 feature Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
USE_GRAMMAR_POOL_ONLY	TokenNameIdentifier	 USE  GRAMMAR  POOL  ONLY
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
featureId	TokenNameIdentifier	 feature Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fUseGrammarPoolOnly	TokenNameIdentifier	 f Use Grammar Pool Only
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fParentComponentManager	TokenNameIdentifier	 f Parent Component Manager
.	TokenNameDOT	
getFeature	TokenNameIdentifier	 get Feature
(	TokenNameLPAREN	
featureId	TokenNameIdentifier	 feature Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
if	TokenNameif	
(	TokenNameLPAREN	
XMLGRAMMAR_POOL	TokenNameIdentifier	 XMLGRAMMAR  POOL
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
propertyId	TokenNameIdentifier	 property Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fGrammarPool	TokenNameIdentifier	 f Grammar Pool
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
VALIDATION_MANAGER	TokenNameIdentifier	 VALIDATION  MANAGER
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
propertyId	TokenNameIdentifier	 property Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fValidationManager	TokenNameIdentifier	 f Validation Manager
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fParentComponentManager	TokenNameIdentifier	 f Parent Component Manager
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
propertyId	TokenNameIdentifier	 property Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
