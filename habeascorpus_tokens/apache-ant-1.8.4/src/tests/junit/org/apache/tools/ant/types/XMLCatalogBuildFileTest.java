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
/** * BuildFileTest testcases for org.apache.tools.ant.types.XMLCatalog * * @see org.apache.tools.ant.types.XMLCatalogTest * */	TokenNameCOMMENT_JAVADOC	 BuildFileTest testcases for org.apache.tools.ant.types.XMLCatalog * @see org.apache.tools.ant.types.XMLCatalogTest 
public	TokenNamepublic	
class	TokenNameclass	
XMLCatalogBuildFileTest	TokenNameIdentifier	 XML Catalog Build File Test
extends	TokenNameextends	
BuildFileTest	TokenNameIdentifier	 Build File Test
{	TokenNameLBRACE	
public	TokenNamepublic	
XMLCatalogBuildFileTest	TokenNameIdentifier	 XML Catalog Build File Test
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
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Ensure that an external entity resolves as expected with NO 	TokenNameCOMMENT_LINE	Ensure that an external entity resolves as expected with NO 
// XMLCatalog involvement: 	TokenNameCOMMENT_LINE	XMLCatalog involvement: 
// 	TokenNameCOMMENT_LINE	 
// Transform an XML file that refers to the entity into a text 	TokenNameCOMMENT_LINE	Transform an XML file that refers to the entity into a text 
// file, stuff result into property: val1 	TokenNameCOMMENT_LINE	file, stuff result into property: val1 
// 	TokenNameCOMMENT_LINE	 
public	TokenNamepublic	
void	TokenNamevoid	
testEntityNoCatalog	TokenNameIdentifier	 test Entity No Catalog
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/types/xmlcatalog.xml"	TokenNameStringLiteral	src/etc/testcases/types/xmlcatalog.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectPropertySet	TokenNameIdentifier	 expect Property Set
(	TokenNameLPAREN	
"testentitynocatalog"	TokenNameStringLiteral	testentitynocatalog
,	TokenNameCOMMA	
"val1"	TokenNameStringLiteral	val1
,	TokenNameCOMMA	
"A stitch in time saves nine"	TokenNameStringLiteral	A stitch in time saves nine
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Ensure that an external entity resolves as expected Using an 	TokenNameCOMMENT_LINE	Ensure that an external entity resolves as expected Using an 
// XMLCatalog: 	TokenNameCOMMENT_LINE	XMLCatalog: 
// 	TokenNameCOMMENT_LINE	 
// Transform an XML file that refers to the entity into a text 	TokenNameCOMMENT_LINE	Transform an XML file that refers to the entity into a text 
// file, entity is listed in the XMLCatalog pointing to a 	TokenNameCOMMENT_LINE	file, entity is listed in the XMLCatalog pointing to a 
// different file. Stuff result into property: val2 	TokenNameCOMMENT_LINE	different file. Stuff result into property: val2 
// 	TokenNameCOMMENT_LINE	 
public	TokenNamepublic	
void	TokenNamevoid	
testEntityWithCatalog	TokenNameIdentifier	 test Entity With Catalog
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/types/xmlcatalog.xml"	TokenNameStringLiteral	src/etc/testcases/types/xmlcatalog.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectPropertySet	TokenNameIdentifier	 expect Property Set
(	TokenNameLPAREN	
"testentitywithcatalog"	TokenNameStringLiteral	testentitywithcatalog
,	TokenNameCOMMA	
"val2"	TokenNameStringLiteral	val2
,	TokenNameCOMMA	
"No news is good news"	TokenNameStringLiteral	No news is good news
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Ensure that an external entity resolves as expected with NO 	TokenNameCOMMENT_LINE	Ensure that an external entity resolves as expected with NO 
// XMLCatalog involvement: 	TokenNameCOMMENT_LINE	XMLCatalog involvement: 
// 	TokenNameCOMMENT_LINE	 
// Transform an XML file that contains a reference to a _second_ XML file 	TokenNameCOMMENT_LINE	Transform an XML file that contains a reference to a _second_ XML file 
// via the document() function. The _second_ XML file refers to an entity. 	TokenNameCOMMENT_LINE	via the document() function. The _second_ XML file refers to an entity. 
// Stuff result into the property: val3 	TokenNameCOMMENT_LINE	Stuff result into the property: val3 
// 	TokenNameCOMMENT_LINE	 
public	TokenNamepublic	
void	TokenNamevoid	
testDocumentNoCatalog	TokenNameIdentifier	 test Document No Catalog
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/types/xmlcatalog.xml"	TokenNameStringLiteral	src/etc/testcases/types/xmlcatalog.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectPropertySet	TokenNameIdentifier	 expect Property Set
(	TokenNameLPAREN	
"testdocumentnocatalog"	TokenNameStringLiteral	testdocumentnocatalog
,	TokenNameCOMMA	
"val3"	TokenNameStringLiteral	val3
,	TokenNameCOMMA	
"A stitch in time saves nine"	TokenNameStringLiteral	A stitch in time saves nine
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Ensure that an external entity resolves as expected Using an 	TokenNameCOMMENT_LINE	Ensure that an external entity resolves as expected Using an 
// XMLCatalog: 	TokenNameCOMMENT_LINE	XMLCatalog: 
// 	TokenNameCOMMENT_LINE	 
// Transform an XML file that contains a reference to a _second_ XML file 	TokenNameCOMMENT_LINE	Transform an XML file that contains a reference to a _second_ XML file 
// via the document() function. The _second_ XML file refers to an entity. 	TokenNameCOMMENT_LINE	via the document() function. The _second_ XML file refers to an entity. 
// The entity is listed in the XMLCatalog pointing to a different file. 	TokenNameCOMMENT_LINE	The entity is listed in the XMLCatalog pointing to a different file. 
// Stuff result into the property: val4 	TokenNameCOMMENT_LINE	Stuff result into the property: val4 
// 	TokenNameCOMMENT_LINE	 
public	TokenNamepublic	
void	TokenNamevoid	
testDocumentWithCatalog	TokenNameIdentifier	 test Document With Catalog
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
configureProject	TokenNameIdentifier	 configure Project
(	TokenNameLPAREN	
"src/etc/testcases/types/xmlcatalog.xml"	TokenNameStringLiteral	src/etc/testcases/types/xmlcatalog.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectPropertySet	TokenNameIdentifier	 expect Property Set
(	TokenNameLPAREN	
"testdocumentwithcatalog"	TokenNameStringLiteral	testdocumentwithcatalog
,	TokenNameCOMMA	
"val4"	TokenNameStringLiteral	val4
,	TokenNameCOMMA	
"No news is good news"	TokenNameStringLiteral	No news is good news
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
