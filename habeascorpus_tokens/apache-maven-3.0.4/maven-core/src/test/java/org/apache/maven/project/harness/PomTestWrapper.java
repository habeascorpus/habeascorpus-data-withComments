package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
harness	TokenNameIdentifier	 harness
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
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
commons	TokenNameIdentifier	 commons
.	TokenNameDOT	
jxpath	TokenNameIdentifier	 jxpath
.	TokenNameDOT	
JXPathContext	TokenNameIdentifier	 JX Path Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
commons	TokenNameIdentifier	 commons
.	TokenNameDOT	
jxpath	TokenNameIdentifier	 jxpath
.	TokenNameDOT	
JXPathNotFoundException	TokenNameIdentifier	 JX Path Not Found Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
commons	TokenNameIdentifier	 commons
.	TokenNameDOT	
jxpath	TokenNameIdentifier	 jxpath
.	TokenNameDOT	
ri	TokenNameIdentifier	 ri
.	TokenNameDOT	
JXPathContextReferenceImpl	TokenNameIdentifier	 JX Path Context Reference Impl
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
MavenProject	TokenNameIdentifier	 Maven Project
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
PomTestWrapper	TokenNameIdentifier	 Pom Test Wrapper
{	TokenNameLBRACE	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
pomFile	TokenNameIdentifier	 pom File
;	TokenNameSEMICOLON	
private	TokenNameprivate	
JXPathContext	TokenNameIdentifier	 JX Path Context
context	TokenNameIdentifier	 context
;	TokenNameSEMICOLON	
private	TokenNameprivate	
MavenProject	TokenNameIdentifier	 Maven Project
mavenProject	TokenNameIdentifier	 maven Project
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
JXPathContextReferenceImpl	TokenNameIdentifier	 JX Path Context Reference Impl
.	TokenNameDOT	
addNodePointerFactory	TokenNameIdentifier	 add Node Pointer Factory
(	TokenNameLPAREN	
new	TokenNamenew	
Xpp3DomPointerFactory	TokenNameIdentifier	 Xpp3 Dom Pointer Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PomTestWrapper	TokenNameIdentifier	 Pom Test Wrapper
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
pomFile	TokenNameIdentifier	 pom File
,	TokenNameCOMMA	
MavenProject	TokenNameIdentifier	 Maven Project
mavenProject	TokenNameIdentifier	 maven Project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mavenProject	TokenNameIdentifier	 maven Project
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"mavenProject: null"	TokenNameStringLiteral	mavenProject: null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
mavenProject	TokenNameIdentifier	 maven Project
=	TokenNameEQUAL	
mavenProject	TokenNameIdentifier	 maven Project
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
pomFile	TokenNameIdentifier	 pom File
=	TokenNameEQUAL	
pomFile	TokenNameIdentifier	 pom File
;	TokenNameSEMICOLON	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
JXPathContext	TokenNameIdentifier	 JX Path Context
.	TokenNameDOT	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
mavenProject	TokenNameIdentifier	 maven Project
.	TokenNameDOT	
getModel	TokenNameIdentifier	 get Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PomTestWrapper	TokenNameIdentifier	 Pom Test Wrapper
(	TokenNameLPAREN	
MavenProject	TokenNameIdentifier	 Maven Project
mavenProject	TokenNameIdentifier	 maven Project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mavenProject	TokenNameIdentifier	 maven Project
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"mavenProject: null"	TokenNameStringLiteral	mavenProject: null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
mavenProject	TokenNameIdentifier	 maven Project
=	TokenNameEQUAL	
mavenProject	TokenNameIdentifier	 maven Project
;	TokenNameSEMICOLON	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
JXPathContext	TokenNameIdentifier	 JX Path Context
.	TokenNameDOT	
newContext	TokenNameIdentifier	 new Context
(	TokenNameLPAREN	
mavenProject	TokenNameIdentifier	 maven Project
.	TokenNameDOT	
getModel	TokenNameIdentifier	 get Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MavenProject	TokenNameIdentifier	 Maven Project
getMavenProject	TokenNameIdentifier	 get Maven Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mavenProject	TokenNameIdentifier	 maven Project
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
File	TokenNameIdentifier	 File
getBasedir	TokenNameIdentifier	 get Basedir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
pomFile	TokenNameIdentifier	 pom File
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
pomFile	TokenNameIdentifier	 pom File
.	TokenNameDOT	
getParentFile	TokenNameIdentifier	 get Parent File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setValueOnModel	TokenNameIdentifier	 set Value On Model
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
expression	TokenNameIdentifier	 expression
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
expression	TokenNameIdentifier	 expression
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* public int containerCountForUri( String uri ) throws IOException { if ( uri == null || uri.trim().equals( "" ) ) { throw new IllegalArgumentException( "uri: null or empty" ); } ModelDataSource source = new DefaultModelDataSource(); source.init( domainModel.getModelProperties(), null ); return source.queryFor( uri ).size(); } */	TokenNameCOMMENT_BLOCK	 public int containerCountForUri( String uri ) throws IOException { if ( uri == null || uri.trim().equals( "" ) ) { throw new IllegalArgumentException( "uri: null or empty" ); } ModelDataSource source = new DefaultModelDataSource(); source.init( domainModel.getModelProperties(), null ); return source.queryFor( uri ).size(); } 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
getIteratorForXPathExpression	TokenNameIdentifier	 get Iterator For X Path Expression
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
expression	TokenNameIdentifier	 expression
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
iterate	TokenNameIdentifier	 iterate
(	TokenNameLPAREN	
expression	TokenNameIdentifier	 expression
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
containsXPathExpression	TokenNameIdentifier	 contains X Path Expression
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
expression	TokenNameIdentifier	 expression
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
expression	TokenNameIdentifier	 expression
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
expression	TokenNameIdentifier	 expression
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
expression	TokenNameIdentifier	 expression
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
JXPathNotFoundException	TokenNameIdentifier	 JX Path Not Found Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
xPathExpressionEqualsValue	TokenNameIdentifier	 x Path Expression Equals Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
expression	TokenNameIdentifier	 expression
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
expression	TokenNameIdentifier	 expression
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
expression	TokenNameIdentifier	 expression
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
