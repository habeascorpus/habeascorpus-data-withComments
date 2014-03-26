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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
DistributionManagement	TokenNameIdentifier	 Distribution Management
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
Scm	TokenNameIdentifier	 Scm
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
Site	TokenNameIdentifier	 Site
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
/** * Normalizes URLs to remove the ugly parent references "../" that got potentially inserted by URL adjustment during * model inheritance. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Normalizes URLs to remove the ugly parent references "../" that got potentially inserted by URL adjustment during model inheritance. * @author Benjamin Bentmann 
@	TokenNameAT	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
role	TokenNameIdentifier	 role
=	TokenNameEQUAL	
ModelUrlNormalizer	TokenNameIdentifier	 Model Url Normalizer
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
public	TokenNamepublic	
class	TokenNameclass	
DefaultModelUrlNormalizer	TokenNameIdentifier	 Default Model Url Normalizer
implements	TokenNameimplements	
ModelUrlNormalizer	TokenNameIdentifier	 Model Url Normalizer
{	TokenNameLBRACE	
@	TokenNameAT	
Requirement	TokenNameIdentifier	 Requirement
private	TokenNameprivate	
UrlNormalizer	TokenNameIdentifier	 Url Normalizer
urlNormalizer	TokenNameIdentifier	 url Normalizer
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DefaultModelUrlNormalizer	TokenNameIdentifier	 Default Model Url Normalizer
setUrlNormalizer	TokenNameIdentifier	 set Url Normalizer
(	TokenNameLPAREN	
UrlNormalizer	TokenNameIdentifier	 Url Normalizer
urlNormalizer	TokenNameIdentifier	 url Normalizer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
urlNormalizer	TokenNameIdentifier	 url Normalizer
=	TokenNameEQUAL	
urlNormalizer	TokenNameIdentifier	 url Normalizer
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
Model	TokenNameIdentifier	 Model
model	TokenNameIdentifier	 model
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
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
setUrl	TokenNameIdentifier	 set Url
(	TokenNameLPAREN	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
getUrl	TokenNameIdentifier	 get Url
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Scm	TokenNameIdentifier	 Scm
scm	TokenNameIdentifier	 scm
=	TokenNameEQUAL	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
getScm	TokenNameIdentifier	 get Scm
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
scm	TokenNameIdentifier	 scm
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scm	TokenNameIdentifier	 scm
.	TokenNameDOT	
setUrl	TokenNameIdentifier	 set Url
(	TokenNameLPAREN	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
scm	TokenNameIdentifier	 scm
.	TokenNameDOT	
getUrl	TokenNameIdentifier	 get Url
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scm	TokenNameIdentifier	 scm
.	TokenNameDOT	
setConnection	TokenNameIdentifier	 set Connection
(	TokenNameLPAREN	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
scm	TokenNameIdentifier	 scm
.	TokenNameDOT	
getConnection	TokenNameIdentifier	 get Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scm	TokenNameIdentifier	 scm
.	TokenNameDOT	
setDeveloperConnection	TokenNameIdentifier	 set Developer Connection
(	TokenNameLPAREN	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
scm	TokenNameIdentifier	 scm
.	TokenNameDOT	
getDeveloperConnection	TokenNameIdentifier	 get Developer Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
DistributionManagement	TokenNameIdentifier	 Distribution Management
dist	TokenNameIdentifier	 dist
=	TokenNameEQUAL	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
getDistributionManagement	TokenNameIdentifier	 get Distribution Management
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dist	TokenNameIdentifier	 dist
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Site	TokenNameIdentifier	 Site
site	TokenNameIdentifier	 site
=	TokenNameEQUAL	
dist	TokenNameIdentifier	 dist
.	TokenNameDOT	
getSite	TokenNameIdentifier	 get Site
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
site	TokenNameIdentifier	 site
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
site	TokenNameIdentifier	 site
.	TokenNameDOT	
setUrl	TokenNameIdentifier	 set Url
(	TokenNameLPAREN	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
site	TokenNameIdentifier	 site
.	TokenNameDOT	
getUrl	TokenNameIdentifier	 get Url
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
urlNormalizer	TokenNameIdentifier	 url Normalizer
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
