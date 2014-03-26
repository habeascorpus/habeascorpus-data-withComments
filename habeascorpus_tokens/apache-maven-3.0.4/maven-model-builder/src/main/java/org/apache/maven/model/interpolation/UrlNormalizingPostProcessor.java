package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
interpolation	TokenNameIdentifier	 interpolation
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
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
path	TokenNameIdentifier	 path
.	TokenNameDOT	
UrlNormalizer	TokenNameIdentifier	 Url Normalizer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
interpolation	TokenNameIdentifier	 interpolation
.	TokenNameDOT	
InterpolationPostProcessor	TokenNameIdentifier	 Interpolation Post Processor
;	TokenNameSEMICOLON	
/** * Ensures that expressions referring to URLs evaluate to normalized URLs. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Ensures that expressions referring to URLs evaluate to normalized URLs. * @author Benjamin Bentmann 
class	TokenNameclass	
UrlNormalizingPostProcessor	TokenNameIdentifier	 Url Normalizing Post Processor
implements	TokenNameimplements	
InterpolationPostProcessor	TokenNameIdentifier	 Interpolation Post Processor
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
URL_EXPRESSIONS	TokenNameIdentifier	 URL  EXPRESSIONS
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
expressions	TokenNameIdentifier	 expressions
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expressions	TokenNameIdentifier	 expressions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"project.url"	TokenNameStringLiteral	project.url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expressions	TokenNameIdentifier	 expressions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"project.scm.url"	TokenNameStringLiteral	project.scm.url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expressions	TokenNameIdentifier	 expressions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"project.scm.connection"	TokenNameStringLiteral	project.scm.connection
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expressions	TokenNameIdentifier	 expressions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"project.scm.developerConnection"	TokenNameStringLiteral	project.scm.developerConnection
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expressions	TokenNameIdentifier	 expressions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"project.distributionManagement.site.url"	TokenNameStringLiteral	project.distributionManagement.site.url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
URL_EXPRESSIONS	TokenNameIdentifier	 URL  EXPRESSIONS
=	TokenNameEQUAL	
expressions	TokenNameIdentifier	 expressions
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
UrlNormalizer	TokenNameIdentifier	 Url Normalizer
normalizer	TokenNameIdentifier	 normalizer
;	TokenNameSEMICOLON	
public	TokenNamepublic	
UrlNormalizingPostProcessor	TokenNameIdentifier	 Url Normalizing Post Processor
(	TokenNameLPAREN	
UrlNormalizer	TokenNameIdentifier	 Url Normalizer
normalizer	TokenNameIdentifier	 normalizer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
normalizer	TokenNameIdentifier	 normalizer
=	TokenNameEQUAL	
normalizer	TokenNameIdentifier	 normalizer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
expression	TokenNameIdentifier	 expression
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
URL_EXPRESSIONS	TokenNameIdentifier	 URL  EXPRESSIONS
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
expression	TokenNameIdentifier	 expression
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
normalizer	TokenNameIdentifier	 normalizer
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
