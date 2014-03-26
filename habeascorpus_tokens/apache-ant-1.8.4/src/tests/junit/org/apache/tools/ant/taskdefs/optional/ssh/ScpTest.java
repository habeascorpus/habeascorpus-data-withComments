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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
ssh	TokenNameIdentifier	 ssh
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
condition	TokenNameIdentifier	 condition
.	TokenNameDOT	
FilesMatch	TokenNameIdentifier	 Files Match
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
FileSet	TokenNameIdentifier	 File Set
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
selectors	TokenNameIdentifier	 selectors
.	TokenNameDOT	
FilenameSelector	TokenNameIdentifier	 Filename Selector
;	TokenNameSEMICOLON	
/** * This is a unit test for the Scp task in Ant. It must be * configured with command line options in order for it to work. * Here are the options: * * scp.tmp This is a local path to a temporary * directory for this task to use. * scp.host This is the remote location of the form: * "user:password@host:/path/to/directory" * scp.port The port of the listening SSH service. * Defaults to 22. (optional) * scp.known.hosts The file containing the public keys of known * hosts. Must be a SSH2 version file, but * supports RSA and DSA keys. If it is not present * this task setTrust() to true. (optional) */	TokenNameCOMMENT_JAVADOC	 This is a unit test for the Scp task in Ant. It must be configured with command line options in order for it to work. Here are the options: * scp.tmp This is a local path to a temporary directory for this task to use. scp.host This is the remote location of the form: "user:password@host:/path/to/directory" scp.port The port of the listening SSH service. Defaults to 22. (optional) scp.known.hosts The file containing the public keys of known hosts. Must be a SSH2 version file, but supports RSA and DSA keys. If it is not present this task setTrust() to true. (optional) 
public	TokenNamepublic	
class	TokenNameclass	
ScpTest	TokenNameIdentifier	 Scp Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
tempDir	TokenNameIdentifier	 temp Dir
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
sshHostUri	TokenNameIdentifier	 ssh Host Uri
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"scp.host"	TokenNameStringLiteral	scp.host
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
port	TokenNameIdentifier	 port
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"scp.port"	TokenNameStringLiteral	scp.port
,	TokenNameCOMMA	
"22"	TokenNameStringLiteral	22
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
knownHosts	TokenNameIdentifier	 known Hosts
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"scp.known.hosts"	TokenNameStringLiteral	scp.known.hosts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
cleanUpList	TokenNameIdentifier	 clean Up List
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ScpTest	TokenNameIdentifier	 Scp Test
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
testname	TokenNameIdentifier	 testname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
testname	TokenNameIdentifier	 testname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"scp.tmp"	TokenNameStringLiteral	scp.tmp
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tempDir	TokenNameIdentifier	 temp Dir
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"scp.tmp"	TokenNameStringLiteral	scp.tmp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cleanUpList	TokenNameIdentifier	 clean Up List
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
cleanUpList	TokenNameIdentifier	 clean Up List
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSingleFileUploadAndDownload	TokenNameIdentifier	 test Single File Upload And Download
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"system property scp.tmp must be set"	TokenNameStringLiteral	system property scp.tmp must be set
,	TokenNameCOMMA	
tempDir	TokenNameIdentifier	 temp Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
uploadFile	TokenNameIdentifier	 upload File
=	TokenNameEQUAL	
createTemporaryFile	TokenNameIdentifier	 create Temporary File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// upload 	TokenNameCOMMENT_LINE	upload 
Scp	TokenNameIdentifier	 Scp
scpTask	TokenNameIdentifier	 scp Task
=	TokenNameEQUAL	
createTask	TokenNameIdentifier	 create Task
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scpTask	TokenNameIdentifier	 scp Task
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
uploadFile	TokenNameIdentifier	 upload File
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scpTask	TokenNameIdentifier	 scp Task
.	TokenNameDOT	
setTodir	TokenNameIdentifier	 set Todir
(	TokenNameLPAREN	
sshHostUri	TokenNameIdentifier	 ssh Host Uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scpTask	TokenNameIdentifier	 scp Task
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
testFile	TokenNameIdentifier	 test File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
tempDir	TokenNameIdentifier	 temp Dir
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
"download-testSingleFileUploadAndDownload.test"	TokenNameStringLiteral	download-testSingleFileUploadAndDownload.test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addCleanup	TokenNameIdentifier	 add Cleanup
(	TokenNameLPAREN	
testFile	TokenNameIdentifier	 test File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Assert that the testFile does not exist."	TokenNameStringLiteral	Assert that the testFile does not exist.
,	TokenNameCOMMA	
!	TokenNameNOT	
testFile	TokenNameIdentifier	 test File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// download 	TokenNameCOMMENT_LINE	download 
scpTask	TokenNameIdentifier	 scp Task
=	TokenNameEQUAL	
createTask	TokenNameIdentifier	 create Task
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scpTask	TokenNameIdentifier	 scp Task
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
sshHostUri	TokenNameIdentifier	 ssh Host Uri
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
+	TokenNamePLUS	
uploadFile	TokenNameIdentifier	 upload File
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scpTask	TokenNameIdentifier	 scp Task
.	TokenNameDOT	
setTodir	TokenNameIdentifier	 set Todir
(	TokenNameLPAREN	
testFile	TokenNameIdentifier	 test File
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scpTask	TokenNameIdentifier	 scp Task
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Assert that the testFile exists."	TokenNameStringLiteral	Assert that the testFile exists.
,	TokenNameCOMMA	
testFile	TokenNameIdentifier	 test File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compareFiles	TokenNameIdentifier	 compare Files
(	TokenNameLPAREN	
uploadFile	TokenNameIdentifier	 upload File
,	TokenNameCOMMA	
testFile	TokenNameIdentifier	 test File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMultiUploadAndDownload	TokenNameIdentifier	 test Multi Upload And Download
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"system property scp.tmp must be set"	TokenNameStringLiteral	system property scp.tmp must be set
,	TokenNameCOMMA	
tempDir	TokenNameIdentifier	 temp Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
uploadList	TokenNameIdentifier	 upload List
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
uploadList	TokenNameIdentifier	 upload List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
createTemporaryFile	TokenNameIdentifier	 create Temporary File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Scp	TokenNameIdentifier	 Scp
scp	TokenNameIdentifier	 scp
=	TokenNameEQUAL	
createTask	TokenNameIdentifier	 create Task
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FilenameSelector	TokenNameIdentifier	 Filename Selector
selector	TokenNameIdentifier	 selector
=	TokenNameEQUAL	
new	TokenNamenew	
FilenameSelector	TokenNameIdentifier	 Filename Selector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
selector	TokenNameIdentifier	 selector
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
"scp*"	TokenNameStringLiteral	scp*
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileSet	TokenNameIdentifier	 File Set
fileset	TokenNameIdentifier	 fileset
=	TokenNameEQUAL	
new	TokenNamenew	
FileSet	TokenNameIdentifier	 File Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fileset	TokenNameIdentifier	 fileset
.	TokenNameDOT	
setDir	TokenNameIdentifier	 set Dir
(	TokenNameLPAREN	
tempDir	TokenNameIdentifier	 temp Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fileset	TokenNameIdentifier	 fileset
.	TokenNameDOT	
addFilename	TokenNameIdentifier	 add Filename
(	TokenNameLPAREN	
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scp	TokenNameIdentifier	 scp
.	TokenNameDOT	
addFileset	TokenNameIdentifier	 add Fileset
(	TokenNameLPAREN	
fileset	TokenNameIdentifier	 fileset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scp	TokenNameIdentifier	 scp
.	TokenNameDOT	
setTodir	TokenNameIdentifier	 set Todir
(	TokenNameLPAREN	
sshHostUri	TokenNameIdentifier	 ssh Host Uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scp	TokenNameIdentifier	 scp
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
multi	TokenNameIdentifier	 multi
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
tempDir	TokenNameIdentifier	 temp Dir
,	TokenNameCOMMA	
"multi"	TokenNameStringLiteral	multi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
multi	TokenNameIdentifier	 multi
.	TokenNameDOT	
mkdir	TokenNameIdentifier	 mkdir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addCleanup	TokenNameIdentifier	 add Cleanup
(	TokenNameLPAREN	
multi	TokenNameIdentifier	 multi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Scp	TokenNameIdentifier	 Scp
scp2	TokenNameIdentifier	 scp2
=	TokenNameEQUAL	
createTask	TokenNameIdentifier	 create Task
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scp2	TokenNameIdentifier	 scp2
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
sshHostUri	TokenNameIdentifier	 ssh Host Uri
+	TokenNamePLUS	
"/scp*"	TokenNameStringLiteral	/scp*
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scp2	TokenNameIdentifier	 scp2
.	TokenNameDOT	
setTodir	TokenNameIdentifier	 set Todir
(	TokenNameLPAREN	
multi	TokenNameIdentifier	 multi
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scp2	TokenNameIdentifier	 scp2
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FilesMatch	TokenNameIdentifier	 Files Match
match	TokenNameIdentifier	 match
=	TokenNameEQUAL	
new	TokenNamenew	
FilesMatch	TokenNameIdentifier	 Files Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
uploadList	TokenNameIdentifier	 upload List
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
setFile1	TokenNameIdentifier	 set File1
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
f2	TokenNameIdentifier	 f2
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
multi	TokenNameIdentifier	 multi
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
setFile2	TokenNameIdentifier	 set File2
(	TokenNameLPAREN	
f2	TokenNameIdentifier	 f2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Assert file '"	TokenNameStringLiteral	Assert file '
+	TokenNamePLUS	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"' and file '"	TokenNameStringLiteral	' and file '
+	TokenNamePLUS	
f2	TokenNameIdentifier	 f2
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
,	TokenNameCOMMA	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testRemoteToDir	TokenNameIdentifier	 test Remote To Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Scp	TokenNameIdentifier	 Scp
scpTask	TokenNameIdentifier	 scp Task
=	TokenNameEQUAL	
createTask	TokenNameIdentifier	 create Task
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// first try an invalid URI 	TokenNameCOMMENT_LINE	first try an invalid URI 
try	TokenNametry	
{	TokenNameLBRACE	
scpTask	TokenNameIdentifier	 scp Task
.	TokenNameDOT	
setRemoteTodir	TokenNameIdentifier	 set Remote Todir
(	TokenNameLPAREN	
"host:/a/path/without/an/at"	TokenNameStringLiteral	host:/a/path/without/an/at
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Expected a BuildException to be thrown due to invalid"	TokenNameStringLiteral	Expected a BuildException to be thrown due to invalid
+	TokenNamePLUS	
" remoteToDir"	TokenNameStringLiteral	 remoteToDir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// expected 	TokenNameCOMMENT_LINE	expected 
}	TokenNameRBRACE	
// And this one should work 	TokenNameCOMMENT_LINE	And this one should work 
scpTask	TokenNameIdentifier	 scp Task
.	TokenNameDOT	
setRemoteTodir	TokenNameIdentifier	 set Remote Todir
(	TokenNameLPAREN	
"user:password@host:/a/path/with/an/at"	TokenNameStringLiteral	user:password@host:/a/path/with/an/at
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// no exception 	TokenNameCOMMENT_LINE	no exception 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addCleanup	TokenNameIdentifier	 add Cleanup
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cleanUpList	TokenNameIdentifier	 clean Up List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
compareFiles	TokenNameIdentifier	 compare Files
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
dest	TokenNameIdentifier	 dest
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FilesMatch	TokenNameIdentifier	 Files Match
match	TokenNameIdentifier	 match
=	TokenNameEQUAL	
new	TokenNamenew	
FilesMatch	TokenNameIdentifier	 Files Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
setFile1	TokenNameIdentifier	 set File1
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
setFile2	TokenNameIdentifier	 set File2
(	TokenNameLPAREN	
dest	TokenNameIdentifier	 dest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Assert files are equal."	TokenNameStringLiteral	Assert files are equal.
,	TokenNameCOMMA	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
createTemporaryFile	TokenNameIdentifier	 create Temporary File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
uploadFile	TokenNameIdentifier	 upload File
;	TokenNameSEMICOLON	
uploadFile	TokenNameIdentifier	 upload File
=	TokenNameEQUAL	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
createTempFile	TokenNameIdentifier	 create Temp File
(	TokenNameLPAREN	
"scp"	TokenNameStringLiteral	scp
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
tempDir	TokenNameIdentifier	 temp Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileWriter	TokenNameIdentifier	 File Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
FileWriter	TokenNameIdentifier	 File Writer
(	TokenNameLPAREN	
uploadFile	TokenNameIdentifier	 upload File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"Can you hear me now? "	TokenNameStringLiteral	Can you hear me now? 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addCleanup	TokenNameIdentifier	 add Cleanup
(	TokenNameLPAREN	
uploadFile	TokenNameIdentifier	 upload File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
uploadFile	TokenNameIdentifier	 upload File
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Scp	TokenNameIdentifier	 Scp
createTask	TokenNameIdentifier	 create Task
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Scp	TokenNameIdentifier	 Scp
scp	TokenNameIdentifier	 scp
=	TokenNameEQUAL	
new	TokenNamenew	
Scp	TokenNameIdentifier	 Scp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
Project	TokenNameIdentifier	 Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scp	TokenNameIdentifier	 scp
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
knownHosts	TokenNameIdentifier	 known Hosts
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scp	TokenNameIdentifier	 scp
.	TokenNameDOT	
setKnownhosts	TokenNameIdentifier	 set Knownhosts
(	TokenNameLPAREN	
knownHosts	TokenNameIdentifier	 known Hosts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
scp	TokenNameIdentifier	 scp
.	TokenNameDOT	
setTrust	TokenNameIdentifier	 set Trust
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
scp	TokenNameIdentifier	 scp
.	TokenNameDOT	
setPort	TokenNameIdentifier	 set Port
(	TokenNameLPAREN	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
scp	TokenNameIdentifier	 scp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
