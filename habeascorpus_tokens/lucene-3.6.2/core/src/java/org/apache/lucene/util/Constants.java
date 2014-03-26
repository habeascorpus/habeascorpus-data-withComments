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
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Field	TokenNameIdentifier	 Field
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
LucenePackage	TokenNameIdentifier	 Lucene Package
;	TokenNameSEMICOLON	
/** * Some useful constants. **/	TokenNameCOMMENT_JAVADOC	 Some useful constants. *
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
Constants	TokenNameIdentifier	 Constants
{	TokenNameLBRACE	
private	TokenNameprivate	
Constants	TokenNameIdentifier	 Constants
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// can't construct 	TokenNameCOMMENT_LINE	can't construct 
/** JVM vendor info. */	TokenNameCOMMENT_JAVADOC	 JVM vendor info. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JVM_VENDOR	TokenNameIdentifier	 JVM  VENDOR
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"java.vm.vendor"	TokenNameStringLiteral	java.vm.vendor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JVM_VERSION	TokenNameIdentifier	 JVM  VERSION
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"java.vm.version"	TokenNameStringLiteral	java.vm.version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JVM_NAME	TokenNameIdentifier	 JVM  NAME
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"java.vm.name"	TokenNameStringLiteral	java.vm.name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** The value of <tt>System.getProperty("java.version")<tt>. **/	TokenNameCOMMENT_JAVADOC	 The value of <tt>System.getProperty("java.version")<tt>. *
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JAVA_VERSION	TokenNameIdentifier	 JAVA  VERSION
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"java.version"	TokenNameStringLiteral	java.version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** True iff this is Java version 1.1. * @deprecated This constant is useless since Lucene is on Java 5 */	TokenNameCOMMENT_JAVADOC	 True iff this is Java version 1.1. @deprecated This constant is useless since Lucene is on Java 5 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
JAVA_1_1	TokenNameIdentifier	 JAVA 1 1
=	TokenNameEQUAL	
JAVA_VERSION	TokenNameIdentifier	 JAVA  VERSION
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"1.1."	TokenNameStringLiteral	1.1.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** True iff this is Java version 1.2. * @deprecated This constant is useless since Lucene is on Java 5 */	TokenNameCOMMENT_JAVADOC	 True iff this is Java version 1.2. @deprecated This constant is useless since Lucene is on Java 5 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
JAVA_1_2	TokenNameIdentifier	 JAVA 1 2
=	TokenNameEQUAL	
JAVA_VERSION	TokenNameIdentifier	 JAVA  VERSION
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"1.2."	TokenNameStringLiteral	1.2.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** True iff this is Java version 1.3. * @deprecated This constant is useless since Lucene is on Java 5 */	TokenNameCOMMENT_JAVADOC	 True iff this is Java version 1.3. @deprecated This constant is useless since Lucene is on Java 5 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
JAVA_1_3	TokenNameIdentifier	 JAVA 1 3
=	TokenNameEQUAL	
JAVA_VERSION	TokenNameIdentifier	 JAVA  VERSION
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"1.3."	TokenNameStringLiteral	1.3.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** The value of <tt>System.getProperty("os.name")<tt>. **/	TokenNameCOMMENT_JAVADOC	 The value of <tt>System.getProperty("os.name")<tt>. *
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
OS_NAME	TokenNameIdentifier	 OS  NAME
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"os.name"	TokenNameStringLiteral	os.name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** True iff running on Linux. */	TokenNameCOMMENT_JAVADOC	 True iff running on Linux. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
LINUX	TokenNameIdentifier	 LINUX
=	TokenNameEQUAL	
OS_NAME	TokenNameIdentifier	 OS  NAME
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"Linux"	TokenNameStringLiteral	Linux
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** True iff running on Windows. */	TokenNameCOMMENT_JAVADOC	 True iff running on Windows. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
WINDOWS	TokenNameIdentifier	 WINDOWS
=	TokenNameEQUAL	
OS_NAME	TokenNameIdentifier	 OS  NAME
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"Windows"	TokenNameStringLiteral	Windows
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** True iff running on SunOS. */	TokenNameCOMMENT_JAVADOC	 True iff running on SunOS. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
SUN_OS	TokenNameIdentifier	 SUN  OS
=	TokenNameEQUAL	
OS_NAME	TokenNameIdentifier	 OS  NAME
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"SunOS"	TokenNameStringLiteral	SunOS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** True iff running on Mac OS X */	TokenNameCOMMENT_JAVADOC	 True iff running on Mac OS X 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
MAC_OS_X	TokenNameIdentifier	 MAC  OS  X
=	TokenNameEQUAL	
OS_NAME	TokenNameIdentifier	 OS  NAME
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"Mac OS X"	TokenNameStringLiteral	Mac OS X
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
OS_ARCH	TokenNameIdentifier	 OS  ARCH
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"os.arch"	TokenNameStringLiteral	os.arch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
OS_VERSION	TokenNameIdentifier	 OS  VERSION
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"os.version"	TokenNameStringLiteral	os.version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JAVA_VENDOR	TokenNameIdentifier	 JAVA  VENDOR
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"java.vendor"	TokenNameStringLiteral	java.vendor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
JRE_IS_MINIMUM_JAVA6	TokenNameIdentifier	 JRE  IS  MINIMUM  JAV A6
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
JRE_IS_MINIMUM_JAVA7	TokenNameIdentifier	 JRE  IS  MINIMUM  JAV A7
;	TokenNameSEMICOLON	
/** True iff running on a 64bit JVM */	TokenNameCOMMENT_JAVADOC	 True iff running on a 64bit JVM 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
JRE_IS_64BIT	TokenNameIdentifier	 JRE  IS 64 BIT
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
is64Bit	TokenNameIdentifier	 is64 Bit
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
unsafeClass	TokenNameIdentifier	 unsafe Class
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
"sun.misc.Unsafe"	TokenNameStringLiteral	sun.misc.Unsafe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Field	TokenNameIdentifier	 Field
unsafeField	TokenNameIdentifier	 unsafe Field
=	TokenNameEQUAL	
unsafeClass	TokenNameIdentifier	 unsafe Class
.	TokenNameDOT	
getDeclaredField	TokenNameIdentifier	 get Declared Field
(	TokenNameLPAREN	
"theUnsafe"	TokenNameStringLiteral	theUnsafe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unsafeField	TokenNameIdentifier	 unsafe Field
.	TokenNameDOT	
setAccessible	TokenNameIdentifier	 set Accessible
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
unsafe	TokenNameIdentifier	 unsafe
=	TokenNameEQUAL	
unsafeField	TokenNameIdentifier	 unsafe Field
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
addressSize	TokenNameIdentifier	 address Size
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Number	TokenNameIdentifier	 Number
)	TokenNameRPAREN	
unsafeClass	TokenNameIdentifier	 unsafe Class
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"addressSize"	TokenNameStringLiteral	addressSize
)	TokenNameRPAREN	
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
unsafe	TokenNameIdentifier	 unsafe
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("Address size: " + addressSize); 	TokenNameCOMMENT_LINE	System.out.println("Address size: " + addressSize); 
is64Bit	TokenNameIdentifier	 is64 Bit
=	TokenNameEQUAL	
addressSize	TokenNameIdentifier	 address Size
>=	TokenNameGREATER_EQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"sun.arch.data.model"	TokenNameStringLiteral	sun.arch.data.model
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
is64Bit	TokenNameIdentifier	 is64 Bit
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"64"	TokenNameStringLiteral	64
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
OS_ARCH	TokenNameIdentifier	 OS  ARCH
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
OS_ARCH	TokenNameIdentifier	 OS  ARCH
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"64"	TokenNameStringLiteral	64
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
is64Bit	TokenNameIdentifier	 is64 Bit
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
is64Bit	TokenNameIdentifier	 is64 Bit
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
JRE_IS_64BIT	TokenNameIdentifier	 JRE  IS 64 BIT
=	TokenNameEQUAL	
is64Bit	TokenNameIdentifier	 is64 Bit
;	TokenNameSEMICOLON	
// this method only exists in Java 6: 	TokenNameCOMMENT_LINE	this method only exists in Java 6: 
boolean	TokenNameboolean	
v6	TokenNameIdentifier	 v6
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"isEmpty"	TokenNameStringLiteral	isEmpty
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
nsme	TokenNameIdentifier	 nsme
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v6	TokenNameIdentifier	 v6
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
JRE_IS_MINIMUM_JAVA6	TokenNameIdentifier	 JRE  IS  MINIMUM  JAV A6
=	TokenNameEQUAL	
v6	TokenNameIdentifier	 v6
;	TokenNameSEMICOLON	
// this method only exists in Java 7: 	TokenNameCOMMENT_LINE	this method only exists in Java 7: 
boolean	TokenNameboolean	
v7	TokenNameIdentifier	 v7
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Throwable	TokenNameIdentifier	 Throwable
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"getSuppressed"	TokenNameStringLiteral	getSuppressed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
nsme	TokenNameIdentifier	 nsme
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v7	TokenNameIdentifier	 v7
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
JRE_IS_MINIMUM_JAVA7	TokenNameIdentifier	 JRE  IS  MINIMUM  JAV A7
=	TokenNameEQUAL	
v7	TokenNameIdentifier	 v7
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// this method prevents inlining the final version constant in compiled classes, 	TokenNameCOMMENT_LINE	this method prevents inlining the final version constant in compiled classes, 
// see: http://www.javaworld.com/community/node/3400 	TokenNameCOMMENT_LINE	see: http://www.javaworld.com/community/node/3400 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
ident	TokenNameIdentifier	 ident
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// NOTE: we track per-segment version as a String with the "X.Y" format, e.g. 	TokenNameCOMMENT_LINE	NOTE: we track per-segment version as a String with the "X.Y" format, e.g. 
// "4.0", "3.1", "3.0". Therefore when we change this constant, we should keep 	TokenNameCOMMENT_LINE	"4.0", "3.1", "3.0". Therefore when we change this constant, we should keep 
// the format. 	TokenNameCOMMENT_LINE	the format. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
LUCENE_MAIN_VERSION	TokenNameIdentifier	 LUCENE  MAIN  VERSION
=	TokenNameEQUAL	
ident	TokenNameIdentifier	 ident
(	TokenNameLPAREN	
"3.6.2"	TokenNameStringLiteral	3.6.2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
LUCENE_VERSION	TokenNameIdentifier	 LUCENE  VERSION
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
Package	TokenNameIdentifier	 Package
pkg	TokenNameIdentifier	 pkg
=	TokenNameEQUAL	
LucenePackage	TokenNameIdentifier	 Lucene Package
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pkg	TokenNameIdentifier	 pkg
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
pkg	TokenNameIdentifier	 pkg
.	TokenNameDOT	
getImplementationVersion	TokenNameIdentifier	 get Implementation Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
LUCENE_MAIN_VERSION	TokenNameIdentifier	 LUCENE  MAIN  VERSION
+	TokenNamePLUS	
"-SNAPSHOT"	TokenNameStringLiteral	-SNAPSHOT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
LUCENE_MAIN_VERSION	TokenNameIdentifier	 LUCENE  MAIN  VERSION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
LUCENE_MAIN_VERSION	TokenNameIdentifier	 LUCENE  MAIN  VERSION
+	TokenNamePLUS	
"-SNAPSHOT "	TokenNameStringLiteral	-SNAPSHOT 
+	TokenNamePLUS	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
LUCENE_VERSION	TokenNameIdentifier	 LUCENE  VERSION
=	TokenNameEQUAL	
ident	TokenNameIdentifier	 ident
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
