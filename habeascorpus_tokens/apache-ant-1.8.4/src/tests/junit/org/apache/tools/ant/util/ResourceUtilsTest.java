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
util	TokenNameIdentifier	 util
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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
Echo	TokenNameIdentifier	 Echo
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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Resource	TokenNameIdentifier	 Resource
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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
ResourceFactory	TokenNameIdentifier	 Resource Factory
;	TokenNameSEMICOLON	
/** * Tests for org.apache.tools.ant.util.ResourceUtils. */	TokenNameCOMMENT_JAVADOC	 Tests for org.apache.tools.ant.util.ResourceUtils. 
public	TokenNamepublic	
class	TokenNameclass	
ResourceUtilsTest	TokenNameIdentifier	 Resource Utils Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
implements	TokenNameimplements	
ResourceFactory	TokenNameIdentifier	 Resource Factory
,	TokenNameCOMMA	
FileNameMapper	TokenNameIdentifier	 File Name Mapper
{	TokenNameLBRACE	
private	TokenNameprivate	
Echo	TokenNameIdentifier	 Echo
taskINeedForLogging	TokenNameIdentifier	 task I Need For Logging
=	TokenNameEQUAL	
new	TokenNamenew	
Echo	TokenNameIdentifier	 Echo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ResourceUtilsTest	TokenNameIdentifier	 Resource Utils Test
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
taskINeedForLogging	TokenNameIdentifier	 task I Need For Logging
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
new	TokenNamenew	
Project	TokenNameIdentifier	 Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNoDuplicates	TokenNameIdentifier	 test No Duplicates
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Resource	TokenNameIdentifier	 Resource
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
new	TokenNamenew	
Resource	TokenNameIdentifier	 Resource
(	TokenNameLPAREN	
"samual vimes"	TokenNameStringLiteral	samual vimes
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Resource	TokenNameIdentifier	 Resource
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
toNew	TokenNameIdentifier	 to New
=	TokenNameEQUAL	
ResourceUtils	TokenNameIdentifier	 Resource Utils
.	TokenNameDOT	
selectOutOfDateSources	TokenNameIdentifier	 select Out Of Date Sources
(	TokenNameLPAREN	
taskINeedForLogging	TokenNameIdentifier	 task I Need For Logging
,	TokenNameCOMMA	
new	TokenNamenew	
Resource	TokenNameIdentifier	 Resource
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
}	TokenNameRBRACE	
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
toNew	TokenNameIdentifier	 to New
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* ============ ResourceFactory interface ====================== */	TokenNameCOMMENT_BLOCK	 ============ ResourceFactory interface ====================== 
public	TokenNamepublic	
Resource	TokenNameIdentifier	 Resource
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Resource	TokenNameIdentifier	 Resource
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// implies lastModified == 0 	TokenNameCOMMENT_LINE	implies lastModified == 0 
}	TokenNameRBRACE	
/* ============ FileNameMapper interface ======================= */	TokenNameCOMMENT_BLOCK	 ============ FileNameMapper interface ======================= 
public	TokenNamepublic	
void	TokenNamevoid	
setFrom	TokenNameIdentifier	 set From
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setTo	TokenNameIdentifier	 set To
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mapFileName	TokenNameIdentifier	 map File Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"fred colon"	TokenNameStringLiteral	fred colon
,	TokenNameCOMMA	
"carrot ironfoundersson"	TokenNameStringLiteral	carrot ironfoundersson
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
