package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
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
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
legacy	TokenNameIdentifier	 legacy
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
ArtifactRepositoryFactory	TokenNameIdentifier	 Artifact Repository Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
DefaultRepositoryLayout	TokenNameIdentifier	 Default Repository Layout
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
Mirror	TokenNameIdentifier	 Mirror
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
PlexusTestCase	TokenNameIdentifier	 Plexus Test Case
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
MirrorProcessorTest	TokenNameIdentifier	 Mirror Processor Test
extends	TokenNameextends	
PlexusTestCase	TokenNameIdentifier	 Plexus Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
mirrorSelector	TokenNameIdentifier	 mirror Selector
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ArtifactRepositoryFactory	TokenNameIdentifier	 Artifact Repository Factory
repositorySystem	TokenNameIdentifier	 repository System
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
mirrorSelector	TokenNameIdentifier	 mirror Selector
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
)	TokenNameRPAREN	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
MirrorSelector	TokenNameIdentifier	 Mirror Selector
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
repositorySystem	TokenNameIdentifier	 repository System
=	TokenNameEQUAL	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
ArtifactRepositoryFactory	TokenNameIdentifier	 Artifact Repository Factory
.	TokenNameDOT	
class	TokenNameclass	
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
mirrorSelector	TokenNameIdentifier	 mirror Selector
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
repositorySystem	TokenNameIdentifier	 repository System
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
public	TokenNamepublic	
void	TokenNamevoid	
testExternalURL	TokenNameIdentifier	 test External URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
isExternalRepo	TokenNameIdentifier	 is External Repo
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
"http://somehost"	TokenNameStringLiteral	http://somehost
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
isExternalRepo	TokenNameIdentifier	 is External Repo
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
"http://somehost:9090/somepath"	TokenNameStringLiteral	http://somehost:9090/somepath
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
isExternalRepo	TokenNameIdentifier	 is External Repo
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
"ftp://somehost"	TokenNameStringLiteral	ftp://somehost
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
isExternalRepo	TokenNameIdentifier	 is External Repo
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
"http://192.168.101.1"	TokenNameStringLiteral	http://192.168.101.1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
isExternalRepo	TokenNameIdentifier	 is External Repo
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
"http://"	TokenNameStringLiteral	http://
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// these are local 	TokenNameCOMMENT_LINE	these are local 
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
isExternalRepo	TokenNameIdentifier	 is External Repo
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
"http://localhost:8080"	TokenNameStringLiteral	http://localhost:8080
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
isExternalRepo	TokenNameIdentifier	 is External Repo
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
"http://127.0.0.1:9090"	TokenNameStringLiteral	http://127.0.0.1:9090
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
isExternalRepo	TokenNameIdentifier	 is External Repo
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
"file://localhost/somepath"	TokenNameStringLiteral	file://localhost/somepath
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
isExternalRepo	TokenNameIdentifier	 is External Repo
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
"file://localhost/D:/somepath"	TokenNameStringLiteral	file://localhost/D:/somepath
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
isExternalRepo	TokenNameIdentifier	 is External Repo
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
"http://localhost"	TokenNameStringLiteral	http://localhost
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
isExternalRepo	TokenNameIdentifier	 is External Repo
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
"http://127.0.0.1"	TokenNameStringLiteral	http://127.0.0.1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
isExternalRepo	TokenNameIdentifier	 is External Repo
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
"file:///somepath"	TokenNameStringLiteral	file:///somepath
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
isExternalRepo	TokenNameIdentifier	 is External Repo
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
"file://D:/somepath"	TokenNameStringLiteral	file://D:/somepath
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// not a proper url so returns false; 	TokenNameCOMMENT_LINE	not a proper url so returns false; 
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
isExternalRepo	TokenNameIdentifier	 is External Repo
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
"192.168.101.1"	TokenNameStringLiteral	192.168.101.1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
isExternalRepo	TokenNameIdentifier	 is External Repo
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMirrorLookup	TokenNameIdentifier	 test Mirror Lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Mirror	TokenNameIdentifier	 Mirror
mirrorA	TokenNameIdentifier	 mirror A
=	TokenNameEQUAL	
newMirror	TokenNameIdentifier	 new Mirror
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"http://a"	TokenNameStringLiteral	http://a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Mirror	TokenNameIdentifier	 Mirror
mirrorB	TokenNameIdentifier	 mirror B
=	TokenNameEQUAL	
newMirror	TokenNameIdentifier	 new Mirror
(	TokenNameLPAREN	
"b"	TokenNameStringLiteral	b
,	TokenNameCOMMA	
"b"	TokenNameStringLiteral	b
,	TokenNameCOMMA	
"http://b"	TokenNameStringLiteral	http://b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Mirror	TokenNameIdentifier	 Mirror
>	TokenNameGREATER	
mirrors	TokenNameIdentifier	 mirrors
=	TokenNameEQUAL	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
mirrorA	TokenNameIdentifier	 mirror A
,	TokenNameCOMMA	
mirrorB	TokenNameIdentifier	 mirror B
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
mirrorA	TokenNameIdentifier	 mirror A
,	TokenNameCOMMA	
mirrorSelector	TokenNameIdentifier	 mirror Selector
.	TokenNameDOT	
getMirror	TokenNameIdentifier	 get Mirror
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"http://a.a"	TokenNameStringLiteral	http://a.a
)	TokenNameRPAREN	
,	TokenNameCOMMA	
mirrors	TokenNameIdentifier	 mirrors
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
mirrorB	TokenNameIdentifier	 mirror B
,	TokenNameCOMMA	
mirrorSelector	TokenNameIdentifier	 mirror Selector
.	TokenNameDOT	
getMirror	TokenNameIdentifier	 get Mirror
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"b"	TokenNameStringLiteral	b
,	TokenNameCOMMA	
"http://a.a"	TokenNameStringLiteral	http://a.a
)	TokenNameRPAREN	
,	TokenNameCOMMA	
mirrors	TokenNameIdentifier	 mirrors
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
mirrorSelector	TokenNameIdentifier	 mirror Selector
.	TokenNameDOT	
getMirror	TokenNameIdentifier	 get Mirror
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"c"	TokenNameStringLiteral	c
,	TokenNameCOMMA	
"http://c.c"	TokenNameStringLiteral	http://c.c
)	TokenNameRPAREN	
,	TokenNameCOMMA	
mirrors	TokenNameIdentifier	 mirrors
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMirrorWildcardLookup	TokenNameIdentifier	 test Mirror Wildcard Lookup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Mirror	TokenNameIdentifier	 Mirror
mirrorA	TokenNameIdentifier	 mirror A
=	TokenNameEQUAL	
newMirror	TokenNameIdentifier	 new Mirror
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"http://a"	TokenNameStringLiteral	http://a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Mirror	TokenNameIdentifier	 Mirror
mirrorB	TokenNameIdentifier	 mirror B
=	TokenNameEQUAL	
newMirror	TokenNameIdentifier	 new Mirror
(	TokenNameLPAREN	
"b"	TokenNameStringLiteral	b
,	TokenNameCOMMA	
"b"	TokenNameStringLiteral	b
,	TokenNameCOMMA	
"http://b"	TokenNameStringLiteral	http://b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Mirror	TokenNameIdentifier	 Mirror
mirrorC	TokenNameIdentifier	 mirror C
=	TokenNameEQUAL	
newMirror	TokenNameIdentifier	 new Mirror
(	TokenNameLPAREN	
"c"	TokenNameStringLiteral	c
,	TokenNameCOMMA	
"*"	TokenNameStringLiteral	*
,	TokenNameCOMMA	
"http://wildcard"	TokenNameStringLiteral	http://wildcard
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Mirror	TokenNameIdentifier	 Mirror
>	TokenNameGREATER	
mirrors	TokenNameIdentifier	 mirrors
=	TokenNameEQUAL	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
mirrorA	TokenNameIdentifier	 mirror A
,	TokenNameCOMMA	
mirrorB	TokenNameIdentifier	 mirror B
,	TokenNameCOMMA	
mirrorC	TokenNameIdentifier	 mirror C
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
mirrorA	TokenNameIdentifier	 mirror A
,	TokenNameCOMMA	
mirrorSelector	TokenNameIdentifier	 mirror Selector
.	TokenNameDOT	
getMirror	TokenNameIdentifier	 get Mirror
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"http://a.a"	TokenNameStringLiteral	http://a.a
)	TokenNameRPAREN	
,	TokenNameCOMMA	
mirrors	TokenNameIdentifier	 mirrors
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
mirrorB	TokenNameIdentifier	 mirror B
,	TokenNameCOMMA	
mirrorSelector	TokenNameIdentifier	 mirror Selector
.	TokenNameDOT	
getMirror	TokenNameIdentifier	 get Mirror
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"b"	TokenNameStringLiteral	b
,	TokenNameCOMMA	
"http://a.a"	TokenNameStringLiteral	http://a.a
)	TokenNameRPAREN	
,	TokenNameCOMMA	
mirrors	TokenNameIdentifier	 mirrors
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
mirrorC	TokenNameIdentifier	 mirror C
,	TokenNameCOMMA	
mirrorSelector	TokenNameIdentifier	 mirror Selector
.	TokenNameDOT	
getMirror	TokenNameIdentifier	 get Mirror
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"c"	TokenNameStringLiteral	c
,	TokenNameCOMMA	
"http://c.c"	TokenNameStringLiteral	http://c.c
)	TokenNameRPAREN	
,	TokenNameCOMMA	
mirrors	TokenNameIdentifier	 mirrors
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMirrorStopOnFirstMatch	TokenNameIdentifier	 test Mirror Stop On First Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// exact matches win first 	TokenNameCOMMENT_LINE	exact matches win first 
Mirror	TokenNameIdentifier	 Mirror
mirrorA2	TokenNameIdentifier	 mirror A2
=	TokenNameEQUAL	
newMirror	TokenNameIdentifier	 new Mirror
(	TokenNameLPAREN	
"a2"	TokenNameStringLiteral	a2
,	TokenNameCOMMA	
"a,b"	TokenNameStringLiteral	a,b
,	TokenNameCOMMA	
"http://a2"	TokenNameStringLiteral	http://a2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Mirror	TokenNameIdentifier	 Mirror
mirrorA	TokenNameIdentifier	 mirror A
=	TokenNameEQUAL	
newMirror	TokenNameIdentifier	 new Mirror
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"http://a"	TokenNameStringLiteral	http://a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// make sure repeated entries are skipped 	TokenNameCOMMENT_LINE	make sure repeated entries are skipped 
Mirror	TokenNameIdentifier	 Mirror
mirrorA3	TokenNameIdentifier	 mirror A3
=	TokenNameEQUAL	
newMirror	TokenNameIdentifier	 new Mirror
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"http://a3"	TokenNameStringLiteral	http://a3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Mirror	TokenNameIdentifier	 Mirror
mirrorB	TokenNameIdentifier	 mirror B
=	TokenNameEQUAL	
newMirror	TokenNameIdentifier	 new Mirror
(	TokenNameLPAREN	
"b"	TokenNameStringLiteral	b
,	TokenNameCOMMA	
"b"	TokenNameStringLiteral	b
,	TokenNameCOMMA	
"http://b"	TokenNameStringLiteral	http://b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Mirror	TokenNameIdentifier	 Mirror
mirrorC	TokenNameIdentifier	 mirror C
=	TokenNameEQUAL	
newMirror	TokenNameIdentifier	 new Mirror
(	TokenNameLPAREN	
"c"	TokenNameStringLiteral	c
,	TokenNameCOMMA	
"d,e"	TokenNameStringLiteral	d,e
,	TokenNameCOMMA	
"http://de"	TokenNameStringLiteral	http://de
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Mirror	TokenNameIdentifier	 Mirror
mirrorC2	TokenNameIdentifier	 mirror C2
=	TokenNameEQUAL	
newMirror	TokenNameIdentifier	 new Mirror
(	TokenNameLPAREN	
"c"	TokenNameStringLiteral	c
,	TokenNameCOMMA	
"*"	TokenNameStringLiteral	*
,	TokenNameCOMMA	
"http://wildcard"	TokenNameStringLiteral	http://wildcard
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Mirror	TokenNameIdentifier	 Mirror
mirrorC3	TokenNameIdentifier	 mirror C3
=	TokenNameEQUAL	
newMirror	TokenNameIdentifier	 new Mirror
(	TokenNameLPAREN	
"c"	TokenNameStringLiteral	c
,	TokenNameCOMMA	
"e,f"	TokenNameStringLiteral	e,f
,	TokenNameCOMMA	
"http://ef"	TokenNameStringLiteral	http://ef
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Mirror	TokenNameIdentifier	 Mirror
>	TokenNameGREATER	
mirrors	TokenNameIdentifier	 mirrors
=	TokenNameEQUAL	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
mirrorA2	TokenNameIdentifier	 mirror A2
,	TokenNameCOMMA	
mirrorA	TokenNameIdentifier	 mirror A
,	TokenNameCOMMA	
mirrorA3	TokenNameIdentifier	 mirror A3
,	TokenNameCOMMA	
mirrorB	TokenNameIdentifier	 mirror B
,	TokenNameCOMMA	
mirrorC	TokenNameIdentifier	 mirror C
,	TokenNameCOMMA	
mirrorC2	TokenNameIdentifier	 mirror C2
,	TokenNameCOMMA	
mirrorC3	TokenNameIdentifier	 mirror C3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
mirrorA	TokenNameIdentifier	 mirror A
,	TokenNameCOMMA	
mirrorSelector	TokenNameIdentifier	 mirror Selector
.	TokenNameDOT	
getMirror	TokenNameIdentifier	 get Mirror
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"http://a.a"	TokenNameStringLiteral	http://a.a
)	TokenNameRPAREN	
,	TokenNameCOMMA	
mirrors	TokenNameIdentifier	 mirrors
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
mirrorB	TokenNameIdentifier	 mirror B
,	TokenNameCOMMA	
mirrorSelector	TokenNameIdentifier	 mirror Selector
.	TokenNameDOT	
getMirror	TokenNameIdentifier	 get Mirror
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"b"	TokenNameStringLiteral	b
,	TokenNameCOMMA	
"http://a.a"	TokenNameStringLiteral	http://a.a
)	TokenNameRPAREN	
,	TokenNameCOMMA	
mirrors	TokenNameIdentifier	 mirrors
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
mirrorC2	TokenNameIdentifier	 mirror C2
,	TokenNameCOMMA	
mirrorSelector	TokenNameIdentifier	 mirror Selector
.	TokenNameDOT	
getMirror	TokenNameIdentifier	 get Mirror
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"c"	TokenNameStringLiteral	c
,	TokenNameCOMMA	
"http://c.c"	TokenNameStringLiteral	http://c.c
)	TokenNameRPAREN	
,	TokenNameCOMMA	
mirrors	TokenNameIdentifier	 mirrors
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
mirrorC	TokenNameIdentifier	 mirror C
,	TokenNameCOMMA	
mirrorSelector	TokenNameIdentifier	 mirror Selector
.	TokenNameDOT	
getMirror	TokenNameIdentifier	 get Mirror
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"d"	TokenNameStringLiteral	d
,	TokenNameCOMMA	
"http://d"	TokenNameStringLiteral	http://d
)	TokenNameRPAREN	
,	TokenNameCOMMA	
mirrors	TokenNameIdentifier	 mirrors
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
mirrorC	TokenNameIdentifier	 mirror C
,	TokenNameCOMMA	
mirrorSelector	TokenNameIdentifier	 mirror Selector
.	TokenNameDOT	
getMirror	TokenNameIdentifier	 get Mirror
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"e"	TokenNameStringLiteral	e
,	TokenNameCOMMA	
"http://e"	TokenNameStringLiteral	http://e
)	TokenNameRPAREN	
,	TokenNameCOMMA	
mirrors	TokenNameIdentifier	 mirrors
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
mirrorC2	TokenNameIdentifier	 mirror C2
,	TokenNameCOMMA	
mirrorSelector	TokenNameIdentifier	 mirror Selector
.	TokenNameDOT	
getMirror	TokenNameIdentifier	 get Mirror
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
,	TokenNameCOMMA	
"http://f"	TokenNameStringLiteral	http://f
)	TokenNameRPAREN	
,	TokenNameCOMMA	
mirrors	TokenNameIdentifier	 mirrors
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPatterns	TokenNameIdentifier	 test Patterns
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
matchPattern	TokenNameIdentifier	 match Pattern
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"*"	TokenNameStringLiteral	*
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
matchPattern	TokenNameIdentifier	 match Pattern
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"*,"	TokenNameStringLiteral	*,
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
matchPattern	TokenNameIdentifier	 match Pattern
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
,	TokenNameCOMMA	
",*,"	TokenNameStringLiteral	,*,
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
matchPattern	TokenNameIdentifier	 match Pattern
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"*,"	TokenNameStringLiteral	*,
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
matchPattern	TokenNameIdentifier	 match Pattern
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
matchPattern	TokenNameIdentifier	 match Pattern
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"a,"	TokenNameStringLiteral	a,
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
matchPattern	TokenNameIdentifier	 match Pattern
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
,	TokenNameCOMMA	
",a,"	TokenNameStringLiteral	,a,
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
matchPattern	TokenNameIdentifier	 match Pattern
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"a,"	TokenNameStringLiteral	a,
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
matchPattern	TokenNameIdentifier	 match Pattern
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"b"	TokenNameStringLiteral	b
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
matchPattern	TokenNameIdentifier	 match Pattern
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"b"	TokenNameStringLiteral	b
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"a,"	TokenNameStringLiteral	a,
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
matchPattern	TokenNameIdentifier	 match Pattern
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"b"	TokenNameStringLiteral	b
)	TokenNameRPAREN	
,	TokenNameCOMMA	
",a"	TokenNameStringLiteral	,a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
matchPattern	TokenNameIdentifier	 match Pattern
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"b"	TokenNameStringLiteral	b
)	TokenNameRPAREN	
,	TokenNameCOMMA	
",a,"	TokenNameStringLiteral	,a,
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
matchPattern	TokenNameIdentifier	 match Pattern
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"a,b"	TokenNameStringLiteral	a,b
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
matchPattern	TokenNameIdentifier	 match Pattern
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"b"	TokenNameStringLiteral	b
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"a,b"	TokenNameStringLiteral	a,b
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
matchPattern	TokenNameIdentifier	 match Pattern
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"c"	TokenNameStringLiteral	c
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"a,b"	TokenNameStringLiteral	a,b
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
matchPattern	TokenNameIdentifier	 match Pattern
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"*"	TokenNameStringLiteral	*
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
matchPattern	TokenNameIdentifier	 match Pattern
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"*,b"	TokenNameStringLiteral	*,b
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
matchPattern	TokenNameIdentifier	 match Pattern
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"*,!b"	TokenNameStringLiteral	*,!b
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
matchPattern	TokenNameIdentifier	 match Pattern
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"*,!a"	TokenNameStringLiteral	*,!a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
matchPattern	TokenNameIdentifier	 match Pattern
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"!a,*"	TokenNameStringLiteral	!a,*
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
matchPattern	TokenNameIdentifier	 match Pattern
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"c"	TokenNameStringLiteral	c
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"*,!a"	TokenNameStringLiteral	*,!a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
matchPattern	TokenNameIdentifier	 match Pattern
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"c"	TokenNameStringLiteral	c
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"!a,*"	TokenNameStringLiteral	!a,*
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
matchPattern	TokenNameIdentifier	 match Pattern
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"c"	TokenNameStringLiteral	c
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"!a,!c"	TokenNameStringLiteral	!a,!c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
matchPattern	TokenNameIdentifier	 match Pattern
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"d"	TokenNameStringLiteral	d
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"!a,!c*"	TokenNameStringLiteral	!a,!c*
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPatternsWithExternal	TokenNameIdentifier	 test Patterns With External
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
matchPattern	TokenNameIdentifier	 match Pattern
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"http://localhost"	TokenNameStringLiteral	http://localhost
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"*"	TokenNameStringLiteral	*
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
matchPattern	TokenNameIdentifier	 match Pattern
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"http://localhost"	TokenNameStringLiteral	http://localhost
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"external:*"	TokenNameStringLiteral	external:*
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
matchPattern	TokenNameIdentifier	 match Pattern
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"http://localhost"	TokenNameStringLiteral	http://localhost
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"external:*,a"	TokenNameStringLiteral	external:*,a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
matchPattern	TokenNameIdentifier	 match Pattern
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"http://localhost"	TokenNameStringLiteral	http://localhost
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"external:*,!a"	TokenNameStringLiteral	external:*,!a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
matchPattern	TokenNameIdentifier	 match Pattern
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"http://localhost"	TokenNameStringLiteral	http://localhost
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"a,external:*"	TokenNameStringLiteral	a,external:*
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
matchPattern	TokenNameIdentifier	 match Pattern
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"http://localhost"	TokenNameStringLiteral	http://localhost
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"!a,external:*"	TokenNameStringLiteral	!a,external:*
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
matchPattern	TokenNameIdentifier	 match Pattern
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"c"	TokenNameStringLiteral	c
,	TokenNameCOMMA	
"http://localhost"	TokenNameStringLiteral	http://localhost
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"!a,external:*"	TokenNameStringLiteral	!a,external:*
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
matchPattern	TokenNameIdentifier	 match Pattern
(	TokenNameLPAREN	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"c"	TokenNameStringLiteral	c
,	TokenNameCOMMA	
"http://somehost"	TokenNameStringLiteral	http://somehost
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"!a,external:*"	TokenNameStringLiteral	!a,external:*
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testLayoutPattern	TokenNameIdentifier	 test Layout Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
matchesLayout	TokenNameIdentifier	 matches Layout
(	TokenNameLPAREN	
"default"	TokenNameStringLiteral	default
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
matchesLayout	TokenNameIdentifier	 matches Layout
(	TokenNameLPAREN	
"default"	TokenNameStringLiteral	default
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
matchesLayout	TokenNameIdentifier	 matches Layout
(	TokenNameLPAREN	
"default"	TokenNameStringLiteral	default
,	TokenNameCOMMA	
"*"	TokenNameStringLiteral	*
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
matchesLayout	TokenNameIdentifier	 matches Layout
(	TokenNameLPAREN	
"default"	TokenNameStringLiteral	default
,	TokenNameCOMMA	
"default"	TokenNameStringLiteral	default
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
matchesLayout	TokenNameIdentifier	 matches Layout
(	TokenNameLPAREN	
"default"	TokenNameStringLiteral	default
,	TokenNameCOMMA	
"legacy"	TokenNameStringLiteral	legacy
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
matchesLayout	TokenNameIdentifier	 matches Layout
(	TokenNameLPAREN	
"default"	TokenNameStringLiteral	default
,	TokenNameCOMMA	
"legacy,default"	TokenNameStringLiteral	legacy,default
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
matchesLayout	TokenNameIdentifier	 matches Layout
(	TokenNameLPAREN	
"default"	TokenNameStringLiteral	default
,	TokenNameCOMMA	
"default,legacy"	TokenNameStringLiteral	default,legacy
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
matchesLayout	TokenNameIdentifier	 matches Layout
(	TokenNameLPAREN	
"default"	TokenNameStringLiteral	default
,	TokenNameCOMMA	
"legacy,!default"	TokenNameStringLiteral	legacy,!default
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
matchesLayout	TokenNameIdentifier	 matches Layout
(	TokenNameLPAREN	
"default"	TokenNameStringLiteral	default
,	TokenNameCOMMA	
"!default,legacy"	TokenNameStringLiteral	!default,legacy
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
matchesLayout	TokenNameIdentifier	 matches Layout
(	TokenNameLPAREN	
"default"	TokenNameStringLiteral	default
,	TokenNameCOMMA	
"*,!default"	TokenNameStringLiteral	*,!default
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
DefaultMirrorSelector	TokenNameIdentifier	 Default Mirror Selector
.	TokenNameDOT	
matchesLayout	TokenNameIdentifier	 matches Layout
(	TokenNameLPAREN	
"default"	TokenNameStringLiteral	default
,	TokenNameCOMMA	
"!default,*"	TokenNameStringLiteral	!default,*
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMirrorLayoutConsideredForMatching	TokenNameIdentifier	 test Mirror Layout Considered For Matching
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
repo	TokenNameIdentifier	 repo
=	TokenNameEQUAL	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Mirror	TokenNameIdentifier	 Mirror
mirrorA	TokenNameIdentifier	 mirror A
=	TokenNameEQUAL	
newMirror	TokenNameIdentifier	 new Mirror
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
"http://a"	TokenNameStringLiteral	http://a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Mirror	TokenNameIdentifier	 Mirror
mirrorB	TokenNameIdentifier	 mirror B
=	TokenNameEQUAL	
newMirror	TokenNameIdentifier	 new Mirror
(	TokenNameLPAREN	
"b"	TokenNameStringLiteral	b
,	TokenNameCOMMA	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"p2"	TokenNameStringLiteral	p2
,	TokenNameCOMMA	
"http://b"	TokenNameStringLiteral	http://b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Mirror	TokenNameIdentifier	 Mirror
mirrorC	TokenNameIdentifier	 mirror C
=	TokenNameEQUAL	
newMirror	TokenNameIdentifier	 new Mirror
(	TokenNameLPAREN	
"c"	TokenNameStringLiteral	c
,	TokenNameCOMMA	
"*"	TokenNameStringLiteral	*
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
"http://c"	TokenNameStringLiteral	http://c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Mirror	TokenNameIdentifier	 Mirror
mirrorD	TokenNameIdentifier	 mirror D
=	TokenNameEQUAL	
newMirror	TokenNameIdentifier	 new Mirror
(	TokenNameLPAREN	
"d"	TokenNameStringLiteral	d
,	TokenNameCOMMA	
"*"	TokenNameStringLiteral	*
,	TokenNameCOMMA	
"p2"	TokenNameStringLiteral	p2
,	TokenNameCOMMA	
"http://d"	TokenNameStringLiteral	http://d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
mirrorA	TokenNameIdentifier	 mirror A
,	TokenNameCOMMA	
mirrorSelector	TokenNameIdentifier	 mirror Selector
.	TokenNameDOT	
getMirror	TokenNameIdentifier	 get Mirror
(	TokenNameLPAREN	
repo	TokenNameIdentifier	 repo
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
mirrorA	TokenNameIdentifier	 mirror A
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
mirrorSelector	TokenNameIdentifier	 mirror Selector
.	TokenNameDOT	
getMirror	TokenNameIdentifier	 get Mirror
(	TokenNameLPAREN	
repo	TokenNameIdentifier	 repo
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
mirrorB	TokenNameIdentifier	 mirror B
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
mirrorC	TokenNameIdentifier	 mirror C
,	TokenNameCOMMA	
mirrorSelector	TokenNameIdentifier	 mirror Selector
.	TokenNameDOT	
getMirror	TokenNameIdentifier	 get Mirror
(	TokenNameLPAREN	
repo	TokenNameIdentifier	 repo
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
mirrorC	TokenNameIdentifier	 mirror C
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
mirrorSelector	TokenNameIdentifier	 mirror Selector
.	TokenNameDOT	
getMirror	TokenNameIdentifier	 get Mirror
(	TokenNameLPAREN	
repo	TokenNameIdentifier	 repo
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
mirrorD	TokenNameIdentifier	 mirror D
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Build an ArtifactRepository object. * * @param id * @param url * @return */	TokenNameCOMMENT_JAVADOC	 Build an ArtifactRepository object. * @param id @param url @return 
private	TokenNameprivate	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
repositorySystem	TokenNameIdentifier	 repository System
.	TokenNameDOT	
createArtifactRepository	TokenNameIdentifier	 create Artifact Repository
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
url	TokenNameIdentifier	 url
,	TokenNameCOMMA	
new	TokenNamenew	
DefaultRepositoryLayout	TokenNameIdentifier	 Default Repository Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Build an ArtifactRepository object. * * @param id * @return */	TokenNameCOMMENT_JAVADOC	 Build an ArtifactRepository object. * @param id @return 
private	TokenNameprivate	
ArtifactRepository	TokenNameIdentifier	 Artifact Repository
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getRepo	TokenNameIdentifier	 get Repo
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
"http://something"	TokenNameStringLiteral	http://something
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Mirror	TokenNameIdentifier	 Mirror
newMirror	TokenNameIdentifier	 new Mirror
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
mirrorOf	TokenNameIdentifier	 mirror Of
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
newMirror	TokenNameIdentifier	 new Mirror
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
mirrorOf	TokenNameIdentifier	 mirror Of
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Mirror	TokenNameIdentifier	 Mirror
newMirror	TokenNameIdentifier	 new Mirror
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
mirrorOf	TokenNameIdentifier	 mirror Of
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
layouts	TokenNameIdentifier	 layouts
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Mirror	TokenNameIdentifier	 Mirror
mirror	TokenNameIdentifier	 mirror
=	TokenNameEQUAL	
new	TokenNamenew	
Mirror	TokenNameIdentifier	 Mirror
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mirror	TokenNameIdentifier	 mirror
.	TokenNameDOT	
setId	TokenNameIdentifier	 set Id
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mirror	TokenNameIdentifier	 mirror
.	TokenNameDOT	
setMirrorOf	TokenNameIdentifier	 set Mirror Of
(	TokenNameLPAREN	
mirrorOf	TokenNameIdentifier	 mirror Of
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mirror	TokenNameIdentifier	 mirror
.	TokenNameDOT	
setMirrorOfLayouts	TokenNameIdentifier	 set Mirror Of Layouts
(	TokenNameLPAREN	
layouts	TokenNameIdentifier	 layouts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mirror	TokenNameIdentifier	 mirror
.	TokenNameDOT	
setUrl	TokenNameIdentifier	 set Url
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
mirror	TokenNameIdentifier	 mirror
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
