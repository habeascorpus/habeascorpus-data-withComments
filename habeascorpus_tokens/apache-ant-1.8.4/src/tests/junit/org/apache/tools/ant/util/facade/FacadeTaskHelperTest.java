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
.	TokenNameDOT	
facade	TokenNameIdentifier	 facade
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
/** * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 @since Ant 1.5 
public	TokenNamepublic	
class	TokenNameclass	
FacadeTaskHelperTest	TokenNameIdentifier	 Facade Task Helper Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
FacadeTaskHelperTest	TokenNameIdentifier	 Facade Task Helper Test
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
testPrecedenceRules	TokenNameIdentifier	 test Precedence Rules
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FacadeTaskHelper	TokenNameIdentifier	 Facade Task Helper
fth	TokenNameIdentifier	 fth
=	TokenNameEQUAL	
new	TokenNamenew	
FacadeTaskHelper	TokenNameIdentifier	 Facade Task Helper
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
fth	TokenNameIdentifier	 fth
.	TokenNameDOT	
getImplementation	TokenNameIdentifier	 get Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fth	TokenNameIdentifier	 fth
.	TokenNameDOT	
setMagicValue	TokenNameIdentifier	 set Magic Value
(	TokenNameLPAREN	
"bar"	TokenNameStringLiteral	bar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"bar"	TokenNameStringLiteral	bar
,	TokenNameCOMMA	
fth	TokenNameIdentifier	 fth
.	TokenNameDOT	
getImplementation	TokenNameIdentifier	 get Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fth	TokenNameIdentifier	 fth
=	TokenNameEQUAL	
new	TokenNamenew	
FacadeTaskHelper	TokenNameIdentifier	 Facade Task Helper
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
"bar"	TokenNameStringLiteral	bar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"bar"	TokenNameStringLiteral	bar
,	TokenNameCOMMA	
fth	TokenNameIdentifier	 fth
.	TokenNameDOT	
getImplementation	TokenNameIdentifier	 get Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fth	TokenNameIdentifier	 fth
=	TokenNameEQUAL	
new	TokenNamenew	
FacadeTaskHelper	TokenNameIdentifier	 Facade Task Helper
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
fth	TokenNameIdentifier	 fth
.	TokenNameDOT	
getImplementation	TokenNameIdentifier	 get Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fth	TokenNameIdentifier	 fth
=	TokenNameEQUAL	
new	TokenNamenew	
FacadeTaskHelper	TokenNameIdentifier	 Facade Task Helper
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fth	TokenNameIdentifier	 fth
.	TokenNameDOT	
setMagicValue	TokenNameIdentifier	 set Magic Value
(	TokenNameLPAREN	
"bar"	TokenNameStringLiteral	bar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fth	TokenNameIdentifier	 fth
.	TokenNameDOT	
setImplementation	TokenNameIdentifier	 set Implementation
(	TokenNameLPAREN	
"baz"	TokenNameStringLiteral	baz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"baz"	TokenNameStringLiteral	baz
,	TokenNameCOMMA	
fth	TokenNameIdentifier	 fth
.	TokenNameDOT	
getImplementation	TokenNameIdentifier	 get Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testHasBeenSet	TokenNameIdentifier	 test Has Been Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FacadeTaskHelper	TokenNameIdentifier	 Facade Task Helper
fth	TokenNameIdentifier	 fth
=	TokenNameEQUAL	
new	TokenNamenew	
FacadeTaskHelper	TokenNameIdentifier	 Facade Task Helper
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"nothing set"	TokenNameStringLiteral	nothing set
,	TokenNameCOMMA	
!	TokenNameNOT	
fth	TokenNameIdentifier	 fth
.	TokenNameDOT	
hasBeenSet	TokenNameIdentifier	 has Been Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fth	TokenNameIdentifier	 fth
.	TokenNameDOT	
setMagicValue	TokenNameIdentifier	 set Magic Value
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"magic has not been set"	TokenNameStringLiteral	magic has not been set
,	TokenNameCOMMA	
!	TokenNameNOT	
fth	TokenNameIdentifier	 fth
.	TokenNameDOT	
hasBeenSet	TokenNameIdentifier	 has Been Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fth	TokenNameIdentifier	 fth
.	TokenNameDOT	
setMagicValue	TokenNameIdentifier	 set Magic Value
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"magic has been set"	TokenNameStringLiteral	magic has been set
,	TokenNameCOMMA	
fth	TokenNameIdentifier	 fth
.	TokenNameDOT	
hasBeenSet	TokenNameIdentifier	 has Been Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fth	TokenNameIdentifier	 fth
.	TokenNameDOT	
setMagicValue	TokenNameIdentifier	 set Magic Value
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
!	TokenNameNOT	
fth	TokenNameIdentifier	 fth
.	TokenNameDOT	
hasBeenSet	TokenNameIdentifier	 has Been Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fth	TokenNameIdentifier	 fth
.	TokenNameDOT	
setImplementation	TokenNameIdentifier	 set Implementation
(	TokenNameLPAREN	
"baz"	TokenNameStringLiteral	baz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"set explicitly"	TokenNameStringLiteral	set explicitly
,	TokenNameCOMMA	
fth	TokenNameIdentifier	 fth
.	TokenNameDOT	
hasBeenSet	TokenNameIdentifier	 has Been Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
