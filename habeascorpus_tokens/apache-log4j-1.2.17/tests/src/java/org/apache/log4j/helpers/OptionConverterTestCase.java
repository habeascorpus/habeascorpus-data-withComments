/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
// Log4j uses the JUnit framework for internal unit testing. JUnit 	TokenNameCOMMENT_LINE	Log4j uses the JUnit framework for internal unit testing. JUnit 
// is available from "http://www.junit.org". 	TokenNameCOMMENT_LINE	is available from "http://www.junit.org". 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
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
FileInputStream	TokenNameIdentifier	 File Input Stream
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
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
TestSuite	TokenNameIdentifier	 Test Suite
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Level	TokenNameIdentifier	 Level
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
LogManager	TokenNameIdentifier	 Log Manager
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
PropertyConfiguratorTest	TokenNameIdentifier	 Property Configurator Test
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
XLevel	TokenNameIdentifier	 X Level
;	TokenNameSEMICOLON	
/** Test variable substitution code. @author Ceki G&uuml;lc&uuml; @since 1.0 */	TokenNameCOMMENT_JAVADOC	 Test variable substitution code. @author Ceki G&uuml;lc&uuml; @since 1.0 
public	TokenNamepublic	
class	TokenNameclass	
OptionConverterTestCase	TokenNameIdentifier	 Option Converter Test Case
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
;	TokenNameSEMICOLON	
public	TokenNamepublic	
OptionConverterTestCase	TokenNameIdentifier	 Option Converter Test Case
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
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"TOTO"	TokenNameStringLiteral	TOTO
,	TokenNameCOMMA	
"wonderful"	TokenNameStringLiteral	wonderful
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"key1"	TokenNameStringLiteral	key1
,	TokenNameCOMMA	
"value1"	TokenNameStringLiteral	value1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"key2"	TokenNameStringLiteral	key2
,	TokenNameCOMMA	
"value2"	TokenNameStringLiteral	value2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Log4J will NPE without this: 	TokenNameCOMMENT_LINE	Log4J will NPE without this: 
props	TokenNameIdentifier	 props
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
,	TokenNameCOMMA	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Log4J will throw an Error without this: 	TokenNameCOMMENT_LINE	Log4J will throw an Error without this: 
props	TokenNameIdentifier	 props
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"java.home"	TokenNameStringLiteral	java.home
,	TokenNameCOMMA	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"java.home"	TokenNameStringLiteral	java.home
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setProperties	TokenNameIdentifier	 set Properties
(	TokenNameLPAREN	
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
LogManager	TokenNameIdentifier	 Log Manager
.	TokenNameDOT	
resetConfiguration	TokenNameIdentifier	 reset Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
varSubstTest1	TokenNameIdentifier	 var Subst Test1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
OptionConverter	TokenNameIdentifier	 Option Converter
.	TokenNameDOT	
substVars	TokenNameIdentifier	 subst Vars
(	TokenNameLPAREN	
"hello world."	TokenNameStringLiteral	hello world.
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"hello world."	TokenNameStringLiteral	hello world.
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
OptionConverter	TokenNameIdentifier	 Option Converter
.	TokenNameDOT	
substVars	TokenNameIdentifier	 subst Vars
(	TokenNameLPAREN	
"hello ${TOTO} world."	TokenNameStringLiteral	hello ${TOTO} world.
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"hello wonderful world."	TokenNameStringLiteral	hello wonderful world.
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
varSubstTest2	TokenNameIdentifier	 var Subst Test2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
OptionConverter	TokenNameIdentifier	 Option Converter
.	TokenNameDOT	
substVars	TokenNameIdentifier	 subst Vars
(	TokenNameLPAREN	
"Test2 ${key1} mid ${key2} end."	TokenNameStringLiteral	Test2 ${key1} mid ${key2} end.
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Test2 value1 mid value2 end."	TokenNameStringLiteral	Test2 value1 mid value2 end.
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
varSubstTest3	TokenNameIdentifier	 var Subst Test3
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
OptionConverter	TokenNameIdentifier	 Option Converter
.	TokenNameDOT	
substVars	TokenNameIdentifier	 subst Vars
(	TokenNameLPAREN	
"Test3 ${unset} mid ${key1} end."	TokenNameStringLiteral	Test3 ${unset} mid ${key1} end.
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Test3 mid value1 end."	TokenNameStringLiteral	Test3 mid value1 end.
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
varSubstTest4	TokenNameIdentifier	 var Subst Test4
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
"Test4 ${incomplete "	TokenNameStringLiteral	Test4 ${incomplete 
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
OptionConverter	TokenNameIdentifier	 Option Converter
.	TokenNameDOT	
substVars	TokenNameIdentifier	 subst Vars
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
errorMsg	TokenNameIdentifier	 error Msg
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println('['+errorMsg+']'); 	TokenNameCOMMENT_LINE	System.out.println('['+errorMsg+']'); 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
'"'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
val	TokenNameIdentifier	 val
+	TokenNamePLUS	
"" has no closing brace. Opening brace at position 6."	TokenNameStringLiteral	" has no closing brace. Opening brace at position 6.
,	TokenNameCOMMA	
errorMsg	TokenNameIdentifier	 error Msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
varSubstTest5	TokenNameIdentifier	 var Subst Test5
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"p1"	TokenNameStringLiteral	p1
,	TokenNameCOMMA	
"x1"	TokenNameStringLiteral	x1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"p2"	TokenNameStringLiteral	p2
,	TokenNameCOMMA	
"${p1}"	TokenNameStringLiteral	${p1}
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
OptionConverter	TokenNameIdentifier	 Option Converter
.	TokenNameDOT	
substVars	TokenNameIdentifier	 subst Vars
(	TokenNameLPAREN	
"${p2}"	TokenNameStringLiteral	${p2}
,	TokenNameCOMMA	
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Result is ["	TokenNameStringLiteral	Result is [
+	TokenNamePLUS	
res	TokenNameIdentifier	 res
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
,	TokenNameCOMMA	
"x1"	TokenNameStringLiteral	x1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests configuring Log4J from an InputStream. * * @since 1.2.17 */	TokenNameCOMMENT_JAVADOC	 Tests configuring Log4J from an InputStream. * @since 1.2.17 
public	TokenNamepublic	
void	TokenNamevoid	
testInputStream	TokenNameIdentifier	 test Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"input/filter1.properties"	TokenNameStringLiteral	input/filter1.properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileInputStream	TokenNameIdentifier	 File Input Stream
inputStream	TokenNameIdentifier	 input Stream
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
OptionConverter	TokenNameIdentifier	 Option Converter
.	TokenNameDOT	
selectAndConfigure	TokenNameIdentifier	 select And Configure
(	TokenNameLPAREN	
inputStream	TokenNameIdentifier	 input Stream
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
LogManager	TokenNameIdentifier	 Log Manager
.	TokenNameDOT	
getLoggerRepository	TokenNameIdentifier	 get Logger Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
inputStream	TokenNameIdentifier	 input Stream
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
new	TokenNamenew	
PropertyConfiguratorTest	TokenNameIdentifier	 Property Configurator Test
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
validateNested	TokenNameIdentifier	 validate Nested
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
toLevelTest1	TokenNameIdentifier	 to Level Test1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
"INFO"	TokenNameStringLiteral	INFO
;	TokenNameSEMICOLON	
Level	TokenNameIdentifier	 Level
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
OptionConverter	TokenNameIdentifier	 Option Converter
.	TokenNameDOT	
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
toLevelTest2	TokenNameIdentifier	 to Level Test2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
"INFO#org.apache.log4j.xml.XLevel"	TokenNameStringLiteral	INFO#org.apache.log4j.xml.XLevel
;	TokenNameSEMICOLON	
Level	TokenNameIdentifier	 Level
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
OptionConverter	TokenNameIdentifier	 Option Converter
.	TokenNameDOT	
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
toLevelTest3	TokenNameIdentifier	 to Level Test3
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
"TRACE#org.apache.log4j.xml.XLevel"	TokenNameStringLiteral	TRACE#org.apache.log4j.xml.XLevel
;	TokenNameSEMICOLON	
Level	TokenNameIdentifier	 Level
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
OptionConverter	TokenNameIdentifier	 Option Converter
.	TokenNameDOT	
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
XLevel	TokenNameIdentifier	 X Level
.	TokenNameDOT	
TRACE	TokenNameIdentifier	 TRACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
toLevelTest4	TokenNameIdentifier	 to Level Test4
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
"TR#org.apache.log4j.xml.XLevel"	TokenNameStringLiteral	TR#org.apache.log4j.xml.XLevel
;	TokenNameSEMICOLON	
Level	TokenNameIdentifier	 Level
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
OptionConverter	TokenNameIdentifier	 Option Converter
.	TokenNameDOT	
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
toLevelTest5	TokenNameIdentifier	 to Level Test5
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
"INFO#org.apache.log4j.xml.TOTO"	TokenNameStringLiteral	INFO#org.apache.log4j.xml.TOTO
;	TokenNameSEMICOLON	
Level	TokenNameIdentifier	 Level
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
OptionConverter	TokenNameIdentifier	 Option Converter
.	TokenNameDOT	
toLevel	TokenNameIdentifier	 to Level
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Test	TokenNameIdentifier	 Test
suite	TokenNameIdentifier	 suite
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TestSuite	TokenNameIdentifier	 Test Suite
suite	TokenNameIdentifier	 suite
=	TokenNameEQUAL	
new	TokenNamenew	
TestSuite	TokenNameIdentifier	 Test Suite
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
suite	TokenNameIdentifier	 suite
.	TokenNameDOT	
addTest	TokenNameIdentifier	 add Test
(	TokenNameLPAREN	
new	TokenNamenew	
OptionConverterTestCase	TokenNameIdentifier	 Option Converter Test Case
(	TokenNameLPAREN	
"varSubstTest5"	TokenNameStringLiteral	varSubstTest5
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
suite	TokenNameIdentifier	 suite
.	TokenNameDOT	
addTest	TokenNameIdentifier	 add Test
(	TokenNameLPAREN	
new	TokenNamenew	
OptionConverterTestCase	TokenNameIdentifier	 Option Converter Test Case
(	TokenNameLPAREN	
"varSubstTest1"	TokenNameStringLiteral	varSubstTest1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
suite	TokenNameIdentifier	 suite
.	TokenNameDOT	
addTest	TokenNameIdentifier	 add Test
(	TokenNameLPAREN	
new	TokenNamenew	
OptionConverterTestCase	TokenNameIdentifier	 Option Converter Test Case
(	TokenNameLPAREN	
"varSubstTest2"	TokenNameStringLiteral	varSubstTest2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
suite	TokenNameIdentifier	 suite
.	TokenNameDOT	
addTest	TokenNameIdentifier	 add Test
(	TokenNameLPAREN	
new	TokenNamenew	
OptionConverterTestCase	TokenNameIdentifier	 Option Converter Test Case
(	TokenNameLPAREN	
"varSubstTest3"	TokenNameStringLiteral	varSubstTest3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
suite	TokenNameIdentifier	 suite
.	TokenNameDOT	
addTest	TokenNameIdentifier	 add Test
(	TokenNameLPAREN	
new	TokenNamenew	
OptionConverterTestCase	TokenNameIdentifier	 Option Converter Test Case
(	TokenNameLPAREN	
"varSubstTest4"	TokenNameStringLiteral	varSubstTest4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
suite	TokenNameIdentifier	 suite
.	TokenNameDOT	
addTest	TokenNameIdentifier	 add Test
(	TokenNameLPAREN	
new	TokenNamenew	
OptionConverterTestCase	TokenNameIdentifier	 Option Converter Test Case
(	TokenNameLPAREN	
"testInputStream"	TokenNameStringLiteral	testInputStream
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
suite	TokenNameIdentifier	 suite
.	TokenNameDOT	
addTest	TokenNameIdentifier	 add Test
(	TokenNameLPAREN	
new	TokenNamenew	
OptionConverterTestCase	TokenNameIdentifier	 Option Converter Test Case
(	TokenNameLPAREN	
"toLevelTest1"	TokenNameStringLiteral	toLevelTest1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
suite	TokenNameIdentifier	 suite
.	TokenNameDOT	
addTest	TokenNameIdentifier	 add Test
(	TokenNameLPAREN	
new	TokenNamenew	
OptionConverterTestCase	TokenNameIdentifier	 Option Converter Test Case
(	TokenNameLPAREN	
"toLevelTest2"	TokenNameStringLiteral	toLevelTest2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
suite	TokenNameIdentifier	 suite
.	TokenNameDOT	
addTest	TokenNameIdentifier	 add Test
(	TokenNameLPAREN	
new	TokenNamenew	
OptionConverterTestCase	TokenNameIdentifier	 Option Converter Test Case
(	TokenNameLPAREN	
"toLevelTest3"	TokenNameStringLiteral	toLevelTest3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
suite	TokenNameIdentifier	 suite
.	TokenNameDOT	
addTest	TokenNameIdentifier	 add Test
(	TokenNameLPAREN	
new	TokenNamenew	
OptionConverterTestCase	TokenNameIdentifier	 Option Converter Test Case
(	TokenNameLPAREN	
"toLevelTest4"	TokenNameStringLiteral	toLevelTest4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
suite	TokenNameIdentifier	 suite
.	TokenNameDOT	
addTest	TokenNameIdentifier	 add Test
(	TokenNameLPAREN	
new	TokenNamenew	
OptionConverterTestCase	TokenNameIdentifier	 Option Converter Test Case
(	TokenNameLPAREN	
"toLevelTest5"	TokenNameStringLiteral	toLevelTest5
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
suite	TokenNameIdentifier	 suite
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
