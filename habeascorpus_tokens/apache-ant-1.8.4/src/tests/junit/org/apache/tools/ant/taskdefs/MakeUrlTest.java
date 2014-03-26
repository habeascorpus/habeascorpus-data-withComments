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
BuildFileTest	TokenNameIdentifier	 Build File Test
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
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
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
MakeUrlTest	TokenNameIdentifier	 Make Url Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
public	TokenNamepublic	
MakeUrlTest	TokenNameIdentifier	 Make Url Test
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/taskdefs/makeurl.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/makeurl.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEmpty	TokenNameIdentifier	 test Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"testEmpty"	TokenNameStringLiteral	testEmpty
,	TokenNameCOMMA	
"missing property"	TokenNameStringLiteral	missing property
,	TokenNameCOMMA	
"property"	TokenNameStringLiteral	property
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoProperty	TokenNameIdentifier	 test No Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"testNoProperty"	TokenNameStringLiteral	testNoProperty
,	TokenNameCOMMA	
"missing property"	TokenNameStringLiteral	missing property
,	TokenNameCOMMA	
"property"	TokenNameStringLiteral	property
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoFile	TokenNameIdentifier	 test No File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"testNoFile"	TokenNameStringLiteral	testNoFile
,	TokenNameCOMMA	
"missing file"	TokenNameStringLiteral	missing file
,	TokenNameCOMMA	
"file"	TokenNameStringLiteral	file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testValidation	TokenNameIdentifier	 test Validation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"testValidation"	TokenNameStringLiteral	testValidation
,	TokenNameCOMMA	
MakeUrl	TokenNameIdentifier	 Make Url
.	TokenNameDOT	
ERROR_MISSING_FILE	TokenNameIdentifier	 ERROR  MISSING  FILE
,	TokenNameCOMMA	
"file"	TokenNameStringLiteral	file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testWorks	TokenNameIdentifier	 test Works
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testWorks"	TokenNameStringLiteral	testWorks
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertPropertyContains	TokenNameIdentifier	 assert Property Contains
(	TokenNameLPAREN	
"testWorks"	TokenNameStringLiteral	testWorks
,	TokenNameCOMMA	
"file:"	TokenNameStringLiteral	file:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertPropertyContains	TokenNameIdentifier	 assert Property Contains
(	TokenNameLPAREN	
"testWorks"	TokenNameStringLiteral	testWorks
,	TokenNameCOMMA	
"/foo"	TokenNameStringLiteral	/foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testIllegalChars	TokenNameIdentifier	 test Illegal Chars
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testIllegalChars"	TokenNameStringLiteral	testIllegalChars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertPropertyContains	TokenNameIdentifier	 assert Property Contains
(	TokenNameLPAREN	
"testIllegalChars"	TokenNameStringLiteral	testIllegalChars
,	TokenNameCOMMA	
"file:"	TokenNameStringLiteral	file:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertPropertyContains	TokenNameIdentifier	 assert Property Contains
(	TokenNameLPAREN	
"testIllegalChars"	TokenNameStringLiteral	testIllegalChars
,	TokenNameCOMMA	
"fo%20o%25"	TokenNameStringLiteral	fo%20o%25
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test that we can round trip by opening a url that exists * * @throws IOException */	TokenNameCOMMENT_JAVADOC	 test that we can round trip by opening a url that exists * @throws IOException 
public	TokenNamepublic	
void	TokenNamevoid	
testRoundTrip	TokenNameIdentifier	 test Round Trip
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testRoundTrip"	TokenNameStringLiteral	testRoundTrip
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertPropertyContains	TokenNameIdentifier	 assert Property Contains
(	TokenNameLPAREN	
"testRoundTrip"	TokenNameStringLiteral	testRoundTrip
,	TokenNameCOMMA	
"file:"	TokenNameStringLiteral	file:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
property	TokenNameIdentifier	 property
=	TokenNameEQUAL	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"testRoundTrip"	TokenNameStringLiteral	testRoundTrip
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
URL	TokenNameIdentifier	 URL
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InputStream	TokenNameIdentifier	 Input Stream
instream	TokenNameIdentifier	 instream
=	TokenNameEQUAL	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
openStream	TokenNameIdentifier	 open Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
instream	TokenNameIdentifier	 instream
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testIllegalCombinations	TokenNameIdentifier	 test Illegal Combinations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testIllegalCombinations"	TokenNameStringLiteral	testIllegalCombinations
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertPropertyContains	TokenNameIdentifier	 assert Property Contains
(	TokenNameLPAREN	
"testIllegalCombinations"	TokenNameStringLiteral	testIllegalCombinations
,	TokenNameCOMMA	
"/foo"	TokenNameStringLiteral	/foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertPropertyContains	TokenNameIdentifier	 assert Property Contains
(	TokenNameLPAREN	
"testIllegalCombinations"	TokenNameStringLiteral	testIllegalCombinations
,	TokenNameCOMMA	
".xml"	TokenNameStringLiteral	.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFileset	TokenNameIdentifier	 test Fileset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testFileset"	TokenNameStringLiteral	testFileset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertPropertyContains	TokenNameIdentifier	 assert Property Contains
(	TokenNameLPAREN	
"testFileset"	TokenNameStringLiteral	testFileset
,	TokenNameCOMMA	
".xml "	TokenNameStringLiteral	.xml 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertPropertyEndsWith	TokenNameIdentifier	 assert Property Ends With
(	TokenNameLPAREN	
"testFileset"	TokenNameStringLiteral	testFileset
,	TokenNameCOMMA	
".xml"	TokenNameStringLiteral	.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFilesetSeparator	TokenNameIdentifier	 test Fileset Separator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testFilesetSeparator"	TokenNameStringLiteral	testFilesetSeparator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertPropertyContains	TokenNameIdentifier	 assert Property Contains
(	TokenNameLPAREN	
"testFilesetSeparator"	TokenNameStringLiteral	testFilesetSeparator
,	TokenNameCOMMA	
".xml",""	TokenNameStringLiteral	.xml","
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertPropertyEndsWith	TokenNameIdentifier	 assert Property Ends With
(	TokenNameLPAREN	
"testFilesetSeparator"	TokenNameStringLiteral	testFilesetSeparator
,	TokenNameCOMMA	
".xml"	TokenNameStringLiteral	.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPath	TokenNameIdentifier	 test Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testPath"	TokenNameStringLiteral	testPath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertPropertyContains	TokenNameIdentifier	 assert Property Contains
(	TokenNameLPAREN	
"testPath"	TokenNameStringLiteral	testPath
,	TokenNameCOMMA	
"makeurl.xml"	TokenNameStringLiteral	makeurl.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * assert that a property ends with * * @param property * @param ending */	TokenNameCOMMENT_JAVADOC	 assert that a property ends with * @param property @param ending 
private	TokenNameprivate	
void	TokenNamevoid	
assertPropertyEndsWith	TokenNameIdentifier	 assert Property Ends With
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
property	TokenNameIdentifier	 property
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
ending	TokenNameIdentifier	 ending
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
substring	TokenNameIdentifier	 substring
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
ending	TokenNameIdentifier	 ending
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
ending	TokenNameIdentifier	 ending
,	TokenNameCOMMA	
substring	TokenNameIdentifier	 substring
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * assert that a property contains a string * * @param property name of property to look for * @param contains what to search for in the string */	TokenNameCOMMENT_JAVADOC	 assert that a property contains a string * @param property name of property to look for @param contains what to search for in the string 
protected	TokenNameprotected	
void	TokenNamevoid	
assertPropertyContains	TokenNameIdentifier	 assert Property Contains
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
property	TokenNameIdentifier	 property
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
contains	TokenNameIdentifier	 contains
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"expected "	TokenNameStringLiteral	expected 
+	TokenNamePLUS	
contains	TokenNameIdentifier	 contains
+	TokenNamePLUS	
" in "	TokenNameStringLiteral	 in 
+	TokenNamePLUS	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
contains	TokenNameIdentifier	 contains
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * get a property from the project * * @param property * @return */	TokenNameCOMMENT_JAVADOC	 get a property from the project * @param property @return 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
