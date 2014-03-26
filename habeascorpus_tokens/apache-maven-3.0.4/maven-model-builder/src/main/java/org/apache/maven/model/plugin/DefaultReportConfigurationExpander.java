package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Model	TokenNameIdentifier	 Model
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
ReportPlugin	TokenNameIdentifier	 Report Plugin
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
ReportSet	TokenNameIdentifier	 Report Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Reporting	TokenNameIdentifier	 Reporting
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
building	TokenNameIdentifier	 building
.	TokenNameDOT	
ModelBuildingRequest	TokenNameIdentifier	 Model Building Request
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
building	TokenNameIdentifier	 building
.	TokenNameDOT	
ModelProblemCollector	TokenNameIdentifier	 Model Problem Collector
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
component	TokenNameIdentifier	 component
.	TokenNameDOT	
annotations	TokenNameIdentifier	 annotations
.	TokenNameDOT	
Component	TokenNameIdentifier	 Component
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
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
;	TokenNameSEMICOLON	
/** * Handles expansion of general report plugin configuration into individual report sets. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Handles expansion of general report plugin configuration into individual report sets. * @author Benjamin Bentmann 
@	TokenNameAT	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
role	TokenNameIdentifier	 role
=	TokenNameEQUAL	
ReportConfigurationExpander	TokenNameIdentifier	 Report Configuration Expander
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
public	TokenNamepublic	
class	TokenNameclass	
DefaultReportConfigurationExpander	TokenNameIdentifier	 Default Report Configuration Expander
implements	TokenNameimplements	
ReportConfigurationExpander	TokenNameIdentifier	 Report Configuration Expander
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
expandPluginConfiguration	TokenNameIdentifier	 expand Plugin Configuration
(	TokenNameLPAREN	
Model	TokenNameIdentifier	 Model
model	TokenNameIdentifier	 model
,	TokenNameCOMMA	
ModelBuildingRequest	TokenNameIdentifier	 Model Building Request
request	TokenNameIdentifier	 request
,	TokenNameCOMMA	
ModelProblemCollector	TokenNameIdentifier	 Model Problem Collector
problems	TokenNameIdentifier	 problems
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Reporting	TokenNameIdentifier	 Reporting
reporting	TokenNameIdentifier	 reporting
=	TokenNameEQUAL	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
getReporting	TokenNameIdentifier	 get Reporting
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
reporting	TokenNameIdentifier	 reporting
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
ReportPlugin	TokenNameIdentifier	 Report Plugin
reportPlugin	TokenNameIdentifier	 report Plugin
:	TokenNameCOLON	
reporting	TokenNameIdentifier	 reporting
.	TokenNameDOT	
getPlugins	TokenNameIdentifier	 get Plugins
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
parentDom	TokenNameIdentifier	 parent Dom
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
)	TokenNameRPAREN	
reportPlugin	TokenNameIdentifier	 report Plugin
.	TokenNameDOT	
getConfiguration	TokenNameIdentifier	 get Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parentDom	TokenNameIdentifier	 parent Dom
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
ReportSet	TokenNameIdentifier	 Report Set
execution	TokenNameIdentifier	 execution
:	TokenNameCOLON	
reportPlugin	TokenNameIdentifier	 report Plugin
.	TokenNameDOT	
getReportSets	TokenNameIdentifier	 get Report Sets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
childDom	TokenNameIdentifier	 child Dom
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
)	TokenNameRPAREN	
execution	TokenNameIdentifier	 execution
.	TokenNameDOT	
getConfiguration	TokenNameIdentifier	 get Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
childDom	TokenNameIdentifier	 child Dom
=	TokenNameEQUAL	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
.	TokenNameDOT	
mergeXpp3Dom	TokenNameIdentifier	 merge Xpp3 Dom
(	TokenNameLPAREN	
childDom	TokenNameIdentifier	 child Dom
,	TokenNameCOMMA	
new	TokenNamenew	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
(	TokenNameLPAREN	
parentDom	TokenNameIdentifier	 parent Dom
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
execution	TokenNameIdentifier	 execution
.	TokenNameDOT	
setConfiguration	TokenNameIdentifier	 set Configuration
(	TokenNameLPAREN	
childDom	TokenNameIdentifier	 child Dom
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
