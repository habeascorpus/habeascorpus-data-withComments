package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
demo	TokenNameIdentifier	 demo
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
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
PrintStream	TokenNameIdentifier	 Print Stream
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
_TestUtil	TokenNameIdentifier	 Test Util
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestDemo	TokenNameIdentifier	 Test Demo
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
testOneSearch	TokenNameIdentifier	 test One Search
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
indexPath	TokenNameIdentifier	 index Path
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
int	TokenNameint	
expectedHitCount	TokenNameIdentifier	 expected Hit Count
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
PrintStream	TokenNameIdentifier	 Print Stream
outSave	TokenNameIdentifier	 out Save
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PrintStream	TokenNameIdentifier	 Print Stream
fakeSystemOut	TokenNameIdentifier	 fake System Out
=	TokenNameEQUAL	
new	TokenNamenew	
PrintStream	TokenNameIdentifier	 Print Stream
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setOut	TokenNameIdentifier	 set Out
(	TokenNameLPAREN	
fakeSystemOut	TokenNameIdentifier	 fake System Out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SearchFiles	TokenNameIdentifier	 Search Files
.	TokenNameDOT	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"-query"	TokenNameStringLiteral	-query
,	TokenNameCOMMA	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
"-index"	TokenNameStringLiteral	-index
,	TokenNameCOMMA	
indexPath	TokenNameIdentifier	 index Path
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fakeSystemOut	TokenNameIdentifier	 fake System Out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// intentionally use default encoding 	TokenNameCOMMENT_LINE	intentionally use default encoding 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"output="	TokenNameStringLiteral	output=
+	TokenNamePLUS	
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
expectedHitCount	TokenNameIdentifier	 expected Hit Count
+	TokenNamePLUS	
" total matching documents"	TokenNameStringLiteral	 total matching documents
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setOut	TokenNameIdentifier	 set Out
(	TokenNameLPAREN	
outSave	TokenNameIdentifier	 out Save
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testIndexSearch	TokenNameIdentifier	 test Index Search
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
getDataFile	TokenNameIdentifier	 get Data File
(	TokenNameLPAREN	
"test-files/docs"	TokenNameStringLiteral	test-files/docs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
indexDir	TokenNameIdentifier	 index Dir
=	TokenNameEQUAL	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
getTempDir	TokenNameIdentifier	 get Temp Dir
(	TokenNameLPAREN	
"ContribDemoTest"	TokenNameStringLiteral	ContribDemoTest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexFiles	TokenNameIdentifier	 Index Files
.	TokenNameDOT	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"-create"	TokenNameStringLiteral	-create
,	TokenNameCOMMA	
"-docs"	TokenNameStringLiteral	-docs
,	TokenNameCOMMA	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"-index"	TokenNameStringLiteral	-index
,	TokenNameCOMMA	
indexDir	TokenNameIdentifier	 index Dir
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testOneSearch	TokenNameIdentifier	 test One Search
(	TokenNameLPAREN	
indexDir	TokenNameIdentifier	 index Dir
,	TokenNameCOMMA	
"apache"	TokenNameStringLiteral	apache
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testOneSearch	TokenNameIdentifier	 test One Search
(	TokenNameLPAREN	
indexDir	TokenNameIdentifier	 index Dir
,	TokenNameCOMMA	
"patent"	TokenNameStringLiteral	patent
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testOneSearch	TokenNameIdentifier	 test One Search
(	TokenNameLPAREN	
indexDir	TokenNameIdentifier	 index Dir
,	TokenNameCOMMA	
"lucene"	TokenNameStringLiteral	lucene
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testOneSearch	TokenNameIdentifier	 test One Search
(	TokenNameLPAREN	
indexDir	TokenNameIdentifier	 index Dir
,	TokenNameCOMMA	
"gnu"	TokenNameStringLiteral	gnu
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testOneSearch	TokenNameIdentifier	 test One Search
(	TokenNameLPAREN	
indexDir	TokenNameIdentifier	 index Dir
,	TokenNameCOMMA	
"derivative"	TokenNameStringLiteral	derivative
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testOneSearch	TokenNameIdentifier	 test One Search
(	TokenNameLPAREN	
indexDir	TokenNameIdentifier	 index Dir
,	TokenNameCOMMA	
"license"	TokenNameStringLiteral	license
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
