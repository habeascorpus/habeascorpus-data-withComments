/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
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
InputStream	TokenNameIdentifier	 Input Stream
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
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
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
CRC32	TokenNameIdentifier	 CR C32
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
UTF8ZipFilesTest	TokenNameIdentifier	 UT F8 Zip Files Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UTF_8	TokenNameIdentifier	 UTF 8
=	TokenNameEQUAL	
"utf-8"	TokenNameStringLiteral	utf-8
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CP437	TokenNameIdentifier	 C P437
=	TokenNameEQUAL	
"cp437"	TokenNameStringLiteral	cp437
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
US_ASCII	TokenNameIdentifier	 US  ASCII
=	TokenNameEQUAL	
"US-ASCII"	TokenNameStringLiteral	US-ASCII
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ASCII_TXT	TokenNameIdentifier	 ASCII  TXT
=	TokenNameEQUAL	
"ascii.txt"	TokenNameStringLiteral	ascii.txt
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EURO_FOR_DOLLAR_TXT	TokenNameIdentifier	 EURO  FOR  DOLLAR  TXT
=	TokenNameEQUAL	
"€_for_Dollar.txt"	TokenNameStringLiteral	€_for_Dollar.txt
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
OIL_BARREL_TXT	TokenNameIdentifier	 OIL  BARREL  TXT
=	TokenNameEQUAL	
"Ölfässer.txt"	TokenNameStringLiteral	Ölfässer.txt
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
testUtf8FileRoundtripExplicitUnicodeExtra	TokenNameIdentifier	 test Utf8 File Roundtrip Explicit Unicode Extra
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
testFileRoundtrip	TokenNameIdentifier	 test File Roundtrip
(	TokenNameLPAREN	
UTF_8	TokenNameIdentifier	 UTF 8
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testUtf8FileRoundtripNoEFSExplicitUnicodeExtra	TokenNameIdentifier	 test Utf8 File Roundtrip No EFS Explicit Unicode Extra
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
testFileRoundtrip	TokenNameIdentifier	 test File Roundtrip
(	TokenNameLPAREN	
UTF_8	TokenNameIdentifier	 UTF 8
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCP437FileRoundtripExplicitUnicodeExtra	TokenNameIdentifier	 test C P437 File Roundtrip Explicit Unicode Extra
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
testFileRoundtrip	TokenNameIdentifier	 test File Roundtrip
(	TokenNameLPAREN	
CP437	TokenNameIdentifier	 C P437
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testASCIIFileRoundtripExplicitUnicodeExtra	TokenNameIdentifier	 test ASCII File Roundtrip Explicit Unicode Extra
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
testFileRoundtrip	TokenNameIdentifier	 test File Roundtrip
(	TokenNameLPAREN	
US_ASCII	TokenNameIdentifier	 US  ASCII
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testUtf8FileRoundtripImplicitUnicodeExtra	TokenNameIdentifier	 test Utf8 File Roundtrip Implicit Unicode Extra
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
testFileRoundtrip	TokenNameIdentifier	 test File Roundtrip
(	TokenNameLPAREN	
UTF_8	TokenNameIdentifier	 UTF 8
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testUtf8FileRoundtripNoEFSImplicitUnicodeExtra	TokenNameIdentifier	 test Utf8 File Roundtrip No EFS Implicit Unicode Extra
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
testFileRoundtrip	TokenNameIdentifier	 test File Roundtrip
(	TokenNameLPAREN	
UTF_8	TokenNameIdentifier	 UTF 8
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCP437FileRoundtripImplicitUnicodeExtra	TokenNameIdentifier	 test C P437 File Roundtrip Implicit Unicode Extra
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
testFileRoundtrip	TokenNameIdentifier	 test File Roundtrip
(	TokenNameLPAREN	
CP437	TokenNameIdentifier	 C P437
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testASCIIFileRoundtripImplicitUnicodeExtra	TokenNameIdentifier	 test ASCII File Roundtrip Implicit Unicode Extra
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
testFileRoundtrip	TokenNameIdentifier	 test File Roundtrip
(	TokenNameLPAREN	
US_ASCII	TokenNameIdentifier	 US  ASCII
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testZipFileReadsUnicodeFields	TokenNameIdentifier	 test Zip File Reads Unicode Fields
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
createTempFile	TokenNameIdentifier	 create Temp File
(	TokenNameLPAREN	
"unicode-test"	TokenNameStringLiteral	unicode-test
,	TokenNameCOMMA	
".zip"	TokenNameStringLiteral	.zip
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ZipFile	TokenNameIdentifier	 Zip File
zf	TokenNameIdentifier	 zf
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
createTestFile	TokenNameIdentifier	 create Test File
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
US_ASCII	TokenNameIdentifier	 US  ASCII
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
zf	TokenNameIdentifier	 zf
=	TokenNameEQUAL	
new	TokenNamenew	
ZipFile	TokenNameIdentifier	 Zip File
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
US_ASCII	TokenNameIdentifier	 US  ASCII
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertCanRead	TokenNameIdentifier	 assert Can Read
(	TokenNameLPAREN	
zf	TokenNameIdentifier	 zf
,	TokenNameCOMMA	
ASCII_TXT	TokenNameIdentifier	 ASCII  TXT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertCanRead	TokenNameIdentifier	 assert Can Read
(	TokenNameLPAREN	
zf	TokenNameIdentifier	 zf
,	TokenNameCOMMA	
EURO_FOR_DOLLAR_TXT	TokenNameIdentifier	 EURO  FOR  DOLLAR  TXT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertCanRead	TokenNameIdentifier	 assert Can Read
(	TokenNameLPAREN	
zf	TokenNameIdentifier	 zf
,	TokenNameCOMMA	
OIL_BARREL_TXT	TokenNameIdentifier	 OIL  BARREL  TXT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
ZipFile	TokenNameIdentifier	 Zip File
.	TokenNameDOT	
closeQuietly	TokenNameIdentifier	 close Quietly
(	TokenNameLPAREN	
zf	TokenNameIdentifier	 zf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
testFileRoundtrip	TokenNameIdentifier	 test File Roundtrip
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
,	TokenNameCOMMA	
boolean	TokenNameboolean	
withEFS	TokenNameIdentifier	 with EFS
,	TokenNameCOMMA	
boolean	TokenNameboolean	
withExplicitUnicodeExtra	TokenNameIdentifier	 with Explicit Unicode Extra
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
createTempFile	TokenNameIdentifier	 create Temp File
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
+	TokenNamePLUS	
"-test"	TokenNameStringLiteral	-test
,	TokenNameCOMMA	
".zip"	TokenNameStringLiteral	.zip
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
createTestFile	TokenNameIdentifier	 create Test File
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
encoding	TokenNameIdentifier	 encoding
,	TokenNameCOMMA	
withEFS	TokenNameIdentifier	 with EFS
,	TokenNameCOMMA	
withExplicitUnicodeExtra	TokenNameIdentifier	 with Explicit Unicode Extra
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testFile	TokenNameIdentifier	 test File
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
createTestFile	TokenNameIdentifier	 create Test File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
,	TokenNameCOMMA	
boolean	TokenNameboolean	
withEFS	TokenNameIdentifier	 with EFS
,	TokenNameCOMMA	
boolean	TokenNameboolean	
withExplicitUnicodeExtra	TokenNameIdentifier	 with Explicit Unicode Extra
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ZipEncoding	TokenNameIdentifier	 Zip Encoding
zipEncoding	TokenNameIdentifier	 zip Encoding
=	TokenNameEQUAL	
ZipEncodingHelper	TokenNameIdentifier	 Zip Encoding Helper
.	TokenNameDOT	
getZipEncoding	TokenNameIdentifier	 get Zip Encoding
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ZipOutputStream	TokenNameIdentifier	 Zip Output Stream
zos	TokenNameIdentifier	 zos
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
zos	TokenNameIdentifier	 zos
=	TokenNameEQUAL	
new	TokenNamenew	
ZipOutputStream	TokenNameIdentifier	 Zip Output Stream
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
zos	TokenNameIdentifier	 zos
.	TokenNameDOT	
setEncoding	TokenNameIdentifier	 set Encoding
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
zos	TokenNameIdentifier	 zos
.	TokenNameDOT	
setUseLanguageEncodingFlag	TokenNameIdentifier	 set Use Language Encoding Flag
(	TokenNameLPAREN	
withEFS	TokenNameIdentifier	 with EFS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
zos	TokenNameIdentifier	 zos
.	TokenNameDOT	
setCreateUnicodeExtraFields	TokenNameIdentifier	 set Create Unicode Extra Fields
(	TokenNameLPAREN	
withExplicitUnicodeExtra	TokenNameIdentifier	 with Explicit Unicode Extra
?	TokenNameQUESTION	
ZipOutputStream	TokenNameIdentifier	 Zip Output Stream
.	TokenNameDOT	
UnicodeExtraFieldPolicy	TokenNameIdentifier	 Unicode Extra Field Policy
.	TokenNameDOT	
NEVER	TokenNameIdentifier	 NEVER
:	TokenNameCOLON	
ZipOutputStream	TokenNameIdentifier	 Zip Output Stream
.	TokenNameDOT	
UnicodeExtraFieldPolicy	TokenNameIdentifier	 Unicode Extra Field Policy
.	TokenNameDOT	
ALWAYS	TokenNameIdentifier	 ALWAYS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ZipEntry	TokenNameIdentifier	 Zip Entry
ze	TokenNameIdentifier	 ze
=	TokenNameEQUAL	
new	TokenNamenew	
ZipEntry	TokenNameIdentifier	 Zip Entry
(	TokenNameLPAREN	
OIL_BARREL_TXT	TokenNameIdentifier	 OIL  BARREL  TXT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
withExplicitUnicodeExtra	TokenNameIdentifier	 with Explicit Unicode Extra
&&	TokenNameAND_AND	
!	TokenNameNOT	
zipEncoding	TokenNameIdentifier	 zip Encoding
.	TokenNameDOT	
canEncode	TokenNameIdentifier	 can Encode
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
en	TokenNameIdentifier	 en
=	TokenNameEQUAL	
zipEncoding	TokenNameIdentifier	 zip Encoding
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
addExtraField	TokenNameIdentifier	 add Extra Field
(	TokenNameLPAREN	
new	TokenNamenew	
UnicodePathExtraField	TokenNameIdentifier	 Unicode Path Extra Field
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
en	TokenNameIdentifier	 en
.	TokenNameDOT	
array	TokenNameIdentifier	 array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
en	TokenNameIdentifier	 en
.	TokenNameDOT	
arrayOffset	TokenNameIdentifier	 array Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
en	TokenNameIdentifier	 en
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
zos	TokenNameIdentifier	 zos
.	TokenNameDOT	
putNextEntry	TokenNameIdentifier	 put Next Entry
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
zos	TokenNameIdentifier	 zos
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"Hello, world!"	TokenNameStringLiteral	Hello, world!
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
"US-ASCII"	TokenNameStringLiteral	US-ASCII
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
zos	TokenNameIdentifier	 zos
.	TokenNameDOT	
closeEntry	TokenNameIdentifier	 close Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ze	TokenNameIdentifier	 ze
=	TokenNameEQUAL	
new	TokenNamenew	
ZipEntry	TokenNameIdentifier	 Zip Entry
(	TokenNameLPAREN	
EURO_FOR_DOLLAR_TXT	TokenNameIdentifier	 EURO  FOR  DOLLAR  TXT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
withExplicitUnicodeExtra	TokenNameIdentifier	 with Explicit Unicode Extra
&&	TokenNameAND_AND	
!	TokenNameNOT	
zipEncoding	TokenNameIdentifier	 zip Encoding
.	TokenNameDOT	
canEncode	TokenNameIdentifier	 can Encode
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
en	TokenNameIdentifier	 en
=	TokenNameEQUAL	
zipEncoding	TokenNameIdentifier	 zip Encoding
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
addExtraField	TokenNameIdentifier	 add Extra Field
(	TokenNameLPAREN	
new	TokenNamenew	
UnicodePathExtraField	TokenNameIdentifier	 Unicode Path Extra Field
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
en	TokenNameIdentifier	 en
.	TokenNameDOT	
array	TokenNameIdentifier	 array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
en	TokenNameIdentifier	 en
.	TokenNameDOT	
arrayOffset	TokenNameIdentifier	 array Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
en	TokenNameIdentifier	 en
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
zos	TokenNameIdentifier	 zos
.	TokenNameDOT	
putNextEntry	TokenNameIdentifier	 put Next Entry
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
zos	TokenNameIdentifier	 zos
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"Give me your money!"	TokenNameStringLiteral	Give me your money!
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
"US-ASCII"	TokenNameStringLiteral	US-ASCII
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
zos	TokenNameIdentifier	 zos
.	TokenNameDOT	
closeEntry	TokenNameIdentifier	 close Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ze	TokenNameIdentifier	 ze
=	TokenNameEQUAL	
new	TokenNamenew	
ZipEntry	TokenNameIdentifier	 Zip Entry
(	TokenNameLPAREN	
ASCII_TXT	TokenNameIdentifier	 ASCII  TXT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
withExplicitUnicodeExtra	TokenNameIdentifier	 with Explicit Unicode Extra
&&	TokenNameAND_AND	
!	TokenNameNOT	
zipEncoding	TokenNameIdentifier	 zip Encoding
.	TokenNameDOT	
canEncode	TokenNameIdentifier	 can Encode
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
en	TokenNameIdentifier	 en
=	TokenNameEQUAL	
zipEncoding	TokenNameIdentifier	 zip Encoding
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
addExtraField	TokenNameIdentifier	 add Extra Field
(	TokenNameLPAREN	
new	TokenNamenew	
UnicodePathExtraField	TokenNameIdentifier	 Unicode Path Extra Field
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
en	TokenNameIdentifier	 en
.	TokenNameDOT	
array	TokenNameIdentifier	 array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
en	TokenNameIdentifier	 en
.	TokenNameDOT	
arrayOffset	TokenNameIdentifier	 array Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
en	TokenNameIdentifier	 en
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
zos	TokenNameIdentifier	 zos
.	TokenNameDOT	
putNextEntry	TokenNameIdentifier	 put Next Entry
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
zos	TokenNameIdentifier	 zos
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"ascii"	TokenNameStringLiteral	ascii
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
"US-ASCII"	TokenNameStringLiteral	US-ASCII
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
zos	TokenNameIdentifier	 zos
.	TokenNameDOT	
closeEntry	TokenNameIdentifier	 close Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
zos	TokenNameIdentifier	 zos
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
zos	TokenNameIdentifier	 zos
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* swallow */	TokenNameCOMMENT_BLOCK	 swallow 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
testFile	TokenNameIdentifier	 test File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ZipFile	TokenNameIdentifier	 Zip File
zf	TokenNameIdentifier	 zf
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
zf	TokenNameIdentifier	 zf
=	TokenNameEQUAL	
new	TokenNamenew	
ZipFile	TokenNameIdentifier	 Zip File
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
encoding	TokenNameIdentifier	 encoding
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
zf	TokenNameIdentifier	 zf
.	TokenNameDOT	
getEntries	TokenNameIdentifier	 get Entries
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ZipEntry	TokenNameIdentifier	 Zip Entry
ze	TokenNameIdentifier	 ze
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ZipEntry	TokenNameIdentifier	 Zip Entry
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"sser.txt"	TokenNameStringLiteral	sser.txt
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertUnicodeName	TokenNameIdentifier	 assert Unicode Name
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
,	TokenNameCOMMA	
OIL_BARREL_TXT	TokenNameIdentifier	 OIL  BARREL  TXT
,	TokenNameCOMMA	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"_for_Dollar.txt"	TokenNameStringLiteral	_for_Dollar.txt
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertUnicodeName	TokenNameIdentifier	 assert Unicode Name
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
,	TokenNameCOMMA	
EURO_FOR_DOLLAR_TXT	TokenNameIdentifier	 EURO  FOR  DOLLAR  TXT
,	TokenNameCOMMA	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ASCII_TXT	TokenNameIdentifier	 ASCII  TXT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
AssertionError	TokenNameIdentifier	 Assertion Error
(	TokenNameLPAREN	
"Urecognized ZIP entry with name ["	TokenNameStringLiteral	Urecognized ZIP entry with name [
+	TokenNamePLUS	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"] found."	TokenNameStringLiteral	] found.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
ZipFile	TokenNameIdentifier	 Zip File
.	TokenNameDOT	
closeQuietly	TokenNameIdentifier	 close Quietly
(	TokenNameLPAREN	
zf	TokenNameIdentifier	 zf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
UnicodePathExtraField	TokenNameIdentifier	 Unicode Path Extra Field
findUniCodePath	TokenNameIdentifier	 find Uni Code Path
(	TokenNameLPAREN	
ZipEntry	TokenNameIdentifier	 Zip Entry
ze	TokenNameIdentifier	 ze
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
UnicodePathExtraField	TokenNameIdentifier	 Unicode Path Extra Field
)	TokenNameRPAREN	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getExtraField	TokenNameIdentifier	 get Extra Field
(	TokenNameLPAREN	
UnicodePathExtraField	TokenNameIdentifier	 Unicode Path Extra Field
.	TokenNameDOT	
UPATH_ID	TokenNameIdentifier	 UPATH  ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
assertUnicodeName	TokenNameIdentifier	 assert Unicode Name
(	TokenNameLPAREN	
ZipEntry	TokenNameIdentifier	 Zip Entry
ze	TokenNameIdentifier	 ze
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
expectedName	TokenNameIdentifier	 expected Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
expectedName	TokenNameIdentifier	 expected Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
UnicodePathExtraField	TokenNameIdentifier	 Unicode Path Extra Field
ucpf	TokenNameIdentifier	 ucpf
=	TokenNameEQUAL	
findUniCodePath	TokenNameIdentifier	 find Uni Code Path
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
ucpf	TokenNameIdentifier	 ucpf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ZipEncoding	TokenNameIdentifier	 Zip Encoding
enc	TokenNameIdentifier	 enc
=	TokenNameEQUAL	
ZipEncodingHelper	TokenNameIdentifier	 Zip Encoding Helper
.	TokenNameDOT	
getZipEncoding	TokenNameIdentifier	 get Zip Encoding
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
ne	TokenNameIdentifier	 ne
=	TokenNameEQUAL	
enc	TokenNameIdentifier	 enc
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
ze	TokenNameIdentifier	 ze
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CRC32	TokenNameIdentifier	 CR C32
crc	TokenNameIdentifier	 crc
=	TokenNameEQUAL	
new	TokenNamenew	
CRC32	TokenNameIdentifier	 CR C32
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
crc	TokenNameIdentifier	 crc
.	TokenNameDOT	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
ne	TokenNameIdentifier	 ne
.	TokenNameDOT	
array	TokenNameIdentifier	 array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ne	TokenNameIdentifier	 ne
.	TokenNameDOT	
arrayOffset	TokenNameIdentifier	 array Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ne	TokenNameIdentifier	 ne
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
crc	TokenNameIdentifier	 crc
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ucpf	TokenNameIdentifier	 ucpf
.	TokenNameDOT	
getNameCRC32	TokenNameIdentifier	 get Name CR C32
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expectedName	TokenNameIdentifier	 expected Name
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
ucpf	TokenNameIdentifier	 ucpf
.	TokenNameDOT	
getUnicodeName	TokenNameIdentifier	 get Unicode Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
UTF_8	TokenNameIdentifier	 UTF 8
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
assertCanRead	TokenNameIdentifier	 assert Can Read
(	TokenNameLPAREN	
ZipFile	TokenNameIdentifier	 Zip File
zf	TokenNameIdentifier	 zf
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ZipEntry	TokenNameIdentifier	 Zip Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
zf	TokenNameIdentifier	 zf
.	TokenNameDOT	
getEntry	TokenNameIdentifier	 get Entry
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"Entry "	TokenNameStringLiteral	Entry 
+	TokenNamePLUS	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
" doesn't exist"	TokenNameStringLiteral	 doesn't exist
,	TokenNameCOMMA	
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
zf	TokenNameIdentifier	 zf
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"InputStream is null"	TokenNameStringLiteral	InputStream is null
,	TokenNameCOMMA	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
