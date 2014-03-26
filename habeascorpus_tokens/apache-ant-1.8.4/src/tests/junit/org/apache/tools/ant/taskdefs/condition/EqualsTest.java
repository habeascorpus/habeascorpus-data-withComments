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
condition	TokenNameIdentifier	 condition
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
/** * Testcase for the &lt;equals&gt; condition. * */	TokenNameCOMMENT_JAVADOC	 Testcase for the &lt;equals&gt; condition. 
public	TokenNamepublic	
class	TokenNameclass	
EqualsTest	TokenNameIdentifier	 Equals Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
EqualsTest	TokenNameIdentifier	 Equals Test
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
testTrim	TokenNameIdentifier	 test Trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Equals	TokenNameIdentifier	 Equals
eq	TokenNameIdentifier	 eq
=	TokenNameEQUAL	
new	TokenNamenew	
Equals	TokenNameIdentifier	 Equals
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eq	TokenNameIdentifier	 eq
.	TokenNameDOT	
setArg1	TokenNameIdentifier	 set Arg1
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eq	TokenNameIdentifier	 eq
.	TokenNameDOT	
setArg2	TokenNameIdentifier	 set Arg2
(	TokenNameLPAREN	
" a"	TokenNameStringLiteral	 a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
!	TokenNameNOT	
eq	TokenNameIdentifier	 eq
.	TokenNameDOT	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eq	TokenNameIdentifier	 eq
.	TokenNameDOT	
setTrim	TokenNameIdentifier	 set Trim
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
eq	TokenNameIdentifier	 eq
.	TokenNameDOT	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eq	TokenNameIdentifier	 eq
.	TokenNameDOT	
setArg2	TokenNameIdentifier	 set Arg2
(	TokenNameLPAREN	
"a "	TokenNameStringLiteral	a 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
eq	TokenNameIdentifier	 eq
.	TokenNameDOT	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCaseSensitive	TokenNameIdentifier	 test Case Sensitive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Equals	TokenNameIdentifier	 Equals
eq	TokenNameIdentifier	 eq
=	TokenNameEQUAL	
new	TokenNamenew	
Equals	TokenNameIdentifier	 Equals
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eq	TokenNameIdentifier	 eq
.	TokenNameDOT	
setArg1	TokenNameIdentifier	 set Arg1
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eq	TokenNameIdentifier	 eq
.	TokenNameDOT	
setArg2	TokenNameIdentifier	 set Arg2
(	TokenNameLPAREN	
"A"	TokenNameStringLiteral	A
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
!	TokenNameNOT	
eq	TokenNameIdentifier	 eq
.	TokenNameDOT	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eq	TokenNameIdentifier	 eq
.	TokenNameDOT	
setCasesensitive	TokenNameIdentifier	 set Casesensitive
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
eq	TokenNameIdentifier	 eq
.	TokenNameDOT	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
