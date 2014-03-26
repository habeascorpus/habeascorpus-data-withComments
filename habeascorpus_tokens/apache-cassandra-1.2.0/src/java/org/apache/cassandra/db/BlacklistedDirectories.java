/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
CopyOnWriteArraySet	TokenNameIdentifier	 Copy On Write Array Set
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
BlacklistedDirectories	TokenNameIdentifier	 Blacklisted Directories
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
BlacklistedDirectories	TokenNameIdentifier	 Blacklisted Directories
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
File	TokenNameIdentifier	 File
>	TokenNameGREATER	
unreadableDirectories	TokenNameIdentifier	 unreadable Directories
=	TokenNameEQUAL	
new	TokenNamenew	
CopyOnWriteArraySet	TokenNameIdentifier	 Copy On Write Array Set
<	TokenNameLESS	
File	TokenNameIdentifier	 File
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
File	TokenNameIdentifier	 File
>	TokenNameGREATER	
unwritableDirectories	TokenNameIdentifier	 unwritable Directories
=	TokenNameEQUAL	
new	TokenNamenew	
CopyOnWriteArraySet	TokenNameIdentifier	 Copy On Write Array Set
<	TokenNameLESS	
File	TokenNameIdentifier	 File
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Adds parent directory of the file (or the file itself, if it is a directory) * to the set of unreadable directories. * * @return the blacklisted directory or null if nothing has been added to the list. */	TokenNameCOMMENT_JAVADOC	 Adds parent directory of the file (or the file itself, if it is a directory) to the set of unreadable directories. * @return the blacklisted directory or null if nothing has been added to the list. 
public	TokenNamepublic	
static	TokenNamestatic	
File	TokenNameIdentifier	 File
maybeMarkUnreadable	TokenNameIdentifier	 maybe Mark Unreadable
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
directory	TokenNameIdentifier	 directory
=	TokenNameEQUAL	
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
unreadableDirectories	TokenNameIdentifier	 unreadable Directories
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Blacklisting {} for reads"	TokenNameStringLiteral	Blacklisting {} for reads
,	TokenNameCOMMA	
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds parent directory of the file (or the file itself, if it is a directory) * to the set of unwritable directories. * * @return the blacklisted directory or null if nothing has been added to the list. */	TokenNameCOMMENT_JAVADOC	 Adds parent directory of the file (or the file itself, if it is a directory) to the set of unwritable directories. * @return the blacklisted directory or null if nothing has been added to the list. 
public	TokenNamepublic	
static	TokenNamestatic	
File	TokenNameIdentifier	 File
maybeMarkUnwritable	TokenNameIdentifier	 maybe Mark Unwritable
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
directory	TokenNameIdentifier	 directory
=	TokenNameEQUAL	
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
unwritableDirectories	TokenNameIdentifier	 unwritable Directories
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Blacklisting {} for writes"	TokenNameStringLiteral	Blacklisting {} for writes
,	TokenNameCOMMA	
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tells whether or not the directory is blacklisted for reads. * @return whether or not the directory is blacklisted for reads. */	TokenNameCOMMENT_JAVADOC	 Tells whether or not the directory is blacklisted for reads. @return whether or not the directory is blacklisted for reads. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isUnreadable	TokenNameIdentifier	 is Unreadable
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
unreadableDirectories	TokenNameIdentifier	 unreadable Directories
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tells whether or not the directory is blacklisted for writes. * @return whether or not the directory is blacklisted for reads. */	TokenNameCOMMENT_JAVADOC	 Tells whether or not the directory is blacklisted for writes. @return whether or not the directory is blacklisted for reads. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isUnwritable	TokenNameIdentifier	 is Unwritable
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
unwritableDirectories	TokenNameIdentifier	 unwritable Directories
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
File	TokenNameIdentifier	 File
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
isFile	TokenNameIdentifier	 is File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getParentFile	TokenNameIdentifier	 get Parent File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// the file with path cannot be read - try determining the directory manually. 	TokenNameCOMMENT_LINE	the file with path cannot be read - try determining the directory manually. 
if	TokenNameif	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
".db"	TokenNameStringLiteral	.db
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getParentFile	TokenNameIdentifier	 get Parent File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"Unable to parse directory from path "	TokenNameStringLiteral	Unable to parse directory from path 
+	TokenNamePLUS	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
