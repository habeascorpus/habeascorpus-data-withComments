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
regexp	TokenNameIdentifier	 regexp
;	TokenNameSEMICOLON	
/** * Tests for all implementations of the Regexp interface. * */	TokenNameCOMMENT_JAVADOC	 Tests for all implementations of the Regexp interface. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
RegexpTest	TokenNameIdentifier	 Regexp Test
extends	TokenNameextends	
RegexpMatcherTest	TokenNameIdentifier	 Regexp Matcher Test
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
test	TokenNameIdentifier	 test
=	TokenNameEQUAL	
"abcdefg-abcdefg"	TokenNameStringLiteral	abcdefg-abcdefg
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
"ab([^d]*)d([^f]*)f"	TokenNameStringLiteral	ab([^d]*)d([^f]*)f
;	TokenNameSEMICOLON	
public	TokenNamepublic	
RegexpTest	TokenNameIdentifier	 Regexp Test
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
final	TokenNamefinal	
RegexpMatcher	TokenNameIdentifier	 Regexp Matcher
getImplementation	TokenNameIdentifier	 get Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getRegexpImplementation	TokenNameIdentifier	 get Regexp Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
abstract	TokenNameabstract	
Regexp	TokenNameIdentifier	 Regexp
getRegexpImplementation	TokenNameIdentifier	 get Regexp Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
testSubstitution	TokenNameIdentifier	 test Substitution
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Regexp	TokenNameIdentifier	 Regexp
reg	TokenNameIdentifier	 reg
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Regexp	TokenNameIdentifier	 Regexp
)	TokenNameRPAREN	
getReg	TokenNameIdentifier	 get Reg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"abedcfg-abcdefg"	TokenNameStringLiteral	abedcfg-abcdefg
,	TokenNameCOMMA	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
substitute	TokenNameIdentifier	 substitute
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
,	TokenNameCOMMA	
"ab\2d\1f"	TokenNameStringLiteral	ab\2d\1f
,	TokenNameCOMMA	
Regexp	TokenNameIdentifier	 Regexp
.	TokenNameDOT	
MATCH_DEFAULT	TokenNameIdentifier	 MATCH  DEFAULT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testReplaceFirstSubstitution	TokenNameIdentifier	 test Replace First Substitution
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Regexp	TokenNameIdentifier	 Regexp
reg	TokenNameIdentifier	 reg
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Regexp	TokenNameIdentifier	 Regexp
)	TokenNameRPAREN	
getReg	TokenNameIdentifier	 get Reg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"abedcfg-abcdefg"	TokenNameStringLiteral	abedcfg-abcdefg
,	TokenNameCOMMA	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
substitute	TokenNameIdentifier	 substitute
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
,	TokenNameCOMMA	
"ab\2d\1f"	TokenNameStringLiteral	ab\2d\1f
,	TokenNameCOMMA	
Regexp	TokenNameIdentifier	 Regexp
.	TokenNameDOT	
REPLACE_FIRST	TokenNameIdentifier	 REPLACE  FIRST
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testReplaceAllSubstitution	TokenNameIdentifier	 test Replace All Substitution
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Regexp	TokenNameIdentifier	 Regexp
reg	TokenNameIdentifier	 reg
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Regexp	TokenNameIdentifier	 Regexp
)	TokenNameRPAREN	
getReg	TokenNameIdentifier	 get Reg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"abedcfg-abedcfg"	TokenNameStringLiteral	abedcfg-abedcfg
,	TokenNameCOMMA	
reg	TokenNameIdentifier	 reg
.	TokenNameDOT	
substitute	TokenNameIdentifier	 substitute
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
,	TokenNameCOMMA	
"ab\2d\1f"	TokenNameStringLiteral	ab\2d\1f
,	TokenNameCOMMA	
Regexp	TokenNameIdentifier	 Regexp
.	TokenNameDOT	
REPLACE_ALL	TokenNameIdentifier	 REPLACE  ALL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
