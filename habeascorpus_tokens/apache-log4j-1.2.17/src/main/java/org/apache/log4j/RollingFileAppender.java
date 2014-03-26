/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
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
Writer	TokenNameIdentifier	 Writer
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
InterruptedIOException	TokenNameIdentifier	 Interrupted IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
OptionConverter	TokenNameIdentifier	 Option Converter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
LogLog	TokenNameIdentifier	 Log Log
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
CountingQuietWriter	TokenNameIdentifier	 Counting Quiet Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
LoggingEvent	TokenNameIdentifier	 Logging Event
;	TokenNameSEMICOLON	
/** RollingFileAppender extends FileAppender to backup the log files when they reach a certain size. The log4j extras companion includes alternatives which should be considered for new deployments and which are discussed in the documentation for org.apache.log4j.rolling.RollingFileAppender. @author Heinz Richter @author Ceki G&uuml;lc&uuml; */	TokenNameCOMMENT_JAVADOC	 RollingFileAppender extends FileAppender to backup the log files when they reach a certain size. The log4j extras companion includes alternatives which should be considered for new deployments and which are discussed in the documentation for org.apache.log4j.rolling.RollingFileAppender. @author Heinz Richter @author Ceki G&uuml;lc&uuml; 
public	TokenNamepublic	
class	TokenNameclass	
RollingFileAppender	TokenNameIdentifier	 Rolling File Appender
extends	TokenNameextends	
FileAppender	TokenNameIdentifier	 File Appender
{	TokenNameLBRACE	
/** The default maximum file size is 10MB. */	TokenNameCOMMENT_JAVADOC	 The default maximum file size is 10MB. 
protected	TokenNameprotected	
long	TokenNamelong	
maxFileSize	TokenNameIdentifier	 max File Size
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** There is one backup file by default. */	TokenNameCOMMENT_JAVADOC	 There is one backup file by default. 
protected	TokenNameprotected	
int	TokenNameint	
maxBackupIndex	TokenNameIdentifier	 max Backup Index
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
nextRollover	TokenNameIdentifier	 next Rollover
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The default constructor simply calls its {@link FileAppender#FileAppender parents constructor}. */	TokenNameCOMMENT_JAVADOC	 The default constructor simply calls its {@link FileAppender#FileAppender parents constructor}. 
public	TokenNamepublic	
RollingFileAppender	TokenNameIdentifier	 Rolling File Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Instantiate a RollingFileAppender and open the file designated by <code>filename</code>. The opened filename will become the ouput destination for this appender. <p>If the <code>append</code> parameter is true, the file will be appended to. Otherwise, the file desginated by <code>filename</code> will be truncated before being opened. */	TokenNameCOMMENT_JAVADOC	 Instantiate a RollingFileAppender and open the file designated by <code>filename</code>. The opened filename will become the ouput destination for this appender. <p>If the <code>append</code> parameter is true, the file will be appended to. Otherwise, the file desginated by <code>filename</code> will be truncated before being opened. 
public	TokenNamepublic	
RollingFileAppender	TokenNameIdentifier	 Rolling File Appender
(	TokenNameLPAREN	
Layout	TokenNameIdentifier	 Layout
layout	TokenNameIdentifier	 layout
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
boolean	TokenNameboolean	
append	TokenNameIdentifier	 append
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
,	TokenNameCOMMA	
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
append	TokenNameIdentifier	 append
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Instantiate a FileAppender and open the file designated by <code>filename</code>. The opened filename will become the output destination for this appender. <p>The file will be appended to. */	TokenNameCOMMENT_JAVADOC	 Instantiate a FileAppender and open the file designated by <code>filename</code>. The opened filename will become the output destination for this appender. <p>The file will be appended to. 
public	TokenNamepublic	
RollingFileAppender	TokenNameIdentifier	 Rolling File Appender
(	TokenNameLPAREN	
Layout	TokenNameIdentifier	 Layout
layout	TokenNameIdentifier	 layout
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
,	TokenNameCOMMA	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the value of the <b>MaxBackupIndex</b> option. */	TokenNameCOMMENT_JAVADOC	 Returns the value of the <b>MaxBackupIndex</b> option. 
public	TokenNamepublic	
int	TokenNameint	
getMaxBackupIndex	TokenNameIdentifier	 get Max Backup Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxBackupIndex	TokenNameIdentifier	 max Backup Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Get the maximum size that the output file is allowed to reach before being rolled over to backup files. @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Get the maximum size that the output file is allowed to reach before being rolled over to backup files. @since 1.1 
public	TokenNamepublic	
long	TokenNamelong	
getMaximumFileSize	TokenNameIdentifier	 get Maximum File Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxFileSize	TokenNameIdentifier	 max File Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Implements the usual roll over behaviour. <p>If <code>MaxBackupIndex</code> is positive, then files {<code>File.1</code>, ..., <code>File.MaxBackupIndex -1</code>} are renamed to {<code>File.2</code>, ..., <code>File.MaxBackupIndex</code>}. Moreover, <code>File</code> is renamed <code>File.1</code> and closed. A new <code>File</code> is created to receive further log output. <p>If <code>MaxBackupIndex</code> is equal to zero, then the <code>File</code> is truncated with no backup files created. */	TokenNameCOMMENT_JAVADOC	 Implements the usual roll over behaviour. <p>If <code>MaxBackupIndex</code> is positive, then files {<code>File.1</code>, ..., <code>File.MaxBackupIndex -1</code>} are renamed to {<code>File.2</code>, ..., <code>File.MaxBackupIndex</code>}. Moreover, <code>File</code> is renamed <code>File.1</code> and closed. A new <code>File</code> is created to receive further log output. <p>If <code>MaxBackupIndex</code> is equal to zero, then the <code>File</code> is truncated with no backup files created. 
public	TokenNamepublic	
// synchronization not necessary since doAppend is alreasy synched 	TokenNameCOMMENT_LINE	synchronization not necessary since doAppend is alreasy synched 
void	TokenNamevoid	
rollOver	TokenNameIdentifier	 roll Over
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
qw	TokenNameIdentifier	 qw
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CountingQuietWriter	TokenNameIdentifier	 Counting Quiet Writer
)	TokenNameRPAREN	
qw	TokenNameIdentifier	 qw
)	TokenNameRPAREN	
.	TokenNameDOT	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"rolling over count="	TokenNameStringLiteral	rolling over count=
+	TokenNamePLUS	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if operation fails, do not roll again until 	TokenNameCOMMENT_LINE	if operation fails, do not roll again until 
// maxFileSize more bytes are written 	TokenNameCOMMENT_LINE	maxFileSize more bytes are written 
nextRollover	TokenNameIdentifier	 next Rollover
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
+	TokenNamePLUS	
maxFileSize	TokenNameIdentifier	 max File Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"maxBackupIndex="	TokenNameStringLiteral	maxBackupIndex=
+	TokenNamePLUS	
maxBackupIndex	TokenNameIdentifier	 max Backup Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
renameSucceeded	TokenNameIdentifier	 rename Succeeded
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// If maxBackups <= 0, then there is no file renaming to be done. 	TokenNameCOMMENT_LINE	If maxBackups <= 0, then there is no file renaming to be done. 
if	TokenNameif	
(	TokenNameLPAREN	
maxBackupIndex	TokenNameIdentifier	 max Backup Index
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Delete the oldest file, to keep Windows happy. 	TokenNameCOMMENT_LINE	Delete the oldest file, to keep Windows happy. 
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
'.'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
maxBackupIndex	TokenNameIdentifier	 max Backup Index
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
renameSucceeded	TokenNameIdentifier	 rename Succeeded
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Map {(maxBackupIndex - 1), ..., 2, 1} to {maxBackupIndex, ..., 3, 2} 	TokenNameCOMMENT_LINE	Map {(maxBackupIndex - 1), ..., 2, 1} to {maxBackupIndex, ..., 3, 2} 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
maxBackupIndex	TokenNameIdentifier	 max Backup Index
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
renameSucceeded	TokenNameIdentifier	 rename Succeeded
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
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
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
'.'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Renaming file "	TokenNameStringLiteral	Renaming file 
+	TokenNamePLUS	
file	TokenNameIdentifier	 file
+	TokenNamePLUS	
" to "	TokenNameStringLiteral	 to 
+	TokenNamePLUS	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
renameSucceeded	TokenNameIdentifier	 rename Succeeded
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
renameTo	TokenNameIdentifier	 rename To
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
renameSucceeded	TokenNameIdentifier	 rename Succeeded
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Rename fileName to fileName.1 	TokenNameCOMMENT_LINE	Rename fileName to fileName.1 
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
closeFile	TokenNameIdentifier	 close File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// keep windows happy. 	TokenNameCOMMENT_LINE	keep windows happy. 
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Renaming file "	TokenNameStringLiteral	Renaming file 
+	TokenNamePLUS	
file	TokenNameIdentifier	 file
+	TokenNamePLUS	
" to "	TokenNameStringLiteral	 to 
+	TokenNamePLUS	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
renameSucceeded	TokenNameIdentifier	 rename Succeeded
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
renameTo	TokenNameIdentifier	 rename To
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// if file rename failed, reopen file with append = true 	TokenNameCOMMENT_LINE	if file rename failed, reopen file with append = true 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
renameSucceeded	TokenNameIdentifier	 rename Succeeded
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
bufferedIO	TokenNameIdentifier	 buffered IO
,	TokenNameCOMMA	
bufferSize	TokenNameIdentifier	 buffer Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
instanceof	TokenNameinstanceof	
InterruptedIOException	TokenNameIdentifier	 Interrupted IO Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
interrupt	TokenNameIdentifier	 interrupt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"setFile("	TokenNameStringLiteral	setFile(
+	TokenNamePLUS	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
", true) call failed."	TokenNameStringLiteral	, true) call failed.
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// if all renames were successful, then 	TokenNameCOMMENT_LINE	if all renames were successful, then 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
renameSucceeded	TokenNameIdentifier	 rename Succeeded
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// This will also close the file. This is OK since multiple 	TokenNameCOMMENT_LINE	This will also close the file. This is OK since multiple 
// close operations are safe. 	TokenNameCOMMENT_LINE	close operations are safe. 
this	TokenNamethis	
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
bufferedIO	TokenNameIdentifier	 buffered IO
,	TokenNameCOMMA	
bufferSize	TokenNameIdentifier	 buffer Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextRollover	TokenNameIdentifier	 next Rollover
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
instanceof	TokenNameinstanceof	
InterruptedIOException	TokenNameIdentifier	 Interrupted IO Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
interrupt	TokenNameIdentifier	 interrupt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"setFile("	TokenNameStringLiteral	setFile(
+	TokenNamePLUS	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
", false) call failed."	TokenNameStringLiteral	, false) call failed.
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
append	TokenNameIdentifier	 append
,	TokenNameCOMMA	
boolean	TokenNameboolean	
bufferedIO	TokenNameIdentifier	 buffered IO
,	TokenNameCOMMA	
int	TokenNameint	
bufferSize	TokenNameIdentifier	 buffer Size
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
,	TokenNameCOMMA	
append	TokenNameIdentifier	 append
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
bufferedIO	TokenNameIdentifier	 buffered IO
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
bufferSize	TokenNameIdentifier	 buffer Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
append	TokenNameIdentifier	 append
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CountingQuietWriter	TokenNameIdentifier	 Counting Quiet Writer
)	TokenNameRPAREN	
qw	TokenNameIdentifier	 qw
)	TokenNameRPAREN	
.	TokenNameDOT	
setCount	TokenNameIdentifier	 set Count
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Set the maximum number of backup files to keep around. <p>The <b>MaxBackupIndex</b> option determines how many backup files are kept before the oldest is erased. This option takes a positive integer value. If set to zero, then there will be no backup files and the log file will be truncated when it reaches <code>MaxFileSize</code>. */	TokenNameCOMMENT_JAVADOC	 Set the maximum number of backup files to keep around. <p>The <b>MaxBackupIndex</b> option determines how many backup files are kept before the oldest is erased. This option takes a positive integer value. If set to zero, then there will be no backup files and the log file will be truncated when it reaches <code>MaxFileSize</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
setMaxBackupIndex	TokenNameIdentifier	 set Max Backup Index
(	TokenNameLPAREN	
int	TokenNameint	
maxBackups	TokenNameIdentifier	 max Backups
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
maxBackupIndex	TokenNameIdentifier	 max Backup Index
=	TokenNameEQUAL	
maxBackups	TokenNameIdentifier	 max Backups
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Set the maximum size that the output file is allowed to reach before being rolled over to backup files. <p>This method is equivalent to {@link #setMaxFileSize} except that it is required for differentiating the setter taking a <code>long</code> argument from the setter taking a <code>String</code> argument by the JavaBeans {@link java.beans.Introspector Introspector}. @see #setMaxFileSize(String) */	TokenNameCOMMENT_JAVADOC	 Set the maximum size that the output file is allowed to reach before being rolled over to backup files. <p>This method is equivalent to {@link #setMaxFileSize} except that it is required for differentiating the setter taking a <code>long</code> argument from the setter taking a <code>String</code> argument by the JavaBeans {@link java.beans.Introspector Introspector}. @see #setMaxFileSize(String) 
public	TokenNamepublic	
void	TokenNamevoid	
setMaximumFileSize	TokenNameIdentifier	 set Maximum File Size
(	TokenNameLPAREN	
long	TokenNamelong	
maxFileSize	TokenNameIdentifier	 max File Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
maxFileSize	TokenNameIdentifier	 max File Size
=	TokenNameEQUAL	
maxFileSize	TokenNameIdentifier	 max File Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Set the maximum size that the output file is allowed to reach before being rolled over to backup files. <p>In configuration files, the <b>MaxFileSize</b> option takes an long integer in the range 0 - 2^63. You can specify the value with the suffixes "KB", "MB" or "GB" so that the integer is interpreted being expressed respectively in kilobytes, megabytes or gigabytes. For example, the value "10KB" will be interpreted as 10240. */	TokenNameCOMMENT_JAVADOC	 Set the maximum size that the output file is allowed to reach before being rolled over to backup files. <p>In configuration files, the <b>MaxFileSize</b> option takes an long integer in the range 0 - 2^63. You can specify the value with the suffixes "KB", "MB" or "GB" so that the integer is interpreted being expressed respectively in kilobytes, megabytes or gigabytes. For example, the value "10KB" will be interpreted as 10240. 
public	TokenNamepublic	
void	TokenNamevoid	
setMaxFileSize	TokenNameIdentifier	 set Max File Size
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maxFileSize	TokenNameIdentifier	 max File Size
=	TokenNameEQUAL	
OptionConverter	TokenNameIdentifier	 Option Converter
.	TokenNameDOT	
toFileSize	TokenNameIdentifier	 to File Size
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
maxFileSize	TokenNameIdentifier	 max File Size
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
setQWForFiles	TokenNameIdentifier	 set QW For Files
(	TokenNameLPAREN	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
qw	TokenNameIdentifier	 qw
=	TokenNameEQUAL	
new	TokenNamenew	
CountingQuietWriter	TokenNameIdentifier	 Counting Quiet Writer
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
errorHandler	TokenNameIdentifier	 error Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** This method differentiates RollingFileAppender from its super class. @since 0.9.0 */	TokenNameCOMMENT_JAVADOC	 This method differentiates RollingFileAppender from its super class. @since 0.9.0 
protected	TokenNameprotected	
void	TokenNamevoid	
subAppend	TokenNameIdentifier	 sub Append
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
subAppend	TokenNameIdentifier	 sub Append
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
qw	TokenNameIdentifier	 qw
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CountingQuietWriter	TokenNameIdentifier	 Counting Quiet Writer
)	TokenNameRPAREN	
qw	TokenNameIdentifier	 qw
)	TokenNameRPAREN	
.	TokenNameDOT	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
>=	TokenNameGREATER_EQUAL	
maxFileSize	TokenNameIdentifier	 max File Size
&&	TokenNameAND_AND	
size	TokenNameIdentifier	 size
>=	TokenNameGREATER_EQUAL	
nextRollover	TokenNameIdentifier	 next Rollover
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rollOver	TokenNameIdentifier	 roll Over
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
