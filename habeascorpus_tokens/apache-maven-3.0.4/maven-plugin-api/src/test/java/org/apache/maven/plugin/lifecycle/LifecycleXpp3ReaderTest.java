package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
lifecycle	TokenNameIdentifier	 lifecycle
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
pull	TokenNameIdentifier	 pull
.	TokenNameDOT	
XmlPullParserException	TokenNameIdentifier	 Xml Pull Parser Exception
;	TokenNameSEMICOLON	
/** * Test the lifecycle reader. * * @author <a href="mailto:brett@apache.org">Brett Porter</a> */	TokenNameCOMMENT_JAVADOC	 Test the lifecycle reader. * @author <a href="mailto:brett@apache.org">Brett Porter</a> 
public	TokenNamepublic	
class	TokenNameclass	
LifecycleXpp3ReaderTest	TokenNameIdentifier	 Lifecycle Xpp3 Reader Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testLifecycleReader	TokenNameIdentifier	 test Lifecycle Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XmlPullParserException	TokenNameIdentifier	 Xml Pull Parser Exception
{	TokenNameLBRACE	
/* LifecycleMappingsXpp3Reader reader = new LifecycleMappingsXpp3Reader(); LifecycleConfiguration config = reader.read( new InputStreamReader( getClass().getResourceAsStream( "/lifecycle.xml" ) ) ); assertEquals( "check number of lifecycles", 1, config.getLifecycles().size() ); Lifecycle l = (Lifecycle) config.getLifecycles().iterator().next(); assertEquals( "check id", "clover", l.getId() ); assertEquals( "check number of phases", 1, l.getPhases().size() ); Phase p = (Phase) l.getPhases().iterator().next(); assertEquals( "check id", "generate-sources", p.getId() ); assertEquals( "check number of executions", 1, p.getExecutions().size() ); Execution e = (Execution) p.getExecutions().iterator().next(); assertEquals( "check configuration", "true", ((Xpp3Dom) e.getConfiguration()).getChild( "debug" ).getValue() ); assertEquals( "check number of goals", 1, e.getGoals().size() ); String g = (String) e.getGoals().iterator().next(); assertEquals( "check goal", "clover:compiler", g ); */	TokenNameCOMMENT_BLOCK	 LifecycleMappingsXpp3Reader reader = new LifecycleMappingsXpp3Reader(); LifecycleConfiguration config = reader.read( new InputStreamReader( getClass().getResourceAsStream( "/lifecycle.xml" ) ) ); assertEquals( "check number of lifecycles", 1, config.getLifecycles().size() ); Lifecycle l = (Lifecycle) config.getLifecycles().iterator().next(); assertEquals( "check id", "clover", l.getId() ); assertEquals( "check number of phases", 1, l.getPhases().size() ); Phase p = (Phase) l.getPhases().iterator().next(); assertEquals( "check id", "generate-sources", p.getId() ); assertEquals( "check number of executions", 1, p.getExecutions().size() ); Execution e = (Execution) p.getExecutions().iterator().next(); assertEquals( "check configuration", "true", ((Xpp3Dom) e.getConfiguration()).getChild( "debug" ).getValue() ); assertEquals( "check number of goals", 1, e.getGoals().size() ); String g = (String) e.getGoals().iterator().next(); assertEquals( "check goal", "clover:compiler", g ); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
