/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
sstable	TokenNameIdentifier	 sstable
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
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
SchemaLoader	TokenNameIdentifier	 Schema Loader
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
DecoratedKey	TokenNameIdentifier	 Decorated Key
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
columniterator	TokenNameIdentifier	 columniterator
.	TokenNameDOT	
SSTableNamesIterator	TokenNameIdentifier	 SS Table Names Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
FBUtilities	TokenNameIdentifier	 FB Utilities
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
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
/** * Tests backwards compatibility for SSTables. Requires that older SSTables match up with the existing config file, * and currently only tests specific cases for specific upgrades. */	TokenNameCOMMENT_JAVADOC	 Tests backwards compatibility for SSTables. Requires that older SSTables match up with the existing config file, and currently only tests specific cases for specific upgrades. 
public	TokenNamepublic	
class	TokenNameclass	
LegacySSTableTest	TokenNameIdentifier	 Legacy SS Table Test
extends	TokenNameextends	
SchemaLoader	TokenNameIdentifier	 Schema Loader
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
LEGACY_SSTABLE_PROP	TokenNameIdentifier	 LEGACY  SSTABLE  PROP
=	TokenNameEQUAL	
"legacy-sstable-root"	TokenNameStringLiteral	legacy-sstable-root
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KSNAME	TokenNameIdentifier	 KSNAME
=	TokenNameEQUAL	
"Keyspace1"	TokenNameStringLiteral	Keyspace1
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CFNAME	TokenNameIdentifier	 CFNAME
=	TokenNameEQUAL	
"Standard1"	TokenNameStringLiteral	Standard1
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
TEST_DATA	TokenNameIdentifier	 TEST  DATA
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
File	TokenNameIdentifier	 File
LEGACY_SSTABLE_ROOT	TokenNameIdentifier	 LEGACY  SSTABLE  ROOT
;	TokenNameSEMICOLON	
@	TokenNameAT	
BeforeClass	TokenNameIdentifier	 Before Class
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
beforeClass	TokenNameIdentifier	 before Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
scp	TokenNameIdentifier	 scp
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
LEGACY_SSTABLE_PROP	TokenNameIdentifier	 LEGACY  SSTABLE  PROP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
scp	TokenNameIdentifier	 scp
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
LEGACY_SSTABLE_ROOT	TokenNameIdentifier	 LEGACY  SSTABLE  ROOT
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
scp	TokenNameIdentifier	 scp
)	TokenNameRPAREN	
.	TokenNameDOT	
getAbsoluteFile	TokenNameIdentifier	 get Absolute File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
LEGACY_SSTABLE_ROOT	TokenNameIdentifier	 LEGACY  SSTABLE  ROOT
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TEST_DATA	TokenNameIdentifier	 TEST  DATA
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
TEST_DATA	TokenNameIdentifier	 TEST  DATA
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a descriptor for the legacy sstable at the given version. */	TokenNameCOMMENT_JAVADOC	 Get a descriptor for the legacy sstable at the given version. 
protected	TokenNameprotected	
Descriptor	TokenNameIdentifier	 Descriptor
getDescriptor	TokenNameIdentifier	 get Descriptor
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ver	TokenNameIdentifier	 ver
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
directory	TokenNameIdentifier	 directory
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
LEGACY_SSTABLE_ROOT	TokenNameIdentifier	 LEGACY  SSTABLE  ROOT
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
ver	TokenNameIdentifier	 ver
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
KSNAME	TokenNameIdentifier	 KSNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Descriptor	TokenNameIdentifier	 Descriptor
(	TokenNameLPAREN	
ver	TokenNameIdentifier	 ver
,	TokenNameCOMMA	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
KSNAME	TokenNameIdentifier	 KSNAME
,	TokenNameCOMMA	
CFNAME	TokenNameIdentifier	 CFNAME
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Generates a test SSTable for use in this classes' tests. Uncomment and run against an older build * and the output will be copied to a version subdirectory in 'LEGACY_SSTABLE_ROOT' * @Test public void buildTestSSTable() throws IOException { // write the output in a version specific directory Descriptor dest = getDescriptor(Descriptor.CURRENT_VERSION); assert dest.directory.mkdirs() : "Could not create " + dest.directory + ". Might it already exist?"; SSTableReader ssTable = SSTableUtils.prepare().ks(KSNAME).cf(CFNAME).dest(dest).write(TEST_DATA); assert ssTable.descriptor.generation == 0 : "In order to create a generation 0 sstable, please run this test alone."; System.out.println(">>> Wrote " + dest); } */	TokenNameCOMMENT_JAVADOC	 Generates a test SSTable for use in this classes' tests. Uncomment and run against an older build and the output will be copied to a version subdirectory in 'LEGACY_SSTABLE_ROOT' @Test public void buildTestSSTable() throws IOException { // write the output in a version specific directory Descriptor dest = getDescriptor(Descriptor.CURRENT_VERSION); assert dest.directory.mkdirs() : "Could not create " + dest.directory + ". Might it already exist?"; SSTableReader ssTable = SSTableUtils.prepare().ks(KSNAME).cf(CFNAME).dest(dest).write(TEST_DATA); assert ssTable.descriptor.generation == 0 : "In order to create a generation 0 sstable, please run this test alone."; System.out.println(">>> Wrote " + dest); } 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testVersions	TokenNameIdentifier	 test Versions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Throwable	TokenNameIdentifier	 Throwable
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
version	TokenNameIdentifier	 version
:	TokenNameCOLON	
LEGACY_SSTABLE_ROOT	TokenNameIdentifier	 LEGACY  SSTABLE  ROOT
.	TokenNameDOT	
listFiles	TokenNameIdentifier	 list Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
Descriptor	TokenNameIdentifier	 Descriptor
.	TokenNameDOT	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
testVersion	TokenNameIdentifier	 test Version
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testVersion	TokenNameIdentifier	 test Version
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
Throwable	TokenNameIdentifier	 Throwable
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
SSTableReader	TokenNameIdentifier	 SS Table Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
SSTableReader	TokenNameIdentifier	 SS Table Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
getDescriptor	TokenNameIdentifier	 get Descriptor
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
keystring	TokenNameIdentifier	 keystring
:	TokenNameCOLON	
TEST_DATA	TokenNameIdentifier	 TEST  DATA
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
keystring	TokenNameIdentifier	 keystring
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// confirm that the bloom filter does not reject any keys/names 	TokenNameCOMMENT_LINE	confirm that the bloom filter does not reject any keys/names 
DecoratedKey	TokenNameIdentifier	 Decorated Key
dk	TokenNameIdentifier	 dk
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
partitioner	TokenNameIdentifier	 partitioner
.	TokenNameDOT	
decorateKey	TokenNameIdentifier	 decorate Key
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SSTableNamesIterator	TokenNameIdentifier	 SS Table Names Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
new	TokenNamenew	
SSTableNamesIterator	TokenNameIdentifier	 SS Table Names Iterator
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
dk	TokenNameIdentifier	 dk
,	TokenNameCOMMA	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
singleton	TokenNameIdentifier	 singleton
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Failed to read "	TokenNameStringLiteral	Failed to read 
+	TokenNamePLUS	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
