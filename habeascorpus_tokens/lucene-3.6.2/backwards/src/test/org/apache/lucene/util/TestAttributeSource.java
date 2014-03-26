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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
Token	TokenNameIdentifier	 Token
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
*	TokenNameMULTIPLY	
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
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestAttributeSource	TokenNameIdentifier	 Test Attribute Source
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCaptureState	TokenNameIdentifier	 test Capture State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// init a first instance 	TokenNameCOMMENT_LINE	init a first instance 
AttributeSource	TokenNameIdentifier	 Attribute Source
src	TokenNameIdentifier	 src
=	TokenNameEQUAL	
new	TokenNamenew	
AttributeSource	TokenNameIdentifier	 Attribute Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
termAtt	TokenNameIdentifier	 term Att
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TypeAttribute	TokenNameIdentifier	 Type Attribute
typeAtt	TokenNameIdentifier	 type Att
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
TypeAttribute	TokenNameIdentifier	 Type Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"TestTerm"	TokenNameStringLiteral	TestTerm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
typeAtt	TokenNameIdentifier	 type Att
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
"TestType"	TokenNameStringLiteral	TestType
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AttributeSource	TokenNameIdentifier	 Attribute Source
.	TokenNameDOT	
State	TokenNameIdentifier	 State
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
captureState	TokenNameIdentifier	 capture State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// modify the attributes 	TokenNameCOMMENT_LINE	modify the attributes 
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
setEmpty	TokenNameIdentifier	 set Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"AnotherTestTerm"	TokenNameStringLiteral	AnotherTestTerm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
typeAtt	TokenNameIdentifier	 type Att
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
"AnotherTestType"	TokenNameStringLiteral	AnotherTestType
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Hash code should be different"	TokenNameStringLiteral	Hash code should be different
,	TokenNameCOMMA	
hashCode	TokenNameIdentifier	 hash Code
!=	TokenNameNOT_EQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
restoreState	TokenNameIdentifier	 restore State
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"TestTerm"	TokenNameStringLiteral	TestTerm
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"TestType"	TokenNameStringLiteral	TestType
,	TokenNameCOMMA	
typeAtt	TokenNameIdentifier	 type Att
.	TokenNameDOT	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Hash code should be equal after restore"	TokenNameStringLiteral	Hash code should be equal after restore
,	TokenNameCOMMA	
hashCode	TokenNameIdentifier	 hash Code
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// restore into an exact configured copy 	TokenNameCOMMENT_LINE	restore into an exact configured copy 
AttributeSource	TokenNameIdentifier	 Attribute Source
copy	TokenNameIdentifier	 copy
=	TokenNameEQUAL	
new	TokenNamenew	
AttributeSource	TokenNameIdentifier	 Attribute Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
copy	TokenNameIdentifier	 copy
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
copy	TokenNameIdentifier	 copy
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
TypeAttribute	TokenNameIdentifier	 Type Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
copy	TokenNameIdentifier	 copy
.	TokenNameDOT	
restoreState	TokenNameIdentifier	 restore State
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Both AttributeSources should have same hashCode after restore"	TokenNameStringLiteral	Both AttributeSources should have same hashCode after restore
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
copy	TokenNameIdentifier	 copy
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Both AttributeSources should be equal after restore"	TokenNameStringLiteral	Both AttributeSources should be equal after restore
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
copy	TokenNameIdentifier	 copy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// init a second instance (with attributes in different order and one additional attribute) 	TokenNameCOMMENT_LINE	init a second instance (with attributes in different order and one additional attribute) 
AttributeSource	TokenNameIdentifier	 Attribute Source
src2	TokenNameIdentifier	 src2
=	TokenNameEQUAL	
new	TokenNamenew	
AttributeSource	TokenNameIdentifier	 Attribute Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
typeAtt	TokenNameIdentifier	 type Att
=	TokenNameEQUAL	
src2	TokenNameIdentifier	 src2
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
TypeAttribute	TokenNameIdentifier	 Type Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FlagsAttribute	TokenNameIdentifier	 Flags Attribute
flagsAtt	TokenNameIdentifier	 flags Att
=	TokenNameEQUAL	
src2	TokenNameIdentifier	 src2
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
FlagsAttribute	TokenNameIdentifier	 Flags Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termAtt	TokenNameIdentifier	 term Att
=	TokenNameEQUAL	
src2	TokenNameIdentifier	 src2
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
flagsAtt	TokenNameIdentifier	 flags Att
.	TokenNameDOT	
setFlags	TokenNameIdentifier	 set Flags
(	TokenNameLPAREN	
12345	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
src2	TokenNameIdentifier	 src2
.	TokenNameDOT	
restoreState	TokenNameIdentifier	 restore State
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"TestTerm"	TokenNameStringLiteral	TestTerm
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"TestType"	TokenNameStringLiteral	TestType
,	TokenNameCOMMA	
typeAtt	TokenNameIdentifier	 type Att
.	TokenNameDOT	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"FlagsAttribute should not be touched"	TokenNameStringLiteral	FlagsAttribute should not be touched
,	TokenNameCOMMA	
12345	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flagsAtt	TokenNameIdentifier	 flags Att
.	TokenNameDOT	
getFlags	TokenNameIdentifier	 get Flags
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// init a third instance missing one Attribute 	TokenNameCOMMENT_LINE	init a third instance missing one Attribute 
AttributeSource	TokenNameIdentifier	 Attribute Source
src3	TokenNameIdentifier	 src3
=	TokenNameEQUAL	
new	TokenNamenew	
AttributeSource	TokenNameIdentifier	 Attribute Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termAtt	TokenNameIdentifier	 term Att
=	TokenNameEQUAL	
src3	TokenNameIdentifier	 src3
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
src3	TokenNameIdentifier	 src3
.	TokenNameDOT	
restoreState	TokenNameIdentifier	 restore State
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"The third instance is missing the TypeAttribute, so restoreState() should throw IllegalArgumentException"	TokenNameStringLiteral	The third instance is missing the TypeAttribute, so restoreState() should throw IllegalArgumentException
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
iae	TokenNameIdentifier	 iae
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// pass 	TokenNameCOMMENT_LINE	pass 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCloneAttributes	TokenNameIdentifier	 test Clone Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
AttributeSource	TokenNameIdentifier	 Attribute Source
src	TokenNameIdentifier	 src
=	TokenNameEQUAL	
new	TokenNamenew	
AttributeSource	TokenNameIdentifier	 Attribute Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
FlagsAttribute	TokenNameIdentifier	 Flags Attribute
flagsAtt	TokenNameIdentifier	 flags Att
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
FlagsAttribute	TokenNameIdentifier	 Flags Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TypeAttribute	TokenNameIdentifier	 Type Attribute
typeAtt	TokenNameIdentifier	 type Att
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
TypeAttribute	TokenNameIdentifier	 Type Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
flagsAtt	TokenNameIdentifier	 flags Att
.	TokenNameDOT	
setFlags	TokenNameIdentifier	 set Flags
(	TokenNameLPAREN	
1234	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
typeAtt	TokenNameIdentifier	 type Att
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
"TestType"	TokenNameStringLiteral	TestType
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
AttributeSource	TokenNameIdentifier	 Attribute Source
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
cloneAttributes	TokenNameIdentifier	 clone Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
Attribute	TokenNameIdentifier	 Attribute
>>	TokenNameRIGHT_SHIFT	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
getAttributeClassesIterator	TokenNameIdentifier	 get Attribute Classes Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"FlagsAttribute must be the first attribute"	TokenNameStringLiteral	FlagsAttribute must be the first attribute
,	TokenNameCOMMA	
FlagsAttribute	TokenNameIdentifier	 Flags Attribute
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"TypeAttribute must be the second attribute"	TokenNameStringLiteral	TypeAttribute must be the second attribute
,	TokenNameCOMMA	
TypeAttribute	TokenNameIdentifier	 Type Attribute
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"No more attributes"	TokenNameStringLiteral	No more attributes
,	TokenNameCOMMA	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
FlagsAttribute	TokenNameIdentifier	 Flags Attribute
flagsAtt2	TokenNameIdentifier	 flags Att2
=	TokenNameEQUAL	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
FlagsAttribute	TokenNameIdentifier	 Flags Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TypeAttribute	TokenNameIdentifier	 Type Attribute
typeAtt2	TokenNameIdentifier	 type Att2
=	TokenNameEQUAL	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
TypeAttribute	TokenNameIdentifier	 Type Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotSame	TokenNameIdentifier	 assert Not Same
(	TokenNameLPAREN	
"FlagsAttribute of original and clone must be different instances"	TokenNameStringLiteral	FlagsAttribute of original and clone must be different instances
,	TokenNameCOMMA	
flagsAtt2	TokenNameIdentifier	 flags Att2
,	TokenNameCOMMA	
flagsAtt	TokenNameIdentifier	 flags Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotSame	TokenNameIdentifier	 assert Not Same
(	TokenNameLPAREN	
"TypeAttribute of original and clone must be different instances"	TokenNameStringLiteral	TypeAttribute of original and clone must be different instances
,	TokenNameCOMMA	
typeAtt2	TokenNameIdentifier	 type Att2
,	TokenNameCOMMA	
typeAtt	TokenNameIdentifier	 type Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"FlagsAttribute of original and clone must be equal"	TokenNameStringLiteral	FlagsAttribute of original and clone must be equal
,	TokenNameCOMMA	
flagsAtt2	TokenNameIdentifier	 flags Att2
,	TokenNameCOMMA	
flagsAtt	TokenNameIdentifier	 flags Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"TypeAttribute of original and clone must be equal"	TokenNameStringLiteral	TypeAttribute of original and clone must be equal
,	TokenNameCOMMA	
typeAtt2	TokenNameIdentifier	 type Att2
,	TokenNameCOMMA	
typeAtt	TokenNameIdentifier	 type Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// test copy back 	TokenNameCOMMENT_LINE	test copy back 
flagsAtt2	TokenNameIdentifier	 flags Att2
.	TokenNameDOT	
setFlags	TokenNameIdentifier	 set Flags
(	TokenNameLPAREN	
4711	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
typeAtt2	TokenNameIdentifier	 type Att2
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
"OtherType"	TokenNameStringLiteral	OtherType
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
copyTo	TokenNameIdentifier	 copy To
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"FlagsAttribute of original must now contain updated term"	TokenNameStringLiteral	FlagsAttribute of original must now contain updated term
,	TokenNameCOMMA	
4711	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flagsAtt	TokenNameIdentifier	 flags Att
.	TokenNameDOT	
getFlags	TokenNameIdentifier	 get Flags
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"TypeAttribute of original must now contain updated type"	TokenNameStringLiteral	TypeAttribute of original must now contain updated type
,	TokenNameCOMMA	
"OtherType"	TokenNameStringLiteral	OtherType
,	TokenNameCOMMA	
typeAtt	TokenNameIdentifier	 type Att
.	TokenNameDOT	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// verify again: 	TokenNameCOMMENT_LINE	verify again: 
assertNotSame	TokenNameIdentifier	 assert Not Same
(	TokenNameLPAREN	
"FlagsAttribute of original and clone must be different instances"	TokenNameStringLiteral	FlagsAttribute of original and clone must be different instances
,	TokenNameCOMMA	
flagsAtt2	TokenNameIdentifier	 flags Att2
,	TokenNameCOMMA	
flagsAtt	TokenNameIdentifier	 flags Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotSame	TokenNameIdentifier	 assert Not Same
(	TokenNameLPAREN	
"TypeAttribute of original and clone must be different instances"	TokenNameStringLiteral	TypeAttribute of original and clone must be different instances
,	TokenNameCOMMA	
typeAtt2	TokenNameIdentifier	 type Att2
,	TokenNameCOMMA	
typeAtt	TokenNameIdentifier	 type Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"FlagsAttribute of original and clone must be equal"	TokenNameStringLiteral	FlagsAttribute of original and clone must be equal
,	TokenNameCOMMA	
flagsAtt2	TokenNameIdentifier	 flags Att2
,	TokenNameCOMMA	
flagsAtt	TokenNameIdentifier	 flags Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"TypeAttribute of original and clone must be equal"	TokenNameStringLiteral	TypeAttribute of original and clone must be equal
,	TokenNameCOMMA	
typeAtt2	TokenNameIdentifier	 type Att2
,	TokenNameCOMMA	
typeAtt	TokenNameIdentifier	 type Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testToStringAndMultiAttributeImplementations	TokenNameIdentifier	 test To String And Multi Attribute Implementations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AttributeSource	TokenNameIdentifier	 Attribute Source
src	TokenNameIdentifier	 src
=	TokenNameEQUAL	
new	TokenNamenew	
AttributeSource	TokenNameIdentifier	 Attribute Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
termAtt	TokenNameIdentifier	 term Att
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TypeAttribute	TokenNameIdentifier	 Type Attribute
typeAtt	TokenNameIdentifier	 type Att
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
TypeAttribute	TokenNameIdentifier	 Type Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"TestTerm"	TokenNameStringLiteral	TestTerm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
typeAtt	TokenNameIdentifier	 type Att
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
"TestType"	TokenNameStringLiteral	TestType
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Attributes should appear in original order"	TokenNameStringLiteral	Attributes should appear in original order
,	TokenNameCOMMA	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
typeAtt	TokenNameIdentifier	 type Att
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
>	TokenNameGREATER	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getAttributeImplsIterator	TokenNameIdentifier	 get Attribute Impls Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Iterator should have 2 attributes left"	TokenNameStringLiteral	Iterator should have 2 attributes left
,	TokenNameCOMMA	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
"First AttributeImpl from iterator should be termAtt"	TokenNameStringLiteral	First AttributeImpl from iterator should be termAtt
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
,	TokenNameCOMMA	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Iterator should have 1 attributes left"	TokenNameStringLiteral	Iterator should have 1 attributes left
,	TokenNameCOMMA	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
"Second AttributeImpl from iterator should be typeAtt"	TokenNameStringLiteral	Second AttributeImpl from iterator should be typeAtt
,	TokenNameCOMMA	
typeAtt	TokenNameIdentifier	 type Att
,	TokenNameCOMMA	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"Iterator should have 0 attributes left"	TokenNameStringLiteral	Iterator should have 0 attributes left
,	TokenNameCOMMA	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
src	TokenNameIdentifier	 src
=	TokenNameEQUAL	
new	TokenNamenew	
AttributeSource	TokenNameIdentifier	 Attribute Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
addAttributeImpl	TokenNameIdentifier	 add Attribute Impl
(	TokenNameLPAREN	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// this should not add a new attribute as Token implements CharTermAttribute, too 	TokenNameCOMMENT_LINE	this should not add a new attribute as Token implements CharTermAttribute, too 
termAtt	TokenNameIdentifier	 term Att
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"CharTermAttribute should be implemented by Token"	TokenNameStringLiteral	CharTermAttribute should be implemented by Token
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
instanceof	TokenNameinstanceof	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// get the Token attribute and check, that it is the only one 	TokenNameCOMMENT_LINE	get the Token attribute and check, that it is the only one 
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getAttributeImplsIterator	TokenNameIdentifier	 get Attribute Impls Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"There should be only one attribute implementation instance"	TokenNameStringLiteral	There should be only one attribute implementation instance
,	TokenNameCOMMA	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
setEmpty	TokenNameIdentifier	 set Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"TestTerm"	TokenNameStringLiteral	TestTerm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Token should only printed once"	TokenNameStringLiteral	Token should only printed once
,	TokenNameCOMMA	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDefaultAttributeFactory	TokenNameIdentifier	 test Default Attribute Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
AttributeSource	TokenNameIdentifier	 Attribute Source
src	TokenNameIdentifier	 src
=	TokenNameEQUAL	
new	TokenNamenew	
AttributeSource	TokenNameIdentifier	 Attribute Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"CharTermAttribute is not implemented by CharTermAttributeImpl"	TokenNameStringLiteral	CharTermAttribute is not implemented by CharTermAttributeImpl
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
CharTermAttributeImpl	TokenNameIdentifier	 Char Term Attribute Impl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"OffsetAttribute is not implemented by OffsetAttributeImpl"	TokenNameStringLiteral	OffsetAttribute is not implemented by OffsetAttributeImpl
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
OffsetAttributeImpl	TokenNameIdentifier	 Offset Attribute Impl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"FlagsAttribute is not implemented by FlagsAttributeImpl"	TokenNameStringLiteral	FlagsAttribute is not implemented by FlagsAttributeImpl
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
FlagsAttribute	TokenNameIdentifier	 Flags Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
FlagsAttributeImpl	TokenNameIdentifier	 Flags Attribute Impl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"PayloadAttribute is not implemented by PayloadAttributeImpl"	TokenNameStringLiteral	PayloadAttribute is not implemented by PayloadAttributeImpl
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
PayloadAttribute	TokenNameIdentifier	 Payload Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
PayloadAttributeImpl	TokenNameIdentifier	 Payload Attribute Impl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"PositionIncrementAttribute is not implemented by PositionIncrementAttributeImpl"	TokenNameStringLiteral	PositionIncrementAttribute is not implemented by PositionIncrementAttributeImpl
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
PositionIncrementAttributeImpl	TokenNameIdentifier	 Position Increment Attribute Impl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"TypeAttribute is not implemented by TypeAttributeImpl"	TokenNameStringLiteral	TypeAttribute is not implemented by TypeAttributeImpl
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
TypeAttribute	TokenNameIdentifier	 Type Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
TypeAttributeImpl	TokenNameIdentifier	 Type Attribute Impl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unchecked"	TokenNameStringLiteral	unchecked
)	TokenNameRPAREN	
public	TokenNamepublic	
void	TokenNamevoid	
testInvalidArguments	TokenNameIdentifier	 test Invalid Arguments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
AttributeSource	TokenNameIdentifier	 Attribute Source
src	TokenNameIdentifier	 src
=	TokenNameEQUAL	
new	TokenNamenew	
AttributeSource	TokenNameIdentifier	 Attribute Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Should throw IllegalArgumentException"	TokenNameStringLiteral	Should throw IllegalArgumentException
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
iae	TokenNameIdentifier	 iae
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
AttributeSource	TokenNameIdentifier	 Attribute Source
src	TokenNameIdentifier	 src
=	TokenNameEQUAL	
new	TokenNamenew	
AttributeSource	TokenNameIdentifier	 Attribute Source
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
TOKEN_ATTRIBUTE_FACTORY	TokenNameIdentifier	 TOKEN  ATTRIBUTE  FACTORY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Should throw IllegalArgumentException"	TokenNameStringLiteral	Should throw IllegalArgumentException
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
iae	TokenNameIdentifier	 iae
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
AttributeSource	TokenNameIdentifier	 Attribute Source
src	TokenNameIdentifier	 src
=	TokenNameEQUAL	
new	TokenNamenew	
AttributeSource	TokenNameIdentifier	 Attribute Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// break this by unsafe cast 	TokenNameCOMMENT_LINE	break this by unsafe cast 
src	TokenNameIdentifier	 src
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
)	TokenNameRPAREN	
Iterator	TokenNameIdentifier	 Iterator
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Should throw IllegalArgumentException"	TokenNameStringLiteral	Should throw IllegalArgumentException
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
iae	TokenNameIdentifier	 iae
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testLUCENE_3042	TokenNameIdentifier	 test LUCENE 3042
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
AttributeSource	TokenNameIdentifier	 Attribute Source
src1	TokenNameIdentifier	 src1
=	TokenNameEQUAL	
new	TokenNamenew	
AttributeSource	TokenNameIdentifier	 Attribute Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
src1	TokenNameIdentifier	 src1
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
hash1	TokenNameIdentifier	 hash1
=	TokenNameEQUAL	
src1	TokenNameIdentifier	 src1
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// this triggers a cached state 	TokenNameCOMMENT_LINE	this triggers a cached state 
final	TokenNamefinal	
AttributeSource	TokenNameIdentifier	 Attribute Source
src2	TokenNameIdentifier	 src2
=	TokenNameEQUAL	
new	TokenNamenew	
AttributeSource	TokenNameIdentifier	 Attribute Source
(	TokenNameLPAREN	
src1	TokenNameIdentifier	 src1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
src2	TokenNameIdentifier	 src2
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
TypeAttribute	TokenNameIdentifier	 Type Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
"bar"	TokenNameStringLiteral	bar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"The hashCode is identical, so the captured state was preserved."	TokenNameStringLiteral	The hashCode is identical, so the captured state was preserved.
,	TokenNameCOMMA	
hash1	TokenNameIdentifier	 hash1
!=	TokenNameNOT_EQUAL	
src1	TokenNameIdentifier	 src1
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
src2	TokenNameIdentifier	 src2
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
src1	TokenNameIdentifier	 src1
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// this class is included in external class check, so no assertion errors occur 	TokenNameCOMMENT_LINE	this class is included in external class check, so no assertion errors occur 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
static	TokenNamestatic	
class	TokenNameclass	
TestAttributeImpl	TokenNameIdentifier	 Test Attribute Impl
extends	TokenNameextends	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
implements	TokenNameimplements	
FlagsAttribute	TokenNameIdentifier	 Flags Attribute
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
flags	TokenNameIdentifier	 flags
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
getFlags	TokenNameIdentifier	 get Flags
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
flags	TokenNameIdentifier	 flags
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setFlags	TokenNameIdentifier	 set Flags
(	TokenNameLPAREN	
int	TokenNameint	
flags	TokenNameIdentifier	 flags
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
flags	TokenNameIdentifier	 flags
=	TokenNameEQUAL	
flags	TokenNameIdentifier	 flags
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flags	TokenNameIdentifier	 flags
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
copyTo	TokenNameIdentifier	 copy To
(	TokenNameLPAREN	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FlagsAttribute	TokenNameIdentifier	 Flags Attribute
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FlagsAttribute	TokenNameIdentifier	 Flags Attribute
)	TokenNameRPAREN	
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
setFlags	TokenNameIdentifier	 set Flags
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"foo=bar,moo=mae"	TokenNameStringLiteral	foo=bar,moo=mae
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// this class is excluded in external class check, so assertion on calling reflectWith should occur 	TokenNameCOMMENT_LINE	this class is excluded in external class check, so assertion on calling reflectWith should occur 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
static	TokenNamestatic	
class	TokenNameclass	
TestAttributeImpl2	TokenNameIdentifier	 Test Attribute Impl2
extends	TokenNameextends	
TestAttributeImpl	TokenNameIdentifier	 Test Attribute Impl
{	TokenNameLBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
void	TokenNamevoid	
testReflectionOfToString	TokenNameIdentifier	 test Reflection Of To String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
AttributeSource	TokenNameIdentifier	 Attribute Source
src	TokenNameIdentifier	 src
=	TokenNameEQUAL	
new	TokenNamenew	
AttributeSource	TokenNameIdentifier	 Attribute Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
att	TokenNameIdentifier	 att
=	TokenNameEQUAL	
new	TokenNamenew	
TestAttributeImpl	TokenNameIdentifier	 Test Attribute Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
addAttributeImpl	TokenNameIdentifier	 add Attribute Impl
(	TokenNameLPAREN	
att	TokenNameIdentifier	 att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
"FlagsAttribute is not implemented by same instance of TestAttributeImpl"	TokenNameStringLiteral	FlagsAttribute is not implemented by same instance of TestAttributeImpl
,	TokenNameCOMMA	
att	TokenNameIdentifier	 att
,	TokenNameCOMMA	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
FlagsAttribute	TokenNameIdentifier	 Flags Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
AttributeReflector	TokenNameIdentifier	 Attribute Reflector
reflector	TokenNameIdentifier	 reflector
=	TokenNameEQUAL	
new	TokenNamenew	
AttributeReflector	TokenNameIdentifier	 Attribute Reflector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
reflect	TokenNameIdentifier	 reflect
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
Attribute	TokenNameIdentifier	 Attribute
>	TokenNameGREATER	
attClass	TokenNameIdentifier	 att Class
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
FlagsAttribute	TokenNameIdentifier	 Flags Attribute
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
attClass	TokenNameIdentifier	 att Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
att	TokenNameIdentifier	 att
.	TokenNameDOT	
reflectWith	TokenNameIdentifier	 reflect With
(	TokenNameLPAREN	
reflector	TokenNameIdentifier	 reflector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"bar"	TokenNameStringLiteral	bar
,	TokenNameCOMMA	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"mae"	TokenNameStringLiteral	mae
,	TokenNameCOMMA	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"moo"	TokenNameStringLiteral	moo
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
reflectWith	TokenNameIdentifier	 reflect With
(	TokenNameLPAREN	
reflector	TokenNameIdentifier	 reflector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"bar"	TokenNameStringLiteral	bar
,	TokenNameCOMMA	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"mae"	TokenNameStringLiteral	mae
,	TokenNameCOMMA	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"moo"	TokenNameStringLiteral	moo
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
new	TokenNamenew	
TestAttributeImpl2	TokenNameIdentifier	 Test Attribute Impl2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
reflectWith	TokenNameIdentifier	 reflect With
(	TokenNameLPAREN	
reflector	TokenNameIdentifier	 reflector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"TestAttributeImpl2 should fail assertion on toString() parsing"	TokenNameStringLiteral	TestAttributeImpl2 should fail assertion on toString() parsing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
AssertionError	TokenNameIdentifier	 Assertion Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// pass 	TokenNameCOMMENT_LINE	pass 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
