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
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
resources	TokenNameIdentifier	 resources
.	TokenNameDOT	
TarResource	TokenNameIdentifier	 Tar Resource
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
FileUtils	TokenNameIdentifier	 File Utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
tar	TokenNameIdentifier	 tar
.	TokenNameDOT	
TarEntry	TokenNameIdentifier	 Tar Entry
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
tar	TokenNameIdentifier	 tar
.	TokenNameDOT	
TarInputStream	TokenNameIdentifier	 Tar Input Stream
;	TokenNameSEMICOLON	
/** * Scans tar archives for resources. */	TokenNameCOMMENT_JAVADOC	 Scans tar archives for resources. 
public	TokenNamepublic	
class	TokenNameclass	
TarScanner	TokenNameIdentifier	 Tar Scanner
extends	TokenNameextends	
ArchiveScanner	TokenNameIdentifier	 Archive Scanner
{	TokenNameLBRACE	
/** * Fills the file and directory maps with resources read from the * archive. * * @param src the archive to scan. * @param encoding encoding used to encode file names inside the archive. * @param fileEntries Map (name to resource) of non-directory * resources found inside the archive. * @param matchFileEntries Map (name to resource) of non-directory * resources found inside the archive that matched all include * patterns and didn't match any exclude patterns. * @param dirEntries Map (name to resource) of directory * resources found inside the archive. * @param matchDirEntries Map (name to resource) of directory * resources found inside the archive that matched all include * patterns and didn't match any exclude patterns. */	TokenNameCOMMENT_JAVADOC	 Fills the file and directory maps with resources read from the archive. * @param src the archive to scan. @param encoding encoding used to encode file names inside the archive. @param fileEntries Map (name to resource) of non-directory resources found inside the archive. @param matchFileEntries Map (name to resource) of non-directory resources found inside the archive that matched all include patterns and didn't match any exclude patterns. @param dirEntries Map (name to resource) of directory resources found inside the archive. @param matchDirEntries Map (name to resource) of directory resources found inside the archive that matched all include patterns and didn't match any exclude patterns. 
protected	TokenNameprotected	
void	TokenNamevoid	
fillMapsFromArchive	TokenNameIdentifier	 fill Maps From Archive
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
fileEntries	TokenNameIdentifier	 file Entries
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
matchFileEntries	TokenNameIdentifier	 match File Entries
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
dirEntries	TokenNameIdentifier	 dir Entries
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
matchDirEntries	TokenNameIdentifier	 match Dir Entries
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TarEntry	TokenNameIdentifier	 Tar Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
TarInputStream	TokenNameIdentifier	 Tar Input Stream
ti	TokenNameIdentifier	 ti
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ti	TokenNameIdentifier	 ti
=	TokenNameEQUAL	
new	TokenNamenew	
TarInputStream	TokenNameIdentifier	 Tar Input Stream
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"problem opening "	TokenNameStringLiteral	problem opening 
+	TokenNamePLUS	
srcFile	TokenNameIdentifier	 src File
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
getNextEntry	TokenNameIdentifier	 get Next Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Resource	TokenNameIdentifier	 Resource
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
new	TokenNamenew	
TarResource	TokenNameIdentifier	 Tar Resource
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
trimSeparator	TokenNameIdentifier	 trim Separator
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dirEntries	TokenNameIdentifier	 dir Entries
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
matchDirEntries	TokenNameIdentifier	 match Dir Entries
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fileEntries	TokenNameIdentifier	 file Entries
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
matchFileEntries	TokenNameIdentifier	 match File Entries
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"problem reading "	TokenNameStringLiteral	problem reading 
+	TokenNamePLUS	
srcFile	TokenNameIdentifier	 src File
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
ti	TokenNameIdentifier	 ti
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
