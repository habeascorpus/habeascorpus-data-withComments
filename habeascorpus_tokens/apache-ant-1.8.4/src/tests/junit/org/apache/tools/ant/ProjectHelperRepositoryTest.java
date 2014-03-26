/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
helper	TokenNameIdentifier	 helper
.	TokenNameDOT	
ProjectHelper2	TokenNameIdentifier	 Project Helper2
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Resource	TokenNameIdentifier	 Resource
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
resources	TokenNameIdentifier	 resources
.	TokenNameDOT	
FileResource	TokenNameIdentifier	 File Resource
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
resources	TokenNameIdentifier	 resources
.	TokenNameDOT	
StringResource	TokenNameIdentifier	 String Resource
;	TokenNameSEMICOLON	
/** * Testing around the management of the project helpers */	TokenNameCOMMENT_JAVADOC	 Testing around the management of the project helpers 
public	TokenNamepublic	
class	TokenNameclass	
ProjectHelperRepositoryTest	TokenNameIdentifier	 Project Helper Repository Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
SomeHelper	TokenNameIdentifier	 Some Helper
extends	TokenNameextends	
ProjectHelper	TokenNameIdentifier	 Project Helper
{	TokenNameLBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
canParseBuildFile	TokenNameIdentifier	 can Parse Build File
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
buildFile	TokenNameIdentifier	 build File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
buildFile	TokenNameIdentifier	 build File
instanceof	TokenNameinstanceof	
FileResource	TokenNameIdentifier	 File Resource
&&	TokenNameAND_AND	
buildFile	TokenNameIdentifier	 build File
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
".myext"	TokenNameStringLiteral	.myext
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
canParseAntlibDescriptor	TokenNameIdentifier	 can Parse Antlib Descriptor
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
r	TokenNameIdentifier	 r
instanceof	TokenNameinstanceof	
FileResource	TokenNameIdentifier	 File Resource
&&	TokenNameAND_AND	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
".myext"	TokenNameStringLiteral	.myext
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFind	TokenNameIdentifier	 test Find
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
ProjectHelperRepository	TokenNameIdentifier	 Project Helper Repository
repo	TokenNameIdentifier	 repo
=	TokenNameEQUAL	
ProjectHelperRepository	TokenNameIdentifier	 Project Helper Repository
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
repo	TokenNameIdentifier	 repo
.	TokenNameDOT	
registerProjectHelper	TokenNameIdentifier	 register Project Helper
(	TokenNameLPAREN	
SomeHelper	TokenNameIdentifier	 Some Helper
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Resource	TokenNameIdentifier	 Resource
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
new	TokenNamenew	
FileResource	TokenNameIdentifier	 File Resource
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"test.xml"	TokenNameStringLiteral	test.xml
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ProjectHelper	TokenNameIdentifier	 Project Helper
helper	TokenNameIdentifier	 helper
=	TokenNameEQUAL	
repo	TokenNameIdentifier	 repo
.	TokenNameDOT	
getProjectHelperForBuildFile	TokenNameIdentifier	 get Project Helper For Build File
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
helper	TokenNameIdentifier	 helper
instanceof	TokenNameinstanceof	
ProjectHelper2	TokenNameIdentifier	 Project Helper2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
helper	TokenNameIdentifier	 helper
=	TokenNameEQUAL	
repo	TokenNameIdentifier	 repo
.	TokenNameDOT	
getProjectHelperForAntlib	TokenNameIdentifier	 get Project Helper For Antlib
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
helper	TokenNameIdentifier	 helper
instanceof	TokenNameinstanceof	
ProjectHelper2	TokenNameIdentifier	 Project Helper2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
new	TokenNamenew	
FileResource	TokenNameIdentifier	 File Resource
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"test.myext"	TokenNameStringLiteral	test.myext
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
helper	TokenNameIdentifier	 helper
=	TokenNameEQUAL	
repo	TokenNameIdentifier	 repo
.	TokenNameDOT	
getProjectHelperForBuildFile	TokenNameIdentifier	 get Project Helper For Build File
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
helper	TokenNameIdentifier	 helper
instanceof	TokenNameinstanceof	
SomeHelper	TokenNameIdentifier	 Some Helper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
helper	TokenNameIdentifier	 helper
=	TokenNameEQUAL	
repo	TokenNameIdentifier	 repo
.	TokenNameDOT	
getProjectHelperForAntlib	TokenNameIdentifier	 get Project Helper For Antlib
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
helper	TokenNameIdentifier	 helper
instanceof	TokenNameinstanceof	
SomeHelper	TokenNameIdentifier	 Some Helper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
new	TokenNamenew	
StringResource	TokenNameIdentifier	 String Resource
(	TokenNameLPAREN	
"test.myext"	TokenNameStringLiteral	test.myext
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
helper	TokenNameIdentifier	 helper
=	TokenNameEQUAL	
repo	TokenNameIdentifier	 repo
.	TokenNameDOT	
getProjectHelperForBuildFile	TokenNameIdentifier	 get Project Helper For Build File
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
helper	TokenNameIdentifier	 helper
instanceof	TokenNameinstanceof	
ProjectHelper2	TokenNameIdentifier	 Project Helper2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
helper	TokenNameIdentifier	 helper
=	TokenNameEQUAL	
repo	TokenNameIdentifier	 repo
.	TokenNameDOT	
getProjectHelperForAntlib	TokenNameIdentifier	 get Project Helper For Antlib
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
helper	TokenNameIdentifier	 helper
instanceof	TokenNameinstanceof	
ProjectHelper2	TokenNameIdentifier	 Project Helper2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
new	TokenNamenew	
StringResource	TokenNameIdentifier	 String Resource
(	TokenNameLPAREN	
"test.other"	TokenNameStringLiteral	test.other
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
helper	TokenNameIdentifier	 helper
=	TokenNameEQUAL	
repo	TokenNameIdentifier	 repo
.	TokenNameDOT	
getProjectHelperForBuildFile	TokenNameIdentifier	 get Project Helper For Build File
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
helper	TokenNameIdentifier	 helper
instanceof	TokenNameinstanceof	
ProjectHelper2	TokenNameIdentifier	 Project Helper2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
helper	TokenNameIdentifier	 helper
=	TokenNameEQUAL	
repo	TokenNameIdentifier	 repo
.	TokenNameDOT	
getProjectHelperForAntlib	TokenNameIdentifier	 get Project Helper For Antlib
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
helper	TokenNameIdentifier	 helper
instanceof	TokenNameinstanceof	
ProjectHelper2	TokenNameIdentifier	 Project Helper2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoDefaultContructor	TokenNameIdentifier	 test No Default Contructor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
class	TokenNameclass	
IncrrectHelper	TokenNameIdentifier	 Incrrect Helper
extends	TokenNameextends	
ProjectHelper	TokenNameIdentifier	 Project Helper
{	TokenNameLBRACE	
// the default constructor is not visible to ant here 	TokenNameCOMMENT_LINE	the default constructor is not visible to ant here 
}	TokenNameRBRACE	
ProjectHelperRepository	TokenNameIdentifier	 Project Helper Repository
repo	TokenNameIdentifier	 repo
=	TokenNameEQUAL	
ProjectHelperRepository	TokenNameIdentifier	 Project Helper Repository
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
repo	TokenNameIdentifier	 repo
.	TokenNameDOT	
registerProjectHelper	TokenNameIdentifier	 register Project Helper
(	TokenNameLPAREN	
IncrrectHelper	TokenNameIdentifier	 Incrrect Helper
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Registring an helper with no default constructor should fail"	TokenNameStringLiteral	Registring an helper with no default constructor should fail
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ok 	TokenNameCOMMENT_LINE	ok 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testUnkwnowHelper	TokenNameIdentifier	 test Unkwnow Helper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
ProjectHelperRepository	TokenNameIdentifier	 Project Helper Repository
repo	TokenNameIdentifier	 repo
=	TokenNameEQUAL	
ProjectHelperRepository	TokenNameIdentifier	 Project Helper Repository
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
repo	TokenNameIdentifier	 repo
.	TokenNameDOT	
registerProjectHelper	TokenNameIdentifier	 register Project Helper
(	TokenNameLPAREN	
"xxx.yyy.zzz.UnknownHelper"	TokenNameStringLiteral	xxx.yyy.zzz.UnknownHelper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Registring an unknwon helper should fail"	TokenNameStringLiteral	Registring an unknwon helper should fail
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ok 	TokenNameCOMMENT_LINE	ok 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
