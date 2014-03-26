/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
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
FileReader	TokenNameIdentifier	 File Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileWriter	TokenNameIdentifier	 File Writer
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
FileUtils	TokenNameIdentifier	 File Utils
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
PropertyFileCLITest	TokenNameIdentifier	 Property File CLI Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPropertyResolution	TokenNameIdentifier	 test Property Resolution
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
FileUtils	TokenNameIdentifier	 File Utils
fu	TokenNameIdentifier	 fu
=	TokenNameEQUAL	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
getFileUtils	TokenNameIdentifier	 get File Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
fu	TokenNameIdentifier	 fu
.	TokenNameDOT	
createTempFile	TokenNameIdentifier	 create Temp File
(	TokenNameLPAREN	
"propertyfilecli"	TokenNameStringLiteral	propertyfilecli
,	TokenNameCOMMA	
".properties"	TokenNameStringLiteral	.properties
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
build	TokenNameIdentifier	 build
=	TokenNameEQUAL	
fu	TokenNameIdentifier	 fu
.	TokenNameDOT	
createTempFile	TokenNameIdentifier	 create Temp File
(	TokenNameLPAREN	
"propertyfilecli"	TokenNameStringLiteral	propertyfilecli
,	TokenNameCOMMA	
".xml"	TokenNameStringLiteral	.xml
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
log	TokenNameIdentifier	 log
=	TokenNameEQUAL	
fu	TokenNameIdentifier	 fu
.	TokenNameDOT	
createTempFile	TokenNameIdentifier	 create Temp File
(	TokenNameLPAREN	
"propertyfilecli"	TokenNameStringLiteral	propertyfilecli
,	TokenNameCOMMA	
".log"	TokenNameStringLiteral	.log
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileWriter	TokenNameIdentifier	 File Writer
fw	TokenNameIdentifier	 fw
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
FileReader	TokenNameIdentifier	 File Reader
fr	TokenNameIdentifier	 fr
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
fw	TokenNameIdentifier	 fw
=	TokenNameEQUAL	
new	TokenNamenew	
FileWriter	TokenNameIdentifier	 File Writer
(	TokenNameLPAREN	
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fw	TokenNameIdentifier	 fw
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"w=world message=Hello, ${w} "	TokenNameStringLiteral	w=world message=Hello, ${w} 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fw	TokenNameIdentifier	 fw
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fw	TokenNameIdentifier	 fw
=	TokenNameEQUAL	
new	TokenNamenew	
FileWriter	TokenNameIdentifier	 File Writer
(	TokenNameLPAREN	
build	TokenNameIdentifier	 build
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fw	TokenNameIdentifier	 fw
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"<project><echo>${message}</echo></project>"	TokenNameStringLiteral	<project><echo>${message}</echo></project>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fw	TokenNameIdentifier	 fw
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fw	TokenNameIdentifier	 fw
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Main	TokenNameIdentifier	 Main
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
new	TokenNamenew	
NoExitMain	TokenNameIdentifier	 No Exit Main
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
startAnt	TokenNameIdentifier	 start Ant
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"-propertyfile"	TokenNameStringLiteral	-propertyfile
,	TokenNameCOMMA	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"-f"	TokenNameStringLiteral	-f
,	TokenNameCOMMA	
build	TokenNameIdentifier	 build
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"-l"	TokenNameStringLiteral	-l
,	TokenNameCOMMA	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
safeReadFully	TokenNameIdentifier	 safe Read Fully
(	TokenNameLPAREN	
fr	TokenNameIdentifier	 fr
=	TokenNameEQUAL	
new	TokenNamenew	
FileReader	TokenNameIdentifier	 File Reader
(	TokenNameLPAREN	
log	TokenNameIdentifier	 log
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"expected log to contain 'Hello, world' but was "	TokenNameStringLiteral	expected log to contain 'Hello, world' but was 
+	TokenNamePLUS	
l	TokenNameIdentifier	 l
,	TokenNameCOMMA	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"Hello, world"	TokenNameStringLiteral	Hello, world
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
fw	TokenNameIdentifier	 fw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
fr	TokenNameIdentifier	 fr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
NoExitMain	TokenNameIdentifier	 No Exit Main
extends	TokenNameextends	
Main	TokenNameIdentifier	 Main
{	TokenNameLBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
int	TokenNameint	
exitCode	TokenNameIdentifier	 exit Code
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
