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
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
AssertionFailedError	TokenNameIdentifier	 Assertion Failed Error
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
HashMap	TokenNameIdentifier	 Hash Map
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
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
condition	TokenNameIdentifier	 condition
.	TokenNameDOT	
Os	TokenNameIdentifier	 Os
;	TokenNameSEMICOLON	
/** * JUnit 3 testcases for org.apache.tools.ant.IntrospectionHelper. * */	TokenNameCOMMENT_JAVADOC	 JUnit 3 testcases for org.apache.tools.ant.IntrospectionHelper. 
public	TokenNamepublic	
class	TokenNameclass	
IntrospectionHelperTest	TokenNameIdentifier	 Introspection Helper Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
private	TokenNameprivate	
IntrospectionHelper	TokenNameIdentifier	 Introspection Helper
ih	TokenNameIdentifier	 ih
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
projectBasedir	TokenNameIdentifier	 project Basedir
=	TokenNameEQUAL	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
IntrospectionHelperTest	TokenNameIdentifier	 Introspection Helper Test
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
public	TokenNamepublic	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
Project	TokenNameIdentifier	 Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setBasedir	TokenNameIdentifier	 set Basedir
(	TokenNameLPAREN	
projectBasedir	TokenNameIdentifier	 project Basedir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ih	TokenNameIdentifier	 ih
=	TokenNameEQUAL	
IntrospectionHelper	TokenNameIdentifier	 Introspection Helper
.	TokenNameDOT	
getHelper	TokenNameIdentifier	 get Helper
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testIsDynamic	TokenNameIdentifier	 test Is Dynamic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Not dynamic"	TokenNameStringLiteral	Not dynamic
,	TokenNameCOMMA	
false	TokenNamefalse	
==	TokenNameEQUAL_EQUAL	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
isDynamic	TokenNameIdentifier	 is Dynamic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testIsContainer	TokenNameIdentifier	 test Is Container
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Not a container"	TokenNameStringLiteral	Not a container
,	TokenNameCOMMA	
false	TokenNamefalse	
==	TokenNameEQUAL_EQUAL	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
isContainer	TokenNameIdentifier	 is Container
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testAddText	TokenNameIdentifier	 test Add Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
addText	TokenNameIdentifier	 add Text
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
addText	TokenNameIdentifier	 add Text
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
"test2"	TokenNameStringLiteral	test2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"test2 shouldn't be equal to test"	TokenNameStringLiteral	test2 shouldn't be equal to test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getCause	TokenNameIdentifier	 get Cause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
AssertionFailedError	TokenNameIdentifier	 Assertion Failed Error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ih	TokenNameIdentifier	 ih
=	TokenNameEQUAL	
IntrospectionHelper	TokenNameIdentifier	 Introspection Helper
.	TokenNameDOT	
getHelper	TokenNameIdentifier	 get Helper
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
addText	TokenNameIdentifier	 add Text
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"String doesn't support addText"	TokenNameStringLiteral	String doesn't support addText
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testGetAddTextMethod	TokenNameIdentifier	 test Get Add Text Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Method	TokenNameIdentifier	 Method
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
getAddTextMethod	TokenNameIdentifier	 get Add Text Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertMethod	TokenNameIdentifier	 assert Method
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
,	TokenNameCOMMA	
"addText"	TokenNameStringLiteral	addText
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
"bing!"	TokenNameStringLiteral	bing!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ih	TokenNameIdentifier	 ih
=	TokenNameEQUAL	
IntrospectionHelper	TokenNameIdentifier	 Introspection Helper
.	TokenNameDOT	
getHelper	TokenNameIdentifier	 get Helper
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
getAddTextMethod	TokenNameIdentifier	 get Add Text Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSupportsCharacters	TokenNameIdentifier	 test Supports Characters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"IntrospectionHelperTest supports addText"	TokenNameStringLiteral	IntrospectionHelperTest supports addText
,	TokenNameCOMMA	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
supportsCharacters	TokenNameIdentifier	 supports Characters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ih	TokenNameIdentifier	 ih
=	TokenNameEQUAL	
IntrospectionHelper	TokenNameIdentifier	 Introspection Helper
.	TokenNameDOT	
getHelper	TokenNameIdentifier	 get Helper
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"String doesn't support addText"	TokenNameStringLiteral	String doesn't support addText
,	TokenNameCOMMA	
!	TokenNameNOT	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
supportsCharacters	TokenNameIdentifier	 supports Characters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addText	TokenNameIdentifier	 add Text
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testElementCreators	TokenNameIdentifier	 test Element Creators
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
getElementType	TokenNameIdentifier	 get Element Type
(	TokenNameLPAREN	
"one"	TokenNameStringLiteral	one
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"don't have element type one"	TokenNameStringLiteral	don't have element type one
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
getElementType	TokenNameIdentifier	 get Element Type
(	TokenNameLPAREN	
"two"	TokenNameStringLiteral	two
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"createTwo takes arguments"	TokenNameStringLiteral	createTwo takes arguments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
getElementType	TokenNameIdentifier	 get Element Type
(	TokenNameLPAREN	
"three"	TokenNameStringLiteral	three
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"createThree returns void"	TokenNameStringLiteral	createThree returns void
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
getElementType	TokenNameIdentifier	 get Element Type
(	TokenNameLPAREN	
"four"	TokenNameStringLiteral	four
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"createFour returns array"	TokenNameStringLiteral	createFour returns array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
getElementType	TokenNameIdentifier	 get Element Type
(	TokenNameLPAREN	
"five"	TokenNameStringLiteral	five
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"createFive returns primitive type"	TokenNameStringLiteral	createFive returns primitive type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
getElementType	TokenNameIdentifier	 get Element Type
(	TokenNameLPAREN	
"six"	TokenNameStringLiteral	six
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
createElement	TokenNameIdentifier	 create Element
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
"six"	TokenNameStringLiteral	six
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
getElementType	TokenNameIdentifier	 get Element Type
(	TokenNameLPAREN	
"seven"	TokenNameStringLiteral	seven
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"addSeven takes two arguments"	TokenNameStringLiteral	addSeven takes two arguments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
getElementType	TokenNameIdentifier	 get Element Type
(	TokenNameLPAREN	
"eight"	TokenNameStringLiteral	eight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"addEight takes no arguments"	TokenNameStringLiteral	addEight takes no arguments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
getElementType	TokenNameIdentifier	 get Element Type
(	TokenNameLPAREN	
"nine"	TokenNameStringLiteral	nine
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"nine return non void"	TokenNameStringLiteral	nine return non void
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
getElementType	TokenNameIdentifier	 get Element Type
(	TokenNameLPAREN	
"ten"	TokenNameStringLiteral	ten
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"addTen takes array argument"	TokenNameStringLiteral	addTen takes array argument
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
getElementType	TokenNameIdentifier	 get Element Type
(	TokenNameLPAREN	
"eleven"	TokenNameStringLiteral	eleven
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"addEleven takes primitive argument"	TokenNameStringLiteral	addEleven takes primitive argument
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
getElementType	TokenNameIdentifier	 get Element Type
(	TokenNameLPAREN	
"twelve"	TokenNameStringLiteral	twelve
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"no primitive constructor for java.lang.Class"	TokenNameStringLiteral	no primitive constructor for java.lang.Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
StringBuffer	TokenNameIdentifier	 String Buffer
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
getElementType	TokenNameIdentifier	 get Element Type
(	TokenNameLPAREN	
"thirteen"	TokenNameStringLiteral	thirteen
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
createElement	TokenNameIdentifier	 create Element
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
"thirteen"	TokenNameStringLiteral	thirteen
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
createElement	TokenNameIdentifier	 create Element
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
"fourteen"	TokenNameStringLiteral	fourteen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"fourteen throws NullPointerException"	TokenNameStringLiteral	fourteen throws NullPointerException
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getCause	TokenNameIdentifier	 get Cause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
createElement	TokenNameIdentifier	 create Element
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
"fourteen"	TokenNameStringLiteral	fourteen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"fifteen throws NullPointerException"	TokenNameStringLiteral	fifteen throws NullPointerException
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getCause	TokenNameIdentifier	 get Cause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
getExpectedNestedElements	TokenNameIdentifier	 get Expected Nested Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
elemMap	TokenNameIdentifier	 elem Map
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemMap	TokenNameIdentifier	 elem Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"six"	TokenNameStringLiteral	six
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemMap	TokenNameIdentifier	 elem Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"thirteen"	TokenNameStringLiteral	thirteen
,	TokenNameCOMMA	
StringBuffer	TokenNameIdentifier	 String Buffer
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemMap	TokenNameIdentifier	 elem Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"fourteen"	TokenNameStringLiteral	fourteen
,	TokenNameCOMMA	
StringBuffer	TokenNameIdentifier	 String Buffer
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemMap	TokenNameIdentifier	 elem Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"fifteen"	TokenNameStringLiteral	fifteen
,	TokenNameCOMMA	
StringBuffer	TokenNameIdentifier	 String Buffer
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
elemMap	TokenNameIdentifier	 elem Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testGetNestedElements	TokenNameIdentifier	 test Get Nested Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
elemMap	TokenNameIdentifier	 elem Map
=	TokenNameEQUAL	
getExpectedNestedElements	TokenNameIdentifier	 get Expected Nested Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
getNestedElements	TokenNameIdentifier	 get Nested Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
expect	TokenNameIdentifier	 expect
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
)	TokenNameRPAREN	
elemMap	TokenNameIdentifier	 elem Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"Support for "	TokenNameStringLiteral	Support for 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
" in IntrospectioNHelperTest?"	TokenNameStringLiteral	 in IntrospectioNHelperTest?
,	TokenNameCOMMA	
expect	TokenNameIdentifier	 expect
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Return type of "	TokenNameStringLiteral	Return type of 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
expect	TokenNameIdentifier	 expect
,	TokenNameCOMMA	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
getElementType	TokenNameIdentifier	 get Element Type
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemMap	TokenNameIdentifier	 elem Map
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Found all"	TokenNameStringLiteral	Found all
,	TokenNameCOMMA	
elemMap	TokenNameIdentifier	 elem Map
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testGetNestedElementMap	TokenNameIdentifier	 test Get Nested Element Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
elemMap	TokenNameIdentifier	 elem Map
=	TokenNameEQUAL	
getExpectedNestedElements	TokenNameIdentifier	 get Expected Nested Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
actualMap	TokenNameIdentifier	 actual Map
=	TokenNameEQUAL	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
getNestedElementMap	TokenNameIdentifier	 get Nested Element Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
actualMap	TokenNameIdentifier	 actual Map
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
elemName	TokenNameIdentifier	 elem Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
elemClass	TokenNameIdentifier	 elem Class
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
)	TokenNameRPAREN	
elemMap	TokenNameIdentifier	 elem Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
elemName	TokenNameIdentifier	 elem Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"Support for "	TokenNameStringLiteral	Support for 
+	TokenNamePLUS	
elemName	TokenNameIdentifier	 elem Name
+	TokenNamePLUS	
" in IntrospectionHelperTest?"	TokenNameStringLiteral	 in IntrospectionHelperTest?
,	TokenNameCOMMA	
elemClass	TokenNameIdentifier	 elem Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Type of "	TokenNameStringLiteral	Type of 
+	TokenNamePLUS	
elemName	TokenNameIdentifier	 elem Name
,	TokenNameCOMMA	
elemClass	TokenNameIdentifier	 elem Class
,	TokenNameCOMMA	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elemMap	TokenNameIdentifier	 elem Map
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
elemName	TokenNameIdentifier	 elem Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Found all"	TokenNameStringLiteral	Found all
,	TokenNameCOMMA	
elemMap	TokenNameIdentifier	 elem Map
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check it's a read-only map. 	TokenNameCOMMENT_LINE	Check it's a read-only map. 
try	TokenNametry	
{	TokenNameLBRACE	
actualMap	TokenNameIdentifier	 actual Map
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testGetElementMethod	TokenNameIdentifier	 test Get Element Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertElemMethod	TokenNameIdentifier	 assert Elem Method
(	TokenNameLPAREN	
"six"	TokenNameStringLiteral	six
,	TokenNameCOMMA	
"createSix"	TokenNameStringLiteral	createSix
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertElemMethod	TokenNameIdentifier	 assert Elem Method
(	TokenNameLPAREN	
"thirteen"	TokenNameStringLiteral	thirteen
,	TokenNameCOMMA	
"addThirteen"	TokenNameStringLiteral	addThirteen
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
StringBuffer	TokenNameIdentifier	 String Buffer
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertElemMethod	TokenNameIdentifier	 assert Elem Method
(	TokenNameLPAREN	
"fourteen"	TokenNameStringLiteral	fourteen
,	TokenNameCOMMA	
"addFourteen"	TokenNameStringLiteral	addFourteen
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
StringBuffer	TokenNameIdentifier	 String Buffer
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertElemMethod	TokenNameIdentifier	 assert Elem Method
(	TokenNameLPAREN	
"fifteen"	TokenNameStringLiteral	fifteen
,	TokenNameCOMMA	
"createFifteen"	TokenNameStringLiteral	createFifteen
,	TokenNameCOMMA	
StringBuffer	TokenNameIdentifier	 String Buffer
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
assertElemMethod	TokenNameIdentifier	 assert Elem Method
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
elemName	TokenNameIdentifier	 elem Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
methodName	TokenNameIdentifier	 method Name
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
returnType	TokenNameIdentifier	 return Type
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
methodArg	TokenNameIdentifier	 method Arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Method	TokenNameIdentifier	 Method
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
getElementMethod	TokenNameIdentifier	 get Element Method
(	TokenNameLPAREN	
elemName	TokenNameIdentifier	 elem Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Method name"	TokenNameStringLiteral	Method name
,	TokenNameCOMMA	
methodName	TokenNameIdentifier	 method Name
,	TokenNameCOMMA	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
expectedReturnType	TokenNameIdentifier	 expected Return Type
=	TokenNameEQUAL	
(	TokenNameLPAREN	
returnType	TokenNameIdentifier	 return Type
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
Void	TokenNameIdentifier	 Void
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
:	TokenNameCOLON	
returnType	TokenNameIdentifier	 return Type
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Return type"	TokenNameStringLiteral	Return type
,	TokenNameCOMMA	
expectedReturnType	TokenNameIdentifier	 expected Return Type
,	TokenNameCOMMA	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getReturnType	TokenNameIdentifier	 get Return Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getParameterTypes	TokenNameIdentifier	 get Parameter Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
methodArg	TokenNameIdentifier	 method Arg
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Arg Count"	TokenNameStringLiteral	Arg Count
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Arg Type"	TokenNameStringLiteral	Arg Type
,	TokenNameCOMMA	
methodArg	TokenNameIdentifier	 method Arg
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Arg Count"	TokenNameStringLiteral	Arg Count
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
createTwo	TokenNameIdentifier	 create Two
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
createThree	TokenNameIdentifier	 create Three
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
createFour	TokenNameIdentifier	 create Four
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
createFive	TokenNameIdentifier	 create Five
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
createSix	TokenNameIdentifier	 create Six
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"test"	TokenNameStringLiteral	test
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
StringBuffer	TokenNameIdentifier	 String Buffer
createFifteen	TokenNameIdentifier	 create Fifteen
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addSeven	TokenNameIdentifier	 add Seven
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addEight	TokenNameIdentifier	 add Eight
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
addNine	TokenNameIdentifier	 add Nine
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addTen	TokenNameIdentifier	 add Ten
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addEleven	TokenNameIdentifier	 add Eleven
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addTwelve	TokenNameIdentifier	 add Twelve
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addThirteen	TokenNameIdentifier	 add Thirteen
(	TokenNameLPAREN	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addFourteen	TokenNameIdentifier	 add Fourteen
(	TokenNameLPAREN	
StringBuffer	TokenNameIdentifier	 String Buffer
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testAttributeSetters	TokenNameIdentifier	 test Attribute Setters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
"one"	TokenNameStringLiteral	one
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"setOne doesn't exist"	TokenNameStringLiteral	setOne doesn't exist
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
"two"	TokenNameStringLiteral	two
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"setTwo returns non void"	TokenNameStringLiteral	setTwo returns non void
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
"three"	TokenNameStringLiteral	three
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"setThree takes no args"	TokenNameStringLiteral	setThree takes no args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
"four"	TokenNameStringLiteral	four
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"setFour takes two args"	TokenNameStringLiteral	setFour takes two args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
"five"	TokenNameStringLiteral	five
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"setFive takes array arg"	TokenNameStringLiteral	setFive takes array arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
"six"	TokenNameStringLiteral	six
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Project doesn't have a String constructor"	TokenNameStringLiteral	Project doesn't have a String constructor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
"seven"	TokenNameStringLiteral	seven
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
"seven"	TokenNameStringLiteral	seven
,	TokenNameCOMMA	
"3"	TokenNameStringLiteral	3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"2 shouldn't be equals to three"	TokenNameStringLiteral	2 shouldn't be equals to three
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getCause	TokenNameIdentifier	 get Cause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
AssertionFailedError	TokenNameIdentifier	 Assertion Failed Error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
"eight"	TokenNameStringLiteral	eight
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
"eight"	TokenNameStringLiteral	eight
,	TokenNameCOMMA	
"3"	TokenNameStringLiteral	3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"2 shouldn't be equals to three - as int"	TokenNameStringLiteral	2 shouldn't be equals to three - as int
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getCause	TokenNameIdentifier	 get Cause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
AssertionFailedError	TokenNameIdentifier	 Assertion Failed Error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
"nine"	TokenNameStringLiteral	nine
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
"nine"	TokenNameStringLiteral	nine
,	TokenNameCOMMA	
"3"	TokenNameStringLiteral	3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"2 shouldn't be equals to three - as Integer"	TokenNameStringLiteral	2 shouldn't be equals to three - as Integer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getCause	TokenNameIdentifier	 get Cause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
AssertionFailedError	TokenNameIdentifier	 Assertion Failed Error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
"ten"	TokenNameStringLiteral	ten
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
"ten"	TokenNameStringLiteral	ten
,	TokenNameCOMMA	
"3"	TokenNameStringLiteral	3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
projectBasedir	TokenNameIdentifier	 project Basedir
+	TokenNamePLUS	
"2 shouldn't be equals to "	TokenNameStringLiteral	2 shouldn't be equals to 
+	TokenNamePLUS	
projectBasedir	TokenNameIdentifier	 project Basedir
+	TokenNamePLUS	
"3"	TokenNameStringLiteral	3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getCause	TokenNameIdentifier	 get Cause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
AssertionFailedError	TokenNameIdentifier	 Assertion Failed Error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
"eleven"	TokenNameStringLiteral	eleven
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
"eleven"	TokenNameStringLiteral	eleven
,	TokenNameCOMMA	
"on"	TokenNameStringLiteral	on
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"on shouldn't be false"	TokenNameStringLiteral	on shouldn't be false
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getCause	TokenNameIdentifier	 get Cause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
AssertionFailedError	TokenNameIdentifier	 Assertion Failed Error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
"twelve"	TokenNameStringLiteral	twelve
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
"twelve"	TokenNameStringLiteral	twelve
,	TokenNameCOMMA	
"on"	TokenNameStringLiteral	on
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"on shouldn't be false"	TokenNameStringLiteral	on shouldn't be false
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getCause	TokenNameIdentifier	 get Cause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
AssertionFailedError	TokenNameIdentifier	 Assertion Failed Error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
"thirteen"	TokenNameStringLiteral	thirteen
,	TokenNameCOMMA	
"org.apache.tools.ant.Project"	TokenNameStringLiteral	org.apache.tools.ant.Project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
"thirteen"	TokenNameStringLiteral	thirteen
,	TokenNameCOMMA	
"org.apache.tools.ant.ProjectHelper"	TokenNameStringLiteral	org.apache.tools.ant.ProjectHelper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"org.apache.tools.ant.Project shouldn't be equal to org.apache.tools.ant.ProjectHelper"	TokenNameStringLiteral	org.apache.tools.ant.Project shouldn't be equal to org.apache.tools.ant.ProjectHelper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getCause	TokenNameIdentifier	 get Cause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
AssertionFailedError	TokenNameIdentifier	 Assertion Failed Error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
"thirteen"	TokenNameStringLiteral	thirteen
,	TokenNameCOMMA	
"org.apache.tools.ant.Project2"	TokenNameStringLiteral	org.apache.tools.ant.Project2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"org.apache.tools.ant.Project2 doesn't exist"	TokenNameStringLiteral	org.apache.tools.ant.Project2 doesn't exist
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getCause	TokenNameIdentifier	 get Cause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
"fourteen"	TokenNameStringLiteral	fourteen
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
"fourteen"	TokenNameStringLiteral	fourteen
,	TokenNameCOMMA	
"on"	TokenNameStringLiteral	on
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"2 shouldn't be equals to three - as StringBuffer"	TokenNameStringLiteral	2 shouldn't be equals to three - as StringBuffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getCause	TokenNameIdentifier	 get Cause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
AssertionFailedError	TokenNameIdentifier	 Assertion Failed Error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
"fifteen"	TokenNameStringLiteral	fifteen
,	TokenNameCOMMA	
"abcd"	TokenNameStringLiteral	abcd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
"fifteen"	TokenNameStringLiteral	fifteen
,	TokenNameCOMMA	
"on"	TokenNameStringLiteral	on
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"o shouldn't be equal to a"	TokenNameStringLiteral	o shouldn't be equal to a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getCause	TokenNameIdentifier	 get Cause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
AssertionFailedError	TokenNameIdentifier	 Assertion Failed Error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
"sixteen"	TokenNameStringLiteral	sixteen
,	TokenNameCOMMA	
"abcd"	TokenNameStringLiteral	abcd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
"sixteen"	TokenNameStringLiteral	sixteen
,	TokenNameCOMMA	
"on"	TokenNameStringLiteral	on
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"o shouldn't be equal to a"	TokenNameStringLiteral	o shouldn't be equal to a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getCause	TokenNameIdentifier	 get Cause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
AssertionFailedError	TokenNameIdentifier	 Assertion Failed Error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
"seventeen"	TokenNameStringLiteral	seventeen
,	TokenNameCOMMA	
"17"	TokenNameStringLiteral	17
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
"seventeen"	TokenNameStringLiteral	seventeen
,	TokenNameCOMMA	
"3"	TokenNameStringLiteral	3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"17 shouldn't be equals to three"	TokenNameStringLiteral	17 shouldn't be equals to three
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getCause	TokenNameIdentifier	 get Cause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
AssertionFailedError	TokenNameIdentifier	 Assertion Failed Error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
"eightteen"	TokenNameStringLiteral	eightteen
,	TokenNameCOMMA	
"18"	TokenNameStringLiteral	18
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
"eightteen"	TokenNameStringLiteral	eightteen
,	TokenNameCOMMA	
"3"	TokenNameStringLiteral	3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"18 shouldn't be equals to three"	TokenNameStringLiteral	18 shouldn't be equals to three
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getCause	TokenNameIdentifier	 get Cause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
AssertionFailedError	TokenNameIdentifier	 Assertion Failed Error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
"nineteen"	TokenNameStringLiteral	nineteen
,	TokenNameCOMMA	
"19"	TokenNameStringLiteral	19
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
setAttribute	TokenNameIdentifier	 set Attribute
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
"nineteen"	TokenNameStringLiteral	nineteen
,	TokenNameCOMMA	
"3"	TokenNameStringLiteral	3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"19 shouldn't be equals to three"	TokenNameStringLiteral	19 shouldn't be equals to three
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getCause	TokenNameIdentifier	 get Cause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
AssertionFailedError	TokenNameIdentifier	 Assertion Failed Error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
getExpectedAttributes	TokenNameIdentifier	 get Expected Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
attrMap	TokenNameIdentifier	 attr Map
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"seven"	TokenNameStringLiteral	seven
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"eight"	TokenNameStringLiteral	eight
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"nine"	TokenNameStringLiteral	nine
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ten"	TokenNameStringLiteral	ten
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"eleven"	TokenNameStringLiteral	eleven
,	TokenNameCOMMA	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"twelve"	TokenNameStringLiteral	twelve
,	TokenNameCOMMA	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"thirteen"	TokenNameStringLiteral	thirteen
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"fourteen"	TokenNameStringLiteral	fourteen
,	TokenNameCOMMA	
StringBuffer	TokenNameIdentifier	 String Buffer
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"fifteen"	TokenNameStringLiteral	fifteen
,	TokenNameCOMMA	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"sixteen"	TokenNameStringLiteral	sixteen
,	TokenNameCOMMA	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"seventeen"	TokenNameStringLiteral	seventeen
,	TokenNameCOMMA	
Byte	TokenNameIdentifier	 Byte
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"eightteen"	TokenNameStringLiteral	eightteen
,	TokenNameCOMMA	
Short	TokenNameIdentifier	 Short
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"nineteen"	TokenNameStringLiteral	nineteen
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * JUnit 3.7 adds a getName method to TestCase - so we now * have a name attribute in IntrospectionHelperTest if we run * under JUnit 3.7 but not in earlier versions. * * Simply add it here and remove it after the tests. */	TokenNameCOMMENT_BLOCK	 JUnit 3.7 adds a getName method to TestCase - so we now have a name attribute in IntrospectionHelperTest if we run under JUnit 3.7 but not in earlier versions. * Simply add it here and remove it after the tests. 
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"name"	TokenNameStringLiteral	name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
attrMap	TokenNameIdentifier	 attr Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testGetAttributes	TokenNameIdentifier	 test Get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
attrMap	TokenNameIdentifier	 attr Map
=	TokenNameEQUAL	
getExpectedAttributes	TokenNameIdentifier	 get Expected Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
expect	TokenNameIdentifier	 expect
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
)	TokenNameRPAREN	
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"Support for "	TokenNameStringLiteral	Support for 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
" in IntrospectionHelperTest?"	TokenNameStringLiteral	 in IntrospectionHelperTest?
,	TokenNameCOMMA	
expect	TokenNameIdentifier	 expect
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Type of "	TokenNameStringLiteral	Type of 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
expect	TokenNameIdentifier	 expect
,	TokenNameCOMMA	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
getAttributeType	TokenNameIdentifier	 get Attribute Type
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
"name"	TokenNameStringLiteral	name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Found all"	TokenNameStringLiteral	Found all
,	TokenNameCOMMA	
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testGetAttributeMap	TokenNameIdentifier	 test Get Attribute Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
attrMap	TokenNameIdentifier	 attr Map
=	TokenNameEQUAL	
getExpectedAttributes	TokenNameIdentifier	 get Expected Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
actualMap	TokenNameIdentifier	 actual Map
=	TokenNameEQUAL	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
getAttributeMap	TokenNameIdentifier	 get Attribute Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
actualMap	TokenNameIdentifier	 actual Map
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
attrName	TokenNameIdentifier	 attr Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
attrClass	TokenNameIdentifier	 attr Class
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
)	TokenNameRPAREN	
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
attrName	TokenNameIdentifier	 attr Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"Support for "	TokenNameStringLiteral	Support for 
+	TokenNamePLUS	
attrName	TokenNameIdentifier	 attr Name
+	TokenNamePLUS	
" in IntrospectionHelperTest?"	TokenNameStringLiteral	 in IntrospectionHelperTest?
,	TokenNameCOMMA	
attrClass	TokenNameIdentifier	 attr Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Type of "	TokenNameStringLiteral	Type of 
+	TokenNamePLUS	
attrName	TokenNameIdentifier	 attr Name
,	TokenNameCOMMA	
attrClass	TokenNameIdentifier	 attr Class
,	TokenNameCOMMA	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
attrName	TokenNameIdentifier	 attr Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
"name"	TokenNameStringLiteral	name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Found all"	TokenNameStringLiteral	Found all
,	TokenNameCOMMA	
attrMap	TokenNameIdentifier	 attr Map
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check it's a read-only map. 	TokenNameCOMMENT_LINE	Check it's a read-only map. 
try	TokenNametry	
{	TokenNameLBRACE	
actualMap	TokenNameIdentifier	 actual Map
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testGetAttributeMethod	TokenNameIdentifier	 test Get Attribute Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertAttrMethod	TokenNameIdentifier	 assert Attr Method
(	TokenNameLPAREN	
"seven"	TokenNameStringLiteral	seven
,	TokenNameCOMMA	
"setSeven"	TokenNameStringLiteral	setSeven
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
,	TokenNameCOMMA	
"3"	TokenNameStringLiteral	3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAttrMethod	TokenNameIdentifier	 assert Attr Method
(	TokenNameLPAREN	
"eight"	TokenNameStringLiteral	eight
,	TokenNameCOMMA	
"setEight"	TokenNameStringLiteral	setEight
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAttrMethod	TokenNameIdentifier	 assert Attr Method
(	TokenNameLPAREN	
"nine"	TokenNameStringLiteral	nine
,	TokenNameCOMMA	
"setNine"	TokenNameStringLiteral	setNine
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAttrMethod	TokenNameIdentifier	 assert Attr Method
(	TokenNameLPAREN	
"ten"	TokenNameStringLiteral	ten
,	TokenNameCOMMA	
"setTen"	TokenNameStringLiteral	setTen
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
projectBasedir	TokenNameIdentifier	 project Basedir
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"toto"	TokenNameStringLiteral	toto
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAttrMethod	TokenNameIdentifier	 assert Attr Method
(	TokenNameLPAREN	
"eleven"	TokenNameStringLiteral	eleven
,	TokenNameCOMMA	
"setEleven"	TokenNameStringLiteral	setEleven
,	TokenNameCOMMA	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
,	TokenNameCOMMA	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAttrMethod	TokenNameIdentifier	 assert Attr Method
(	TokenNameLPAREN	
"twelve"	TokenNameStringLiteral	twelve
,	TokenNameCOMMA	
"setTwelve"	TokenNameStringLiteral	setTwelve
,	TokenNameCOMMA	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
,	TokenNameCOMMA	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAttrMethod	TokenNameIdentifier	 assert Attr Method
(	TokenNameLPAREN	
"thirteen"	TokenNameStringLiteral	thirteen
,	TokenNameCOMMA	
"setThirteen"	TokenNameStringLiteral	setThirteen
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAttrMethod	TokenNameIdentifier	 assert Attr Method
(	TokenNameLPAREN	
"fourteen"	TokenNameStringLiteral	fourteen
,	TokenNameCOMMA	
"setFourteen"	TokenNameStringLiteral	setFourteen
,	TokenNameCOMMA	
StringBuffer	TokenNameIdentifier	 String Buffer
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"3"	TokenNameStringLiteral	3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAttrMethod	TokenNameIdentifier	 assert Attr Method
(	TokenNameLPAREN	
"fifteen"	TokenNameStringLiteral	fifteen
,	TokenNameCOMMA	
"setFifteen"	TokenNameStringLiteral	setFifteen
,	TokenNameCOMMA	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
new	TokenNamenew	
Character	TokenNameIdentifier	 Character
(	TokenNameLPAREN	
'a'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Character	TokenNameIdentifier	 Character
(	TokenNameLPAREN	
'b'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAttrMethod	TokenNameIdentifier	 assert Attr Method
(	TokenNameLPAREN	
"sixteen"	TokenNameStringLiteral	sixteen
,	TokenNameCOMMA	
"setSixteen"	TokenNameStringLiteral	setSixteen
,	TokenNameCOMMA	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
new	TokenNamenew	
Character	TokenNameIdentifier	 Character
(	TokenNameLPAREN	
'a'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Character	TokenNameIdentifier	 Character
(	TokenNameLPAREN	
'b'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAttrMethod	TokenNameIdentifier	 assert Attr Method
(	TokenNameLPAREN	
"seventeen"	TokenNameStringLiteral	seventeen
,	TokenNameCOMMA	
"setSeventeen"	TokenNameStringLiteral	setSeventeen
,	TokenNameCOMMA	
Byte	TokenNameIdentifier	 Byte
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
new	TokenNamenew	
Byte	TokenNameIdentifier	 Byte
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
17	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Byte	TokenNameIdentifier	 Byte
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAttrMethod	TokenNameIdentifier	 assert Attr Method
(	TokenNameLPAREN	
"eightteen"	TokenNameStringLiteral	eightteen
,	TokenNameCOMMA	
"setEightteen"	TokenNameStringLiteral	setEightteen
,	TokenNameCOMMA	
Short	TokenNameIdentifier	 Short
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
new	TokenNamenew	
Short	TokenNameIdentifier	 Short
(	TokenNameLPAREN	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
18	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Short	TokenNameIdentifier	 Short
(	TokenNameLPAREN	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAttrMethod	TokenNameIdentifier	 assert Attr Method
(	TokenNameLPAREN	
"nineteen"	TokenNameStringLiteral	nineteen
,	TokenNameCOMMA	
"setNineteen"	TokenNameStringLiteral	setNineteen
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
19	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
assertAttrMethod	TokenNameIdentifier	 assert Attr Method
(	TokenNameLPAREN	
"onehundred"	TokenNameStringLiteral	onehundred
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Should have raised a BuildException!"	TokenNameStringLiteral	Should have raised a BuildException!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
assertAttrMethod	TokenNameIdentifier	 assert Attr Method
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
attrName	TokenNameIdentifier	 attr Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
methodName	TokenNameIdentifier	 method Name
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
methodArg	TokenNameIdentifier	 method Arg
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
arg	TokenNameIdentifier	 arg
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
badArg	TokenNameIdentifier	 bad Arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Method	TokenNameIdentifier	 Method
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
getAttributeMethod	TokenNameIdentifier	 get Attribute Method
(	TokenNameLPAREN	
attrName	TokenNameIdentifier	 attr Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertMethod	TokenNameIdentifier	 assert Method
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
,	TokenNameCOMMA	
methodName	TokenNameIdentifier	 method Name
,	TokenNameCOMMA	
methodArg	TokenNameIdentifier	 method Arg
,	TokenNameCOMMA	
arg	TokenNameIdentifier	 arg
,	TokenNameCOMMA	
badArg	TokenNameIdentifier	 bad Arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
setTwo	TokenNameIdentifier	 set Two
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setThree	TokenNameIdentifier	 set Three
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setFour	TokenNameIdentifier	 set Four
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s1	TokenNameIdentifier	 s1
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setFive	TokenNameIdentifier	 set Five
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setSix	TokenNameIdentifier	 set Six
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setSeven	TokenNameIdentifier	 set Seven
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2"	TokenNameStringLiteral	2
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setEight	TokenNameIdentifier	 set Eight
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setNine	TokenNameIdentifier	 set Nine
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setTen	TokenNameIdentifier	 set Ten
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
"unix"	TokenNameStringLiteral	unix
)	TokenNameRPAREN	
||	TokenNameOR_OR	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
"openvms"	TokenNameStringLiteral	openvms
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
projectBasedir	TokenNameIdentifier	 project Basedir
+	TokenNamePLUS	
"2"	TokenNameStringLiteral	2
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
"netware"	TokenNameStringLiteral	netware
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
projectBasedir	TokenNameIdentifier	 project Basedir
+	TokenNamePLUS	
"2"	TokenNameStringLiteral	2
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
US	TokenNameIdentifier	 US
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
projectBasedir	TokenNameIdentifier	 project Basedir
+	TokenNamePLUS	
"2"	TokenNameStringLiteral	2
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
US	TokenNameIdentifier	 US
)	TokenNameRPAREN	
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setEleven	TokenNameIdentifier	 set Eleven
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
!	TokenNameNOT	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setTwelve	TokenNameIdentifier	 set Twelve
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
!	TokenNameNOT	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setThirteen	TokenNameIdentifier	 set Thirteen
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setFourteen	TokenNameIdentifier	 set Fourteen
(	TokenNameLPAREN	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2"	TokenNameStringLiteral	2
,	TokenNameCOMMA	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setFifteen	TokenNameIdentifier	 set Fifteen
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
'a'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setSixteen	TokenNameIdentifier	 set Sixteen
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
charValue	TokenNameIdentifier	 char Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
'a'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setSeventeen	TokenNameIdentifier	 set Seventeen
(	TokenNameLPAREN	
byte	TokenNamebyte	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
17	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setEightteen	TokenNameIdentifier	 set Eightteen
(	TokenNameLPAREN	
short	TokenNameshort	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
18	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setNineteen	TokenNameIdentifier	 set Nineteen
(	TokenNameLPAREN	
double	TokenNamedouble	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
-	TokenNameMINUS	
19	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Expected 19, received "	TokenNameStringLiteral	Expected 19, received 
+	TokenNamePLUS	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
diff	TokenNameIdentifier	 diff
>	TokenNameGREATER	
-	TokenNameMINUS	
1e-6	TokenNameDoubleLiteral	
&&	TokenNameAND_AND	
diff	TokenNameIdentifier	 diff
<	TokenNameLESS	
1e-6	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testGetExtensionPoints	TokenNameIdentifier	 test Get Extension Points
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
extensions	TokenNameIdentifier	 extensions
=	TokenNameEQUAL	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
getExtensionPoints	TokenNameIdentifier	 get Extension Points
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
adders	TokenNameIdentifier	 adders
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"extension count"	TokenNameStringLiteral	extension count
,	TokenNameCOMMA	
adders	TokenNameIdentifier	 adders
,	TokenNameCOMMA	
extensions	TokenNameIdentifier	 extensions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// this original test assumed something about the order of 	TokenNameCOMMENT_LINE	this original test assumed something about the order of 
// add(Number) and addConfigured(Map) returned by reflection. 	TokenNameCOMMENT_LINE	add(Number) and addConfigured(Map) returned by reflection. 
// Unfortunately the assumption doesn't hold for all VMs 	TokenNameCOMMENT_LINE	Unfortunately the assumption doesn't hold for all VMs 
// (failed on MacOS X using JDK 1.4.2_05) and the possible 	TokenNameCOMMENT_LINE	(failed on MacOS X using JDK 1.4.2_05) and the possible 
// combinatorics are too hard to check. We really only want 	TokenNameCOMMENT_LINE	combinatorics are too hard to check. We really only want 
// to ensure that the more derived Hashtable can be found 	TokenNameCOMMENT_LINE	to ensure that the more derived Hashtable can be found 
// before Map. 	TokenNameCOMMENT_LINE	before Map. 
// assertExtMethod(extensions.get(0), "add", Number.class, 	TokenNameCOMMENT_LINE	assertExtMethod(extensions.get(0), "add", Number.class, 
// new Integer(2), new Integer(3)); 	TokenNameCOMMENT_LINE	new Integer(2), new Integer(3)); 
// addConfigured(Hashtable) should come before addConfigured(Map) 	TokenNameCOMMENT_LINE	addConfigured(Hashtable) should come before addConfigured(Map) 
assertExtMethod	TokenNameIdentifier	 assert Ext Method
(	TokenNameLPAREN	
extensions	TokenNameIdentifier	 extensions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
adders	TokenNameIdentifier	 adders
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"addConfigured"	TokenNameStringLiteral	addConfigured
,	TokenNameCOMMA	
Hashtable	TokenNameIdentifier	 Hashtable
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
makeTable	TokenNameIdentifier	 make Table
(	TokenNameLPAREN	
"key"	TokenNameStringLiteral	key
,	TokenNameCOMMA	
"value"	TokenNameStringLiteral	value
)	TokenNameRPAREN	
,	TokenNameCOMMA	
makeTable	TokenNameIdentifier	 make Table
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertExtMethod	TokenNameIdentifier	 assert Ext Method
(	TokenNameLPAREN	
extensions	TokenNameIdentifier	 extensions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
adders	TokenNameIdentifier	 adders
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"addConfigured"	TokenNameStringLiteral	addConfigured
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
makeTable	TokenNameIdentifier	 make Table
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
assertExtMethod	TokenNameIdentifier	 assert Ext Method
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
mo	TokenNameIdentifier	 mo
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
methodName	TokenNameIdentifier	 method Name
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
methodArg	TokenNameIdentifier	 method Arg
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
arg	TokenNameIdentifier	 arg
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
badArg	TokenNameIdentifier	 bad Arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertMethod	TokenNameIdentifier	 assert Method
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
)	TokenNameRPAREN	
mo	TokenNameIdentifier	 mo
,	TokenNameCOMMA	
methodName	TokenNameIdentifier	 method Name
,	TokenNameCOMMA	
methodArg	TokenNameIdentifier	 method Arg
,	TokenNameCOMMA	
arg	TokenNameIdentifier	 arg
,	TokenNameCOMMA	
badArg	TokenNameIdentifier	 bad Arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
assertMethod	TokenNameIdentifier	 assert Method
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
m	TokenNameIdentifier	 m
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
methodName	TokenNameIdentifier	 method Name
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
methodArg	TokenNameIdentifier	 method Arg
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
arg	TokenNameIdentifier	 arg
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
badArg	TokenNameIdentifier	 bad Arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Method name"	TokenNameStringLiteral	Method name
,	TokenNameCOMMA	
methodName	TokenNameIdentifier	 method Name
,	TokenNameCOMMA	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Return type"	TokenNameStringLiteral	Return type
,	TokenNameCOMMA	
Void	TokenNameIdentifier	 Void
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getReturnType	TokenNameIdentifier	 get Return Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getParameterTypes	TokenNameIdentifier	 get Parameter Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Arg Count"	TokenNameStringLiteral	Arg Count
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Arg Type"	TokenNameStringLiteral	Arg Type
,	TokenNameCOMMA	
methodArg	TokenNameIdentifier	 method Arg
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
arg	TokenNameIdentifier	 arg
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
badArg	TokenNameIdentifier	 bad Arg
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Should have raised an assertion exception"	TokenNameStringLiteral	Should have raised an assertion exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getTargetException	TokenNameIdentifier	 get Target Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
instanceof	TokenNameinstanceof	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
AssertionFailedError	TokenNameIdentifier	 Assertion Failed Error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// INVALID extension point 	TokenNameCOMMENT_LINE	INVALID extension point 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// see comments in testGetExtensionPoints 	TokenNameCOMMENT_LINE	see comments in testGetExtensionPoints 
// public void add(Number n) { 	TokenNameCOMMENT_LINE	public void add(Number n) { 
// // Valid extension point 	TokenNameCOMMENT_LINE	// Valid extension point 
// assertEquals(2, n.intValue()); 	TokenNameCOMMENT_LINE	assertEquals(2, n.intValue()); 
// } 	TokenNameCOMMENT_LINE	} 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
l	TokenNameIdentifier	 l
,	TokenNameCOMMA	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// INVALID extension point 	TokenNameCOMMENT_LINE	INVALID extension point 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addConfigured	TokenNameIdentifier	 add Configured
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Valid extension point 	TokenNameCOMMENT_LINE	Valid extension point 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addConfigured	TokenNameIdentifier	 add Configured
(	TokenNameLPAREN	
Hashtable	TokenNameIdentifier	 Hashtable
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Valid extension point, more derived than Map above, but *after* it! 	TokenNameCOMMENT_LINE	Valid extension point, more derived than Map above, but *after* it! 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
makeTable	TokenNameIdentifier	 make Table
(	TokenNameLPAREN	
"key"	TokenNameStringLiteral	key
,	TokenNameCOMMA	
"value"	TokenNameStringLiteral	value
)	TokenNameRPAREN	
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
makeTable	TokenNameIdentifier	 make Table
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Hashtable	TokenNameIdentifier	 Hashtable
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
table	TokenNameIdentifier	 table
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// IntrospectionHelperTest 	TokenNameCOMMENT_LINE	IntrospectionHelperTest 
