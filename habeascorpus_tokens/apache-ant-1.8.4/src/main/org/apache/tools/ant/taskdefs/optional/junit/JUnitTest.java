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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
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
Project	TokenNameIdentifier	 Project
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
PropertyHelper	TokenNameIdentifier	 Property Helper
;	TokenNameSEMICOLON	
/** * <p> Run a single JUnit test. * * <p> The JUnit test is actually run by {@link JUnitTestRunner}. * So read the doc comments for that class :) * * @since Ant 1.2 * * @see JUnitTask * @see JUnitTestRunner */	TokenNameCOMMENT_JAVADOC	 <p> Run a single JUnit test. * <p> The JUnit test is actually run by {@link JUnitTestRunner}. So read the doc comments for that class :) * @since Ant 1.2 * @see JUnitTask @see JUnitTestRunner 
public	TokenNamepublic	
class	TokenNameclass	
JUnitTest	TokenNameIdentifier	 J Unit Test
extends	TokenNameextends	
BaseTest	TokenNameIdentifier	 Base Test
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
/** the name of the test case */	TokenNameCOMMENT_JAVADOC	 the name of the test case 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * whether the list of test methods has been specified * @see #setMethods(java.lang.String) * @see #setMethods(java.lang.String[]) */	TokenNameCOMMENT_JAVADOC	 whether the list of test methods has been specified @see #setMethods(java.lang.String) @see #setMethods(java.lang.String[]) 
private	TokenNameprivate	
boolean	TokenNameboolean	
methodsSpecified	TokenNameIdentifier	 methods Specified
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** comma-separated list of names of test methods to execute */	TokenNameCOMMENT_JAVADOC	 comma-separated list of names of test methods to execute 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
methodsList	TokenNameIdentifier	 methods List
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** the names of test methods to execute */	TokenNameCOMMENT_JAVADOC	 the names of test methods to execute 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
methods	TokenNameIdentifier	 methods
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** the name of the result file */	TokenNameCOMMENT_JAVADOC	 the name of the result file 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
outfile	TokenNameIdentifier	 outfile
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// @todo this is duplicating TestResult information. Only the time is not 	TokenNameCOMMENT_LINE	@todo this is duplicating TestResult information. Only the time is not 
// part of the result. So we'd better derive a new class from TestResult 	TokenNameCOMMENT_LINE	part of the result. So we'd better derive a new class from TestResult 
// and deal with it. (SB) 	TokenNameCOMMENT_LINE	and deal with it. (SB) 
private	TokenNameprivate	
long	TokenNamelong	
runs	TokenNameIdentifier	 runs
,	TokenNameCOMMA	
failures	TokenNameIdentifier	 failures
,	TokenNameCOMMA	
errors	TokenNameIdentifier	 errors
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
runTime	TokenNameIdentifier	 run Time
;	TokenNameSEMICOLON	
// Snapshot of the system properties 	TokenNameCOMMENT_LINE	Snapshot of the system properties 
private	TokenNameprivate	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** No arg constructor. */	TokenNameCOMMENT_JAVADOC	 No arg constructor. 
public	TokenNamepublic	
JUnitTest	TokenNameIdentifier	 J Unit Test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Constructor with name. * @param name the name of the test. */	TokenNameCOMMENT_JAVADOC	 Constructor with name. @param name the name of the test. 
public	TokenNamepublic	
JUnitTest	TokenNameIdentifier	 J Unit Test
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor with options. * @param name the name of the test. * @param haltOnError if true halt the tests if there is an error. * @param haltOnFailure if true halt the tests if there is a failure. * @param filtertrace if true filter stack traces. */	TokenNameCOMMENT_JAVADOC	 Constructor with options. @param name the name of the test. @param haltOnError if true halt the tests if there is an error. @param haltOnFailure if true halt the tests if there is a failure. @param filtertrace if true filter stack traces. 
public	TokenNamepublic	
JUnitTest	TokenNameIdentifier	 J Unit Test
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
haltOnError	TokenNameIdentifier	 halt On Error
,	TokenNameCOMMA	
boolean	TokenNameboolean	
haltOnFailure	TokenNameIdentifier	 halt On Failure
,	TokenNameCOMMA	
boolean	TokenNameboolean	
filtertrace	TokenNameIdentifier	 filtertrace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
haltOnError	TokenNameIdentifier	 halt On Error
,	TokenNameCOMMA	
haltOnFailure	TokenNameIdentifier	 halt On Failure
,	TokenNameCOMMA	
filtertrace	TokenNameIdentifier	 filtertrace
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor with options. * @param name the name of the test. * @param haltOnError if true halt the tests if there is an error. * @param haltOnFailure if true halt the tests if there is a failure. * @param filtertrace if true filter stack traces. * @param methods if non-null run only these test methods * @since 1.8.2 */	TokenNameCOMMENT_JAVADOC	 Constructor with options. @param name the name of the test. @param haltOnError if true halt the tests if there is an error. @param haltOnFailure if true halt the tests if there is a failure. @param filtertrace if true filter stack traces. @param methods if non-null run only these test methods @since 1.8.2 
public	TokenNamepublic	
JUnitTest	TokenNameIdentifier	 J Unit Test
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
haltOnError	TokenNameIdentifier	 halt On Error
,	TokenNameCOMMA	
boolean	TokenNameboolean	
haltOnFailure	TokenNameIdentifier	 halt On Failure
,	TokenNameCOMMA	
boolean	TokenNameboolean	
filtertrace	TokenNameIdentifier	 filtertrace
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
methods	TokenNameIdentifier	 methods
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
haltOnError	TokenNameIdentifier	 halt On Error
=	TokenNameEQUAL	
haltOnError	TokenNameIdentifier	 halt On Error
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
haltOnFail	TokenNameIdentifier	 halt On Fail
=	TokenNameEQUAL	
haltOnFailure	TokenNameIdentifier	 halt On Failure
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
filtertrace	TokenNameIdentifier	 filtertrace
=	TokenNameEQUAL	
filtertrace	TokenNameIdentifier	 filtertrace
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
methodsSpecified	TokenNameIdentifier	 methods Specified
=	TokenNameEQUAL	
methods	TokenNameIdentifier	 methods
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
methods	TokenNameIdentifier	 methods
=	TokenNameEQUAL	
methodsSpecified	TokenNameIdentifier	 methods Specified
?	TokenNameQUESTION	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
methods	TokenNameIdentifier	 methods
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets names of individual test methods to be executed. * @param value comma-separated list of names of individual test methods * to be executed, * or <code>null</code> if all test methods should be executed * @since 1.8.2 */	TokenNameCOMMENT_JAVADOC	 Sets names of individual test methods to be executed. @param value comma-separated list of names of individual test methods to be executed, or <code>null</code> if all test methods should be executed @since 1.8.2 
public	TokenNamepublic	
void	TokenNamevoid	
setMethods	TokenNameIdentifier	 set Methods
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
methodsList	TokenNameIdentifier	 methods List
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
methodsSpecified	TokenNameIdentifier	 methods Specified
=	TokenNameEQUAL	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
methods	TokenNameIdentifier	 methods
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets names of individual test methods to be executed. * @param value non-empty array of names of test methods to be executed * @see #setMethods(String) * @since 1.8.2 */	TokenNameCOMMENT_JAVADOC	 Sets names of individual test methods to be executed. @param value non-empty array of names of test methods to be executed @see #setMethods(String) @since 1.8.2 
void	TokenNamevoid	
setMethods	TokenNameIdentifier	 set Methods
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
methods	TokenNameIdentifier	 methods
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
methodsSpecified	TokenNameIdentifier	 methods Specified
=	TokenNameEQUAL	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
methodsList	TokenNameIdentifier	 methods List
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the name of the test class. * @param value the name to use. */	TokenNameCOMMENT_JAVADOC	 Set the name of the test class. @param value the name to use. 
public	TokenNamepublic	
void	TokenNamevoid	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the name of the output file. * @param value the name of the output file to use. */	TokenNameCOMMENT_JAVADOC	 Set the name of the output file. @param value the name of the output file to use. 
public	TokenNamepublic	
void	TokenNamevoid	
setOutfile	TokenNameIdentifier	 set Outfile
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outfile	TokenNameIdentifier	 outfile
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Informs whether a list of test methods has been specified in this test. * @return <code>true</code> if test methods to be executed have been * specified, <code>false</code> otherwise * @see #setMethods(java.lang.String) * @see #setMethods(java.lang.String[]) * @since 1.8.2 */	TokenNameCOMMENT_JAVADOC	 Informs whether a list of test methods has been specified in this test. @return <code>true</code> if test methods to be executed have been specified, <code>false</code> otherwise @see #setMethods(java.lang.String) @see #setMethods(java.lang.String[]) @since 1.8.2 
boolean	TokenNameboolean	
hasMethodsSpecified	TokenNameIdentifier	 has Methods Specified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
methodsSpecified	TokenNameIdentifier	 methods Specified
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get names of individual test methods to be executed. * * @return array of names of the individual test methods to be executed, * or <code>null</code> if all test methods in the suite * defined by the test class will be executed * @since 1.8.2 */	TokenNameCOMMENT_JAVADOC	 Get names of individual test methods to be executed. * @return array of names of the individual test methods to be executed, or <code>null</code> if all test methods in the suite defined by the test class will be executed @since 1.8.2 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getMethods	TokenNameIdentifier	 get Methods
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
methodsSpecified	TokenNameIdentifier	 methods Specified
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
methods	TokenNameIdentifier	 methods
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resolveMethods	TokenNameIdentifier	 resolve Methods
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
methods	TokenNameIdentifier	 methods
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets a comma-separated list of names of methods that are to be executed * by this test. * @return the comma-separated list of test method names, or an empty * string of no method is to be executed, or <code>null</code> * if no method is specified * @since 1.8.2 */	TokenNameCOMMENT_JAVADOC	 Gets a comma-separated list of names of methods that are to be executed by this test. @return the comma-separated list of test method names, or an empty string of no method is to be executed, or <code>null</code> if no method is specified @since 1.8.2 
String	TokenNameIdentifier	 String
getMethodsString	TokenNameIdentifier	 get Methods String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
methodsList	TokenNameIdentifier	 methods List
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
methodsSpecified	TokenNameIdentifier	 methods Specified
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
methods	TokenNameIdentifier	 methods
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
methodsList	TokenNameIdentifier	 methods List
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
methods	TokenNameIdentifier	 methods
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
methodsList	TokenNameIdentifier	 methods List
=	TokenNameEQUAL	
methods	TokenNameIdentifier	 methods
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
methods	TokenNameIdentifier	 methods
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
methods	TokenNameIdentifier	 methods
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
methods	TokenNameIdentifier	 methods
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
methods	TokenNameIdentifier	 methods
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
methodsList	TokenNameIdentifier	 methods List
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
methodsList	TokenNameIdentifier	 methods List
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Computes the value of the {@link #methods} field from the value * of the {@link #methodsList} field, if it has not been computed yet. * @exception BuildException if the value of the {@link #methodsList} field * was invalid * @since 1.8.2 */	TokenNameCOMMENT_JAVADOC	 Computes the value of the {@link #methods} field from the value of the {@link #methodsList} field, if it has not been computed yet. @exception BuildException if the value of the {@link #methodsList} field was invalid @since 1.8.2 
void	TokenNamevoid	
resolveMethods	TokenNameIdentifier	 resolve Methods
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
methods	TokenNameIdentifier	 methods
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
methodsSpecified	TokenNameIdentifier	 methods Specified
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
methods	TokenNameIdentifier	 methods
=	TokenNameEQUAL	
parseTestMethodNamesList	TokenNameIdentifier	 parse Test Method Names List
(	TokenNameLPAREN	
methodsList	TokenNameIdentifier	 methods List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Invalid specification of test methods: ""	TokenNameStringLiteral	Invalid specification of test methods: "
+	TokenNamePLUS	
methodsList	TokenNameIdentifier	 methods List
+	TokenNamePLUS	
""; expected: comma-separated list of valid Java identifiers"	TokenNameStringLiteral	"; expected: comma-separated list of valid Java identifiers
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Parses a comma-separated list of method names and check their validity. * @param methodNames comma-separated list of method names to be parsed * @return array of individual test method names * @exception java.lang.IllegalArgumentException * if the given string is <code>null</code> or if it is not * a comma-separated list of valid Java identifiers; * an empty string is acceptable and is handled as an empty * list * @since 1.8.2 */	TokenNameCOMMENT_JAVADOC	 Parses a comma-separated list of method names and check their validity. @param methodNames comma-separated list of method names to be parsed @return array of individual test method names @exception java.lang.IllegalArgumentException if the given string is <code>null</code> or if it is not a comma-separated list of valid Java identifiers; an empty string is acceptable and is handled as an empty list @since 1.8.2 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parseTestMethodNamesList	TokenNameIdentifier	 parse Test Method Names List
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
methodNames	TokenNameIdentifier	 method Names
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
methodNames	TokenNameIdentifier	 method Names
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"methodNames is <null>"	TokenNameStringLiteral	methodNames is <null>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
methodNames	TokenNameIdentifier	 method Names
=	TokenNameEQUAL	
methodNames	TokenNameIdentifier	 method Names
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
methodNames	TokenNameIdentifier	 method Names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* strip the trailing comma, if any */	TokenNameCOMMENT_BLOCK	 strip the trailing comma, if any 
if	TokenNameif	
(	TokenNameLPAREN	
methodNames	TokenNameIdentifier	 method Names
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
methodNames	TokenNameIdentifier	 method Names
=	TokenNameEQUAL	
methodNames	TokenNameIdentifier	 method Names
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
methodNames	TokenNameIdentifier	 method Names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Empty method name"	TokenNameStringLiteral	Empty method name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
methodNames	TokenNameIdentifier	 method Names
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* easy detection of one particular case of illegal string: */	TokenNameCOMMENT_BLOCK	 easy detection of one particular case of illegal string: 
if	TokenNameif	
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Empty method name"	TokenNameStringLiteral	Empty method name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* count number of method names: */	TokenNameCOMMENT_BLOCK	 count number of method names: 
int	TokenNameint	
wordCount	TokenNameIdentifier	 word Count
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
wordCount	TokenNameIdentifier	 word Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* prepare the resulting array: */	TokenNameCOMMENT_BLOCK	 prepare the resulting array: 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
wordCount	TokenNameIdentifier	 word Count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/* parse the string: */	TokenNameCOMMENT_BLOCK	 parse the string: 
final	TokenNamefinal	
int	TokenNameint	
stateBeforeWord	TokenNameIdentifier	 state Before Word
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
stateInsideWord	TokenNameIdentifier	 state Inside Word
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
stateAfterWord	TokenNameIdentifier	 state After Word
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
int	TokenNameint	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
stateBeforeWord	TokenNameIdentifier	 state Before Word
;	TokenNameSEMICOLON	
int	TokenNameint	
wordStartIndex	TokenNameIdentifier	 word Start Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
wordIndex	TokenNameIdentifier	 word Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
stateBeforeWord	TokenNameIdentifier	 state Before Word
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Empty method name"	TokenNameStringLiteral	Empty method name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// remain in the same state 	TokenNameCOMMENT_LINE	remain in the same state 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isJavaIdentifierStart	TokenNameIdentifier	 is Java Identifier Start
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
wordStartIndex	TokenNameIdentifier	 word Start Index
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
stateInsideWord	TokenNameIdentifier	 state Inside Word
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Illegal start of method name: "	TokenNameStringLiteral	Illegal start of method name: 
+	TokenNamePLUS	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
stateInsideWord	TokenNameIdentifier	 state Inside Word
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
wordIndex	TokenNameIdentifier	 word Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
methodNames	TokenNameIdentifier	 method Names
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
wordStartIndex	TokenNameIdentifier	 word Start Index
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
stateBeforeWord	TokenNameIdentifier	 state Before Word
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
wordIndex	TokenNameIdentifier	 word Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
methodNames	TokenNameIdentifier	 method Names
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
wordStartIndex	TokenNameIdentifier	 word Start Index
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
stateAfterWord	TokenNameIdentifier	 state After Word
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isJavaIdentifierPart	TokenNameIdentifier	 is Java Identifier Part
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// remain in the same state 	TokenNameCOMMENT_LINE	remain in the same state 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Illegal character in method name: "	TokenNameStringLiteral	Illegal character in method name: 
+	TokenNamePLUS	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
stateAfterWord	TokenNameIdentifier	 state After Word
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
stateBeforeWord	TokenNameIdentifier	 state Before Word
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// remain in the same state 	TokenNameCOMMENT_LINE	remain in the same state 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Space in method name"	TokenNameStringLiteral	Space in method name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
// this should never happen 	TokenNameCOMMENT_LINE	this should never happen 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
stateBeforeWord	TokenNameIdentifier	 state Before Word
:	TokenNameCOLON	
case	TokenNamecase	
stateAfterWord	TokenNameIdentifier	 state After Word
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
stateInsideWord	TokenNameIdentifier	 state Inside Word
:	TokenNameCOLON	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
wordIndex	TokenNameIdentifier	 word Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
methodNames	TokenNameIdentifier	 method Names
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
wordStartIndex	TokenNameIdentifier	 word Start Index
,	TokenNameCOMMA	
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
// this should never happen 	TokenNameCOMMENT_LINE	this should never happen 
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the name of the test class. * @return the name of the test. */	TokenNameCOMMENT_JAVADOC	 Get the name of the test class. @return the name of the test. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the name of the output file * * @return the name of the output file. */	TokenNameCOMMENT_JAVADOC	 Get the name of the output file * @return the name of the output file. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOutfile	TokenNameIdentifier	 get Outfile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
outfile	TokenNameIdentifier	 outfile
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the number of runs, failures and errors. * @param runs the number of runs. * @param failures the number of failures. * @param errors the number of errors. */	TokenNameCOMMENT_JAVADOC	 Set the number of runs, failures and errors. @param runs the number of runs. @param failures the number of failures. @param errors the number of errors. 
public	TokenNamepublic	
void	TokenNamevoid	
setCounts	TokenNameIdentifier	 set Counts
(	TokenNameLPAREN	
long	TokenNamelong	
runs	TokenNameIdentifier	 runs
,	TokenNameCOMMA	
long	TokenNamelong	
failures	TokenNameIdentifier	 failures
,	TokenNameCOMMA	
long	TokenNamelong	
errors	TokenNameIdentifier	 errors
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
runs	TokenNameIdentifier	 runs
=	TokenNameEQUAL	
runs	TokenNameIdentifier	 runs
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
failures	TokenNameIdentifier	 failures
=	TokenNameEQUAL	
failures	TokenNameIdentifier	 failures
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
errors	TokenNameIdentifier	 errors
=	TokenNameEQUAL	
errors	TokenNameIdentifier	 errors
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the runtime. * @param runTime the time in milliseconds. */	TokenNameCOMMENT_JAVADOC	 Set the runtime. @param runTime the time in milliseconds. 
public	TokenNamepublic	
void	TokenNamevoid	
setRunTime	TokenNameIdentifier	 set Run Time
(	TokenNameLPAREN	
long	TokenNamelong	
runTime	TokenNameIdentifier	 run Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
runTime	TokenNameIdentifier	 run Time
=	TokenNameEQUAL	
runTime	TokenNameIdentifier	 run Time
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the number of runs. * @return the number of runs. */	TokenNameCOMMENT_JAVADOC	 Get the number of runs. @return the number of runs. 
public	TokenNamepublic	
long	TokenNamelong	
runCount	TokenNameIdentifier	 run Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
runs	TokenNameIdentifier	 runs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the number of failures. * @return the number of failures. */	TokenNameCOMMENT_JAVADOC	 Get the number of failures. @return the number of failures. 
public	TokenNamepublic	
long	TokenNamelong	
failureCount	TokenNameIdentifier	 failure Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
failures	TokenNameIdentifier	 failures
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the number of errors. * @return the number of errors. */	TokenNameCOMMENT_JAVADOC	 Get the number of errors. @return the number of errors. 
public	TokenNamepublic	
long	TokenNamelong	
errorCount	TokenNameIdentifier	 error Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
errors	TokenNameIdentifier	 errors
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the run time. * @return the run time in milliseconds. */	TokenNameCOMMENT_JAVADOC	 Get the run time. @return the run time in milliseconds. 
public	TokenNamepublic	
long	TokenNamelong	
getRunTime	TokenNameIdentifier	 get Run Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
runTime	TokenNameIdentifier	 run Time
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the properties used in the test. * @return the properties. */	TokenNameCOMMENT_JAVADOC	 Get the properties used in the test. @return the properties. 
public	TokenNamepublic	
Properties	TokenNameIdentifier	 Properties
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
props	TokenNameIdentifier	 props
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the properties to be used in the test. * @param p the properties. * This is a copy of the projects ant properties. */	TokenNameCOMMENT_JAVADOC	 Set the properties to be used in the test. @param p the properties. This is a copy of the projects ant properties. 
public	TokenNamepublic	
void	TokenNamevoid	
setProperties	TokenNameIdentifier	 set Properties
(	TokenNameLPAREN	
Hashtable	TokenNameIdentifier	 Hashtable
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Check if this test should run based on the if and unless * attributes. * @param p the project to use to check if the if and unless * properties exist in. * @return true if this test or testsuite should be run. */	TokenNameCOMMENT_JAVADOC	 Check if this test should run based on the if and unless attributes. @param p the project to use to check if the if and unless properties exist in. @return true if this test or testsuite should be run. 
public	TokenNamepublic	
boolean	TokenNameboolean	
shouldRun	TokenNameIdentifier	 should Run
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PropertyHelper	TokenNameIdentifier	 Property Helper
ph	TokenNameIdentifier	 ph
=	TokenNameEQUAL	
PropertyHelper	TokenNameIdentifier	 Property Helper
.	TokenNameDOT	
getPropertyHelper	TokenNameIdentifier	 get Property Helper
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ph	TokenNameIdentifier	 ph
.	TokenNameDOT	
testIfCondition	TokenNameIdentifier	 test If Condition
(	TokenNameLPAREN	
getIfCondition	TokenNameIdentifier	 get If Condition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
ph	TokenNameIdentifier	 ph
.	TokenNameDOT	
testUnlessCondition	TokenNameIdentifier	 test Unless Condition
(	TokenNameLPAREN	
getUnlessCondition	TokenNameIdentifier	 get Unless Condition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the formatters set for this test. * @return the formatters as an array. */	TokenNameCOMMENT_JAVADOC	 Get the formatters set for this test. @return the formatters as an array. 
public	TokenNamepublic	
FormatterElement	TokenNameIdentifier	 Formatter Element
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getFormatters	TokenNameIdentifier	 get Formatters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FormatterElement	TokenNameIdentifier	 Formatter Element
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fes	TokenNameIdentifier	 fes
=	TokenNameEQUAL	
new	TokenNamenew	
FormatterElement	TokenNameIdentifier	 Formatter Element
[	TokenNameLBRACKET	
formatters	TokenNameIdentifier	 formatters
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
formatters	TokenNameIdentifier	 formatters
.	TokenNameDOT	
copyInto	TokenNameIdentifier	 copy Into
(	TokenNameLPAREN	
fes	TokenNameIdentifier	 fes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fes	TokenNameIdentifier	 fes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Convenient method to add formatters to a vector */	TokenNameCOMMENT_JAVADOC	 Convenient method to add formatters to a vector 
void	TokenNamevoid	
addFormattersTo	TokenNameIdentifier	 add Formatters To
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
formatters	TokenNameIdentifier	 formatters
.	TokenNameDOT	
size	TokenNameIdentifier	 size
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
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
formatters	TokenNameIdentifier	 formatters
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @since Ant 1.5 * @return a clone of this test. */	TokenNameCOMMENT_JAVADOC	 @since Ant 1.5 @return a clone of this test. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
JUnitTest	TokenNameIdentifier	 J Unit Test
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
JUnitTest	TokenNameIdentifier	 J Unit Test
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
props	TokenNameIdentifier	 props
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
)	TokenNameRPAREN	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
formatters	TokenNameIdentifier	 formatters
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
)	TokenNameRPAREN	
formatters	TokenNameIdentifier	 formatters
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// plain impossible 	TokenNameCOMMENT_LINE	plain impossible 
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
