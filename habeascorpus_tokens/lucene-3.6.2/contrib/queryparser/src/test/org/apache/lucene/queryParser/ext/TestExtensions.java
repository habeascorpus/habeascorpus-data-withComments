package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
/** * Testcase for the {@link Extensions} class */	TokenNameCOMMENT_JAVADOC	 Testcase for the {@link Extensions} class 
public	TokenNamepublic	
class	TokenNameclass	
TestExtensions	TokenNameIdentifier	 Test Extensions
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
Extensions	TokenNameIdentifier	 Extensions
ext	TokenNameIdentifier	 ext
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
=	TokenNameEQUAL	
new	TokenNamenew	
Extensions	TokenNameIdentifier	 Extensions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBuildExtensionField	TokenNameIdentifier	 test Build Extension Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"field\:key"	TokenNameStringLiteral	field\:key
,	TokenNameCOMMA	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
buildExtensionField	TokenNameIdentifier	 build Extension Field
(	TokenNameLPAREN	
"key"	TokenNameStringLiteral	key
,	TokenNameCOMMA	
"field"	TokenNameStringLiteral	field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"\:key"	TokenNameStringLiteral	\:key
,	TokenNameCOMMA	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
buildExtensionField	TokenNameIdentifier	 build Extension Field
(	TokenNameLPAREN	
"key"	TokenNameStringLiteral	key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ext	TokenNameIdentifier	 ext
=	TokenNameEQUAL	
new	TokenNamenew	
Extensions	TokenNameIdentifier	 Extensions
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"field.key"	TokenNameStringLiteral	field.key
,	TokenNameCOMMA	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
buildExtensionField	TokenNameIdentifier	 build Extension Field
(	TokenNameLPAREN	
"key"	TokenNameStringLiteral	key
,	TokenNameCOMMA	
"field"	TokenNameStringLiteral	field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
".key"	TokenNameStringLiteral	.key
,	TokenNameCOMMA	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
buildExtensionField	TokenNameIdentifier	 build Extension Field
(	TokenNameLPAREN	
"key"	TokenNameStringLiteral	key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSplitExtensionField	TokenNameIdentifier	 test Split Extension Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"field\:key"	TokenNameStringLiteral	field\:key
,	TokenNameCOMMA	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
buildExtensionField	TokenNameIdentifier	 build Extension Field
(	TokenNameLPAREN	
"key"	TokenNameStringLiteral	key
,	TokenNameCOMMA	
"field"	TokenNameStringLiteral	field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"\:key"	TokenNameStringLiteral	\:key
,	TokenNameCOMMA	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
buildExtensionField	TokenNameIdentifier	 build Extension Field
(	TokenNameLPAREN	
"key"	TokenNameStringLiteral	key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ext	TokenNameIdentifier	 ext
=	TokenNameEQUAL	
new	TokenNamenew	
Extensions	TokenNameIdentifier	 Extensions
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"field.key"	TokenNameStringLiteral	field.key
,	TokenNameCOMMA	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
buildExtensionField	TokenNameIdentifier	 build Extension Field
(	TokenNameLPAREN	
"key"	TokenNameStringLiteral	key
,	TokenNameCOMMA	
"field"	TokenNameStringLiteral	field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
".key"	TokenNameStringLiteral	.key
,	TokenNameCOMMA	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
buildExtensionField	TokenNameIdentifier	 build Extension Field
(	TokenNameLPAREN	
"key"	TokenNameStringLiteral	key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testAddGetExtension	TokenNameIdentifier	 test Add Get Extension
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ParserExtension	TokenNameIdentifier	 Parser Extension
extension	TokenNameIdentifier	 extension
=	TokenNameEQUAL	
new	TokenNamenew	
ExtensionStub	TokenNameIdentifier	 Extension Stub
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
getExtension	TokenNameIdentifier	 get Extension
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
extension	TokenNameIdentifier	 extension
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
extension	TokenNameIdentifier	 extension
,	TokenNameCOMMA	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
getExtension	TokenNameIdentifier	 get Extension
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
getExtension	TokenNameIdentifier	 get Extension
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testGetExtDelimiter	TokenNameIdentifier	 test Get Ext Delimiter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
Extensions	TokenNameIdentifier	 Extensions
.	TokenNameDOT	
DEFAULT_EXTENSION_FIELD_DELIMITER	TokenNameIdentifier	 DEFAULT  EXTENSION  FIELD  DELIMITER
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
getExtensionFieldDelimiter	TokenNameIdentifier	 get Extension Field Delimiter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ext	TokenNameIdentifier	 ext
=	TokenNameEQUAL	
new	TokenNamenew	
Extensions	TokenNameIdentifier	 Extensions
(	TokenNameLPAREN	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
'?'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
getExtensionFieldDelimiter	TokenNameIdentifier	 get Extension Field Delimiter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEscapeExtension	TokenNameIdentifier	 test Escape Extension
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"abc\:\?\{\}\[\]\\\(\)\+\-\!\~"	TokenNameStringLiteral	abc\:\?\{\}\[\]\\\(\)\+\-\!\~
,	TokenNameCOMMA	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
escapeExtensionField	TokenNameIdentifier	 escape Extension Field
(	TokenNameLPAREN	
"abc:?{}[]\()+-!~"	TokenNameStringLiteral	abc:?{}[]\()+-!~
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
escapeExtensionField	TokenNameIdentifier	 escape Extension Field
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"should throw NPE - escape string is null"	TokenNameStringLiteral	should throw NPE - escape string is null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
