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
/** * An extension point build files can provide as a place where other * build files can add new dependencies. * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 An extension point build files can provide as a place where other build files can add new dependencies. * @since Ant 1.8.0 
public	TokenNamepublic	
class	TokenNameclass	
ExtensionPoint	TokenNameIdentifier	 Extension Point
extends	TokenNameextends	
Target	TokenNameIdentifier	 Target
{	TokenNameLBRACE	
// no "clone" constructor since I'm not really sure where it is 	TokenNameCOMMENT_LINE	no "clone" constructor since I'm not really sure where it is 
// used 	TokenNameCOMMENT_LINE	used 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NO_CHILDREN_ALLOWED	TokenNameIdentifier	 NO  CHILDREN  ALLOWED
=	TokenNameEQUAL	
"you must not nest child elements into an extension-point"	TokenNameStringLiteral	you must not nest child elements into an extension-point
;	TokenNameSEMICOLON	
/** * Throws an exception. */	TokenNameCOMMENT_JAVADOC	 Throws an exception. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
addTask	TokenNameIdentifier	 add Task
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
NO_CHILDREN_ALLOWED	TokenNameIdentifier	 NO  CHILDREN  ALLOWED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Throws an exception. */	TokenNameCOMMENT_JAVADOC	 Throws an exception. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
addDataType	TokenNameIdentifier	 add Data Type
(	TokenNameLPAREN	
RuntimeConfigurable	TokenNameIdentifier	 Runtime Configurable
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
NO_CHILDREN_ALLOWED	TokenNameIdentifier	 NO  CHILDREN  ALLOWED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
