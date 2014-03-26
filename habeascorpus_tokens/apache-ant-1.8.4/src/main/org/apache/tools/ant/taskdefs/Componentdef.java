/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
taskdefs	TokenNameIdentifier	 taskdefs
;	TokenNameSEMICOLON	
/** * Adds a compenent definition to the current project. * used in the current project. Two attributes are needed, the name that identifies * this compenent uniquely, and the full name of the class ( * including the packages) that * implements this component.</p> * @since Ant 1.8 * @ant.task category="internal" */	TokenNameCOMMENT_JAVADOC	 Adds a compenent definition to the current project. used in the current project. Two attributes are needed, the name that identifies this compenent uniquely, and the full name of the class ( including the packages) that implements this component.</p> @since Ant 1.8 @ant.task category="internal" 
public	TokenNamepublic	
class	TokenNameclass	
Componentdef	TokenNameIdentifier	 Componentdef
extends	TokenNameextends	
Definer	TokenNameIdentifier	 Definer
{	TokenNameLBRACE	
/** * Default constructor. * Creates a new ComponentDef instance. * Sets the restrict attribute to true. */	TokenNameCOMMENT_JAVADOC	 Default constructor. Creates a new ComponentDef instance. Sets the restrict attribute to true. 
public	TokenNamepublic	
Componentdef	TokenNameIdentifier	 Componentdef
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setRestrict	TokenNameIdentifier	 set Restrict
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
