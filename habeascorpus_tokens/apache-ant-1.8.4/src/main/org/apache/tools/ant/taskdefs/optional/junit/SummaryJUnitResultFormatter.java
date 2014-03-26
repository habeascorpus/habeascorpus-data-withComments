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
/** * Prints short summary output of the test to Ant's logging system. * */	TokenNameCOMMENT_JAVADOC	 Prints short summary output of the test to Ant's logging system. 
public	TokenNamepublic	
class	TokenNameclass	
SummaryJUnitResultFormatter	TokenNameIdentifier	 Summary J Unit Result Formatter
implements	TokenNameimplements	
JUnitResultFormatter	TokenNameIdentifier	 J Unit Result Formatter
,	TokenNameCOMMA	
JUnitTaskMirror	TokenNameIdentifier	 J Unit Task Mirror
.	TokenNameDOT	
SummaryJUnitResultFormatterMirror	TokenNameIdentifier	 Summary J Unit Result Formatter Mirror
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
ONE_SECOND	TokenNameIdentifier	 ONE  SECOND
=	TokenNameEQUAL	
1000.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
/** * Formatter for timings. */	TokenNameCOMMENT_JAVADOC	 Formatter for timings. 
private	TokenNameprivate	
NumberFormat	TokenNameIdentifier	 Number Format
nf	TokenNameIdentifier	 nf
=	TokenNameEQUAL	
NumberFormat	TokenNameIdentifier	 Number Format
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * OutputStream to write to. */	TokenNameCOMMENT_JAVADOC	 OutputStream to write to. 
private	TokenNameprivate	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
withOutAndErr	TokenNameIdentifier	 with Out And Err
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
systemOutput	TokenNameIdentifier	 system Output
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
systemError	TokenNameIdentifier	 system Error
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Empty */	TokenNameCOMMENT_JAVADOC	 Empty 
public	TokenNamepublic	
SummaryJUnitResultFormatter	TokenNameIdentifier	 Summary J Unit Result Formatter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * The testsuite started. * @param suite the testsuite. */	TokenNameCOMMENT_JAVADOC	 The testsuite started. @param suite the testsuite. 
public	TokenNamepublic	
void	TokenNamevoid	
startTestSuite	TokenNameIdentifier	 start Test Suite
(	TokenNameLPAREN	
JUnitTest	TokenNameIdentifier	 J Unit Test
suite	TokenNameIdentifier	 suite
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
newLine	TokenNameIdentifier	 new Line
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"Running "	TokenNameStringLiteral	Running 
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
newLine	TokenNameIdentifier	 new Line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioex	TokenNameIdentifier	 ioex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Unable to write summary output"	TokenNameStringLiteral	Unable to write summary output
,	TokenNameCOMMA	
ioex	TokenNameIdentifier	 ioex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Empty * @param t not used. */	TokenNameCOMMENT_JAVADOC	 Empty @param t not used. 
public	TokenNamepublic	
void	TokenNamevoid	
startTest	TokenNameIdentifier	 start Test
(	TokenNameLPAREN	
Test	TokenNameIdentifier	 Test
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Empty * @param test not used. */	TokenNameCOMMENT_JAVADOC	 Empty @param test not used. 
public	TokenNamepublic	
void	TokenNamevoid	
endTest	TokenNameIdentifier	 end Test
(	TokenNameLPAREN	
Test	TokenNameIdentifier	 Test
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Empty * @param test not used. * @param t not used. */	TokenNameCOMMENT_JAVADOC	 Empty @param test not used. @param t not used. 
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
}	TokenNameRBRACE	
/** * Interface TestListener for JUnit &gt; 3.4. * * <p>A Test failed. * @param test not used. * @param t not used. */	TokenNameCOMMENT_JAVADOC	 Interface TestListener for JUnit &gt; 3.4. * <p>A Test failed. @param test not used. @param t not used. 
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
/** * Empty * @param test not used. * @param t not used. */	TokenNameCOMMENT_JAVADOC	 Empty @param test not used. @param t not used. 
public	TokenNamepublic	
void	TokenNamevoid	
addError	TokenNameIdentifier	 add Error
(	TokenNameLPAREN	
Test	TokenNameIdentifier	 Test
test	TokenNameIdentifier	 test
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** {@inheritDoc}. */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc}. 
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
}	TokenNameRBRACE	
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
/** * Should the output to System.out and System.err be written to * the summary. * @param value if true write System.out and System.err to the summary. */	TokenNameCOMMENT_JAVADOC	 Should the output to System.out and System.err be written to the summary. @param value if true write System.out and System.err to the summary. 
public	TokenNamepublic	
void	TokenNamevoid	
setWithOutAndErr	TokenNameIdentifier	 set With Out And Err
(	TokenNameLPAREN	
boolean	TokenNameboolean	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
withOutAndErr	TokenNameIdentifier	 with Out And Err
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The whole testsuite ended. * @param suite the testsuite. * @throws BuildException if there is an error. */	TokenNameCOMMENT_JAVADOC	 The whole testsuite ended. @param suite the testsuite. @throws BuildException if there is an error. 
public	TokenNamepublic	
void	TokenNamevoid	
endTestSuite	TokenNameIdentifier	 end Test Suite
(	TokenNameLPAREN	
JUnitTest	TokenNameIdentifier	 J Unit Test
suite	TokenNameIdentifier	 suite
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
newLine	TokenNameIdentifier	 new Line
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
nf	TokenNameIdentifier	 nf
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
newLine	TokenNameIdentifier	 new Line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
withOutAndErr	TokenNameIdentifier	 with Out And Err
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
"Output:"	TokenNameStringLiteral	Output:
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
newLine	TokenNameIdentifier	 new Line
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
systemOutput	TokenNameIdentifier	 system Output
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
newLine	TokenNameIdentifier	 new Line
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
"Error: "	TokenNameStringLiteral	Error: 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
newLine	TokenNameIdentifier	 new Line
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
systemError	TokenNameIdentifier	 system Error
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
newLine	TokenNameIdentifier	 new Line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioex	TokenNameIdentifier	 ioex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Unable to write summary output"	TokenNameStringLiteral	Unable to write summary output
,	TokenNameCOMMA	
ioex	TokenNameIdentifier	 ioex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
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
try	TokenNametry	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
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
// ignore 	TokenNameCOMMENT_LINE	ignore 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
