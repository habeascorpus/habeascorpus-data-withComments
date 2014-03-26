/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestCloseableThreadLocal	TokenNameIdentifier	 Test Closeable Thread Local
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TEST_VALUE	TokenNameIdentifier	 TEST  VALUE
=	TokenNameEQUAL	
"initvaluetest"	TokenNameStringLiteral	initvaluetest
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
testInitValue	TokenNameIdentifier	 test Init Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
InitValueThreadLocal	TokenNameIdentifier	 Init Value Thread Local
tl	TokenNameIdentifier	 tl
=	TokenNameEQUAL	
new	TokenNamenew	
InitValueThreadLocal	TokenNameIdentifier	 Init Value Thread Local
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
tl	TokenNameIdentifier	 tl
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
TEST_VALUE	TokenNameIdentifier	 TEST  VALUE
,	TokenNameCOMMA	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNullValue	TokenNameIdentifier	 test Null Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// Tests that null can be set as a valid value (LUCENE-1805). This 	TokenNameCOMMENT_LINE	Tests that null can be set as a valid value (LUCENE-1805). This 
// previously failed in get(). 	TokenNameCOMMENT_LINE	previously failed in get(). 
CloseableThreadLocal	TokenNameIdentifier	 Closeable Thread Local
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
ctl	TokenNameIdentifier	 ctl
=	TokenNameEQUAL	
new	TokenNamenew	
CloseableThreadLocal	TokenNameIdentifier	 Closeable Thread Local
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ctl	TokenNameIdentifier	 ctl
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
ctl	TokenNameIdentifier	 ctl
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDefaultValueWithoutSetting	TokenNameIdentifier	 test Default Value Without Setting
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// LUCENE-1805: make sure default get returns null, 	TokenNameCOMMENT_LINE	LUCENE-1805: make sure default get returns null, 
// twice in a row 	TokenNameCOMMENT_LINE	twice in a row 
CloseableThreadLocal	TokenNameIdentifier	 Closeable Thread Local
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
ctl	TokenNameIdentifier	 ctl
=	TokenNameEQUAL	
new	TokenNamenew	
CloseableThreadLocal	TokenNameIdentifier	 Closeable Thread Local
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
ctl	TokenNameIdentifier	 ctl
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
class	TokenNameclass	
InitValueThreadLocal	TokenNameIdentifier	 Init Value Thread Local
extends	TokenNameextends	
CloseableThreadLocal	TokenNameIdentifier	 Closeable Thread Local
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
initialValue	TokenNameIdentifier	 initial Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
TEST_VALUE	TokenNameIdentifier	 TEST  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
