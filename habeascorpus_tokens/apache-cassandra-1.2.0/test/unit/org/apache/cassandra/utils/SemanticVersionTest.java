/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
SemanticVersionTest	TokenNameIdentifier	 Semantic Version Test
{	TokenNameLBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testParsing	TokenNameIdentifier	 test Parsing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SemanticVersion	TokenNameIdentifier	 Semantic Version
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
new	TokenNamenew	
SemanticVersion	TokenNameIdentifier	 Semantic Version
(	TokenNameLPAREN	
"1.2.3"	TokenNameStringLiteral	1.2.3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
major	TokenNameIdentifier	 major
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
minor	TokenNameIdentifier	 minor
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
patch	TokenNameIdentifier	 patch
==	TokenNameEQUAL_EQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
new	TokenNamenew	
SemanticVersion	TokenNameIdentifier	 Semantic Version
(	TokenNameLPAREN	
"1.2.3-foo.2+Bar"	TokenNameStringLiteral	1.2.3-foo.2+Bar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
major	TokenNameIdentifier	 major
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
minor	TokenNameIdentifier	 minor
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
patch	TokenNameIdentifier	 patch
==	TokenNameEQUAL_EQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testComparison	TokenNameIdentifier	 test Comparison
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SemanticVersion	TokenNameIdentifier	 Semantic Version
v1	TokenNameIdentifier	 v1
,	TokenNameCOMMA	
v2	TokenNameIdentifier	 v2
;	TokenNameSEMICOLON	
v1	TokenNameIdentifier	 v1
=	TokenNameEQUAL	
new	TokenNamenew	
SemanticVersion	TokenNameIdentifier	 Semantic Version
(	TokenNameLPAREN	
"1.2.3"	TokenNameStringLiteral	1.2.3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
new	TokenNamenew	
SemanticVersion	TokenNameIdentifier	 Semantic Version
(	TokenNameLPAREN	
"1.2.4"	TokenNameStringLiteral	1.2.4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
v1	TokenNameIdentifier	 v1
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
v1	TokenNameIdentifier	 v1
=	TokenNameEQUAL	
new	TokenNamenew	
SemanticVersion	TokenNameIdentifier	 Semantic Version
(	TokenNameLPAREN	
"1.2.3"	TokenNameStringLiteral	1.2.3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
new	TokenNamenew	
SemanticVersion	TokenNameIdentifier	 Semantic Version
(	TokenNameLPAREN	
"1.2.3"	TokenNameStringLiteral	1.2.3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
v1	TokenNameIdentifier	 v1
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
v1	TokenNameIdentifier	 v1
=	TokenNameEQUAL	
new	TokenNamenew	
SemanticVersion	TokenNameIdentifier	 Semantic Version
(	TokenNameLPAREN	
"1.2.3"	TokenNameStringLiteral	1.2.3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
new	TokenNamenew	
SemanticVersion	TokenNameIdentifier	 Semantic Version
(	TokenNameLPAREN	
"2.0.0"	TokenNameStringLiteral	2.0.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
v1	TokenNameIdentifier	 v1
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
v1	TokenNameIdentifier	 v1
=	TokenNameEQUAL	
new	TokenNamenew	
SemanticVersion	TokenNameIdentifier	 Semantic Version
(	TokenNameLPAREN	
"1.2.3"	TokenNameStringLiteral	1.2.3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
new	TokenNamenew	
SemanticVersion	TokenNameIdentifier	 Semantic Version
(	TokenNameLPAREN	
"1.2.3-alpha"	TokenNameStringLiteral	1.2.3-alpha
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
v1	TokenNameIdentifier	 v1
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
v1	TokenNameIdentifier	 v1
=	TokenNameEQUAL	
new	TokenNamenew	
SemanticVersion	TokenNameIdentifier	 Semantic Version
(	TokenNameLPAREN	
"1.2.3"	TokenNameStringLiteral	1.2.3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
new	TokenNamenew	
SemanticVersion	TokenNameIdentifier	 Semantic Version
(	TokenNameLPAREN	
"1.2.3+foo"	TokenNameStringLiteral	1.2.3+foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
v1	TokenNameIdentifier	 v1
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
v1	TokenNameIdentifier	 v1
=	TokenNameEQUAL	
new	TokenNamenew	
SemanticVersion	TokenNameIdentifier	 Semantic Version
(	TokenNameLPAREN	
"1.2.3"	TokenNameStringLiteral	1.2.3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
new	TokenNamenew	
SemanticVersion	TokenNameIdentifier	 Semantic Version
(	TokenNameLPAREN	
"1.2.3-alpha+foo"	TokenNameStringLiteral	1.2.3-alpha+foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
v1	TokenNameIdentifier	 v1
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testIsSupportedBy	TokenNameIdentifier	 test Is Supported By
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SemanticVersion	TokenNameIdentifier	 Semantic Version
v1	TokenNameIdentifier	 v1
,	TokenNameCOMMA	
v2	TokenNameIdentifier	 v2
;	TokenNameSEMICOLON	
v1	TokenNameIdentifier	 v1
=	TokenNameEQUAL	
new	TokenNamenew	
SemanticVersion	TokenNameIdentifier	 Semantic Version
(	TokenNameLPAREN	
"1.2.3"	TokenNameStringLiteral	1.2.3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
new	TokenNamenew	
SemanticVersion	TokenNameIdentifier	 Semantic Version
(	TokenNameLPAREN	
"1.2.4"	TokenNameStringLiteral	1.2.4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
v1	TokenNameIdentifier	 v1
.	TokenNameDOT	
isSupportedBy	TokenNameIdentifier	 is Supported By
(	TokenNameLPAREN	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
v2	TokenNameIdentifier	 v2
.	TokenNameDOT	
isSupportedBy	TokenNameIdentifier	 is Supported By
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v1	TokenNameIdentifier	 v1
=	TokenNameEQUAL	
new	TokenNamenew	
SemanticVersion	TokenNameIdentifier	 Semantic Version
(	TokenNameLPAREN	
"1.2.3"	TokenNameStringLiteral	1.2.3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
new	TokenNamenew	
SemanticVersion	TokenNameIdentifier	 Semantic Version
(	TokenNameLPAREN	
"1.3.3"	TokenNameStringLiteral	1.3.3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
v1	TokenNameIdentifier	 v1
.	TokenNameDOT	
isSupportedBy	TokenNameIdentifier	 is Supported By
(	TokenNameLPAREN	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
v2	TokenNameIdentifier	 v2
.	TokenNameDOT	
isSupportedBy	TokenNameIdentifier	 is Supported By
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v1	TokenNameIdentifier	 v1
=	TokenNameEQUAL	
new	TokenNamenew	
SemanticVersion	TokenNameIdentifier	 Semantic Version
(	TokenNameLPAREN	
"2.2.3"	TokenNameStringLiteral	2.2.3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
new	TokenNamenew	
SemanticVersion	TokenNameIdentifier	 Semantic Version
(	TokenNameLPAREN	
"1.3.3"	TokenNameStringLiteral	1.3.3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
v1	TokenNameIdentifier	 v1
.	TokenNameDOT	
isSupportedBy	TokenNameIdentifier	 is Supported By
(	TokenNameLPAREN	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
v2	TokenNameIdentifier	 v2
.	TokenNameDOT	
isSupportedBy	TokenNameIdentifier	 is Supported By
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testInvalid	TokenNameIdentifier	 test Invalid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertThrows	TokenNameIdentifier	 assert Throws
(	TokenNameLPAREN	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertThrows	TokenNameIdentifier	 assert Throws
(	TokenNameLPAREN	
"1.0.0a"	TokenNameStringLiteral	1.0.0a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertThrows	TokenNameIdentifier	 assert Throws
(	TokenNameLPAREN	
"1.a.4"	TokenNameStringLiteral	1.a.4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertThrows	TokenNameIdentifier	 assert Throws
(	TokenNameLPAREN	
"1.0.0-foo&"	TokenNameStringLiteral	1.0.0-foo&
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
assertThrows	TokenNameIdentifier	 assert Throws
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
new	TokenNamenew	
SemanticVersion	TokenNameIdentifier	 Semantic Version
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
