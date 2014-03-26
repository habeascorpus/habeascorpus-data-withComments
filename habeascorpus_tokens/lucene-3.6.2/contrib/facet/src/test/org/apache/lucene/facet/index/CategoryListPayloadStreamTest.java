package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
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
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
CategoryListPayloadStream	TokenNameIdentifier	 Category List Payload Stream
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
encoding	TokenNameIdentifier	 encoding
.	TokenNameDOT	
DGapIntDecoder	TokenNameIdentifier	 D Gap Int Decoder
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
encoding	TokenNameIdentifier	 encoding
.	TokenNameDOT	
DGapIntEncoder	TokenNameIdentifier	 D Gap Int Encoder
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
encoding	TokenNameIdentifier	 encoding
.	TokenNameDOT	
IntDecoder	TokenNameIdentifier	 Int Decoder
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
encoding	TokenNameIdentifier	 encoding
.	TokenNameDOT	
NOnesIntDecoder	TokenNameIdentifier	 N Ones Int Decoder
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
encoding	TokenNameIdentifier	 encoding
.	TokenNameDOT	
NOnesIntEncoder	TokenNameIdentifier	 N Ones Int Encoder
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
encoding	TokenNameIdentifier	 encoding
.	TokenNameDOT	
UniqueValuesIntEncoder	TokenNameIdentifier	 Unique Values Int Encoder
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
public	TokenNamepublic	
class	TokenNameclass	
CategoryListPayloadStreamTest	TokenNameIdentifier	 Category List Payload Stream Test
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
/** * Verifies that a CategoryListPayloadStream can properly encode values into * a byte stream for later constructing a Payload. */	TokenNameCOMMENT_JAVADOC	 Verifies that a CategoryListPayloadStream can properly encode values into a byte stream for later constructing a Payload. 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testStream	TokenNameIdentifier	 test Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
CategoryListPayloadStream	TokenNameIdentifier	 Category List Payload Stream
clps	TokenNameIdentifier	 clps
=	TokenNameEQUAL	
new	TokenNamenew	
CategoryListPayloadStream	TokenNameIdentifier	 Category List Payload Stream
(	TokenNameLPAREN	
new	TokenNamenew	
UniqueValuesIntEncoder	TokenNameIdentifier	 Unique Values Int Encoder
(	TokenNameLPAREN	
new	TokenNamenew	
DGapIntEncoder	TokenNameIdentifier	 D Gap Int Encoder
(	TokenNameLPAREN	
new	TokenNamenew	
NOnesIntEncoder	TokenNameIdentifier	 N Ones Int Encoder
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clps	TokenNameIdentifier	 clps
.	TokenNameDOT	
appendIntToStream	TokenNameIdentifier	 append Int To Stream
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clps	TokenNameIdentifier	 clps
.	TokenNameDOT	
appendIntToStream	TokenNameIdentifier	 append Int To Stream
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clps	TokenNameIdentifier	 clps
.	TokenNameDOT	
appendIntToStream	TokenNameIdentifier	 append Int To Stream
(	TokenNameLPAREN	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clps	TokenNameIdentifier	 clps
.	TokenNameDOT	
appendIntToStream	TokenNameIdentifier	 append Int To Stream
(	TokenNameLPAREN	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clps	TokenNameIdentifier	 clps
.	TokenNameDOT	
appendIntToStream	TokenNameIdentifier	 append Int To Stream
(	TokenNameLPAREN	
10000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clps	TokenNameIdentifier	 clps
.	TokenNameDOT	
appendIntToStream	TokenNameIdentifier	 append Int To Stream
(	TokenNameLPAREN	
100000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clps	TokenNameIdentifier	 clps
.	TokenNameDOT	
appendIntToStream	TokenNameIdentifier	 append Int To Stream
(	TokenNameLPAREN	
1000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clps	TokenNameIdentifier	 clps
.	TokenNameDOT	
appendIntToStream	TokenNameIdentifier	 append Int To Stream
(	TokenNameLPAREN	
10000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clps	TokenNameIdentifier	 clps
.	TokenNameDOT	
appendIntToStream	TokenNameIdentifier	 append Int To Stream
(	TokenNameLPAREN	
100000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clps	TokenNameIdentifier	 clps
.	TokenNameDOT	
appendIntToStream	TokenNameIdentifier	 append Int To Stream
(	TokenNameLPAREN	
1000000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clps	TokenNameIdentifier	 clps
.	TokenNameDOT	
appendIntToStream	TokenNameIdentifier	 append Int To Stream
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
bais	TokenNameIdentifier	 bais
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
(	TokenNameLPAREN	
clps	TokenNameIdentifier	 clps
.	TokenNameDOT	
convertStreamToByteArray	TokenNameIdentifier	 convert Stream To Byte Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IntDecoder	TokenNameIdentifier	 Int Decoder
decoder	TokenNameIdentifier	 decoder
=	TokenNameEQUAL	
new	TokenNamenew	
DGapIntDecoder	TokenNameIdentifier	 D Gap Int Decoder
(	TokenNameLPAREN	
new	TokenNamenew	
NOnesIntDecoder	TokenNameIdentifier	 N Ones Int Decoder
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
decoder	TokenNameIdentifier	 decoder
.	TokenNameDOT	
reInit	TokenNameIdentifier	 re Init
(	TokenNameLPAREN	
bais	TokenNameIdentifier	 bais
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Wrong value in byte stream"	TokenNameStringLiteral	Wrong value in byte stream
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
decoder	TokenNameIdentifier	 decoder
.	TokenNameDOT	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Wrong value in byte stream"	TokenNameStringLiteral	Wrong value in byte stream
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
decoder	TokenNameIdentifier	 decoder
.	TokenNameDOT	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Wrong value in byte stream"	TokenNameStringLiteral	Wrong value in byte stream
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
decoder	TokenNameIdentifier	 decoder
.	TokenNameDOT	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Wrong value in byte stream"	TokenNameStringLiteral	Wrong value in byte stream
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
decoder	TokenNameIdentifier	 decoder
.	TokenNameDOT	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Wrong value in byte stream"	TokenNameStringLiteral	Wrong value in byte stream
,	TokenNameCOMMA	
10000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
decoder	TokenNameIdentifier	 decoder
.	TokenNameDOT	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Wrong value in byte stream"	TokenNameStringLiteral	Wrong value in byte stream
,	TokenNameCOMMA	
100000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
decoder	TokenNameIdentifier	 decoder
.	TokenNameDOT	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Wrong value in byte stream"	TokenNameStringLiteral	Wrong value in byte stream
,	TokenNameCOMMA	
1000000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
decoder	TokenNameIdentifier	 decoder
.	TokenNameDOT	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Wrong value in byte stream"	TokenNameStringLiteral	Wrong value in byte stream
,	TokenNameCOMMA	
10000000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
decoder	TokenNameIdentifier	 decoder
.	TokenNameDOT	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Wrong value in byte stream"	TokenNameStringLiteral	Wrong value in byte stream
,	TokenNameCOMMA	
100000000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
decoder	TokenNameIdentifier	 decoder
.	TokenNameDOT	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Wrong value in byte stream"	TokenNameStringLiteral	Wrong value in byte stream
,	TokenNameCOMMA	
1000000000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
decoder	TokenNameIdentifier	 decoder
.	TokenNameDOT	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Wrong value in byte stream"	TokenNameStringLiteral	Wrong value in byte stream
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
decoder	TokenNameIdentifier	 decoder
.	TokenNameDOT	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"End of stream not reached"	TokenNameStringLiteral	End of stream not reached
,	TokenNameCOMMA	
IntDecoder	TokenNameIdentifier	 Int Decoder
.	TokenNameDOT	
EOS	TokenNameIdentifier	 EOS
,	TokenNameCOMMA	
decoder	TokenNameIdentifier	 decoder
.	TokenNameDOT	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clps	TokenNameIdentifier	 clps
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
decoder	TokenNameIdentifier	 decoder
.	TokenNameDOT	
reInit	TokenNameIdentifier	 re Init
(	TokenNameLPAREN	
bais	TokenNameIdentifier	 bais
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"End of stream not reached"	TokenNameStringLiteral	End of stream not reached
,	TokenNameCOMMA	
IntDecoder	TokenNameIdentifier	 Int Decoder
.	TokenNameDOT	
EOS	TokenNameIdentifier	 EOS
,	TokenNameCOMMA	
decoder	TokenNameIdentifier	 decoder
.	TokenNameDOT	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
