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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
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
/** * This listener is used to listen to {@link FieldConfig} requests in * {@link QueryConfigHandler} and add {@link ConfigurationKeys#NUMERIC_CONFIG} * based on the {@link ConfigurationKeys#NUMERIC_CONFIG_MAP} set in the * {@link QueryConfigHandler}. * * @see NumericConfig * @see QueryConfigHandler * @see ConfigurationKeys#NUMERIC_CONFIG * @see ConfigurationKeys#NUMERIC_CONFIG_MAP */	TokenNameCOMMENT_JAVADOC	 This listener is used to listen to {@link FieldConfig} requests in {@link QueryConfigHandler} and add {@link ConfigurationKeys#NUMERIC_CONFIG} based on the {@link ConfigurationKeys#NUMERIC_CONFIG_MAP} set in the {@link QueryConfigHandler}. * @see NumericConfig @see QueryConfigHandler @see ConfigurationKeys#NUMERIC_CONFIG @see ConfigurationKeys#NUMERIC_CONFIG_MAP 
public	TokenNamepublic	
class	TokenNameclass	
NumericFieldConfigListener	TokenNameIdentifier	 Numeric Field Config Listener
implements	TokenNameimplements	
FieldConfigListener	TokenNameIdentifier	 Field Config Listener
{	TokenNameLBRACE	
final	TokenNamefinal	
private	TokenNameprivate	
QueryConfigHandler	TokenNameIdentifier	 Query Config Handler
config	TokenNameIdentifier	 config
;	TokenNameSEMICOLON	
/** * Construcs a {@link NumericFieldConfigListener} object using the given {@link QueryConfigHandler}. * * @param config the {@link QueryConfigHandler} it will listen too */	TokenNameCOMMENT_JAVADOC	 Construcs a {@link NumericFieldConfigListener} object using the given {@link QueryConfigHandler}. * @param config the {@link QueryConfigHandler} it will listen too 
public	TokenNamepublic	
NumericFieldConfigListener	TokenNameIdentifier	 Numeric Field Config Listener
(	TokenNameLPAREN	
QueryConfigHandler	TokenNameIdentifier	 Query Config Handler
config	TokenNameIdentifier	 config
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
config	TokenNameIdentifier	 config
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"config cannot be null!"	TokenNameStringLiteral	config cannot be null!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
NumericConfig	TokenNameIdentifier	 Numeric Config
>	TokenNameGREATER	
numericConfigMap	TokenNameIdentifier	 numeric Config Map
=	TokenNameEQUAL	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ConfigurationKeys	TokenNameIdentifier	 Configuration Keys
.	TokenNameDOT	
NUMERIC_CONFIG_MAP	TokenNameIdentifier	 NUMERIC  CONFIG  MAP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numericConfigMap	TokenNameIdentifier	 numeric Config Map
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NumericConfig	TokenNameIdentifier	 Numeric Config
numericConfig	TokenNameIdentifier	 numeric Config
=	TokenNameEQUAL	
numericConfigMap	TokenNameIdentifier	 numeric Config Map
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
if	TokenNameif	
(	TokenNameLPAREN	
numericConfig	TokenNameIdentifier	 numeric Config
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fieldConfig	TokenNameIdentifier	 field Config
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
ConfigurationKeys	TokenNameIdentifier	 Configuration Keys
.	TokenNameDOT	
NUMERIC_CONFIG	TokenNameIdentifier	 NUMERIC  CONFIG
,	TokenNameCOMMA	
numericConfig	TokenNameIdentifier	 numeric Config
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
