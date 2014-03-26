/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
/** * Tests for LogLog. * * @author Curt Arnold **/	TokenNameCOMMENT_JAVADOC	 Tests for LogLog. * @author Curt Arnold *
public	TokenNamepublic	
class	TokenNameclass	
LogLogTest	TokenNameIdentifier	 Log Log Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
/** * Create new instance of LogLogTest. * @param testName test name */	TokenNameCOMMENT_JAVADOC	 Create new instance of LogLogTest. @param testName test name 
public	TokenNamepublic	
LogLogTest	TokenNameIdentifier	 Log Log Test
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
/** * Check value of DEBUG_KEY. */	TokenNameCOMMENT_JAVADOC	 Check value of DEBUG_KEY. 
public	TokenNamepublic	
void	TokenNamevoid	
testDebugKey	TokenNameIdentifier	 test Debug Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"log4j.debug"	TokenNameStringLiteral	log4j.debug
,	TokenNameCOMMA	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
DEBUG_KEY	TokenNameIdentifier	 DEBUG  KEY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check value of CONFIG_DEBUG_KEY. * @deprecated since constant is deprecated */	TokenNameCOMMENT_JAVADOC	 Check value of CONFIG_DEBUG_KEY. @deprecated since constant is deprecated 
public	TokenNamepublic	
void	TokenNamevoid	
testConfigDebugKey	TokenNameIdentifier	 test Config Debug Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"log4j.configDebug"	TokenNameStringLiteral	log4j.configDebug
,	TokenNameCOMMA	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
CONFIG_DEBUG_KEY	TokenNameIdentifier	 CONFIG  DEBUG  KEY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
