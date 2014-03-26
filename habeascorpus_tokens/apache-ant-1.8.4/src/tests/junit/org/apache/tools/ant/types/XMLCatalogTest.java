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
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
Source	TokenNameIdentifier	 Source
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXSource	TokenNameIdentifier	 SAX Source
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
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
BuildException	TokenNameIdentifier	 Build Exception
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
Project	TokenNameIdentifier	 Project
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
JAXPUtils	TokenNameIdentifier	 JAXP Utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
InputSource	TokenNameIdentifier	 Input Source
;	TokenNameSEMICOLON	
/** * JUnit testcases for org.apache.tools.ant.types.XMLCatalog * */	TokenNameCOMMENT_JAVADOC	 JUnit testcases for org.apache.tools.ant.types.XMLCatalog 
public	TokenNamepublic	
class	TokenNameclass	
XMLCatalogTest	TokenNameIdentifier	 XML Catalog Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
private	TokenNameprivate	
XMLCatalog	TokenNameIdentifier	 XML Catalog
catalog	TokenNameIdentifier	 catalog
;	TokenNameSEMICOLON	
private	TokenNameprivate	
XMLCatalog	TokenNameIdentifier	 XML Catalog
newCatalog	TokenNameIdentifier	 new Catalog
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XMLCatalog	TokenNameIdentifier	 XML Catalog
cat	TokenNameIdentifier	 cat
=	TokenNameEQUAL	
new	TokenNamenew	
XMLCatalog	TokenNameIdentifier	 XML Catalog
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cat	TokenNameIdentifier	 cat
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cat	TokenNameIdentifier	 cat
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
toURLString	TokenNameIdentifier	 to URL String
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
throws	TokenNamethrows	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
JAXPUtils	TokenNameIdentifier	 JAXP Utils
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
XMLCatalogTest	TokenNameIdentifier	 XML Catalog Test
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
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
new	TokenNamenew	
Project	TokenNameIdentifier	 Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
setBasedir	TokenNameIdentifier	 set Basedir
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"root"	TokenNameStringLiteral	root
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// This causes XMLCatalog to print out detailed logging 	TokenNameCOMMENT_LINE	This causes XMLCatalog to print out detailed logging 
// messages for debugging 	TokenNameCOMMENT_LINE	messages for debugging 
// 	TokenNameCOMMENT_LINE	 
// DefaultLogger logger = new DefaultLogger(); 	TokenNameCOMMENT_LINE	DefaultLogger logger = new DefaultLogger(); 
// logger.setMessageOutputLevel(Project.MSG_DEBUG); 	TokenNameCOMMENT_LINE	logger.setMessageOutputLevel(Project.MSG_DEBUG); 
// logger.setOutputPrintStream(System.out); 	TokenNameCOMMENT_LINE	logger.setOutputPrintStream(System.out); 
// logger.setErrorPrintStream(System.err); 	TokenNameCOMMENT_LINE	logger.setErrorPrintStream(System.err); 
// project.addBuildListener(logger); 	TokenNameCOMMENT_LINE	project.addBuildListener(logger); 
catalog	TokenNameIdentifier	 catalog
=	TokenNameEQUAL	
newCatalog	TokenNameIdentifier	 new Catalog
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
catalog	TokenNameIdentifier	 catalog
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEmptyCatalog	TokenNameIdentifier	 test Empty Catalog
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
InputSource	TokenNameIdentifier	 Input Source
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
catalog	TokenNameIdentifier	 catalog
.	TokenNameDOT	
resolveEntity	TokenNameIdentifier	 resolve Entity
(	TokenNameLPAREN	
"PUBLIC ID ONE"	TokenNameStringLiteral	PUBLIC ID ONE
,	TokenNameCOMMA	
"i/dont/exist.dtd"	TokenNameStringLiteral	i/dont/exist.dtd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
"Empty catalog should return null"	TokenNameStringLiteral	Empty catalog should return null
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"resolveEntity() failed!"	TokenNameStringLiteral	resolveEntity() failed!
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Source	TokenNameIdentifier	 Source
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
catalog	TokenNameIdentifier	 catalog
.	TokenNameDOT	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
"i/dont/exist.dtd"	TokenNameStringLiteral	i/dont/exist.dtd
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
toURLString	TokenNameIdentifier	 to URL String
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/i/dont/exist.dtd"	TokenNameStringLiteral	/i/dont/exist.dtd
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
resultStr	TokenNameIdentifier	 result Str
=	TokenNameEQUAL	
fileURLPartWithoutLeadingSlashes	TokenNameIdentifier	 file URL Part Without Leading Slashes
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SAXSource	TokenNameIdentifier	 SAX Source
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Empty catalog should return input with a system ID like "	TokenNameStringLiteral	Empty catalog should return input with a system ID like 
+	TokenNamePLUS	
expected	TokenNameIdentifier	 expected
+	TokenNamePLUS	
" but was "	TokenNameStringLiteral	 but was 
+	TokenNamePLUS	
resultStr	TokenNameIdentifier	 result Str
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
resultStr	TokenNameIdentifier	 result Str
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"resolve() failed!"	TokenNameStringLiteral	resolve() failed!
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fileURLPartWithoutLeadingSlashes	TokenNameIdentifier	 file URL Part Without Leading Slashes
(	TokenNameLPAREN	
SAXSource	TokenNameIdentifier	 SAX Source
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
throws	TokenNamethrows	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// These shenanigans are necessary b/c Norm Walsh's resolver 	TokenNameCOMMENT_LINE	These shenanigans are necessary b/c Norm Walsh's resolver 
// has a different idea of how file URLs are created on windoze 	TokenNameCOMMENT_LINE	has a different idea of how file URLs are created on windoze 
// ie file://c:/foo instead of file:///c:/foo 	TokenNameCOMMENT_LINE	ie file://c:/foo instead of file:///c:/foo 
// 	TokenNameCOMMENT_LINE	 
String	TokenNameIdentifier	 String
resultStr	TokenNameIdentifier	 result Str
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getInputSource	TokenNameIdentifier	 get Input Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// on Sun's Java6 this returns an unexpected number of four 	TokenNameCOMMENT_LINE	on Sun's Java6 this returns an unexpected number of four 
// leading slashes, at least on Linux - strip all of them 	TokenNameCOMMENT_LINE	leading slashes, at least on Linux - strip all of them 
while	TokenNamewhile	
(	TokenNameLPAREN	
resultStr	TokenNameIdentifier	 result Str
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resultStr	TokenNameIdentifier	 result Str
=	TokenNameEQUAL	
resultStr	TokenNameIdentifier	 result Str
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
resultStr	TokenNameIdentifier	 result Str
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNonExistentEntry	TokenNameIdentifier	 test Non Existent Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ResourceLocation	TokenNameIdentifier	 Resource Location
dtd	TokenNameIdentifier	 dtd
=	TokenNameEQUAL	
new	TokenNamenew	
ResourceLocation	TokenNameIdentifier	 Resource Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dtd	TokenNameIdentifier	 dtd
.	TokenNameDOT	
setPublicId	TokenNameIdentifier	 set Public Id
(	TokenNameLPAREN	
"PUBLIC ID ONE"	TokenNameStringLiteral	PUBLIC ID ONE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dtd	TokenNameIdentifier	 dtd
.	TokenNameDOT	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
"i/dont/exist.dtd"	TokenNameStringLiteral	i/dont/exist.dtd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
InputSource	TokenNameIdentifier	 Input Source
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
catalog	TokenNameIdentifier	 catalog
.	TokenNameDOT	
resolveEntity	TokenNameIdentifier	 resolve Entity
(	TokenNameLPAREN	
"PUBLIC ID ONE"	TokenNameStringLiteral	PUBLIC ID ONE
,	TokenNameCOMMA	
"i/dont/exist.dtd"	TokenNameStringLiteral	i/dont/exist.dtd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
"Nonexistent Catalog entry should not be returned"	TokenNameStringLiteral	Nonexistent Catalog entry should not be returned
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"resolveEntity() failed!"	TokenNameStringLiteral	resolveEntity() failed!
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Source	TokenNameIdentifier	 Source
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
catalog	TokenNameIdentifier	 catalog
.	TokenNameDOT	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
"i/dont/exist.dtd"	TokenNameStringLiteral	i/dont/exist.dtd
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
toURLString	TokenNameIdentifier	 to URL String
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toURL	TokenNameIdentifier	 to URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/i/dont/exist.dtd"	TokenNameStringLiteral	/i/dont/exist.dtd
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
resultStr	TokenNameIdentifier	 result Str
=	TokenNameEQUAL	
fileURLPartWithoutLeadingSlashes	TokenNameIdentifier	 file URL Part Without Leading Slashes
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SAXSource	TokenNameIdentifier	 SAX Source
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Nonexistent Catalog entry return input with a system ID like "	TokenNameStringLiteral	Nonexistent Catalog entry return input with a system ID like 
+	TokenNamePLUS	
expected	TokenNameIdentifier	 expected
+	TokenNamePLUS	
" but was "	TokenNameStringLiteral	 but was 
+	TokenNamePLUS	
resultStr	TokenNameIdentifier	 result Str
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
resultStr	TokenNameIdentifier	 result Str
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"resolve() failed!"	TokenNameStringLiteral	resolve() failed!
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEmptyElementIfIsReference	TokenNameIdentifier	 test Empty Element If Is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ResourceLocation	TokenNameIdentifier	 Resource Location
dtd	TokenNameIdentifier	 dtd
=	TokenNameEQUAL	
new	TokenNamenew	
ResourceLocation	TokenNameIdentifier	 Resource Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dtd	TokenNameIdentifier	 dtd
.	TokenNameDOT	
setPublicId	TokenNameIdentifier	 set Public Id
(	TokenNameLPAREN	
"PUBLIC ID ONE"	TokenNameStringLiteral	PUBLIC ID ONE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dtd	TokenNameIdentifier	 dtd
.	TokenNameDOT	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
"i/dont/exist.dtd"	TokenNameStringLiteral	i/dont/exist.dtd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
catalog	TokenNameIdentifier	 catalog
.	TokenNameDOT	
addDTD	TokenNameIdentifier	 add DTD
(	TokenNameLPAREN	
dtd	TokenNameIdentifier	 dtd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
"catalog"	TokenNameStringLiteral	catalog
,	TokenNameCOMMA	
catalog	TokenNameIdentifier	 catalog
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
catalog	TokenNameIdentifier	 catalog
.	TokenNameDOT	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
new	TokenNamenew	
Reference	TokenNameIdentifier	 Reference
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
"dummyref"	TokenNameStringLiteral	dummyref
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Can add reference to nonexistent XMLCatalog"	TokenNameStringLiteral	Can add reference to nonexistent XMLCatalog
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"You must not specify more than one "	TokenNameStringLiteral	You must not specify more than one 
+	TokenNamePLUS	
"attribute when using refid"	TokenNameStringLiteral	attribute when using refid
,	TokenNameCOMMA	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
XMLCatalog	TokenNameIdentifier	 XML Catalog
catalog2	TokenNameIdentifier	 catalog2
=	TokenNameEQUAL	
newCatalog	TokenNameIdentifier	 new Catalog
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
catalog2	TokenNameIdentifier	 catalog2
.	TokenNameDOT	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
new	TokenNamenew	
Reference	TokenNameIdentifier	 Reference
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
"catalog"	TokenNameStringLiteral	catalog
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
catalog2	TokenNameIdentifier	 catalog2
.	TokenNameDOT	
addConfiguredXMLCatalog	TokenNameIdentifier	 add Configured XML Catalog
(	TokenNameLPAREN	
catalog	TokenNameIdentifier	 catalog
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Can add nested XMLCatalog to XMLCatalog that is a reference"	TokenNameStringLiteral	Can add nested XMLCatalog to XMLCatalog that is a reference
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"You must not specify nested elements when using refid"	TokenNameStringLiteral	You must not specify nested elements when using refid
,	TokenNameCOMMA	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCircularReferenceCheck	TokenNameIdentifier	 test Circular Reference Check
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// catalog <--> catalog 	TokenNameCOMMENT_LINE	catalog <--> catalog 
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
"catalog"	TokenNameStringLiteral	catalog
,	TokenNameCOMMA	
catalog	TokenNameIdentifier	 catalog
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
catalog	TokenNameIdentifier	 catalog
.	TokenNameDOT	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
new	TokenNamenew	
Reference	TokenNameIdentifier	 Reference
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
"catalog"	TokenNameStringLiteral	catalog
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
InputSource	TokenNameIdentifier	 Input Source
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
catalog	TokenNameIdentifier	 catalog
.	TokenNameDOT	
resolveEntity	TokenNameIdentifier	 resolve Entity
(	TokenNameLPAREN	
"PUBLIC ID ONE"	TokenNameStringLiteral	PUBLIC ID ONE
,	TokenNameCOMMA	
"i/dont/exist.dtd"	TokenNameStringLiteral	i/dont/exist.dtd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Can make XMLCatalog a Reference to itself."	TokenNameStringLiteral	Can make XMLCatalog a Reference to itself.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"This data type contains a circular reference."	TokenNameStringLiteral	This data type contains a circular reference.
,	TokenNameCOMMA	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"resolveEntity() failed!"	TokenNameStringLiteral	resolveEntity() failed!
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// catalog1 --> catalog2 --> catalog3 --> catalog1 	TokenNameCOMMENT_LINE	catalog1 --> catalog2 --> catalog3 --> catalog1 
XMLCatalog	TokenNameIdentifier	 XML Catalog
catalog1	TokenNameIdentifier	 catalog1
=	TokenNameEQUAL	
newCatalog	TokenNameIdentifier	 new Catalog
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
"catalog1"	TokenNameStringLiteral	catalog1
,	TokenNameCOMMA	
catalog1	TokenNameIdentifier	 catalog1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLCatalog	TokenNameIdentifier	 XML Catalog
catalog2	TokenNameIdentifier	 catalog2
=	TokenNameEQUAL	
newCatalog	TokenNameIdentifier	 new Catalog
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
"catalog2"	TokenNameStringLiteral	catalog2
,	TokenNameCOMMA	
catalog2	TokenNameIdentifier	 catalog2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLCatalog	TokenNameIdentifier	 XML Catalog
catalog3	TokenNameIdentifier	 catalog3
=	TokenNameEQUAL	
newCatalog	TokenNameIdentifier	 new Catalog
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
"catalog3"	TokenNameStringLiteral	catalog3
,	TokenNameCOMMA	
catalog3	TokenNameIdentifier	 catalog3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
catalog3	TokenNameIdentifier	 catalog3
.	TokenNameDOT	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
new	TokenNamenew	
Reference	TokenNameIdentifier	 Reference
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
"catalog1"	TokenNameStringLiteral	catalog1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
catalog2	TokenNameIdentifier	 catalog2
.	TokenNameDOT	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
new	TokenNamenew	
Reference	TokenNameIdentifier	 Reference
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
"catalog3"	TokenNameStringLiteral	catalog3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
catalog1	TokenNameIdentifier	 catalog1
.	TokenNameDOT	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
new	TokenNamenew	
Reference	TokenNameIdentifier	 Reference
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
"catalog2"	TokenNameStringLiteral	catalog2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
InputSource	TokenNameIdentifier	 Input Source
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
catalog1	TokenNameIdentifier	 catalog1
.	TokenNameDOT	
resolveEntity	TokenNameIdentifier	 resolve Entity
(	TokenNameLPAREN	
"PUBLIC ID ONE"	TokenNameStringLiteral	PUBLIC ID ONE
,	TokenNameCOMMA	
"i/dont/exist.dtd"	TokenNameStringLiteral	i/dont/exist.dtd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Can make circular reference"	TokenNameStringLiteral	Can make circular reference
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BuildException	TokenNameIdentifier	 Build Exception
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"This data type contains a circular reference."	TokenNameStringLiteral	This data type contains a circular reference.
,	TokenNameCOMMA	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"resolveEntity() failed!"	TokenNameStringLiteral	resolveEntity() failed!
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// inspired by Bugzilla Report 23913 	TokenNameCOMMENT_LINE	inspired by Bugzilla Report 23913 
// a problem used to happen under Windows when the location of the DTD was given as an absolute path 	TokenNameCOMMENT_LINE	a problem used to happen under Windows when the location of the DTD was given as an absolute path 
// possibly with a mixture of file separators 	TokenNameCOMMENT_LINE	possibly with a mixture of file separators 
public	TokenNamepublic	
void	TokenNamevoid	
testAbsolutePath	TokenNameIdentifier	 test Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ResourceLocation	TokenNameIdentifier	 Resource Location
dtd	TokenNameIdentifier	 dtd
=	TokenNameEQUAL	
new	TokenNamenew	
ResourceLocation	TokenNameIdentifier	 Resource Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dtd	TokenNameIdentifier	 dtd
.	TokenNameDOT	
setPublicId	TokenNameIdentifier	 set Public Id
(	TokenNameLPAREN	
"-//stevo//DTD doc 1.0//EN"	TokenNameStringLiteral	-//stevo//DTD doc 1.0//EN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
sysid	TokenNameIdentifier	 sysid
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"root"	TokenNameStringLiteral	root
)	TokenNameRPAREN	
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
"src/etc/testcases/taskdefs/optional/xml/doc.dtd"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/xml/doc.dtd
;	TokenNameSEMICOLON	
dtd	TokenNameIdentifier	 dtd
.	TokenNameDOT	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
sysid	TokenNameIdentifier	 sysid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
catalog	TokenNameIdentifier	 catalog
.	TokenNameDOT	
addDTD	TokenNameIdentifier	 add DTD
(	TokenNameLPAREN	
dtd	TokenNameIdentifier	 dtd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
dtdFile	TokenNameIdentifier	 dtd File
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
sysid	TokenNameIdentifier	 sysid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
InputSource	TokenNameIdentifier	 Input Source
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
catalog	TokenNameIdentifier	 catalog
.	TokenNameDOT	
resolveEntity	TokenNameIdentifier	 resolve Entity
(	TokenNameLPAREN	
"-//stevo//DTD doc 1.0//EN"	TokenNameStringLiteral	-//stevo//DTD doc 1.0//EN
,	TokenNameCOMMA	
"nap:chemical+brothers"	TokenNameStringLiteral	nap:chemical+brothers
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
toURLString	TokenNameIdentifier	 to URL String
(	TokenNameLPAREN	
dtdFile	TokenNameIdentifier	 dtd File
)	TokenNameRPAREN	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"resolveEntity() failed!"	TokenNameStringLiteral	resolveEntity() failed!
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSimpleEntry	TokenNameIdentifier	 test Simple Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ResourceLocation	TokenNameIdentifier	 Resource Location
dtd	TokenNameIdentifier	 dtd
=	TokenNameEQUAL	
new	TokenNamenew	
ResourceLocation	TokenNameIdentifier	 Resource Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dtd	TokenNameIdentifier	 dtd
.	TokenNameDOT	
setPublicId	TokenNameIdentifier	 set Public Id
(	TokenNameLPAREN	
"-//stevo//DTD doc 1.0//EN"	TokenNameStringLiteral	-//stevo//DTD doc 1.0//EN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
sysid	TokenNameIdentifier	 sysid
=	TokenNameEQUAL	
"src/etc/testcases/taskdefs/optional/xml/doc.dtd"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/xml/doc.dtd
;	TokenNameSEMICOLON	
dtd	TokenNameIdentifier	 dtd
.	TokenNameDOT	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
sysid	TokenNameIdentifier	 sysid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
catalog	TokenNameIdentifier	 catalog
.	TokenNameDOT	
addDTD	TokenNameIdentifier	 add DTD
(	TokenNameLPAREN	
dtd	TokenNameIdentifier	 dtd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
dtdFile	TokenNameIdentifier	 dtd File
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
sysid	TokenNameIdentifier	 sysid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
InputSource	TokenNameIdentifier	 Input Source
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
catalog	TokenNameIdentifier	 catalog
.	TokenNameDOT	
resolveEntity	TokenNameIdentifier	 resolve Entity
(	TokenNameLPAREN	
"-//stevo//DTD doc 1.0//EN"	TokenNameStringLiteral	-//stevo//DTD doc 1.0//EN
,	TokenNameCOMMA	
"nap:chemical+brothers"	TokenNameStringLiteral	nap:chemical+brothers
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
toURLString	TokenNameIdentifier	 to URL String
(	TokenNameLPAREN	
dtdFile	TokenNameIdentifier	 dtd File
)	TokenNameRPAREN	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"resolveEntity() failed!"	TokenNameStringLiteral	resolveEntity() failed!
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEntryReference	TokenNameIdentifier	 test Entry Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
=	TokenNameEQUAL	
"-//stevo//DTD doc 1.0//EN"	TokenNameStringLiteral	-//stevo//DTD doc 1.0//EN
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
sysid	TokenNameIdentifier	 sysid
=	TokenNameEQUAL	
"src/etc/testcases/taskdefs/optional/xml/doc.dtd"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/xml/doc.dtd
;	TokenNameSEMICOLON	
// catalog2 --> catalog1 --> catalog 	TokenNameCOMMENT_LINE	catalog2 --> catalog1 --> catalog 
ResourceLocation	TokenNameIdentifier	 Resource Location
dtd	TokenNameIdentifier	 dtd
=	TokenNameEQUAL	
new	TokenNamenew	
ResourceLocation	TokenNameIdentifier	 Resource Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dtd	TokenNameIdentifier	 dtd
.	TokenNameDOT	
setPublicId	TokenNameIdentifier	 set Public Id
(	TokenNameLPAREN	
publicId	TokenNameIdentifier	 public Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dtd	TokenNameIdentifier	 dtd
.	TokenNameDOT	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
sysid	TokenNameIdentifier	 sysid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
catalog	TokenNameIdentifier	 catalog
.	TokenNameDOT	
addDTD	TokenNameIdentifier	 add DTD
(	TokenNameLPAREN	
dtd	TokenNameIdentifier	 dtd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
dtdFile	TokenNameIdentifier	 dtd File
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
sysid	TokenNameIdentifier	 sysid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
"http://foo.com/bar/blah.xml"	TokenNameStringLiteral	http://foo.com/bar/blah.xml
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
uriLoc	TokenNameIdentifier	 uri Loc
=	TokenNameEQUAL	
"src/etc/testcases/taskdefs/optional/xml/about.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/xml/about.xml
;	TokenNameSEMICOLON	
ResourceLocation	TokenNameIdentifier	 Resource Location
entity	TokenNameIdentifier	 entity
=	TokenNameEQUAL	
new	TokenNamenew	
ResourceLocation	TokenNameIdentifier	 Resource Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entity	TokenNameIdentifier	 entity
.	TokenNameDOT	
setPublicId	TokenNameIdentifier	 set Public Id
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entity	TokenNameIdentifier	 entity
.	TokenNameDOT	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
uriLoc	TokenNameIdentifier	 uri Loc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
catalog	TokenNameIdentifier	 catalog
.	TokenNameDOT	
addEntity	TokenNameIdentifier	 add Entity
(	TokenNameLPAREN	
entity	TokenNameIdentifier	 entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
xmlFile	TokenNameIdentifier	 xml File
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
uriLoc	TokenNameIdentifier	 uri Loc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
"catalog"	TokenNameStringLiteral	catalog
,	TokenNameCOMMA	
catalog	TokenNameIdentifier	 catalog
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLCatalog	TokenNameIdentifier	 XML Catalog
catalog1	TokenNameIdentifier	 catalog1
=	TokenNameEQUAL	
newCatalog	TokenNameIdentifier	 new Catalog
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
"catalog1"	TokenNameStringLiteral	catalog1
,	TokenNameCOMMA	
catalog1	TokenNameIdentifier	 catalog1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLCatalog	TokenNameIdentifier	 XML Catalog
catalog2	TokenNameIdentifier	 catalog2
=	TokenNameEQUAL	
newCatalog	TokenNameIdentifier	 new Catalog
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
"catalog2"	TokenNameStringLiteral	catalog2
,	TokenNameCOMMA	
catalog1	TokenNameIdentifier	 catalog1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
catalog1	TokenNameIdentifier	 catalog1
.	TokenNameDOT	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
new	TokenNamenew	
Reference	TokenNameIdentifier	 Reference
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
"catalog"	TokenNameStringLiteral	catalog
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
catalog2	TokenNameIdentifier	 catalog2
.	TokenNameDOT	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
new	TokenNamenew	
Reference	TokenNameIdentifier	 Reference
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
"catalog1"	TokenNameStringLiteral	catalog1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
InputSource	TokenNameIdentifier	 Input Source
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
catalog2	TokenNameIdentifier	 catalog2
.	TokenNameDOT	
resolveEntity	TokenNameIdentifier	 resolve Entity
(	TokenNameLPAREN	
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
"nap:chemical+brothers"	TokenNameStringLiteral	nap:chemical+brothers
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
toURLString	TokenNameIdentifier	 to URL String
(	TokenNameLPAREN	
dtdFile	TokenNameIdentifier	 dtd File
)	TokenNameRPAREN	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"resolveEntity() failed!"	TokenNameStringLiteral	resolveEntity() failed!
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Source	TokenNameIdentifier	 Source
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
catalog	TokenNameIdentifier	 catalog
.	TokenNameDOT	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
toURLString	TokenNameIdentifier	 to URL String
(	TokenNameLPAREN	
xmlFile	TokenNameIdentifier	 xml File
)	TokenNameRPAREN	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"resolve() failed!"	TokenNameStringLiteral	resolve() failed!
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNestedCatalog	TokenNameIdentifier	 test Nested Catalog
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
=	TokenNameEQUAL	
"-//stevo//DTD doc 1.0//EN"	TokenNameStringLiteral	-//stevo//DTD doc 1.0//EN
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
dtdLoc	TokenNameIdentifier	 dtd Loc
=	TokenNameEQUAL	
"src/etc/testcases/taskdefs/optional/xml/doc.dtd"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/xml/doc.dtd
;	TokenNameSEMICOLON	
ResourceLocation	TokenNameIdentifier	 Resource Location
dtd	TokenNameIdentifier	 dtd
=	TokenNameEQUAL	
new	TokenNamenew	
ResourceLocation	TokenNameIdentifier	 Resource Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dtd	TokenNameIdentifier	 dtd
.	TokenNameDOT	
setPublicId	TokenNameIdentifier	 set Public Id
(	TokenNameLPAREN	
publicId	TokenNameIdentifier	 public Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dtd	TokenNameIdentifier	 dtd
.	TokenNameDOT	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
dtdLoc	TokenNameIdentifier	 dtd Loc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
catalog	TokenNameIdentifier	 catalog
.	TokenNameDOT	
addDTD	TokenNameIdentifier	 add DTD
(	TokenNameLPAREN	
dtd	TokenNameIdentifier	 dtd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
dtdFile	TokenNameIdentifier	 dtd File
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
dtdLoc	TokenNameIdentifier	 dtd Loc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
"http://foo.com/bar/blah.xml"	TokenNameStringLiteral	http://foo.com/bar/blah.xml
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
uriLoc	TokenNameIdentifier	 uri Loc
=	TokenNameEQUAL	
"src/etc/testcases/taskdefs/optional/xml/about.xml"	TokenNameStringLiteral	src/etc/testcases/taskdefs/optional/xml/about.xml
;	TokenNameSEMICOLON	
ResourceLocation	TokenNameIdentifier	 Resource Location
entity	TokenNameIdentifier	 entity
=	TokenNameEQUAL	
new	TokenNamenew	
ResourceLocation	TokenNameIdentifier	 Resource Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entity	TokenNameIdentifier	 entity
.	TokenNameDOT	
setPublicId	TokenNameIdentifier	 set Public Id
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entity	TokenNameIdentifier	 entity
.	TokenNameDOT	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
uriLoc	TokenNameIdentifier	 uri Loc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
catalog	TokenNameIdentifier	 catalog
.	TokenNameDOT	
addEntity	TokenNameIdentifier	 add Entity
(	TokenNameLPAREN	
entity	TokenNameIdentifier	 entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
xmlFile	TokenNameIdentifier	 xml File
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
uriLoc	TokenNameIdentifier	 uri Loc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLCatalog	TokenNameIdentifier	 XML Catalog
catalog1	TokenNameIdentifier	 catalog1
=	TokenNameEQUAL	
newCatalog	TokenNameIdentifier	 new Catalog
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
catalog1	TokenNameIdentifier	 catalog1
.	TokenNameDOT	
addConfiguredXMLCatalog	TokenNameIdentifier	 add Configured XML Catalog
(	TokenNameLPAREN	
catalog	TokenNameIdentifier	 catalog
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
InputSource	TokenNameIdentifier	 Input Source
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
catalog1	TokenNameIdentifier	 catalog1
.	TokenNameDOT	
resolveEntity	TokenNameIdentifier	 resolve Entity
(	TokenNameLPAREN	
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
"nap:chemical+brothers"	TokenNameStringLiteral	nap:chemical+brothers
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
toURLString	TokenNameIdentifier	 to URL String
(	TokenNameLPAREN	
dtdFile	TokenNameIdentifier	 dtd File
)	TokenNameRPAREN	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"resolveEntity() failed!"	TokenNameStringLiteral	resolveEntity() failed!
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Source	TokenNameIdentifier	 Source
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
catalog	TokenNameIdentifier	 catalog
.	TokenNameDOT	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
toURLString	TokenNameIdentifier	 to URL String
(	TokenNameLPAREN	
xmlFile	TokenNameIdentifier	 xml File
)	TokenNameRPAREN	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"resolve() failed!"	TokenNameStringLiteral	resolve() failed!
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testResolverBase	TokenNameIdentifier	 test Resolver Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
"http://foo.com/bar/blah.xml"	TokenNameStringLiteral	http://foo.com/bar/blah.xml
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
uriLoc	TokenNameIdentifier	 uri Loc
=	TokenNameEQUAL	
"etc/testcases/taskdefs/optional/xml/about.xml"	TokenNameStringLiteral	etc/testcases/taskdefs/optional/xml/about.xml
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
toURLString	TokenNameIdentifier	 to URL String
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/src/"	TokenNameStringLiteral	/src/
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ResourceLocation	TokenNameIdentifier	 Resource Location
entity	TokenNameIdentifier	 entity
=	TokenNameEQUAL	
new	TokenNamenew	
ResourceLocation	TokenNameIdentifier	 Resource Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entity	TokenNameIdentifier	 entity
.	TokenNameDOT	
setPublicId	TokenNameIdentifier	 set Public Id
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entity	TokenNameIdentifier	 entity
.	TokenNameDOT	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
uriLoc	TokenNameIdentifier	 uri Loc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
catalog	TokenNameIdentifier	 catalog
.	TokenNameDOT	
addEntity	TokenNameIdentifier	 add Entity
(	TokenNameLPAREN	
entity	TokenNameIdentifier	 entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
xmlFile	TokenNameIdentifier	 xml File
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
"src/"	TokenNameStringLiteral	src/
+	TokenNamePLUS	
uriLoc	TokenNameIdentifier	 uri Loc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Source	TokenNameIdentifier	 Source
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
catalog	TokenNameIdentifier	 catalog
.	TokenNameDOT	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
toURLString	TokenNameIdentifier	 to URL String
(	TokenNameLPAREN	
xmlFile	TokenNameIdentifier	 xml File
)	TokenNameRPAREN	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"resolve() failed!"	TokenNameStringLiteral	resolve() failed!
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testClasspath	TokenNameIdentifier	 test Classpath
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
=	TokenNameEQUAL	
"-//stevo//DTD doc 1.0//EN"	TokenNameStringLiteral	-//stevo//DTD doc 1.0//EN
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
dtdLoc	TokenNameIdentifier	 dtd Loc
=	TokenNameEQUAL	
"testcases/taskdefs/optional/xml/doc.dtd"	TokenNameStringLiteral	testcases/taskdefs/optional/xml/doc.dtd
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
path1	TokenNameIdentifier	 path1
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/src/etc"	TokenNameStringLiteral	/src/etc
;	TokenNameSEMICOLON	
ResourceLocation	TokenNameIdentifier	 Resource Location
dtd	TokenNameIdentifier	 dtd
=	TokenNameEQUAL	
new	TokenNamenew	
ResourceLocation	TokenNameIdentifier	 Resource Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dtd	TokenNameIdentifier	 dtd
.	TokenNameDOT	
setPublicId	TokenNameIdentifier	 set Public Id
(	TokenNameLPAREN	
publicId	TokenNameIdentifier	 public Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dtd	TokenNameIdentifier	 dtd
.	TokenNameDOT	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
dtdLoc	TokenNameIdentifier	 dtd Loc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
catalog	TokenNameIdentifier	 catalog
.	TokenNameDOT	
addDTD	TokenNameIdentifier	 add DTD
(	TokenNameLPAREN	
dtd	TokenNameIdentifier	 dtd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
dtdFile	TokenNameIdentifier	 dtd File
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
"src/etc/"	TokenNameStringLiteral	src/etc/
+	TokenNamePLUS	
dtdLoc	TokenNameIdentifier	 dtd Loc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
"http://foo.com/bar/blah.xml"	TokenNameStringLiteral	http://foo.com/bar/blah.xml
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
uriLoc	TokenNameIdentifier	 uri Loc
=	TokenNameEQUAL	
"etc/testcases/taskdefs/optional/xml/about.xml"	TokenNameStringLiteral	etc/testcases/taskdefs/optional/xml/about.xml
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
path2	TokenNameIdentifier	 path2
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getBaseDir	TokenNameIdentifier	 get Base Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/src"	TokenNameStringLiteral	/src
;	TokenNameSEMICOLON	
ResourceLocation	TokenNameIdentifier	 Resource Location
entity	TokenNameIdentifier	 entity
=	TokenNameEQUAL	
new	TokenNamenew	
ResourceLocation	TokenNameIdentifier	 Resource Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entity	TokenNameIdentifier	 entity
.	TokenNameDOT	
setPublicId	TokenNameIdentifier	 set Public Id
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entity	TokenNameIdentifier	 entity
.	TokenNameDOT	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
uriLoc	TokenNameIdentifier	 uri Loc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
catalog	TokenNameIdentifier	 catalog
.	TokenNameDOT	
addEntity	TokenNameIdentifier	 add Entity
(	TokenNameLPAREN	
entity	TokenNameIdentifier	 entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
xmlFile	TokenNameIdentifier	 xml File
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
resolveFile	TokenNameIdentifier	 resolve File
(	TokenNameLPAREN	
"src/"	TokenNameStringLiteral	src/
+	TokenNamePLUS	
uriLoc	TokenNameIdentifier	 uri Loc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Path	TokenNameIdentifier	 Path
aPath	TokenNameIdentifier	 a Path
=	TokenNameEQUAL	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
path1	TokenNameIdentifier	 path1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
aPath	TokenNameIdentifier	 a Path
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
new	TokenNamenew	
Path	TokenNameIdentifier	 Path
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
path2	TokenNameIdentifier	 path2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
catalog	TokenNameIdentifier	 catalog
.	TokenNameDOT	
setClasspath	TokenNameIdentifier	 set Classpath
(	TokenNameLPAREN	
aPath	TokenNameIdentifier	 a Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
InputSource	TokenNameIdentifier	 Input Source
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
catalog	TokenNameIdentifier	 catalog
.	TokenNameDOT	
resolveEntity	TokenNameIdentifier	 resolve Entity
(	TokenNameLPAREN	
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
"nap:chemical+brothers"	TokenNameStringLiteral	nap:chemical+brothers
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
resultStr	TokenNameIdentifier	 result Str
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
toURLString	TokenNameIdentifier	 to URL String
(	TokenNameLPAREN	
dtdFile	TokenNameIdentifier	 dtd File
)	TokenNameRPAREN	
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
resultStr	TokenNameIdentifier	 result Str
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"resolveEntity() failed!"	TokenNameStringLiteral	resolveEntity() failed!
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Source	TokenNameIdentifier	 Source
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
catalog	TokenNameIdentifier	 catalog
.	TokenNameDOT	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
resultStr	TokenNameIdentifier	 result Str
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
toURLString	TokenNameIdentifier	 to URL String
(	TokenNameLPAREN	
xmlFile	TokenNameIdentifier	 xml File
)	TokenNameRPAREN	
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
resultStr	TokenNameIdentifier	 result Str
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"resolve() failed!"	TokenNameStringLiteral	resolve() failed!
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
