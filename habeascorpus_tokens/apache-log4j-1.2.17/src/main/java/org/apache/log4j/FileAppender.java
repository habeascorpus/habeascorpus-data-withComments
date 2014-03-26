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
BufferedWriter	TokenNameIdentifier	 Buffered Writer
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
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileOutputStream	TokenNameIdentifier	 File Output Stream
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
InterruptedIOException	TokenNameIdentifier	 Interrupted IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
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
QuietWriter	TokenNameIdentifier	 Quiet Writer
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
ErrorCode	TokenNameIdentifier	 Error Code
;	TokenNameSEMICOLON	
// Contibutors: Jens Uwe Pipka <jens.pipka@gmx.de> 	TokenNameCOMMENT_LINE	Contibutors: Jens Uwe Pipka <jens.pipka@gmx.de> 
// Ben Sandee 	TokenNameCOMMENT_LINE	Ben Sandee 
/** * FileAppender appends log events to a file. * * <p>Support for <code>java.io.Writer</code> and console appending * has been deprecated and then removed. See the replacement * solutions: {@link WriterAppender} and {@link ConsoleAppender}. * * @author Ceki G&uuml;lc&uuml; * */	TokenNameCOMMENT_JAVADOC	 FileAppender appends log events to a file. * <p>Support for <code>java.io.Writer</code> and console appending has been deprecated and then removed. See the replacement solutions: {@link WriterAppender} and {@link ConsoleAppender}. * @author Ceki G&uuml;lc&uuml; 
public	TokenNamepublic	
class	TokenNameclass	
FileAppender	TokenNameIdentifier	 File Appender
extends	TokenNameextends	
WriterAppender	TokenNameIdentifier	 Writer Appender
{	TokenNameLBRACE	
/** Controls file truncatation. The default value for this variable * is <code>true</code>, meaning that by default a * <code>FileAppender</code> will append to an existing file and not * truncate it. * * <p>This option is meaningful only if the FileAppender opens the * file. */	TokenNameCOMMENT_JAVADOC	 Controls file truncatation. The default value for this variable is <code>true</code>, meaning that by default a <code>FileAppender</code> will append to an existing file and not truncate it. * <p>This option is meaningful only if the FileAppender opens the file. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
fileAppend	TokenNameIdentifier	 file Append
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** The name of the log file. */	TokenNameCOMMENT_JAVADOC	 The name of the log file. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Do we do bufferedIO? */	TokenNameCOMMENT_JAVADOC	 Do we do bufferedIO? 
protected	TokenNameprotected	
boolean	TokenNameboolean	
bufferedIO	TokenNameIdentifier	 buffered IO
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Determines the size of IO buffer be. Default is 8K. */	TokenNameCOMMENT_JAVADOC	 Determines the size of IO buffer be. Default is 8K. 
protected	TokenNameprotected	
int	TokenNameint	
bufferSize	TokenNameIdentifier	 buffer Size
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The default constructor does not do anything. */	TokenNameCOMMENT_JAVADOC	 The default constructor does not do anything. 
public	TokenNamepublic	
FileAppender	TokenNameIdentifier	 File Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** Instantiate a <code>FileAppender</code> and open the file designated by <code>filename</code>. The opened filename will become the output destination for this appender. <p>If the <code>append</code> parameter is true, the file will be appended to. Otherwise, the file designated by <code>filename</code> will be truncated before being opened. <p>If the <code>bufferedIO</code> parameter is <code>true</code>, then buffered IO will be used to write to the output file. */	TokenNameCOMMENT_JAVADOC	 Instantiate a <code>FileAppender</code> and open the file designated by <code>filename</code>. The opened filename will become the output destination for this appender. <p>If the <code>append</code> parameter is true, the file will be appended to. Otherwise, the file designated by <code>filename</code> will be truncated before being opened. <p>If the <code>bufferedIO</code> parameter is <code>true</code>, then buffered IO will be used to write to the output file. 
public	TokenNamepublic	
FileAppender	TokenNameIdentifier	 File Appender
(	TokenNameLPAREN	
Layout	TokenNameIdentifier	 Layout
layout	TokenNameIdentifier	 layout
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
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
this	TokenNamethis	
.	TokenNameDOT	
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
layout	TokenNameIdentifier	 layout
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
append	TokenNameIdentifier	 append
,	TokenNameCOMMA	
bufferedIO	TokenNameIdentifier	 buffered IO
,	TokenNameCOMMA	
bufferSize	TokenNameIdentifier	 buffer Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Instantiate a FileAppender and open the file designated by <code>filename</code>. The opened filename will become the output destination for this appender. <p>If the <code>append</code> parameter is true, the file will be appended to. Otherwise, the file designated by <code>filename</code> will be truncated before being opened. */	TokenNameCOMMENT_JAVADOC	 Instantiate a FileAppender and open the file designated by <code>filename</code>. The opened filename will become the output destination for this appender. <p>If the <code>append</code> parameter is true, the file will be appended to. Otherwise, the file designated by <code>filename</code> will be truncated before being opened. 
public	TokenNamepublic	
FileAppender	TokenNameIdentifier	 File Appender
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
this	TokenNamethis	
.	TokenNameDOT	
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
layout	TokenNameIdentifier	 layout
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
append	TokenNameIdentifier	 append
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
bufferSize	TokenNameIdentifier	 buffer Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Instantiate a FileAppender and open the file designated by <code>filename</code>. The opened filename will become the output destination for this appender. <p>The file will be appended to. */	TokenNameCOMMENT_JAVADOC	 Instantiate a FileAppender and open the file designated by <code>filename</code>. The opened filename will become the output destination for this appender. <p>The file will be appended to. 
public	TokenNamepublic	
FileAppender	TokenNameIdentifier	 File Appender
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
this	TokenNamethis	
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
,	TokenNameCOMMA	
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The <b>File</b> property takes a string value which should be the name of the file to append to. <p><font color="#DD0044"><b>Note that the special values "System.out" or "System.err" are no longer honored.</b></font> <p>Note: Actual opening of the file is made when {@link #activateOptions} is called, not when the options are set. */	TokenNameCOMMENT_JAVADOC	 The <b>File</b> property takes a string value which should be the name of the file to append to. <p><font color="#DD0044"><b>Note that the special values "System.out" or "System.err" are no longer honored.</b></font> <p>Note: Actual opening of the file is made when {@link #activateOptions} is called, not when the options are set. 
public	TokenNamepublic	
void	TokenNamevoid	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Trim spaces from both ends. The users probably does not want 	TokenNameCOMMENT_LINE	Trim spaces from both ends. The users probably does not want 
// trailing spaces in file names. 	TokenNameCOMMENT_LINE	trailing spaces in file names. 
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the value of the <b>Append</b> option. */	TokenNameCOMMENT_JAVADOC	 Returns the value of the <b>Append</b> option. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getAppend	TokenNameIdentifier	 get Append
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fileAppend	TokenNameIdentifier	 file Append
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the value of the <b>File</b> option. */	TokenNameCOMMENT_JAVADOC	 Returns the value of the <b>File</b> option. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fileName	TokenNameIdentifier	 file Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** If the value of <b>File</b> is not <code>null</code>, then {@link #setFile} is called with the values of <b>File</b> and <b>Append</b> properties. @since 0.8.1 */	TokenNameCOMMENT_JAVADOC	 If the value of <b>File</b> is not <code>null</code>, then {@link #setFile} is called with the values of <b>File</b> and <b>Append</b> properties. @since 0.8.1 
public	TokenNamepublic	
void	TokenNamevoid	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
,	TokenNameCOMMA	
fileAppend	TokenNameIdentifier	 file Append
,	TokenNameCOMMA	
bufferedIO	TokenNameIdentifier	 buffered IO
,	TokenNameCOMMA	
bufferSize	TokenNameIdentifier	 buffer Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"setFile("	TokenNameStringLiteral	setFile(
+	TokenNamePLUS	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
fileAppend	TokenNameIdentifier	 file Append
+	TokenNamePLUS	
") call failed."	TokenNameStringLiteral	) call failed.
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
ErrorCode	TokenNameIdentifier	 Error Code
.	TokenNameDOT	
FILE_OPEN_FAILURE	TokenNameIdentifier	 FILE  OPEN  FAILURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
//LogLog.error("File option not set for appender ["+name+"]."); 	TokenNameCOMMENT_LINE	LogLog.error("File option not set for appender ["+name+"]."); 
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"File option not set for appender ["	TokenNameStringLiteral	File option not set for appender [
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Are you using FileAppender instead of ConsoleAppender?"	TokenNameStringLiteral	Are you using FileAppender instead of ConsoleAppender?
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Closes the previously opened file. */	TokenNameCOMMENT_JAVADOC	 Closes the previously opened file. 
protected	TokenNameprotected	
void	TokenNamevoid	
closeFile	TokenNameIdentifier	 close File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
qw	TokenNameIdentifier	 qw
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
qw	TokenNameIdentifier	 qw
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
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
// Exceptionally, it does not make sense to delegate to an 	TokenNameCOMMENT_LINE	Exceptionally, it does not make sense to delegate to an 
// ErrorHandler. Since a closed appender is basically dead. 	TokenNameCOMMENT_LINE	ErrorHandler. Since a closed appender is basically dead. 
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Could not close "	TokenNameStringLiteral	Could not close 
+	TokenNamePLUS	
qw	TokenNameIdentifier	 qw
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Get the value of the <b>BufferedIO</b> option. <p>BufferedIO will significatnly increase performance on heavily loaded systems. */	TokenNameCOMMENT_JAVADOC	 Get the value of the <b>BufferedIO</b> option. <p>BufferedIO will significatnly increase performance on heavily loaded systems. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getBufferedIO	TokenNameIdentifier	 get Buffered IO
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
bufferedIO	TokenNameIdentifier	 buffered IO
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Get the size of the IO buffer. */	TokenNameCOMMENT_JAVADOC	 Get the size of the IO buffer. 
public	TokenNamepublic	
int	TokenNameint	
getBufferSize	TokenNameIdentifier	 get Buffer Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
bufferSize	TokenNameIdentifier	 buffer Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The <b>Append</b> option takes a boolean value. It is set to <code>true</code> by default. If true, then <code>File</code> will be opened in append mode by {@link #setFile setFile} (see above). Otherwise, {@link #setFile setFile} will open <code>File</code> in truncate mode. <p>Note: Actual opening of the file is made when {@link #activateOptions} is called, not when the options are set. */	TokenNameCOMMENT_JAVADOC	 The <b>Append</b> option takes a boolean value. It is set to <code>true</code> by default. If true, then <code>File</code> will be opened in append mode by {@link #setFile setFile} (see above). Otherwise, {@link #setFile setFile} will open <code>File</code> in truncate mode. <p>Note: Actual opening of the file is made when {@link #activateOptions} is called, not when the options are set. 
public	TokenNamepublic	
void	TokenNamevoid	
setAppend	TokenNameIdentifier	 set Append
(	TokenNameLPAREN	
boolean	TokenNameboolean	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fileAppend	TokenNameIdentifier	 file Append
=	TokenNameEQUAL	
flag	TokenNameIdentifier	 flag
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The <b>BufferedIO</b> option takes a boolean value. It is set to <code>false</code> by default. If true, then <code>File</code> will be opened and the resulting {@link java.io.Writer} wrapped around a {@link BufferedWriter}. BufferedIO will significatnly increase performance on heavily loaded systems. */	TokenNameCOMMENT_JAVADOC	 The <b>BufferedIO</b> option takes a boolean value. It is set to <code>false</code> by default. If true, then <code>File</code> will be opened and the resulting {@link java.io.Writer} wrapped around a {@link BufferedWriter}. BufferedIO will significatnly increase performance on heavily loaded systems. 
public	TokenNamepublic	
void	TokenNamevoid	
setBufferedIO	TokenNameIdentifier	 set Buffered IO
(	TokenNameLPAREN	
boolean	TokenNameboolean	
bufferedIO	TokenNameIdentifier	 buffered IO
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
bufferedIO	TokenNameIdentifier	 buffered IO
=	TokenNameEQUAL	
bufferedIO	TokenNameIdentifier	 buffered IO
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bufferedIO	TokenNameIdentifier	 buffered IO
)	TokenNameRPAREN	
{	TokenNameLBRACE	
immediateFlush	TokenNameIdentifier	 immediate Flush
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Set the size of the IO buffer. */	TokenNameCOMMENT_JAVADOC	 Set the size of the IO buffer. 
public	TokenNamepublic	
void	TokenNamevoid	
setBufferSize	TokenNameIdentifier	 set Buffer Size
(	TokenNameLPAREN	
int	TokenNameint	
bufferSize	TokenNameIdentifier	 buffer Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
bufferSize	TokenNameIdentifier	 buffer Size
=	TokenNameEQUAL	
bufferSize	TokenNameIdentifier	 buffer Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** <p>Sets and <i>opens</i> the file where the log output will go. The specified file must be writable. <p>If there was already an opened file, then the previous file is closed first. <p><b>Do not use this method directly. To configure a FileAppender or one of its subclasses, set its properties one by one and then call activateOptions.</b> @param fileName The path to the log file. @param append If true will append to fileName. Otherwise will truncate fileName. */	TokenNameCOMMENT_JAVADOC	 <p>Sets and <i>opens</i> the file where the log output will go. The specified file must be writable. <p>If there was already an opened file, then the previous file is closed first. <p><b>Do not use this method directly. To configure a FileAppender or one of its subclasses, set its properties one by one and then call activateOptions.</b> @param fileName The path to the log file. @param append If true will append to fileName. Otherwise will truncate fileName. 
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
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"setFile called: "	TokenNameStringLiteral	setFile called: 
+	TokenNamePLUS	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
append	TokenNameIdentifier	 append
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// It does not make sense to have immediate flush and bufferedIO. 	TokenNameCOMMENT_LINE	It does not make sense to have immediate flush and bufferedIO. 
if	TokenNameif	
(	TokenNameLPAREN	
bufferedIO	TokenNameIdentifier	 buffered IO
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setImmediateFlush	TokenNameIdentifier	 set Immediate Flush
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileOutputStream	TokenNameIdentifier	 File Output Stream
ostream	TokenNameIdentifier	 ostream
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// attempt to create file 	TokenNameCOMMENT_LINE	attempt to create file 
// 	TokenNameCOMMENT_LINE	 
ostream	TokenNameIdentifier	 ostream
=	TokenNameEQUAL	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
,	TokenNameCOMMA	
append	TokenNameIdentifier	 append
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// if parent directory does not exist then 	TokenNameCOMMENT_LINE	if parent directory does not exist then 
// attempt to create it and try to create file 	TokenNameCOMMENT_LINE	attempt to create it and try to create file 
// see bug 9150 	TokenNameCOMMENT_LINE	see bug 9150 
// 	TokenNameCOMMENT_LINE	 
String	TokenNameIdentifier	 String
parentName	TokenNameIdentifier	 parent Name
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parentName	TokenNameIdentifier	 parent Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
parentDir	TokenNameIdentifier	 parent Dir
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
parentName	TokenNameIdentifier	 parent Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
parentDir	TokenNameIdentifier	 parent Dir
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
parentDir	TokenNameIdentifier	 parent Dir
.	TokenNameDOT	
mkdirs	TokenNameIdentifier	 mkdirs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ostream	TokenNameIdentifier	 ostream
=	TokenNameEQUAL	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
,	TokenNameCOMMA	
append	TokenNameIdentifier	 append
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
Writer	TokenNameIdentifier	 Writer
fw	TokenNameIdentifier	 fw
=	TokenNameEQUAL	
createWriter	TokenNameIdentifier	 create Writer
(	TokenNameLPAREN	
ostream	TokenNameIdentifier	 ostream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bufferedIO	TokenNameIdentifier	 buffered IO
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fw	TokenNameIdentifier	 fw
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedWriter	TokenNameIdentifier	 Buffered Writer
(	TokenNameLPAREN	
fw	TokenNameIdentifier	 fw
,	TokenNameCOMMA	
bufferSize	TokenNameIdentifier	 buffer Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
setQWForFiles	TokenNameIdentifier	 set QW For Files
(	TokenNameLPAREN	
fw	TokenNameIdentifier	 fw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
fileName	TokenNameIdentifier	 file Name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fileAppend	TokenNameIdentifier	 file Append
=	TokenNameEQUAL	
append	TokenNameIdentifier	 append
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bufferedIO	TokenNameIdentifier	 buffered IO
=	TokenNameEQUAL	
bufferedIO	TokenNameIdentifier	 buffered IO
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bufferSize	TokenNameIdentifier	 buffer Size
=	TokenNameEQUAL	
bufferSize	TokenNameIdentifier	 buffer Size
;	TokenNameSEMICOLON	
writeHeader	TokenNameIdentifier	 write Header
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"setFile ended"	TokenNameStringLiteral	setFile ended
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Sets the quiet writer being used. This method is overriden by {@link RollingFileAppender}. */	TokenNameCOMMENT_JAVADOC	 Sets the quiet writer being used. This method is overriden by {@link RollingFileAppender}. 
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
QuietWriter	TokenNameIdentifier	 Quiet Writer
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
errorHandler	TokenNameIdentifier	 error Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Close any previously opened file and call the parent's <code>reset</code>. */	TokenNameCOMMENT_JAVADOC	 Close any previously opened file and call the parent's <code>reset</code>. 
protected	TokenNameprotected	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
closeFile	TokenNameIdentifier	 close File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
