/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
/** * Tests for LogManager * * @author Curt Arnold **/	TokenNameCOMMENT_JAVADOC	 Tests for LogManager * @author Curt Arnold *
public	TokenNamepublic	
class	TokenNameclass	
LogManagerTest	TokenNameIdentifier	 Log Manager Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
/** * Create new instance of LogManagerTest. * @param testName test name */	TokenNameCOMMENT_JAVADOC	 Create new instance of LogManagerTest. @param testName test name 
public	TokenNamepublic	
LogManagerTest	TokenNameIdentifier	 Log Manager Test
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
testName	TokenNameIdentifier	 test Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
testName	TokenNameIdentifier	 test Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check value of DEFAULT_CONFIGURATION_FILE. * @deprecated since constant is deprecated */	TokenNameCOMMENT_JAVADOC	 Check value of DEFAULT_CONFIGURATION_FILE. @deprecated since constant is deprecated 
public	TokenNamepublic	
void	TokenNamevoid	
testDefaultConfigurationFile	TokenNameIdentifier	 test Default Configuration File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"log4j.properties"	TokenNameStringLiteral	log4j.properties
,	TokenNameCOMMA	
LogManager	TokenNameIdentifier	 Log Manager
.	TokenNameDOT	
DEFAULT_CONFIGURATION_FILE	TokenNameIdentifier	 DEFAULT  CONFIGURATION  FILE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check value of DEFAULT_XML_CONFIGURATION_FILE. */	TokenNameCOMMENT_JAVADOC	 Check value of DEFAULT_XML_CONFIGURATION_FILE. 
public	TokenNamepublic	
void	TokenNamevoid	
testDefaultXmlConfigurationFile	TokenNameIdentifier	 test Default Xml Configuration File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"log4j.xml"	TokenNameStringLiteral	log4j.xml
,	TokenNameCOMMA	
LogManager	TokenNameIdentifier	 Log Manager
.	TokenNameDOT	
DEFAULT_XML_CONFIGURATION_FILE	TokenNameIdentifier	 DEFAULT  XML  CONFIGURATION  FILE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check value of DEFAULT_CONFIGURATION_KEY. * @deprecated since constant is deprecated */	TokenNameCOMMENT_JAVADOC	 Check value of DEFAULT_CONFIGURATION_KEY. @deprecated since constant is deprecated 
public	TokenNamepublic	
void	TokenNamevoid	
testDefaultConfigurationKey	TokenNameIdentifier	 test Default Configuration Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"log4j.configuration"	TokenNameStringLiteral	log4j.configuration
,	TokenNameCOMMA	
LogManager	TokenNameIdentifier	 Log Manager
.	TokenNameDOT	
DEFAULT_CONFIGURATION_KEY	TokenNameIdentifier	 DEFAULT  CONFIGURATION  KEY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check value of CONFIGURATOR_CLASS_KEY. * @deprecated since constant is deprecated */	TokenNameCOMMENT_JAVADOC	 Check value of CONFIGURATOR_CLASS_KEY. @deprecated since constant is deprecated 
public	TokenNamepublic	
void	TokenNamevoid	
testConfiguratorClassKey	TokenNameIdentifier	 test Configurator Class Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"log4j.configuratorClass"	TokenNameStringLiteral	log4j.configuratorClass
,	TokenNameCOMMA	
LogManager	TokenNameIdentifier	 Log Manager
.	TokenNameDOT	
CONFIGURATOR_CLASS_KEY	TokenNameIdentifier	 CONFIGURATOR  CLASS  KEY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check value of DEFAULT_INIT_OVERRIDE_KEY. * @deprecated since constant is deprecated */	TokenNameCOMMENT_JAVADOC	 Check value of DEFAULT_INIT_OVERRIDE_KEY. @deprecated since constant is deprecated 
public	TokenNamepublic	
void	TokenNamevoid	
testDefaultInitOverrideKey	TokenNameIdentifier	 test Default Init Override Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"log4j.defaultInitOverride"	TokenNameStringLiteral	log4j.defaultInitOverride
,	TokenNameCOMMA	
LogManager	TokenNameIdentifier	 Log Manager
.	TokenNameDOT	
DEFAULT_INIT_OVERRIDE_KEY	TokenNameIdentifier	 DEFAULT  INIT  OVERRIDE  KEY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
