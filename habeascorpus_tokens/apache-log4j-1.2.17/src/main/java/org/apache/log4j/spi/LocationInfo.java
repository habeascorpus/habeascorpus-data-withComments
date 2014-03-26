/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
// Contributors: Mathias Rupprecht <mmathias.rupprecht@fja.com> 	TokenNameCOMMENT_LINE	Contributors: Mathias Rupprecht <mmathias.rupprecht@fja.com> 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Layout	TokenNameIdentifier	 Layout
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InterruptedIOException	TokenNameIdentifier	 Interrupted IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Method	TokenNameIdentifier	 Method
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
;	TokenNameSEMICOLON	
/** The internal representation of caller location information. @since 0.8.3 */	TokenNameCOMMENT_JAVADOC	 The internal representation of caller location information. @since 0.8.3 
public	TokenNamepublic	
class	TokenNameclass	
LocationInfo	TokenNameIdentifier	 Location Info
implements	TokenNameimplements	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
/** Caller's line number. */	TokenNameCOMMENT_JAVADOC	 Caller's line number. 
transient	TokenNametransient	
String	TokenNameIdentifier	 String
lineNumber	TokenNameIdentifier	 line Number
;	TokenNameSEMICOLON	
/** Caller's file name. */	TokenNameCOMMENT_JAVADOC	 Caller's file name. 
transient	TokenNametransient	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
;	TokenNameSEMICOLON	
/** Caller's fully qualified class name. */	TokenNameCOMMENT_JAVADOC	 Caller's fully qualified class name. 
transient	TokenNametransient	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
;	TokenNameSEMICOLON	
/** Caller's method name. */	TokenNameCOMMENT_JAVADOC	 Caller's method name. 
transient	TokenNametransient	
String	TokenNameIdentifier	 String
methodName	TokenNameIdentifier	 method Name
;	TokenNameSEMICOLON	
/** All available caller information, in the format <code>fully.qualified.classname.of.caller.methodName(Filename.java:line)</code> */	TokenNameCOMMENT_JAVADOC	 All available caller information, in the format <code>fully.qualified.classname.of.caller.methodName(Filename.java:line)</code> 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
fullInfo	TokenNameIdentifier	 full Info
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
StringWriter	TokenNameIdentifier	 String Writer
sw	TokenNameIdentifier	 sw
=	TokenNameEQUAL	
new	TokenNamenew	
StringWriter	TokenNameIdentifier	 String Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
PrintWriter	TokenNameIdentifier	 Print Writer
pw	TokenNameIdentifier	 pw
=	TokenNameEQUAL	
new	TokenNamenew	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
sw	TokenNameIdentifier	 sw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
Method	TokenNameIdentifier	 Method
getStackTraceMethod	TokenNameIdentifier	 get Stack Trace Method
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
Method	TokenNameIdentifier	 Method
getClassNameMethod	TokenNameIdentifier	 get Class Name Method
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
Method	TokenNameIdentifier	 Method
getMethodNameMethod	TokenNameIdentifier	 get Method Name Method
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
Method	TokenNameIdentifier	 Method
getFileNameMethod	TokenNameIdentifier	 get File Name Method
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
Method	TokenNameIdentifier	 Method
getLineNumberMethod	TokenNameIdentifier	 get Line Number Method
;	TokenNameSEMICOLON	
/** When location information is not available the constant <code>NA</code> is returned. Current value of this string constant is <b>?</b>. */	TokenNameCOMMENT_JAVADOC	 When location information is not available the constant <code>NA</code> is returned. Current value of this string constant is <b>?</b>. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
NA	TokenNameIdentifier	 NA
=	TokenNameEQUAL	
"?"	TokenNameStringLiteral	?
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
1325822038990805636L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * NA_LOCATION_INFO is provided for compatibility with log4j 1.3. * @since 1.2.15 */	TokenNameCOMMENT_JAVADOC	 NA_LOCATION_INFO is provided for compatibility with log4j 1.3. @since 1.2.15 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
LocationInfo	TokenNameIdentifier	 Location Info
NA_LOCATION_INFO	TokenNameIdentifier	 NA  LOCATION  INFO
=	TokenNameEQUAL	
new	TokenNamenew	
LocationInfo	TokenNameIdentifier	 Location Info
(	TokenNameLPAREN	
NA	TokenNameIdentifier	 NA
,	TokenNameCOMMA	
NA	TokenNameIdentifier	 NA
,	TokenNameCOMMA	
NA	TokenNameIdentifier	 NA
,	TokenNameCOMMA	
NA	TokenNameIdentifier	 NA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check if we are running in IBM's visual age. 	TokenNameCOMMENT_LINE	Check if we are running in IBM's visual age. 
static	TokenNamestatic	
boolean	TokenNameboolean	
inVisualAge	TokenNameIdentifier	 in Visual Age
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
inVisualAge	TokenNameIdentifier	 in Visual Age
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
"com.ibm.uvm.tools.DebugSupport"	TokenNameStringLiteral	com.ibm.uvm.tools.DebugSupport
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Detected IBM VisualAge environment."	TokenNameStringLiteral	Detected IBM VisualAge environment.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// nothing to do 	TokenNameCOMMENT_LINE	nothing to do 
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
noArgs	TokenNameIdentifier	 no Args
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
getStackTraceMethod	TokenNameIdentifier	 get Stack Trace Method
=	TokenNameEQUAL	
Throwable	TokenNameIdentifier	 Throwable
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"getStackTrace"	TokenNameStringLiteral	getStackTrace
,	TokenNameCOMMA	
noArgs	TokenNameIdentifier	 no Args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
stackTraceElementClass	TokenNameIdentifier	 stack Trace Element Class
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
"java.lang.StackTraceElement"	TokenNameStringLiteral	java.lang.StackTraceElement
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getClassNameMethod	TokenNameIdentifier	 get Class Name Method
=	TokenNameEQUAL	
stackTraceElementClass	TokenNameIdentifier	 stack Trace Element Class
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"getClassName"	TokenNameStringLiteral	getClassName
,	TokenNameCOMMA	
noArgs	TokenNameIdentifier	 no Args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getMethodNameMethod	TokenNameIdentifier	 get Method Name Method
=	TokenNameEQUAL	
stackTraceElementClass	TokenNameIdentifier	 stack Trace Element Class
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"getMethodName"	TokenNameStringLiteral	getMethodName
,	TokenNameCOMMA	
noArgs	TokenNameIdentifier	 no Args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getFileNameMethod	TokenNameIdentifier	 get File Name Method
=	TokenNameEQUAL	
stackTraceElementClass	TokenNameIdentifier	 stack Trace Element Class
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"getFileName"	TokenNameStringLiteral	getFileName
,	TokenNameCOMMA	
noArgs	TokenNameIdentifier	 no Args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getLineNumberMethod	TokenNameIdentifier	 get Line Number Method
=	TokenNameEQUAL	
stackTraceElementClass	TokenNameIdentifier	 stack Trace Element Class
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"getLineNumber"	TokenNameStringLiteral	getLineNumber
,	TokenNameCOMMA	
noArgs	TokenNameIdentifier	 no Args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"LocationInfo will use pre-JDK 1.4 methods to determine location."	TokenNameStringLiteral	LocationInfo will use pre-JDK 1.4 methods to determine location.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"LocationInfo will use pre-JDK 1.4 methods to determine location."	TokenNameStringLiteral	LocationInfo will use pre-JDK 1.4 methods to determine location.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Instantiate location information based on a Throwable. We expect the Throwable <code>t</code>, to be in the format <pre> java.lang.Throwable ... at org.apache.log4j.PatternLayout.format(PatternLayout.java:413) at org.apache.log4j.FileAppender.doAppend(FileAppender.java:183) at org.apache.log4j.Category.callAppenders(Category.java:131) at org.apache.log4j.Category.log(Category.java:512) at callers.fully.qualified.className.methodName(FileName.java:74) ... </pre> <p>However, we can also deal with JIT compilers that "lose" the location information, especially between the parentheses. @param t throwable used to determine location, may be null. @param fqnOfCallingClass class name of first class considered part of the logging framework. Location will be site that calls a method on this class. */	TokenNameCOMMENT_JAVADOC	 Instantiate location information based on a Throwable. We expect the Throwable <code>t</code>, to be in the format <pre> java.lang.Throwable ... at org.apache.log4j.PatternLayout.format(PatternLayout.java:413) at org.apache.log4j.FileAppender.doAppend(FileAppender.java:183) at org.apache.log4j.Category.callAppenders(Category.java:131) at org.apache.log4j.Category.log(Category.java:512) at callers.fully.qualified.className.methodName(FileName.java:74) ... </pre> <p>However, we can also deal with JIT compilers that "lose" the location information, especially between the parentheses. @param t throwable used to determine location, may be null. @param fqnOfCallingClass class name of first class considered part of the logging framework. Location will be site that calls a method on this class. 
public	TokenNamepublic	
LocationInfo	TokenNameIdentifier	 Location Info
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fqnOfCallingClass	TokenNameIdentifier	 fqn Of Calling Class
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
fqnOfCallingClass	TokenNameIdentifier	 fqn Of Calling Class
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getLineNumberMethod	TokenNameIdentifier	 get Line Number Method
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
noArgs	TokenNameIdentifier	 no Args
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
elements	TokenNameIdentifier	 elements
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
getStackTraceMethod	TokenNameIdentifier	 get Stack Trace Method
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
noArgs	TokenNameIdentifier	 no Args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
prevClass	TokenNameIdentifier	 prev Class
=	TokenNameEQUAL	
NA	TokenNameIdentifier	 NA
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
elements	TokenNameIdentifier	 elements
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
thisClass	TokenNameIdentifier	 this Class
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
getClassNameMethod	TokenNameIdentifier	 get Class Name Method
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
elements	TokenNameIdentifier	 elements
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
noArgs	TokenNameIdentifier	 no Args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fqnOfCallingClass	TokenNameIdentifier	 fqn Of Calling Class
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
thisClass	TokenNameIdentifier	 this Class
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
caller	TokenNameIdentifier	 caller
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
caller	TokenNameIdentifier	 caller
<	TokenNameLESS	
elements	TokenNameIdentifier	 elements
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
prevClass	TokenNameIdentifier	 prev Class
;	TokenNameSEMICOLON	
methodName	TokenNameIdentifier	 method Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
getMethodNameMethod	TokenNameIdentifier	 get Method Name Method
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
elements	TokenNameIdentifier	 elements
[	TokenNameLBRACKET	
caller	TokenNameIdentifier	 caller
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
noArgs	TokenNameIdentifier	 no Args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
getFileNameMethod	TokenNameIdentifier	 get File Name Method
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
elements	TokenNameIdentifier	 elements
[	TokenNameLBRACKET	
caller	TokenNameIdentifier	 caller
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
noArgs	TokenNameIdentifier	 no Args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
NA	TokenNameIdentifier	 NA
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
getLineNumberMethod	TokenNameIdentifier	 get Line Number Method
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
elements	TokenNameIdentifier	 elements
[	TokenNameLBRACKET	
caller	TokenNameIdentifier	 caller
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
noArgs	TokenNameIdentifier	 no Args
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lineNumber	TokenNameIdentifier	 line Number
=	TokenNameEQUAL	
NA	TokenNameIdentifier	 NA
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
lineNumber	TokenNameIdentifier	 line Number
=	TokenNameEQUAL	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
methodName	TokenNameIdentifier	 method Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"("	TokenNameStringLiteral	(
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
lineNumber	TokenNameIdentifier	 line Number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fullInfo	TokenNameIdentifier	 full Info
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
prevClass	TokenNameIdentifier	 prev Class
=	TokenNameEQUAL	
thisClass	TokenNameIdentifier	 this Class
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"LocationInfo failed using JDK 1.4 methods"	TokenNameStringLiteral	LocationInfo failed using JDK 1.4 methods
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getTargetException	TokenNameIdentifier	 get Target Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
||	TokenNameOR_OR	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getTargetException	TokenNameIdentifier	 get Target Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"LocationInfo failed using JDK 1.4 methods"	TokenNameStringLiteral	LocationInfo failed using JDK 1.4 methods
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
RuntimeException	TokenNameIdentifier	 Runtime Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"LocationInfo failed using JDK 1.4 methods"	TokenNameStringLiteral	LocationInfo failed using JDK 1.4 methods
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
// Protect against multiple access to sw. 	TokenNameCOMMENT_LINE	Protect against multiple access to sw. 
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
sw	TokenNameIdentifier	 sw
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
pw	TokenNameIdentifier	 pw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
sw	TokenNameIdentifier	 sw
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sw	TokenNameIdentifier	 sw
.	TokenNameDOT	
getBuffer	TokenNameIdentifier	 get Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//System.out.println("s is ["+s+"]."); 	TokenNameCOMMENT_LINE	System.out.println("s is ["+s+"]."); 
int	TokenNameint	
ibegin	TokenNameIdentifier	 ibegin
,	TokenNameCOMMA	
iend	TokenNameIdentifier	 iend
;	TokenNameSEMICOLON	
// Given the current structure of the package, the line 	TokenNameCOMMENT_LINE	Given the current structure of the package, the line 
// containing "org.apache.log4j.Category." should be printed just 	TokenNameCOMMENT_LINE	containing "org.apache.log4j.Category." should be printed just 
// before the caller. 	TokenNameCOMMENT_LINE	before the caller. 
// This method of searching may not be fastest but it's safer 	TokenNameCOMMENT_LINE	This method of searching may not be fastest but it's safer 
// than counting the stack depth which is not guaranteed to be 	TokenNameCOMMENT_LINE	than counting the stack depth which is not guaranteed to be 
// constant across JVM implementations. 	TokenNameCOMMENT_LINE	constant across JVM implementations. 
ibegin	TokenNameIdentifier	 ibegin
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
fqnOfCallingClass	TokenNameIdentifier	 fqn Of Calling Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ibegin	TokenNameIdentifier	 ibegin
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// if the next character after the class name exists 	TokenNameCOMMENT_LINE	if the next character after the class name exists 
// but is not a period, see if the classname is 	TokenNameCOMMENT_LINE	but is not a period, see if the classname is 
// followed by a period earlier in the trace. 	TokenNameCOMMENT_LINE	followed by a period earlier in the trace. 
// Minimizes mistakeningly matching on a class whose 	TokenNameCOMMENT_LINE	Minimizes mistakeningly matching on a class whose 
// name is a substring of the desired class. 	TokenNameCOMMENT_LINE	name is a substring of the desired class. 
// See bug 44888. 	TokenNameCOMMENT_LINE	See bug 44888. 
if	TokenNameif	
(	TokenNameLPAREN	
ibegin	TokenNameIdentifier	 ibegin
+	TokenNamePLUS	
fqnOfCallingClass	TokenNameIdentifier	 fqn Of Calling Class
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
ibegin	TokenNameIdentifier	 ibegin
+	TokenNamePLUS	
fqnOfCallingClass	TokenNameIdentifier	 fqn Of Calling Class
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
fqnOfCallingClass	TokenNameIdentifier	 fqn Of Calling Class
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ibegin	TokenNameIdentifier	 ibegin
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
ibegin	TokenNameIdentifier	 ibegin
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
Layout	TokenNameIdentifier	 Layout
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
,	TokenNameCOMMA	
ibegin	TokenNameIdentifier	 ibegin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ibegin	TokenNameIdentifier	 ibegin
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
ibegin	TokenNameIdentifier	 ibegin
+=	TokenNamePLUS_EQUAL	
Layout	TokenNameIdentifier	 Layout
.	TokenNameDOT	
LINE_SEP_LEN	TokenNameIdentifier	 LINE  SEP  LEN
;	TokenNameSEMICOLON	
// determine end of line 	TokenNameCOMMENT_LINE	determine end of line 
iend	TokenNameIdentifier	 iend
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
Layout	TokenNameIdentifier	 Layout
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
,	TokenNameCOMMA	
ibegin	TokenNameIdentifier	 ibegin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
iend	TokenNameIdentifier	 iend
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// VA has a different stack trace format which doesn't 	TokenNameCOMMENT_LINE	VA has a different stack trace format which doesn't 
// need to skip the inital 'at' 	TokenNameCOMMENT_LINE	need to skip the inital 'at' 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
inVisualAge	TokenNameIdentifier	 in Visual Age
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// back up to first blank character 	TokenNameCOMMENT_LINE	back up to first blank character 
ibegin	TokenNameIdentifier	 ibegin
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
"at "	TokenNameStringLiteral	at 
,	TokenNameCOMMA	
iend	TokenNameIdentifier	 iend
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ibegin	TokenNameIdentifier	 ibegin
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// Add 3 to skip "at "; 	TokenNameCOMMENT_LINE	Add 3 to skip "at "; 
ibegin	TokenNameIdentifier	 ibegin
+=	TokenNamePLUS_EQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// everything between is the requested stack item 	TokenNameCOMMENT_LINE	everything between is the requested stack item 
this	TokenNamethis	
.	TokenNameDOT	
fullInfo	TokenNameIdentifier	 full Info
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
ibegin	TokenNameIdentifier	 ibegin
,	TokenNameCOMMA	
iend	TokenNameIdentifier	 iend
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Appends a location fragment to a buffer to build the * full location info. * @param buf StringBuffer to receive content. * @param fragment fragment of location (class, method, file, line), * if null the value of NA will be appended. * @since 1.2.15 */	TokenNameCOMMENT_JAVADOC	 Appends a location fragment to a buffer to build the full location info. @param buf StringBuffer to receive content. @param fragment fragment of location (class, method, file, line), if null the value of NA will be appended. @since 1.2.15 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
void	TokenNamevoid	
appendFragment	TokenNameIdentifier	 append Fragment
(	TokenNameLPAREN	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fragment	TokenNameIdentifier	 fragment
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fragment	TokenNameIdentifier	 fragment
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
NA	TokenNameIdentifier	 NA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fragment	TokenNameIdentifier	 fragment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Create new instance. * @param file source file name * @param classname class name * @param method method * @param line source line number * * @since 1.2.15 */	TokenNameCOMMENT_JAVADOC	 Create new instance. @param file source file name @param classname class name @param method method @param line source line number * @since 1.2.15 
public	TokenNamepublic	
LocationInfo	TokenNameIdentifier	 Location Info
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
classname	TokenNameIdentifier	 classname
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
method	TokenNameIdentifier	 method
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
classname	TokenNameIdentifier	 classname
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
methodName	TokenNameIdentifier	 method Name
=	TokenNameEQUAL	
method	TokenNameIdentifier	 method
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lineNumber	TokenNameIdentifier	 line Number
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appendFragment	TokenNameIdentifier	 append Fragment
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
classname	TokenNameIdentifier	 classname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appendFragment	TokenNameIdentifier	 append Fragment
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
method	TokenNameIdentifier	 method
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"("	TokenNameStringLiteral	(
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appendFragment	TokenNameIdentifier	 append Fragment
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appendFragment	TokenNameIdentifier	 append Fragment
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fullInfo	TokenNameIdentifier	 full Info
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the fully qualified class name of the caller making the logging request. */	TokenNameCOMMENT_JAVADOC	 Return the fully qualified class name of the caller making the logging request. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fullInfo	TokenNameIdentifier	 full Info
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
NA	TokenNameIdentifier	 NA
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Starting the search from '(' is safer because there is 	TokenNameCOMMENT_LINE	Starting the search from '(' is safer because there is 
// potentially a dot between the parentheses. 	TokenNameCOMMENT_LINE	potentially a dot between the parentheses. 
int	TokenNameint	
iend	TokenNameIdentifier	 iend
=	TokenNameEQUAL	
fullInfo	TokenNameIdentifier	 full Info
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'('	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
iend	TokenNameIdentifier	 iend
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
NA	TokenNameIdentifier	 NA
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
iend	TokenNameIdentifier	 iend
=	TokenNameEQUAL	
fullInfo	TokenNameIdentifier	 full Info
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
iend	TokenNameIdentifier	 iend
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// This is because a stack trace in VisualAge looks like: 	TokenNameCOMMENT_LINE	This is because a stack trace in VisualAge looks like: 
//java.lang.RuntimeException 	TokenNameCOMMENT_LINE	java.lang.RuntimeException 
// java.lang.Throwable() 	TokenNameCOMMENT_LINE	java.lang.Throwable() 
// java.lang.Exception() 	TokenNameCOMMENT_LINE	java.lang.Exception() 
// java.lang.RuntimeException() 	TokenNameCOMMENT_LINE	java.lang.RuntimeException() 
// void test.test.B.print() 	TokenNameCOMMENT_LINE	void test.test.B.print() 
// void test.test.A.printIndirect() 	TokenNameCOMMENT_LINE	void test.test.A.printIndirect() 
// void test.test.Run.main(java.lang.String []) 	TokenNameCOMMENT_LINE	void test.test.Run.main(java.lang.String []) 
int	TokenNameint	
ibegin	TokenNameIdentifier	 ibegin
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
inVisualAge	TokenNameIdentifier	 in Visual Age
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ibegin	TokenNameIdentifier	 ibegin
=	TokenNameEQUAL	
fullInfo	TokenNameIdentifier	 full Info
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
iend	TokenNameIdentifier	 iend
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
iend	TokenNameIdentifier	 iend
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
NA	TokenNameIdentifier	 NA
;	TokenNameSEMICOLON	
else	TokenNameelse	
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
fullInfo	TokenNameIdentifier	 full Info
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
ibegin	TokenNameIdentifier	 ibegin
,	TokenNameCOMMA	
iend	TokenNameIdentifier	 iend
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
className	TokenNameIdentifier	 class Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the file name of the caller. <p>This information is not always available. */	TokenNameCOMMENT_JAVADOC	 Return the file name of the caller. <p>This information is not always available. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getFileName	TokenNameIdentifier	 get File Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fullInfo	TokenNameIdentifier	 full Info
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
NA	TokenNameIdentifier	 NA
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
iend	TokenNameIdentifier	 iend
=	TokenNameEQUAL	
fullInfo	TokenNameIdentifier	 full Info
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
iend	TokenNameIdentifier	 iend
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
NA	TokenNameIdentifier	 NA
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
ibegin	TokenNameIdentifier	 ibegin
=	TokenNameEQUAL	
fullInfo	TokenNameIdentifier	 full Info
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'('	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
iend	TokenNameIdentifier	 iend
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
fullInfo	TokenNameIdentifier	 full Info
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
ibegin	TokenNameIdentifier	 ibegin
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
iend	TokenNameIdentifier	 iend
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
fileName	TokenNameIdentifier	 file Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the line number of the caller. <p>This information is not always available. */	TokenNameCOMMENT_JAVADOC	 Returns the line number of the caller. <p>This information is not always available. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fullInfo	TokenNameIdentifier	 full Info
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
NA	TokenNameIdentifier	 NA
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lineNumber	TokenNameIdentifier	 line Number
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
iend	TokenNameIdentifier	 iend
=	TokenNameEQUAL	
fullInfo	TokenNameIdentifier	 full Info
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
ibegin	TokenNameIdentifier	 ibegin
=	TokenNameEQUAL	
fullInfo	TokenNameIdentifier	 full Info
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
iend	TokenNameIdentifier	 iend
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ibegin	TokenNameIdentifier	 ibegin
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
lineNumber	TokenNameIdentifier	 line Number
=	TokenNameEQUAL	
NA	TokenNameIdentifier	 NA
;	TokenNameSEMICOLON	
else	TokenNameelse	
lineNumber	TokenNameIdentifier	 line Number
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
fullInfo	TokenNameIdentifier	 full Info
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
ibegin	TokenNameIdentifier	 ibegin
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
iend	TokenNameIdentifier	 iend
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
lineNumber	TokenNameIdentifier	 line Number
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the method name of the caller. */	TokenNameCOMMENT_JAVADOC	 Returns the method name of the caller. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getMethodName	TokenNameIdentifier	 get Method Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fullInfo	TokenNameIdentifier	 full Info
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
NA	TokenNameIdentifier	 NA
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
methodName	TokenNameIdentifier	 method Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
iend	TokenNameIdentifier	 iend
=	TokenNameEQUAL	
fullInfo	TokenNameIdentifier	 full Info
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'('	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
ibegin	TokenNameIdentifier	 ibegin
=	TokenNameEQUAL	
fullInfo	TokenNameIdentifier	 full Info
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
iend	TokenNameIdentifier	 iend
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ibegin	TokenNameIdentifier	 ibegin
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
methodName	TokenNameIdentifier	 method Name
=	TokenNameEQUAL	
NA	TokenNameIdentifier	 NA
;	TokenNameSEMICOLON	
else	TokenNameelse	
methodName	TokenNameIdentifier	 method Name
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
fullInfo	TokenNameIdentifier	 full Info
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
ibegin	TokenNameIdentifier	 ibegin
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
iend	TokenNameIdentifier	 iend
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
methodName	TokenNameIdentifier	 method Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
