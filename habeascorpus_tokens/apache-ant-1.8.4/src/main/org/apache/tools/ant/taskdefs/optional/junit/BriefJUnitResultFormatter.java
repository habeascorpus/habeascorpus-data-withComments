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
junit	TokenNameIdentifier	 junit
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
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStream	TokenNameIdentifier	 Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
StringWriter	TokenNameIdentifier	 String Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
NumberFormat	TokenNameIdentifier	 Number Format
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
AssertionFailedError	TokenNameIdentifier	 Assertion Failed Error
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
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
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringUtils	TokenNameIdentifier	 String Utils
;	TokenNameSEMICOLON	
/** * Prints plain text output of the test to a specified Writer. * Inspired by the PlainJUnitResultFormatter. * * @see FormatterElement * @see PlainJUnitResultFormatter */	TokenNameCOMMENT_JAVADOC	 Prints plain text output of the test to a specified Writer. Inspired by the PlainJUnitResultFormatter. * @see FormatterElement @see PlainJUnitResultFormatter 
public	TokenNamepublic	
class	TokenNameclass	
BriefJUnitResultFormatter	TokenNameIdentifier	 Brief J Unit Result Formatter
implements	TokenNameimplements	
JUnitResultFormatter	TokenNameIdentifier	 J Unit Result Formatter
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
ONE_SECOND	TokenNameIdentifier	 ONE  SECOND
=	TokenNameEQUAL	
1000.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
/** * Where to write the log to. */	TokenNameCOMMENT_JAVADOC	 Where to write the log to. 
private	TokenNameprivate	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
/** * Used for writing the results. */	TokenNameCOMMENT_JAVADOC	 Used for writing the results. 
private	TokenNameprivate	
BufferedWriter	TokenNameIdentifier	 Buffered Writer
output	TokenNameIdentifier	 output
;	TokenNameSEMICOLON	
/** * Used as part of formatting the results. */	TokenNameCOMMENT_JAVADOC	 Used as part of formatting the results. 
private	TokenNameprivate	
StringWriter	TokenNameIdentifier	 String Writer
results	TokenNameIdentifier	 results
;	TokenNameSEMICOLON	
/** * Used for writing formatted results to. */	TokenNameCOMMENT_JAVADOC	 Used for writing formatted results to. 
private	TokenNameprivate	
BufferedWriter	TokenNameIdentifier	 Buffered Writer
resultWriter	TokenNameIdentifier	 result Writer
;	TokenNameSEMICOLON	
/** * Formatter for timings. */	TokenNameCOMMENT_JAVADOC	 Formatter for timings. 
private	TokenNameprivate	
NumberFormat	TokenNameIdentifier	 Number Format
numberFormat	TokenNameIdentifier	 number Format
=	TokenNameEQUAL	
NumberFormat	TokenNameIdentifier	 Number Format
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Output suite has written to System.out */	TokenNameCOMMENT_JAVADOC	 Output suite has written to System.out 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
systemOutput	TokenNameIdentifier	 system Output
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Output suite has written to System.err */	TokenNameCOMMENT_JAVADOC	 Output suite has written to System.err 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
systemError	TokenNameIdentifier	 system Error
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Constructor for BriefJUnitResultFormatter. */	TokenNameCOMMENT_JAVADOC	 Constructor for BriefJUnitResultFormatter. 
public	TokenNamepublic	
BriefJUnitResultFormatter	TokenNameIdentifier	 Brief J Unit Result Formatter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
results	TokenNameIdentifier	 results
=	TokenNameEQUAL	
new	TokenNamenew	
StringWriter	TokenNameIdentifier	 String Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resultWriter	TokenNameIdentifier	 result Writer
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedWriter	TokenNameIdentifier	 Buffered Writer
(	TokenNameLPAREN	
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the stream the formatter is supposed to write its results to. * @param out the output stream to write to */	TokenNameCOMMENT_JAVADOC	 Sets the stream the formatter is supposed to write its results to. @param out the output stream to write to 
public	TokenNamepublic	
void	TokenNamevoid	
setOutput	TokenNameIdentifier	 set Output
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedWriter	TokenNameIdentifier	 Buffered Writer
(	TokenNameLPAREN	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStreamWriter	TokenNameIdentifier	 Output Stream Writer
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see JUnitResultFormatter#setSystemOutput(String) */	TokenNameCOMMENT_JAVADOC	 @see JUnitResultFormatter#setSystemOutput(String) 
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
public	TokenNamepublic	
void	TokenNamevoid	
setSystemOutput	TokenNameIdentifier	 set System Output
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
systemOutput	TokenNameIdentifier	 system Output
=	TokenNameEQUAL	
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see JUnitResultFormatter#setSystemError(String) */	TokenNameCOMMENT_JAVADOC	 @see JUnitResultFormatter#setSystemError(String) 
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
public	TokenNamepublic	
void	TokenNamevoid	
setSystemError	TokenNameIdentifier	 set System Error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
{	TokenNameLBRACE	
systemError	TokenNameIdentifier	 system Error
=	TokenNameEQUAL	
err	TokenNameIdentifier	 err
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The whole testsuite started. * @param suite the test suite */	TokenNameCOMMENT_JAVADOC	 The whole testsuite started. @param suite the test suite 
public	TokenNamepublic	
void	TokenNamevoid	
startTestSuite	TokenNameIdentifier	 start Test Suite
(	TokenNameLPAREN	
JUnitTest	TokenNameIdentifier	 J Unit Test
suite	TokenNameIdentifier	 suite
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// Quick return - no output do nothing. 	TokenNameCOMMENT_LINE	Quick return - no output do nothing. 
}	TokenNameRBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"Testsuite: "	TokenNameStringLiteral	Testsuite: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
suite	TokenNameIdentifier	 suite
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
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
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The whole testsuite ended. * @param suite the test suite */	TokenNameCOMMENT_JAVADOC	 The whole testsuite ended. @param suite the test suite 
public	TokenNamepublic	
void	TokenNamevoid	
endTestSuite	TokenNameIdentifier	 end Test Suite
(	TokenNameLPAREN	
JUnitTest	TokenNameIdentifier	 J Unit Test
suite	TokenNameIdentifier	 suite
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"Tests run: "	TokenNameStringLiteral	Tests run: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
suite	TokenNameIdentifier	 suite
.	TokenNameDOT	
runCount	TokenNameIdentifier	 run Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", Failures: "	TokenNameStringLiteral	, Failures: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
suite	TokenNameIdentifier	 suite
.	TokenNameDOT	
failureCount	TokenNameIdentifier	 failure Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", Errors: "	TokenNameStringLiteral	, Errors: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
suite	TokenNameIdentifier	 suite
.	TokenNameDOT	
errorCount	TokenNameIdentifier	 error Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", Time elapsed: "	TokenNameStringLiteral	, Time elapsed: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
numberFormat	TokenNameIdentifier	 number Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
suite	TokenNameIdentifier	 suite
.	TokenNameDOT	
getRunTime	TokenNameIdentifier	 get Run Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
ONE_SECOND	TokenNameIdentifier	 ONE  SECOND
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" sec"	TokenNameStringLiteral	 sec
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// append the err and output streams to the log 	TokenNameCOMMENT_LINE	append the err and output streams to the log 
if	TokenNameif	
(	TokenNameLPAREN	
systemOutput	TokenNameIdentifier	 system Output
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
systemOutput	TokenNameIdentifier	 system Output
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"------------- Standard Output ---------------"	TokenNameStringLiteral	------------- Standard Output ---------------
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
systemOutput	TokenNameIdentifier	 system Output
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"------------- ---------------- ---------------"	TokenNameStringLiteral	------------- ---------------- ---------------
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
systemError	TokenNameIdentifier	 system Error
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
systemError	TokenNameIdentifier	 system Error
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"------------- Standard Error -----------------"	TokenNameStringLiteral	------------- Standard Error -----------------
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
systemError	TokenNameIdentifier	 system Error
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"------------- ---------------- ---------------"	TokenNameStringLiteral	------------- ---------------- ---------------
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resultWriter	TokenNameIdentifier	 result Writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
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
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// swallow, there has likely been an exception before this 	TokenNameCOMMENT_LINE	swallow, there has likely been an exception before this 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
!=	TokenNameNOT_EQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
&&	TokenNameAND_AND	
out	TokenNameIdentifier	 out
!=	TokenNameNOT_EQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * A test started. * @param test a test */	TokenNameCOMMENT_JAVADOC	 A test started. @param test a test 
public	TokenNamepublic	
void	TokenNamevoid	
startTest	TokenNameIdentifier	 start Test
(	TokenNameLPAREN	
Test	TokenNameIdentifier	 Test
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * A test ended. * @param test a test */	TokenNameCOMMENT_JAVADOC	 A test ended. @param test a test 
public	TokenNamepublic	
void	TokenNamevoid	
endTest	TokenNameIdentifier	 end Test
(	TokenNameLPAREN	
Test	TokenNameIdentifier	 Test
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Interface TestListener for JUnit &lt;= 3.4. * * <p>A Test failed. * @param test a test * @param t the exception thrown by the test */	TokenNameCOMMENT_JAVADOC	 Interface TestListener for JUnit &lt;= 3.4. * <p>A Test failed. @param test a test @param t the exception thrown by the test 
public	TokenNamepublic	
void	TokenNamevoid	
addFailure	TokenNameIdentifier	 add Failure
(	TokenNameLPAREN	
Test	TokenNameIdentifier	 Test
test	TokenNameIdentifier	 test
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
formatError	TokenNameIdentifier	 format Error
(	TokenNameLPAREN	
" FAILED"	TokenNameStringLiteral	 FAILED
,	TokenNameCOMMA	
test	TokenNameIdentifier	 test
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Interface TestListener for JUnit &gt; 3.4. * * <p>A Test failed. * @param test a test * @param t the assertion failed by the test */	TokenNameCOMMENT_JAVADOC	 Interface TestListener for JUnit &gt; 3.4. * <p>A Test failed. @param test a test @param t the assertion failed by the test 
public	TokenNamepublic	
void	TokenNamevoid	
addFailure	TokenNameIdentifier	 add Failure
(	TokenNameLPAREN	
Test	TokenNameIdentifier	 Test
test	TokenNameIdentifier	 test
,	TokenNameCOMMA	
AssertionFailedError	TokenNameIdentifier	 Assertion Failed Error
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addFailure	TokenNameIdentifier	 add Failure
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
)	TokenNameRPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A test caused an error. * @param test a test * @param error the error thrown by the test */	TokenNameCOMMENT_JAVADOC	 A test caused an error. @param test a test @param error the error thrown by the test 
public	TokenNamepublic	
void	TokenNamevoid	
addError	TokenNameIdentifier	 add Error
(	TokenNameLPAREN	
Test	TokenNameIdentifier	 Test
test	TokenNameIdentifier	 test
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
formatError	TokenNameIdentifier	 format Error
(	TokenNameLPAREN	
" Caused an ERROR"	TokenNameStringLiteral	 Caused an ERROR
,	TokenNameCOMMA	
test	TokenNameIdentifier	 test
,	TokenNameCOMMA	
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Format the test for printing.. * @param test a test * @return the formatted testname */	TokenNameCOMMENT_JAVADOC	 Format the test for printing.. @param test a test @return the formatted testname 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
formatTest	TokenNameIdentifier	 format Test
(	TokenNameLPAREN	
Test	TokenNameIdentifier	 Test
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"Null Test: "	TokenNameStringLiteral	Null Test: 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
"Testcase: "	TokenNameStringLiteral	Testcase: 
+	TokenNamePLUS	
test	TokenNameIdentifier	 test
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Format an error and print it. * @param type the type of error * @param test the test that failed * @param error the exception that the test threw */	TokenNameCOMMENT_JAVADOC	 Format an error and print it. @param type the type of error @param test the test that failed @param error the exception that the test threw 
protected	TokenNameprotected	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
formatError	TokenNameIdentifier	 format Error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
Test	TokenNameIdentifier	 Test
test	TokenNameIdentifier	 test
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
endTest	TokenNameIdentifier	 end Test
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
resultWriter	TokenNameIdentifier	 result Writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
formatTest	TokenNameIdentifier	 format Test
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
+	TokenNamePLUS	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resultWriter	TokenNameIdentifier	 result Writer
.	TokenNameDOT	
newLine	TokenNameIdentifier	 new Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resultWriter	TokenNameIdentifier	 result Writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
error	TokenNameIdentifier	 error
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resultWriter	TokenNameIdentifier	 result Writer
.	TokenNameDOT	
newLine	TokenNameIdentifier	 new Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
strace	TokenNameIdentifier	 strace
=	TokenNameEQUAL	
JUnitTestRunner	TokenNameIdentifier	 J Unit Test Runner
.	TokenNameDOT	
getFilteredTrace	TokenNameIdentifier	 get Filtered Trace
(	TokenNameLPAREN	
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resultWriter	TokenNameIdentifier	 result Writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
strace	TokenNameIdentifier	 strace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resultWriter	TokenNameIdentifier	 result Writer
.	TokenNameDOT	
newLine	TokenNameIdentifier	 new Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resultWriter	TokenNameIdentifier	 result Writer
.	TokenNameDOT	
newLine	TokenNameIdentifier	 new Line
(	TokenNameLPAREN	
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
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
