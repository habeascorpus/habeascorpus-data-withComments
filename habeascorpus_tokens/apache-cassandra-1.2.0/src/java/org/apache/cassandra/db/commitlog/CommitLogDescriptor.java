/* * * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. * */	TokenNameCOMMENT_BLOCK	 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
commitlog	TokenNameIdentifier	 commitlog
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
Matcher	TokenNameIdentifier	 Matcher
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
Pattern	TokenNameIdentifier	 Pattern
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MessagingService	TokenNameIdentifier	 Messaging Service
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
CommitLogDescriptor	TokenNameIdentifier	 Commit Log Descriptor
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SEPARATOR	TokenNameIdentifier	 SEPARATOR
=	TokenNameEQUAL	
"-"	TokenNameStringLiteral	-
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FILENAME_PREFIX	TokenNameIdentifier	 FILENAME  PREFIX
=	TokenNameEQUAL	
"CommitLog"	TokenNameStringLiteral	CommitLog
+	TokenNamePLUS	
SEPARATOR	TokenNameIdentifier	 SEPARATOR
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FILENAME_EXTENSION	TokenNameIdentifier	 FILENAME  EXTENSION
=	TokenNameEQUAL	
".log"	TokenNameStringLiteral	.log
;	TokenNameSEMICOLON	
// match both legacy and new version of commitlogs Ex: CommitLog-12345.log and CommitLog-4-12345.log. 	TokenNameCOMMENT_LINE	match both legacy and new version of commitlogs Ex: CommitLog-12345.log and CommitLog-4-12345.log. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Pattern	TokenNameIdentifier	 Pattern
COMMIT_LOG_FILE_PATTERN	TokenNameIdentifier	 COMMIT  LOG  FILE  PATTERN
=	TokenNameEQUAL	
Pattern	TokenNameIdentifier	 Pattern
.	TokenNameDOT	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
FILENAME_PREFIX	TokenNameIdentifier	 FILENAME  PREFIX
+	TokenNamePLUS	
"((\d+)("	TokenNameStringLiteral	((\d+)(
+	TokenNamePLUS	
SEPARATOR	TokenNameIdentifier	 SEPARATOR
+	TokenNamePLUS	
"\d+)?)"	TokenNameStringLiteral	\d+)?)
+	TokenNamePLUS	
FILENAME_EXTENSION	TokenNameIdentifier	 FILENAME  EXTENSION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
LEGACY_VERSION	TokenNameIdentifier	 LEGACY  VERSION
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
VERSION_12	TokenNameIdentifier	 VERSION 12
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Increment this number if there is a changes in the commit log disc layout or MessagingVersion changes. * Note: make sure to handle {@link #getMessagingVersion()} */	TokenNameCOMMENT_JAVADOC	 Increment this number if there is a changes in the commit log disc layout or MessagingVersion changes. Note: make sure to handle {@link #getMessagingVersion()} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
current_version	TokenNameIdentifier	 current version
=	TokenNameEQUAL	
VERSION_12	TokenNameIdentifier	 VERSION 12
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
long	TokenNamelong	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CommitLogDescriptor	TokenNameIdentifier	 Commit Log Descriptor
(	TokenNameLPAREN	
int	TokenNameint	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
long	TokenNamelong	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CommitLogDescriptor	TokenNameIdentifier	 Commit Log Descriptor
(	TokenNameLPAREN	
long	TokenNamelong	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
current_version	TokenNameIdentifier	 current version
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
CommitLogDescriptor	TokenNameIdentifier	 Commit Log Descriptor
fromFileName	TokenNameIdentifier	 from File Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Matcher	TokenNameIdentifier	 Matcher
matcher	TokenNameIdentifier	 matcher
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
matcher	TokenNameIdentifier	 matcher
=	TokenNameEQUAL	
COMMIT_LOG_FILE_PATTERN	TokenNameIdentifier	 COMMIT  LOG  FILE  PATTERN
.	TokenNameDOT	
matcher	TokenNameIdentifier	 matcher
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Cannot parse the version of the file: "	TokenNameStringLiteral	Cannot parse the version of the file: 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matcher	TokenNameIdentifier	 matcher
.	TokenNameDOT	
group	TokenNameIdentifier	 group
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
parseLong	TokenNameIdentifier	 parse Long
(	TokenNameLPAREN	
matcher	TokenNameIdentifier	 matcher
.	TokenNameDOT	
group	TokenNameIdentifier	 group
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
SEPARATOR	TokenNameIdentifier	 SEPARATOR
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
CommitLogDescriptor	TokenNameIdentifier	 Commit Log Descriptor
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
matcher	TokenNameIdentifier	 matcher
.	TokenNameDOT	
group	TokenNameIdentifier	 group
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
long	TokenNamelong	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
parseLong	TokenNameIdentifier	 parse Long
(	TokenNameLPAREN	
matcher	TokenNameIdentifier	 matcher
.	TokenNameDOT	
group	TokenNameIdentifier	 group
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
CommitLogDescriptor	TokenNameIdentifier	 Commit Log Descriptor
(	TokenNameLPAREN	
LEGACY_VERSION	TokenNameIdentifier	 LEGACY  VERSION
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getMessagingVersion	TokenNameIdentifier	 get Messaging Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
current_version	TokenNameIdentifier	 current version
==	TokenNameEQUAL_EQUAL	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
VERSION_12	TokenNameIdentifier	 VERSION 12
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
LEGACY_VERSION	TokenNameIdentifier	 LEGACY  VERSION
:	TokenNameCOLON	
return	TokenNamereturn	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
VERSION_11	TokenNameIdentifier	 VERSION 11
;	TokenNameSEMICOLON	
case	TokenNamecase	
VERSION_12	TokenNameIdentifier	 VERSION 12
:	TokenNameCOLON	
return	TokenNamereturn	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
VERSION_12	TokenNameIdentifier	 VERSION 12
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"Unknown commitlog version "	TokenNameStringLiteral	Unknown commitlog version 
+	TokenNamePLUS	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
FILENAME_PREFIX	TokenNameIdentifier	 FILENAME  PREFIX
+	TokenNamePLUS	
version	TokenNameIdentifier	 version
+	TokenNamePLUS	
SEPARATOR	TokenNameIdentifier	 SEPARATOR
+	TokenNamePLUS	
id	TokenNameIdentifier	 id
+	TokenNamePLUS	
FILENAME_EXTENSION	TokenNameIdentifier	 FILENAME  EXTENSION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param filename the filename to check * @return true if filename could be a commit log based on it's filename */	TokenNameCOMMENT_JAVADOC	 @param filename the filename to check @return true if filename could be a commit log based on it's filename 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isValid	TokenNameIdentifier	 is Valid
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
COMMIT_LOG_FILE_PATTERN	TokenNameIdentifier	 COMMIT  LOG  FILE  PATTERN
.	TokenNameDOT	
matcher	TokenNameIdentifier	 matcher
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
