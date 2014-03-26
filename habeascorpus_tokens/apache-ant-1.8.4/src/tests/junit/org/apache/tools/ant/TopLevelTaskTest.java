/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
;	TokenNameSEMICOLON	
// This test will fail with embed, or if top-level is moved out of 	TokenNameCOMMENT_LINE	This test will fail with embed, or if top-level is moved out of 
// dependency - as 'echo' happens as part of configureProject stage. 	TokenNameCOMMENT_LINE	dependency - as 'echo' happens as part of configureProject stage. 
/** * Tests for builds with tasks at the top level * * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Tests for builds with tasks at the top level * @since Ant 1.6 
public	TokenNamepublic	
class	TokenNameclass	
TopLevelTaskTest	TokenNameIdentifier	 Top Level Task Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
public	TokenNamepublic	
TopLevelTaskTest	TokenNameIdentifier	 Top Level Task Test
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoTarget	TokenNameIdentifier	 test No Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/core/topleveltasks/notarget.xml"	TokenNameStringLiteral	src/etc/testcases/core/topleveltasks/notarget.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectLog	TokenNameIdentifier	 expect Log
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"Called"	TokenNameStringLiteral	Called
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCalledFromTopLevelAnt	TokenNameIdentifier	 test Called From Top Level Ant
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/core/topleveltasks/toplevelant.xml"	TokenNameStringLiteral	src/etc/testcases/core/topleveltasks/toplevelant.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectLog	TokenNameIdentifier	 expect Log
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"Called"	TokenNameStringLiteral	Called
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCalledFromTargetLevelAnt	TokenNameIdentifier	 test Called From Target Level Ant
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/core/topleveltasks/targetlevelant.xml"	TokenNameStringLiteral	src/etc/testcases/core/topleveltasks/targetlevelant.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectLog	TokenNameIdentifier	 expect Log
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
"Called"	TokenNameStringLiteral	Called
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
