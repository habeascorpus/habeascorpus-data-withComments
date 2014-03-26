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
TimeZone	TokenNameIdentifier	 Time Zone
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Date	TokenNameIdentifier	 Date
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
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
Location	TokenNameIdentifier	 Location
;	TokenNameSEMICOLON	
/** * */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
class	TokenNameclass	
TStampTest	TokenNameIdentifier	 T Stamp Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
protected	TokenNameprotected	
Tstamp	TokenNameIdentifier	 Tstamp
tstamp	TokenNameIdentifier	 tstamp
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Location	TokenNameIdentifier	 Location
location	TokenNameIdentifier	 location
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TStampTest	TokenNameIdentifier	 T Stamp Test
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
location	TokenNameIdentifier	 location
=	TokenNameEQUAL	
new	TokenNamenew	
Location	TokenNameIdentifier	 Location
(	TokenNameLPAREN	
"test.xml"	TokenNameStringLiteral	test.xml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
new	TokenNamenew	
Project	TokenNameIdentifier	 Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstamp	TokenNameIdentifier	 tstamp
=	TokenNameEQUAL	
new	TokenNamenew	
Tstamp	TokenNameIdentifier	 Tstamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstamp	TokenNameIdentifier	 tstamp
.	TokenNameDOT	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstamp	TokenNameIdentifier	 tstamp
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTimeZone	TokenNameIdentifier	 test Time Zone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Tstamp	TokenNameIdentifier	 Tstamp
.	TokenNameDOT	
CustomFormat	TokenNameIdentifier	 Custom Format
format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
tstamp	TokenNameIdentifier	 tstamp
.	TokenNameDOT	
createFormat	TokenNameIdentifier	 create Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"today"	TokenNameStringLiteral	today
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
"HH:mm:ss z"	TokenNameStringLiteral	HH:mm:ss z
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
setTimezone	TokenNameIdentifier	 set Timezone
(	TokenNameLPAREN	
"GMT"	TokenNameStringLiteral	GMT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
date	TokenNameIdentifier	 date
=	TokenNameEQUAL	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
date	TokenNameIdentifier	 date
,	TokenNameCOMMA	
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
today	TokenNameIdentifier	 today
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"today"	TokenNameStringLiteral	today
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
sdf	TokenNameIdentifier	 sdf
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
"HH:mm:ss z"	TokenNameStringLiteral	HH:mm:ss z
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sdf	TokenNameIdentifier	 sdf
.	TokenNameDOT	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
"GMT"	TokenNameStringLiteral	GMT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
sdf	TokenNameIdentifier	 sdf
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
today	TokenNameIdentifier	 today
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * verifies that custom props have priority over the * originals * @throws Exception */	TokenNameCOMMENT_JAVADOC	 verifies that custom props have priority over the originals @throws Exception 
public	TokenNamepublic	
void	TokenNamevoid	
testWriteOrder	TokenNameIdentifier	 test Write Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Tstamp	TokenNameIdentifier	 Tstamp
.	TokenNameDOT	
CustomFormat	TokenNameIdentifier	 Custom Format
format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
tstamp	TokenNameIdentifier	 tstamp
.	TokenNameDOT	
createFormat	TokenNameIdentifier	 create Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"TODAY"	TokenNameStringLiteral	TODAY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
"HH:mm:ss z"	TokenNameStringLiteral	HH:mm:ss z
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
setTimezone	TokenNameIdentifier	 set Timezone
(	TokenNameLPAREN	
"GMT"	TokenNameStringLiteral	GMT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
date	TokenNameIdentifier	 date
=	TokenNameEQUAL	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
date	TokenNameIdentifier	 date
,	TokenNameCOMMA	
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
today	TokenNameIdentifier	 today
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"TODAY"	TokenNameStringLiteral	TODAY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
sdf	TokenNameIdentifier	 sdf
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
"HH:mm:ss z"	TokenNameStringLiteral	HH:mm:ss z
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sdf	TokenNameIdentifier	 sdf
.	TokenNameDOT	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
"GMT"	TokenNameStringLiteral	GMT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
sdf	TokenNameIdentifier	 sdf
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
today	TokenNameIdentifier	 today
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * verifies that custom props have priority over the * originals * @throws Exception */	TokenNameCOMMENT_JAVADOC	 verifies that custom props have priority over the originals @throws Exception 
public	TokenNamepublic	
void	TokenNamevoid	
testPrefix	TokenNameIdentifier	 test Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
tstamp	TokenNameIdentifier	 tstamp
.	TokenNameDOT	
setPrefix	TokenNameIdentifier	 set Prefix
(	TokenNameLPAREN	
"prefix"	TokenNameStringLiteral	prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstamp	TokenNameIdentifier	 tstamp
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
prop	TokenNameIdentifier	 prop
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"prefix.DSTAMP"	TokenNameStringLiteral	prefix.DSTAMP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFormatPrefix	TokenNameIdentifier	 test Format Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Tstamp	TokenNameIdentifier	 Tstamp
.	TokenNameDOT	
CustomFormat	TokenNameIdentifier	 Custom Format
format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
tstamp	TokenNameIdentifier	 tstamp
.	TokenNameDOT	
createFormat	TokenNameIdentifier	 create Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"format"	TokenNameStringLiteral	format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
"HH:mm:ss z"	TokenNameStringLiteral	HH:mm:ss z
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
setTimezone	TokenNameIdentifier	 set Timezone
(	TokenNameLPAREN	
"GMT"	TokenNameStringLiteral	GMT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstamp	TokenNameIdentifier	 tstamp
.	TokenNameDOT	
setPrefix	TokenNameIdentifier	 set Prefix
(	TokenNameLPAREN	
"prefix"	TokenNameStringLiteral	prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstamp	TokenNameIdentifier	 tstamp
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
prop	TokenNameIdentifier	 prop
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"prefix.format"	TokenNameStringLiteral	prefix.format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
