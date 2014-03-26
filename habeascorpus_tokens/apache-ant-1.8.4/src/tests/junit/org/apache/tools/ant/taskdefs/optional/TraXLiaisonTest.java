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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
XSLTLogger	TokenNameIdentifier	 XSLT Logger
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
JAXPUtils	TokenNameIdentifier	 JAXP Utils
;	TokenNameSEMICOLON	
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
File	TokenNameIdentifier	 File
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
security	TokenNameIdentifier	 security
.	TokenNameDOT	
Permission	TokenNameIdentifier	 Permission
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
AssertionFailedError	TokenNameIdentifier	 Assertion Failed Error
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * TraX XSLTLiaison testcase */	TokenNameCOMMENT_JAVADOC	 TraX XSLTLiaison testcase 
public	TokenNamepublic	
class	TokenNameclass	
TraXLiaisonTest	TokenNameIdentifier	 Tra X Liaison Test
extends	TokenNameextends	
AbstractXSLTLiaisonTest	TokenNameIdentifier	 Abstract XSLT Liaison Test
implements	TokenNameimplements	
XSLTLogger	TokenNameIdentifier	 XSLT Logger
{	TokenNameLBRACE	
public	TokenNamepublic	
TraXLiaisonTest	TokenNameIdentifier	 Tra X Liaison Test
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
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"xalan2-redirect-out.tmp"	TokenNameStringLiteral	xalan2-redirect-out.tmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
XSLTLiaison	TokenNameIdentifier	 XSLT Liaison
createLiaison	TokenNameIdentifier	 create Liaison
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
TraXLiaison	TokenNameIdentifier	 Tra X Liaison
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
new	TokenNamenew	
TraXLiaison	TokenNameIdentifier	 Tra X Liaison
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
setLogger	TokenNameIdentifier	 set Logger
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testXalan2Redirect	TokenNameIdentifier	 test Xalan2 Redirect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
loadClass	TokenNameIdentifier	 load Class
(	TokenNameLPAREN	
"org.apache.xalan.lib.Redirect"	TokenNameStringLiteral	org.apache.xalan.lib.Redirect
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
exc	TokenNameIdentifier	 exc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore 	TokenNameCOMMENT_LINE	ignore 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"xalan redirect is not on the classpath"	TokenNameStringLiteral	xalan redirect is not on the classpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
File	TokenNameIdentifier	 File
xsl	TokenNameIdentifier	 xsl
=	TokenNameEQUAL	
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
"/taskdefs/optional/xalan-redirect-in.xsl"	TokenNameStringLiteral	/taskdefs/optional/xalan-redirect-in.xsl
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
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"xalan2-redirect-out-dummy.tmp"	TokenNameStringLiteral	xalan2-redirect-out-dummy.tmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
"/taskdefs/optional/xsltliaison-in.xsl"	TokenNameStringLiteral	/taskdefs/optional/xsltliaison-in.xsl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ClassLoader	TokenNameIdentifier	 Class Loader
orig	TokenNameIdentifier	 orig
=	TokenNameEQUAL	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getContextClassLoader	TokenNameIdentifier	 get Context Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
liaison	TokenNameIdentifier	 liaison
.	TokenNameDOT	
addParam	TokenNameIdentifier	 add Param
(	TokenNameLPAREN	
"xalan-version"	TokenNameStringLiteral	xalan-version
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Use the JRE's Xerces, not lib/optional/xerces.jar: 	TokenNameCOMMENT_LINE	Use the JRE's Xerces, not lib/optional/xerces.jar: 
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setContextClassLoader	TokenNameIdentifier	 set Context Class Loader
(	TokenNameLPAREN	
new	TokenNamenew	
ClassLoader	TokenNameIdentifier	 Class Loader
(	TokenNameLPAREN	
ClassLoader	TokenNameIdentifier	 Class Loader
.	TokenNameDOT	
getSystemClassLoader	TokenNameIdentifier	 get System Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
InputStream	TokenNameIdentifier	 Input Stream
getResourceAsStream	TokenNameIdentifier	 get Resource As Stream
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"META-INF/services/"	TokenNameStringLiteral	META-INF/services/
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// work around JAXP #6723276 in JDK 6 	TokenNameCOMMENT_LINE	work around JAXP #6723276 in JDK 6 
return	TokenNamereturn	
new	TokenNamenew	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
(	TokenNameLPAREN	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getResourceAsStream	TokenNameIdentifier	 get Resource As Stream
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Tickle #52382: 	TokenNameCOMMENT_LINE	Tickle #52382: 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setSecurityManager	TokenNameIdentifier	 set Security Manager
(	TokenNameLPAREN	
new	TokenNamenew	
SecurityManager	TokenNameIdentifier	 Security Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
checkPermission	TokenNameIdentifier	 check Permission
(	TokenNameLPAREN	
Permission	TokenNameIdentifier	 Permission
perm	TokenNameIdentifier	 perm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setContextClassLoader	TokenNameIdentifier	 set Context Class Loader
(	TokenNameLPAREN	
orig	TokenNameIdentifier	 orig
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setSecurityManager	TokenNameIdentifier	 set Security Manager
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMultipleTransform	TokenNameIdentifier	 test Multiple Transform
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
// test for 10 consecutives transform 	TokenNameCOMMENT_LINE	test for 10 consecutives transform 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
50	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"xsltliaison"	TokenNameStringLiteral	xsltliaison
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
".tmp"	TokenNameStringLiteral	.tmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"failed in transform "	TokenNameStringLiteral	failed in transform 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
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
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSystemId	TokenNameIdentifier	 test System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
==	TokenNameEQUAL_EQUAL	
'\\'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"d:\jdk"	TokenNameStringLiteral	d:\jdk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"/user/local/bin"	TokenNameStringLiteral	/user/local/bin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
systemid	TokenNameIdentifier	 systemid
=	TokenNameEQUAL	
JAXPUtils	TokenNameIdentifier	 JAXP Utils
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"SystemIDs should start by file:/"	TokenNameStringLiteral	SystemIDs should start by file:/
,	TokenNameCOMMA	
systemid	TokenNameIdentifier	 systemid
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"file:/"	TokenNameStringLiteral	file:/
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"SystemIDs should not start with file:////"	TokenNameStringLiteral	SystemIDs should not start with file:////
,	TokenNameCOMMA	
!	TokenNameNOT	
systemid	TokenNameIdentifier	 systemid
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"file:////"	TokenNameStringLiteral	file:////
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
AssertionFailedError	TokenNameIdentifier	 Assertion Failed Error
(	TokenNameLPAREN	
"Liaison sent message: "	TokenNameStringLiteral	Liaison sent message: 
+	TokenNamePLUS	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
