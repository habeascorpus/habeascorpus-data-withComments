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
document	TokenNameIdentifier	 document
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
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
FieldInfo	TokenNameIdentifier	 Field Info
.	TokenNameDOT	
IndexOptions	TokenNameIdentifier	 Index Options
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
store	TokenNameIdentifier	 store
.	TokenNameDOT	
IndexOutput	TokenNameIdentifier	 Index Output
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
//import org.cnlp.utils.properties.ResourceBundleHelper; 	TokenNameCOMMENT_LINE	import org.cnlp.utils.properties.ResourceBundleHelper; 
public	TokenNamepublic	
class	TokenNameclass	
TestFieldInfos	TokenNameIdentifier	 Test Field Infos
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
Document	TokenNameIdentifier	 Document
testDoc	TokenNameIdentifier	 test Doc
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
DocHelper	TokenNameIdentifier	 Doc Helper
.	TokenNameDOT	
setupDoc	TokenNameIdentifier	 setup Doc
(	TokenNameLPAREN	
testDoc	TokenNameIdentifier	 test Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test	TokenNameIdentifier	 test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
//Positive test of FieldInfos 	TokenNameCOMMENT_LINE	Positive test of FieldInfos 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
testDoc	TokenNameIdentifier	 test Doc
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldInfos	TokenNameIdentifier	 Field Infos
fieldInfos	TokenNameIdentifier	 field Infos
=	TokenNameEQUAL	
new	TokenNamenew	
FieldInfos	TokenNameIdentifier	 Field Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldInfos	TokenNameIdentifier	 field Infos
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
testDoc	TokenNameIdentifier	 test Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Since the complement is stored as well in the fields map 	TokenNameCOMMENT_LINE	Since the complement is stored as well in the fields map 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
fieldInfos	TokenNameIdentifier	 field Infos
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
DocHelper	TokenNameIdentifier	 Doc Helper
.	TokenNameDOT	
all	TokenNameIdentifier	 all
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//this is all b/c we are using the no-arg constructor 	TokenNameCOMMENT_LINE	this is all b/c we are using the no-arg constructor 
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
"testFile"	TokenNameStringLiteral	testFile
;	TokenNameSEMICOLON	
IndexOutput	TokenNameIdentifier	 Index Output
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
createOutput	TokenNameIdentifier	 create Output
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Use a RAMOutputStream 	TokenNameCOMMENT_LINE	Use a RAMOutputStream 
fieldInfos	TokenNameIdentifier	 field Infos
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
fileLength	TokenNameIdentifier	 file Length
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldInfos	TokenNameIdentifier	 Field Infos
readIn	TokenNameIdentifier	 read In
=	TokenNameEQUAL	
new	TokenNamenew	
FieldInfos	TokenNameIdentifier	 Field Infos
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
fieldInfos	TokenNameIdentifier	 field Infos
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
readIn	TokenNameIdentifier	 read In
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldInfo	TokenNameIdentifier	 Field Info
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
readIn	TokenNameIdentifier	 read In
.	TokenNameDOT	
fieldInfo	TokenNameIdentifier	 field Info
(	TokenNameLPAREN	
"textField1"	TokenNameStringLiteral	textField1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
storeTermVector	TokenNameIdentifier	 store Term Vector
==	TokenNameEQUAL_EQUAL	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
omitNorms	TokenNameIdentifier	 omit Norms
==	TokenNameEQUAL_EQUAL	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
readIn	TokenNameIdentifier	 read In
.	TokenNameDOT	
fieldInfo	TokenNameIdentifier	 field Info
(	TokenNameLPAREN	
"textField2"	TokenNameStringLiteral	textField2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
storeTermVector	TokenNameIdentifier	 store Term Vector
==	TokenNameEQUAL_EQUAL	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
omitNorms	TokenNameIdentifier	 omit Norms
==	TokenNameEQUAL_EQUAL	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
readIn	TokenNameIdentifier	 read In
.	TokenNameDOT	
fieldInfo	TokenNameIdentifier	 field Info
(	TokenNameLPAREN	
"textField3"	TokenNameStringLiteral	textField3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
storeTermVector	TokenNameIdentifier	 store Term Vector
==	TokenNameEQUAL_EQUAL	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
omitNorms	TokenNameIdentifier	 omit Norms
==	TokenNameEQUAL_EQUAL	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
readIn	TokenNameIdentifier	 read In
.	TokenNameDOT	
fieldInfo	TokenNameIdentifier	 field Info
(	TokenNameLPAREN	
"omitNorms"	TokenNameStringLiteral	omitNorms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
storeTermVector	TokenNameIdentifier	 store Term Vector
==	TokenNameEQUAL_EQUAL	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
omitNorms	TokenNameIdentifier	 omit Norms
==	TokenNameEQUAL_EQUAL	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
