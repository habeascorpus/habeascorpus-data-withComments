package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
vectorhighlight	TokenNameIdentifier	 vectorhighlight
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
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
Analyzer	TokenNameIdentifier	 Analyzer
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
TokenStream	TokenNameIdentifier	 Token Stream
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
Tokenizer	TokenNameIdentifier	 Tokenizer
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
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
BooleanQuery	TokenNameIdentifier	 Boolean Query
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
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
public	TokenNamepublic	
class	TokenNameclass	
IndexTimeSynonymTest	TokenNameIdentifier	 Index Time Synonym Test
extends	TokenNameextends	
AbstractTestCase	TokenNameIdentifier	 Abstract Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFieldTermStackIndex1wSearch1term	TokenNameIdentifier	 test Field Term Stack Index1w Search1term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
makeIndex1w	TokenNameIdentifier	 make Index1w
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldQuery	TokenNameIdentifier	 Field Query
fq	TokenNameIdentifier	 fq
=	TokenNameEQUAL	
new	TokenNamenew	
FieldQuery	TokenNameIdentifier	 Field Query
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"Mac"	TokenNameStringLiteral	Mac
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
new	TokenNamenew	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
termList	TokenNameIdentifier	 term List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Mac(11,20,3)"	TokenNameStringLiteral	Mac(11,20,3)
,	TokenNameCOMMA	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFieldTermStackIndex1wSearch2terms	TokenNameIdentifier	 test Field Term Stack Index1w Search2terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
makeIndex1w	TokenNameIdentifier	 make Index1w
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BooleanQuery	TokenNameIdentifier	 Boolean Query
bq	TokenNameIdentifier	 bq
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bq	TokenNameIdentifier	 bq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"Mac"	TokenNameStringLiteral	Mac
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bq	TokenNameIdentifier	 bq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"MacBook"	TokenNameStringLiteral	MacBook
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldQuery	TokenNameIdentifier	 Field Query
fq	TokenNameIdentifier	 fq
=	TokenNameEQUAL	
new	TokenNamenew	
FieldQuery	TokenNameIdentifier	 Field Query
(	TokenNameLPAREN	
bq	TokenNameIdentifier	 bq
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
new	TokenNamenew	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
termList	TokenNameIdentifier	 term List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
expectedSet	TokenNameIdentifier	 expected Set
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedSet	TokenNameIdentifier	 expected Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"Mac(11,20,3)"	TokenNameStringLiteral	Mac(11,20,3)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedSet	TokenNameIdentifier	 expected Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"MacBook(11,20,3)"	TokenNameStringLiteral	MacBook(11,20,3)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
expectedSet	TokenNameIdentifier	 expected Set
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
expectedSet	TokenNameIdentifier	 expected Set
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFieldTermStackIndex1w2wSearch1term	TokenNameIdentifier	 test Field Term Stack Index1w2w Search1term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
makeIndex1w2w	TokenNameIdentifier	 make Index1w2w
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldQuery	TokenNameIdentifier	 Field Query
fq	TokenNameIdentifier	 fq
=	TokenNameEQUAL	
new	TokenNamenew	
FieldQuery	TokenNameIdentifier	 Field Query
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"pc"	TokenNameStringLiteral	pc
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
new	TokenNamenew	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
termList	TokenNameIdentifier	 term List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"pc(3,5,1)"	TokenNameStringLiteral	pc(3,5,1)
,	TokenNameCOMMA	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFieldTermStackIndex1w2wSearch1phrase	TokenNameIdentifier	 test Field Term Stack Index1w2w Search1phrase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
makeIndex1w2w	TokenNameIdentifier	 make Index1w2w
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldQuery	TokenNameIdentifier	 Field Query
fq	TokenNameIdentifier	 fq
=	TokenNameEQUAL	
new	TokenNamenew	
FieldQuery	TokenNameIdentifier	 Field Query
(	TokenNameLPAREN	
pqF	TokenNameIdentifier	 pq F
(	TokenNameLPAREN	
"personal"	TokenNameStringLiteral	personal
,	TokenNameCOMMA	
"computer"	TokenNameStringLiteral	computer
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
new	TokenNamenew	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
termList	TokenNameIdentifier	 term List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"personal(3,5,1)"	TokenNameStringLiteral	personal(3,5,1)
,	TokenNameCOMMA	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"computer(3,5,2)"	TokenNameStringLiteral	computer(3,5,2)
,	TokenNameCOMMA	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFieldTermStackIndex1w2wSearch1partial	TokenNameIdentifier	 test Field Term Stack Index1w2w Search1partial
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
makeIndex1w2w	TokenNameIdentifier	 make Index1w2w
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldQuery	TokenNameIdentifier	 Field Query
fq	TokenNameIdentifier	 fq
=	TokenNameEQUAL	
new	TokenNamenew	
FieldQuery	TokenNameIdentifier	 Field Query
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"computer"	TokenNameStringLiteral	computer
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
new	TokenNamenew	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
termList	TokenNameIdentifier	 term List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"computer(3,5,2)"	TokenNameStringLiteral	computer(3,5,2)
,	TokenNameCOMMA	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFieldTermStackIndex1w2wSearch1term1phrase	TokenNameIdentifier	 test Field Term Stack Index1w2w Search1term1phrase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
makeIndex1w2w	TokenNameIdentifier	 make Index1w2w
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BooleanQuery	TokenNameIdentifier	 Boolean Query
bq	TokenNameIdentifier	 bq
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bq	TokenNameIdentifier	 bq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"pc"	TokenNameStringLiteral	pc
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bq	TokenNameIdentifier	 bq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
pqF	TokenNameIdentifier	 pq F
(	TokenNameLPAREN	
"personal"	TokenNameStringLiteral	personal
,	TokenNameCOMMA	
"computer"	TokenNameStringLiteral	computer
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldQuery	TokenNameIdentifier	 Field Query
fq	TokenNameIdentifier	 fq
=	TokenNameEQUAL	
new	TokenNamenew	
FieldQuery	TokenNameIdentifier	 Field Query
(	TokenNameLPAREN	
bq	TokenNameIdentifier	 bq
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
new	TokenNamenew	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
termList	TokenNameIdentifier	 term List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
expectedSet	TokenNameIdentifier	 expected Set
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedSet	TokenNameIdentifier	 expected Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"pc(3,5,1)"	TokenNameStringLiteral	pc(3,5,1)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedSet	TokenNameIdentifier	 expected Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"personal(3,5,1)"	TokenNameStringLiteral	personal(3,5,1)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
expectedSet	TokenNameIdentifier	 expected Set
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
expectedSet	TokenNameIdentifier	 expected Set
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"computer(3,5,2)"	TokenNameStringLiteral	computer(3,5,2)
,	TokenNameCOMMA	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFieldTermStackIndex2w1wSearch1term	TokenNameIdentifier	 test Field Term Stack Index2w1w Search1term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
makeIndex2w1w	TokenNameIdentifier	 make Index2w1w
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldQuery	TokenNameIdentifier	 Field Query
fq	TokenNameIdentifier	 fq
=	TokenNameEQUAL	
new	TokenNamenew	
FieldQuery	TokenNameIdentifier	 Field Query
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"pc"	TokenNameStringLiteral	pc
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
new	TokenNamenew	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
termList	TokenNameIdentifier	 term List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"pc(3,20,1)"	TokenNameStringLiteral	pc(3,20,1)
,	TokenNameCOMMA	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFieldTermStackIndex2w1wSearch1phrase	TokenNameIdentifier	 test Field Term Stack Index2w1w Search1phrase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
makeIndex2w1w	TokenNameIdentifier	 make Index2w1w
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldQuery	TokenNameIdentifier	 Field Query
fq	TokenNameIdentifier	 fq
=	TokenNameEQUAL	
new	TokenNamenew	
FieldQuery	TokenNameIdentifier	 Field Query
(	TokenNameLPAREN	
pqF	TokenNameIdentifier	 pq F
(	TokenNameLPAREN	
"personal"	TokenNameStringLiteral	personal
,	TokenNameCOMMA	
"computer"	TokenNameStringLiteral	computer
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
new	TokenNamenew	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
termList	TokenNameIdentifier	 term List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"personal(3,20,1)"	TokenNameStringLiteral	personal(3,20,1)
,	TokenNameCOMMA	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"computer(3,20,2)"	TokenNameStringLiteral	computer(3,20,2)
,	TokenNameCOMMA	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFieldTermStackIndex2w1wSearch1partial	TokenNameIdentifier	 test Field Term Stack Index2w1w Search1partial
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
makeIndex2w1w	TokenNameIdentifier	 make Index2w1w
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldQuery	TokenNameIdentifier	 Field Query
fq	TokenNameIdentifier	 fq
=	TokenNameEQUAL	
new	TokenNamenew	
FieldQuery	TokenNameIdentifier	 Field Query
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"computer"	TokenNameStringLiteral	computer
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
new	TokenNamenew	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
termList	TokenNameIdentifier	 term List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"computer(3,20,2)"	TokenNameStringLiteral	computer(3,20,2)
,	TokenNameCOMMA	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFieldTermStackIndex2w1wSearch1term1phrase	TokenNameIdentifier	 test Field Term Stack Index2w1w Search1term1phrase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
makeIndex2w1w	TokenNameIdentifier	 make Index2w1w
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BooleanQuery	TokenNameIdentifier	 Boolean Query
bq	TokenNameIdentifier	 bq
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bq	TokenNameIdentifier	 bq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"pc"	TokenNameStringLiteral	pc
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bq	TokenNameIdentifier	 bq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
pqF	TokenNameIdentifier	 pq F
(	TokenNameLPAREN	
"personal"	TokenNameStringLiteral	personal
,	TokenNameCOMMA	
"computer"	TokenNameStringLiteral	computer
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldQuery	TokenNameIdentifier	 Field Query
fq	TokenNameIdentifier	 fq
=	TokenNameEQUAL	
new	TokenNamenew	
FieldQuery	TokenNameIdentifier	 Field Query
(	TokenNameLPAREN	
bq	TokenNameIdentifier	 bq
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
new	TokenNamenew	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
termList	TokenNameIdentifier	 term List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
expectedSet	TokenNameIdentifier	 expected Set
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedSet	TokenNameIdentifier	 expected Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"pc(3,20,1)"	TokenNameStringLiteral	pc(3,20,1)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedSet	TokenNameIdentifier	 expected Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"personal(3,20,1)"	TokenNameStringLiteral	personal(3,20,1)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
expectedSet	TokenNameIdentifier	 expected Set
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
expectedSet	TokenNameIdentifier	 expected Set
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"computer(3,20,2)"	TokenNameStringLiteral	computer(3,20,2)
,	TokenNameCOMMA	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFieldPhraseListIndex1w2wSearch1phrase	TokenNameIdentifier	 test Field Phrase List Index1w2w Search1phrase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
makeIndex1w2w	TokenNameIdentifier	 make Index1w2w
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldQuery	TokenNameIdentifier	 Field Query
fq	TokenNameIdentifier	 fq
=	TokenNameEQUAL	
new	TokenNamenew	
FieldQuery	TokenNameIdentifier	 Field Query
(	TokenNameLPAREN	
pqF	TokenNameIdentifier	 pq F
(	TokenNameLPAREN	
"personal"	TokenNameStringLiteral	personal
,	TokenNameCOMMA	
"computer"	TokenNameStringLiteral	computer
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
new	TokenNamenew	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
fpl	TokenNameIdentifier	 fpl
=	TokenNameEQUAL	
new	TokenNamenew	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"personalcomputer(1.0)((3,5))"	TokenNameStringLiteral	personalcomputer(1.0)((3,5))
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getStartOffset	TokenNameIdentifier	 get Start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getEndOffset	TokenNameIdentifier	 get End Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFieldPhraseListIndex1w2wSearch1partial	TokenNameIdentifier	 test Field Phrase List Index1w2w Search1partial
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
makeIndex1w2w	TokenNameIdentifier	 make Index1w2w
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldQuery	TokenNameIdentifier	 Field Query
fq	TokenNameIdentifier	 fq
=	TokenNameEQUAL	
new	TokenNamenew	
FieldQuery	TokenNameIdentifier	 Field Query
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"computer"	TokenNameStringLiteral	computer
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
new	TokenNamenew	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
fpl	TokenNameIdentifier	 fpl
=	TokenNameEQUAL	
new	TokenNamenew	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"computer(1.0)((3,5))"	TokenNameStringLiteral	computer(1.0)((3,5))
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getStartOffset	TokenNameIdentifier	 get Start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getEndOffset	TokenNameIdentifier	 get End Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFieldPhraseListIndex1w2wSearch1term1phrase	TokenNameIdentifier	 test Field Phrase List Index1w2w Search1term1phrase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
makeIndex1w2w	TokenNameIdentifier	 make Index1w2w
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BooleanQuery	TokenNameIdentifier	 Boolean Query
bq	TokenNameIdentifier	 bq
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bq	TokenNameIdentifier	 bq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"pc"	TokenNameStringLiteral	pc
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bq	TokenNameIdentifier	 bq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
pqF	TokenNameIdentifier	 pq F
(	TokenNameLPAREN	
"personal"	TokenNameStringLiteral	personal
,	TokenNameCOMMA	
"computer"	TokenNameStringLiteral	computer
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldQuery	TokenNameIdentifier	 Field Query
fq	TokenNameIdentifier	 fq
=	TokenNameEQUAL	
new	TokenNamenew	
FieldQuery	TokenNameIdentifier	 Field Query
(	TokenNameLPAREN	
bq	TokenNameIdentifier	 bq
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
new	TokenNamenew	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
fpl	TokenNameIdentifier	 fpl
=	TokenNameEQUAL	
new	TokenNamenew	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"(1.0)((3,5))"	TokenNameStringLiteral	(1.0)((3,5))
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getStartOffset	TokenNameIdentifier	 get Start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getEndOffset	TokenNameIdentifier	 get End Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFieldPhraseListIndex2w1wSearch1term	TokenNameIdentifier	 test Field Phrase List Index2w1w Search1term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
makeIndex2w1w	TokenNameIdentifier	 make Index2w1w
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldQuery	TokenNameIdentifier	 Field Query
fq	TokenNameIdentifier	 fq
=	TokenNameEQUAL	
new	TokenNamenew	
FieldQuery	TokenNameIdentifier	 Field Query
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"pc"	TokenNameStringLiteral	pc
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
new	TokenNamenew	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
fpl	TokenNameIdentifier	 fpl
=	TokenNameEQUAL	
new	TokenNamenew	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"pc(1.0)((3,20))"	TokenNameStringLiteral	pc(1.0)((3,20))
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getStartOffset	TokenNameIdentifier	 get Start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getEndOffset	TokenNameIdentifier	 get End Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFieldPhraseListIndex2w1wSearch1phrase	TokenNameIdentifier	 test Field Phrase List Index2w1w Search1phrase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
makeIndex2w1w	TokenNameIdentifier	 make Index2w1w
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldQuery	TokenNameIdentifier	 Field Query
fq	TokenNameIdentifier	 fq
=	TokenNameEQUAL	
new	TokenNamenew	
FieldQuery	TokenNameIdentifier	 Field Query
(	TokenNameLPAREN	
pqF	TokenNameIdentifier	 pq F
(	TokenNameLPAREN	
"personal"	TokenNameStringLiteral	personal
,	TokenNameCOMMA	
"computer"	TokenNameStringLiteral	computer
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
new	TokenNamenew	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
fpl	TokenNameIdentifier	 fpl
=	TokenNameEQUAL	
new	TokenNamenew	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"personalcomputer(1.0)((3,20))"	TokenNameStringLiteral	personalcomputer(1.0)((3,20))
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getStartOffset	TokenNameIdentifier	 get Start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getEndOffset	TokenNameIdentifier	 get End Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFieldPhraseListIndex2w1wSearch1partial	TokenNameIdentifier	 test Field Phrase List Index2w1w Search1partial
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
makeIndex2w1w	TokenNameIdentifier	 make Index2w1w
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldQuery	TokenNameIdentifier	 Field Query
fq	TokenNameIdentifier	 fq
=	TokenNameEQUAL	
new	TokenNamenew	
FieldQuery	TokenNameIdentifier	 Field Query
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"computer"	TokenNameStringLiteral	computer
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
new	TokenNamenew	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
fpl	TokenNameIdentifier	 fpl
=	TokenNameEQUAL	
new	TokenNamenew	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"computer(1.0)((3,20))"	TokenNameStringLiteral	computer(1.0)((3,20))
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getStartOffset	TokenNameIdentifier	 get Start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getEndOffset	TokenNameIdentifier	 get End Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFieldPhraseListIndex2w1wSearch1term1phrase	TokenNameIdentifier	 test Field Phrase List Index2w1w Search1term1phrase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
makeIndex2w1w	TokenNameIdentifier	 make Index2w1w
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BooleanQuery	TokenNameIdentifier	 Boolean Query
bq	TokenNameIdentifier	 bq
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bq	TokenNameIdentifier	 bq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tq	TokenNameIdentifier	 tq
(	TokenNameLPAREN	
"pc"	TokenNameStringLiteral	pc
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bq	TokenNameIdentifier	 bq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
pqF	TokenNameIdentifier	 pq F
(	TokenNameLPAREN	
"personal"	TokenNameStringLiteral	personal
,	TokenNameCOMMA	
"computer"	TokenNameStringLiteral	computer
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldQuery	TokenNameIdentifier	 Field Query
fq	TokenNameIdentifier	 fq
=	TokenNameEQUAL	
new	TokenNamenew	
FieldQuery	TokenNameIdentifier	 Field Query
(	TokenNameLPAREN	
bq	TokenNameIdentifier	 bq
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
new	TokenNamenew	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
F	TokenNameIdentifier	 F
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
fpl	TokenNameIdentifier	 fpl
=	TokenNameEQUAL	
new	TokenNamenew	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
,	TokenNameCOMMA	
fq	TokenNameIdentifier	 fq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"(1.0)((3,20))"	TokenNameStringLiteral	(1.0)((3,20))
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getStartOffset	TokenNameIdentifier	 get Start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fpl	TokenNameIdentifier	 fpl
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getEndOffset	TokenNameIdentifier	 get End Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
makeIndex1w	TokenNameIdentifier	 make Index1w
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// 11111111112 	TokenNameCOMMENT_LINE	11111111112 
// 012345678901234567890 	TokenNameCOMMENT_LINE	012345678901234567890 
// I'll buy a Macintosh 	TokenNameCOMMENT_LINE	I'll buy a Macintosh 
// Mac 	TokenNameCOMMENT_LINE	Mac 
// MacBook 	TokenNameCOMMENT_LINE	MacBook 
// 0 1 2 3 	TokenNameCOMMENT_LINE	0 1 2 3 
makeSynonymIndex	TokenNameIdentifier	 make Synonym Index
(	TokenNameLPAREN	
"I'll buy a Macintosh"	TokenNameStringLiteral	I'll buy a Macintosh
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
(	TokenNameLPAREN	
"I'll"	TokenNameStringLiteral	I'll
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
(	TokenNameLPAREN	
"buy"	TokenNameStringLiteral	buy
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
(	TokenNameLPAREN	
"Macintosh"	TokenNameStringLiteral	Macintosh
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
(	TokenNameLPAREN	
"Mac"	TokenNameStringLiteral	Mac
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
(	TokenNameLPAREN	
"MacBook"	TokenNameStringLiteral	MacBook
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
makeIndex1w2w	TokenNameIdentifier	 make Index1w2w
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// 1111111 	TokenNameCOMMENT_LINE	1111111 
// 01234567890123456 	TokenNameCOMMENT_LINE	01234567890123456 
// My pc was broken 	TokenNameCOMMENT_LINE	My pc was broken 
// personal computer 	TokenNameCOMMENT_LINE	personal computer 
// 0 1 2 3 	TokenNameCOMMENT_LINE	0 1 2 3 
makeSynonymIndex	TokenNameIdentifier	 make Synonym Index
(	TokenNameLPAREN	
"My pc was broken"	TokenNameStringLiteral	My pc was broken
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
(	TokenNameLPAREN	
"My"	TokenNameStringLiteral	My
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
(	TokenNameLPAREN	
"pc"	TokenNameStringLiteral	pc
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
(	TokenNameLPAREN	
"personal"	TokenNameStringLiteral	personal
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
(	TokenNameLPAREN	
"computer"	TokenNameStringLiteral	computer
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
(	TokenNameLPAREN	
"was"	TokenNameStringLiteral	was
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
(	TokenNameLPAREN	
"broken"	TokenNameStringLiteral	broken
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
makeIndex2w1w	TokenNameIdentifier	 make Index2w1w
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// 1111111111222222222233 	TokenNameCOMMENT_LINE	1111111111222222222233 
// 01234567890123456789012345678901 	TokenNameCOMMENT_LINE	01234567890123456789012345678901 
// My personal computer was broken 	TokenNameCOMMENT_LINE	My personal computer was broken 
// pc 	TokenNameCOMMENT_LINE	pc 
// 0 1 2 3 4 	TokenNameCOMMENT_LINE	0 1 2 3 4 
makeSynonymIndex	TokenNameIdentifier	 make Synonym Index
(	TokenNameLPAREN	
"My personal computer was broken"	TokenNameStringLiteral	My personal computer was broken
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
(	TokenNameLPAREN	
"My"	TokenNameStringLiteral	My
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
(	TokenNameLPAREN	
"personal"	TokenNameStringLiteral	personal
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
(	TokenNameLPAREN	
"pc"	TokenNameStringLiteral	pc
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
(	TokenNameLPAREN	
"computer"	TokenNameStringLiteral	computer
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
(	TokenNameLPAREN	
"was"	TokenNameStringLiteral	was
,	TokenNameCOMMA	
21	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
(	TokenNameLPAREN	
"broken"	TokenNameStringLiteral	broken
,	TokenNameCOMMA	
25	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
31	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
makeSynonymIndex	TokenNameIdentifier	 make Synonym Index
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
...	TokenNameELLIPSIS	
tokens	TokenNameIdentifier	 tokens
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Analyzer	TokenNameIdentifier	 Analyzer
analyzer	TokenNameIdentifier	 analyzer
=	TokenNameEQUAL	
new	TokenNamenew	
TokenArrayAnalyzer	TokenNameIdentifier	 Token Array Analyzer
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
make1dmfIndex	TokenNameIdentifier	 make1dmf Index
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Token	TokenNameIdentifier	 Token
t	TokenNameIdentifier	 t
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
int	TokenNameint	
startOffset	TokenNameIdentifier	 start Offset
,	TokenNameCOMMA	
int	TokenNameint	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
t	TokenNameIdentifier	 t
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
startOffset	TokenNameIdentifier	 start Offset
,	TokenNameCOMMA	
endOffset	TokenNameIdentifier	 end Offset
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Token	TokenNameIdentifier	 Token
t	TokenNameIdentifier	 t
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
int	TokenNameint	
startOffset	TokenNameIdentifier	 start Offset
,	TokenNameCOMMA	
int	TokenNameint	
endOffset	TokenNameIdentifier	 end Offset
,	TokenNameCOMMA	
int	TokenNameint	
positionIncrement	TokenNameIdentifier	 position Increment
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Token	TokenNameIdentifier	 Token
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
startOffset	TokenNameIdentifier	 start Offset
,	TokenNameCOMMA	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
setPositionIncrement	TokenNameIdentifier	 set Position Increment
(	TokenNameLPAREN	
positionIncrement	TokenNameIdentifier	 position Increment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
TokenArrayAnalyzer	TokenNameIdentifier	 Token Array Analyzer
extends	TokenNameextends	
Analyzer	TokenNameIdentifier	 Analyzer
{	TokenNameLBRACE	
Token	TokenNameIdentifier	 Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tokens	TokenNameIdentifier	 tokens
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TokenArrayAnalyzer	TokenNameIdentifier	 Token Array Analyzer
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
...	TokenNameELLIPSIS	
tokens	TokenNameIdentifier	 tokens
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
tokens	TokenNameIdentifier	 tokens
=	TokenNameEQUAL	
tokens	TokenNameIdentifier	 tokens
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TokenStream	TokenNameIdentifier	 Token Stream
tokenStream	TokenNameIdentifier	 token Stream
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Tokenizer	TokenNameIdentifier	 Tokenizer
ts	TokenNameIdentifier	 ts
=	TokenNameEQUAL	
new	TokenNamenew	
Tokenizer	TokenNameIdentifier	 Tokenizer
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
TOKEN_ATTRIBUTE_FACTORY	TokenNameIdentifier	 TOKEN  ATTRIBUTE  FACTORY
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
reusableToken	TokenNameIdentifier	 reusable Token
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
)	TokenNameRPAREN	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
>=	TokenNameGREATER_EQUAL	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
clearAttributes	TokenNameIdentifier	 clear Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tokens	TokenNameIdentifier	 tokens
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
.	TokenNameDOT	
copyTo	TokenNameIdentifier	 copy To
(	TokenNameLPAREN	
reusableToken	TokenNameIdentifier	 reusable Token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ts	TokenNameIdentifier	 ts
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
