package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
/** * Tests {@link ExtensionDescriptorBuilder}. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Tests {@link ExtensionDescriptorBuilder}. * @author Benjamin Bentmann 
public	TokenNamepublic	
class	TokenNameclass	
ExtensionDescriptorBuilderTest	TokenNameIdentifier	 Extension Descriptor Builder Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
ExtensionDescriptorBuilder	TokenNameIdentifier	 Extension Descriptor Builder
builder	TokenNameIdentifier	 builder
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
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
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
new	TokenNamenew	
ExtensionDescriptorBuilder	TokenNameIdentifier	 Extension Descriptor Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
InputStream	TokenNameIdentifier	 Input Stream
toStream	TokenNameIdentifier	 to Stream
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
xml	TokenNameIdentifier	 xml
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
(	TokenNameLPAREN	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEmptyDescriptor	TokenNameIdentifier	 test Empty Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
xml	TokenNameIdentifier	 xml
=	TokenNameEQUAL	
"<extension></extension>"	TokenNameStringLiteral	<extension></extension>
;	TokenNameSEMICOLON	
ExtensionDescriptor	TokenNameIdentifier	 Extension Descriptor
ed	TokenNameIdentifier	 ed
=	TokenNameEQUAL	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
toStream	TokenNameIdentifier	 to Stream
(	TokenNameLPAREN	
xml	TokenNameIdentifier	 xml
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
ed	TokenNameIdentifier	 ed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
ed	TokenNameIdentifier	 ed
.	TokenNameDOT	
getExportedPackages	TokenNameIdentifier	 get Exported Packages
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
ed	TokenNameIdentifier	 ed
.	TokenNameDOT	
getExportedPackages	TokenNameIdentifier	 get Exported Packages
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
ed	TokenNameIdentifier	 ed
.	TokenNameDOT	
getExportedArtifacts	TokenNameIdentifier	 get Exported Artifacts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
ed	TokenNameIdentifier	 ed
.	TokenNameDOT	
getExportedArtifacts	TokenNameIdentifier	 get Exported Artifacts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCompleteDescriptor	TokenNameIdentifier	 test Complete Descriptor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
xml	TokenNameIdentifier	 xml
=	TokenNameEQUAL	
"<?xml version='1.0' encoding='UTF-8'?>"	TokenNameStringLiteral	<?xml version='1.0' encoding='UTF-8'?>
+	TokenNamePLUS	
"<extension>"	TokenNameStringLiteral	<extension>
+	TokenNamePLUS	
"<exportedPackages>"	TokenNameStringLiteral	<exportedPackages>
+	TokenNamePLUS	
"<exportedPackage>a</exportedPackage>"	TokenNameStringLiteral	<exportedPackage>a</exportedPackage>
+	TokenNamePLUS	
"<exportedPackage>b</exportedPackage>"	TokenNameStringLiteral	<exportedPackage>b</exportedPackage>
+	TokenNamePLUS	
"<exportedPackage>c</exportedPackage>"	TokenNameStringLiteral	<exportedPackage>c</exportedPackage>
+	TokenNamePLUS	
"</exportedPackages>"	TokenNameStringLiteral	</exportedPackages>
+	TokenNamePLUS	
"<exportedArtifacts>"	TokenNameStringLiteral	<exportedArtifacts>
+	TokenNamePLUS	
"<exportedArtifact>x</exportedArtifact>"	TokenNameStringLiteral	<exportedArtifact>x</exportedArtifact>
+	TokenNamePLUS	
"<exportedArtifact>y</exportedArtifact>"	TokenNameStringLiteral	<exportedArtifact>y</exportedArtifact>
+	TokenNamePLUS	
"<exportedArtifact> z </exportedArtifact>"	TokenNameStringLiteral	<exportedArtifact> z </exportedArtifact>
+	TokenNamePLUS	
"</exportedArtifacts>"	TokenNameStringLiteral	</exportedArtifacts>
+	TokenNamePLUS	
"</extension>"	TokenNameStringLiteral	</extension>
;	TokenNameSEMICOLON	
ExtensionDescriptor	TokenNameIdentifier	 Extension Descriptor
ed	TokenNameIdentifier	 ed
=	TokenNameEQUAL	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
toStream	TokenNameIdentifier	 to Stream
(	TokenNameLPAREN	
xml	TokenNameIdentifier	 xml
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
ed	TokenNameIdentifier	 ed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"b"	TokenNameStringLiteral	b
,	TokenNameCOMMA	
"c"	TokenNameStringLiteral	c
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ed	TokenNameIdentifier	 ed
.	TokenNameDOT	
getExportedPackages	TokenNameIdentifier	 get Exported Packages
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
"x"	TokenNameStringLiteral	x
,	TokenNameCOMMA	
"y"	TokenNameStringLiteral	y
,	TokenNameCOMMA	
"z"	TokenNameStringLiteral	z
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ed	TokenNameIdentifier	 ed
.	TokenNameDOT	
getExportedArtifacts	TokenNameIdentifier	 get Exported Artifacts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
