package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
tokenattributes	TokenNameIdentifier	 tokenattributes
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
Payload	TokenNameIdentifier	 Payload
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
AttributeSource	TokenNameIdentifier	 Attribute Source
.	TokenNameDOT	
AttributeFactory	TokenNameIdentifier	 Attribute Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
_TestUtil	TokenNameIdentifier	 Test Util
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
TestSimpleAttributeImpls	TokenNameIdentifier	 Test Simple Attribute Impls
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFlagsAttribute	TokenNameIdentifier	 test Flags Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
FlagsAttributeImpl	TokenNameIdentifier	 Flags Attribute Impl
att	TokenNameIdentifier	 att
=	TokenNameEQUAL	
new	TokenNamenew	
FlagsAttributeImpl	TokenNameIdentifier	 Flags Attribute Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
att	TokenNameIdentifier	 att
.	TokenNameDOT	
getFlags	TokenNameIdentifier	 get Flags
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
att	TokenNameIdentifier	 att
.	TokenNameDOT	
setFlags	TokenNameIdentifier	 set Flags
(	TokenNameLPAREN	
1234	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"flags=1234"	TokenNameStringLiteral	flags=1234
,	TokenNameCOMMA	
att	TokenNameIdentifier	 att
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FlagsAttributeImpl	TokenNameIdentifier	 Flags Attribute Impl
att2	TokenNameIdentifier	 att2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FlagsAttributeImpl	TokenNameIdentifier	 Flags Attribute Impl
)	TokenNameRPAREN	
assertCloneIsEqual	TokenNameIdentifier	 assert Clone Is Equal
(	TokenNameLPAREN	
att	TokenNameIdentifier	 att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1234	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
att2	TokenNameIdentifier	 att2
.	TokenNameDOT	
getFlags	TokenNameIdentifier	 get Flags
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
att2	TokenNameIdentifier	 att2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FlagsAttributeImpl	TokenNameIdentifier	 Flags Attribute Impl
)	TokenNameRPAREN	
assertCopyIsEqual	TokenNameIdentifier	 assert Copy Is Equal
(	TokenNameLPAREN	
att	TokenNameIdentifier	 att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1234	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
att2	TokenNameIdentifier	 att2
.	TokenNameDOT	
getFlags	TokenNameIdentifier	 get Flags
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
att	TokenNameIdentifier	 att
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
att	TokenNameIdentifier	 att
.	TokenNameDOT	
getFlags	TokenNameIdentifier	 get Flags
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
assertAttributeReflection	TokenNameIdentifier	 assert Attribute Reflection
(	TokenNameLPAREN	
att	TokenNameIdentifier	 att
,	TokenNameCOMMA	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
singletonMap	TokenNameIdentifier	 singleton Map
(	TokenNameLPAREN	
FlagsAttribute	TokenNameIdentifier	 Flags Attribute
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"#flags"	TokenNameStringLiteral	#flags
,	TokenNameCOMMA	
att	TokenNameIdentifier	 att
.	TokenNameDOT	
getFlags	TokenNameIdentifier	 get Flags
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPositionIncrementAttribute	TokenNameIdentifier	 test Position Increment Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
PositionIncrementAttributeImpl	TokenNameIdentifier	 Position Increment Attribute Impl
att	TokenNameIdentifier	 att
=	TokenNameEQUAL	
new	TokenNamenew	
PositionIncrementAttributeImpl	TokenNameIdentifier	 Position Increment Attribute Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
att	TokenNameIdentifier	 att
.	TokenNameDOT	
getPositionIncrement	TokenNameIdentifier	 get Position Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
att	TokenNameIdentifier	 att
.	TokenNameDOT	
setPositionIncrement	TokenNameIdentifier	 set Position Increment
(	TokenNameLPAREN	
1234	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"positionIncrement=1234"	TokenNameStringLiteral	positionIncrement=1234
,	TokenNameCOMMA	
att	TokenNameIdentifier	 att
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PositionIncrementAttributeImpl	TokenNameIdentifier	 Position Increment Attribute Impl
att2	TokenNameIdentifier	 att2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PositionIncrementAttributeImpl	TokenNameIdentifier	 Position Increment Attribute Impl
)	TokenNameRPAREN	
assertCloneIsEqual	TokenNameIdentifier	 assert Clone Is Equal
(	TokenNameLPAREN	
att	TokenNameIdentifier	 att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1234	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
att2	TokenNameIdentifier	 att2
.	TokenNameDOT	
getPositionIncrement	TokenNameIdentifier	 get Position Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
att2	TokenNameIdentifier	 att2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PositionIncrementAttributeImpl	TokenNameIdentifier	 Position Increment Attribute Impl
)	TokenNameRPAREN	
assertCopyIsEqual	TokenNameIdentifier	 assert Copy Is Equal
(	TokenNameLPAREN	
att	TokenNameIdentifier	 att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1234	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
att2	TokenNameIdentifier	 att2
.	TokenNameDOT	
getPositionIncrement	TokenNameIdentifier	 get Position Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
att	TokenNameIdentifier	 att
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
att	TokenNameIdentifier	 att
.	TokenNameDOT	
getPositionIncrement	TokenNameIdentifier	 get Position Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
assertAttributeReflection	TokenNameIdentifier	 assert Attribute Reflection
(	TokenNameLPAREN	
att	TokenNameIdentifier	 att
,	TokenNameCOMMA	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
singletonMap	TokenNameIdentifier	 singleton Map
(	TokenNameLPAREN	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"#positionIncrement"	TokenNameStringLiteral	#positionIncrement
,	TokenNameCOMMA	
att	TokenNameIdentifier	 att
.	TokenNameDOT	
getPositionIncrement	TokenNameIdentifier	 get Position Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTypeAttribute	TokenNameIdentifier	 test Type Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
TypeAttributeImpl	TokenNameIdentifier	 Type Attribute Impl
att	TokenNameIdentifier	 att
=	TokenNameEQUAL	
new	TokenNamenew	
TypeAttributeImpl	TokenNameIdentifier	 Type Attribute Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
TypeAttribute	TokenNameIdentifier	 Type Attribute
.	TokenNameDOT	
DEFAULT_TYPE	TokenNameIdentifier	 DEFAULT  TYPE
,	TokenNameCOMMA	
att	TokenNameIdentifier	 att
.	TokenNameDOT	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
att	TokenNameIdentifier	 att
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
"hallo"	TokenNameStringLiteral	hallo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"type=hallo"	TokenNameStringLiteral	type=hallo
,	TokenNameCOMMA	
att	TokenNameIdentifier	 att
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TypeAttributeImpl	TokenNameIdentifier	 Type Attribute Impl
att2	TokenNameIdentifier	 att2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TypeAttributeImpl	TokenNameIdentifier	 Type Attribute Impl
)	TokenNameRPAREN	
assertCloneIsEqual	TokenNameIdentifier	 assert Clone Is Equal
(	TokenNameLPAREN	
att	TokenNameIdentifier	 att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"hallo"	TokenNameStringLiteral	hallo
,	TokenNameCOMMA	
att2	TokenNameIdentifier	 att2
.	TokenNameDOT	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
att2	TokenNameIdentifier	 att2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TypeAttributeImpl	TokenNameIdentifier	 Type Attribute Impl
)	TokenNameRPAREN	
assertCopyIsEqual	TokenNameIdentifier	 assert Copy Is Equal
(	TokenNameLPAREN	
att	TokenNameIdentifier	 att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"hallo"	TokenNameStringLiteral	hallo
,	TokenNameCOMMA	
att2	TokenNameIdentifier	 att2
.	TokenNameDOT	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
att	TokenNameIdentifier	 att
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
TypeAttribute	TokenNameIdentifier	 Type Attribute
.	TokenNameDOT	
DEFAULT_TYPE	TokenNameIdentifier	 DEFAULT  TYPE
,	TokenNameCOMMA	
att	TokenNameIdentifier	 att
.	TokenNameDOT	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
assertAttributeReflection	TokenNameIdentifier	 assert Attribute Reflection
(	TokenNameLPAREN	
att	TokenNameIdentifier	 att
,	TokenNameCOMMA	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
singletonMap	TokenNameIdentifier	 singleton Map
(	TokenNameLPAREN	
TypeAttribute	TokenNameIdentifier	 Type Attribute
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"#type"	TokenNameStringLiteral	#type
,	TokenNameCOMMA	
att	TokenNameIdentifier	 att
.	TokenNameDOT	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPayloadAttribute	TokenNameIdentifier	 test Payload Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
PayloadAttributeImpl	TokenNameIdentifier	 Payload Attribute Impl
att	TokenNameIdentifier	 att
=	TokenNameEQUAL	
new	TokenNamenew	
PayloadAttributeImpl	TokenNameIdentifier	 Payload Attribute Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
att	TokenNameIdentifier	 att
.	TokenNameDOT	
getPayload	TokenNameIdentifier	 get Payload
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Payload	TokenNameIdentifier	 Payload
pl	TokenNameIdentifier	 pl
=	TokenNameEQUAL	
new	TokenNamenew	
Payload	TokenNameIdentifier	 Payload
(	TokenNameLPAREN	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
att	TokenNameIdentifier	 att
.	TokenNameDOT	
setPayload	TokenNameIdentifier	 set Payload
(	TokenNameLPAREN	
pl	TokenNameIdentifier	 pl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
assertAttributeReflection	TokenNameIdentifier	 assert Attribute Reflection
(	TokenNameLPAREN	
att	TokenNameIdentifier	 att
,	TokenNameCOMMA	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
singletonMap	TokenNameIdentifier	 singleton Map
(	TokenNameLPAREN	
PayloadAttribute	TokenNameIdentifier	 Payload Attribute
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"#payload"	TokenNameStringLiteral	#payload
,	TokenNameCOMMA	
pl	TokenNameIdentifier	 pl
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PayloadAttributeImpl	TokenNameIdentifier	 Payload Attribute Impl
att2	TokenNameIdentifier	 att2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PayloadAttributeImpl	TokenNameIdentifier	 Payload Attribute Impl
)	TokenNameRPAREN	
assertCloneIsEqual	TokenNameIdentifier	 assert Clone Is Equal
(	TokenNameLPAREN	
att	TokenNameIdentifier	 att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
pl	TokenNameIdentifier	 pl
,	TokenNameCOMMA	
att2	TokenNameIdentifier	 att2
.	TokenNameDOT	
getPayload	TokenNameIdentifier	 get Payload
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotSame	TokenNameIdentifier	 assert Not Same
(	TokenNameLPAREN	
pl	TokenNameIdentifier	 pl
,	TokenNameCOMMA	
att2	TokenNameIdentifier	 att2
.	TokenNameDOT	
getPayload	TokenNameIdentifier	 get Payload
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
att2	TokenNameIdentifier	 att2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PayloadAttributeImpl	TokenNameIdentifier	 Payload Attribute Impl
)	TokenNameRPAREN	
assertCopyIsEqual	TokenNameIdentifier	 assert Copy Is Equal
(	TokenNameLPAREN	
att	TokenNameIdentifier	 att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
pl	TokenNameIdentifier	 pl
,	TokenNameCOMMA	
att2	TokenNameIdentifier	 att2
.	TokenNameDOT	
getPayload	TokenNameIdentifier	 get Payload
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotSame	TokenNameIdentifier	 assert Not Same
(	TokenNameLPAREN	
pl	TokenNameIdentifier	 pl
,	TokenNameCOMMA	
att2	TokenNameIdentifier	 att2
.	TokenNameDOT	
getPayload	TokenNameIdentifier	 get Payload
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
att	TokenNameIdentifier	 att
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
att	TokenNameIdentifier	 att
.	TokenNameDOT	
getPayload	TokenNameIdentifier	 get Payload
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testOffsetAttribute	TokenNameIdentifier	 test Offset Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
OffsetAttributeImpl	TokenNameIdentifier	 Offset Attribute Impl
att	TokenNameIdentifier	 att
=	TokenNameEQUAL	
new	TokenNamenew	
OffsetAttributeImpl	TokenNameIdentifier	 Offset Attribute Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
att	TokenNameIdentifier	 att
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
att	TokenNameIdentifier	 att
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
att	TokenNameIdentifier	 att
.	TokenNameDOT	
setOffset	TokenNameIdentifier	 set Offset
(	TokenNameLPAREN	
12	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
34	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// no string test here, because order unknown 	TokenNameCOMMENT_LINE	no string test here, because order unknown 
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
assertAttributeReflection	TokenNameIdentifier	 assert Attribute Reflection
(	TokenNameLPAREN	
att	TokenNameIdentifier	 att
,	TokenNameCOMMA	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"#startOffset"	TokenNameStringLiteral	#startOffset
,	TokenNameCOMMA	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"#endOffset"	TokenNameStringLiteral	#endOffset
,	TokenNameCOMMA	
34	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
OffsetAttributeImpl	TokenNameIdentifier	 Offset Attribute Impl
att2	TokenNameIdentifier	 att2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
OffsetAttributeImpl	TokenNameIdentifier	 Offset Attribute Impl
)	TokenNameRPAREN	
assertCloneIsEqual	TokenNameIdentifier	 assert Clone Is Equal
(	TokenNameLPAREN	
att	TokenNameIdentifier	 att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
12	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
att2	TokenNameIdentifier	 att2
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
34	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
att2	TokenNameIdentifier	 att2
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
att2	TokenNameIdentifier	 att2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
OffsetAttributeImpl	TokenNameIdentifier	 Offset Attribute Impl
)	TokenNameRPAREN	
assertCopyIsEqual	TokenNameIdentifier	 assert Copy Is Equal
(	TokenNameLPAREN	
att	TokenNameIdentifier	 att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
12	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
att2	TokenNameIdentifier	 att2
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
34	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
att2	TokenNameIdentifier	 att2
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
att	TokenNameIdentifier	 att
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
att	TokenNameIdentifier	 att
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
att	TokenNameIdentifier	 att
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testKeywordAttribute	TokenNameIdentifier	 test Keyword Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
attrImpl	TokenNameIdentifier	 attr Impl
=	TokenNameEQUAL	
AttributeFactory	TokenNameIdentifier	 Attribute Factory
.	TokenNameDOT	
DEFAULT_ATTRIBUTE_FACTORY	TokenNameIdentifier	 DEFAULT  ATTRIBUTE  FACTORY
.	TokenNameDOT	
createAttributeInstance	TokenNameIdentifier	 create Attribute Instance
(	TokenNameLPAREN	
KeywordAttribute	TokenNameIdentifier	 Keyword Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
KeywordAttributeImpl	TokenNameIdentifier	 Keyword Attribute Impl
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
attrImpl	TokenNameIdentifier	 attr Impl
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
KeywordAttributeImpl	TokenNameIdentifier	 Keyword Attribute Impl
att	TokenNameIdentifier	 att
=	TokenNameEQUAL	
(	TokenNameLPAREN	
KeywordAttributeImpl	TokenNameIdentifier	 Keyword Attribute Impl
)	TokenNameRPAREN	
attrImpl	TokenNameIdentifier	 attr Impl
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
att	TokenNameIdentifier	 att
.	TokenNameDOT	
isKeyword	TokenNameIdentifier	 is Keyword
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
att	TokenNameIdentifier	 att
.	TokenNameDOT	
setKeyword	TokenNameIdentifier	 set Keyword
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
att	TokenNameIdentifier	 att
.	TokenNameDOT	
isKeyword	TokenNameIdentifier	 is Keyword
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
KeywordAttributeImpl	TokenNameIdentifier	 Keyword Attribute Impl
assertCloneIsEqual	TokenNameIdentifier	 assert Clone Is Equal
=	TokenNameEQUAL	
(	TokenNameLPAREN	
KeywordAttributeImpl	TokenNameIdentifier	 Keyword Attribute Impl
)	TokenNameRPAREN	
assertCloneIsEqual	TokenNameIdentifier	 assert Clone Is Equal
(	TokenNameLPAREN	
att	TokenNameIdentifier	 att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
assertCloneIsEqual	TokenNameIdentifier	 assert Clone Is Equal
.	TokenNameDOT	
isKeyword	TokenNameIdentifier	 is Keyword
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertCloneIsEqual	TokenNameIdentifier	 assert Clone Is Equal
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
assertCloneIsEqual	TokenNameIdentifier	 assert Clone Is Equal
.	TokenNameDOT	
isKeyword	TokenNameIdentifier	 is Keyword
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
att	TokenNameIdentifier	 att
.	TokenNameDOT	
isKeyword	TokenNameIdentifier	 is Keyword
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
att	TokenNameIdentifier	 att
.	TokenNameDOT	
copyTo	TokenNameIdentifier	 copy To
(	TokenNameLPAREN	
assertCloneIsEqual	TokenNameIdentifier	 assert Clone Is Equal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
assertCloneIsEqual	TokenNameIdentifier	 assert Clone Is Equal
.	TokenNameDOT	
isKeyword	TokenNameIdentifier	 is Keyword
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
att	TokenNameIdentifier	 att
.	TokenNameDOT	
isKeyword	TokenNameIdentifier	 is Keyword
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
assertAttributeReflection	TokenNameIdentifier	 assert Attribute Reflection
(	TokenNameLPAREN	
att	TokenNameIdentifier	 att
,	TokenNameCOMMA	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
singletonMap	TokenNameIdentifier	 singleton Map
(	TokenNameLPAREN	
KeywordAttribute	TokenNameIdentifier	 Keyword Attribute
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"#keyword"	TokenNameStringLiteral	#keyword
,	TokenNameCOMMA	
att	TokenNameIdentifier	 att
.	TokenNameDOT	
isKeyword	TokenNameIdentifier	 is Keyword
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
assertCloneIsEqual	TokenNameIdentifier	 assert Clone Is Equal
(	TokenNameLPAREN	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
att	TokenNameIdentifier	 att
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
)	TokenNameRPAREN	
att	TokenNameIdentifier	 att
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Clone must be equal"	TokenNameStringLiteral	Clone must be equal
,	TokenNameCOMMA	
att	TokenNameIdentifier	 att
,	TokenNameCOMMA	
clone	TokenNameIdentifier	 clone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Clone's hashcode must be equal"	TokenNameStringLiteral	Clone's hashcode must be equal
,	TokenNameCOMMA	
att	TokenNameIdentifier	 att
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
assertCopyIsEqual	TokenNameIdentifier	 assert Copy Is Equal
(	TokenNameLPAREN	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
att	TokenNameIdentifier	 att
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
copy	TokenNameIdentifier	 copy
=	TokenNameEQUAL	
att	TokenNameIdentifier	 att
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
att	TokenNameIdentifier	 att
.	TokenNameDOT	
copyTo	TokenNameIdentifier	 copy To
(	TokenNameLPAREN	
copy	TokenNameIdentifier	 copy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Copied instance must be equal"	TokenNameStringLiteral	Copied instance must be equal
,	TokenNameCOMMA	
att	TokenNameIdentifier	 att
,	TokenNameCOMMA	
copy	TokenNameIdentifier	 copy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Copied instance's hashcode must be equal"	TokenNameStringLiteral	Copied instance's hashcode must be equal
,	TokenNameCOMMA	
att	TokenNameIdentifier	 att
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
return	TokenNamereturn	
copy	TokenNameIdentifier	 copy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
