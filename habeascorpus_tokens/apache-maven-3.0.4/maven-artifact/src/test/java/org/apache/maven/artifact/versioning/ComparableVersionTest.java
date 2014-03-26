package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
versioning	TokenNameIdentifier	 versioning
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
/** * Test ComparableVersion. * * @author <a href="mailto:hboutemy@apache.org">Hervé Boutemy</a> */	TokenNameCOMMENT_JAVADOC	 Test ComparableVersion. * @author <a href="mailto:hboutemy@apache.org">Hervé Boutemy</a> 
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unchecked"	TokenNameStringLiteral	unchecked
)	TokenNameRPAREN	
public	TokenNamepublic	
class	TokenNameclass	
ComparableVersionTest	TokenNameIdentifier	 Comparable Version Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
Comparable	TokenNameIdentifier	 Comparable
newComparable	TokenNameIdentifier	 new Comparable
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ComparableVersion	TokenNameIdentifier	 Comparable Version
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
VERSIONS_QUALIFIER	TokenNameIdentifier	 VERSIONS  QUALIFIER
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"1-alpha2snapshot"	TokenNameStringLiteral	1-alpha2snapshot
,	TokenNameCOMMA	
"1-alpha2"	TokenNameStringLiteral	1-alpha2
,	TokenNameCOMMA	
"1-alpha-123"	TokenNameStringLiteral	1-alpha-123
,	TokenNameCOMMA	
"1-beta-2"	TokenNameStringLiteral	1-beta-2
,	TokenNameCOMMA	
"1-beta123"	TokenNameStringLiteral	1-beta123
,	TokenNameCOMMA	
"1-m2"	TokenNameStringLiteral	1-m2
,	TokenNameCOMMA	
"1-m11"	TokenNameStringLiteral	1-m11
,	TokenNameCOMMA	
"1-rc"	TokenNameStringLiteral	1-rc
,	TokenNameCOMMA	
"1-cr2"	TokenNameStringLiteral	1-cr2
,	TokenNameCOMMA	
"1-rc123"	TokenNameStringLiteral	1-rc123
,	TokenNameCOMMA	
"1-SNAPSHOT"	TokenNameStringLiteral	1-SNAPSHOT
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
"1-sp"	TokenNameStringLiteral	1-sp
,	TokenNameCOMMA	
"1-sp2"	TokenNameStringLiteral	1-sp2
,	TokenNameCOMMA	
"1-sp123"	TokenNameStringLiteral	1-sp123
,	TokenNameCOMMA	
"1-abc"	TokenNameStringLiteral	1-abc
,	TokenNameCOMMA	
"1-def"	TokenNameStringLiteral	1-def
,	TokenNameCOMMA	
"1-pom-1"	TokenNameStringLiteral	1-pom-1
,	TokenNameCOMMA	
"1-1-snapshot"	TokenNameStringLiteral	1-1-snapshot
,	TokenNameCOMMA	
"1-1"	TokenNameStringLiteral	1-1
,	TokenNameCOMMA	
"1-2"	TokenNameStringLiteral	1-2
,	TokenNameCOMMA	
"1-123"	TokenNameStringLiteral	1-123
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
VERSIONS_NUMBER	TokenNameIdentifier	 VERSIONS  NUMBER
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"2.0"	TokenNameStringLiteral	2.0
,	TokenNameCOMMA	
"2-1"	TokenNameStringLiteral	2-1
,	TokenNameCOMMA	
"2.0.a"	TokenNameStringLiteral	2.0.a
,	TokenNameCOMMA	
"2.0.0.a"	TokenNameStringLiteral	2.0.0.a
,	TokenNameCOMMA	
"2.0.2"	TokenNameStringLiteral	2.0.2
,	TokenNameCOMMA	
"2.0.123"	TokenNameStringLiteral	2.0.123
,	TokenNameCOMMA	
"2.1.0"	TokenNameStringLiteral	2.1.0
,	TokenNameCOMMA	
"2.1-a"	TokenNameStringLiteral	2.1-a
,	TokenNameCOMMA	
"2.1b"	TokenNameStringLiteral	2.1b
,	TokenNameCOMMA	
"2.1-c"	TokenNameStringLiteral	2.1-c
,	TokenNameCOMMA	
"2.1-1"	TokenNameStringLiteral	2.1-1
,	TokenNameCOMMA	
"2.1.0.1"	TokenNameStringLiteral	2.1.0.1
,	TokenNameCOMMA	
"2.2"	TokenNameStringLiteral	2.2
,	TokenNameCOMMA	
"2.123"	TokenNameStringLiteral	2.123
,	TokenNameCOMMA	
"11.a2"	TokenNameStringLiteral	11.a2
,	TokenNameCOMMA	
"11.a11"	TokenNameStringLiteral	11.a11
,	TokenNameCOMMA	
"11.b2"	TokenNameStringLiteral	11.b2
,	TokenNameCOMMA	
"11.b11"	TokenNameStringLiteral	11.b11
,	TokenNameCOMMA	
"11.m2"	TokenNameStringLiteral	11.m2
,	TokenNameCOMMA	
"11.m11"	TokenNameStringLiteral	11.m11
,	TokenNameCOMMA	
"11"	TokenNameStringLiteral	11
,	TokenNameCOMMA	
"11.a"	TokenNameStringLiteral	11.a
,	TokenNameCOMMA	
"11b"	TokenNameStringLiteral	11b
,	TokenNameCOMMA	
"11c"	TokenNameStringLiteral	11c
,	TokenNameCOMMA	
"11m"	TokenNameStringLiteral	11m
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
void	TokenNamevoid	
checkVersionsOrder	TokenNameIdentifier	 check Versions Order
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
versions	TokenNameIdentifier	 versions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Comparable	TokenNameIdentifier	 Comparable
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
new	TokenNamenew	
Comparable	TokenNameIdentifier	 Comparable
[	TokenNameLBRACKET	
versions	TokenNameIdentifier	 versions
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
versions	TokenNameIdentifier	 versions
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
newComparable	TokenNameIdentifier	 new Comparable
(	TokenNameLPAREN	
versions	TokenNameIdentifier	 versions
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
versions	TokenNameIdentifier	 versions
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Comparable	TokenNameIdentifier	 Comparable
low	TokenNameIdentifier	 low
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
versions	TokenNameIdentifier	 versions
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Comparable	TokenNameIdentifier	 Comparable
high	TokenNameIdentifier	 high
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"expected "	TokenNameStringLiteral	expected 
+	TokenNamePLUS	
low	TokenNameIdentifier	 low
+	TokenNamePLUS	
" < "	TokenNameStringLiteral	 < 
+	TokenNamePLUS	
high	TokenNameIdentifier	 high
,	TokenNameCOMMA	
low	TokenNameIdentifier	 low
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
high	TokenNameIdentifier	 high
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"expected "	TokenNameStringLiteral	expected 
+	TokenNamePLUS	
high	TokenNameIdentifier	 high
+	TokenNamePLUS	
" > "	TokenNameStringLiteral	 > 
+	TokenNamePLUS	
low	TokenNameIdentifier	 low
,	TokenNameCOMMA	
high	TokenNameIdentifier	 high
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
low	TokenNameIdentifier	 low
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
checkVersionsEqual	TokenNameIdentifier	 check Versions Equal
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
v1	TokenNameIdentifier	 v1
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Comparable	TokenNameIdentifier	 Comparable
c1	TokenNameIdentifier	 c1
=	TokenNameEQUAL	
newComparable	TokenNameIdentifier	 new Comparable
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Comparable	TokenNameIdentifier	 Comparable
c2	TokenNameIdentifier	 c2
=	TokenNameEQUAL	
newComparable	TokenNameIdentifier	 new Comparable
(	TokenNameLPAREN	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"expected "	TokenNameStringLiteral	expected 
+	TokenNamePLUS	
v1	TokenNameIdentifier	 v1
+	TokenNamePLUS	
" == "	TokenNameStringLiteral	 == 
+	TokenNamePLUS	
v2	TokenNameIdentifier	 v2
,	TokenNameCOMMA	
c1	TokenNameIdentifier	 c1
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
c2	TokenNameIdentifier	 c2
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"expected "	TokenNameStringLiteral	expected 
+	TokenNamePLUS	
v2	TokenNameIdentifier	 v2
+	TokenNamePLUS	
" == "	TokenNameStringLiteral	 == 
+	TokenNamePLUS	
v1	TokenNameIdentifier	 v1
,	TokenNameCOMMA	
c2	TokenNameIdentifier	 c2
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
c1	TokenNameIdentifier	 c1
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"expected same hashcode for "	TokenNameStringLiteral	expected same hashcode for 
+	TokenNamePLUS	
v1	TokenNameIdentifier	 v1
+	TokenNamePLUS	
" and "	TokenNameStringLiteral	 and 
+	TokenNamePLUS	
v2	TokenNameIdentifier	 v2
,	TokenNameCOMMA	
c1	TokenNameIdentifier	 c1
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
c2	TokenNameIdentifier	 c2
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"expected "	TokenNameStringLiteral	expected 
+	TokenNamePLUS	
v1	TokenNameIdentifier	 v1
+	TokenNamePLUS	
".equals( "	TokenNameStringLiteral	.equals( 
+	TokenNamePLUS	
v2	TokenNameIdentifier	 v2
+	TokenNamePLUS	
" )"	TokenNameStringLiteral	 )
,	TokenNameCOMMA	
c1	TokenNameIdentifier	 c1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
c2	TokenNameIdentifier	 c2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"expected "	TokenNameStringLiteral	expected 
+	TokenNamePLUS	
v2	TokenNameIdentifier	 v2
+	TokenNamePLUS	
".equals( "	TokenNameStringLiteral	.equals( 
+	TokenNamePLUS	
v1	TokenNameIdentifier	 v1
+	TokenNamePLUS	
" )"	TokenNameStringLiteral	 )
,	TokenNameCOMMA	
c2	TokenNameIdentifier	 c2
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
c1	TokenNameIdentifier	 c1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
checkVersionsOrder	TokenNameIdentifier	 check Versions Order
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
v1	TokenNameIdentifier	 v1
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Comparable	TokenNameIdentifier	 Comparable
c1	TokenNameIdentifier	 c1
=	TokenNameEQUAL	
newComparable	TokenNameIdentifier	 new Comparable
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Comparable	TokenNameIdentifier	 Comparable
c2	TokenNameIdentifier	 c2
=	TokenNameEQUAL	
newComparable	TokenNameIdentifier	 new Comparable
(	TokenNameLPAREN	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"expected "	TokenNameStringLiteral	expected 
+	TokenNamePLUS	
v1	TokenNameIdentifier	 v1
+	TokenNamePLUS	
" < "	TokenNameStringLiteral	 < 
+	TokenNamePLUS	
v2	TokenNameIdentifier	 v2
,	TokenNameCOMMA	
c1	TokenNameIdentifier	 c1
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
c2	TokenNameIdentifier	 c2
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"expected "	TokenNameStringLiteral	expected 
+	TokenNamePLUS	
v2	TokenNameIdentifier	 v2
+	TokenNamePLUS	
" > "	TokenNameStringLiteral	 > 
+	TokenNamePLUS	
v1	TokenNameIdentifier	 v1
,	TokenNameCOMMA	
c2	TokenNameIdentifier	 c2
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
c1	TokenNameIdentifier	 c1
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testVersionsQualifier	TokenNameIdentifier	 test Versions Qualifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkVersionsOrder	TokenNameIdentifier	 check Versions Order
(	TokenNameLPAREN	
VERSIONS_QUALIFIER	TokenNameIdentifier	 VERSIONS  QUALIFIER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testVersionsNumber	TokenNameIdentifier	 test Versions Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkVersionsOrder	TokenNameIdentifier	 check Versions Order
(	TokenNameLPAREN	
VERSIONS_NUMBER	TokenNameIdentifier	 VERSIONS  NUMBER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testVersionsEqual	TokenNameIdentifier	 test Versions Equal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkVersionsEqual	TokenNameIdentifier	 check Versions Equal
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsEqual	TokenNameIdentifier	 check Versions Equal
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsEqual	TokenNameIdentifier	 check Versions Equal
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
"1.0.0"	TokenNameStringLiteral	1.0.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsEqual	TokenNameIdentifier	 check Versions Equal
(	TokenNameLPAREN	
"1.0"	TokenNameStringLiteral	1.0
,	TokenNameCOMMA	
"1.0.0"	TokenNameStringLiteral	1.0.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsEqual	TokenNameIdentifier	 check Versions Equal
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
"1-0"	TokenNameStringLiteral	1-0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsEqual	TokenNameIdentifier	 check Versions Equal
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
"1.0-0"	TokenNameStringLiteral	1.0-0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsEqual	TokenNameIdentifier	 check Versions Equal
(	TokenNameLPAREN	
"1.0"	TokenNameStringLiteral	1.0
,	TokenNameCOMMA	
"1.0-0"	TokenNameStringLiteral	1.0-0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// no separator between number and character 	TokenNameCOMMENT_LINE	no separator between number and character 
checkVersionsEqual	TokenNameIdentifier	 check Versions Equal
(	TokenNameLPAREN	
"1a"	TokenNameStringLiteral	1a
,	TokenNameCOMMA	
"1.a"	TokenNameStringLiteral	1.a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsEqual	TokenNameIdentifier	 check Versions Equal
(	TokenNameLPAREN	
"1a"	TokenNameStringLiteral	1a
,	TokenNameCOMMA	
"1-a"	TokenNameStringLiteral	1-a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsEqual	TokenNameIdentifier	 check Versions Equal
(	TokenNameLPAREN	
"1a"	TokenNameStringLiteral	1a
,	TokenNameCOMMA	
"1.0-a"	TokenNameStringLiteral	1.0-a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsEqual	TokenNameIdentifier	 check Versions Equal
(	TokenNameLPAREN	
"1a"	TokenNameStringLiteral	1a
,	TokenNameCOMMA	
"1.0.0-a"	TokenNameStringLiteral	1.0.0-a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsEqual	TokenNameIdentifier	 check Versions Equal
(	TokenNameLPAREN	
"1.0a"	TokenNameStringLiteral	1.0a
,	TokenNameCOMMA	
"1.0.a"	TokenNameStringLiteral	1.0.a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsEqual	TokenNameIdentifier	 check Versions Equal
(	TokenNameLPAREN	
"1.0.0a"	TokenNameStringLiteral	1.0.0a
,	TokenNameCOMMA	
"1.0.0.a"	TokenNameStringLiteral	1.0.0.a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsEqual	TokenNameIdentifier	 check Versions Equal
(	TokenNameLPAREN	
"1x"	TokenNameStringLiteral	1x
,	TokenNameCOMMA	
"1.x"	TokenNameStringLiteral	1.x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsEqual	TokenNameIdentifier	 check Versions Equal
(	TokenNameLPAREN	
"1x"	TokenNameStringLiteral	1x
,	TokenNameCOMMA	
"1-x"	TokenNameStringLiteral	1-x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsEqual	TokenNameIdentifier	 check Versions Equal
(	TokenNameLPAREN	
"1x"	TokenNameStringLiteral	1x
,	TokenNameCOMMA	
"1.0-x"	TokenNameStringLiteral	1.0-x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsEqual	TokenNameIdentifier	 check Versions Equal
(	TokenNameLPAREN	
"1x"	TokenNameStringLiteral	1x
,	TokenNameCOMMA	
"1.0.0-x"	TokenNameStringLiteral	1.0.0-x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsEqual	TokenNameIdentifier	 check Versions Equal
(	TokenNameLPAREN	
"1.0x"	TokenNameStringLiteral	1.0x
,	TokenNameCOMMA	
"1.0.x"	TokenNameStringLiteral	1.0.x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsEqual	TokenNameIdentifier	 check Versions Equal
(	TokenNameLPAREN	
"1.0.0x"	TokenNameStringLiteral	1.0.0x
,	TokenNameCOMMA	
"1.0.0.x"	TokenNameStringLiteral	1.0.0.x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// aliases 	TokenNameCOMMENT_LINE	aliases 
checkVersionsEqual	TokenNameIdentifier	 check Versions Equal
(	TokenNameLPAREN	
"1ga"	TokenNameStringLiteral	1ga
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsEqual	TokenNameIdentifier	 check Versions Equal
(	TokenNameLPAREN	
"1final"	TokenNameStringLiteral	1final
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsEqual	TokenNameIdentifier	 check Versions Equal
(	TokenNameLPAREN	
"1cr"	TokenNameStringLiteral	1cr
,	TokenNameCOMMA	
"1rc"	TokenNameStringLiteral	1rc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// special "aliases" a, b and m for alpha, beta and milestone 	TokenNameCOMMENT_LINE	special "aliases" a, b and m for alpha, beta and milestone 
checkVersionsEqual	TokenNameIdentifier	 check Versions Equal
(	TokenNameLPAREN	
"1a1"	TokenNameStringLiteral	1a1
,	TokenNameCOMMA	
"1alpha1"	TokenNameStringLiteral	1alpha1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsEqual	TokenNameIdentifier	 check Versions Equal
(	TokenNameLPAREN	
"1b2"	TokenNameStringLiteral	1b2
,	TokenNameCOMMA	
"1beta2"	TokenNameStringLiteral	1beta2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsEqual	TokenNameIdentifier	 check Versions Equal
(	TokenNameLPAREN	
"1m3"	TokenNameStringLiteral	1m3
,	TokenNameCOMMA	
"1milestone3"	TokenNameStringLiteral	1milestone3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// case insensitive 	TokenNameCOMMENT_LINE	case insensitive 
checkVersionsEqual	TokenNameIdentifier	 check Versions Equal
(	TokenNameLPAREN	
"1X"	TokenNameStringLiteral	1X
,	TokenNameCOMMA	
"1x"	TokenNameStringLiteral	1x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsEqual	TokenNameIdentifier	 check Versions Equal
(	TokenNameLPAREN	
"1A"	TokenNameStringLiteral	1A
,	TokenNameCOMMA	
"1a"	TokenNameStringLiteral	1a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsEqual	TokenNameIdentifier	 check Versions Equal
(	TokenNameLPAREN	
"1B"	TokenNameStringLiteral	1B
,	TokenNameCOMMA	
"1b"	TokenNameStringLiteral	1b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsEqual	TokenNameIdentifier	 check Versions Equal
(	TokenNameLPAREN	
"1M"	TokenNameStringLiteral	1M
,	TokenNameCOMMA	
"1m"	TokenNameStringLiteral	1m
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsEqual	TokenNameIdentifier	 check Versions Equal
(	TokenNameLPAREN	
"1Ga"	TokenNameStringLiteral	1Ga
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsEqual	TokenNameIdentifier	 check Versions Equal
(	TokenNameLPAREN	
"1GA"	TokenNameStringLiteral	1GA
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsEqual	TokenNameIdentifier	 check Versions Equal
(	TokenNameLPAREN	
"1Final"	TokenNameStringLiteral	1Final
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsEqual	TokenNameIdentifier	 check Versions Equal
(	TokenNameLPAREN	
"1FinaL"	TokenNameStringLiteral	1FinaL
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsEqual	TokenNameIdentifier	 check Versions Equal
(	TokenNameLPAREN	
"1FINAL"	TokenNameStringLiteral	1FINAL
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsEqual	TokenNameIdentifier	 check Versions Equal
(	TokenNameLPAREN	
"1Cr"	TokenNameStringLiteral	1Cr
,	TokenNameCOMMA	
"1Rc"	TokenNameStringLiteral	1Rc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsEqual	TokenNameIdentifier	 check Versions Equal
(	TokenNameLPAREN	
"1cR"	TokenNameStringLiteral	1cR
,	TokenNameCOMMA	
"1rC"	TokenNameStringLiteral	1rC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsEqual	TokenNameIdentifier	 check Versions Equal
(	TokenNameLPAREN	
"1m3"	TokenNameStringLiteral	1m3
,	TokenNameCOMMA	
"1Milestone3"	TokenNameStringLiteral	1Milestone3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsEqual	TokenNameIdentifier	 check Versions Equal
(	TokenNameLPAREN	
"1m3"	TokenNameStringLiteral	1m3
,	TokenNameCOMMA	
"1MileStone3"	TokenNameStringLiteral	1MileStone3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsEqual	TokenNameIdentifier	 check Versions Equal
(	TokenNameLPAREN	
"1m3"	TokenNameStringLiteral	1m3
,	TokenNameCOMMA	
"1MILESTONE3"	TokenNameStringLiteral	1MILESTONE3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testVersionComparing	TokenNameIdentifier	 test Version Comparing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkVersionsOrder	TokenNameIdentifier	 check Versions Order
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsOrder	TokenNameIdentifier	 check Versions Order
(	TokenNameLPAREN	
"1.5"	TokenNameStringLiteral	1.5
,	TokenNameCOMMA	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsOrder	TokenNameIdentifier	 check Versions Order
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
"2.5"	TokenNameStringLiteral	2.5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsOrder	TokenNameIdentifier	 check Versions Order
(	TokenNameLPAREN	
"1.0"	TokenNameStringLiteral	1.0
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsOrder	TokenNameIdentifier	 check Versions Order
(	TokenNameLPAREN	
"1.1"	TokenNameStringLiteral	1.1
,	TokenNameCOMMA	
"1.2"	TokenNameStringLiteral	1.2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsOrder	TokenNameIdentifier	 check Versions Order
(	TokenNameLPAREN	
"1.0.0"	TokenNameStringLiteral	1.0.0
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsOrder	TokenNameIdentifier	 check Versions Order
(	TokenNameLPAREN	
"1.0.1"	TokenNameStringLiteral	1.0.1
,	TokenNameCOMMA	
"1.1"	TokenNameStringLiteral	1.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsOrder	TokenNameIdentifier	 check Versions Order
(	TokenNameLPAREN	
"1.1"	TokenNameStringLiteral	1.1
,	TokenNameCOMMA	
"1.2.0"	TokenNameStringLiteral	1.2.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsOrder	TokenNameIdentifier	 check Versions Order
(	TokenNameLPAREN	
"1.0-alpha-1"	TokenNameStringLiteral	1.0-alpha-1
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsOrder	TokenNameIdentifier	 check Versions Order
(	TokenNameLPAREN	
"1.0-alpha-1"	TokenNameStringLiteral	1.0-alpha-1
,	TokenNameCOMMA	
"1.0-alpha-2"	TokenNameStringLiteral	1.0-alpha-2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsOrder	TokenNameIdentifier	 check Versions Order
(	TokenNameLPAREN	
"1.0-alpha-1"	TokenNameStringLiteral	1.0-alpha-1
,	TokenNameCOMMA	
"1.0-beta-1"	TokenNameStringLiteral	1.0-beta-1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsOrder	TokenNameIdentifier	 check Versions Order
(	TokenNameLPAREN	
"1.0-beta-1"	TokenNameStringLiteral	1.0-beta-1
,	TokenNameCOMMA	
"1.0-SNAPSHOT"	TokenNameStringLiteral	1.0-SNAPSHOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsOrder	TokenNameIdentifier	 check Versions Order
(	TokenNameLPAREN	
"1.0-SNAPSHOT"	TokenNameStringLiteral	1.0-SNAPSHOT
,	TokenNameCOMMA	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsOrder	TokenNameIdentifier	 check Versions Order
(	TokenNameLPAREN	
"1.0-alpha-1-SNAPSHOT"	TokenNameStringLiteral	1.0-alpha-1-SNAPSHOT
,	TokenNameCOMMA	
"1.0-alpha-1"	TokenNameStringLiteral	1.0-alpha-1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsOrder	TokenNameIdentifier	 check Versions Order
(	TokenNameLPAREN	
"1.0"	TokenNameStringLiteral	1.0
,	TokenNameCOMMA	
"1.0-1"	TokenNameStringLiteral	1.0-1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsOrder	TokenNameIdentifier	 check Versions Order
(	TokenNameLPAREN	
"1.0-1"	TokenNameStringLiteral	1.0-1
,	TokenNameCOMMA	
"1.0-2"	TokenNameStringLiteral	1.0-2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsOrder	TokenNameIdentifier	 check Versions Order
(	TokenNameLPAREN	
"1.0.0"	TokenNameStringLiteral	1.0.0
,	TokenNameCOMMA	
"1.0-1"	TokenNameStringLiteral	1.0-1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsOrder	TokenNameIdentifier	 check Versions Order
(	TokenNameLPAREN	
"2.0-1"	TokenNameStringLiteral	2.0-1
,	TokenNameCOMMA	
"2.0.1"	TokenNameStringLiteral	2.0.1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsOrder	TokenNameIdentifier	 check Versions Order
(	TokenNameLPAREN	
"2.0.1-klm"	TokenNameStringLiteral	2.0.1-klm
,	TokenNameCOMMA	
"2.0.1-lmn"	TokenNameStringLiteral	2.0.1-lmn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsOrder	TokenNameIdentifier	 check Versions Order
(	TokenNameLPAREN	
"2.0.1"	TokenNameStringLiteral	2.0.1
,	TokenNameCOMMA	
"2.0.1-xyz"	TokenNameStringLiteral	2.0.1-xyz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsOrder	TokenNameIdentifier	 check Versions Order
(	TokenNameLPAREN	
"2.0.1"	TokenNameStringLiteral	2.0.1
,	TokenNameCOMMA	
"2.0.1-123"	TokenNameStringLiteral	2.0.1-123
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsOrder	TokenNameIdentifier	 check Versions Order
(	TokenNameLPAREN	
"2.0.1-xyz"	TokenNameStringLiteral	2.0.1-xyz
,	TokenNameCOMMA	
"2.0.1-123"	TokenNameStringLiteral	2.0.1-123
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testLocaleIndependent	TokenNameIdentifier	 test Locale Independent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Locale	TokenNameIdentifier	 Locale
orig	TokenNameIdentifier	 orig
=	TokenNameEQUAL	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Locale	TokenNameIdentifier	 Locale
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
locales	TokenNameIdentifier	 locales
=	TokenNameEQUAL	
{	TokenNameLBRACE	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
,	TokenNameCOMMA	
new	TokenNamenew	
Locale	TokenNameIdentifier	 Locale
(	TokenNameLPAREN	
"tr"	TokenNameStringLiteral	tr
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
:	TokenNameCOLON	
locales	TokenNameIdentifier	 locales
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
setDefault	TokenNameIdentifier	 set Default
(	TokenNameLPAREN	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkVersionsEqual	TokenNameIdentifier	 check Versions Equal
(	TokenNameLPAREN	
"1-abcdefghijklmnopqrstuvwxyz"	TokenNameStringLiteral	1-abcdefghijklmnopqrstuvwxyz
,	TokenNameCOMMA	
"1-ABCDEFGHIJKLMNOPQRSTUVWXYZ"	TokenNameStringLiteral	1-ABCDEFGHIJKLMNOPQRSTUVWXYZ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
setDefault	TokenNameIdentifier	 set Default
(	TokenNameLPAREN	
orig	TokenNameIdentifier	 orig
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testReuse	TokenNameIdentifier	 test Reuse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ComparableVersion	TokenNameIdentifier	 Comparable Version
c1	TokenNameIdentifier	 c1
=	TokenNameEQUAL	
new	TokenNamenew	
ComparableVersion	TokenNameIdentifier	 Comparable Version
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c1	TokenNameIdentifier	 c1
.	TokenNameDOT	
parseVersion	TokenNameIdentifier	 parse Version
(	TokenNameLPAREN	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Comparable	TokenNameIdentifier	 Comparable
c2	TokenNameIdentifier	 c2
=	TokenNameEQUAL	
newComparable	TokenNameIdentifier	 new Comparable
(	TokenNameLPAREN	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"reused instance should be equivalent to new instance"	TokenNameStringLiteral	reused instance should be equivalent to new instance
,	TokenNameCOMMA	
c1	TokenNameIdentifier	 c1
,	TokenNameCOMMA	
c2	TokenNameIdentifier	 c2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
