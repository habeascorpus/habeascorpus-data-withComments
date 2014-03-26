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
email	TokenNameIdentifier	 email
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
/** * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 @since Ant 1.6 
public	TokenNamepublic	
class	TokenNameclass	
EmailAddressTest	TokenNameIdentifier	 Email Address Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
EmailAddressTest	TokenNameIdentifier	 Email Address Test
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
test1	TokenNameIdentifier	 test1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectNameAddress	TokenNameIdentifier	 expect Name Address
(	TokenNameLPAREN	
new	TokenNamenew	
EmailAddress	TokenNameIdentifier	 Email Address
(	TokenNameLPAREN	
"address (name)"	TokenNameStringLiteral	address (name)
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test2	TokenNameIdentifier	 test2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectNameAddress	TokenNameIdentifier	 expect Name Address
(	TokenNameLPAREN	
new	TokenNamenew	
EmailAddress	TokenNameIdentifier	 Email Address
(	TokenNameLPAREN	
"(name) address"	TokenNameStringLiteral	(name) address
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test3	TokenNameIdentifier	 test3
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectNameAddress	TokenNameIdentifier	 expect Name Address
(	TokenNameLPAREN	
new	TokenNamenew	
EmailAddress	TokenNameIdentifier	 Email Address
(	TokenNameLPAREN	
"name <address>"	TokenNameStringLiteral	name <address>
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test4	TokenNameIdentifier	 test4
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectNameAddress	TokenNameIdentifier	 expect Name Address
(	TokenNameLPAREN	
new	TokenNamenew	
EmailAddress	TokenNameIdentifier	 Email Address
(	TokenNameLPAREN	
"<address> name"	TokenNameStringLiteral	<address> name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test5	TokenNameIdentifier	 test5
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectNameAddress	TokenNameIdentifier	 expect Name Address
(	TokenNameLPAREN	
new	TokenNamenew	
EmailAddress	TokenNameIdentifier	 Email Address
(	TokenNameLPAREN	
"<address> (name)"	TokenNameStringLiteral	<address> (name)
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test6	TokenNameIdentifier	 test6
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectNameAddress	TokenNameIdentifier	 expect Name Address
(	TokenNameLPAREN	
new	TokenNamenew	
EmailAddress	TokenNameIdentifier	 Email Address
(	TokenNameLPAREN	
"(name) <address>"	TokenNameStringLiteral	(name) <address>
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test7	TokenNameIdentifier	 test7
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectNameAddress2	TokenNameIdentifier	 expect Name Address2
(	TokenNameLPAREN	
new	TokenNamenew	
EmailAddress	TokenNameIdentifier	 Email Address
(	TokenNameLPAREN	
"address (<name>)"	TokenNameStringLiteral	address (<name>)
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test8	TokenNameIdentifier	 test8
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectNameAddress2	TokenNameIdentifier	 expect Name Address2
(	TokenNameLPAREN	
new	TokenNamenew	
EmailAddress	TokenNameIdentifier	 Email Address
(	TokenNameLPAREN	
"(<name>) address"	TokenNameStringLiteral	(<name>) address
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test9	TokenNameIdentifier	 test9
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectNameAddress3	TokenNameIdentifier	 expect Name Address3
(	TokenNameLPAREN	
new	TokenNamenew	
EmailAddress	TokenNameIdentifier	 Email Address
(	TokenNameLPAREN	
"address"	TokenNameStringLiteral	address
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testA	TokenNameIdentifier	 test A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectNameAddress3	TokenNameIdentifier	 expect Name Address3
(	TokenNameLPAREN	
new	TokenNamenew	
EmailAddress	TokenNameIdentifier	 Email Address
(	TokenNameLPAREN	
"<address>"	TokenNameStringLiteral	<address>
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testB	TokenNameIdentifier	 test B
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectNameAddress3	TokenNameIdentifier	 expect Name Address3
(	TokenNameLPAREN	
new	TokenNamenew	
EmailAddress	TokenNameIdentifier	 Email Address
(	TokenNameLPAREN	
" <address> "	TokenNameStringLiteral	 <address> 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testC	TokenNameIdentifier	 test C
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectNameAddress3	TokenNameIdentifier	 expect Name Address3
(	TokenNameLPAREN	
new	TokenNamenew	
EmailAddress	TokenNameIdentifier	 Email Address
(	TokenNameLPAREN	
"< address >"	TokenNameStringLiteral	< address >
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testD	TokenNameIdentifier	 test D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expectNameAddress3	TokenNameIdentifier	 expect Name Address3
(	TokenNameLPAREN	
new	TokenNamenew	
EmailAddress	TokenNameIdentifier	 Email Address
(	TokenNameLPAREN	
" < address > "	TokenNameStringLiteral	 < address > 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
expectNameAddress	TokenNameIdentifier	 expect Name Address
(	TokenNameLPAREN	
EmailAddress	TokenNameIdentifier	 Email Address
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"name"	TokenNameStringLiteral	name
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"address"	TokenNameStringLiteral	address
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getAddress	TokenNameIdentifier	 get Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// where the name contains <> 	TokenNameCOMMENT_LINE	where the name contains <> 
private	TokenNameprivate	
void	TokenNamevoid	
expectNameAddress2	TokenNameIdentifier	 expect Name Address2
(	TokenNameLPAREN	
EmailAddress	TokenNameIdentifier	 Email Address
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"<name>"	TokenNameStringLiteral	<name>
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"address"	TokenNameStringLiteral	address
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getAddress	TokenNameIdentifier	 get Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// where only an address is supplied 	TokenNameCOMMENT_LINE	where only an address is supplied 
private	TokenNameprivate	
void	TokenNamevoid	
expectNameAddress3	TokenNameIdentifier	 expect Name Address3
(	TokenNameLPAREN	
EmailAddress	TokenNameIdentifier	 Email Address
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Expected null, found <"	TokenNameStringLiteral	Expected null, found <
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
">"	TokenNameStringLiteral	>
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"address"	TokenNameStringLiteral	address
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getAddress	TokenNameIdentifier	 get Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
