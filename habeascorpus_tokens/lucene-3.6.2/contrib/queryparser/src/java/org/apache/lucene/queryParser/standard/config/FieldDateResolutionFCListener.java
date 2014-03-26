package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
standard	TokenNameIdentifier	 standard
.	TokenNameDOT	
config	TokenNameIdentifier	 config
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
DateTools	TokenNameIdentifier	 Date Tools
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
core	TokenNameIdentifier	 core
.	TokenNameDOT	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
FieldConfig	TokenNameIdentifier	 Field Config
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
core	TokenNameIdentifier	 core
.	TokenNameDOT	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
FieldConfigListener	TokenNameIdentifier	 Field Config Listener
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
core	TokenNameIdentifier	 core
.	TokenNameDOT	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
QueryConfigHandler	TokenNameIdentifier	 Query Config Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
standard	TokenNameIdentifier	 standard
.	TokenNameDOT	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
StandardQueryConfigHandler	TokenNameIdentifier	 Standard Query Config Handler
.	TokenNameDOT	
ConfigurationKeys	TokenNameIdentifier	 Configuration Keys
;	TokenNameSEMICOLON	
/** * This listener listens for every field configuration request and assign a * {@link DateResolutionAttribute} to the equivalent {@link FieldConfig} based * on a defined map: fieldName -> DateTools.Resolution stored in * {@link FieldDateResolutionMapAttribute} in the * {@link DateResolutionAttribute}. * * @see DateResolutionAttribute * @see FieldDateResolutionMapAttribute * @see FieldConfig * @see FieldConfigListener */	TokenNameCOMMENT_JAVADOC	 This listener listens for every field configuration request and assign a {@link DateResolutionAttribute} to the equivalent {@link FieldConfig} based on a defined map: fieldName -> DateTools.Resolution stored in {@link FieldDateResolutionMapAttribute} in the {@link DateResolutionAttribute}. * @see DateResolutionAttribute @see FieldDateResolutionMapAttribute @see FieldConfig @see FieldConfigListener 
public	TokenNamepublic	
class	TokenNameclass	
FieldDateResolutionFCListener	TokenNameIdentifier	 Field Date Resolution FC Listener
implements	TokenNameimplements	
FieldConfigListener	TokenNameIdentifier	 Field Config Listener
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
5929802948798314067L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
QueryConfigHandler	TokenNameIdentifier	 Query Config Handler
config	TokenNameIdentifier	 config
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
FieldDateResolutionFCListener	TokenNameIdentifier	 Field Date Resolution FC Listener
(	TokenNameLPAREN	
QueryConfigHandler	TokenNameIdentifier	 Query Config Handler
config	TokenNameIdentifier	 config
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
config	TokenNameIdentifier	 config
=	TokenNameEQUAL	
config	TokenNameIdentifier	 config
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
buildFieldConfig	TokenNameIdentifier	 build Field Config
(	TokenNameLPAREN	
FieldConfig	TokenNameIdentifier	 Field Config
fieldConfig	TokenNameIdentifier	 field Config
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
Resolution	TokenNameIdentifier	 Resolution
dateRes	TokenNameIdentifier	 date Res
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
has	TokenNameIdentifier	 has
(	TokenNameLPAREN	
ConfigurationKeys	TokenNameIdentifier	 Configuration Keys
.	TokenNameDOT	
FIELD_DATE_RESOLUTION_MAP	TokenNameIdentifier	 FIELD  DATE  RESOLUTION  MAP
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dateRes	TokenNameIdentifier	 date Res
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ConfigurationKeys	TokenNameIdentifier	 Configuration Keys
.	TokenNameDOT	
FIELD_DATE_RESOLUTION_MAP	TokenNameIdentifier	 FIELD  DATE  RESOLUTION  MAP
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
fieldConfig	TokenNameIdentifier	 field Config
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dateRes	TokenNameIdentifier	 date Res
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dateRes	TokenNameIdentifier	 date Res
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ConfigurationKeys	TokenNameIdentifier	 Configuration Keys
.	TokenNameDOT	
DATE_RESOLUTION	TokenNameIdentifier	 DATE  RESOLUTION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fieldConfig	TokenNameIdentifier	 field Config
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
DateResolutionAttribute	TokenNameIdentifier	 Date Resolution Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
.	TokenNameDOT	
setDateResolution	TokenNameIdentifier	 set Date Resolution
(	TokenNameLPAREN	
dateRes	TokenNameIdentifier	 date Res
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// uncomment code below when deprecated query parser attributes are removed 	TokenNameCOMMENT_LINE	uncomment code below when deprecated query parser attributes are removed 
// fieldConfig.set(ConfigurationKeys.DATE_RESOLUTION, dateRes); 	TokenNameCOMMENT_LINE	fieldConfig.set(ConfigurationKeys.DATE_RESOLUTION, dateRes); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
