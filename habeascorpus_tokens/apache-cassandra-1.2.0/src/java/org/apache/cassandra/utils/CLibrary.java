/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
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
FileDescriptor	TokenNameIdentifier	 File Descriptor
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
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Field	TokenNameIdentifier	 Field
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
slf4j	TokenNameIdentifier	 slf4j
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
slf4j	TokenNameIdentifier	 slf4j
.	TokenNameDOT	
LoggerFactory	TokenNameIdentifier	 Logger Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
sun	TokenNameIdentifier	 sun
.	TokenNameDOT	
jna	TokenNameIdentifier	 jna
.	TokenNameDOT	
LastErrorException	TokenNameIdentifier	 Last Error Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
sun	TokenNameIdentifier	 sun
.	TokenNameDOT	
jna	TokenNameIdentifier	 jna
.	TokenNameDOT	
Native	TokenNameIdentifier	 Native
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
CLibrary	TokenNameIdentifier	 C Library
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
LoggerFactory	TokenNameIdentifier	 Logger Factory
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
CLibrary	TokenNameIdentifier	 C Library
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MCL_CURRENT	TokenNameIdentifier	 MCL  CURRENT
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MCL_FUTURE	TokenNameIdentifier	 MCL  FUTURE
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ENOMEM	TokenNameIdentifier	 ENOMEM
=	TokenNameEQUAL	
12	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
F_GETFL	TokenNameIdentifier	 F  GETFL
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* get file status flags */	TokenNameCOMMENT_BLOCK	 get file status flags 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
F_SETFL	TokenNameIdentifier	 F  SETFL
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* set file status flags */	TokenNameCOMMENT_BLOCK	 set file status flags 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
F_NOCACHE	TokenNameIdentifier	 F  NOCACHE
=	TokenNameEQUAL	
48	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* Mac OS X specific flag, turns cache on/off */	TokenNameCOMMENT_BLOCK	 Mac OS X specific flag, turns cache on/off 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
O_DIRECT	TokenNameIdentifier	 O  DIRECT
=	TokenNameEQUAL	
040000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* fcntl.h */	TokenNameCOMMENT_BLOCK	 fcntl.h 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
O_RDONLY	TokenNameIdentifier	 O  RDONLY
=	TokenNameEQUAL	
00000000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* fcntl.h */	TokenNameCOMMENT_BLOCK	 fcntl.h 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
POSIX_FADV_NORMAL	TokenNameIdentifier	 POSIX  FADV  NORMAL
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* fadvise.h */	TokenNameCOMMENT_BLOCK	 fadvise.h 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
POSIX_FADV_RANDOM	TokenNameIdentifier	 POSIX  FADV  RANDOM
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* fadvise.h */	TokenNameCOMMENT_BLOCK	 fadvise.h 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
POSIX_FADV_SEQUENTIAL	TokenNameIdentifier	 POSIX  FADV  SEQUENTIAL
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* fadvise.h */	TokenNameCOMMENT_BLOCK	 fadvise.h 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
POSIX_FADV_WILLNEED	TokenNameIdentifier	 POSIX  FADV  WILLNEED
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* fadvise.h */	TokenNameCOMMENT_BLOCK	 fadvise.h 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
POSIX_FADV_DONTNEED	TokenNameIdentifier	 POSIX  FADV  DONTNEED
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* fadvise.h */	TokenNameCOMMENT_BLOCK	 fadvise.h 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
POSIX_FADV_NOREUSE	TokenNameIdentifier	 POSIX  FADV  NOREUSE
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* fadvise.h */	TokenNameCOMMENT_BLOCK	 fadvise.h 
static	TokenNamestatic	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Native	TokenNameIdentifier	 Native
.	TokenNameDOT	
register	TokenNameIdentifier	 register
(	TokenNameLPAREN	
"c"	TokenNameStringLiteral	c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoClassDefFoundError	TokenNameIdentifier	 No Class Def Found Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"JNA not found. Native methods will be disabled."	TokenNameStringLiteral	JNA not found. Native methods will be disabled.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnsatisfiedLinkError	TokenNameIdentifier	 Unsatisfied Link Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"JNA link failure, one or more native method will be unavailable."	TokenNameStringLiteral	JNA link failure, one or more native method will be unavailable.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"JNA link failure details: "	TokenNameStringLiteral	JNA link failure details: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchMethodError	TokenNameIdentifier	 No Such Method Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Obsolete version of JNA present; unable to register C library. Upgrade to JNA 3.2.7 or later"	TokenNameStringLiteral	Obsolete version of JNA present; unable to register C library. Upgrade to JNA 3.2.7 or later
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
native	TokenNamenative	
int	TokenNameint	
mlockall	TokenNameIdentifier	 mlockall
(	TokenNameLPAREN	
int	TokenNameint	
flags	TokenNameIdentifier	 flags
)	TokenNameRPAREN	
throws	TokenNamethrows	
LastErrorException	TokenNameIdentifier	 Last Error Exception
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
native	TokenNamenative	
int	TokenNameint	
munlockall	TokenNameIdentifier	 munlockall
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
LastErrorException	TokenNameIdentifier	 Last Error Exception
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
native	TokenNamenative	
int	TokenNameint	
link	TokenNameIdentifier	 link
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
from	TokenNameIdentifier	 from
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
throws	TokenNamethrows	
LastErrorException	TokenNameIdentifier	 Last Error Exception
;	TokenNameSEMICOLON	
// fcntl - manipulate file descriptor, `man 2 fcntl` 	TokenNameCOMMENT_LINE	fcntl - manipulate file descriptor, `man 2 fcntl` 
public	TokenNamepublic	
static	TokenNamestatic	
native	TokenNamenative	
int	TokenNameint	
fcntl	TokenNameIdentifier	 fcntl
(	TokenNameLPAREN	
int	TokenNameint	
fd	TokenNameIdentifier	 fd
,	TokenNameCOMMA	
int	TokenNameint	
command	TokenNameIdentifier	 command
,	TokenNameCOMMA	
long	TokenNamelong	
flags	TokenNameIdentifier	 flags
)	TokenNameRPAREN	
throws	TokenNamethrows	
LastErrorException	TokenNameIdentifier	 Last Error Exception
;	TokenNameSEMICOLON	
// fadvice 	TokenNameCOMMENT_LINE	fadvice 
public	TokenNamepublic	
static	TokenNamestatic	
native	TokenNamenative	
int	TokenNameint	
posix_fadvise	TokenNameIdentifier	 posix fadvise
(	TokenNameLPAREN	
int	TokenNameint	
fd	TokenNameIdentifier	 fd
,	TokenNameCOMMA	
long	TokenNamelong	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
int	TokenNameint	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
throws	TokenNamethrows	
LastErrorException	TokenNameIdentifier	 Last Error Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
native	TokenNamenative	
int	TokenNameint	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
int	TokenNameint	
flags	TokenNameIdentifier	 flags
)	TokenNameRPAREN	
throws	TokenNamethrows	
LastErrorException	TokenNameIdentifier	 Last Error Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
native	TokenNamenative	
int	TokenNameint	
fsync	TokenNameIdentifier	 fsync
(	TokenNameLPAREN	
int	TokenNameint	
fd	TokenNameIdentifier	 fd
)	TokenNameRPAREN	
throws	TokenNamethrows	
LastErrorException	TokenNameIdentifier	 Last Error Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
native	TokenNamenative	
int	TokenNameint	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
int	TokenNameint	
fd	TokenNameIdentifier	 fd
)	TokenNameRPAREN	
throws	TokenNamethrows	
LastErrorException	TokenNameIdentifier	 Last Error Exception
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
errno	TokenNameIdentifier	 errno
(	TokenNameLPAREN	
RuntimeException	TokenNameIdentifier	 Runtime Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
e	TokenNameIdentifier	 e
instanceof	TokenNameinstanceof	
LastErrorException	TokenNameIdentifier	 Last Error Exception
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LastErrorException	TokenNameIdentifier	 Last Error Exception
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
.	TokenNameDOT	
getErrorCode	TokenNameIdentifier	 get Error Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchMethodError	TokenNameIdentifier	 No Such Method Error
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Obsolete version of JNA present; unable to read errno. Upgrade to JNA 3.2.7 or later"	TokenNameStringLiteral	Obsolete version of JNA present; unable to read errno. Upgrade to JNA 3.2.7 or later
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
CLibrary	TokenNameIdentifier	 C Library
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
tryMlockall	TokenNameIdentifier	 try Mlockall
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
mlockall	TokenNameIdentifier	 mlockall
(	TokenNameLPAREN	
MCL_CURRENT	TokenNameIdentifier	 MCL  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"JNA mlockall successful"	TokenNameStringLiteral	JNA mlockall successful
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnsatisfiedLinkError	TokenNameIdentifier	 Unsatisfied Link Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this will have already been logged by CLibrary, no need to repeat it 	TokenNameCOMMENT_LINE	this will have already been logged by CLibrary, no need to repeat it 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RuntimeException	TokenNameIdentifier	 Runtime Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
instanceof	TokenNameinstanceof	
LastErrorException	TokenNameIdentifier	 Last Error Exception
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
errno	TokenNameIdentifier	 errno
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
ENOMEM	TokenNameIdentifier	 ENOMEM
&&	TokenNameAND_AND	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"os.name"	TokenNameStringLiteral	os.name
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"linux"	TokenNameStringLiteral	linux
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Unable to lock JVM memory (ENOMEM)."	TokenNameStringLiteral	Unable to lock JVM memory (ENOMEM).
+	TokenNamePLUS	
" This can result in part of the JVM being swapped out, especially with mmapped I/O enabled."	TokenNameStringLiteral	 This can result in part of the JVM being swapped out, especially with mmapped I/O enabled.
+	TokenNamePLUS	
" Increase RLIMIT_MEMLOCK or run Cassandra as root."	TokenNameStringLiteral	 Increase RLIMIT_MEMLOCK or run Cassandra as root.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"os.name"	TokenNameStringLiteral	os.name
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"mac"	TokenNameStringLiteral	mac
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// OS X allows mlockall to be called, but always returns an error 	TokenNameCOMMENT_LINE	OS X allows mlockall to be called, but always returns an error 
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Unknown mlockall error "	TokenNameStringLiteral	Unknown mlockall error 
+	TokenNamePLUS	
errno	TokenNameIdentifier	 errno
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Create a hard link for a given file. * * @param sourceFile The name of the source file. * @param destinationFile The name of the destination file. * * @throws java.io.IOException if an error has occurred while creating the link. */	TokenNameCOMMENT_JAVADOC	 Create a hard link for a given file. * @param sourceFile The name of the source file. @param destinationFile The name of the destination file. * @throws java.io.IOException if an error has occurred while creating the link. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
createHardLink	TokenNameIdentifier	 create Hard Link
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
sourceFile	TokenNameIdentifier	 source File
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
destinationFile	TokenNameIdentifier	 destination File
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
link	TokenNameIdentifier	 link
(	TokenNameLPAREN	
sourceFile	TokenNameIdentifier	 source File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
destinationFile	TokenNameIdentifier	 destination File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnsatisfiedLinkError	TokenNameIdentifier	 Unsatisfied Link Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createHardLinkWithExec	TokenNameIdentifier	 create Hard Link With Exec
(	TokenNameLPAREN	
sourceFile	TokenNameIdentifier	 source File
,	TokenNameCOMMA	
destinationFile	TokenNameIdentifier	 destination File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RuntimeException	TokenNameIdentifier	 Runtime Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Unable to create hard link"	TokenNameStringLiteral	Unable to create hard link
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
instanceof	TokenNameinstanceof	
LastErrorException	TokenNameIdentifier	 Last Error Exception
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
// there are 17 different error codes listed on the man page. punt until/unless we find which 	TokenNameCOMMENT_LINE	there are 17 different error codes listed on the man page. punt until/unless we find which 
// ones actually turn up in practice. 	TokenNameCOMMENT_LINE	ones actually turn up in practice. 
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Unable to create hard link from %s to %s (errno %d)"	TokenNameStringLiteral	Unable to create hard link from %s to %s (errno %d)
,	TokenNameCOMMA	
sourceFile	TokenNameIdentifier	 source File
,	TokenNameCOMMA	
destinationFile	TokenNameIdentifier	 destination File
,	TokenNameCOMMA	
errno	TokenNameIdentifier	 errno
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
createHardLinkWithExec	TokenNameIdentifier	 create Hard Link With Exec
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
sourceFile	TokenNameIdentifier	 source File
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
destinationFile	TokenNameIdentifier	 destination File
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
osname	TokenNameIdentifier	 osname
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"os.name"	TokenNameStringLiteral	os.name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ProcessBuilder	TokenNameIdentifier	 Process Builder
pb	TokenNameIdentifier	 pb
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
osname	TokenNameIdentifier	 osname
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"Windows"	TokenNameStringLiteral	Windows
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
osversion	TokenNameIdentifier	 osversion
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"os.version"	TokenNameStringLiteral	os.version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
osversion	TokenNameIdentifier	 osversion
>=	TokenNameGREATER_EQUAL	
6.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pb	TokenNameIdentifier	 pb
=	TokenNameEQUAL	
new	TokenNamenew	
ProcessBuilder	TokenNameIdentifier	 Process Builder
(	TokenNameLPAREN	
"cmd"	TokenNameStringLiteral	cmd
,	TokenNameCOMMA	
"/c"	TokenNameStringLiteral	/c
,	TokenNameCOMMA	
"mklink"	TokenNameStringLiteral	mklink
,	TokenNameCOMMA	
"/H"	TokenNameStringLiteral	/H
,	TokenNameCOMMA	
destinationFile	TokenNameIdentifier	 destination File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
sourceFile	TokenNameIdentifier	 source File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
pb	TokenNameIdentifier	 pb
=	TokenNameEQUAL	
new	TokenNamenew	
ProcessBuilder	TokenNameIdentifier	 Process Builder
(	TokenNameLPAREN	
"fsutil"	TokenNameStringLiteral	fsutil
,	TokenNameCOMMA	
"hardlink"	TokenNameStringLiteral	hardlink
,	TokenNameCOMMA	
"create"	TokenNameStringLiteral	create
,	TokenNameCOMMA	
destinationFile	TokenNameIdentifier	 destination File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
sourceFile	TokenNameIdentifier	 source File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
pb	TokenNameIdentifier	 pb
=	TokenNameEQUAL	
new	TokenNamenew	
ProcessBuilder	TokenNameIdentifier	 Process Builder
(	TokenNameLPAREN	
"ln"	TokenNameStringLiteral	ln
,	TokenNameCOMMA	
sourceFile	TokenNameIdentifier	 source File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
destinationFile	TokenNameIdentifier	 destination File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pb	TokenNameIdentifier	 pb
.	TokenNameDOT	
redirectErrorStream	TokenNameIdentifier	 redirect Error Stream
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
exec	TokenNameIdentifier	 exec
(	TokenNameLPAREN	
pb	TokenNameIdentifier	 pb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
osname	TokenNameIdentifier	 osname
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"Windows"	TokenNameStringLiteral	Windows
)	TokenNameRPAREN	
?	TokenNameQUESTION	
"Unable to create hard link. This probably means your data directory path is too long. Exception follows:"	TokenNameStringLiteral	Unable to create hard link. This probably means your data directory path is too long. Exception follows:
:	TokenNameCOLON	
"Unable to create hard link with exec. Suggest installing JNA to avoid the need to exec entirely. Exception follows: "	TokenNameStringLiteral	Unable to create hard link with exec. Suggest installing JNA to avoid the need to exec entirely. Exception follows: 
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
trySkipCache	TokenNameIdentifier	 try Skip Cache
(	TokenNameLPAREN	
int	TokenNameint	
fd	TokenNameIdentifier	 fd
,	TokenNameCOMMA	
long	TokenNamelong	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fd	TokenNameIdentifier	 fd
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"os.name"	TokenNameStringLiteral	os.name
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
"linux"	TokenNameStringLiteral	linux
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
posix_fadvise	TokenNameIdentifier	 posix fadvise
(	TokenNameLPAREN	
fd	TokenNameIdentifier	 fd
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
POSIX_FADV_DONTNEED	TokenNameIdentifier	 POSIX  FADV  DONTNEED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnsatisfiedLinkError	TokenNameIdentifier	 Unsatisfied Link Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if JNA is unavailable just skipping Direct I/O 	TokenNameCOMMENT_LINE	if JNA is unavailable just skipping Direct I/O 
// instance of this class will act like normal RandomAccessFile 	TokenNameCOMMENT_LINE	instance of this class will act like normal RandomAccessFile 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
tryFcntl	TokenNameIdentifier	 try Fcntl
(	TokenNameLPAREN	
int	TokenNameint	
fd	TokenNameIdentifier	 fd
,	TokenNameCOMMA	
int	TokenNameint	
command	TokenNameIdentifier	 command
,	TokenNameCOMMA	
int	TokenNameint	
flags	TokenNameIdentifier	 flags
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// fcntl return value may or may not be useful, depending on the command 	TokenNameCOMMENT_LINE	fcntl return value may or may not be useful, depending on the command 
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
CLibrary	TokenNameIdentifier	 C Library
.	TokenNameDOT	
fcntl	TokenNameIdentifier	 fcntl
(	TokenNameLPAREN	
fd	TokenNameIdentifier	 fd
,	TokenNameCOMMA	
command	TokenNameIdentifier	 command
,	TokenNameCOMMA	
flags	TokenNameIdentifier	 flags
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RuntimeException	TokenNameIdentifier	 Runtime Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
instanceof	TokenNameinstanceof	
LastErrorException	TokenNameIdentifier	 Last Error Exception
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"fcntl(%d, %d, %d) failed, errno (%d)."	TokenNameStringLiteral	fcntl(%d, %d, %d) failed, errno (%d).
,	TokenNameCOMMA	
fd	TokenNameIdentifier	 fd
,	TokenNameCOMMA	
command	TokenNameIdentifier	 command
,	TokenNameCOMMA	
flags	TokenNameIdentifier	 flags
,	TokenNameCOMMA	
CLibrary	TokenNameIdentifier	 C Library
.	TokenNameDOT	
errno	TokenNameIdentifier	 errno
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
tryOpenDirectory	TokenNameIdentifier	 try Open Directory
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
fd	TokenNameIdentifier	 fd
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
O_RDONLY	TokenNameIdentifier	 O  RDONLY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnsatisfiedLinkError	TokenNameIdentifier	 Unsatisfied Link Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// JNA is unavailable just skipping Direct I/O 	TokenNameCOMMENT_LINE	JNA is unavailable just skipping Direct I/O 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RuntimeException	TokenNameIdentifier	 Runtime Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
instanceof	TokenNameinstanceof	
LastErrorException	TokenNameIdentifier	 Last Error Exception
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"open(%s, O_RDONLY) failed, errno (%d)."	TokenNameStringLiteral	open(%s, O_RDONLY) failed, errno (%d).
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
CLibrary	TokenNameIdentifier	 C Library
.	TokenNameDOT	
errno	TokenNameIdentifier	 errno
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fd	TokenNameIdentifier	 fd
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
trySync	TokenNameIdentifier	 try Sync
(	TokenNameLPAREN	
int	TokenNameint	
fd	TokenNameIdentifier	 fd
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fd	TokenNameIdentifier	 fd
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
fsync	TokenNameIdentifier	 fsync
(	TokenNameLPAREN	
fd	TokenNameIdentifier	 fd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnsatisfiedLinkError	TokenNameIdentifier	 Unsatisfied Link Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// JNA is unavailable just skipping Direct I/O 	TokenNameCOMMENT_LINE	JNA is unavailable just skipping Direct I/O 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RuntimeException	TokenNameIdentifier	 Runtime Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
instanceof	TokenNameinstanceof	
LastErrorException	TokenNameIdentifier	 Last Error Exception
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"fsync(%d) failed, errno (%d)."	TokenNameStringLiteral	fsync(%d) failed, errno (%d).
,	TokenNameCOMMA	
fd	TokenNameIdentifier	 fd
,	TokenNameCOMMA	
CLibrary	TokenNameIdentifier	 C Library
.	TokenNameDOT	
errno	TokenNameIdentifier	 errno
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
tryCloseFD	TokenNameIdentifier	 try Close FD
(	TokenNameLPAREN	
int	TokenNameint	
fd	TokenNameIdentifier	 fd
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fd	TokenNameIdentifier	 fd
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
fd	TokenNameIdentifier	 fd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnsatisfiedLinkError	TokenNameIdentifier	 Unsatisfied Link Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// JNA is unavailable just skipping Direct I/O 	TokenNameCOMMENT_LINE	JNA is unavailable just skipping Direct I/O 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RuntimeException	TokenNameIdentifier	 Runtime Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
instanceof	TokenNameinstanceof	
LastErrorException	TokenNameIdentifier	 Last Error Exception
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"close(%d) failed, errno (%d)."	TokenNameStringLiteral	close(%d) failed, errno (%d).
,	TokenNameCOMMA	
fd	TokenNameIdentifier	 fd
,	TokenNameCOMMA	
CLibrary	TokenNameIdentifier	 C Library
.	TokenNameDOT	
errno	TokenNameIdentifier	 errno
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get system file descriptor from FileDescriptor object. * @param descriptor - FileDescriptor objec to get fd from * @return file descriptor, -1 or error */	TokenNameCOMMENT_JAVADOC	 Get system file descriptor from FileDescriptor object. @param descriptor - FileDescriptor objec to get fd from @return file descriptor, -1 or error 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
getfd	TokenNameIdentifier	 getfd
(	TokenNameLPAREN	
FileDescriptor	TokenNameIdentifier	 File Descriptor
descriptor	TokenNameIdentifier	 descriptor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Field	TokenNameIdentifier	 Field
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
getProtectedField	TokenNameIdentifier	 get Protected Field
(	TokenNameLPAREN	
descriptor	TokenNameIdentifier	 descriptor
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"fd"	TokenNameStringLiteral	fd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
getInt	TokenNameIdentifier	 get Int
(	TokenNameLPAREN	
descriptor	TokenNameIdentifier	 descriptor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"unable to read fd field from FileDescriptor"	TokenNameStringLiteral	unable to read fd field from FileDescriptor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
