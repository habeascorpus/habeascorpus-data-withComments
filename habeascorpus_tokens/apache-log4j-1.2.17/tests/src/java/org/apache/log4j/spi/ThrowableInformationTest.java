/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintWriter	TokenNameIdentifier	 Print Writer
;	TokenNameSEMICOLON	
/** * Unit tests for ThrowableInformation. */	TokenNameCOMMENT_JAVADOC	 Unit tests for ThrowableInformation. 
public	TokenNamepublic	
class	TokenNameclass	
ThrowableInformationTest	TokenNameIdentifier	 Throwable Information Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
/** * Create ThrowableInformationTest. * * @param name test name. */	TokenNameCOMMENT_JAVADOC	 Create ThrowableInformationTest. * @param name test name. 
public	TokenNamepublic	
ThrowableInformationTest	TokenNameIdentifier	 Throwable Information Test
(	TokenNameLPAREN	
final	TokenNamefinal	
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
/** * Custom throwable that only calls methods * overridden by VectorWriter in log4j 1.2.14 and earlier. */	TokenNameCOMMENT_JAVADOC	 Custom throwable that only calls methods overridden by VectorWriter in log4j 1.2.14 and earlier. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
OverriddenThrowable	TokenNameIdentifier	 Overridden Throwable
extends	TokenNameextends	
Throwable	TokenNameIdentifier	 Throwable
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
1L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Create new instance. */	TokenNameCOMMENT_JAVADOC	 Create new instance. 
public	TokenNamepublic	
OverriddenThrowable	TokenNameIdentifier	 Overridden Throwable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Print stack trace. * * @param s print writer. */	TokenNameCOMMENT_JAVADOC	 Print stack trace. * @param s print writer. 
public	TokenNamepublic	
void	TokenNamevoid	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
final	TokenNamefinal	
PrintWriter	TokenNameIdentifier	 Print Writer
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
)	TokenNameRPAREN	
"print(Object)"	TokenNameStringLiteral	print(Object)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"print(char[])"	TokenNameStringLiteral	print(char[])
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"print(String)"	TokenNameStringLiteral	print(String)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
)	TokenNameRPAREN	
"println(Object)"	TokenNameStringLiteral	println(Object)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"println(char[])"	TokenNameStringLiteral	println(char[])
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"println(String)"	TokenNameStringLiteral	println(String)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"write(char[])"	TokenNameStringLiteral	write(char[])
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"write(char[], int, int)"	TokenNameStringLiteral	write(char[], int, int)
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"write(String, int, int)"	TokenNameStringLiteral	write(String, int, int)
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Test capturing stack trace from a throwable that only uses the * PrintWriter methods overridden in log4j 1.2.14 and earlier. */	TokenNameCOMMENT_JAVADOC	 Test capturing stack trace from a throwable that only uses the PrintWriter methods overridden in log4j 1.2.14 and earlier. 
public	TokenNamepublic	
void	TokenNamevoid	
testOverriddenBehavior	TokenNameIdentifier	 test Overridden Behavior
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ThrowableInformation	TokenNameIdentifier	 Throwable Information
ti	TokenNameIdentifier	 ti
=	TokenNameEQUAL	
new	TokenNamenew	
ThrowableInformation	TokenNameIdentifier	 Throwable Information
(	TokenNameLPAREN	
new	TokenNamenew	
OverriddenThrowable	TokenNameIdentifier	 Overridden Throwable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rep	TokenNameIdentifier	 rep
=	TokenNameEQUAL	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
getThrowableStrRep	TokenNameIdentifier	 get Throwable Str Rep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
rep	TokenNameIdentifier	 rep
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"print(Object)print(char[])print(String)println(Object)"	TokenNameStringLiteral	print(Object)print(char[])print(String)println(Object)
,	TokenNameCOMMA	
rep	TokenNameIdentifier	 rep
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"println(char[])"	TokenNameStringLiteral	println(char[])
,	TokenNameCOMMA	
rep	TokenNameIdentifier	 rep
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"println(String)"	TokenNameStringLiteral	println(String)
,	TokenNameCOMMA	
rep	TokenNameIdentifier	 rep
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"write(char[])ite(charite(Stri"	TokenNameStringLiteral	write(char[])ite(charite(Stri
,	TokenNameCOMMA	
rep	TokenNameIdentifier	 rep
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Custom throwable that calls methods * not overridden by VectorWriter in log4j 1.2.14 and earlier. */	TokenNameCOMMENT_JAVADOC	 Custom throwable that calls methods not overridden by VectorWriter in log4j 1.2.14 and earlier. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
NotOverriddenThrowable	TokenNameIdentifier	 Not Overridden Throwable
extends	TokenNameextends	
Throwable	TokenNameIdentifier	 Throwable
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
1L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Create new instance. */	TokenNameCOMMENT_JAVADOC	 Create new instance. 
public	TokenNamepublic	
NotOverriddenThrowable	TokenNameIdentifier	 Not Overridden Throwable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Print stack trace. * * @param s print writer. */	TokenNameCOMMENT_JAVADOC	 Print stack trace. * @param s print writer. 
public	TokenNamepublic	
void	TokenNamevoid	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
final	TokenNamefinal	
PrintWriter	TokenNameIdentifier	 Print Writer
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
'a'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
2L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
'a'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
2L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'C'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Test capturing stack trace from a throwable that uses the * PrintWriter methods not overridden in log4j 1.2.14 and earlier. */	TokenNameCOMMENT_JAVADOC	 Test capturing stack trace from a throwable that uses the PrintWriter methods not overridden in log4j 1.2.14 and earlier. 
public	TokenNamepublic	
void	TokenNamevoid	
testNotOverriddenBehavior	TokenNameIdentifier	 test Not Overridden Behavior
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ThrowableInformation	TokenNameIdentifier	 Throwable Information
ti	TokenNameIdentifier	 ti
=	TokenNameEQUAL	
new	TokenNamenew	
ThrowableInformation	TokenNameIdentifier	 Throwable Information
(	TokenNameLPAREN	
new	TokenNamenew	
NotOverriddenThrowable	TokenNameIdentifier	 Not Overridden Throwable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rep	TokenNameIdentifier	 rep
=	TokenNameEQUAL	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
getThrowableStrRep	TokenNameIdentifier	 get Throwable Str Rep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
rep	TokenNameIdentifier	 rep
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'a'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
2L	TokenNameLongLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
rep	TokenNameIdentifier	 rep
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
rep	TokenNameIdentifier	 rep
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
rep	TokenNameIdentifier	 rep
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
2L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
rep	TokenNameIdentifier	 rep
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
rep	TokenNameIdentifier	 rep
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
rep	TokenNameIdentifier	 rep
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"C"	TokenNameStringLiteral	C
,	TokenNameCOMMA	
rep	TokenNameIdentifier	 rep
[	TokenNameLBRACKET	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Custom throwable that calls methods of VectorWriter * with null. */	TokenNameCOMMENT_JAVADOC	 Custom throwable that calls methods of VectorWriter with null. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
NullThrowable	TokenNameIdentifier	 Null Throwable
extends	TokenNameextends	
Throwable	TokenNameIdentifier	 Throwable
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
1L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Create new instance. */	TokenNameCOMMENT_JAVADOC	 Create new instance. 
public	TokenNamepublic	
NullThrowable	TokenNameIdentifier	 Null Throwable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Print stack trace. * * @param s print writer. */	TokenNameCOMMENT_JAVADOC	 Print stack trace. * @param s print writer. 
public	TokenNamepublic	
void	TokenNamevoid	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
final	TokenNamefinal	
PrintWriter	TokenNameIdentifier	 Print Writer
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Test capturing stack trace from a throwable that passes * null to PrintWriter methods. */	TokenNameCOMMENT_JAVADOC	 Test capturing stack trace from a throwable that passes null to PrintWriter methods. 
public	TokenNamepublic	
void	TokenNamevoid	
testNull	TokenNameIdentifier	 test Null
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ThrowableInformation	TokenNameIdentifier	 Throwable Information
ti	TokenNameIdentifier	 ti
=	TokenNameEQUAL	
new	TokenNamenew	
ThrowableInformation	TokenNameIdentifier	 Throwable Information
(	TokenNameLPAREN	
new	TokenNamenew	
NullThrowable	TokenNameIdentifier	 Null Throwable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rep	TokenNameIdentifier	 rep
=	TokenNameEQUAL	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
getThrowableStrRep	TokenNameIdentifier	 get Throwable Str Rep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
rep	TokenNameIdentifier	 rep
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
nullStr	TokenNameIdentifier	 null Str
=	TokenNameEQUAL	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
nullStr	TokenNameIdentifier	 null Str
+	TokenNamePLUS	
nullStr	TokenNameIdentifier	 null Str
+	TokenNamePLUS	
nullStr	TokenNameIdentifier	 null Str
,	TokenNameCOMMA	
rep	TokenNameIdentifier	 rep
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
nullStr	TokenNameIdentifier	 null Str
,	TokenNameCOMMA	
rep	TokenNameIdentifier	 rep
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Custom throwable that does nothing in printStackTrace. */	TokenNameCOMMENT_JAVADOC	 Custom throwable that does nothing in printStackTrace. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
EmptyThrowable	TokenNameIdentifier	 Empty Throwable
extends	TokenNameextends	
Throwable	TokenNameIdentifier	 Throwable
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
1L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Create new instance. */	TokenNameCOMMENT_JAVADOC	 Create new instance. 
public	TokenNamepublic	
EmptyThrowable	TokenNameIdentifier	 Empty Throwable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Print stack trace. * * @param s print writer. */	TokenNameCOMMENT_JAVADOC	 Print stack trace. * @param s print writer. 
public	TokenNamepublic	
void	TokenNamevoid	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
final	TokenNamefinal	
PrintWriter	TokenNameIdentifier	 Print Writer
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Test capturing stack trace from a throwable that * does nothing on a call to printStackTrace. */	TokenNameCOMMENT_JAVADOC	 Test capturing stack trace from a throwable that does nothing on a call to printStackTrace. 
public	TokenNamepublic	
void	TokenNamevoid	
testEmpty	TokenNameIdentifier	 test Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ThrowableInformation	TokenNameIdentifier	 Throwable Information
ti	TokenNameIdentifier	 ti
=	TokenNameEQUAL	
new	TokenNamenew	
ThrowableInformation	TokenNameIdentifier	 Throwable Information
(	TokenNameLPAREN	
new	TokenNamenew	
EmptyThrowable	TokenNameIdentifier	 Empty Throwable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rep	TokenNameIdentifier	 rep
=	TokenNameEQUAL	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
getThrowableStrRep	TokenNameIdentifier	 get Throwable Str Rep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
rep	TokenNameIdentifier	 rep
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Custom throwable that emits a specified string in printStackTrace. */	TokenNameCOMMENT_JAVADOC	 Custom throwable that emits a specified string in printStackTrace. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
StringThrowable	TokenNameIdentifier	 String Throwable
extends	TokenNameextends	
Throwable	TokenNameIdentifier	 Throwable
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
1L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Stack trace. */	TokenNameCOMMENT_JAVADOC	 Stack trace. 
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
stackTrace	TokenNameIdentifier	 stack Trace
;	TokenNameSEMICOLON	
/** * Create new instance. * @param trace stack trace. */	TokenNameCOMMENT_JAVADOC	 Create new instance. @param trace stack trace. 
public	TokenNamepublic	
StringThrowable	TokenNameIdentifier	 String Throwable
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
trace	TokenNameIdentifier	 trace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stackTrace	TokenNameIdentifier	 stack Trace
=	TokenNameEQUAL	
trace	TokenNameIdentifier	 trace
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Print stack trace. * * @param s print writer. */	TokenNameCOMMENT_JAVADOC	 Print stack trace. * @param s print writer. 
public	TokenNamepublic	
void	TokenNamevoid	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
final	TokenNamefinal	
PrintWriter	TokenNameIdentifier	 Print Writer
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
stackTrace	TokenNameIdentifier	 stack Trace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Test capturing stack trace from throwable that just has a line feed. */	TokenNameCOMMENT_JAVADOC	 Test capturing stack trace from throwable that just has a line feed. 
public	TokenNamepublic	
void	TokenNamevoid	
testLineFeed	TokenNameIdentifier	 test Line Feed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ThrowableInformation	TokenNameIdentifier	 Throwable Information
ti	TokenNameIdentifier	 ti
=	TokenNameEQUAL	
new	TokenNamenew	
ThrowableInformation	TokenNameIdentifier	 Throwable Information
(	TokenNameLPAREN	
new	TokenNamenew	
StringThrowable	TokenNameIdentifier	 String Throwable
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rep	TokenNameIdentifier	 rep
=	TokenNameEQUAL	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
getThrowableStrRep	TokenNameIdentifier	 get Throwable Str Rep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
rep	TokenNameIdentifier	 rep
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
rep	TokenNameIdentifier	 rep
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test capturing stack trace from throwable that just has a carriage return. */	TokenNameCOMMENT_JAVADOC	 Test capturing stack trace from throwable that just has a carriage return. 
public	TokenNamepublic	
void	TokenNamevoid	
testCarriageReturn	TokenNameIdentifier	 test Carriage Return
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ThrowableInformation	TokenNameIdentifier	 Throwable Information
ti	TokenNameIdentifier	 ti
=	TokenNameEQUAL	
new	TokenNamenew	
ThrowableInformation	TokenNameIdentifier	 Throwable Information
(	TokenNameLPAREN	
new	TokenNamenew	
StringThrowable	TokenNameIdentifier	 String Throwable
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rep	TokenNameIdentifier	 rep
=	TokenNameEQUAL	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
getThrowableStrRep	TokenNameIdentifier	 get Throwable Str Rep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
rep	TokenNameIdentifier	 rep
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
rep	TokenNameIdentifier	 rep
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test parsing of line breaks. */	TokenNameCOMMENT_JAVADOC	 Test parsing of line breaks. 
public	TokenNamepublic	
void	TokenNamevoid	
testParsing	TokenNameIdentifier	 test Parsing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ThrowableInformation	TokenNameIdentifier	 Throwable Information
ti	TokenNameIdentifier	 ti
=	TokenNameEQUAL	
new	TokenNamenew	
ThrowableInformation	TokenNameIdentifier	 Throwable Information
(	TokenNameLPAREN	
new	TokenNamenew	
StringThrowable	TokenNameIdentifier	 String Throwable
(	TokenNameLPAREN	
"Line1 Line2 Line3 Line4 Line6"	TokenNameStringLiteral	Line1 Line2 Line3 Line4 Line6
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rep	TokenNameIdentifier	 rep
=	TokenNameEQUAL	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
getThrowableStrRep	TokenNameIdentifier	 get Throwable Str Rep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
rep	TokenNameIdentifier	 rep
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Line1"	TokenNameStringLiteral	Line1
,	TokenNameCOMMA	
rep	TokenNameIdentifier	 rep
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Line2"	TokenNameStringLiteral	Line2
,	TokenNameCOMMA	
rep	TokenNameIdentifier	 rep
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Line3"	TokenNameStringLiteral	Line3
,	TokenNameCOMMA	
rep	TokenNameIdentifier	 rep
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Line4"	TokenNameStringLiteral	Line4
,	TokenNameCOMMA	
rep	TokenNameIdentifier	 rep
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
rep	TokenNameIdentifier	 rep
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Line6"	TokenNameStringLiteral	Line6
,	TokenNameCOMMA	
rep	TokenNameIdentifier	 rep
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test capturing stack trace from throwable that a line feed followed by blank. */	TokenNameCOMMENT_JAVADOC	 Test capturing stack trace from throwable that a line feed followed by blank. 
public	TokenNamepublic	
void	TokenNamevoid	
testLineFeedBlank	TokenNameIdentifier	 test Line Feed Blank
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ThrowableInformation	TokenNameIdentifier	 Throwable Information
ti	TokenNameIdentifier	 ti
=	TokenNameEQUAL	
new	TokenNamenew	
ThrowableInformation	TokenNameIdentifier	 Throwable Information
(	TokenNameLPAREN	
new	TokenNamenew	
StringThrowable	TokenNameIdentifier	 String Throwable
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rep	TokenNameIdentifier	 rep
=	TokenNameEQUAL	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
getThrowableStrRep	TokenNameIdentifier	 get Throwable Str Rep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
rep	TokenNameIdentifier	 rep
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
rep	TokenNameIdentifier	 rep
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
,	TokenNameCOMMA	
rep	TokenNameIdentifier	 rep
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test that getThrowable returns the throwable provided to the constructor. */	TokenNameCOMMENT_JAVADOC	 Test that getThrowable returns the throwable provided to the constructor. 
public	TokenNamepublic	
void	TokenNamevoid	
testGetThrowable	TokenNameIdentifier	 test Get Throwable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
StringThrowable	TokenNameIdentifier	 String Throwable
(	TokenNameLPAREN	
"Hello, World"	TokenNameStringLiteral	Hello, World
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ThrowableInformation	TokenNameIdentifier	 Throwable Information
ti	TokenNameIdentifier	 ti
=	TokenNameEQUAL	
new	TokenNamenew	
ThrowableInformation	TokenNameIdentifier	 Throwable Information
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
getThrowable	TokenNameIdentifier	 get Throwable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests isolation of returned string representation * from internal state of ThrowableInformation. * log4j 1.2.15 and earlier did not isolate initial call. * See bug 44032. */	TokenNameCOMMENT_JAVADOC	 Tests isolation of returned string representation from internal state of ThrowableInformation. log4j 1.2.15 and earlier did not isolate initial call. See bug 44032. 
public	TokenNamepublic	
void	TokenNamevoid	
testIsolation	TokenNameIdentifier	 test Isolation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ThrowableInformation	TokenNameIdentifier	 Throwable Information
ti	TokenNameIdentifier	 ti
=	TokenNameEQUAL	
new	TokenNamenew	
ThrowableInformation	TokenNameIdentifier	 Throwable Information
(	TokenNameLPAREN	
new	TokenNamenew	
StringThrowable	TokenNameIdentifier	 String Throwable
(	TokenNameLPAREN	
"Hello, World"	TokenNameStringLiteral	Hello, World
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rep	TokenNameIdentifier	 rep
=	TokenNameEQUAL	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
getThrowableStrRep	TokenNameIdentifier	 get Throwable Str Rep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, World"	TokenNameStringLiteral	Hello, World
,	TokenNameCOMMA	
rep	TokenNameIdentifier	 rep
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rep	TokenNameIdentifier	 rep
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
"Bonjour, Monde"	TokenNameStringLiteral	Bonjour, Monde
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rep2	TokenNameIdentifier	 rep2
=	TokenNameEQUAL	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
getThrowableStrRep	TokenNameIdentifier	 get Throwable Str Rep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hello, World"	TokenNameStringLiteral	Hello, World
,	TokenNameCOMMA	
rep2	TokenNameIdentifier	 rep2
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Custom throwable that throws a runtime exception * when printStackTrace is called. */	TokenNameCOMMENT_JAVADOC	 Custom throwable that throws a runtime exception when printStackTrace is called. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
NastyThrowable	TokenNameIdentifier	 Nasty Throwable
extends	TokenNameextends	
Throwable	TokenNameIdentifier	 Throwable
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
1L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Create new instance. */	TokenNameCOMMENT_JAVADOC	 Create new instance. 
public	TokenNamepublic	
NastyThrowable	TokenNameIdentifier	 Nasty Throwable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Print stack trace. * * @param s print writer. */	TokenNameCOMMENT_JAVADOC	 Print stack trace. * @param s print writer. 
public	TokenNamepublic	
void	TokenNamevoid	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
final	TokenNamefinal	
PrintWriter	TokenNameIdentifier	 Print Writer
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"NastyException"	TokenNameStringLiteral	NastyException
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Intentional exception"	TokenNameStringLiteral	Intentional exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Tests that a failure in printStackTrace * does not percolate out of getThrowableStrRep(). * */	TokenNameCOMMENT_JAVADOC	 Tests that a failure in printStackTrace does not percolate out of getThrowableStrRep(). 
public	TokenNamepublic	
void	TokenNamevoid	
testNastyException	TokenNameIdentifier	 test Nasty Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ThrowableInformation	TokenNameIdentifier	 Throwable Information
ti	TokenNameIdentifier	 ti
=	TokenNameEQUAL	
new	TokenNamenew	
ThrowableInformation	TokenNameIdentifier	 Throwable Information
(	TokenNameLPAREN	
new	TokenNamenew	
NastyThrowable	TokenNameIdentifier	 Nasty Throwable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rep	TokenNameIdentifier	 rep
=	TokenNameEQUAL	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
getThrowableStrRep	TokenNameIdentifier	 get Throwable Str Rep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"NastyException"	TokenNameStringLiteral	NastyException
,	TokenNameCOMMA	
rep	TokenNameIdentifier	 rep
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
