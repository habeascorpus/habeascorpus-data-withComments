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
/** * Test schema validation */	TokenNameCOMMENT_JAVADOC	 Test schema validation 
public	TokenNamepublic	
class	TokenNameclass	
SchemaValidateTest	TokenNameIdentifier	 Schema Validate Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
/** * where tasks run */	TokenNameCOMMENT_JAVADOC	 where tasks run 
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
TASKDEFS_DIR	TokenNameIdentifier	 TASKDEFS  DIR
=	TokenNameEQUAL	
"src/etc/testcases/taskdefs/optional/"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/
;	TokenNameSEMICOLON	
/** * Constructor * * @param name testname */	TokenNameCOMMENT_JAVADOC	 Constructor * @param name testname 
public	TokenNamepublic	
SchemaValidateTest	TokenNameIdentifier	 Schema Validate Test
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
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
TASKDEFS_DIR	TokenNameIdentifier	 TASKDEFS  DIR
+	TokenNamePLUS	
"schemavalidate.xml"	TokenNameStringLiteral	schemavalidate.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * test with no namespace */	TokenNameCOMMENT_JAVADOC	 test with no namespace 
public	TokenNamepublic	
void	TokenNamevoid	
testNoNamespace	TokenNameIdentifier	 test No Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testNoNamespace"	TokenNameStringLiteral	testNoNamespace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * add namespace awareness. */	TokenNameCOMMENT_JAVADOC	 add namespace awareness. 
public	TokenNamepublic	
void	TokenNamevoid	
testNSMapping	TokenNameIdentifier	 test NS Mapping
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testNSMapping"	TokenNameStringLiteral	testNSMapping
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoEmptySchemaNamespace	TokenNameIdentifier	 test No Empty Schema Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"testNoEmptySchemaNamespace"	TokenNameStringLiteral	testNoEmptySchemaNamespace
,	TokenNameCOMMA	
"empty namespace URI"	TokenNameStringLiteral	empty namespace URI
,	TokenNameCOMMA	
SchemaValidate	TokenNameIdentifier	 Schema Validate
.	TokenNameDOT	
SchemaLocation	TokenNameIdentifier	 Schema Location
.	TokenNameDOT	
ERROR_NO_URI	TokenNameIdentifier	 ERROR  NO  URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoEmptySchemaLocation	TokenNameIdentifier	 test No Empty Schema Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"testNoEmptySchemaLocation"	TokenNameStringLiteral	testNoEmptySchemaLocation
,	TokenNameCOMMA	
"empty schema location"	TokenNameStringLiteral	empty schema location
,	TokenNameCOMMA	
SchemaValidate	TokenNameIdentifier	 Schema Validate
.	TokenNameDOT	
SchemaLocation	TokenNameIdentifier	 Schema Location
.	TokenNameDOT	
ERROR_NO_LOCATION	TokenNameIdentifier	 ERROR  NO  LOCATION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoFile	TokenNameIdentifier	 test No File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"testNoFile"	TokenNameStringLiteral	testNoFile
,	TokenNameCOMMA	
"no file at file attribute"	TokenNameStringLiteral	no file at file attribute
,	TokenNameCOMMA	
SchemaValidate	TokenNameIdentifier	 Schema Validate
.	TokenNameDOT	
SchemaLocation	TokenNameIdentifier	 Schema Location
.	TokenNameDOT	
ERROR_NO_FILE	TokenNameIdentifier	 ERROR  NO  FILE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoDoubleSchemaLocation	TokenNameIdentifier	 test No Double Schema Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"testNoDoubleSchemaLocation"	TokenNameStringLiteral	testNoDoubleSchemaLocation
,	TokenNameCOMMA	
"two locations for schemas"	TokenNameStringLiteral	two locations for schemas
,	TokenNameCOMMA	
SchemaValidate	TokenNameIdentifier	 Schema Validate
.	TokenNameDOT	
SchemaLocation	TokenNameIdentifier	 Schema Location
.	TokenNameDOT	
ERROR_TWO_LOCATIONS	TokenNameIdentifier	 ERROR  TWO  LOCATIONS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoDuplicateSchema	TokenNameIdentifier	 test No Duplicate Schema
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
expectBuildExceptionContaining	TokenNameIdentifier	 expect Build Exception Containing
(	TokenNameLPAREN	
"testNoDuplicateSchema"	TokenNameStringLiteral	testNoDuplicateSchema
,	TokenNameCOMMA	
"duplicate schemas with different values"	TokenNameStringLiteral	duplicate schemas with different values
,	TokenNameCOMMA	
SchemaValidate	TokenNameIdentifier	 Schema Validate
.	TokenNameDOT	
ERROR_DUPLICATE_SCHEMA	TokenNameIdentifier	 ERROR  DUPLICATE  SCHEMA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEqualsSchemasOK	TokenNameIdentifier	 test Equals Schemas OK
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testEqualsSchemasOK"	TokenNameStringLiteral	testEqualsSchemasOK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFileset	TokenNameIdentifier	 test Fileset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testFileset"	TokenNameStringLiteral	testFileset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
