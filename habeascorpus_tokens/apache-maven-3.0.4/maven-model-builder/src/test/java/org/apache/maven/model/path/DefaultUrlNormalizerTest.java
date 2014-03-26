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
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
/** * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 @author Benjamin Bentmann 
public	TokenNamepublic	
class	TokenNameclass	
DefaultUrlNormalizerTest	TokenNameIdentifier	 Default Url Normalizer Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
UrlNormalizer	TokenNameIdentifier	 Url Normalizer
normalizer	TokenNameIdentifier	 normalizer
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
normalizer	TokenNameIdentifier	 normalizer
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultUrlNormalizer	TokenNameIdentifier	 Default Url Normalizer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
normalizer	TokenNameIdentifier	 normalizer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
normalizer	TokenNameIdentifier	 normalizer
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNullSafe	TokenNameIdentifier	 test Null Safe
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTrailingSlash	TokenNameIdentifier	 test Trailing Slash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"http://server.org/dir"	TokenNameStringLiteral	http://server.org/dir
,	TokenNameCOMMA	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
"http://server.org/dir"	TokenNameStringLiteral	http://server.org/dir
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"http://server.org/dir/"	TokenNameStringLiteral	http://server.org/dir/
,	TokenNameCOMMA	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
"http://server.org/dir/"	TokenNameStringLiteral	http://server.org/dir/
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testRemovalOfParentRefs	TokenNameIdentifier	 test Removal Of Parent Refs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"http://server.org/child"	TokenNameStringLiteral	http://server.org/child
,	TokenNameCOMMA	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
"http://server.org/parent/../child"	TokenNameStringLiteral	http://server.org/parent/../child
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"http://server.org/child"	TokenNameStringLiteral	http://server.org/child
,	TokenNameCOMMA	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
"http://server.org/grand/parent/../../child"	TokenNameStringLiteral	http://server.org/grand/parent/../../child
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"http://server.org//child"	TokenNameStringLiteral	http://server.org//child
,	TokenNameCOMMA	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
"http://server.org/parent/..//child"	TokenNameStringLiteral	http://server.org/parent/..//child
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"http://server.org/child"	TokenNameStringLiteral	http://server.org/child
,	TokenNameCOMMA	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
"http://server.org/parent//../child"	TokenNameStringLiteral	http://server.org/parent//../child
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPreservationOfDoubleSlashes	TokenNameIdentifier	 test Preservation Of Double Slashes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"scm:hg:ssh://localhost//home/user"	TokenNameStringLiteral	scm:hg:ssh://localhost//home/user
,	TokenNameCOMMA	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
"scm:hg:ssh://localhost//home/user"	TokenNameStringLiteral	scm:hg:ssh://localhost//home/user
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"file:////UNC/server"	TokenNameStringLiteral	file:////UNC/server
,	TokenNameCOMMA	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
"file:////UNC/server"	TokenNameStringLiteral	file:////UNC/server
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"[fetch=]http://server.org/[push=]ssh://server.org/"	TokenNameStringLiteral	[fetch=]http://server.org/[push=]ssh://server.org/
,	TokenNameCOMMA	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
"[fetch=]http://server.org/[push=]ssh://server.org/"	TokenNameStringLiteral	[fetch=]http://server.org/[push=]ssh://server.org/
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
