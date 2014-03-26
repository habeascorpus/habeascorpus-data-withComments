package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintWriter	TokenNameIdentifier	 Print Writer
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
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
UncaughtExceptionHandler	TokenNameIdentifier	 Uncaught Exception Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
AssumptionViolatedException	TokenNameIdentifier	 Assumption Violated Exception
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
MultipleFailureException	TokenNameIdentifier	 Multiple Failure Exception
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
/** * Subscribes to * {@link Thread#setDefaultUncaughtExceptionHandler(java.lang.Thread.UncaughtExceptionHandler)} * and causes test/ suite failures if uncaught exceptions are detected. */	TokenNameCOMMENT_JAVADOC	 Subscribes to {@link Thread#setDefaultUncaughtExceptionHandler(java.lang.Thread.UncaughtExceptionHandler)} and causes test/ suite failures if uncaught exceptions are detected. 
public	TokenNamepublic	
class	TokenNameclass	
UncaughtExceptionsRule	TokenNameIdentifier	 Uncaught Exceptions Rule
implements	TokenNameimplements	
TestRule	TokenNameIdentifier	 Test Rule
{	TokenNameLBRACE	
// This was originally volatile, but I don't think it needs to be. It's the same 	TokenNameCOMMENT_LINE	This was originally volatile, but I don't think it needs to be. It's the same 
// thread accessing it, always. 	TokenNameCOMMENT_LINE	thread accessing it, always. 
private	TokenNameprivate	
UncaughtExceptionHandler	TokenNameIdentifier	 Uncaught Exception Handler
savedUncaughtExceptionHandler	TokenNameIdentifier	 saved Uncaught Exception Handler
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
ltc	TokenNameIdentifier	 ltc
;	TokenNameSEMICOLON	
public	TokenNamepublic	
UncaughtExceptionsRule	TokenNameIdentifier	 Uncaught Exceptions Rule
(	TokenNameLPAREN	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
ltc	TokenNameIdentifier	 ltc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ltc	TokenNameIdentifier	 ltc
=	TokenNameEQUAL	
ltc	TokenNameIdentifier	 ltc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
UncaughtExceptionEntry	TokenNameIdentifier	 Uncaught Exception Entry
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
Thread	TokenNameIdentifier	 Thread
thread	TokenNameIdentifier	 thread
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
Throwable	TokenNameIdentifier	 Throwable
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
UncaughtExceptionEntry	TokenNameIdentifier	 Uncaught Exception Entry
(	TokenNameLPAREN	
Thread	TokenNameIdentifier	 Thread
thread	TokenNameIdentifier	 thread
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
thread	TokenNameIdentifier	 thread
=	TokenNameEQUAL	
thread	TokenNameIdentifier	 thread
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
exception	TokenNameIdentifier	 exception
=	TokenNameEQUAL	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"serial"	TokenNameStringLiteral	serial
)	TokenNameRPAREN	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
UncaughtExceptionsInBackgroundThread	TokenNameIdentifier	 Uncaught Exceptions In Background Thread
extends	TokenNameextends	
RuntimeException	TokenNameIdentifier	 Runtime Exception
{	TokenNameLBRACE	
public	TokenNamepublic	
UncaughtExceptionsInBackgroundThread	TokenNameIdentifier	 Uncaught Exceptions In Background Thread
(	TokenNameLPAREN	
UncaughtExceptionEntry	TokenNameIdentifier	 Uncaught Exception Entry
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
"Uncaught exception by thread: "	TokenNameStringLiteral	Uncaught exception by thread: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
thread	TokenNameIdentifier	 thread
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Lock on uncaughtExceptions to access. 	TokenNameCOMMENT_LINE	Lock on uncaughtExceptions to access. 
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
UncaughtExceptionEntry	TokenNameIdentifier	 Uncaught Exception Entry
>	TokenNameGREATER	
uncaughtExceptions	TokenNameIdentifier	 uncaught Exceptions
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
UncaughtExceptionEntry	TokenNameIdentifier	 Uncaught Exception Entry
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Statement	TokenNameIdentifier	 Statement
apply	TokenNameIdentifier	 apply
(	TokenNameLPAREN	
final	TokenNamefinal	
Statement	TokenNameIdentifier	 Statement
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
final	TokenNamefinal	
Description	TokenNameIdentifier	 Description
d	TokenNameIdentifier	 d
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
final	TokenNamefinal	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Throwable	TokenNameIdentifier	 Throwable
>	TokenNameGREATER	
errors	TokenNameIdentifier	 errors
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Throwable	TokenNameIdentifier	 Throwable
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
setupHandler	TokenNameIdentifier	 setup Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errors	TokenNameIdentifier	 errors
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
restoreHandler	TokenNameIdentifier	 restore Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
uncaughtExceptions	TokenNameIdentifier	 uncaught Exceptions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
UncaughtExceptionEntry	TokenNameIdentifier	 Uncaught Exception Entry
e	TokenNameIdentifier	 e
:	TokenNameCOLON	
uncaughtExceptions	TokenNameIdentifier	 uncaught Exceptions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errors	TokenNameIdentifier	 errors
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
UncaughtExceptionsInBackgroundThread	TokenNameIdentifier	 Uncaught Exceptions In Background Thread
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
uncaughtExceptions	TokenNameIdentifier	 uncaught Exceptions
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasNonAssumptionErrors	TokenNameIdentifier	 has Non Assumption Errors
(	TokenNameLPAREN	
errors	TokenNameIdentifier	 errors
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ltc	TokenNameIdentifier	 ltc
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// class level failure (e.g. afterclass) 	TokenNameCOMMENT_LINE	class level failure (e.g. afterclass) 
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
.	TokenNameDOT	
reportPartialFailureInfo	TokenNameIdentifier	 report Partial Failure Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// failure in a method 	TokenNameCOMMENT_LINE	failure in a method 
ltc	TokenNameIdentifier	 ltc
.	TokenNameDOT	
reportAdditionalFailureInfo	TokenNameIdentifier	 report Additional Failure Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
MultipleFailureException	TokenNameIdentifier	 Multiple Failure Exception
.	TokenNameDOT	
assertEmpty	TokenNameIdentifier	 assert Empty
(	TokenNameLPAREN	
errors	TokenNameIdentifier	 errors
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
hasNonAssumptionErrors	TokenNameIdentifier	 has Non Assumption Errors
(	TokenNameLPAREN	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Throwable	TokenNameIdentifier	 Throwable
>	TokenNameGREATER	
errors	TokenNameIdentifier	 errors
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
:	TokenNameCOLON	
errors	TokenNameIdentifier	 errors
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
instanceof	TokenNameinstanceof	
AssumptionViolatedException	TokenNameIdentifier	 Assumption Violated Exception
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Just a check if anything's been caught. */	TokenNameCOMMENT_JAVADOC	 Just a check if anything's been caught. 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasUncaughtExceptions	TokenNameIdentifier	 has Uncaught Exceptions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
uncaughtExceptions	TokenNameIdentifier	 uncaught Exceptions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
uncaughtExceptions	TokenNameIdentifier	 uncaught Exceptions
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
restoreHandler	TokenNameIdentifier	 restore Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
setDefaultUncaughtExceptionHandler	TokenNameIdentifier	 set Default Uncaught Exception Handler
(	TokenNameLPAREN	
savedUncaughtExceptionHandler	TokenNameIdentifier	 saved Uncaught Exception Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
setupHandler	TokenNameIdentifier	 setup Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
savedUncaughtExceptionHandler	TokenNameIdentifier	 saved Uncaught Exception Handler
=	TokenNameEQUAL	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
getDefaultUncaughtExceptionHandler	TokenNameIdentifier	 get Default Uncaught Exception Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
setDefaultUncaughtExceptionHandler	TokenNameIdentifier	 set Default Uncaught Exception Handler
(	TokenNameLPAREN	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
UncaughtExceptionHandler	TokenNameIdentifier	 Uncaught Exception Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
uncaughtException	TokenNameIdentifier	 uncaught Exception
(	TokenNameLPAREN	
Thread	TokenNameIdentifier	 Thread
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// org.junit.internal.AssumptionViolatedException in older releases 	TokenNameCOMMENT_LINE	org.junit.internal.AssumptionViolatedException in older releases 
// org.junit.Assume.AssumptionViolatedException in recent ones 	TokenNameCOMMENT_LINE	org.junit.Assume.AssumptionViolatedException in recent ones 
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"AssumptionViolatedException"	TokenNameStringLiteral	AssumptionViolatedException
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
where	TokenNameIdentifier	 where
=	TokenNameEQUAL	
"<unknown>"	TokenNameStringLiteral	<unknown>
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
StackTraceElement	TokenNameIdentifier	 Stack Trace Element
elem	TokenNameIdentifier	 elem
:	TokenNameCOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getStackTrace	TokenNameIdentifier	 get Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"org.junit"	TokenNameStringLiteral	org.junit
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
where	TokenNameIdentifier	 where
=	TokenNameEQUAL	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"NOTE: Uncaught exception handler caught a failed assumption at "	TokenNameStringLiteral	NOTE: Uncaught exception handler caught a failed assumption at 
+	TokenNamePLUS	
where	TokenNameIdentifier	 where
+	TokenNamePLUS	
" (ignored):"	TokenNameStringLiteral	 (ignored):
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
uncaughtExceptions	TokenNameIdentifier	 uncaught Exceptions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
uncaughtExceptions	TokenNameIdentifier	 uncaught Exceptions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
UncaughtExceptionEntry	TokenNameIdentifier	 Uncaught Exception Entry
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
StringWriter	TokenNameIdentifier	 String Writer
sw	TokenNameIdentifier	 sw
=	TokenNameEQUAL	
new	TokenNamenew	
StringWriter	TokenNameIdentifier	 String Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sw	TokenNameIdentifier	 sw
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
" ===> Uncaught exception by thread: "	TokenNameStringLiteral	 ===> Uncaught exception by thread: 
+	TokenNamePLUS	
t	TokenNameIdentifier	 t
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PrintWriter	TokenNameIdentifier	 Print Writer
pw	TokenNameIdentifier	 pw
=	TokenNameEQUAL	
new	TokenNamenew	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
sw	TokenNameIdentifier	 sw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
pw	TokenNameIdentifier	 pw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pw	TokenNameIdentifier	 pw
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sw	TokenNameIdentifier	 sw
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"<=== "	TokenNameStringLiteral	<=== 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
sw	TokenNameIdentifier	 sw
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
