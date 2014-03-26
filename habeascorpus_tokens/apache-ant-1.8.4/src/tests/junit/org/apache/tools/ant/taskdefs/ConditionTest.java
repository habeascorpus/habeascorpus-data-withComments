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
/** * @created 13 January 2002 */	TokenNameCOMMENT_JAVADOC	 @created 13 January 2002 
public	TokenNamepublic	
class	TokenNameclass	
ConditionTest	TokenNameIdentifier	 Condition Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
/** * Constructor for the ConditionTest object * * @param name we dont know */	TokenNameCOMMENT_JAVADOC	 Constructor for the ConditionTest object * @param name we dont know 
public	TokenNamepublic	
ConditionTest	TokenNameIdentifier	 Condition Test
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
"src/etc/testcases/taskdefs/condition.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/condition.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The teardown method for JUnit */	TokenNameCOMMENT_JAVADOC	 The teardown method for JUnit 
public	TokenNamepublic	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"cleanup"	TokenNameStringLiteral	cleanup
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBasic	TokenNameIdentifier	 test Basic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertySet	TokenNameIdentifier	 expect Property Set
(	TokenNameLPAREN	
"basic"	TokenNameStringLiteral	basic
,	TokenNameCOMMA	
"basic"	TokenNameStringLiteral	basic
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testConditionIncomplete	TokenNameIdentifier	 test Condition Incomplete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectSpecificBuildException	TokenNameIdentifier	 expect Specific Build Exception
(	TokenNameLPAREN	
"condition-incomplete"	TokenNameStringLiteral	condition-incomplete
,	TokenNameCOMMA	
"property attribute has been omitted"	TokenNameStringLiteral	property attribute has been omitted
,	TokenNameCOMMA	
"The property attribute is required."	TokenNameStringLiteral	The property attribute is required.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testConditionEmpty	TokenNameIdentifier	 test Condition Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectSpecificBuildException	TokenNameIdentifier	 expect Specific Build Exception
(	TokenNameLPAREN	
"condition-empty"	TokenNameStringLiteral	condition-empty
,	TokenNameCOMMA	
"no conditions"	TokenNameStringLiteral	no conditions
,	TokenNameCOMMA	
"You must nest a condition into <condition>"	TokenNameStringLiteral	You must nest a condition into <condition>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testShortcut	TokenNameIdentifier	 test Shortcut
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertySet	TokenNameIdentifier	 expect Property Set
(	TokenNameLPAREN	
"shortcut"	TokenNameStringLiteral	shortcut
,	TokenNameCOMMA	
"shortcut"	TokenNameStringLiteral	shortcut
,	TokenNameCOMMA	
"set"	TokenNameStringLiteral	set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testUnset	TokenNameIdentifier	 test Unset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertyUnset	TokenNameIdentifier	 expect Property Unset
(	TokenNameLPAREN	
"dontset"	TokenNameStringLiteral	dontset
,	TokenNameCOMMA	
"dontset"	TokenNameStringLiteral	dontset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSetValue	TokenNameIdentifier	 test Set Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertySet	TokenNameIdentifier	 expect Property Set
(	TokenNameLPAREN	
"setvalue"	TokenNameStringLiteral	setvalue
,	TokenNameCOMMA	
"setvalue"	TokenNameStringLiteral	setvalue
,	TokenNameCOMMA	
"woowoo"	TokenNameStringLiteral	woowoo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNegation	TokenNameIdentifier	 test Negation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertySet	TokenNameIdentifier	 expect Property Set
(	TokenNameLPAREN	
"negation"	TokenNameStringLiteral	negation
,	TokenNameCOMMA	
"negation"	TokenNameStringLiteral	negation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNegationFalse	TokenNameIdentifier	 test Negation False
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertyUnset	TokenNameIdentifier	 expect Property Unset
(	TokenNameLPAREN	
"negationfalse"	TokenNameStringLiteral	negationfalse
,	TokenNameCOMMA	
"negationfalse"	TokenNameStringLiteral	negationfalse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNegationIncomplete	TokenNameIdentifier	 test Negation Incomplete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectSpecificBuildException	TokenNameIdentifier	 expect Specific Build Exception
(	TokenNameLPAREN	
"negationincomplete"	TokenNameStringLiteral	negationincomplete
,	TokenNameCOMMA	
"no conditions in <not>"	TokenNameStringLiteral	no conditions in <not>
,	TokenNameCOMMA	
"You must nest a condition into <not>"	TokenNameStringLiteral	You must nest a condition into <not>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testAnd	TokenNameIdentifier	 test And
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertySet	TokenNameIdentifier	 expect Property Set
(	TokenNameLPAREN	
"and"	TokenNameStringLiteral	and
,	TokenNameCOMMA	
"and"	TokenNameStringLiteral	and
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testAndFails	TokenNameIdentifier	 test And Fails
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertyUnset	TokenNameIdentifier	 expect Property Unset
(	TokenNameLPAREN	
"andfails"	TokenNameStringLiteral	andfails
,	TokenNameCOMMA	
"andfails"	TokenNameStringLiteral	andfails
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testAndIncomplete	TokenNameIdentifier	 test And Incomplete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertyUnset	TokenNameIdentifier	 expect Property Unset
(	TokenNameLPAREN	
"andincomplete"	TokenNameStringLiteral	andincomplete
,	TokenNameCOMMA	
"andincomplete"	TokenNameStringLiteral	andincomplete
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testAndempty	TokenNameIdentifier	 test Andempty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertySet	TokenNameIdentifier	 expect Property Set
(	TokenNameLPAREN	
"andempty"	TokenNameStringLiteral	andempty
,	TokenNameCOMMA	
"andempty"	TokenNameStringLiteral	andempty
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testOr	TokenNameIdentifier	 test Or
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertySet	TokenNameIdentifier	 expect Property Set
(	TokenNameLPAREN	
"or"	TokenNameStringLiteral	or
,	TokenNameCOMMA	
"or"	TokenNameStringLiteral	or
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testOrincomplete	TokenNameIdentifier	 test Orincomplete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertySet	TokenNameIdentifier	 expect Property Set
(	TokenNameLPAREN	
"or"	TokenNameStringLiteral	or
,	TokenNameCOMMA	
"or"	TokenNameStringLiteral	or
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testOrFails	TokenNameIdentifier	 test Or Fails
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertyUnset	TokenNameIdentifier	 expect Property Unset
(	TokenNameLPAREN	
"orfails"	TokenNameStringLiteral	orfails
,	TokenNameCOMMA	
"orfails"	TokenNameStringLiteral	orfails
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testOrboth	TokenNameIdentifier	 test Orboth
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertySet	TokenNameIdentifier	 expect Property Set
(	TokenNameLPAREN	
"orboth"	TokenNameStringLiteral	orboth
,	TokenNameCOMMA	
"orboth"	TokenNameStringLiteral	orboth
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFilesmatchIdentical	TokenNameIdentifier	 test Filesmatch Identical
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertySet	TokenNameIdentifier	 expect Property Set
(	TokenNameLPAREN	
"filesmatch-identical"	TokenNameStringLiteral	filesmatch-identical
,	TokenNameCOMMA	
"filesmatch-identical"	TokenNameStringLiteral	filesmatch-identical
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFilesmatchIncomplete	TokenNameIdentifier	 test Filesmatch Incomplete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectSpecificBuildException	TokenNameIdentifier	 expect Specific Build Exception
(	TokenNameLPAREN	
"filesmatch-incomplete"	TokenNameStringLiteral	filesmatch-incomplete
,	TokenNameCOMMA	
"Missing file2 attribute"	TokenNameStringLiteral	Missing file2 attribute
,	TokenNameCOMMA	
"both file1 and file2 are required in filesmatch"	TokenNameStringLiteral	both file1 and file2 are required in filesmatch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFilesmatchOddsizes	TokenNameIdentifier	 test Filesmatch Oddsizes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertyUnset	TokenNameIdentifier	 expect Property Unset
(	TokenNameLPAREN	
"filesmatch-oddsizes"	TokenNameStringLiteral	filesmatch-oddsizes
,	TokenNameCOMMA	
"filesmatch-oddsizes"	TokenNameStringLiteral	filesmatch-oddsizes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFilesmatchExistence	TokenNameIdentifier	 test Filesmatch Existence
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertyUnset	TokenNameIdentifier	 expect Property Unset
(	TokenNameLPAREN	
"filesmatch-existence"	TokenNameStringLiteral	filesmatch-existence
,	TokenNameCOMMA	
"filesmatch-existence"	TokenNameStringLiteral	filesmatch-existence
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFilesmatchDifferent	TokenNameIdentifier	 test Filesmatch Different
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertyUnset	TokenNameIdentifier	 expect Property Unset
(	TokenNameLPAREN	
"filesmatch-different"	TokenNameStringLiteral	filesmatch-different
,	TokenNameCOMMA	
"filesmatch-different"	TokenNameStringLiteral	filesmatch-different
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFilesmatchMatch	TokenNameIdentifier	 test Filesmatch Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertySet	TokenNameIdentifier	 expect Property Set
(	TokenNameLPAREN	
"filesmatch-match"	TokenNameStringLiteral	filesmatch-match
,	TokenNameCOMMA	
"filesmatch-match"	TokenNameStringLiteral	filesmatch-match
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFilesmatchDifferentSizes	TokenNameIdentifier	 test Filesmatch Different Sizes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertyUnset	TokenNameIdentifier	 expect Property Unset
(	TokenNameLPAREN	
"filesmatch-different-sizes"	TokenNameStringLiteral	filesmatch-different-sizes
,	TokenNameCOMMA	
"filesmatch-different-sizes"	TokenNameStringLiteral	filesmatch-different-sizes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFilesmatchDifferentOnemissing	TokenNameIdentifier	 test Filesmatch Different Onemissing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertyUnset	TokenNameIdentifier	 expect Property Unset
(	TokenNameLPAREN	
"filesmatch-different-onemissing"	TokenNameStringLiteral	filesmatch-different-onemissing
,	TokenNameCOMMA	
"filesmatch-different-onemissing"	TokenNameStringLiteral	filesmatch-different-onemissing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFilesmatchDifferentEol	TokenNameIdentifier	 test Filesmatch Different Eol
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"filesmatch-different-eol"	TokenNameStringLiteral	filesmatch-different-eol
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFilesmatchSameEol	TokenNameIdentifier	 test Filesmatch Same Eol
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"filesmatch-same-eol"	TokenNameStringLiteral	filesmatch-same-eol
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFilesmatchNeitherExist	TokenNameIdentifier	 test Filesmatch Neither Exist
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"filesmatch-neitherexist"	TokenNameStringLiteral	filesmatch-neitherexist
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testContains	TokenNameIdentifier	 test Contains
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertySet	TokenNameIdentifier	 expect Property Set
(	TokenNameLPAREN	
"contains"	TokenNameStringLiteral	contains
,	TokenNameCOMMA	
"contains"	TokenNameStringLiteral	contains
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testContainsDoesnt	TokenNameIdentifier	 test Contains Doesnt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertyUnset	TokenNameIdentifier	 expect Property Unset
(	TokenNameLPAREN	
"contains-doesnt"	TokenNameStringLiteral	contains-doesnt
,	TokenNameCOMMA	
"contains-doesnt"	TokenNameStringLiteral	contains-doesnt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testContainsAnycase	TokenNameIdentifier	 test Contains Anycase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertySet	TokenNameIdentifier	 expect Property Set
(	TokenNameLPAREN	
"contains-anycase"	TokenNameStringLiteral	contains-anycase
,	TokenNameCOMMA	
"contains-anycase"	TokenNameStringLiteral	contains-anycase
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testContainsIncomplete1	TokenNameIdentifier	 test Contains Incomplete1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectSpecificBuildException	TokenNameIdentifier	 expect Specific Build Exception
(	TokenNameLPAREN	
"contains-incomplete1"	TokenNameStringLiteral	contains-incomplete1
,	TokenNameCOMMA	
"Missing contains attribute"	TokenNameStringLiteral	Missing contains attribute
,	TokenNameCOMMA	
"both string and substring are required in contains"	TokenNameStringLiteral	both string and substring are required in contains
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testContainsIncomplete2	TokenNameIdentifier	 test Contains Incomplete2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectSpecificBuildException	TokenNameIdentifier	 expect Specific Build Exception
(	TokenNameLPAREN	
"contains-incomplete2"	TokenNameStringLiteral	contains-incomplete2
,	TokenNameCOMMA	
"Missing contains attribute"	TokenNameStringLiteral	Missing contains attribute
,	TokenNameCOMMA	
"both string and substring are required in contains"	TokenNameStringLiteral	both string and substring are required in contains
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testIstrue	TokenNameIdentifier	 test Istrue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertySet	TokenNameIdentifier	 expect Property Set
(	TokenNameLPAREN	
"istrue"	TokenNameStringLiteral	istrue
,	TokenNameCOMMA	
"istrue"	TokenNameStringLiteral	istrue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testIstrueNot	TokenNameIdentifier	 test Istrue Not
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertyUnset	TokenNameIdentifier	 expect Property Unset
(	TokenNameLPAREN	
"istrue-not"	TokenNameStringLiteral	istrue-not
,	TokenNameCOMMA	
"istrue-not"	TokenNameStringLiteral	istrue-not
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testIstrueFalse	TokenNameIdentifier	 test Istrue False
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertyUnset	TokenNameIdentifier	 expect Property Unset
(	TokenNameLPAREN	
"istrue-false"	TokenNameStringLiteral	istrue-false
,	TokenNameCOMMA	
"istrue-false"	TokenNameStringLiteral	istrue-false
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testIstrueIncomplete1	TokenNameIdentifier	 test Istrue Incomplete1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectSpecificBuildException	TokenNameIdentifier	 expect Specific Build Exception
(	TokenNameLPAREN	
"istrue-incomplete"	TokenNameStringLiteral	istrue-incomplete
,	TokenNameCOMMA	
"Missing attribute"	TokenNameStringLiteral	Missing attribute
,	TokenNameCOMMA	
"Nothing to test for truth"	TokenNameStringLiteral	Nothing to test for truth
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testIsfalseTrue	TokenNameIdentifier	 test Isfalse True
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertyUnset	TokenNameIdentifier	 expect Property Unset
(	TokenNameLPAREN	
"isfalse-true"	TokenNameStringLiteral	isfalse-true
,	TokenNameCOMMA	
"isfalse-true"	TokenNameStringLiteral	isfalse-true
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testIsfalseNot	TokenNameIdentifier	 test Isfalse Not
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertySet	TokenNameIdentifier	 expect Property Set
(	TokenNameLPAREN	
"isfalse-not"	TokenNameStringLiteral	isfalse-not
,	TokenNameCOMMA	
"isfalse-not"	TokenNameStringLiteral	isfalse-not
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testIsfalseFalse	TokenNameIdentifier	 test Isfalse False
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectPropertySet	TokenNameIdentifier	 expect Property Set
(	TokenNameLPAREN	
"isfalse-false"	TokenNameStringLiteral	isfalse-false
,	TokenNameCOMMA	
"isfalse-false"	TokenNameStringLiteral	isfalse-false
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testIsfalseIncomplete1	TokenNameIdentifier	 test Isfalse Incomplete1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectSpecificBuildException	TokenNameIdentifier	 expect Specific Build Exception
(	TokenNameLPAREN	
"isfalse-incomplete"	TokenNameStringLiteral	isfalse-incomplete
,	TokenNameCOMMA	
"Missing attribute"	TokenNameStringLiteral	Missing attribute
,	TokenNameCOMMA	
"Nothing to test for falsehood"	TokenNameStringLiteral	Nothing to test for falsehood
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testElse	TokenNameIdentifier	 test Else
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testElse"	TokenNameStringLiteral	testElse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testResourcesmatchError	TokenNameIdentifier	 test Resourcesmatch Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildException	TokenNameIdentifier	 expect Build Exception
(	TokenNameLPAREN	
"resourcesmatch-error"	TokenNameStringLiteral	resourcesmatch-error
,	TokenNameCOMMA	
"should fail because no resources specified"	TokenNameStringLiteral	should fail because no resources specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testResourcesmatchEmpty	TokenNameIdentifier	 test Resourcesmatch Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"resourcesmatch-match-empty"	TokenNameStringLiteral	resourcesmatch-match-empty
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testResourcesmatchOne	TokenNameIdentifier	 test Resourcesmatch One
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"resourcesmatch-match-one"	TokenNameStringLiteral	resourcesmatch-match-one
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testResourcesmatchBinary	TokenNameIdentifier	 test Resourcesmatch Binary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"resourcesmatch-match-binary"	TokenNameStringLiteral	resourcesmatch-match-binary
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testResourcesmatchMultipleBinary	TokenNameIdentifier	 test Resourcesmatch Multiple Binary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"resourcesmatch-match-multiple-binary"	TokenNameStringLiteral	resourcesmatch-match-multiple-binary
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testResourcesmatchDiffer	TokenNameIdentifier	 test Resourcesmatch Differ
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"resourcesmatch-differ"	TokenNameStringLiteral	resourcesmatch-differ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testResourcesmatchText	TokenNameIdentifier	 test Resourcesmatch Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"resourcesmatch-match-text"	TokenNameStringLiteral	resourcesmatch-match-text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testResourcesmatchNoneExist	TokenNameIdentifier	 test Resourcesmatch None Exist
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"resourcesmatch-noneexist"	TokenNameStringLiteral	resourcesmatch-noneexist
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
