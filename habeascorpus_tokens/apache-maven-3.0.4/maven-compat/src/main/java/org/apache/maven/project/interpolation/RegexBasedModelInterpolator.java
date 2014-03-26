package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
interpolation	TokenNameIdentifier	 interpolation
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
PathTranslator	TokenNameIdentifier	 Path Translator
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
Interpolator	TokenNameIdentifier	 Interpolator
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
RegexBasedInterpolator	TokenNameIdentifier	 Regex Based Interpolator
;	TokenNameSEMICOLON	
/** * Use a regular expression search to find and resolve expressions within the POM. * * @author jdcasey Created on Feb 3, 2005 * @todo Consolidate this logic with the PluginParameterExpressionEvaluator, minus deprecations/bans. */	TokenNameCOMMENT_JAVADOC	 Use a regular expression search to find and resolve expressions within the POM. * @author jdcasey Created on Feb 3, 2005 @todo Consolidate this logic with the PluginParameterExpressionEvaluator, minus deprecations/bans. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
RegexBasedModelInterpolator	TokenNameIdentifier	 Regex Based Model Interpolator
extends	TokenNameextends	
AbstractStringBasedModelInterpolator	TokenNameIdentifier	 Abstract String Based Model Interpolator
{	TokenNameLBRACE	
public	TokenNamepublic	
RegexBasedModelInterpolator	TokenNameIdentifier	 Regex Based Model Interpolator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
RegexBasedModelInterpolator	TokenNameIdentifier	 Regex Based Model Interpolator
(	TokenNameLPAREN	
PathTranslator	TokenNameIdentifier	 Path Translator
pathTranslator	TokenNameIdentifier	 path Translator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
pathTranslator	TokenNameIdentifier	 path Translator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
RegexBasedModelInterpolator	TokenNameIdentifier	 Regex Based Model Interpolator
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
envars	TokenNameIdentifier	 envars
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
Interpolator	TokenNameIdentifier	 Interpolator
createInterpolator	TokenNameIdentifier	 create Interpolator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
RegexBasedInterpolator	TokenNameIdentifier	 Regex Based Interpolator
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
