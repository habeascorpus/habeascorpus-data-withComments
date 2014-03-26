/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
jaxp	TokenNameIdentifier	 jaxp
.	TokenNameDOT	
validation	TokenNameIdentifier	 validation
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
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
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
validation	TokenNameIdentifier	 validation
.	TokenNameDOT	
Validator	TokenNameIdentifier	 Validator
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
validation	TokenNameIdentifier	 validation
.	TokenNameDOT	
ValidatorHandler	TokenNameIdentifier	 Validator Handler
;	TokenNameSEMICOLON	
/** * <p>Abstract implementation of Schema for W3C XML Schemas.</p> * * @author Michael Glavassevich, IBM * @version $Id: AbstractXMLSchema.java 447235 2006-09-18 05:01:44Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 <p>Abstract implementation of Schema for W3C XML Schemas.</p> * @author Michael Glavassevich, IBM @version $Id: AbstractXMLSchema.java 447235 2006-09-18 05:01:44Z mrglavas $ 
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractXMLSchema	TokenNameIdentifier	 Abstract XML Schema
extends	TokenNameextends	
Schema	TokenNameIdentifier	 Schema
implements	TokenNameimplements	
XSGrammarPoolContainer	TokenNameIdentifier	 XS Grammar Pool Container
{	TokenNameLBRACE	
/** * Map containing the initial values of features for * validators created using this grammar pool container. */	TokenNameCOMMENT_JAVADOC	 Map containing the initial values of features for validators created using this grammar pool container. 
private	TokenNameprivate	
final	TokenNamefinal	
HashMap	TokenNameIdentifier	 Hash Map
fFeatures	TokenNameIdentifier	 f Features
;	TokenNameSEMICOLON	
public	TokenNamepublic	
AbstractXMLSchema	TokenNameIdentifier	 Abstract XML Schema
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fFeatures	TokenNameIdentifier	 f Features
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Schema methods */	TokenNameCOMMENT_BLOCK	 Schema methods 
/* * @see javax.xml.validation.Schema#newValidator() */	TokenNameCOMMENT_BLOCK	 @see javax.xml.validation.Schema#newValidator() 
public	TokenNamepublic	
final	TokenNamefinal	
Validator	TokenNameIdentifier	 Validator
newValidator	TokenNameIdentifier	 new Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ValidatorImpl	TokenNameIdentifier	 Validator Impl
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * @see javax.xml.validation.Schema#newValidatorHandler() */	TokenNameCOMMENT_BLOCK	 @see javax.xml.validation.Schema#newValidatorHandler() 
public	TokenNamepublic	
final	TokenNamefinal	
ValidatorHandler	TokenNameIdentifier	 Validator Handler
newValidatorHandler	TokenNameIdentifier	 new Validator Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ValidatorHandlerImpl	TokenNameIdentifier	 Validator Handler Impl
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * XSGrammarPoolContainer methods */	TokenNameCOMMENT_BLOCK	 XSGrammarPoolContainer methods 
/** * Returns the initial value of a feature for validators created * using this grammar pool container or null if the validators * should use the default value. */	TokenNameCOMMENT_JAVADOC	 Returns the initial value of a feature for validators created using this grammar pool container or null if the validators should use the default value. 
public	TokenNamepublic	
final	TokenNamefinal	
Boolean	TokenNameIdentifier	 Boolean
getFeature	TokenNameIdentifier	 get Feature
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
featureId	TokenNameIdentifier	 feature Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
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
}	TokenNameRBRACE	
/* * Other methods */	TokenNameCOMMENT_BLOCK	 Other methods 
final	TokenNamefinal	
void	TokenNamevoid	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
featureId	TokenNameIdentifier	 feature Id
,	TokenNameCOMMA	
boolean	TokenNameboolean	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
}	TokenNameRBRACE	
// AbstractXMLSchema 	TokenNameCOMMENT_LINE	AbstractXMLSchema 
