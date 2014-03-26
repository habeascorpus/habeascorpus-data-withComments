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
FileOutputStream	TokenNameIdentifier	 File Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
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
/** * JUnit testcase that excercises the optional PropertyFile task in ant. * (this is really more of a functional test so far.., but it's enough to let * me start refactoring...) * *@created October 2, 2001 */	TokenNameCOMMENT_JAVADOC	 JUnit testcase that excercises the optional PropertyFile task in ant. (this is really more of a functional test so far.., but it's enough to let me start refactoring...) *@created October 2, 2001 
public	TokenNamepublic	
class	TokenNameclass	
PropertyFileTest	TokenNameIdentifier	 Property File Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
public	TokenNamepublic	
PropertyFileTest	TokenNameIdentifier	 Property File Test
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
/** * The JUnit setup method */	TokenNameCOMMENT_JAVADOC	 The JUnit setup method 
public	TokenNamepublic	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
destroyTempFiles	TokenNameIdentifier	 destroy Temp Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initTestPropFile	TokenNameIdentifier	 init Test Prop File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initBuildPropFile	TokenNameIdentifier	 init Build Prop File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
projectFilePath	TokenNameIdentifier	 project File Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
valueDoesNotGetOverwrittenPropertyFileKey	TokenNameIdentifier	 value Does Not Get Overwritten Property File Key
,	TokenNameCOMMA	
valueDoesNotGetOverwrittenPropertyFile	TokenNameIdentifier	 value Does Not Get Overwritten Property File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The JUnit tearDown method */	TokenNameCOMMENT_JAVADOC	 The JUnit tearDown method 
public	TokenNamepublic	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
destroyTempFiles	TokenNameIdentifier	 destroy Temp Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNonExistingFile	TokenNameIdentifier	 test Non Existing File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PropertyFile	TokenNameIdentifier	 Property File
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
new	TokenNamenew	
PropertyFile	TokenNameIdentifier	 Property File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"this-file-does-not-exist.properties"	TokenNameStringLiteral	this-file-does-not-exist.properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"Properties file exists before test."	TokenNameStringLiteral	Properties file exists before test.
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Properties file does not exist after test."	TokenNameStringLiteral	Properties file does not exist after test.
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A unit test for JUnit- Excercises the propertyfile tasks ability to * update properties that are already defined- */	TokenNameCOMMENT_JAVADOC	 A unit test for JUnit- Excercises the propertyfile tasks ability to update properties that are already defined- 
public	TokenNamepublic	
void	TokenNamevoid	
testUpdatesExistingProperties	TokenNameIdentifier	 test Updates Existing Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Properties	TokenNameIdentifier	 Properties
beforeUpdate	TokenNameIdentifier	 before Update
=	TokenNameEQUAL	
getTestProperties	TokenNameIdentifier	 get Test Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
FNAME	TokenNameIdentifier	 FNAME
,	TokenNameCOMMA	
beforeUpdate	TokenNameIdentifier	 before Update
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
FNAME_KEY	TokenNameIdentifier	 FNAME  KEY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
LNAME	TokenNameIdentifier	 LNAME
,	TokenNameCOMMA	
beforeUpdate	TokenNameIdentifier	 before Update
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
LNAME_KEY	TokenNameIdentifier	 LNAME  KEY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
EMAIL	TokenNameIdentifier	 EMAIL
,	TokenNameCOMMA	
beforeUpdate	TokenNameIdentifier	 before Update
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
EMAIL_KEY	TokenNameIdentifier	 EMAIL  KEY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
beforeUpdate	TokenNameIdentifier	 before Update
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
PHONE_KEY	TokenNameIdentifier	 PHONE  KEY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
beforeUpdate	TokenNameIdentifier	 before Update
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
AGE_KEY	TokenNameIdentifier	 AGE  KEY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
beforeUpdate	TokenNameIdentifier	 before Update
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
DATE_KEY	TokenNameIdentifier	 DATE  KEY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ask ant to update the properties... 	TokenNameCOMMENT_LINE	ask ant to update the properties... 
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"update-existing-properties"	TokenNameStringLiteral	update-existing-properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Properties	TokenNameIdentifier	 Properties
afterUpdate	TokenNameIdentifier	 after Update
=	TokenNameEQUAL	
getTestProperties	TokenNameIdentifier	 get Test Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
NEW_FNAME	TokenNameIdentifier	 NEW  FNAME
,	TokenNameCOMMA	
afterUpdate	TokenNameIdentifier	 after Update
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
FNAME_KEY	TokenNameIdentifier	 FNAME  KEY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
NEW_LNAME	TokenNameIdentifier	 NEW  LNAME
,	TokenNameCOMMA	
afterUpdate	TokenNameIdentifier	 after Update
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
LNAME_KEY	TokenNameIdentifier	 LNAME  KEY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
NEW_EMAIL	TokenNameIdentifier	 NEW  EMAIL
,	TokenNameCOMMA	
afterUpdate	TokenNameIdentifier	 after Update
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
EMAIL_KEY	TokenNameIdentifier	 EMAIL  KEY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
NEW_PHONE	TokenNameIdentifier	 NEW  PHONE
,	TokenNameCOMMA	
afterUpdate	TokenNameIdentifier	 after Update
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
PHONE_KEY	TokenNameIdentifier	 PHONE  KEY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
NEW_AGE	TokenNameIdentifier	 NEW  AGE
,	TokenNameCOMMA	
afterUpdate	TokenNameIdentifier	 after Update
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
AGE_KEY	TokenNameIdentifier	 AGE  KEY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
NEW_DATE	TokenNameIdentifier	 NEW  DATE
,	TokenNameCOMMA	
afterUpdate	TokenNameIdentifier	 after Update
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
DATE_KEY	TokenNameIdentifier	 DATE  KEY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDeleteProperties	TokenNameIdentifier	 test Delete Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Properties	TokenNameIdentifier	 Properties
beforeUpdate	TokenNameIdentifier	 before Update
=	TokenNameEQUAL	
getTestProperties	TokenNameIdentifier	 get Test Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Property '"	TokenNameStringLiteral	Property '
+	TokenNamePLUS	
FNAME_KEY	TokenNameIdentifier	 FNAME  KEY
+	TokenNamePLUS	
"' should exist before deleting"	TokenNameStringLiteral	' should exist before deleting
,	TokenNameCOMMA	
FNAME	TokenNameIdentifier	 FNAME
,	TokenNameCOMMA	
beforeUpdate	TokenNameIdentifier	 before Update
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
FNAME_KEY	TokenNameIdentifier	 FNAME  KEY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Property '"	TokenNameStringLiteral	Property '
+	TokenNamePLUS	
LNAME_KEY	TokenNameIdentifier	 LNAME  KEY
+	TokenNamePLUS	
"' should exist before deleting"	TokenNameStringLiteral	' should exist before deleting
,	TokenNameCOMMA	
LNAME	TokenNameIdentifier	 LNAME
,	TokenNameCOMMA	
beforeUpdate	TokenNameIdentifier	 before Update
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
LNAME_KEY	TokenNameIdentifier	 LNAME  KEY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"delete-properties"	TokenNameStringLiteral	delete-properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Properties	TokenNameIdentifier	 Properties
afterUpdate	TokenNameIdentifier	 after Update
=	TokenNameEQUAL	
getTestProperties	TokenNameIdentifier	 get Test Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Property '"	TokenNameStringLiteral	Property '
+	TokenNamePLUS	
LNAME_KEY	TokenNameIdentifier	 LNAME  KEY
+	TokenNamePLUS	
"' should exist after deleting"	TokenNameStringLiteral	' should exist after deleting
,	TokenNameCOMMA	
LNAME	TokenNameIdentifier	 LNAME
,	TokenNameCOMMA	
afterUpdate	TokenNameIdentifier	 after Update
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
LNAME_KEY	TokenNameIdentifier	 LNAME  KEY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
"Property '"	TokenNameStringLiteral	Property '
+	TokenNamePLUS	
FNAME_KEY	TokenNameIdentifier	 FNAME  KEY
+	TokenNamePLUS	
"' should be deleted"	TokenNameStringLiteral	' should be deleted
,	TokenNameCOMMA	
afterUpdate	TokenNameIdentifier	 after Update
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
FNAME_KEY	TokenNameIdentifier	 FNAME  KEY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testExerciseDefaultAndIncrement	TokenNameIdentifier	 test Exercise Default And Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"exercise"	TokenNameStringLiteral	exercise
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"3"	TokenNameStringLiteral	3
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"int.with.default"	TokenNameStringLiteral	int.with.default
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"int.without.default"	TokenNameStringLiteral	int.without.default
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"-->"	TokenNameStringLiteral	-->
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"string.with.default"	TokenNameStringLiteral	string.with.default
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"string.without.default"	TokenNameStringLiteral	string.without.default
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2002/01/21 12:18"	TokenNameStringLiteral	2002/01/21 12:18
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"ethans.birth"	TokenNameStringLiteral	ethans.birth
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2003/01/21"	TokenNameStringLiteral	2003/01/21
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"first.birthday"	TokenNameStringLiteral	first.birthday
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"0124"	TokenNameStringLiteral	0124
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"olderThanAWeek"	TokenNameStringLiteral	olderThanAWeek
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"37"	TokenNameStringLiteral	37
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"existing.prop"	TokenNameStringLiteral	existing.prop
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"6"	TokenNameStringLiteral	6
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"int.without.value"	TokenNameStringLiteral	int.without.value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testValueDoesNotGetOverwritten	TokenNameIdentifier	 test Value Does Not Get Overwritten
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this test shows that the bug report 21505 is fixed 	TokenNameCOMMENT_LINE	this test shows that the bug report 21505 is fixed 
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"bugDemo1"	TokenNameStringLiteral	bugDemo1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"bugDemo2"	TokenNameStringLiteral	bugDemo2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"5"	TokenNameStringLiteral	5
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* public void testDirect() throws Exception { PropertyFile pf = new PropertyFile(); pf.setProject(project); pf.setFile(new File(System.getProperty("root"), testPropsFilePath)); PropertyFile.Entry entry = pf.createEntry(); entry.setKey("date"); entry.setValue("123"); PropertyFile.Entry.Type type = new PropertyFile.Entry.Type(); type.setValue("date"); entry.setType(type); entry.setPattern("yyyy/MM/dd"); PropertyFile.Entry.Operation operation = new PropertyFile.Entry.Operation(); operation.setValue("+"); pf.execute(); Properties props = getTestProperties(); assertEquals("yeehaw", props.getProperty("date")); } */	TokenNameCOMMENT_BLOCK	 public void testDirect() throws Exception { PropertyFile pf = new PropertyFile(); pf.setProject(project); pf.setFile(new File(System.getProperty("root"), testPropsFilePath)); PropertyFile.Entry entry = pf.createEntry(); entry.setKey("date"); entry.setValue("123"); PropertyFile.Entry.Type type = new PropertyFile.Entry.Type(); type.setValue("date"); entry.setType(type); entry.setPattern("yyyy/MM/dd"); PropertyFile.Entry.Operation operation = new PropertyFile.Entry.Operation(); operation.setValue("+"); pf.execute(); Properties props = getTestProperties(); assertEquals("yeehaw", props.getProperty("date")); } 
private	TokenNameprivate	
Properties	TokenNameIdentifier	 Properties
getTestProperties	TokenNameIdentifier	 get Test Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Properties	TokenNameIdentifier	 Properties
testProps	TokenNameIdentifier	 test Props
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileInputStream	TokenNameIdentifier	 File Input Stream
propsFile	TokenNameIdentifier	 props File
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
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
testPropsFilePath	TokenNameIdentifier	 test Props File Path
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testProps	TokenNameIdentifier	 test Props
.	TokenNameDOT	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
propsFile	TokenNameIdentifier	 props File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
propsFile	TokenNameIdentifier	 props File
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
testProps	TokenNameIdentifier	 test Props
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
initTestPropFile	TokenNameIdentifier	 init Test Prop File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Properties	TokenNameIdentifier	 Properties
testProps	TokenNameIdentifier	 test Props
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testProps	TokenNameIdentifier	 test Props
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
FNAME_KEY	TokenNameIdentifier	 FNAME  KEY
,	TokenNameCOMMA	
FNAME	TokenNameIdentifier	 FNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testProps	TokenNameIdentifier	 test Props
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
LNAME_KEY	TokenNameIdentifier	 LNAME  KEY
,	TokenNameCOMMA	
LNAME	TokenNameIdentifier	 LNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testProps	TokenNameIdentifier	 test Props
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
EMAIL_KEY	TokenNameIdentifier	 EMAIL  KEY
,	TokenNameCOMMA	
EMAIL	TokenNameIdentifier	 EMAIL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testProps	TokenNameIdentifier	 test Props
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"existing.prop"	TokenNameStringLiteral	existing.prop
,	TokenNameCOMMA	
"37"	TokenNameStringLiteral	37
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileOutputStream	TokenNameIdentifier	 File Output Stream
fos	TokenNameIdentifier	 fos
=	TokenNameEQUAL	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
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
testPropsFilePath	TokenNameIdentifier	 test Props File Path
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testProps	TokenNameIdentifier	 test Props
.	TokenNameDOT	
store	TokenNameIdentifier	 store
(	TokenNameLPAREN	
fos	TokenNameIdentifier	 fos
,	TokenNameCOMMA	
"defaults"	TokenNameStringLiteral	defaults
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fos	TokenNameIdentifier	 fos
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
initBuildPropFile	TokenNameIdentifier	 init Build Prop File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Properties	TokenNameIdentifier	 Properties
buildProps	TokenNameIdentifier	 build Props
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buildProps	TokenNameIdentifier	 build Props
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
testPropertyFileKey	TokenNameIdentifier	 test Property File Key
,	TokenNameCOMMA	
testPropertyFile	TokenNameIdentifier	 test Property File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buildProps	TokenNameIdentifier	 build Props
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
FNAME_KEY	TokenNameIdentifier	 FNAME  KEY
,	TokenNameCOMMA	
NEW_FNAME	TokenNameIdentifier	 NEW  FNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buildProps	TokenNameIdentifier	 build Props
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
LNAME_KEY	TokenNameIdentifier	 LNAME  KEY
,	TokenNameCOMMA	
NEW_LNAME	TokenNameIdentifier	 NEW  LNAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buildProps	TokenNameIdentifier	 build Props
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
EMAIL_KEY	TokenNameIdentifier	 EMAIL  KEY
,	TokenNameCOMMA	
NEW_EMAIL	TokenNameIdentifier	 NEW  EMAIL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buildProps	TokenNameIdentifier	 build Props
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
PHONE_KEY	TokenNameIdentifier	 PHONE  KEY
,	TokenNameCOMMA	
NEW_PHONE	TokenNameIdentifier	 NEW  PHONE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buildProps	TokenNameIdentifier	 build Props
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
AGE_KEY	TokenNameIdentifier	 AGE  KEY
,	TokenNameCOMMA	
NEW_AGE	TokenNameIdentifier	 NEW  AGE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buildProps	TokenNameIdentifier	 build Props
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
DATE_KEY	TokenNameIdentifier	 DATE  KEY
,	TokenNameCOMMA	
NEW_DATE	TokenNameIdentifier	 NEW  DATE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileOutputStream	TokenNameIdentifier	 File Output Stream
fos	TokenNameIdentifier	 fos
=	TokenNameEQUAL	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
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
buildPropsFilePath	TokenNameIdentifier	 build Props File Path
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buildProps	TokenNameIdentifier	 build Props
.	TokenNameDOT	
store	TokenNameIdentifier	 store
(	TokenNameLPAREN	
fos	TokenNameIdentifier	 fos
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fos	TokenNameIdentifier	 fos
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
destroyTempFiles	TokenNameIdentifier	 destroy Temp Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
tempFile	TokenNameIdentifier	 temp File
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
testPropsFilePath	TokenNameIdentifier	 test Props File Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tempFile	TokenNameIdentifier	 temp File
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tempFile	TokenNameIdentifier	 temp File
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
tempFile	TokenNameIdentifier	 temp File
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
buildPropsFilePath	TokenNameIdentifier	 build Props File Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tempFile	TokenNameIdentifier	 temp File
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tempFile	TokenNameIdentifier	 temp File
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
tempFile	TokenNameIdentifier	 temp File
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
valueDoesNotGetOverwrittenPropsFilePath	TokenNameIdentifier	 value Does Not Get Overwritten Props File Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tempFile	TokenNameIdentifier	 temp File
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tempFile	TokenNameIdentifier	 temp File
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
projectFilePath	TokenNameIdentifier	 project File Path
=	TokenNameEQUAL	
"src/etc/testcases/taskdefs/optional/propertyfile.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/propertyfile.xml
,	TokenNameCOMMA	
testPropertyFile	TokenNameIdentifier	 test Property File
=	TokenNameEQUAL	
"propertyfile.test.properties"	TokenNameStringLiteral	propertyfile.test.properties
,	TokenNameCOMMA	
testPropertyFileKey	TokenNameIdentifier	 test Property File Key
=	TokenNameEQUAL	
"test.propertyfile"	TokenNameStringLiteral	test.propertyfile
,	TokenNameCOMMA	
testPropsFilePath	TokenNameIdentifier	 test Props File Path
=	TokenNameEQUAL	
"src/etc/testcases/taskdefs/optional/"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/
+	TokenNamePLUS	
testPropertyFile	TokenNameIdentifier	 test Property File
,	TokenNameCOMMA	
valueDoesNotGetOverwrittenPropertyFile	TokenNameIdentifier	 value Does Not Get Overwritten Property File
=	TokenNameEQUAL	
"overwrite.test.properties"	TokenNameStringLiteral	overwrite.test.properties
,	TokenNameCOMMA	
valueDoesNotGetOverwrittenPropertyFileKey	TokenNameIdentifier	 value Does Not Get Overwritten Property File Key
=	TokenNameEQUAL	
"overwrite.test.propertyfile"	TokenNameStringLiteral	overwrite.test.propertyfile
,	TokenNameCOMMA	
valueDoesNotGetOverwrittenPropsFilePath	TokenNameIdentifier	 value Does Not Get Overwritten Props File Path
=	TokenNameEQUAL	
"src/etc/testcases/taskdefs/optional/"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/
+	TokenNamePLUS	
valueDoesNotGetOverwrittenPropertyFile	TokenNameIdentifier	 value Does Not Get Overwritten Property File
,	TokenNameCOMMA	
buildPropsFilePath	TokenNameIdentifier	 build Props File Path
=	TokenNameEQUAL	
"src/etc/testcases/taskdefs/optional/propertyfile.build.properties"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/propertyfile.build.properties
,	TokenNameCOMMA	
FNAME	TokenNameIdentifier	 FNAME
=	TokenNameEQUAL	
"Bruce"	TokenNameStringLiteral	Bruce
,	TokenNameCOMMA	
NEW_FNAME	TokenNameIdentifier	 NEW  FNAME
=	TokenNameEQUAL	
"Clark"	TokenNameStringLiteral	Clark
,	TokenNameCOMMA	
FNAME_KEY	TokenNameIdentifier	 FNAME  KEY
=	TokenNameEQUAL	
"firstname"	TokenNameStringLiteral	firstname
,	TokenNameCOMMA	
LNAME	TokenNameIdentifier	 LNAME
=	TokenNameEQUAL	
"Banner"	TokenNameStringLiteral	Banner
,	TokenNameCOMMA	
NEW_LNAME	TokenNameIdentifier	 NEW  LNAME
=	TokenNameEQUAL	
"Kent"	TokenNameStringLiteral	Kent
,	TokenNameCOMMA	
LNAME_KEY	TokenNameIdentifier	 LNAME  KEY
=	TokenNameEQUAL	
"lastname"	TokenNameStringLiteral	lastname
,	TokenNameCOMMA	
EMAIL	TokenNameIdentifier	 EMAIL
=	TokenNameEQUAL	
"incredible@hulk.com"	TokenNameStringLiteral	incredible@hulk.com
,	TokenNameCOMMA	
NEW_EMAIL	TokenNameIdentifier	 NEW  EMAIL
=	TokenNameEQUAL	
"kc@superman.com"	TokenNameStringLiteral	kc@superman.com
,	TokenNameCOMMA	
EMAIL_KEY	TokenNameIdentifier	 EMAIL  KEY
=	TokenNameEQUAL	
"email"	TokenNameStringLiteral	email
,	TokenNameCOMMA	
NEW_PHONE	TokenNameIdentifier	 NEW  PHONE
=	TokenNameEQUAL	
"(520) 555-1212"	TokenNameStringLiteral	(520) 555-1212
,	TokenNameCOMMA	
PHONE_KEY	TokenNameIdentifier	 PHONE  KEY
=	TokenNameEQUAL	
"phone"	TokenNameStringLiteral	phone
,	TokenNameCOMMA	
NEW_AGE	TokenNameIdentifier	 NEW  AGE
=	TokenNameEQUAL	
"30"	TokenNameStringLiteral	30
,	TokenNameCOMMA	
AGE_KEY	TokenNameIdentifier	 AGE  KEY
=	TokenNameEQUAL	
"age"	TokenNameStringLiteral	age
,	TokenNameCOMMA	
NEW_DATE	TokenNameIdentifier	 NEW  DATE
=	TokenNameEQUAL	
"2001/01/01 12:45"	TokenNameStringLiteral	2001/01/01 12:45
,	TokenNameCOMMA	
DATE_KEY	TokenNameIdentifier	 DATE  KEY
=	TokenNameEQUAL	
"date"	TokenNameStringLiteral	date
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
