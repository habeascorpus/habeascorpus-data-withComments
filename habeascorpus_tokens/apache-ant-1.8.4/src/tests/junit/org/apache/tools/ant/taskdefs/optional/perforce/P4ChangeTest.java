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
.	TokenNameDOT	
perforce	TokenNameIdentifier	 perforce
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
oro	TokenNameIdentifier	 oro
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
perl	TokenNameIdentifier	 perl
.	TokenNameDOT	
Perl5Util	TokenNameIdentifier	 Perl5 Util
;	TokenNameSEMICOLON	
/** * Basic testcase to ensure that backslashing is OK. */	TokenNameCOMMENT_JAVADOC	 Basic testcase to ensure that backslashing is OK. 
public	TokenNamepublic	
class	TokenNameclass	
P4ChangeTest	TokenNameIdentifier	 P4 Change Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
protected	TokenNameprotected	
P4Change	TokenNameIdentifier	 P4 Change
p4change	TokenNameIdentifier	 p4change
;	TokenNameSEMICOLON	
public	TokenNamepublic	
P4ChangeTest	TokenNameIdentifier	 P4 Change Test
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
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
p4change	TokenNameIdentifier	 p4change
=	TokenNameEQUAL	
new	TokenNamenew	
P4Change	TokenNameIdentifier	 P4 Change
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBackslash	TokenNameIdentifier	 test Backslash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
"comment with a / inside"	TokenNameStringLiteral	comment with a / inside
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
P4Change	TokenNameIdentifier	 P4 Change
.	TokenNameDOT	
backslash	TokenNameIdentifier	 backslash
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"comment with a \/ inside"	TokenNameStringLiteral	comment with a \/ inside
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSubstitute	TokenNameIdentifier	 test Substitute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Perl5Util	TokenNameIdentifier	 Perl5 Util
util	TokenNameIdentifier	 util
=	TokenNameEQUAL	
new	TokenNamenew	
Perl5Util	TokenNameIdentifier	 Perl5 Util
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
tosubstitute	TokenNameIdentifier	 tosubstitute
=	TokenNameEQUAL	
"xx<here>xx"	TokenNameStringLiteral	xx<here>xx
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
P4Change	TokenNameIdentifier	 P4 Change
.	TokenNameDOT	
backslash	TokenNameIdentifier	 backslash
(	TokenNameLPAREN	
"/a/b/c/"	TokenNameStringLiteral	/a/b/c/
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
substitute	TokenNameIdentifier	 substitute
(	TokenNameLPAREN	
"s/<here>/"	TokenNameStringLiteral	s/<here>/
+	TokenNamePLUS	
input	TokenNameIdentifier	 input
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
,	TokenNameCOMMA	
tosubstitute	TokenNameIdentifier	 tosubstitute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"xx/a/b/c/xx"	TokenNameStringLiteral	xx/a/b/c/xx
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
