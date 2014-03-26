package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestMultiReader	TokenNameIdentifier	 Test Multi Reader
extends	TokenNameextends	
TestDirectoryReader	TokenNameIdentifier	 Test Directory Reader
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
IndexReader	TokenNameIdentifier	 Index Reader
openReader	TokenNameIdentifier	 open Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
sis	TokenNameIdentifier	 sis
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SegmentReader	TokenNameIdentifier	 Segment Reader
reader1	TokenNameIdentifier	 reader1
=	TokenNameEQUAL	
SegmentReader	TokenNameIdentifier	 Segment Reader
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
sis	TokenNameIdentifier	 sis
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
DEFAULT_TERMS_INDEX_DIVISOR	TokenNameIdentifier	 DEFAULT  TERMS  INDEX  DIVISOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SegmentReader	TokenNameIdentifier	 Segment Reader
reader2	TokenNameIdentifier	 reader2
=	TokenNameEQUAL	
SegmentReader	TokenNameIdentifier	 Segment Reader
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
sis	TokenNameIdentifier	 sis
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
DEFAULT_TERMS_INDEX_DIVISOR	TokenNameIdentifier	 DEFAULT  TERMS  INDEX  DIVISOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
readers	TokenNameIdentifier	 readers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
reader1	TokenNameIdentifier	 reader1
;	TokenNameSEMICOLON	
readers	TokenNameIdentifier	 readers
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
reader2	TokenNameIdentifier	 reader2
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
reader1	TokenNameIdentifier	 reader1
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
reader2	TokenNameIdentifier	 reader2
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
MultiReader	TokenNameIdentifier	 Multi Reader
(	TokenNameLPAREN	
readers	TokenNameIdentifier	 readers
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
sis	TokenNameIdentifier	 sis
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
