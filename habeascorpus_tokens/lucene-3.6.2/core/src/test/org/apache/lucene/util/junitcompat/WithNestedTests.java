package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
junitcompat	TokenNameIdentifier	 junitcompat
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
After	TokenNameIdentifier	 After
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Assert	TokenNameIdentifier	 Assert
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Before	TokenNameIdentifier	 Before
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
ClassRule	TokenNameIdentifier	 Class Rule
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
TestRule	TokenNameIdentifier	 Test Rule
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
runner	TokenNameIdentifier	 runner
.	TokenNameDOT	
Description	TokenNameIdentifier	 Description
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
runners	TokenNameIdentifier	 runners
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Statement	TokenNameIdentifier	 Statement
;	TokenNameSEMICOLON	
/** * An abstract test class that prepares nested test classes to run. * A nested test class will assume it's executed under control of this * class and be ignored otherwise. * * <p>The purpose of this is so that nested test suites don't run from * IDEs like Eclipse (where they are automatically detected). * * <p>This class cannot extend {@link LuceneTestCase} because in case * there's a nested {@link LuceneTestCase} afterclass hooks run twice and * cause havoc (static fields). */	TokenNameCOMMENT_JAVADOC	 An abstract test class that prepares nested test classes to run. A nested test class will assume it's executed under control of this class and be ignored otherwise. * <p>The purpose of this is so that nested test suites don't run from IDEs like Eclipse (where they are automatically detected). * <p>This class cannot extend {@link LuceneTestCase} because in case there's a nested {@link LuceneTestCase} afterclass hooks run twice and cause havoc (static fields). 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
WithNestedTests	TokenNameIdentifier	 With Nested Tests
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
ThreadLocal	TokenNameIdentifier	 Thread Local
<	TokenNameLESS	
Boolean	TokenNameIdentifier	 Boolean
>	TokenNameGREATER	
runsAsNested	TokenNameIdentifier	 runs As Nested
=	TokenNameEQUAL	
new	TokenNamenew	
ThreadLocal	TokenNameIdentifier	 Thread Local
<	TokenNameLESS	
Boolean	TokenNameIdentifier	 Boolean
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
Boolean	TokenNameIdentifier	 Boolean
initialValue	TokenNameIdentifier	 initial Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractNestedTest	TokenNameIdentifier	 Abstract Nested Test
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
@	TokenNameAT	
ClassRule	TokenNameIdentifier	 Class Rule
public	TokenNamepublic	
static	TokenNamestatic	
TestRule	TokenNameIdentifier	 Test Rule
ignoreIfRunAsStandalone	TokenNameIdentifier	 ignore If Run As Standalone
=	TokenNameEQUAL	
new	TokenNamenew	
TestRule	TokenNameIdentifier	 Test Rule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
Statement	TokenNameIdentifier	 Statement
apply	TokenNameIdentifier	 apply
(	TokenNameLPAREN	
final	TokenNamefinal	
Statement	TokenNameIdentifier	 Statement
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
Description	TokenNameIdentifier	 Description
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Statement	TokenNameIdentifier	 Statement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Throwable	TokenNameIdentifier	 Throwable
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isRunningNested	TokenNameIdentifier	 is Running Nested
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
boolean	TokenNameboolean	
isRunningNested	TokenNameIdentifier	 is Running Nested
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
runsAsNested	TokenNameIdentifier	 runs As Nested
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
runsAsNested	TokenNameIdentifier	 runs As Nested
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
suppressOutputStreams	TokenNameIdentifier	 suppress Output Streams
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
WithNestedTests	TokenNameIdentifier	 With Nested Tests
(	TokenNameLPAREN	
boolean	TokenNameboolean	
suppressOutputStreams	TokenNameIdentifier	 suppress Output Streams
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
suppressOutputStreams	TokenNameIdentifier	 suppress Output Streams
=	TokenNameEQUAL	
suppressOutputStreams	TokenNameIdentifier	 suppress Output Streams
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
PrintStream	TokenNameIdentifier	 Print Stream
prevSysErr	TokenNameIdentifier	 prev Sys Err
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
PrintStream	TokenNameIdentifier	 Print Stream
prevSysOut	TokenNameIdentifier	 prev Sys Out
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
sysout	TokenNameIdentifier	 sysout
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
syserr	TokenNameIdentifier	 syserr
;	TokenNameSEMICOLON	
@	TokenNameAT	
Before	TokenNameIdentifier	 Before
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
before	TokenNameIdentifier	 before
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
suppressOutputStreams	TokenNameIdentifier	 suppress Output Streams
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prevSysOut	TokenNameIdentifier	 prev Sys Out
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
prevSysErr	TokenNameIdentifier	 prev Sys Err
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
sysout	TokenNameIdentifier	 sysout
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setOut	TokenNameIdentifier	 set Out
(	TokenNameLPAREN	
new	TokenNamenew	
PrintStream	TokenNameIdentifier	 Print Stream
(	TokenNameLPAREN	
sysout	TokenNameIdentifier	 sysout
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syserr	TokenNameIdentifier	 syserr
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setErr	TokenNameIdentifier	 set Err
(	TokenNameLPAREN	
new	TokenNamenew	
PrintStream	TokenNameIdentifier	 Print Stream
(	TokenNameLPAREN	
syserr	TokenNameIdentifier	 syserr
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
runsAsNested	TokenNameIdentifier	 runs As Nested
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
After	TokenNameIdentifier	 After
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
after	TokenNameIdentifier	 after
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
runsAsNested	TokenNameIdentifier	 runs As Nested
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
suppressOutputStreams	TokenNameIdentifier	 suppress Output Streams
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setOut	TokenNameIdentifier	 set Out
(	TokenNameLPAREN	
prevSysOut	TokenNameIdentifier	 prev Sys Out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setErr	TokenNameIdentifier	 set Err
(	TokenNameLPAREN	
prevSysErr	TokenNameIdentifier	 prev Sys Err
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getSysOut	TokenNameIdentifier	 get Sys Out
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
suppressOutputStreams	TokenNameIdentifier	 suppress Output Streams
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
sysout	TokenNameIdentifier	 sysout
.	TokenNameDOT	
toByteArray	TokenNameIdentifier	 to Byte Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getSysErr	TokenNameIdentifier	 get Sys Err
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
suppressOutputStreams	TokenNameIdentifier	 suppress Output Streams
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
syserr	TokenNameIdentifier	 syserr
.	TokenNameDOT	
toByteArray	TokenNameIdentifier	 to Byte Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
