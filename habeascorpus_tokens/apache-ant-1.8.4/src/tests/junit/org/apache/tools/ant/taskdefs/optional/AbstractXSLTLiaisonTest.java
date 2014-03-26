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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
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
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
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
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
DocumentBuilder	TokenNameIdentifier	 Document Builder
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
XSLTLiaison	TokenNameIdentifier	 XSLT Liaison
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
FileUtils	TokenNameIdentifier	 File Utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
;	TokenNameSEMICOLON	
/** * Abtract testcase for XSLTLiaison. * Override createLiaison for each XSLTLiaison. * * <a href="sbailliez@apache.org">Stephane Bailliez</a> */	TokenNameCOMMENT_JAVADOC	 Abtract testcase for XSLTLiaison. Override createLiaison for each XSLTLiaison. * <a href="sbailliez@apache.org">Stephane Bailliez</a> 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractXSLTLiaisonTest	TokenNameIdentifier	 Abstract XSLT Liaison Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
FileUtils	TokenNameIdentifier	 File Utils
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
=	TokenNameEQUAL	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
getFileUtils	TokenNameIdentifier	 get File Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
XSLTLiaison	TokenNameIdentifier	 XSLT Liaison
liaison	TokenNameIdentifier	 liaison
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
AbstractXSLTLiaisonTest	TokenNameIdentifier	 Abstract XSLT Liaison Test
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
protected	TokenNameprotected	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
liaison	TokenNameIdentifier	 liaison
=	TokenNameEQUAL	
createLiaison	TokenNameIdentifier	 create Liaison
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// to override 	TokenNameCOMMENT_LINE	to override 
protected	TokenNameprotected	
abstract	TokenNameabstract	
XSLTLiaison	TokenNameIdentifier	 XSLT Liaison
createLiaison	TokenNameIdentifier	 create Liaison
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
;	TokenNameSEMICOLON	
/** load the file from the caller classloader that loaded this class */	TokenNameCOMMENT_JAVADOC	 load the file from the caller classloader that loaded this class 
protected	TokenNameprotected	
File	TokenNameIdentifier	 File
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
{	TokenNameLBRACE	
URL	TokenNameIdentifier	 URL
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
(	TokenNameLPAREN	
"Unable to load '"	TokenNameStringLiteral	Unable to load '
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"' from classpath"	TokenNameStringLiteral	' from classpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
fromURI	TokenNameIdentifier	 from URI
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
toExternalForm	TokenNameIdentifier	 to External Form
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** keep it simple stupid */	TokenNameCOMMENT_JAVADOC	 keep it simple stupid 
public	TokenNamepublic	
void	TokenNamevoid	
testTransform	TokenNameIdentifier	 test Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
xsl	TokenNameIdentifier	 xsl
=	TokenNameEQUAL	
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
"/taskdefs/optional/xsltliaison-in.xsl"	TokenNameStringLiteral	/taskdefs/optional/xsltliaison-in.xsl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
liaison	TokenNameIdentifier	 liaison
.	TokenNameDOT	
setStylesheet	TokenNameIdentifier	 set Stylesheet
(	TokenNameLPAREN	
xsl	TokenNameIdentifier	 xsl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
liaison	TokenNameIdentifier	 liaison
.	TokenNameDOT	
addParam	TokenNameIdentifier	 add Param
(	TokenNameLPAREN	
"param"	TokenNameStringLiteral	param
,	TokenNameCOMMA	
"value"	TokenNameStringLiteral	value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
"/taskdefs/optional/xsltliaison-in.xml"	TokenNameStringLiteral	/taskdefs/optional/xsltliaison-in.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"xsltliaison.tmp"	TokenNameStringLiteral	xsltliaison.tmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
deleteOnExit	TokenNameIdentifier	 delete On Exit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// just to be sure 	TokenNameCOMMENT_LINE	just to be sure 
try	TokenNametry	
{	TokenNameLBRACE	
liaison	TokenNameIdentifier	 liaison
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEncoding	TokenNameIdentifier	 test Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
xsl	TokenNameIdentifier	 xsl
=	TokenNameEQUAL	
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
"/taskdefs/optional/xsltliaison-encoding-in.xsl"	TokenNameStringLiteral	/taskdefs/optional/xsltliaison-encoding-in.xsl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
liaison	TokenNameIdentifier	 liaison
.	TokenNameDOT	
setStylesheet	TokenNameIdentifier	 set Stylesheet
(	TokenNameLPAREN	
xsl	TokenNameIdentifier	 xsl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
"/taskdefs/optional/xsltliaison-encoding-in.xml"	TokenNameStringLiteral	/taskdefs/optional/xsltliaison-encoding-in.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"xsltliaison-encoding.tmp"	TokenNameStringLiteral	xsltliaison-encoding.tmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
deleteOnExit	TokenNameIdentifier	 delete On Exit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// just to be sure 	TokenNameCOMMENT_LINE	just to be sure 
try	TokenNametry	
{	TokenNameLBRACE	
liaison	TokenNameIdentifier	 liaison
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
parseXML	TokenNameIdentifier	 parse XML
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"root"	TokenNameStringLiteral	root
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getDocumentElement	TokenNameIdentifier	 get Document Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"message"	TokenNameStringLiteral	message
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getDocumentElement	TokenNameIdentifier	 get Document Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"éàèïù"	TokenNameStringLiteral	éàèïù
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getDocumentElement	TokenNameIdentifier	 get Document Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
Document	TokenNameIdentifier	 Document
parseXML	TokenNameIdentifier	 parse XML
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
dbfactory	TokenNameIdentifier	 dbfactory
=	TokenNameEQUAL	
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DocumentBuilder	TokenNameIdentifier	 Document Builder
dbuilder	TokenNameIdentifier	 dbuilder
=	TokenNameEQUAL	
dbfactory	TokenNameIdentifier	 dbfactory
.	TokenNameDOT	
newDocumentBuilder	TokenNameIdentifier	 new Document Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
dbuilder	TokenNameIdentifier	 dbuilder
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
