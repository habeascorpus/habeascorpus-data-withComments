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
types	TokenNameIdentifier	 types
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
Hashtable	TokenNameIdentifier	 Hashtable
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
/** * FilterSet testing * */	TokenNameCOMMENT_JAVADOC	 FilterSet testing 
public	TokenNamepublic	
class	TokenNameclass	
FilterSetTest	TokenNameIdentifier	 Filter Set Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
BUF_SIZE	TokenNameIdentifier	 BUF  SIZE
=	TokenNameEQUAL	
32768	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
FilterSetTest	TokenNameIdentifier	 Filter Set Test
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
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/types/filterset.xml"	TokenNameStringLiteral	src/etc/testcases/types/filterset.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
test1	TokenNameIdentifier	 test1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"test1"	TokenNameStringLiteral	test1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Filterset 1 failed"	TokenNameStringLiteral	Filterset 1 failed
,	TokenNameCOMMA	
compareFiles	TokenNameIdentifier	 compare Files
(	TokenNameLPAREN	
"src/etc/testcases/types/gold/filterset1.txt"	TokenNameStringLiteral	src/etc/testcases/types/gold/filterset1.txt
,	TokenNameCOMMA	
"src/etc/testcases/types/dest1.txt"	TokenNameStringLiteral	src/etc/testcases/types/dest1.txt
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test2	TokenNameIdentifier	 test2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"test2"	TokenNameStringLiteral	test2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Filterset 2 failed"	TokenNameStringLiteral	Filterset 2 failed
,	TokenNameCOMMA	
compareFiles	TokenNameIdentifier	 compare Files
(	TokenNameLPAREN	
"src/etc/testcases/types/gold/filterset2.txt"	TokenNameStringLiteral	src/etc/testcases/types/gold/filterset2.txt
,	TokenNameCOMMA	
"src/etc/testcases/types/dest2.txt"	TokenNameStringLiteral	src/etc/testcases/types/dest2.txt
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test3	TokenNameIdentifier	 test3
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"test3"	TokenNameStringLiteral	test3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Filterset 3 failed"	TokenNameStringLiteral	Filterset 3 failed
,	TokenNameCOMMA	
compareFiles	TokenNameIdentifier	 compare Files
(	TokenNameLPAREN	
"src/etc/testcases/types/gold/filterset3.txt"	TokenNameStringLiteral	src/etc/testcases/types/gold/filterset3.txt
,	TokenNameCOMMA	
"src/etc/testcases/types/dest3.txt"	TokenNameStringLiteral	src/etc/testcases/types/dest3.txt
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This will test the recursive FilterSet. Which means that if * the filter value @test@ contains another filter value, it will * actually resolve. */	TokenNameCOMMENT_JAVADOC	 This will test the recursive FilterSet. Which means that if the filter value @test@ contains another filter value, it will actually resolve. 
public	TokenNamepublic	
void	TokenNamevoid	
testRecursive	TokenNameIdentifier	 test Recursive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
"it works line"	TokenNameStringLiteral	it works line
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
"@test@ line"	TokenNameStringLiteral	@test@ line
;	TokenNameSEMICOLON	
FilterSet	TokenNameIdentifier	 Filter Set
fs	TokenNameIdentifier	 fs
=	TokenNameEQUAL	
new	TokenNamenew	
FilterSet	TokenNameIdentifier	 Filter Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
addFilter	TokenNameIdentifier	 add Filter
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
"@test1@"	TokenNameStringLiteral	@test1@
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
addFilter	TokenNameIdentifier	 add Filter
(	TokenNameLPAREN	
"test1"	TokenNameStringLiteral	test1
,	TokenNameCOMMA	
"@test2@"	TokenNameStringLiteral	@test2@
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
addFilter	TokenNameIdentifier	 add Filter
(	TokenNameLPAREN	
"test2"	TokenNameStringLiteral	test2
,	TokenNameCOMMA	
"it works"	TokenNameStringLiteral	it works
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
setBeginToken	TokenNameIdentifier	 set Begin Token
(	TokenNameLPAREN	
"@"	TokenNameStringLiteral	@
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
setEndToken	TokenNameIdentifier	 set End Token
(	TokenNameLPAREN	
"@"	TokenNameStringLiteral	@
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
replaceTokens	TokenNameIdentifier	 replace Tokens
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test to see what happens when the resolving occurs in an * infinite loop. */	TokenNameCOMMENT_JAVADOC	 Test to see what happens when the resolving occurs in an infinite loop. 
public	TokenNamepublic	
void	TokenNamevoid	
testInfinite	TokenNameIdentifier	 test Infinite
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
"@test@ line testvalue"	TokenNameStringLiteral	@test@ line testvalue
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
"@test@ line @test3@"	TokenNameStringLiteral	@test@ line @test3@
;	TokenNameSEMICOLON	
FilterSet	TokenNameIdentifier	 Filter Set
fs	TokenNameIdentifier	 fs
=	TokenNameEQUAL	
new	TokenNamenew	
FilterSet	TokenNameIdentifier	 Filter Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
addFilter	TokenNameIdentifier	 add Filter
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
"@test1@"	TokenNameStringLiteral	@test1@
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
addFilter	TokenNameIdentifier	 add Filter
(	TokenNameLPAREN	
"test1"	TokenNameStringLiteral	test1
,	TokenNameCOMMA	
"@test2@"	TokenNameStringLiteral	@test2@
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
addFilter	TokenNameIdentifier	 add Filter
(	TokenNameLPAREN	
"test2"	TokenNameStringLiteral	test2
,	TokenNameCOMMA	
"@test@"	TokenNameStringLiteral	@test@
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
addFilter	TokenNameIdentifier	 add Filter
(	TokenNameLPAREN	
"test3"	TokenNameStringLiteral	test3
,	TokenNameCOMMA	
"testvalue"	TokenNameStringLiteral	testvalue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
setBeginToken	TokenNameIdentifier	 set Begin Token
(	TokenNameLPAREN	
"@"	TokenNameStringLiteral	@
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
setEndToken	TokenNameIdentifier	 set End Token
(	TokenNameLPAREN	
"@"	TokenNameStringLiteral	@
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
replaceTokens	TokenNameIdentifier	 replace Tokens
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test to see what happens when the resolving occurs in * what would be an infinite loop, but with recursion disabled. */	TokenNameCOMMENT_JAVADOC	 Test to see what happens when the resolving occurs in what would be an infinite loop, but with recursion disabled. 
public	TokenNamepublic	
void	TokenNamevoid	
testRecursionDisabled	TokenNameIdentifier	 test Recursion Disabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
"@test1@ line testvalue"	TokenNameStringLiteral	@test1@ line testvalue
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
"@test@ line @test2@"	TokenNameStringLiteral	@test@ line @test2@
;	TokenNameSEMICOLON	
FilterSet	TokenNameIdentifier	 Filter Set
fs	TokenNameIdentifier	 fs
=	TokenNameEQUAL	
new	TokenNamenew	
FilterSet	TokenNameIdentifier	 Filter Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
addFilter	TokenNameIdentifier	 add Filter
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
"@test1@"	TokenNameStringLiteral	@test1@
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
addFilter	TokenNameIdentifier	 add Filter
(	TokenNameLPAREN	
"test1"	TokenNameStringLiteral	test1
,	TokenNameCOMMA	
"@test@"	TokenNameStringLiteral	@test@
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
addFilter	TokenNameIdentifier	 add Filter
(	TokenNameLPAREN	
"test2"	TokenNameStringLiteral	test2
,	TokenNameCOMMA	
"testvalue"	TokenNameStringLiteral	testvalue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
setBeginToken	TokenNameIdentifier	 set Begin Token
(	TokenNameLPAREN	
"@"	TokenNameStringLiteral	@
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
setEndToken	TokenNameIdentifier	 set End Token
(	TokenNameLPAREN	
"@"	TokenNameStringLiteral	@
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
setRecurse	TokenNameIdentifier	 set Recurse
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
replaceTokens	TokenNameIdentifier	 replace Tokens
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNonInfiniteRecursiveMultipleOnSingleLine	TokenNameIdentifier	 test Non Infinite Recursive Multiple On Single Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FilterSet	TokenNameIdentifier	 Filter Set
filters	TokenNameIdentifier	 filters
=	TokenNameEQUAL	
new	TokenNamenew	
FilterSet	TokenNameIdentifier	 Filter Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filters	TokenNameIdentifier	 filters
.	TokenNameDOT	
setBeginToken	TokenNameIdentifier	 set Begin Token
(	TokenNameLPAREN	
"<"	TokenNameStringLiteral	<
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filters	TokenNameIdentifier	 filters
.	TokenNameDOT	
setEndToken	TokenNameIdentifier	 set End Token
(	TokenNameLPAREN	
">"	TokenNameStringLiteral	>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filters	TokenNameIdentifier	 filters
.	TokenNameDOT	
addFilter	TokenNameIdentifier	 add Filter
(	TokenNameLPAREN	
"ul"	TokenNameStringLiteral	ul
,	TokenNameCOMMA	
"<itemizedlist>"	TokenNameStringLiteral	<itemizedlist>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filters	TokenNameIdentifier	 filters
.	TokenNameDOT	
addFilter	TokenNameIdentifier	 add Filter
(	TokenNameLPAREN	
"/ul"	TokenNameStringLiteral	/ul
,	TokenNameCOMMA	
"</itemizedList>"	TokenNameStringLiteral	</itemizedList>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filters	TokenNameIdentifier	 filters
.	TokenNameDOT	
addFilter	TokenNameIdentifier	 add Filter
(	TokenNameLPAREN	
"li"	TokenNameStringLiteral	li
,	TokenNameCOMMA	
"<listitem>"	TokenNameStringLiteral	<listitem>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filters	TokenNameIdentifier	 filters
.	TokenNameDOT	
addFilter	TokenNameIdentifier	 add Filter
(	TokenNameLPAREN	
"/li"	TokenNameStringLiteral	/li
,	TokenNameCOMMA	
"</listitem>"	TokenNameStringLiteral	</listitem>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
"<itemizedlist><listitem>Item 1</listitem> <listitem>Item 2</listitem></itemizedList>"	TokenNameStringLiteral	<itemizedlist><listitem>Item 1</listitem> <listitem>Item 2</listitem></itemizedList>
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
"<ul><li>Item 1</li> <li>Item 2</li></ul>"	TokenNameStringLiteral	<ul><li>Item 1</li> <li>Item 2</li></ul>
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
filters	TokenNameIdentifier	 filters
.	TokenNameDOT	
replaceTokens	TokenNameIdentifier	 replace Tokens
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNestedFilterSets	TokenNameIdentifier	 test Nested Filter Sets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"test-nested-filtersets"	TokenNameStringLiteral	test-nested-filtersets
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FilterSet	TokenNameIdentifier	 Filter Set
fs	TokenNameIdentifier	 fs
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FilterSet	TokenNameIdentifier	 Filter Set
)	TokenNameRPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getReference	TokenNameIdentifier	 get Reference
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Hashtable	TokenNameIdentifier	 Hashtable
filters	TokenNameIdentifier	 filters
=	TokenNameEQUAL	
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
getFilterHash	TokenNameIdentifier	 get Filter Hash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
filters	TokenNameIdentifier	 filters
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"value1"	TokenNameStringLiteral	value1
,	TokenNameCOMMA	
filters	TokenNameIdentifier	 filters
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"token1"	TokenNameStringLiteral	token1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fs	TokenNameIdentifier	 fs
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FilterSet	TokenNameIdentifier	 Filter Set
)	TokenNameRPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getReference	TokenNameIdentifier	 get Reference
(	TokenNameLPAREN	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filters	TokenNameIdentifier	 filters
=	TokenNameEQUAL	
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
getFilterHash	TokenNameIdentifier	 get Filter Hash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
filters	TokenNameIdentifier	 filters
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"1111"	TokenNameStringLiteral	1111
,	TokenNameCOMMA	
filters	TokenNameIdentifier	 filters
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"aaaa"	TokenNameStringLiteral	aaaa
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2222"	TokenNameStringLiteral	2222
,	TokenNameCOMMA	
filters	TokenNameIdentifier	 filters
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"bbbb"	TokenNameStringLiteral	bbbb
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fs	TokenNameIdentifier	 fs
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FilterSet	TokenNameIdentifier	 Filter Set
)	TokenNameRPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getReference	TokenNameIdentifier	 get Reference
(	TokenNameLPAREN	
"3"	TokenNameStringLiteral	3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filters	TokenNameIdentifier	 filters
=	TokenNameEQUAL	
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
getFilterHash	TokenNameIdentifier	 get Filter Hash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
filters	TokenNameIdentifier	 filters
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"value4"	TokenNameStringLiteral	value4
,	TokenNameCOMMA	
filters	TokenNameIdentifier	 filters
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"token4"	TokenNameStringLiteral	token4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fs	TokenNameIdentifier	 fs
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FilterSet	TokenNameIdentifier	 Filter Set
)	TokenNameRPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getReference	TokenNameIdentifier	 get Reference
(	TokenNameLPAREN	
"5"	TokenNameStringLiteral	5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filters	TokenNameIdentifier	 filters
=	TokenNameEQUAL	
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
getFilterHash	TokenNameIdentifier	 get Filter Hash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
filters	TokenNameIdentifier	 filters
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"value1"	TokenNameStringLiteral	value1
,	TokenNameCOMMA	
filters	TokenNameIdentifier	 filters
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"token1"	TokenNameStringLiteral	token1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFiltersFileElement	TokenNameIdentifier	 test Filters File Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testFiltersFileElement"	TokenNameStringLiteral	testFiltersFileElement
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFiltersFileAttribute	TokenNameIdentifier	 test Filters File Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testFiltersFileAttribute"	TokenNameStringLiteral	testFiltersFileAttribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMultipleFiltersFiles	TokenNameIdentifier	 test Multiple Filters Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testMultipleFiltersFiles"	TokenNameStringLiteral	testMultipleFiltersFiles
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMissingFiltersFile	TokenNameIdentifier	 test Missing Filters File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectBuildException	TokenNameIdentifier	 expect Build Exception
(	TokenNameLPAREN	
"testMissingFiltersFile"	TokenNameStringLiteral	testMissingFiltersFile
,	TokenNameCOMMA	
"should fail due to missing filtersfile"	TokenNameStringLiteral	should fail due to missing filtersfile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testAllowMissingFiltersFile	TokenNameIdentifier	 test Allow Missing Filters File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeTarget	TokenNameIdentifier	 execute Target
(	TokenNameLPAREN	
"testAllowMissingFiltersFile"	TokenNameStringLiteral	testAllowMissingFiltersFile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
compareFiles	TokenNameIdentifier	 compare Files
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name1	TokenNameIdentifier	 name1
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name2	TokenNameIdentifier	 name2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
file1	TokenNameIdentifier	 file1
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
name1	TokenNameIdentifier	 name1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
file2	TokenNameIdentifier	 file2
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
name2	TokenNameIdentifier	 name2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
file1	TokenNameIdentifier	 file1
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
file2	TokenNameIdentifier	 file2
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"One or both files do not exist:"	TokenNameStringLiteral	One or both files do not exist:
+	TokenNamePLUS	
name1	TokenNameIdentifier	 name1
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
name2	TokenNameIdentifier	 name2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
file1	TokenNameIdentifier	 file1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
file2	TokenNameIdentifier	 file2
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"File size mismatch:"	TokenNameStringLiteral	File size mismatch:
+	TokenNamePLUS	
name1	TokenNameIdentifier	 name1
+	TokenNamePLUS	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
file1	TokenNameIdentifier	 file1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"), "	TokenNameStringLiteral	), 
+	TokenNamePLUS	
name2	TokenNameIdentifier	 name2
+	TokenNamePLUS	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
file2	TokenNameIdentifier	 file2
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// byte - byte compare 	TokenNameCOMMENT_LINE	byte - byte compare 
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer1	TokenNameIdentifier	 buffer1
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
BUF_SIZE	TokenNameIdentifier	 BUF  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer2	TokenNameIdentifier	 buffer2
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
BUF_SIZE	TokenNameIdentifier	 BUF  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
FileInputStream	TokenNameIdentifier	 File Input Stream
fis1	TokenNameIdentifier	 fis1
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
file1	TokenNameIdentifier	 file1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileInputStream	TokenNameIdentifier	 File Input Stream
fis2	TokenNameIdentifier	 fis2
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
file2	TokenNameIdentifier	 file2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
read	TokenNameIdentifier	 read
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
read	TokenNameIdentifier	 read
=	TokenNameEQUAL	
fis1	TokenNameIdentifier	 fis1
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
buffer1	TokenNameIdentifier	 buffer1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fis2	TokenNameIdentifier	 fis2
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
buffer2	TokenNameIdentifier	 buffer2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
read	TokenNameIdentifier	 read
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
++	TokenNamePLUS_PLUS	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
buffer1	TokenNameIdentifier	 buffer1
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
buffer2	TokenNameIdentifier	 buffer2
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Bytes mismatch:"	TokenNameStringLiteral	Bytes mismatch:
+	TokenNamePLUS	
name1	TokenNameIdentifier	 name1
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
name2	TokenNameIdentifier	 name2
+	TokenNamePLUS	
" at byte "	TokenNameStringLiteral	 at byte 
+	TokenNamePLUS	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"IOException comparing files: "	TokenNameStringLiteral	IOException comparing files: 
+	TokenNamePLUS	
name1	TokenNameIdentifier	 name1
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
name2	TokenNameIdentifier	 name2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
