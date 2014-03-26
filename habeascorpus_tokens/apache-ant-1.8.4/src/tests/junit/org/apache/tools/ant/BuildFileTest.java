/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
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
PrintStream	TokenNameIdentifier	 Print Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
/** * A BuildFileTest is a TestCase which executes targets from an Ant buildfile * for testing. * * This class provides a number of utility methods for particular build file * tests which extend this class. * */	TokenNameCOMMENT_JAVADOC	 A BuildFileTest is a TestCase which executes targets from an Ant buildfile for testing. * This class provides a number of utility methods for particular build file tests which extend this class. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
BuildFileTest	TokenNameIdentifier	 Build File Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
protected	TokenNameprotected	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
private	TokenNameprivate	
StringBuffer	TokenNameIdentifier	 String Buffer
logBuffer	TokenNameIdentifier	 log Buffer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
StringBuffer	TokenNameIdentifier	 String Buffer
fullLogBuffer	TokenNameIdentifier	 full Log Buffer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
StringBuffer	TokenNameIdentifier	 String Buffer
outBuffer	TokenNameIdentifier	 out Buffer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
StringBuffer	TokenNameIdentifier	 String Buffer
errBuffer	TokenNameIdentifier	 err Buffer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
BuildException	TokenNameIdentifier	 Build Exception
buildException	TokenNameIdentifier	 build Exception
;	TokenNameSEMICOLON	
/** * Default constructor for the BuildFileTest object. */	TokenNameCOMMENT_JAVADOC	 Default constructor for the BuildFileTest object. 
public	TokenNamepublic	
BuildFileTest	TokenNameIdentifier	 Build File Test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor for the BuildFileTest object. * * @param name string to pass up to TestCase constructor */	TokenNameCOMMENT_JAVADOC	 Constructor for the BuildFileTest object. * @param name string to pass up to TestCase constructor 
public	TokenNamepublic	
BuildFileTest	TokenNameIdentifier	 Build File Test
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Automatically calls the target called "tearDown" * from the build file tested if it exits. * * This allows to use Ant tasks directly in the build file * to clean up after each test. Note that no "setUp" target * is automatically called, since it's trivial to have a * test target depend on it. */	TokenNameCOMMENT_JAVADOC	 Automatically calls the target called "tearDown" from the build file tested if it exits. * This allows to use Ant tasks directly in the build file to clean up after each test. Note that no "setUp" target is automatically called, since it's trivial to have a test target depend on it. 
protected	TokenNameprotected	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* * Maybe the BuildFileTest was subclassed and there is * no initialized project. So we could avoid getting a * NPE. * If there is an initialized project getTargets() does * not return null as it is initialized by an empty * HashSet. */	TokenNameCOMMENT_BLOCK	 Maybe the BuildFileTest was subclassed and there is no initialized project. So we could avoid getting a NPE. If there is an initialized project getTargets() does not return null as it is initialized by an empty HashSet. 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
tearDown	TokenNameIdentifier	 tear Down
=	TokenNameEQUAL	
"tearDown"	TokenNameStringLiteral	tearDown
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getTargets	TokenNameIdentifier	 get Targets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
tearDown	TokenNameIdentifier	 tear Down
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
tearDown	TokenNameIdentifier	 tear Down
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * run a target, expect for any build exception * * @param target target to run * @param cause information string to reader of report */	TokenNameCOMMENT_JAVADOC	 run a target, expect for any build exception * @param target target to run @param cause information string to reader of report 
public	TokenNamepublic	
void	TokenNamevoid	
expectBuildException	TokenNameIdentifier	 expect Build Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectSpecificBuildException	TokenNameIdentifier	 expect Specific Build Exception
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
cause	TokenNameIdentifier	 cause
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Assert that only the given message has been logged with a * priority &lt;= INFO when running the given target. */	TokenNameCOMMENT_JAVADOC	 Assert that only the given message has been logged with a priority &lt;= INFO when running the given target. 
public	TokenNamepublic	
void	TokenNamevoid	
expectLog	TokenNameIdentifier	 expect Log
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
log	TokenNameIdentifier	 log
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
realLog	TokenNameIdentifier	 real Log
=	TokenNameEQUAL	
getLog	TokenNameIdentifier	 get Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
log	TokenNameIdentifier	 log
,	TokenNameCOMMA	
realLog	TokenNameIdentifier	 real Log
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Assert that the given substring is in the log messages. */	TokenNameCOMMENT_JAVADOC	 Assert that the given substring is in the log messages. 
public	TokenNamepublic	
void	TokenNamevoid	
assertLogContaining	TokenNameIdentifier	 assert Log Containing
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
substring	TokenNameIdentifier	 substring
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
realLog	TokenNameIdentifier	 real Log
=	TokenNameEQUAL	
getLog	TokenNameIdentifier	 get Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"expecting log to contain ""	TokenNameStringLiteral	expecting log to contain "
+	TokenNamePLUS	
substring	TokenNameIdentifier	 substring
+	TokenNamePLUS	
"" log was ""	TokenNameStringLiteral	" log was "
+	TokenNamePLUS	
realLog	TokenNameIdentifier	 real Log
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
,	TokenNameCOMMA	
realLog	TokenNameIdentifier	 real Log
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
substring	TokenNameIdentifier	 substring
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Assert that the given substring is not in the log messages. */	TokenNameCOMMENT_JAVADOC	 Assert that the given substring is not in the log messages. 
public	TokenNamepublic	
void	TokenNamevoid	
assertLogNotContaining	TokenNameIdentifier	 assert Log Not Containing
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
substring	TokenNameIdentifier	 substring
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
realLog	TokenNameIdentifier	 real Log
=	TokenNameEQUAL	
getLog	TokenNameIdentifier	 get Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"didn't expect log to contain ""	TokenNameStringLiteral	didn't expect log to contain "
+	TokenNamePLUS	
substring	TokenNameIdentifier	 substring
+	TokenNamePLUS	
"" log was ""	TokenNameStringLiteral	" log was "
+	TokenNamePLUS	
realLog	TokenNameIdentifier	 real Log
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
,	TokenNameCOMMA	
realLog	TokenNameIdentifier	 real Log
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
substring	TokenNameIdentifier	 substring
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Assert that the given substring is in the output messages. * @since Ant1.7 */	TokenNameCOMMENT_JAVADOC	 Assert that the given substring is in the output messages. @since Ant1.7 
public	TokenNamepublic	
void	TokenNamevoid	
assertOutputContaining	TokenNameIdentifier	 assert Output Containing
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
substring	TokenNameIdentifier	 substring
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertOutputContaining	TokenNameIdentifier	 assert Output Containing
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
substring	TokenNameIdentifier	 substring
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Assert that the given substring is in the output messages. * @param message Print this message if the test fails. Defaults to * a meaningful text if <tt>null</tt> is passed. * @since Ant1.7 */	TokenNameCOMMENT_JAVADOC	 Assert that the given substring is in the output messages. @param message Print this message if the test fails. Defaults to a meaningful text if <tt>null</tt> is passed. @since Ant1.7 
public	TokenNamepublic	
void	TokenNamevoid	
assertOutputContaining	TokenNameIdentifier	 assert Output Containing
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
substring	TokenNameIdentifier	 substring
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
realOutput	TokenNameIdentifier	 real Output
=	TokenNameEQUAL	
getOutput	TokenNameIdentifier	 get Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
realMessage	TokenNameIdentifier	 real Message
=	TokenNameEQUAL	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
message	TokenNameIdentifier	 message
:	TokenNameCOLON	
"expecting output to contain ""	TokenNameStringLiteral	expecting output to contain "
+	TokenNamePLUS	
substring	TokenNameIdentifier	 substring
+	TokenNamePLUS	
"" output was ""	TokenNameStringLiteral	" output was "
+	TokenNamePLUS	
realOutput	TokenNameIdentifier	 real Output
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
realMessage	TokenNameIdentifier	 real Message
,	TokenNameCOMMA	
realOutput	TokenNameIdentifier	 real Output
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
substring	TokenNameIdentifier	 substring
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Assert that the given substring is not in the output messages. * @param message Print this message if the test fails. Defaults to * a meaningful text if <tt>null</tt> is passed. * @since Ant1.7 */	TokenNameCOMMENT_JAVADOC	 Assert that the given substring is not in the output messages. @param message Print this message if the test fails. Defaults to a meaningful text if <tt>null</tt> is passed. @since Ant1.7 
public	TokenNamepublic	
void	TokenNamevoid	
assertOutputNotContaining	TokenNameIdentifier	 assert Output Not Containing
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
substring	TokenNameIdentifier	 substring
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
realOutput	TokenNameIdentifier	 real Output
=	TokenNameEQUAL	
getOutput	TokenNameIdentifier	 get Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
realMessage	TokenNameIdentifier	 real Message
=	TokenNameEQUAL	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
message	TokenNameIdentifier	 message
:	TokenNameCOLON	
"expecting output to not contain ""	TokenNameStringLiteral	expecting output to not contain "
+	TokenNamePLUS	
substring	TokenNameIdentifier	 substring
+	TokenNamePLUS	
"" output was ""	TokenNameStringLiteral	" output was "
+	TokenNamePLUS	
realOutput	TokenNameIdentifier	 real Output
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
realMessage	TokenNameIdentifier	 real Message
,	TokenNameCOMMA	
realOutput	TokenNameIdentifier	 real Output
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
substring	TokenNameIdentifier	 substring
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Assert that the given message has been logged with a priority &lt;= INFO when running the * given target. */	TokenNameCOMMENT_JAVADOC	 Assert that the given message has been logged with a priority &lt;= INFO when running the given target. 
public	TokenNamepublic	
void	TokenNamevoid	
expectLogContaining	TokenNameIdentifier	 expect Log Containing
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
log	TokenNameIdentifier	 log
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertLogContaining	TokenNameIdentifier	 assert Log Containing
(	TokenNameLPAREN	
log	TokenNameIdentifier	 log
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Assert that the given message has not been logged with a * priority &lt;= INFO when running the given target. */	TokenNameCOMMENT_JAVADOC	 Assert that the given message has not been logged with a priority &lt;= INFO when running the given target. 
public	TokenNamepublic	
void	TokenNamevoid	
expectLogNotContaining	TokenNameIdentifier	 expect Log Not Containing
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
log	TokenNameIdentifier	 log
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertLogNotContaining	TokenNameIdentifier	 assert Log Not Containing
(	TokenNameLPAREN	
log	TokenNameIdentifier	 log
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the log the BuildFileTest object. * Only valid if configureProject() has been called. * * @pre logBuffer!=null * @return The log value */	TokenNameCOMMENT_JAVADOC	 Gets the log the BuildFileTest object. Only valid if configureProject() has been called. * @pre logBuffer!=null @return The log value 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLog	TokenNameIdentifier	 get Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
logBuffer	TokenNameIdentifier	 log Buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Assert that the given message has been logged with a priority * &gt;= VERBOSE when running the given target. */	TokenNameCOMMENT_JAVADOC	 Assert that the given message has been logged with a priority &gt;= VERBOSE when running the given target. 
public	TokenNamepublic	
void	TokenNamevoid	
expectDebuglog	TokenNameIdentifier	 expect Debuglog
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
log	TokenNameIdentifier	 log
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
realLog	TokenNameIdentifier	 real Log
=	TokenNameEQUAL	
getFullLog	TokenNameIdentifier	 get Full Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
log	TokenNameIdentifier	 log
,	TokenNameCOMMA	
realLog	TokenNameIdentifier	 real Log
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Assert that the given substring is in the log messages. */	TokenNameCOMMENT_JAVADOC	 Assert that the given substring is in the log messages. 
public	TokenNamepublic	
void	TokenNamevoid	
assertDebuglogContaining	TokenNameIdentifier	 assert Debuglog Containing
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
substring	TokenNameIdentifier	 substring
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
realLog	TokenNameIdentifier	 real Log
=	TokenNameEQUAL	
getFullLog	TokenNameIdentifier	 get Full Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"expecting debug log to contain ""	TokenNameStringLiteral	expecting debug log to contain "
+	TokenNamePLUS	
substring	TokenNameIdentifier	 substring
+	TokenNamePLUS	
"" log was ""	TokenNameStringLiteral	" log was "
+	TokenNamePLUS	
realLog	TokenNameIdentifier	 real Log
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
,	TokenNameCOMMA	
realLog	TokenNameIdentifier	 real Log
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
substring	TokenNameIdentifier	 substring
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the log the BuildFileTest object. * * Only valid if configureProject() has been called. * * @pre fullLogBuffer!=null * @return The log value */	TokenNameCOMMENT_JAVADOC	 Gets the log the BuildFileTest object. * Only valid if configureProject() has been called. * @pre fullLogBuffer!=null @return The log value 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getFullLog	TokenNameIdentifier	 get Full Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fullLogBuffer	TokenNameIdentifier	 full Log Buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * execute the target, verify output matches expectations * * @param target target to execute * @param output output to look for */	TokenNameCOMMENT_JAVADOC	 execute the target, verify output matches expectations * @param target target to execute @param output output to look for 
public	TokenNamepublic	
void	TokenNamevoid	
expectOutput	TokenNameIdentifier	 expect Output
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
realOutput	TokenNameIdentifier	 real Output
=	TokenNameEQUAL	
getOutput	TokenNameIdentifier	 get Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
realOutput	TokenNameIdentifier	 real Output
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Executes the target, verify output matches expectations * and that we got the named error at the end * * @param target target to execute * @param output output to look for * @param error Description of Parameter */	TokenNameCOMMENT_JAVADOC	 Executes the target, verify output matches expectations and that we got the named error at the end * @param target target to execute @param output output to look for @param error Description of Parameter 
public	TokenNamepublic	
void	TokenNamevoid	
expectOutputAndError	TokenNameIdentifier	 expect Output And Error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
realOutput	TokenNameIdentifier	 real Output
=	TokenNameEQUAL	
getOutput	TokenNameIdentifier	 get Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
realOutput	TokenNameIdentifier	 real Output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
realError	TokenNameIdentifier	 real Error
=	TokenNameEQUAL	
getError	TokenNameIdentifier	 get Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
error	TokenNameIdentifier	 error
,	TokenNameCOMMA	
realError	TokenNameIdentifier	 real Error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOutput	TokenNameIdentifier	 get Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cleanBuffer	TokenNameIdentifier	 clean Buffer
(	TokenNameLPAREN	
outBuffer	TokenNameIdentifier	 out Buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getError	TokenNameIdentifier	 get Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cleanBuffer	TokenNameIdentifier	 clean Buffer
(	TokenNameLPAREN	
errBuffer	TokenNameIdentifier	 err Buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
BuildException	TokenNameIdentifier	 Build Exception
getBuildException	TokenNameIdentifier	 get Build Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
buildException	TokenNameIdentifier	 build Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
cleanBuffer	TokenNameIdentifier	 clean Buffer
(	TokenNameLPAREN	
StringBuffer	TokenNameIdentifier	 String Buffer
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
cleanedBuffer	TokenNameIdentifier	 cleaned Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
!=	TokenNameNOT_EQUAL	
'\r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cleanedBuffer	TokenNameIdentifier	 cleaned Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
cleanedBuffer	TokenNameIdentifier	 cleaned Buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets up to run the named project * * @param filename name of project file to run */	TokenNameCOMMENT_JAVADOC	 Sets up to run the named project * @param filename name of project file to run 
public	TokenNamepublic	
void	TokenNamevoid	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets up to run the named project * * @param filename name of project file to run */	TokenNameCOMMENT_JAVADOC	 Sets up to run the named project * @param filename name of project file to run 
public	TokenNamepublic	
void	TokenNamevoid	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
int	TokenNameint	
logLevel	TokenNameIdentifier	 log Level
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
logBuffer	TokenNameIdentifier	 log Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fullLogBuffer	TokenNameIdentifier	 full Log Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
new	TokenNamenew	
Project	TokenNameIdentifier	 Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
antFile	TokenNameIdentifier	 ant File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"root"	TokenNameStringLiteral	root
)	TokenNameRPAREN	
,	TokenNameCOMMA	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
setUserProperty	TokenNameIdentifier	 set User Property
(	TokenNameLPAREN	
"ant.file"	TokenNameStringLiteral	ant.file
,	TokenNameCOMMA	
antFile	TokenNameIdentifier	 ant File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addBuildListener	TokenNameIdentifier	 add Build Listener
(	TokenNameLPAREN	
new	TokenNamenew	
AntTestListener	TokenNameIdentifier	 Ant Test Listener
(	TokenNameLPAREN	
logLevel	TokenNameIdentifier	 log Level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ProjectHelper	TokenNameIdentifier	 Project Helper
.	TokenNameDOT	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
antFile	TokenNameIdentifier	 ant File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Executes a target we have set up * * @pre configureProject has been called * @param targetName target to run */	TokenNameCOMMENT_JAVADOC	 Executes a target we have set up * @pre configureProject has been called @param targetName target to run 
public	TokenNamepublic	
void	TokenNamevoid	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
targetName	TokenNameIdentifier	 target Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PrintStream	TokenNameIdentifier	 Print Stream
sysOut	TokenNameIdentifier	 sys Out
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
PrintStream	TokenNameIdentifier	 Print Stream
sysErr	TokenNameIdentifier	 sys Err
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
sysOut	TokenNameIdentifier	 sys Out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sysErr	TokenNameIdentifier	 sys Err
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outBuffer	TokenNameIdentifier	 out Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PrintStream	TokenNameIdentifier	 Print Stream
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
PrintStream	TokenNameIdentifier	 Print Stream
(	TokenNameLPAREN	
new	TokenNamenew	
AntOutputStream	TokenNameIdentifier	 Ant Output Stream
(	TokenNameLPAREN	
outBuffer	TokenNameIdentifier	 out Buffer
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setOut	TokenNameIdentifier	 set Out
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
errBuffer	TokenNameIdentifier	 err Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PrintStream	TokenNameIdentifier	 Print Stream
err	TokenNameIdentifier	 err
=	TokenNameEQUAL	
new	TokenNamenew	
PrintStream	TokenNameIdentifier	 Print Stream
(	TokenNameLPAREN	
new	TokenNamenew	
AntOutputStream	TokenNameIdentifier	 Ant Output Stream
(	TokenNameLPAREN	
errBuffer	TokenNameIdentifier	 err Buffer
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setErr	TokenNameIdentifier	 set Err
(	TokenNameLPAREN	
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logBuffer	TokenNameIdentifier	 log Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fullLogBuffer	TokenNameIdentifier	 full Log Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buildException	TokenNameIdentifier	 build Exception
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
targetName	TokenNameIdentifier	 target Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setOut	TokenNameIdentifier	 set Out
(	TokenNameLPAREN	
sysOut	TokenNameIdentifier	 sys Out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setErr	TokenNameIdentifier	 set Err
(	TokenNameLPAREN	
sysErr	TokenNameIdentifier	 sys Err
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the project which has been configured for a test. * * @return the Project instance for this test. */	TokenNameCOMMENT_JAVADOC	 Get the project which has been configured for a test. * @return the Project instance for this test. 
public	TokenNamepublic	
Project	TokenNameIdentifier	 Project
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the directory of the project. * * @return the base dir of the project */	TokenNameCOMMENT_JAVADOC	 Gets the directory of the project. * @return the base dir of the project 
public	TokenNamepublic	
File	TokenNameIdentifier	 File
getProjectDir	TokenNameIdentifier	 get Project Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Runs a target, wait for a build exception. * * @param target target to run * @param cause information string to reader of report * @param msg the message value of the build exception we are waiting * for set to null for any build exception to be valid */	TokenNameCOMMENT_JAVADOC	 Runs a target, wait for a build exception. * @param target target to run @param cause information string to reader of report @param msg the message value of the build exception we are waiting for set to null for any build exception to be valid 
public	TokenNamepublic	
void	TokenNamevoid	
expectSpecificBuildException	TokenNameIdentifier	 expect Specific Build Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
cause	TokenNameIdentifier	 cause
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
BuildException	TokenNameIdentifier	 Build Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buildException	TokenNameIdentifier	 build Exception
=	TokenNameEQUAL	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
!	TokenNameNOT	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Should throw BuildException because '"	TokenNameStringLiteral	Should throw BuildException because '
+	TokenNamePLUS	
cause	TokenNameIdentifier	 cause
+	TokenNamePLUS	
"' with message '"	TokenNameStringLiteral	' with message '
+	TokenNamePLUS	
msg	TokenNameIdentifier	 msg
+	TokenNamePLUS	
"' (actual message '"	TokenNameStringLiteral	' (actual message '
+	TokenNamePLUS	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"' instead)"	TokenNameStringLiteral	' instead)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Should throw BuildException because: "	TokenNameStringLiteral	Should throw BuildException because: 
+	TokenNamePLUS	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * run a target, expect an exception string * containing the substring we look for (case sensitive match) * * @param target target to run * @param cause information string to reader of report * @param contains substring of the build exception to look for */	TokenNameCOMMENT_JAVADOC	 run a target, expect an exception string containing the substring we look for (case sensitive match) * @param target target to run @param cause information string to reader of report @param contains substring of the build exception to look for 
public	TokenNamepublic	
void	TokenNamevoid	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
cause	TokenNameIdentifier	 cause
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
contains	TokenNameIdentifier	 contains
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
BuildException	TokenNameIdentifier	 Build Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buildException	TokenNameIdentifier	 build Exception
=	TokenNameEQUAL	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
contains	TokenNameIdentifier	 contains
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
contains	TokenNameIdentifier	 contains
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Should throw BuildException because '"	TokenNameStringLiteral	Should throw BuildException because '
+	TokenNamePLUS	
cause	TokenNameIdentifier	 cause
+	TokenNamePLUS	
"' with message containing '"	TokenNameStringLiteral	' with message containing '
+	TokenNamePLUS	
contains	TokenNameIdentifier	 contains
+	TokenNamePLUS	
"' (actual message '"	TokenNameStringLiteral	' (actual message '
+	TokenNamePLUS	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"' instead)"	TokenNameStringLiteral	' instead)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Should throw BuildException because: "	TokenNameStringLiteral	Should throw BuildException because: 
+	TokenNamePLUS	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * call a target, verify property is as expected * * @param target build file target * @param property property name * @param value expected value */	TokenNameCOMMENT_JAVADOC	 call a target, verify property is as expected * @param target build file target @param property property name @param value expected value 
public	TokenNamepublic	
void	TokenNamevoid	
expectPropertySet	TokenNameIdentifier	 expect Property Set
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
property	TokenNameIdentifier	 property
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertPropertyEquals	TokenNameIdentifier	 assert Property Equals
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * assert that a property equals a value; comparison is case sensitive. * * @param property property name * @param value expected value */	TokenNameCOMMENT_JAVADOC	 assert that a property equals a value; comparison is case sensitive. * @param property property name @param value expected value 
public	TokenNamepublic	
void	TokenNamevoid	
assertPropertyEquals	TokenNameIdentifier	 assert Property Equals
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
property	TokenNameIdentifier	 property
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"property "	TokenNameStringLiteral	property 
+	TokenNamePLUS	
property	TokenNameIdentifier	 property
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * assert that a property equals "true". * * @param property property name */	TokenNameCOMMENT_JAVADOC	 assert that a property equals "true". * @param property property name 
public	TokenNamepublic	
void	TokenNamevoid	
assertPropertySet	TokenNameIdentifier	 assert Property Set
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertPropertyEquals	TokenNameIdentifier	 assert Property Equals
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
,	TokenNameCOMMA	
"true"	TokenNameStringLiteral	true
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * assert that a property is null. * * @param property property name */	TokenNameCOMMENT_JAVADOC	 assert that a property is null. * @param property property name 
public	TokenNamepublic	
void	TokenNamevoid	
assertPropertyUnset	TokenNameIdentifier	 assert Property Unset
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Expected property "	TokenNameStringLiteral	Expected property 
+	TokenNamePLUS	
property	TokenNameIdentifier	 property
+	TokenNamePLUS	
" to be unset, but it is set to the value: "	TokenNameStringLiteral	 to be unset, but it is set to the value: 
+	TokenNamePLUS	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * call a target, verify named property is "true". * * @param target build file target * @param property property name */	TokenNameCOMMENT_JAVADOC	 call a target, verify named property is "true". * @param target build file target @param property property name 
public	TokenNamepublic	
void	TokenNamevoid	
expectPropertySet	TokenNameIdentifier	 expect Property Set
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertySet	TokenNameIdentifier	 expect Property Set
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
property	TokenNameIdentifier	 property
,	TokenNameCOMMA	
"true"	TokenNameStringLiteral	true
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Call a target, verify property is null. * * @param target build file target * @param property property name */	TokenNameCOMMENT_JAVADOC	 Call a target, verify property is null. * @param target build file target @param property property name 
public	TokenNamepublic	
void	TokenNamevoid	
expectPropertyUnset	TokenNameIdentifier	 expect Property Unset
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertySet	TokenNameIdentifier	 expect Property Set
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
property	TokenNameIdentifier	 property
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieve a resource from the caller classloader to avoid * assuming a vm working directory. The resource path must be * relative to the package name or absolute from the root path. * * @param resource the resource to retrieve its url. * @throws junit.framework.AssertionFailedError if the resource is not found. */	TokenNameCOMMENT_JAVADOC	 Retrieve a resource from the caller classloader to avoid assuming a vm working directory. The resource path must be relative to the package name or absolute from the root path. * @param resource the resource to retrieve its url. @throws junit.framework.AssertionFailedError if the resource is not found. 
public	TokenNamepublic	
URL	TokenNameIdentifier	 URL
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
{	TokenNameLBRACE	
URL	TokenNameIdentifier	 URL
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"Could not find resource :"	TokenNameStringLiteral	Could not find resource :
+	TokenNamePLUS	
resource	TokenNameIdentifier	 resource
,	TokenNameCOMMA	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
url	TokenNameIdentifier	 url
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * an output stream which saves stuff to our buffer. */	TokenNameCOMMENT_JAVADOC	 an output stream which saves stuff to our buffer. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
AntOutputStream	TokenNameIdentifier	 Ant Output Stream
extends	TokenNameextends	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStream	TokenNameIdentifier	 Output Stream
{	TokenNameLBRACE	
private	TokenNameprivate	
StringBuffer	TokenNameIdentifier	 String Buffer
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
public	TokenNamepublic	
AntOutputStream	TokenNameIdentifier	 Ant Output Stream
(	TokenNameLPAREN	
StringBuffer	TokenNameIdentifier	 String Buffer
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
int	TokenNameint	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Our own personal build listener. */	TokenNameCOMMENT_JAVADOC	 Our own personal build listener. 
private	TokenNameprivate	
class	TokenNameclass	
AntTestListener	TokenNameIdentifier	 Ant Test Listener
implements	TokenNameimplements	
BuildListener	TokenNameIdentifier	 Build Listener
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
logLevel	TokenNameIdentifier	 log Level
;	TokenNameSEMICOLON	
/** * Constructs a test listener which will ignore log events * above the given level. */	TokenNameCOMMENT_JAVADOC	 Constructs a test listener which will ignore log events above the given level. 
public	TokenNamepublic	
AntTestListener	TokenNameIdentifier	 Ant Test Listener
(	TokenNameLPAREN	
int	TokenNameint	
logLevel	TokenNameIdentifier	 log Level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
logLevel	TokenNameIdentifier	 log Level
=	TokenNameEQUAL	
logLevel	TokenNameIdentifier	 log Level
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Fired before any targets are started. */	TokenNameCOMMENT_JAVADOC	 Fired before any targets are started. 
public	TokenNamepublic	
void	TokenNamevoid	
buildStarted	TokenNameIdentifier	 build Started
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Fired after the last target has finished. This event * will still be thrown if an error occurred during the build. * * @see BuildEvent#getException() */	TokenNameCOMMENT_JAVADOC	 Fired after the last target has finished. This event will still be thrown if an error occurred during the build. * @see BuildEvent#getException() 
public	TokenNamepublic	
void	TokenNamevoid	
buildFinished	TokenNameIdentifier	 build Finished
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Fired when a target is started. * * @see BuildEvent#getTarget() */	TokenNameCOMMENT_JAVADOC	 Fired when a target is started. * @see BuildEvent#getTarget() 
public	TokenNamepublic	
void	TokenNamevoid	
targetStarted	TokenNameIdentifier	 target Started
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("targetStarted " + event.getTarget().getName()); 	TokenNameCOMMENT_LINE	System.out.println("targetStarted " + event.getTarget().getName()); 
}	TokenNameRBRACE	
/** * Fired when a target has finished. This event will * still be thrown if an error occurred during the build. * * @see BuildEvent#getException() */	TokenNameCOMMENT_JAVADOC	 Fired when a target has finished. This event will still be thrown if an error occurred during the build. * @see BuildEvent#getException() 
public	TokenNamepublic	
void	TokenNamevoid	
targetFinished	TokenNameIdentifier	 target Finished
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("targetFinished " + event.getTarget().getName()); 	TokenNameCOMMENT_LINE	System.out.println("targetFinished " + event.getTarget().getName()); 
}	TokenNameRBRACE	
/** * Fired when a task is started. * * @see BuildEvent#getTask() */	TokenNameCOMMENT_JAVADOC	 Fired when a task is started. * @see BuildEvent#getTask() 
public	TokenNamepublic	
void	TokenNamevoid	
taskStarted	TokenNameIdentifier	 task Started
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("taskStarted " + event.getTask().getTaskName()); 	TokenNameCOMMENT_LINE	System.out.println("taskStarted " + event.getTask().getTaskName()); 
}	TokenNameRBRACE	
/** * Fired when a task has finished. This event will still * be throw if an error occurred during the build. * * @see BuildEvent#getException() */	TokenNameCOMMENT_JAVADOC	 Fired when a task has finished. This event will still be throw if an error occurred during the build. * @see BuildEvent#getException() 
public	TokenNamepublic	
void	TokenNamevoid	
taskFinished	TokenNameIdentifier	 task Finished
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("taskFinished " + event.getTask().getTaskName()); 	TokenNameCOMMENT_LINE	System.out.println("taskFinished " + event.getTask().getTaskName()); 
}	TokenNameRBRACE	
/** * Fired whenever a message is logged. * * @see BuildEvent#getMessage() * @see BuildEvent#getPriority() */	TokenNameCOMMENT_JAVADOC	 Fired whenever a message is logged. * @see BuildEvent#getMessage() @see BuildEvent#getPriority() 
public	TokenNamepublic	
void	TokenNamevoid	
messageLogged	TokenNameIdentifier	 message Logged
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getPriority	TokenNameIdentifier	 get Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
logLevel	TokenNameIdentifier	 log Level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore event 	TokenNameCOMMENT_LINE	ignore event 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getPriority	TokenNameIdentifier	 get Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
||	TokenNameOR_OR	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getPriority	TokenNameIdentifier	 get Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
||	TokenNameOR_OR	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getPriority	TokenNameIdentifier	 get Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_ERR	TokenNameIdentifier	 MSG  ERR
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logBuffer	TokenNameIdentifier	 log Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fullLogBuffer	TokenNameIdentifier	 full Log Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
