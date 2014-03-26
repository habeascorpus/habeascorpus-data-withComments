package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
lifecycle	TokenNameIdentifier	 lifecycle
.	TokenNameDOT	
internal	TokenNameIdentifier	 internal
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * A task that is a goal * <p/> * TODO: From a concurrecy perspective, this class is not good. The combination of mutable/immutable state is not nice * * @since 3.0 * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 A task that is a goal <p/> TODO: From a concurrecy perspective, this class is not good. The combination of mutable/immutable state is not nice * @since 3.0 @author Benjamin Bentmann 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
GoalTask	TokenNameIdentifier	 Goal Task
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pluginGoal	TokenNameIdentifier	 plugin Goal
;	TokenNameSEMICOLON	
public	TokenNamepublic	
GoalTask	TokenNameIdentifier	 Goal Task
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pluginGoal	TokenNameIdentifier	 plugin Goal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
pluginGoal	TokenNameIdentifier	 plugin Goal
=	TokenNameEQUAL	
pluginGoal	TokenNameIdentifier	 plugin Goal
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pluginGoal	TokenNameIdentifier	 plugin Goal
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
