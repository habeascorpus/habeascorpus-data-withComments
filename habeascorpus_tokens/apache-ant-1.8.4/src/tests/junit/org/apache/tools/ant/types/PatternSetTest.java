/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
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
BuildException	TokenNameIdentifier	 Build Exception
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
Project	TokenNameIdentifier	 Project
;	TokenNameSEMICOLON	
/** * JUnit 3 testcases for org.apache.tools.ant.types.PatternSet. * * <p>This doesn't actually test much, mainly reference handling.</p> * */	TokenNameCOMMENT_JAVADOC	 JUnit 3 testcases for org.apache.tools.ant.types.PatternSet. * <p>This doesn't actually test much, mainly reference handling.</p> 
public	TokenNamepublic	
class	TokenNameclass	
PatternSetTest	TokenNameIdentifier	 Pattern Set Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
public	TokenNamepublic	
PatternSetTest	TokenNameIdentifier	 Pattern Set Test
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
new	TokenNamenew	
Project	TokenNameIdentifier	 Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
setBasedir	TokenNameIdentifier	 set Basedir
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEmptyElementIfIsReference	TokenNameIdentifier	 test Empty Element If Is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PatternSet	TokenNameIdentifier	 Pattern Set
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
PatternSet	TokenNameIdentifier	 Pattern Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setIncludes	TokenNameIdentifier	 set Includes
(	TokenNameLPAREN	
"**/*.java"	TokenNameStringLiteral	**/*.java
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
new	TokenNamenew	
Reference	TokenNameIdentifier	 Reference
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
"dummyref"	TokenNameStringLiteral	dummyref
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Can add reference to PatternSet with elements from setIncludes"	TokenNameStringLiteral	Can add reference to PatternSet with elements from setIncludes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"You must not specify more than one attribute when using refid"	TokenNameStringLiteral	You must not specify more than one attribute when using refid
,	TokenNameCOMMA	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
PatternSet	TokenNameIdentifier	 Pattern Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
new	TokenNamenew	
Reference	TokenNameIdentifier	 Reference
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
"dummyref"	TokenNameStringLiteral	dummyref
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setIncludes	TokenNameIdentifier	 set Includes
(	TokenNameLPAREN	
"**/*.java"	TokenNameStringLiteral	**/*.java
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Can set includes in PatternSet that is a reference."	TokenNameStringLiteral	Can set includes in PatternSet that is a reference.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"You must not specify more than one attribute when using refid"	TokenNameStringLiteral	You must not specify more than one attribute when using refid
,	TokenNameCOMMA	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
PatternSet	TokenNameIdentifier	 Pattern Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
new	TokenNamenew	
Reference	TokenNameIdentifier	 Reference
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
"dummyref"	TokenNameStringLiteral	dummyref
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setIncludesfile	TokenNameIdentifier	 set Includesfile
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"/a"	TokenNameStringLiteral	/a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Can set includesfile in PatternSet that is a reference."	TokenNameStringLiteral	Can set includesfile in PatternSet that is a reference.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"You must not specify more than one attribute when using refid"	TokenNameStringLiteral	You must not specify more than one attribute when using refid
,	TokenNameCOMMA	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setExcludes	TokenNameIdentifier	 set Excludes
(	TokenNameLPAREN	
"**/*.java"	TokenNameStringLiteral	**/*.java
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Can set excludes in PatternSet that is a reference."	TokenNameStringLiteral	Can set excludes in PatternSet that is a reference.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"You must not specify more than one attribute when using refid"	TokenNameStringLiteral	You must not specify more than one attribute when using refid
,	TokenNameCOMMA	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setExcludesfile	TokenNameIdentifier	 set Excludesfile
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"/a"	TokenNameStringLiteral	/a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Can set excludesfile in PatternSet that is a reference."	TokenNameStringLiteral	Can set excludesfile in PatternSet that is a reference.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"You must not specify more than one attribute when using refid"	TokenNameStringLiteral	You must not specify more than one attribute when using refid
,	TokenNameCOMMA	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
createInclude	TokenNameIdentifier	 create Include
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Can add nested include in PatternSet that is a reference."	TokenNameStringLiteral	Can add nested include in PatternSet that is a reference.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"You must not specify nested elements when using refid"	TokenNameStringLiteral	You must not specify nested elements when using refid
,	TokenNameCOMMA	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
createExclude	TokenNameIdentifier	 create Exclude
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Can add nested exclude in PatternSet that is a reference."	TokenNameStringLiteral	Can add nested exclude in PatternSet that is a reference.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"You must not specify nested elements when using refid"	TokenNameStringLiteral	You must not specify nested elements when using refid
,	TokenNameCOMMA	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
createIncludesFile	TokenNameIdentifier	 create Includes File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Can add nested includesfile in PatternSet that is a reference."	TokenNameStringLiteral	Can add nested includesfile in PatternSet that is a reference.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"You must not specify nested elements when using refid"	TokenNameStringLiteral	You must not specify nested elements when using refid
,	TokenNameCOMMA	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
createExcludesFile	TokenNameIdentifier	 create Excludes File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Can add nested excludesfile in PatternSet that is a reference."	TokenNameStringLiteral	Can add nested excludesfile in PatternSet that is a reference.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"You must not specify nested elements when using refid"	TokenNameStringLiteral	You must not specify nested elements when using refid
,	TokenNameCOMMA	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCircularReferenceCheck	TokenNameIdentifier	 test Circular Reference Check
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PatternSet	TokenNameIdentifier	 Pattern Set
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
PatternSet	TokenNameIdentifier	 Pattern Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
"dummy"	TokenNameStringLiteral	dummy
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
new	TokenNamenew	
Reference	TokenNameIdentifier	 Reference
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
"dummy"	TokenNameStringLiteral	dummy
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getIncludePatterns	TokenNameIdentifier	 get Include Patterns
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Can make PatternSet a Reference to itself."	TokenNameStringLiteral	Can make PatternSet a Reference to itself.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"This data type contains a circular reference."	TokenNameStringLiteral	This data type contains a circular reference.
,	TokenNameCOMMA	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getExcludePatterns	TokenNameIdentifier	 get Exclude Patterns
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Can make PatternSet a Reference to itself."	TokenNameStringLiteral	Can make PatternSet a Reference to itself.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"This data type contains a circular reference."	TokenNameStringLiteral	This data type contains a circular reference.
,	TokenNameCOMMA	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// dummy1 --> dummy2 --> dummy3 --> dummy1 	TokenNameCOMMENT_LINE	dummy1 --> dummy2 --> dummy3 --> dummy1 
PatternSet	TokenNameIdentifier	 Pattern Set
p1	TokenNameIdentifier	 p1
=	TokenNameEQUAL	
new	TokenNamenew	
PatternSet	TokenNameIdentifier	 Pattern Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
"dummy1"	TokenNameStringLiteral	dummy1
,	TokenNameCOMMA	
p1	TokenNameIdentifier	 p1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
new	TokenNamenew	
Reference	TokenNameIdentifier	 Reference
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
"dummy2"	TokenNameStringLiteral	dummy2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PatternSet	TokenNameIdentifier	 Pattern Set
p2	TokenNameIdentifier	 p2
=	TokenNameEQUAL	
new	TokenNamenew	
PatternSet	TokenNameIdentifier	 Pattern Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
"dummy2"	TokenNameStringLiteral	dummy2
,	TokenNameCOMMA	
p2	TokenNameIdentifier	 p2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
new	TokenNamenew	
Reference	TokenNameIdentifier	 Reference
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
"dummy3"	TokenNameStringLiteral	dummy3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PatternSet	TokenNameIdentifier	 Pattern Set
p3	TokenNameIdentifier	 p3
=	TokenNameEQUAL	
new	TokenNamenew	
PatternSet	TokenNameIdentifier	 Pattern Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
"dummy3"	TokenNameStringLiteral	dummy3
,	TokenNameCOMMA	
p3	TokenNameIdentifier	 p3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
new	TokenNamenew	
Reference	TokenNameIdentifier	 Reference
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
"dummy1"	TokenNameStringLiteral	dummy1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
getIncludePatterns	TokenNameIdentifier	 get Include Patterns
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Can make circular reference."	TokenNameStringLiteral	Can make circular reference.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"This data type contains a circular reference."	TokenNameStringLiteral	This data type contains a circular reference.
,	TokenNameCOMMA	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
getExcludePatterns	TokenNameIdentifier	 get Exclude Patterns
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Can make circular reference."	TokenNameStringLiteral	Can make circular reference.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"This data type contains a circular reference."	TokenNameStringLiteral	This data type contains a circular reference.
,	TokenNameCOMMA	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// dummy1 --> dummy2 --> dummy3 	TokenNameCOMMENT_LINE	dummy1 --> dummy2 --> dummy3 
// (which holds patterns "include" and "exclude") 	TokenNameCOMMENT_LINE	(which holds patterns "include" and "exclude") 
p1	TokenNameIdentifier	 p1
=	TokenNameEQUAL	
new	TokenNamenew	
PatternSet	TokenNameIdentifier	 Pattern Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
"dummy1"	TokenNameStringLiteral	dummy1
,	TokenNameCOMMA	
p1	TokenNameIdentifier	 p1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
new	TokenNamenew	
Reference	TokenNameIdentifier	 Reference
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
"dummy2"	TokenNameStringLiteral	dummy2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p2	TokenNameIdentifier	 p2
=	TokenNameEQUAL	
new	TokenNamenew	
PatternSet	TokenNameIdentifier	 Pattern Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
"dummy2"	TokenNameStringLiteral	dummy2
,	TokenNameCOMMA	
p2	TokenNameIdentifier	 p2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
new	TokenNamenew	
Reference	TokenNameIdentifier	 Reference
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
"dummy3"	TokenNameStringLiteral	dummy3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p3	TokenNameIdentifier	 p3
=	TokenNameEQUAL	
new	TokenNamenew	
PatternSet	TokenNameIdentifier	 Pattern Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
"dummy3"	TokenNameStringLiteral	dummy3
,	TokenNameCOMMA	
p3	TokenNameIdentifier	 p3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
setIncludes	TokenNameIdentifier	 set Includes
(	TokenNameLPAREN	
"include"	TokenNameStringLiteral	include
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
createExclude	TokenNameIdentifier	 create Exclude
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
"exclude"	TokenNameStringLiteral	exclude
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
getIncludePatterns	TokenNameIdentifier	 get Include Patterns
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"One include pattern buried deep inside a nested patternset structure"	TokenNameStringLiteral	One include pattern buried deep inside a nested patternset structure
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"include"	TokenNameStringLiteral	include
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
getExcludePatterns	TokenNameIdentifier	 get Exclude Patterns
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"One exclude pattern buried deep inside a nested patternset structure"	TokenNameStringLiteral	One exclude pattern buried deep inside a nested patternset structure
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"exclude"	TokenNameStringLiteral	exclude
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNestedPatternset	TokenNameIdentifier	 test Nested Patternset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PatternSet	TokenNameIdentifier	 Pattern Set
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
PatternSet	TokenNameIdentifier	 Pattern Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setIncludes	TokenNameIdentifier	 set Includes
(	TokenNameLPAREN	
"**/*.java"	TokenNameStringLiteral	**/*.java
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PatternSet	TokenNameIdentifier	 Pattern Set
nested	TokenNameIdentifier	 nested
=	TokenNameEQUAL	
new	TokenNamenew	
PatternSet	TokenNameIdentifier	 Pattern Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nested	TokenNameIdentifier	 nested
.	TokenNameDOT	
setExcludes	TokenNameIdentifier	 set Excludes
(	TokenNameLPAREN	
"**/*.class"	TokenNameStringLiteral	**/*.class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
addConfiguredPatternset	TokenNameIdentifier	 add Configured Patternset
(	TokenNameLPAREN	
nested	TokenNameIdentifier	 nested
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
excludes	TokenNameIdentifier	 excludes
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getExcludePatterns	TokenNameIdentifier	 get Exclude Patterns
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
includes	TokenNameIdentifier	 includes
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getIncludePatterns	TokenNameIdentifier	 get Include Patterns
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Includes"	TokenNameStringLiteral	Includes
,	TokenNameCOMMA	
"**/*.java"	TokenNameStringLiteral	**/*.java
,	TokenNameCOMMA	
includes	TokenNameIdentifier	 includes
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Excludes"	TokenNameStringLiteral	Excludes
,	TokenNameCOMMA	
"**/*.class"	TokenNameStringLiteral	**/*.class
,	TokenNameCOMMA	
excludes	TokenNameIdentifier	 excludes
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
