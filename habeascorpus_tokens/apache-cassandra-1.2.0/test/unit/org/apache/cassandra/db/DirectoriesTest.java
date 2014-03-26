/** * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
AfterClass	TokenNameIdentifier	 After Class
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
BeforeClass	TokenNameIdentifier	 Before Class
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
;	TokenNameSEMICOLON	
import	TokenNameimport	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertEquals	TokenNameIdentifier	 assert Equals
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
compaction	TokenNameIdentifier	 compaction
.	TokenNameDOT	
LeveledManifest	TokenNameIdentifier	 Leveled Manifest
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
FileUtils	TokenNameIdentifier	 File Utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
DirectoriesTest	TokenNameIdentifier	 Directories Test
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
File	TokenNameIdentifier	 File
tempDataDir	TokenNameIdentifier	 temp Data Dir
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
KS	TokenNameIdentifier	 KS
=	TokenNameEQUAL	
"ks"	TokenNameStringLiteral	ks
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
CFS	TokenNameIdentifier	 CFS
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"cf1"	TokenNameStringLiteral	cf1
,	TokenNameCOMMA	
"ks"	TokenNameStringLiteral	ks
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
File	TokenNameIdentifier	 File
>>	TokenNameRIGHT_SHIFT	
files	TokenNameIdentifier	 files
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
File	TokenNameIdentifier	 File
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
BeforeClass	TokenNameIdentifier	 Before Class
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
beforeClass	TokenNameIdentifier	 before Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
tempDataDir	TokenNameIdentifier	 temp Data Dir
=	TokenNameEQUAL	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
createTempFile	TokenNameIdentifier	 create Temp File
(	TokenNameLPAREN	
"cassandra"	TokenNameStringLiteral	cassandra
,	TokenNameCOMMA	
"unittest"	TokenNameStringLiteral	unittest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tempDataDir	TokenNameIdentifier	 temp Data Dir
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// hack to create a temp dir 	TokenNameCOMMENT_LINE	hack to create a temp dir 
tempDataDir	TokenNameIdentifier	 temp Data Dir
.	TokenNameDOT	
mkdir	TokenNameIdentifier	 mkdir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Directories	TokenNameIdentifier	 Directories
.	TokenNameDOT	
overrideDataDirectoriesForTest	TokenNameIdentifier	 override Data Directories For Test
(	TokenNameLPAREN	
tempDataDir	TokenNameIdentifier	 temp Data Dir
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create two fake data dir for tests, one using CF directories, one that do not. 	TokenNameCOMMENT_LINE	Create two fake data dir for tests, one using CF directories, one that do not. 
createTestFiles	TokenNameIdentifier	 create Test Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
AfterClass	TokenNameIdentifier	 After Class
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
afterClass	TokenNameIdentifier	 after Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Directories	TokenNameIdentifier	 Directories
.	TokenNameDOT	
resetDataDirectoriesAfterTest	TokenNameIdentifier	 reset Data Directories After Test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
deleteRecursive	TokenNameIdentifier	 delete Recursive
(	TokenNameLPAREN	
tempDataDir	TokenNameIdentifier	 temp Data Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
createTestFiles	TokenNameIdentifier	 create Test Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
cf	TokenNameIdentifier	 cf
:	TokenNameCOLON	
CFS	TokenNameIdentifier	 CFS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
File	TokenNameIdentifier	 File
>	TokenNameGREATER	
fs	TokenNameIdentifier	 fs
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
File	TokenNameIdentifier	 File
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
fs	TokenNameIdentifier	 fs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
cfDir	TokenNameIdentifier	 cf Dir
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
mkdirs	TokenNameIdentifier	 mkdirs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createFakeSSTable	TokenNameIdentifier	 create Fake SS Table
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
fs	TokenNameIdentifier	 fs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createFakeSSTable	TokenNameIdentifier	 create Fake SS Table
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
fs	TokenNameIdentifier	 fs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// leveled manifest 	TokenNameCOMMENT_LINE	leveled manifest 
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
cf	TokenNameIdentifier	 cf
+	TokenNamePLUS	
LeveledManifest	TokenNameIdentifier	 Leveled Manifest
.	TokenNameDOT	
EXTENSION	TokenNameIdentifier	 EXTENSION
)	TokenNameRPAREN	
.	TokenNameDOT	
createNewFile	TokenNameIdentifier	 create New File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
backupDir	TokenNameIdentifier	 backup Dir
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
Directories	TokenNameIdentifier	 Directories
.	TokenNameDOT	
BACKUPS_SUBDIR	TokenNameIdentifier	 BACKUPS  SUBDIR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
backupDir	TokenNameIdentifier	 backup Dir
.	TokenNameDOT	
mkdir	TokenNameIdentifier	 mkdir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createFakeSSTable	TokenNameIdentifier	 create Fake SS Table
(	TokenNameLPAREN	
backupDir	TokenNameIdentifier	 backup Dir
,	TokenNameCOMMA	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
fs	TokenNameIdentifier	 fs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
snapshotDir	TokenNameIdentifier	 snapshot Dir
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
Directories	TokenNameIdentifier	 Directories
.	TokenNameDOT	
SNAPSHOT_SUBDIR	TokenNameIdentifier	 SNAPSHOT  SUBDIR
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
"42"	TokenNameStringLiteral	42
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
snapshotDir	TokenNameIdentifier	 snapshot Dir
.	TokenNameDOT	
mkdirs	TokenNameIdentifier	 mkdirs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createFakeSSTable	TokenNameIdentifier	 create Fake SS Table
(	TokenNameLPAREN	
snapshotDir	TokenNameIdentifier	 snapshot Dir
,	TokenNameCOMMA	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
fs	TokenNameIdentifier	 fs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
createFakeSSTable	TokenNameIdentifier	 create Fake SS Table
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
int	TokenNameint	
gen	TokenNameIdentifier	 gen
,	TokenNameCOMMA	
boolean	TokenNameboolean	
temp	TokenNameIdentifier	 temp
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
File	TokenNameIdentifier	 File
>	TokenNameGREATER	
addTo	TokenNameIdentifier	 add To
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Descriptor	TokenNameIdentifier	 Descriptor
desc	TokenNameIdentifier	 desc
=	TokenNameEQUAL	
new	TokenNamenew	
Descriptor	TokenNameIdentifier	 Descriptor
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
KS	TokenNameIdentifier	 KS
,	TokenNameCOMMA	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
gen	TokenNameIdentifier	 gen
,	TokenNameCOMMA	
temp	TokenNameIdentifier	 temp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Component	TokenNameIdentifier	 Component
c	TokenNameIdentifier	 c
:	TokenNameCOLON	
new	TokenNamenew	
Component	TokenNameIdentifier	 Component
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Component	TokenNameIdentifier	 Component
.	TokenNameDOT	
DATA	TokenNameIdentifier	 DATA
,	TokenNameCOMMA	
Component	TokenNameIdentifier	 Component
.	TokenNameDOT	
PRIMARY_INDEX	TokenNameIdentifier	 PRIMARY  INDEX
,	TokenNameCOMMA	
Component	TokenNameIdentifier	 Component
.	TokenNameDOT	
FILTER	TokenNameIdentifier	 FILTER
}	TokenNameRBRACE	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
filenameFor	TokenNameIdentifier	 filename For
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
createNewFile	TokenNameIdentifier	 create New File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addTo	TokenNameIdentifier	 add To
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
File	TokenNameIdentifier	 File
cfDir	TokenNameIdentifier	 cf Dir
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
tempDataDir	TokenNameIdentifier	 temp Data Dir
,	TokenNameCOMMA	
KS	TokenNameIdentifier	 KS
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testStandardDirs	TokenNameIdentifier	 test Standard Dirs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
cf	TokenNameIdentifier	 cf
:	TokenNameCOLON	
CFS	TokenNameIdentifier	 CFS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Directories	TokenNameIdentifier	 Directories
directories	TokenNameIdentifier	 directories
=	TokenNameEQUAL	
Directories	TokenNameIdentifier	 Directories
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
KS	TokenNameIdentifier	 KS
,	TokenNameCOMMA	
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
cfDir	TokenNameIdentifier	 cf Dir
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
,	TokenNameCOMMA	
directories	TokenNameIdentifier	 directories
.	TokenNameDOT	
getDirectoryForNewSSTables	TokenNameIdentifier	 get Directory For New SS Tables
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Descriptor	TokenNameIdentifier	 Descriptor
desc	TokenNameIdentifier	 desc
=	TokenNameEQUAL	
new	TokenNamenew	
Descriptor	TokenNameIdentifier	 Descriptor
(	TokenNameLPAREN	
cfDir	TokenNameIdentifier	 cf Dir
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
,	TokenNameCOMMA	
KS	TokenNameIdentifier	 KS
,	TokenNameCOMMA	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
snapshotDir	TokenNameIdentifier	 snapshot Dir
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
cfDir	TokenNameIdentifier	 cf Dir
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
Directories	TokenNameIdentifier	 Directories
.	TokenNameDOT	
SNAPSHOT_SUBDIR	TokenNameIdentifier	 SNAPSHOT  SUBDIR
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
"42"	TokenNameStringLiteral	42
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
snapshotDir	TokenNameIdentifier	 snapshot Dir
,	TokenNameCOMMA	
directories	TokenNameIdentifier	 directories
.	TokenNameDOT	
getSnapshotDirectory	TokenNameIdentifier	 get Snapshot Directory
(	TokenNameLPAREN	
desc	TokenNameIdentifier	 desc
,	TokenNameCOMMA	
"42"	TokenNameStringLiteral	42
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
backupsDir	TokenNameIdentifier	 backups Dir
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
cfDir	TokenNameIdentifier	 cf Dir
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
Directories	TokenNameIdentifier	 Directories
.	TokenNameDOT	
BACKUPS_SUBDIR	TokenNameIdentifier	 BACKUPS  SUBDIR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
backupsDir	TokenNameIdentifier	 backups Dir
,	TokenNameCOMMA	
directories	TokenNameIdentifier	 directories
.	TokenNameDOT	
getBackupsDirectory	TokenNameIdentifier	 get Backups Directory
(	TokenNameLPAREN	
desc	TokenNameIdentifier	 desc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testSSTableLister	TokenNameIdentifier	 test SS Table Lister
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
cf	TokenNameIdentifier	 cf
:	TokenNameCOLON	
CFS	TokenNameIdentifier	 CFS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Directories	TokenNameIdentifier	 Directories
directories	TokenNameIdentifier	 directories
=	TokenNameEQUAL	
Directories	TokenNameIdentifier	 Directories
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
KS	TokenNameIdentifier	 KS
,	TokenNameCOMMA	
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Directories	TokenNameIdentifier	 Directories
.	TokenNameDOT	
SSTableLister	TokenNameIdentifier	 SS Table Lister
lister	TokenNameIdentifier	 lister
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
File	TokenNameIdentifier	 File
>	TokenNameGREATER	
listed	TokenNameIdentifier	 listed
;	TokenNameSEMICOLON	
// List all but no snapshot, backup 	TokenNameCOMMENT_LINE	List all but no snapshot, backup 
lister	TokenNameIdentifier	 lister
=	TokenNameEQUAL	
directories	TokenNameIdentifier	 directories
.	TokenNameDOT	
sstableLister	TokenNameIdentifier	 sstable Lister
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
listed	TokenNameIdentifier	 listed
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
File	TokenNameIdentifier	 File
>	TokenNameGREATER	
(	TokenNameLPAREN	
lister	TokenNameIdentifier	 lister
.	TokenNameDOT	
listFiles	TokenNameIdentifier	 list Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
:	TokenNameCOLON	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
Directories	TokenNameIdentifier	 Directories
.	TokenNameDOT	
SNAPSHOT_SUBDIR	TokenNameIdentifier	 SNAPSHOT  SUBDIR
)	TokenNameRPAREN	
||	TokenNameOR_OR	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
Directories	TokenNameIdentifier	 Directories
.	TokenNameDOT	
BACKUPS_SUBDIR	TokenNameIdentifier	 BACKUPS  SUBDIR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
assert	TokenNameassert	
!	TokenNameNOT	
listed	TokenNameIdentifier	 listed
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
:	TokenNameCOLON	
f	TokenNameIdentifier	 f
+	TokenNamePLUS	
" should not be listed"	TokenNameStringLiteral	 should not be listed
;	TokenNameSEMICOLON	
else	TokenNameelse	
assert	TokenNameassert	
listed	TokenNameIdentifier	 listed
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
:	TokenNameCOLON	
f	TokenNameIdentifier	 f
+	TokenNamePLUS	
" is missing"	TokenNameStringLiteral	 is missing
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// List all but including backup (but no snapshot) 	TokenNameCOMMENT_LINE	List all but including backup (but no snapshot) 
lister	TokenNameIdentifier	 lister
=	TokenNameEQUAL	
directories	TokenNameIdentifier	 directories
.	TokenNameDOT	
sstableLister	TokenNameIdentifier	 sstable Lister
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
includeBackups	TokenNameIdentifier	 include Backups
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
listed	TokenNameIdentifier	 listed
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
File	TokenNameIdentifier	 File
>	TokenNameGREATER	
(	TokenNameLPAREN	
lister	TokenNameIdentifier	 lister
.	TokenNameDOT	
listFiles	TokenNameIdentifier	 list Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
:	TokenNameCOLON	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
Directories	TokenNameIdentifier	 Directories
.	TokenNameDOT	
SNAPSHOT_SUBDIR	TokenNameIdentifier	 SNAPSHOT  SUBDIR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
assert	TokenNameassert	
!	TokenNameNOT	
listed	TokenNameIdentifier	 listed
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
:	TokenNameCOLON	
f	TokenNameIdentifier	 f
+	TokenNamePLUS	
" should not be listed"	TokenNameStringLiteral	 should not be listed
;	TokenNameSEMICOLON	
else	TokenNameelse	
assert	TokenNameassert	
listed	TokenNameIdentifier	 listed
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
:	TokenNameCOLON	
f	TokenNameIdentifier	 f
+	TokenNamePLUS	
" is missing"	TokenNameStringLiteral	 is missing
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Skip temporary and compacted 	TokenNameCOMMENT_LINE	Skip temporary and compacted 
lister	TokenNameIdentifier	 lister
=	TokenNameEQUAL	
directories	TokenNameIdentifier	 directories
.	TokenNameDOT	
sstableLister	TokenNameIdentifier	 sstable Lister
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
skipTemporary	TokenNameIdentifier	 skip Temporary
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
listed	TokenNameIdentifier	 listed
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
File	TokenNameIdentifier	 File
>	TokenNameGREATER	
(	TokenNameLPAREN	
lister	TokenNameIdentifier	 lister
.	TokenNameDOT	
listFiles	TokenNameIdentifier	 list Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
:	TokenNameCOLON	
files	TokenNameIdentifier	 files
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
Directories	TokenNameIdentifier	 Directories
.	TokenNameDOT	
SNAPSHOT_SUBDIR	TokenNameIdentifier	 SNAPSHOT  SUBDIR
)	TokenNameRPAREN	
||	TokenNameOR_OR	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
Directories	TokenNameIdentifier	 Directories
.	TokenNameDOT	
BACKUPS_SUBDIR	TokenNameIdentifier	 BACKUPS  SUBDIR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
assert	TokenNameassert	
!	TokenNameNOT	
listed	TokenNameIdentifier	 listed
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
:	TokenNameCOLON	
f	TokenNameIdentifier	 f
+	TokenNamePLUS	
" should not be listed"	TokenNameStringLiteral	 should not be listed
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"-tmp-"	TokenNameStringLiteral	-tmp-
)	TokenNameRPAREN	
)	TokenNameRPAREN	
assert	TokenNameassert	
!	TokenNameNOT	
listed	TokenNameIdentifier	 listed
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
:	TokenNameCOLON	
f	TokenNameIdentifier	 f
+	TokenNamePLUS	
" should not be listed"	TokenNameStringLiteral	 should not be listed
;	TokenNameSEMICOLON	
else	TokenNameelse	
assert	TokenNameassert	
listed	TokenNameIdentifier	 listed
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
:	TokenNameCOLON	
f	TokenNameIdentifier	 f
+	TokenNamePLUS	
" is missing"	TokenNameStringLiteral	 is missing
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testLeveledManifestPath	TokenNameIdentifier	 test Leveled Manifest Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
cf	TokenNameIdentifier	 cf
:	TokenNameCOLON	
CFS	TokenNameIdentifier	 CFS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Directories	TokenNameIdentifier	 Directories
directories	TokenNameIdentifier	 directories
=	TokenNameEQUAL	
Directories	TokenNameIdentifier	 Directories
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
KS	TokenNameIdentifier	 KS
,	TokenNameCOMMA	
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
manifest	TokenNameIdentifier	 manifest
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
cfDir	TokenNameIdentifier	 cf Dir
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cf	TokenNameIdentifier	 cf
+	TokenNamePLUS	
LeveledManifest	TokenNameIdentifier	 Leveled Manifest
.	TokenNameDOT	
EXTENSION	TokenNameIdentifier	 EXTENSION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
manifest	TokenNameIdentifier	 manifest
,	TokenNameCOMMA	
directories	TokenNameIdentifier	 directories
.	TokenNameDOT	
tryGetLeveledManifest	TokenNameIdentifier	 try Get Leveled Manifest
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
