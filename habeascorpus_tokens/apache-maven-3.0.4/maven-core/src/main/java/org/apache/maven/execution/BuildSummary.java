package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
execution	TokenNameIdentifier	 execution
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
MavenProject	TokenNameIdentifier	 Maven Project
;	TokenNameSEMICOLON	
/** * Summarizes the result of a project build in the reactor. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Summarizes the result of a project build in the reactor. * @author Benjamin Bentmann 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
BuildSummary	TokenNameIdentifier	 Build Summary
{	TokenNameLBRACE	
/** * The project being summarized. */	TokenNameCOMMENT_JAVADOC	 The project being summarized. 
private	TokenNameprivate	
final	TokenNamefinal	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
/** * The build time of the project in milliseconds. */	TokenNameCOMMENT_JAVADOC	 The build time of the project in milliseconds. 
private	TokenNameprivate	
final	TokenNamefinal	
long	TokenNamelong	
time	TokenNameIdentifier	 time
;	TokenNameSEMICOLON	
/** * Creates a new build summary for the specified project. * * @param project The project being summarized, must not be {@code null}. * @param time The build time of the project in milliseconds. */	TokenNameCOMMENT_JAVADOC	 Creates a new build summary for the specified project. * @param project The project being summarized, must not be {@code null}. @param time The build time of the project in milliseconds. 
protected	TokenNameprotected	
BuildSummary	TokenNameIdentifier	 Build Summary
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
long	TokenNamelong	
time	TokenNameIdentifier	 time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"project missing"	TokenNameStringLiteral	project missing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
time	TokenNameIdentifier	 time
=	TokenNameEQUAL	
time	TokenNameIdentifier	 time
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the project being summarized. * * @return The project being summarized, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the project being summarized. * @return The project being summarized, never {@code null}. 
public	TokenNamepublic	
MavenProject	TokenNameIdentifier	 Maven Project
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the build time of the project in milliseconds. * * @return The build time of the project in milliseconds. */	TokenNameCOMMENT_JAVADOC	 Gets the build time of the project in milliseconds. * @return The build time of the project in milliseconds. 
public	TokenNamepublic	
long	TokenNamelong	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
time	TokenNameIdentifier	 time
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
