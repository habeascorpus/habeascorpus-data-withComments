package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
IndexReader	TokenNameIdentifier	 Index Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
RandomIndexWriter	TokenNameIdentifier	 Random Index Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
Term	TokenNameIdentifier	 Term
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
IndexSearcher	TokenNameIdentifier	 Index Searcher
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
Query	TokenNameIdentifier	 Query
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
ScoreDoc	TokenNameIdentifier	 Score Doc
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
Searcher	TokenNameIdentifier	 Searcher
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
TermQuery	TokenNameIdentifier	 Term Query
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
Directory	TokenNameIdentifier	 Directory
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
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Tests {@link Document} class. */	TokenNameCOMMENT_JAVADOC	 Tests {@link Document} class. 
public	TokenNamepublic	
class	TokenNameclass	
TestDocument	TokenNameIdentifier	 Test Document
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
binaryVal	TokenNameIdentifier	 binary Val
=	TokenNameEQUAL	
"this text will be stored as a byte array in the index"	TokenNameStringLiteral	this text will be stored as a byte array in the index
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
binaryVal2	TokenNameIdentifier	 binary Val2
=	TokenNameEQUAL	
"this text will be also stored as a byte array in the index"	TokenNameStringLiteral	this text will be also stored as a byte array in the index
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
testBinaryField	TokenNameIdentifier	 test Binary Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Fieldable	TokenNameIdentifier	 Fieldable
stringFld	TokenNameIdentifier	 string Fld
=	TokenNameEQUAL	
new	TokenNamenew	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
"string"	TokenNameStringLiteral	string
,	TokenNameCOMMA	
binaryVal	TokenNameIdentifier	 binary Val
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Fieldable	TokenNameIdentifier	 Fieldable
binaryFld	TokenNameIdentifier	 binary Fld
=	TokenNameEQUAL	
new	TokenNamenew	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
"binary"	TokenNameStringLiteral	binary
,	TokenNameCOMMA	
binaryVal	TokenNameIdentifier	 binary Val
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Fieldable	TokenNameIdentifier	 Fieldable
binaryFld2	TokenNameIdentifier	 binary Fld2
=	TokenNameEQUAL	
new	TokenNamenew	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
"binary"	TokenNameStringLiteral	binary
,	TokenNameCOMMA	
binaryVal2	TokenNameIdentifier	 binary Val2
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
stringFld	TokenNameIdentifier	 string Fld
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
binaryFld	TokenNameIdentifier	 binary Fld
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
binaryFld	TokenNameIdentifier	 binary Fld
.	TokenNameDOT	
isBinary	TokenNameIdentifier	 is Binary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
binaryFld	TokenNameIdentifier	 binary Fld
.	TokenNameDOT	
isStored	TokenNameIdentifier	 is Stored
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
binaryFld	TokenNameIdentifier	 binary Fld
.	TokenNameDOT	
isIndexed	TokenNameIdentifier	 is Indexed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
binaryFld	TokenNameIdentifier	 binary Fld
.	TokenNameDOT	
isTokenized	TokenNameIdentifier	 is Tokenized
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
binaryTest	TokenNameIdentifier	 binary Test
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getBinaryValue	TokenNameIdentifier	 get Binary Value
(	TokenNameLPAREN	
"binary"	TokenNameStringLiteral	binary
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
binaryTest	TokenNameIdentifier	 binary Test
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
binaryVal	TokenNameIdentifier	 binary Val
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
stringTest	TokenNameIdentifier	 string Test
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"string"	TokenNameStringLiteral	string
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
binaryTest	TokenNameIdentifier	 binary Test
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
stringTest	TokenNameIdentifier	 string Test
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
binaryFld2	TokenNameIdentifier	 binary Fld2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
binaryTests	TokenNameIdentifier	 binary Tests
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getBinaryValues	TokenNameIdentifier	 get Binary Values
(	TokenNameLPAREN	
"binary"	TokenNameStringLiteral	binary
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
binaryTests	TokenNameIdentifier	 binary Tests
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
binaryTest	TokenNameIdentifier	 binary Test
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
binaryTests	TokenNameIdentifier	 binary Tests
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
binaryTest2	TokenNameIdentifier	 binary Test2
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
binaryTests	TokenNameIdentifier	 binary Tests
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
binaryTest	TokenNameIdentifier	 binary Test
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
binaryTest2	TokenNameIdentifier	 binary Test2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
binaryTest	TokenNameIdentifier	 binary Test
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
binaryVal	TokenNameIdentifier	 binary Val
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
binaryTest2	TokenNameIdentifier	 binary Test2
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
binaryVal2	TokenNameIdentifier	 binary Val2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
removeField	TokenNameIdentifier	 remove Field
(	TokenNameLPAREN	
"string"	TokenNameStringLiteral	string
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
removeFields	TokenNameIdentifier	 remove Fields
(	TokenNameLPAREN	
"binary"	TokenNameStringLiteral	binary
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests {@link Document#removeField(String)} method for a brand new Document * that has not been indexed yet. * * @throws Exception on error */	TokenNameCOMMENT_JAVADOC	 Tests {@link Document#removeField(String)} method for a brand new Document that has not been indexed yet. * @throws Exception on error 
public	TokenNamepublic	
void	TokenNamevoid	
testRemoveForNewDocument	TokenNameIdentifier	 test Remove For New Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
makeDocumentWithFields	TokenNameIdentifier	 make Document With Fields
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
removeFields	TokenNameIdentifier	 remove Fields
(	TokenNameLPAREN	
"keyword"	TokenNameStringLiteral	keyword
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
removeFields	TokenNameIdentifier	 remove Fields
(	TokenNameLPAREN	
"doesnotexists"	TokenNameStringLiteral	doesnotexists
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// removing non-existing fields is 	TokenNameCOMMENT_LINE	removing non-existing fields is 
// siltenlty ignored 	TokenNameCOMMENT_LINE	siltenlty ignored 
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
removeFields	TokenNameIdentifier	 remove Fields
(	TokenNameLPAREN	
"keyword"	TokenNameStringLiteral	keyword
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// removing a field more than once 	TokenNameCOMMENT_LINE	removing a field more than once 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
removeField	TokenNameIdentifier	 remove Field
(	TokenNameLPAREN	
"text"	TokenNameStringLiteral	text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
removeField	TokenNameIdentifier	 remove Field
(	TokenNameLPAREN	
"text"	TokenNameStringLiteral	text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
removeField	TokenNameIdentifier	 remove Field
(	TokenNameLPAREN	
"text"	TokenNameStringLiteral	text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
removeField	TokenNameIdentifier	 remove Field
(	TokenNameLPAREN	
"doesnotexists"	TokenNameStringLiteral	doesnotexists
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// removing non-existing fields is 	TokenNameCOMMENT_LINE	removing non-existing fields is 
// siltenlty ignored 	TokenNameCOMMENT_LINE	siltenlty ignored 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
removeFields	TokenNameIdentifier	 remove Fields
(	TokenNameLPAREN	
"unindexed"	TokenNameStringLiteral	unindexed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
removeFields	TokenNameIdentifier	 remove Fields
(	TokenNameLPAREN	
"unstored"	TokenNameStringLiteral	unstored
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
removeFields	TokenNameIdentifier	 remove Fields
(	TokenNameLPAREN	
"doesnotexists"	TokenNameStringLiteral	doesnotexists
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// removing non-existing fields is 	TokenNameCOMMENT_LINE	removing non-existing fields is 
// siltenlty ignored 	TokenNameCOMMENT_LINE	siltenlty ignored 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testConstructorExceptions	TokenNameIdentifier	 test Constructor Exceptions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
new	TokenNamenew	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
"name"	TokenNameStringLiteral	name
,	TokenNameCOMMA	
"value"	TokenNameStringLiteral	value
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// okay 	TokenNameCOMMENT_LINE	okay 
new	TokenNamenew	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
"name"	TokenNameStringLiteral	name
,	TokenNameCOMMA	
"value"	TokenNameStringLiteral	value
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
NOT_ANALYZED	TokenNameIdentifier	 NOT  ANALYZED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// okay 	TokenNameCOMMENT_LINE	okay 
try	TokenNametry	
{	TokenNameLBRACE	
new	TokenNamenew	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
"name"	TokenNameStringLiteral	name
,	TokenNameCOMMA	
"value"	TokenNameStringLiteral	value
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// expected exception 	TokenNameCOMMENT_LINE	expected exception 
}	TokenNameRBRACE	
new	TokenNamenew	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
"name"	TokenNameStringLiteral	name
,	TokenNameCOMMA	
"value"	TokenNameStringLiteral	value
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
TermVector	TokenNameIdentifier	 Term Vector
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// okay 	TokenNameCOMMENT_LINE	okay 
try	TokenNametry	
{	TokenNameLBRACE	
new	TokenNamenew	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
"name"	TokenNameStringLiteral	name
,	TokenNameCOMMA	
"value"	TokenNameStringLiteral	value
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
TermVector	TokenNameIdentifier	 Term Vector
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// expected exception 	TokenNameCOMMENT_LINE	expected exception 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Tests {@link Document#getValues(String)} method for a brand new Document * that has not been indexed yet. * * @throws Exception on error */	TokenNameCOMMENT_JAVADOC	 Tests {@link Document#getValues(String)} method for a brand new Document that has not been indexed yet. * @throws Exception on error 
public	TokenNamepublic	
void	TokenNamevoid	
testGetValuesForNewDocument	TokenNameIdentifier	 test Get Values For New Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
doAssert	TokenNameIdentifier	 do Assert
(	TokenNameLPAREN	
makeDocumentWithFields	TokenNameIdentifier	 make Document With Fields
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests {@link Document#getValues(String)} method for a Document retrieved * from an index. * * @throws Exception on error */	TokenNameCOMMENT_JAVADOC	 Tests {@link Document#getValues(String)} method for a Document retrieved from an index. * @throws Exception on error 
public	TokenNamepublic	
void	TokenNamevoid	
testGetValuesForIndexedDocument	TokenNameIdentifier	 test Get Values For Indexed Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RandomIndexWriter	TokenNameIdentifier	 Random Index Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
RandomIndexWriter	TokenNameIdentifier	 Random Index Writer
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
makeDocumentWithFields	TokenNameIdentifier	 make Document With Fields
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
getReader	TokenNameIdentifier	 get Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexSearcher	TokenNameIdentifier	 Index Searcher
searcher	TokenNameIdentifier	 searcher
=	TokenNameEQUAL	
newSearcher	TokenNameIdentifier	 new Searcher
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// search for something that does exists 	TokenNameCOMMENT_LINE	search for something that does exists 
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"keyword"	TokenNameStringLiteral	keyword
,	TokenNameCOMMA	
"test1"	TokenNameStringLiteral	test1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ensure that queries return expected results without DateFilter first 	TokenNameCOMMENT_LINE	ensure that queries return expected results without DateFilter first 
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hits	TokenNameIdentifier	 hits
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
hits	TokenNameIdentifier	 hits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doAssert	TokenNameIdentifier	 do Assert
(	TokenNameLPAREN	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
hits	TokenNameIdentifier	 hits
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Document	TokenNameIdentifier	 Document
makeDocumentWithFields	TokenNameIdentifier	 make Document With Fields
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
"keyword"	TokenNameStringLiteral	keyword
,	TokenNameCOMMA	
"test1"	TokenNameStringLiteral	test1
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
NOT_ANALYZED	TokenNameIdentifier	 NOT  ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
"keyword"	TokenNameStringLiteral	keyword
,	TokenNameCOMMA	
"test2"	TokenNameStringLiteral	test2
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
NOT_ANALYZED	TokenNameIdentifier	 NOT  ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
"text"	TokenNameStringLiteral	text
,	TokenNameCOMMA	
"test1"	TokenNameStringLiteral	test1
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
ANALYZED	TokenNameIdentifier	 ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
"text"	TokenNameStringLiteral	text
,	TokenNameCOMMA	
"test2"	TokenNameStringLiteral	test2
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
ANALYZED	TokenNameIdentifier	 ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
"unindexed"	TokenNameStringLiteral	unindexed
,	TokenNameCOMMA	
"test1"	TokenNameStringLiteral	test1
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
"unindexed"	TokenNameStringLiteral	unindexed
,	TokenNameCOMMA	
"test2"	TokenNameStringLiteral	test2
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
"unstored"	TokenNameStringLiteral	unstored
,	TokenNameCOMMA	
"test1"	TokenNameStringLiteral	test1
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
ANALYZED	TokenNameIdentifier	 ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
"unstored"	TokenNameStringLiteral	unstored
,	TokenNameCOMMA	
"test2"	TokenNameStringLiteral	test2
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
ANALYZED	TokenNameIdentifier	 ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
doAssert	TokenNameIdentifier	 do Assert
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
boolean	TokenNameboolean	
fromIndex	TokenNameIdentifier	 from Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
keywordFieldValues	TokenNameIdentifier	 keyword Field Values
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
"keyword"	TokenNameStringLiteral	keyword
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
textFieldValues	TokenNameIdentifier	 text Field Values
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
"text"	TokenNameStringLiteral	text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
unindexedFieldValues	TokenNameIdentifier	 unindexed Field Values
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
"unindexed"	TokenNameStringLiteral	unindexed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
unstoredFieldValues	TokenNameIdentifier	 unstored Field Values
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
"unstored"	TokenNameStringLiteral	unstored
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
keywordFieldValues	TokenNameIdentifier	 keyword Field Values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
textFieldValues	TokenNameIdentifier	 text Field Values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
unindexedFieldValues	TokenNameIdentifier	 unindexed Field Values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// this test cannot work for documents retrieved from the index 	TokenNameCOMMENT_LINE	this test cannot work for documents retrieved from the index 
// since unstored fields will obviously not be returned 	TokenNameCOMMENT_LINE	since unstored fields will obviously not be returned 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fromIndex	TokenNameIdentifier	 from Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
unstoredFieldValues	TokenNameIdentifier	 unstored Field Values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
keywordFieldValues	TokenNameIdentifier	 keyword Field Values
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"test1"	TokenNameStringLiteral	test1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
keywordFieldValues	TokenNameIdentifier	 keyword Field Values
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"test2"	TokenNameStringLiteral	test2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
textFieldValues	TokenNameIdentifier	 text Field Values
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"test1"	TokenNameStringLiteral	test1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
textFieldValues	TokenNameIdentifier	 text Field Values
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"test2"	TokenNameStringLiteral	test2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
unindexedFieldValues	TokenNameIdentifier	 unindexed Field Values
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"test1"	TokenNameStringLiteral	test1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
unindexedFieldValues	TokenNameIdentifier	 unindexed Field Values
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"test2"	TokenNameStringLiteral	test2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// this test cannot work for documents retrieved from the index 	TokenNameCOMMENT_LINE	this test cannot work for documents retrieved from the index 
// since unstored fields will obviously not be returned 	TokenNameCOMMENT_LINE	since unstored fields will obviously not be returned 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fromIndex	TokenNameIdentifier	 from Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
unstoredFieldValues	TokenNameIdentifier	 unstored Field Values
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"test1"	TokenNameStringLiteral	test1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
unstoredFieldValues	TokenNameIdentifier	 unstored Field Values
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"test2"	TokenNameStringLiteral	test2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFieldSetValue	TokenNameIdentifier	 test Field Set Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Field	TokenNameIdentifier	 Field
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
new	TokenNamenew	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
"id1"	TokenNameStringLiteral	id1
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
NOT_ANALYZED	TokenNameIdentifier	 NOT  ANALYZED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
"keyword"	TokenNameStringLiteral	keyword
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
NOT_ANALYZED	TokenNameIdentifier	 NOT  ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RandomIndexWriter	TokenNameIdentifier	 Random Index Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
RandomIndexWriter	TokenNameIdentifier	 Random Index Writer
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"id2"	TokenNameStringLiteral	id2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"id3"	TokenNameStringLiteral	id3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
getReader	TokenNameIdentifier	 get Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexSearcher	TokenNameIdentifier	 Index Searcher
searcher	TokenNameIdentifier	 searcher
=	TokenNameEQUAL	
newSearcher	TokenNameIdentifier	 new Searcher
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"keyword"	TokenNameStringLiteral	keyword
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ensure that queries return expected results without DateFilter first 	TokenNameCOMMENT_LINE	ensure that queries return expected results without DateFilter first 
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hits	TokenNameIdentifier	 hits
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
hits	TokenNameIdentifier	 hits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
doc2	TokenNameIdentifier	 doc2
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
hits	TokenNameIdentifier	 hits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Field	TokenNameIdentifier	 Field
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
doc2	TokenNameIdentifier	 doc2
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
"id"	TokenNameStringLiteral	id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
stringValue	TokenNameIdentifier	 string Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"id1"	TokenNameStringLiteral	id1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
|=	TokenNameOR_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
stringValue	TokenNameIdentifier	 string Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"id2"	TokenNameStringLiteral	id2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
|=	TokenNameOR_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
stringValue	TokenNameIdentifier	 string Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"id3"	TokenNameStringLiteral	id3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
|=	TokenNameOR_EQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"unexpected id field"	TokenNameStringLiteral	unexpected id field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"did not see all IDs"	TokenNameStringLiteral	did not see all IDs
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFieldSetValueChangeBinary	TokenNameIdentifier	 test Field Set Value Change Binary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Field	TokenNameIdentifier	 Field
field1	TokenNameIdentifier	 field1
=	TokenNameEQUAL	
new	TokenNamenew	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
"field1"	TokenNameStringLiteral	field1
,	TokenNameCOMMA	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Field	TokenNameIdentifier	 Field
field2	TokenNameIdentifier	 field2
=	TokenNameEQUAL	
new	TokenNamenew	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
"field2"	TokenNameStringLiteral	field2
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
ANALYZED	TokenNameIdentifier	 ANALYZED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
field1	TokenNameIdentifier	 field1
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
"abc"	TokenNameStringLiteral	abc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"did not hit expected exception"	TokenNameStringLiteral	did not hit expected exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
iae	TokenNameIdentifier	 iae
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// expected 	TokenNameCOMMENT_LINE	expected 
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
field2	TokenNameIdentifier	 field2
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"did not hit expected exception"	TokenNameStringLiteral	did not hit expected exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
iae	TokenNameIdentifier	 iae
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// expected 	TokenNameCOMMENT_LINE	expected 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
