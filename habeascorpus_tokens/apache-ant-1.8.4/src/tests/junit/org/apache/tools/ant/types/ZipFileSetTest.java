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
/** * JUnit 3 testcases for org.apache.tools.ant.types.ZipFileSet. * * <p>This doesn't actually test much, mainly reference handling. * */	TokenNameCOMMENT_JAVADOC	 JUnit 3 testcases for org.apache.tools.ant.types.ZipFileSet. * <p>This doesn't actually test much, mainly reference handling. 
public	TokenNamepublic	
class	TokenNameclass	
ZipFileSetTest	TokenNameIdentifier	 Zip File Set Test
extends	TokenNameextends	
AbstractFileSetTest	TokenNameIdentifier	 Abstract File Set Test
{	TokenNameLBRACE	
public	TokenNamepublic	
ZipFileSetTest	TokenNameIdentifier	 Zip File Set Test
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
protected	TokenNameprotected	
AbstractFileSet	TokenNameIdentifier	 Abstract File Set
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ZipFileSet	TokenNameIdentifier	 Zip File Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
testAttributes	TokenNameIdentifier	 test Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ZipFileSet	TokenNameIdentifier	 Zip File Set
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ZipFileSet	TokenNameIdentifier	 Zip File Set
)	TokenNameRPAREN	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//check that dir and src are incompatible 	TokenNameCOMMENT_LINE	check that dir and src are incompatible 
f	TokenNameIdentifier	 f
.	TokenNameDOT	
setSrc	TokenNameIdentifier	 set Src
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"example.zip"	TokenNameStringLiteral	example.zip
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
setDir	TokenNameIdentifier	 set Dir
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"examples"	TokenNameStringLiteral	examples
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"can add dir to "	TokenNameStringLiteral	can add dir to 
+	TokenNamePLUS	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getDataTypeName	TokenNameIdentifier	 get Data Type Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" when a src is already present"	TokenNameStringLiteral	 when a src is already present
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
"Cannot set both dir and src attributes"	TokenNameStringLiteral	Cannot set both dir and src attributes
,	TokenNameCOMMA	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ZipFileSet	TokenNameIdentifier	 Zip File Set
)	TokenNameRPAREN	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//check that dir and src are incompatible 	TokenNameCOMMENT_LINE	check that dir and src are incompatible 
f	TokenNameIdentifier	 f
.	TokenNameDOT	
setDir	TokenNameIdentifier	 set Dir
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"examples"	TokenNameStringLiteral	examples
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
setSrc	TokenNameIdentifier	 set Src
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"example.zip"	TokenNameStringLiteral	example.zip
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"can add src to "	TokenNameStringLiteral	can add src to 
+	TokenNamePLUS	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getDataTypeName	TokenNameIdentifier	 get Data Type Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" when a dir is already present"	TokenNameStringLiteral	 when a dir is already present
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
"Cannot set both dir and src attributes"	TokenNameStringLiteral	Cannot set both dir and src attributes
,	TokenNameCOMMA	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//check that fullpath and prefix are incompatible 	TokenNameCOMMENT_LINE	check that fullpath and prefix are incompatible 
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ZipFileSet	TokenNameIdentifier	 Zip File Set
)	TokenNameRPAREN	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
setSrc	TokenNameIdentifier	 set Src
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"example.zip"	TokenNameStringLiteral	example.zip
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
setPrefix	TokenNameIdentifier	 set Prefix
(	TokenNameLPAREN	
"/examples"	TokenNameStringLiteral	/examples
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
setFullpath	TokenNameIdentifier	 set Fullpath
(	TokenNameLPAREN	
"/doc/manual/index.html"	TokenNameStringLiteral	/doc/manual/index.html
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Can add fullpath to "	TokenNameStringLiteral	Can add fullpath to 
+	TokenNamePLUS	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getDataTypeName	TokenNameIdentifier	 get Data Type Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" when a prefix is already present"	TokenNameStringLiteral	 when a prefix is already present
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
"Cannot set both fullpath and prefix attributes"	TokenNameStringLiteral	Cannot set both fullpath and prefix attributes
,	TokenNameCOMMA	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ZipFileSet	TokenNameIdentifier	 Zip File Set
)	TokenNameRPAREN	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
setSrc	TokenNameIdentifier	 set Src
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"example.zip"	TokenNameStringLiteral	example.zip
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
setFullpath	TokenNameIdentifier	 set Fullpath
(	TokenNameLPAREN	
"/doc/manual/index.html"	TokenNameStringLiteral	/doc/manual/index.html
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
setPrefix	TokenNameIdentifier	 set Prefix
(	TokenNameLPAREN	
"/examples"	TokenNameStringLiteral	/examples
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Can add prefix to "	TokenNameStringLiteral	Can add prefix to 
+	TokenNamePLUS	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getDataTypeName	TokenNameIdentifier	 get Data Type Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" when a fullpath is already present"	TokenNameStringLiteral	 when a fullpath is already present
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
"Cannot set both fullpath and prefix attributes"	TokenNameStringLiteral	Cannot set both fullpath and prefix attributes
,	TokenNameCOMMA	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// check that reference zipfilesets cannot have specific attributes 	TokenNameCOMMENT_LINE	check that reference zipfilesets cannot have specific attributes 
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ZipFileSet	TokenNameIdentifier	 Zip File Set
)	TokenNameRPAREN	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
new	TokenNamenew	
Reference	TokenNameIdentifier	 Reference
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
setSrc	TokenNameIdentifier	 set Src
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"example.zip"	TokenNameStringLiteral	example.zip
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Can add src to "	TokenNameStringLiteral	Can add src to 
+	TokenNamePLUS	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getDataTypeName	TokenNameIdentifier	 get Data Type Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" when a refid is already present"	TokenNameStringLiteral	 when a refid is already present
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
"You must not specify more than one "	TokenNameStringLiteral	You must not specify more than one 
+	TokenNamePLUS	
"attribute when using refid"	TokenNameStringLiteral	attribute when using refid
,	TokenNameCOMMA	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// check that a reference zipfileset gets the same attributes as the original 	TokenNameCOMMENT_LINE	check that a reference zipfileset gets the same attributes as the original 
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ZipFileSet	TokenNameIdentifier	 Zip File Set
)	TokenNameRPAREN	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
setSrc	TokenNameIdentifier	 set Src
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"example.zip"	TokenNameStringLiteral	example.zip
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
setPrefix	TokenNameIdentifier	 set Prefix
(	TokenNameLPAREN	
"/examples"	TokenNameStringLiteral	/examples
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
setFileMode	TokenNameIdentifier	 set File Mode
(	TokenNameLPAREN	
"600"	TokenNameStringLiteral	600
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
setDirMode	TokenNameIdentifier	 set Dir Mode
(	TokenNameLPAREN	
"530"	TokenNameStringLiteral	530
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ZipFileSet	TokenNameIdentifier	 Zip File Set
zid	TokenNameIdentifier	 zid
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ZipFileSet	TokenNameIdentifier	 Zip File Set
)	TokenNameRPAREN	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
zid	TokenNameIdentifier	 zid
.	TokenNameDOT	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
new	TokenNamenew	
Reference	TokenNameIdentifier	 Reference
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"src attribute copied by copy constructor"	TokenNameStringLiteral	src attribute copied by copy constructor
,	TokenNameCOMMA	
zid	TokenNameIdentifier	 zid
.	TokenNameDOT	
getSrc	TokenNameIdentifier	 get Src
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getSrc	TokenNameIdentifier	 get Src
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"prefix attribute copied by copy constructor"	TokenNameStringLiteral	prefix attribute copied by copy constructor
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
zid	TokenNameIdentifier	 zid
.	TokenNameDOT	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"file mode attribute copied by copy constructor"	TokenNameStringLiteral	file mode attribute copied by copy constructor
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getFileMode	TokenNameIdentifier	 get File Mode
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
zid	TokenNameIdentifier	 zid
.	TokenNameDOT	
getFileMode	TokenNameIdentifier	 get File Mode
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"dir mode attribute copied by copy constructor"	TokenNameStringLiteral	dir mode attribute copied by copy constructor
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getDirMode	TokenNameIdentifier	 get Dir Mode
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
zid	TokenNameIdentifier	 zid
.	TokenNameDOT	
getDirMode	TokenNameIdentifier	 get Dir Mode
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
