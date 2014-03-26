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
InterpolationPostProcessor	TokenNameIdentifier	 Interpolation Post Processor
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ValueSourceUtils	TokenNameIdentifier	 Value Source Utils
;	TokenNameSEMICOLON	
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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
/** * */	TokenNameCOMMENT_JAVADOC	 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
PathTranslatingPostProcessor	TokenNameIdentifier	 Path Translating Post Processor
implements	TokenNameimplements	
InterpolationPostProcessor	TokenNameIdentifier	 Interpolation Post Processor
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
unprefixedPathKeys	TokenNameIdentifier	 unprefixed Path Keys
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
File	TokenNameIdentifier	 File
projectDir	TokenNameIdentifier	 project Dir
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
PathTranslator	TokenNameIdentifier	 Path Translator
pathTranslator	TokenNameIdentifier	 path Translator
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
expressionPrefixes	TokenNameIdentifier	 expression Prefixes
;	TokenNameSEMICOLON	
public	TokenNamepublic	
PathTranslatingPostProcessor	TokenNameIdentifier	 Path Translating Post Processor
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
expressionPrefixes	TokenNameIdentifier	 expression Prefixes
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
unprefixedPathKeys	TokenNameIdentifier	 unprefixed Path Keys
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
projectDir	TokenNameIdentifier	 project Dir
,	TokenNameCOMMA	
PathTranslator	TokenNameIdentifier	 Path Translator
pathTranslator	TokenNameIdentifier	 path Translator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
expressionPrefixes	TokenNameIdentifier	 expression Prefixes
=	TokenNameEQUAL	
expressionPrefixes	TokenNameIdentifier	 expression Prefixes
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
unprefixedPathKeys	TokenNameIdentifier	 unprefixed Path Keys
=	TokenNameEQUAL	
unprefixedPathKeys	TokenNameIdentifier	 unprefixed Path Keys
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
projectDir	TokenNameIdentifier	 project Dir
=	TokenNameEQUAL	
projectDir	TokenNameIdentifier	 project Dir
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
pathTranslator	TokenNameIdentifier	 path Translator
=	TokenNameEQUAL	
pathTranslator	TokenNameIdentifier	 path Translator
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
expression	TokenNameIdentifier	 expression
=	TokenNameEQUAL	
ValueSourceUtils	TokenNameIdentifier	 Value Source Utils
.	TokenNameDOT	
trimPrefix	TokenNameIdentifier	 trim Prefix
(	TokenNameLPAREN	
expression	TokenNameIdentifier	 expression
,	TokenNameCOMMA	
expressionPrefixes	TokenNameIdentifier	 expression Prefixes
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
projectDir	TokenNameIdentifier	 project Dir
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
unprefixedPathKeys	TokenNameIdentifier	 unprefixed Path Keys
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
expression	TokenNameIdentifier	 expression
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pathTranslator	TokenNameIdentifier	 path Translator
.	TokenNameDOT	
alignToBaseDirectory	TokenNameIdentifier	 align To Base Directory
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
,	TokenNameCOMMA	
projectDir	TokenNameIdentifier	 project Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
