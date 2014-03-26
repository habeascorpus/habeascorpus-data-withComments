package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
Build	TokenNameIdentifier	 Build
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
Resource	TokenNameIdentifier	 Resource
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
component	TokenNameIdentifier	 component
.	TokenNameDOT	
annotations	TokenNameIdentifier	 annotations
.	TokenNameDOT	
Requirement	TokenNameIdentifier	 Requirement
;	TokenNameSEMICOLON	
/** * Resolves relative paths within a model against a specific base directory. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Resolves relative paths within a model against a specific base directory. * @author Benjamin Bentmann 
@	TokenNameAT	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
role	TokenNameIdentifier	 role
=	TokenNameEQUAL	
ModelPathTranslator	TokenNameIdentifier	 Model Path Translator
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
public	TokenNamepublic	
class	TokenNameclass	
DefaultModelPathTranslator	TokenNameIdentifier	 Default Model Path Translator
implements	TokenNameimplements	
ModelPathTranslator	TokenNameIdentifier	 Model Path Translator
{	TokenNameLBRACE	
@	TokenNameAT	
Requirement	TokenNameIdentifier	 Requirement
private	TokenNameprivate	
PathTranslator	TokenNameIdentifier	 Path Translator
pathTranslator	TokenNameIdentifier	 path Translator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DefaultModelPathTranslator	TokenNameIdentifier	 Default Model Path Translator
setPathTranslator	TokenNameIdentifier	 set Path Translator
(	TokenNameLPAREN	
PathTranslator	TokenNameIdentifier	 Path Translator
pathTranslator	TokenNameIdentifier	 path Translator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
pathTranslator	TokenNameIdentifier	 path Translator
=	TokenNameEQUAL	
pathTranslator	TokenNameIdentifier	 path Translator
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
alignToBaseDirectory	TokenNameIdentifier	 align To Base Directory
(	TokenNameLPAREN	
Model	TokenNameIdentifier	 Model
model	TokenNameIdentifier	 model
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
basedir	TokenNameIdentifier	 basedir
,	TokenNameCOMMA	
ModelBuildingRequest	TokenNameIdentifier	 Model Building Request
request	TokenNameIdentifier	 request
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
model	TokenNameIdentifier	 model
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
basedir	TokenNameIdentifier	 basedir
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Build	TokenNameIdentifier	 Build
build	TokenNameIdentifier	 build
=	TokenNameEQUAL	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
getBuild	TokenNameIdentifier	 get Build
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
build	TokenNameIdentifier	 build
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
setDirectory	TokenNameIdentifier	 set Directory
(	TokenNameLPAREN	
alignToBaseDirectory	TokenNameIdentifier	 align To Base Directory
(	TokenNameLPAREN	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
basedir	TokenNameIdentifier	 basedir
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
setSourceDirectory	TokenNameIdentifier	 set Source Directory
(	TokenNameLPAREN	
alignToBaseDirectory	TokenNameIdentifier	 align To Base Directory
(	TokenNameLPAREN	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
getSourceDirectory	TokenNameIdentifier	 get Source Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
basedir	TokenNameIdentifier	 basedir
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
setTestSourceDirectory	TokenNameIdentifier	 set Test Source Directory
(	TokenNameLPAREN	
alignToBaseDirectory	TokenNameIdentifier	 align To Base Directory
(	TokenNameLPAREN	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
getTestSourceDirectory	TokenNameIdentifier	 get Test Source Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
basedir	TokenNameIdentifier	 basedir
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
setScriptSourceDirectory	TokenNameIdentifier	 set Script Source Directory
(	TokenNameLPAREN	
alignToBaseDirectory	TokenNameIdentifier	 align To Base Directory
(	TokenNameLPAREN	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
getScriptSourceDirectory	TokenNameIdentifier	 get Script Source Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
basedir	TokenNameIdentifier	 basedir
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
resource	TokenNameIdentifier	 resource
:	TokenNameCOLON	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
getResources	TokenNameIdentifier	 get Resources
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resource	TokenNameIdentifier	 resource
.	TokenNameDOT	
setDirectory	TokenNameIdentifier	 set Directory
(	TokenNameLPAREN	
alignToBaseDirectory	TokenNameIdentifier	 align To Base Directory
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
.	TokenNameDOT	
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
basedir	TokenNameIdentifier	 basedir
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
resource	TokenNameIdentifier	 resource
:	TokenNameCOLON	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
getTestResources	TokenNameIdentifier	 get Test Resources
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resource	TokenNameIdentifier	 resource
.	TokenNameDOT	
setDirectory	TokenNameIdentifier	 set Directory
(	TokenNameLPAREN	
alignToBaseDirectory	TokenNameIdentifier	 align To Base Directory
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
.	TokenNameDOT	
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
basedir	TokenNameIdentifier	 basedir
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
getFilters	TokenNameIdentifier	 get Filters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
filters	TokenNameIdentifier	 filters
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
getFilters	TokenNameIdentifier	 get Filters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
filter	TokenNameIdentifier	 filter
:	TokenNameCOLON	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
getFilters	TokenNameIdentifier	 get Filters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filters	TokenNameIdentifier	 filters
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
alignToBaseDirectory	TokenNameIdentifier	 align To Base Directory
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
basedir	TokenNameIdentifier	 basedir
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
setFilters	TokenNameIdentifier	 set Filters
(	TokenNameLPAREN	
filters	TokenNameIdentifier	 filters
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
setOutputDirectory	TokenNameIdentifier	 set Output Directory
(	TokenNameLPAREN	
alignToBaseDirectory	TokenNameIdentifier	 align To Base Directory
(	TokenNameLPAREN	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
getOutputDirectory	TokenNameIdentifier	 get Output Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
basedir	TokenNameIdentifier	 basedir
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
setTestOutputDirectory	TokenNameIdentifier	 set Test Output Directory
(	TokenNameLPAREN	
alignToBaseDirectory	TokenNameIdentifier	 align To Base Directory
(	TokenNameLPAREN	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
getTestOutputDirectory	TokenNameIdentifier	 get Test Output Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
basedir	TokenNameIdentifier	 basedir
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
reporting	TokenNameIdentifier	 reporting
.	TokenNameDOT	
setOutputDirectory	TokenNameIdentifier	 set Output Directory
(	TokenNameLPAREN	
alignToBaseDirectory	TokenNameIdentifier	 align To Base Directory
(	TokenNameLPAREN	
reporting	TokenNameIdentifier	 reporting
.	TokenNameDOT	
getOutputDirectory	TokenNameIdentifier	 get Output Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
basedir	TokenNameIdentifier	 basedir
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
alignToBaseDirectory	TokenNameIdentifier	 align To Base Directory
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
basedir	TokenNameIdentifier	 basedir
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pathTranslator	TokenNameIdentifier	 path Translator
.	TokenNameDOT	
alignToBaseDirectory	TokenNameIdentifier	 align To Base Directory
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
basedir	TokenNameIdentifier	 basedir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
