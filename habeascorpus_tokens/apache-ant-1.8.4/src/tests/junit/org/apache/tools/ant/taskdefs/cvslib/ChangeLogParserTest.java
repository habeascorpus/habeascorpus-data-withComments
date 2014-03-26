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
cvslib	TokenNameIdentifier	 cvslib
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Calendar	TokenNameIdentifier	 Calendar
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TimeZone	TokenNameIdentifier	 Time Zone
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Date	TokenNameIdentifier	 Date
;	TokenNameSEMICOLON	
/** * Minimal test of the parser implementation */	TokenNameCOMMENT_JAVADOC	 Minimal test of the parser implementation 
public	TokenNamepublic	
class	TokenNameclass	
ChangeLogParserTest	TokenNameIdentifier	 Change Log Parser Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
protected	TokenNameprotected	
ChangeLogParser	TokenNameIdentifier	 Change Log Parser
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
new	TokenNamenew	
ChangeLogParser	TokenNameIdentifier	 Change Log Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
testOldCvsFormat	TokenNameIdentifier	 test Old Cvs Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
stdout	TokenNameIdentifier	 stdout
(	TokenNameLPAREN	
"Working file: build.xml"	TokenNameStringLiteral	Working file: build.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
stdout	TokenNameIdentifier	 stdout
(	TokenNameLPAREN	
"revision 1.475"	TokenNameStringLiteral	revision 1.475
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
stdout	TokenNameIdentifier	 stdout
(	TokenNameLPAREN	
"date: 2004/06/05 16:10:32; author: somebody; state: Exp; lines: +2 -2"	TokenNameStringLiteral	date: 2004/06/05 16:10:32; author: somebody; state: Exp; lines: +2 -2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
stdout	TokenNameIdentifier	 stdout
(	TokenNameLPAREN	
"I have done something. I swear."	TokenNameStringLiteral	I have done something. I swear.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
stdout	TokenNameIdentifier	 stdout
(	TokenNameLPAREN	
"============================================================================="	TokenNameStringLiteral	=============================================================================
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CVSEntry	TokenNameIdentifier	 CVS Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
entries	TokenNameIdentifier	 entries
=	TokenNameEQUAL	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
getEntrySetAsArray	TokenNameIdentifier	 get Entry Set As Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"somebody"	TokenNameStringLiteral	somebody
,	TokenNameCOMMA	
entries	TokenNameIdentifier	 entries
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getAuthor	TokenNameIdentifier	 get Author
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Calendar	TokenNameIdentifier	 Calendar
cal	TokenNameIdentifier	 cal
=	TokenNameEQUAL	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
"UTC"	TokenNameStringLiteral	UTC
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
US	TokenNameIdentifier	 US
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
2004	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
JUNE	TokenNameIdentifier	 JUNE
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
date	TokenNameIdentifier	 date
=	TokenNameEQUAL	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
,	TokenNameCOMMA	
entries	TokenNameIdentifier	 entries
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getDate	TokenNameIdentifier	 get Date
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCvs112Format	TokenNameIdentifier	 test Cvs112 Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
stdout	TokenNameIdentifier	 stdout
(	TokenNameLPAREN	
"Working file: build.xml"	TokenNameStringLiteral	Working file: build.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
stdout	TokenNameIdentifier	 stdout
(	TokenNameLPAREN	
"revision 1.475"	TokenNameStringLiteral	revision 1.475
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
stdout	TokenNameIdentifier	 stdout
(	TokenNameLPAREN	
"date: 2004-06-05 16:10:32 +0000; author: somebody; state: Exp; lines: +2 -2"	TokenNameStringLiteral	date: 2004-06-05 16:10:32 +0000; author: somebody; state: Exp; lines: +2 -2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
stdout	TokenNameIdentifier	 stdout
(	TokenNameLPAREN	
"I have done something. I swear."	TokenNameStringLiteral	I have done something. I swear.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
stdout	TokenNameIdentifier	 stdout
(	TokenNameLPAREN	
"============================================================================="	TokenNameStringLiteral	=============================================================================
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CVSEntry	TokenNameIdentifier	 CVS Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
entries	TokenNameIdentifier	 entries
=	TokenNameEQUAL	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
getEntrySetAsArray	TokenNameIdentifier	 get Entry Set As Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"somebody"	TokenNameStringLiteral	somebody
,	TokenNameCOMMA	
entries	TokenNameIdentifier	 entries
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getAuthor	TokenNameIdentifier	 get Author
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Calendar	TokenNameIdentifier	 Calendar
cal	TokenNameIdentifier	 cal
=	TokenNameEQUAL	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
"UTC"	TokenNameStringLiteral	UTC
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
US	TokenNameIdentifier	 US
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
2004	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
JUNE	TokenNameIdentifier	 JUNE
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
date	TokenNameIdentifier	 date
=	TokenNameEQUAL	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
,	TokenNameCOMMA	
entries	TokenNameIdentifier	 entries
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getDate	TokenNameIdentifier	 get Date
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
