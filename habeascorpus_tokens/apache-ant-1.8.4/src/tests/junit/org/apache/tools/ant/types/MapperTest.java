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
BuildFileTest	TokenNameIdentifier	 Build File Test
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ChainedMapper	TokenNameIdentifier	 Chained Mapper
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
FileNameMapper	TokenNameIdentifier	 File Name Mapper
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
FlatFileNameMapper	TokenNameIdentifier	 Flat File Name Mapper
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
GlobPatternMapper	TokenNameIdentifier	 Glob Pattern Mapper
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
MergingMapper	TokenNameIdentifier	 Merging Mapper
;	TokenNameSEMICOLON	
/** * JUnit 3 testcases for org.apache.tools.ant.types.Mapper. * */	TokenNameCOMMENT_JAVADOC	 JUnit 3 testcases for org.apache.tools.ant.types.Mapper. 
public	TokenNamepublic	
class	TokenNameclass	
MapperTest	TokenNameIdentifier	 Mapper Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MapperTest	TokenNameIdentifier	 Mapper Test
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
Mapper	TokenNameIdentifier	 Mapper
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
new	TokenNamenew	
Mapper	TokenNameIdentifier	 Mapper
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
setFrom	TokenNameIdentifier	 set From
(	TokenNameLPAREN	
"*.java"	TokenNameStringLiteral	*.java
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
m	TokenNameIdentifier	 m
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
"Can add reference to Mapper with from attribute set"	TokenNameStringLiteral	Can add reference to Mapper with from attribute set
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
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
new	TokenNamenew	
Mapper	TokenNameIdentifier	 Mapper
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
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
m	TokenNameIdentifier	 m
.	TokenNameDOT	
setFrom	TokenNameIdentifier	 set From
(	TokenNameLPAREN	
"*.java"	TokenNameStringLiteral	*.java
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Can set from in Mapper that is a reference."	TokenNameStringLiteral	Can set from in Mapper that is a reference.
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
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
new	TokenNamenew	
Mapper	TokenNameIdentifier	 Mapper
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
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
m	TokenNameIdentifier	 m
.	TokenNameDOT	
setTo	TokenNameIdentifier	 set To
(	TokenNameLPAREN	
"*.java"	TokenNameStringLiteral	*.java
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Can set to in Mapper that is a reference."	TokenNameStringLiteral	Can set to in Mapper that is a reference.
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
Mapper	TokenNameIdentifier	 Mapper
.	TokenNameDOT	
MapperType	TokenNameIdentifier	 Mapper Type
mt	TokenNameIdentifier	 mt
=	TokenNameEQUAL	
new	TokenNamenew	
Mapper	TokenNameIdentifier	 Mapper
.	TokenNameDOT	
MapperType	TokenNameIdentifier	 Mapper Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mt	TokenNameIdentifier	 mt
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"glob"	TokenNameStringLiteral	glob
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
mt	TokenNameIdentifier	 mt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Can set type in Mapper that is a reference."	TokenNameStringLiteral	Can set type in Mapper that is a reference.
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
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCircularReferenceCheck	TokenNameIdentifier	 test Circular Reference Check
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Mapper	TokenNameIdentifier	 Mapper
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
new	TokenNamenew	
Mapper	TokenNameIdentifier	 Mapper
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
"dummy"	TokenNameStringLiteral	dummy
,	TokenNameCOMMA	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
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
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getImplementation	TokenNameIdentifier	 get Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Can make Mapper a Reference to itself."	TokenNameStringLiteral	Can make Mapper a Reference to itself.
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
Mapper	TokenNameIdentifier	 Mapper
m1	TokenNameIdentifier	 m1
=	TokenNameEQUAL	
new	TokenNamenew	
Mapper	TokenNameIdentifier	 Mapper
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
"dummy1"	TokenNameStringLiteral	dummy1
,	TokenNameCOMMA	
m1	TokenNameIdentifier	 m1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m1	TokenNameIdentifier	 m1
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
Mapper	TokenNameIdentifier	 Mapper
m2	TokenNameIdentifier	 m2
=	TokenNameEQUAL	
new	TokenNamenew	
Mapper	TokenNameIdentifier	 Mapper
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
"dummy2"	TokenNameStringLiteral	dummy2
,	TokenNameCOMMA	
m2	TokenNameIdentifier	 m2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m2	TokenNameIdentifier	 m2
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
Mapper	TokenNameIdentifier	 Mapper
m3	TokenNameIdentifier	 m3
=	TokenNameEQUAL	
new	TokenNamenew	
Mapper	TokenNameIdentifier	 Mapper
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
"dummy3"	TokenNameStringLiteral	dummy3
,	TokenNameCOMMA	
m3	TokenNameIdentifier	 m3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m3	TokenNameIdentifier	 m3
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
m1	TokenNameIdentifier	 m1
.	TokenNameDOT	
getImplementation	TokenNameIdentifier	 get Implementation
(	TokenNameLPAREN	
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
// (which holds a glob mapper from "*.java" to "*.class" 	TokenNameCOMMENT_LINE	(which holds a glob mapper from "*.java" to "*.class" 
m1	TokenNameIdentifier	 m1
=	TokenNameEQUAL	
new	TokenNamenew	
Mapper	TokenNameIdentifier	 Mapper
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
"dummy1"	TokenNameStringLiteral	dummy1
,	TokenNameCOMMA	
m1	TokenNameIdentifier	 m1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m1	TokenNameIdentifier	 m1
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
m2	TokenNameIdentifier	 m2
=	TokenNameEQUAL	
new	TokenNamenew	
Mapper	TokenNameIdentifier	 Mapper
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
"dummy2"	TokenNameStringLiteral	dummy2
,	TokenNameCOMMA	
m2	TokenNameIdentifier	 m2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m2	TokenNameIdentifier	 m2
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
m3	TokenNameIdentifier	 m3
=	TokenNameEQUAL	
new	TokenNamenew	
Mapper	TokenNameIdentifier	 Mapper
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
"dummy3"	TokenNameStringLiteral	dummy3
,	TokenNameCOMMA	
m3	TokenNameIdentifier	 m3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Mapper	TokenNameIdentifier	 Mapper
.	TokenNameDOT	
MapperType	TokenNameIdentifier	 Mapper Type
mt	TokenNameIdentifier	 mt
=	TokenNameEQUAL	
new	TokenNamenew	
Mapper	TokenNameIdentifier	 Mapper
.	TokenNameDOT	
MapperType	TokenNameIdentifier	 Mapper Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mt	TokenNameIdentifier	 mt
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"glob"	TokenNameStringLiteral	glob
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m3	TokenNameIdentifier	 m3
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
mt	TokenNameIdentifier	 mt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m3	TokenNameIdentifier	 m3
.	TokenNameDOT	
setFrom	TokenNameIdentifier	 set From
(	TokenNameLPAREN	
"*.java"	TokenNameStringLiteral	*.java
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m3	TokenNameIdentifier	 m3
.	TokenNameDOT	
setTo	TokenNameIdentifier	 set To
(	TokenNameLPAREN	
"*.class"	TokenNameStringLiteral	*.class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileNameMapper	TokenNameIdentifier	 File Name Mapper
fmm	TokenNameIdentifier	 fmm
=	TokenNameEQUAL	
m1	TokenNameIdentifier	 m1
.	TokenNameDOT	
getImplementation	TokenNameIdentifier	 get Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"should be glob"	TokenNameStringLiteral	should be glob
,	TokenNameCOMMA	
fmm	TokenNameIdentifier	 fmm
instanceof	TokenNameinstanceof	
GlobPatternMapper	TokenNameIdentifier	 Glob Pattern Mapper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
fmm	TokenNameIdentifier	 fmm
.	TokenNameDOT	
mapFileName	TokenNameIdentifier	 map File Name
(	TokenNameLPAREN	
"a.java"	TokenNameStringLiteral	a.java
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"a.java should match"	TokenNameStringLiteral	a.java should match
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"a.class"	TokenNameStringLiteral	a.class
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNested	TokenNameIdentifier	 test Nested
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Mapper	TokenNameIdentifier	 Mapper
mapper1	TokenNameIdentifier	 mapper1
=	TokenNameEQUAL	
new	TokenNamenew	
Mapper	TokenNameIdentifier	 Mapper
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Mapper	TokenNameIdentifier	 Mapper
.	TokenNameDOT	
MapperType	TokenNameIdentifier	 Mapper Type
mt	TokenNameIdentifier	 mt
=	TokenNameEQUAL	
new	TokenNamenew	
Mapper	TokenNameIdentifier	 Mapper
.	TokenNameDOT	
MapperType	TokenNameIdentifier	 Mapper Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mt	TokenNameIdentifier	 mt
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"glob"	TokenNameStringLiteral	glob
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mapper1	TokenNameIdentifier	 mapper1
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
mt	TokenNameIdentifier	 mt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mapper1	TokenNameIdentifier	 mapper1
.	TokenNameDOT	
setFrom	TokenNameIdentifier	 set From
(	TokenNameLPAREN	
"from*"	TokenNameStringLiteral	from*
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mapper1	TokenNameIdentifier	 mapper1
.	TokenNameDOT	
setTo	TokenNameIdentifier	 set To
(	TokenNameLPAREN	
"to*"	TokenNameStringLiteral	to*
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//mix element types 	TokenNameCOMMENT_LINE	mix element types 
FileNameMapper	TokenNameIdentifier	 File Name Mapper
mapper2	TokenNameIdentifier	 mapper2
=	TokenNameEQUAL	
new	TokenNamenew	
FlatFileNameMapper	TokenNameIdentifier	 Flat File Name Mapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileNameMapper	TokenNameIdentifier	 File Name Mapper
mapper3	TokenNameIdentifier	 mapper3
=	TokenNameEQUAL	
new	TokenNamenew	
MergingMapper	TokenNameIdentifier	 Merging Mapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mapper3	TokenNameIdentifier	 mapper3
.	TokenNameDOT	
setTo	TokenNameIdentifier	 set To
(	TokenNameLPAREN	
"mergefile"	TokenNameStringLiteral	mergefile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Mapper	TokenNameIdentifier	 Mapper
container	TokenNameIdentifier	 container
=	TokenNameEQUAL	
new	TokenNamenew	
Mapper	TokenNameIdentifier	 Mapper
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
container	TokenNameIdentifier	 container
.	TokenNameDOT	
addConfiguredMapper	TokenNameIdentifier	 add Configured Mapper
(	TokenNameLPAREN	
mapper1	TokenNameIdentifier	 mapper1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
container	TokenNameIdentifier	 container
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mapper2	TokenNameIdentifier	 mapper2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
container	TokenNameIdentifier	 container
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mapper3	TokenNameIdentifier	 mapper3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileNameMapper	TokenNameIdentifier	 File Name Mapper
fileNameMapper	TokenNameIdentifier	 file Name Mapper
=	TokenNameEQUAL	
container	TokenNameIdentifier	 container
.	TokenNameDOT	
getImplementation	TokenNameIdentifier	 get Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
targets	TokenNameIdentifier	 targets
=	TokenNameEQUAL	
fileNameMapper	TokenNameIdentifier	 file Name Mapper
.	TokenNameDOT	
mapFileName	TokenNameIdentifier	 map File Name
(	TokenNameLPAREN	
"fromfilename"	TokenNameStringLiteral	fromfilename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"no filenames mapped"	TokenNameStringLiteral	no filenames mapped
,	TokenNameCOMMA	
targets	TokenNameIdentifier	 targets
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"wrong number of filenames mapped"	TokenNameStringLiteral	wrong number of filenames mapped
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
targets	TokenNameIdentifier	 targets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
targets	TokenNameIdentifier	 targets
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"cannot find expected target "tofilename""	TokenNameStringLiteral	cannot find expected target "tofilename"
,	TokenNameCOMMA	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"tofilename"	TokenNameStringLiteral	tofilename
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"cannot find expected target "fromfilename""	TokenNameStringLiteral	cannot find expected target "fromfilename"
,	TokenNameCOMMA	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"fromfilename"	TokenNameStringLiteral	fromfilename
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"cannot find expected target "mergefile""	TokenNameStringLiteral	cannot find expected target "mergefile"
,	TokenNameCOMMA	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"mergefile"	TokenNameStringLiteral	mergefile
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testChained	TokenNameIdentifier	 test Chained
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// a --> b --> c --- def 	TokenNameCOMMENT_LINE	a --> b --> c --- def 
// \-- ghi 	TokenNameCOMMENT_LINE	\-- ghi 
FileNameMapper	TokenNameIdentifier	 File Name Mapper
mapperAB	TokenNameIdentifier	 mapper AB
=	TokenNameEQUAL	
new	TokenNamenew	
GlobPatternMapper	TokenNameIdentifier	 Glob Pattern Mapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mapperAB	TokenNameIdentifier	 mapper AB
.	TokenNameDOT	
setFrom	TokenNameIdentifier	 set From
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mapperAB	TokenNameIdentifier	 mapper AB
.	TokenNameDOT	
setTo	TokenNameIdentifier	 set To
(	TokenNameLPAREN	
"b"	TokenNameStringLiteral	b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileNameMapper	TokenNameIdentifier	 File Name Mapper
mapperBC	TokenNameIdentifier	 mapper BC
=	TokenNameEQUAL	
new	TokenNamenew	
GlobPatternMapper	TokenNameIdentifier	 Glob Pattern Mapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mapperBC	TokenNameIdentifier	 mapper BC
.	TokenNameDOT	
setFrom	TokenNameIdentifier	 set From
(	TokenNameLPAREN	
"b"	TokenNameStringLiteral	b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mapperBC	TokenNameIdentifier	 mapper BC
.	TokenNameDOT	
setTo	TokenNameIdentifier	 set To
(	TokenNameLPAREN	
"c"	TokenNameStringLiteral	c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//implicit composite 	TokenNameCOMMENT_LINE	implicit composite 
Mapper	TokenNameIdentifier	 Mapper
mapperCX	TokenNameIdentifier	 mapper CX
=	TokenNameEQUAL	
new	TokenNamenew	
Mapper	TokenNameIdentifier	 Mapper
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileNameMapper	TokenNameIdentifier	 File Name Mapper
mapperDEF	TokenNameIdentifier	 mapper DEF
=	TokenNameEQUAL	
new	TokenNamenew	
GlobPatternMapper	TokenNameIdentifier	 Glob Pattern Mapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mapperDEF	TokenNameIdentifier	 mapper DEF
.	TokenNameDOT	
setFrom	TokenNameIdentifier	 set From
(	TokenNameLPAREN	
"c"	TokenNameStringLiteral	c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mapperDEF	TokenNameIdentifier	 mapper DEF
.	TokenNameDOT	
setTo	TokenNameIdentifier	 set To
(	TokenNameLPAREN	
"def"	TokenNameStringLiteral	def
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileNameMapper	TokenNameIdentifier	 File Name Mapper
mapperGHI	TokenNameIdentifier	 mapper GHI
=	TokenNameEQUAL	
new	TokenNamenew	
GlobPatternMapper	TokenNameIdentifier	 Glob Pattern Mapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mapperGHI	TokenNameIdentifier	 mapper GHI
.	TokenNameDOT	
setFrom	TokenNameIdentifier	 set From
(	TokenNameLPAREN	
"c"	TokenNameStringLiteral	c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mapperGHI	TokenNameIdentifier	 mapper GHI
.	TokenNameDOT	
setTo	TokenNameIdentifier	 set To
(	TokenNameLPAREN	
"ghi"	TokenNameStringLiteral	ghi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mapperCX	TokenNameIdentifier	 mapper CX
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mapperDEF	TokenNameIdentifier	 mapper DEF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mapperCX	TokenNameIdentifier	 mapper CX
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mapperGHI	TokenNameIdentifier	 mapper GHI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Mapper	TokenNameIdentifier	 Mapper
chained	TokenNameIdentifier	 chained
=	TokenNameEQUAL	
new	TokenNamenew	
Mapper	TokenNameIdentifier	 Mapper
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
chained	TokenNameIdentifier	 chained
.	TokenNameDOT	
setClassname	TokenNameIdentifier	 set Classname
(	TokenNameLPAREN	
ChainedMapper	TokenNameIdentifier	 Chained Mapper
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
chained	TokenNameIdentifier	 chained
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mapperAB	TokenNameIdentifier	 mapper AB
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
chained	TokenNameIdentifier	 chained
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mapperBC	TokenNameIdentifier	 mapper BC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
chained	TokenNameIdentifier	 chained
.	TokenNameDOT	
addConfiguredMapper	TokenNameIdentifier	 add Configured Mapper
(	TokenNameLPAREN	
mapperCX	TokenNameIdentifier	 mapper CX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileNameMapper	TokenNameIdentifier	 File Name Mapper
fileNameMapper	TokenNameIdentifier	 file Name Mapper
=	TokenNameEQUAL	
chained	TokenNameIdentifier	 chained
.	TokenNameDOT	
getImplementation	TokenNameIdentifier	 get Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
targets	TokenNameIdentifier	 targets
=	TokenNameEQUAL	
fileNameMapper	TokenNameIdentifier	 file Name Mapper
.	TokenNameDOT	
mapFileName	TokenNameIdentifier	 map File Name
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"no filenames mapped"	TokenNameStringLiteral	no filenames mapped
,	TokenNameCOMMA	
targets	TokenNameIdentifier	 targets
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"wrong number of filenames mapped"	TokenNameStringLiteral	wrong number of filenames mapped
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
targets	TokenNameIdentifier	 targets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
targets	TokenNameIdentifier	 targets
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"cannot find expected target "def""	TokenNameStringLiteral	cannot find expected target "def"
,	TokenNameCOMMA	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"def"	TokenNameStringLiteral	def
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"cannot find expected target "ghi""	TokenNameStringLiteral	cannot find expected target "ghi"
,	TokenNameCOMMA	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"ghi"	TokenNameStringLiteral	ghi
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCopyTaskWithTwoFilesets	TokenNameIdentifier	 test Copy Task With Two Filesets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TaskdefForCopyTest	TokenNameIdentifier	 Taskdef For Copy Test
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
TaskdefForCopyTest	TokenNameIdentifier	 Taskdef For Copy Test
(	TokenNameLPAREN	
"test1"	TokenNameStringLiteral	test1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
test1	TokenNameIdentifier	 test1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
TaskdefForCopyTest	TokenNameIdentifier	 Taskdef For Copy Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
TaskdefForCopyTest	TokenNameIdentifier	 Taskdef For Copy Test
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
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/types/mapper.xml"	TokenNameStringLiteral	src/etc/testcases/types/mapper.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"cleanup"	TokenNameStringLiteral	cleanup
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test1	TokenNameIdentifier	 test1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"test1"	TokenNameStringLiteral	test1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
