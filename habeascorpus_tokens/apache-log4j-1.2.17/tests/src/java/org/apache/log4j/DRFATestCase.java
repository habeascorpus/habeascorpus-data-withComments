/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileOutputStream	TokenNameIdentifier	 File Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileInputStream	TokenNameIdentifier	 File Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
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
Date	TokenNameIdentifier	 Date
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Compare	TokenNameIdentifier	 Compare
;	TokenNameSEMICOLON	
/** Exhaustive test of the DailyRollingFileAppender compute algorithm. @author Ceki G&uuml;lc&uuml; @author Curt Arnold */	TokenNameCOMMENT_JAVADOC	 Exhaustive test of the DailyRollingFileAppender compute algorithm. @author Ceki G&uuml;lc&uuml; @author Curt Arnold 
public	TokenNamepublic	
class	TokenNameclass	
DRFATestCase	TokenNameIdentifier	 DRFA Test Case
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
/** * Create new test. * @param name test name. */	TokenNameCOMMENT_JAVADOC	 Create new test. @param name test name. 
public	TokenNamepublic	
DRFATestCase	TokenNameIdentifier	 DRFA Test Case
(	TokenNameLPAREN	
final	TokenNamefinal	
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
/** * Reset configuration after every test. */	TokenNameCOMMENT_JAVADOC	 Reset configuration after every test. 
public	TokenNamepublic	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogManager	TokenNameIdentifier	 Log Manager
.	TokenNameDOT	
resetConfiguration	TokenNameIdentifier	 reset Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test prediction of check period. */	TokenNameCOMMENT_JAVADOC	 Test prediction of check period. 
public	TokenNamepublic	
void	TokenNamevoid	
testComputeCheckPeriod	TokenNameIdentifier	 test Compute Check Period
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DailyRollingFileAppender	TokenNameIdentifier	 Daily Rolling File Appender
drfa	TokenNameIdentifier	 drfa
=	TokenNameEQUAL	
new	TokenNamenew	
DailyRollingFileAppender	TokenNameIdentifier	 Daily Rolling File Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
drfa	TokenNameIdentifier	 drfa
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
"testComputeCheckPeriod"	TokenNameStringLiteral	testComputeCheckPeriod
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
drfa	TokenNameIdentifier	 drfa
.	TokenNameDOT	
setDatePattern	TokenNameIdentifier	 set Date Pattern
(	TokenNameLPAREN	
"yyyy-MM-dd.'log'"	TokenNameStringLiteral	yyyy-MM-dd.'log'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
drfa	TokenNameIdentifier	 drfa
.	TokenNameDOT	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
drfa	TokenNameIdentifier	 drfa
.	TokenNameDOT	
computeCheckPeriod	TokenNameIdentifier	 compute Check Period
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
drfa	TokenNameIdentifier	 drfa
.	TokenNameDOT	
computeCheckPeriod	TokenNameIdentifier	 compute Check Period
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DailyRollingFileAppender	TokenNameIdentifier	 Daily Rolling File Appender
.	TokenNameDOT	
TOP_OF_DAY	TokenNameIdentifier	 TOP  OF  DAY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
drfa	TokenNameIdentifier	 drfa
.	TokenNameDOT	
setDatePattern	TokenNameIdentifier	 set Date Pattern
(	TokenNameLPAREN	
"yyyy-MM-dd mm.'log'"	TokenNameStringLiteral	yyyy-MM-dd mm.'log'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
drfa	TokenNameIdentifier	 drfa
.	TokenNameDOT	
computeCheckPeriod	TokenNameIdentifier	 compute Check Period
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DailyRollingFileAppender	TokenNameIdentifier	 Daily Rolling File Appender
.	TokenNameDOT	
TOP_OF_MINUTE	TokenNameIdentifier	 TOP  OF  MINUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
drfa	TokenNameIdentifier	 drfa
.	TokenNameDOT	
setDatePattern	TokenNameIdentifier	 set Date Pattern
(	TokenNameLPAREN	
"yyyy-MM-dd a.'log'"	TokenNameStringLiteral	yyyy-MM-dd a.'log'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
drfa	TokenNameIdentifier	 drfa
.	TokenNameDOT	
computeCheckPeriod	TokenNameIdentifier	 compute Check Period
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DailyRollingFileAppender	TokenNameIdentifier	 Daily Rolling File Appender
.	TokenNameDOT	
HALF_DAY	TokenNameIdentifier	 HALF  DAY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
drfa	TokenNameIdentifier	 drfa
.	TokenNameDOT	
setDatePattern	TokenNameIdentifier	 set Date Pattern
(	TokenNameLPAREN	
"yyyy-MM-dd HH.'log'"	TokenNameStringLiteral	yyyy-MM-dd HH.'log'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
drfa	TokenNameIdentifier	 drfa
.	TokenNameDOT	
computeCheckPeriod	TokenNameIdentifier	 compute Check Period
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DailyRollingFileAppender	TokenNameIdentifier	 Daily Rolling File Appender
.	TokenNameDOT	
TOP_OF_HOUR	TokenNameIdentifier	 TOP  OF  HOUR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
drfa	TokenNameIdentifier	 drfa
.	TokenNameDOT	
setDatePattern	TokenNameIdentifier	 set Date Pattern
(	TokenNameLPAREN	
"yyyy-MM.'log'"	TokenNameStringLiteral	yyyy-MM.'log'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
drfa	TokenNameIdentifier	 drfa
.	TokenNameDOT	
computeCheckPeriod	TokenNameIdentifier	 compute Check Period
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DailyRollingFileAppender	TokenNameIdentifier	 Daily Rolling File Appender
.	TokenNameDOT	
TOP_OF_MONTH	TokenNameIdentifier	 TOP  OF  MONTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
drfa	TokenNameIdentifier	 drfa
.	TokenNameDOT	
setDatePattern	TokenNameIdentifier	 set Date Pattern
(	TokenNameLPAREN	
"'log'HH'log'"	TokenNameStringLiteral	'log'HH'log'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
drfa	TokenNameIdentifier	 drfa
.	TokenNameDOT	
computeCheckPeriod	TokenNameIdentifier	 compute Check Period
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DailyRollingFileAppender	TokenNameIdentifier	 Daily Rolling File Appender
.	TokenNameDOT	
TOP_OF_HOUR	TokenNameIdentifier	 TOP  OF  HOUR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test of RollingCalendar. */	TokenNameCOMMENT_JAVADOC	 Test of RollingCalendar. 
public	TokenNamepublic	
void	TokenNamevoid	
testRC1	TokenNameIdentifier	 test R C1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RollingCalendar	TokenNameIdentifier	 Rolling Calendar
rc	TokenNameIdentifier	 rc
=	TokenNameEQUAL	
new	TokenNamenew	
RollingCalendar	TokenNameIdentifier	 Rolling Calendar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rc	TokenNameIdentifier	 rc
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
DailyRollingFileAppender	TokenNameIdentifier	 Daily Rolling File Appender
.	TokenNameDOT	
TOP_OF_DAY	TokenNameIdentifier	 TOP  OF  DAY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Calendar	TokenNameIdentifier	 Calendar
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// jan, mar, may, july, aug, oct, dec have 31 days 	TokenNameCOMMENT_LINE	jan, mar, may, july, aug, oct, dec have 31 days 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
M31	TokenNameIdentifier	 M31
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
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
M31	TokenNameIdentifier	 M31
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
<=	TokenNameLESS_EQUAL	
31	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
<	TokenNameLESS	
23	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
YEAR	TokenNameIdentifier	 YEAR
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MONTH	TokenNameIdentifier	 MONTH
,	TokenNameCOMMA	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
JANUARY	TokenNameIdentifier	 JANUARY
+	TokenNamePLUS	
M31	TokenNameIdentifier	 M31
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
DAY_OF_MONTH	TokenNameIdentifier	 DAY  OF  MONTH
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
HOUR_OF_DAY	TokenNameIdentifier	 HOUR  OF  DAY
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MINUTE	TokenNameIdentifier	 MINUTE
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
SECOND	TokenNameIdentifier	 SECOND
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
,	TokenNameCOMMA	
88	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setTime	TokenNameIdentifier	 set Time
(	TokenNameLPAREN	
rc	TokenNameIdentifier	 rc
.	TokenNameDOT	
getNextCheckDate	TokenNameIdentifier	 get Next Check Date
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
==	TokenNameEQUAL_EQUAL	
31	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MONTH	TokenNameIdentifier	 MONTH
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
JANUARY	TokenNameIdentifier	 JANUARY
+	TokenNamePLUS	
M31	TokenNameIdentifier	 M31
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
DAY_OF_MONTH	TokenNameIdentifier	 DAY  OF  MONTH
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MONTH	TokenNameIdentifier	 MONTH
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
JANUARY	TokenNameIdentifier	 JANUARY
+	TokenNamePLUS	
M31	TokenNameIdentifier	 M31
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
DAY_OF_MONTH	TokenNameIdentifier	 DAY  OF  MONTH
)	TokenNameRPAREN	
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
HOUR_OF_DAY	TokenNameIdentifier	 HOUR  OF  DAY
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MINUTE	TokenNameIdentifier	 MINUTE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
SECOND	TokenNameIdentifier	 SECOND
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * RollingCalendar test. */	TokenNameCOMMENT_JAVADOC	 RollingCalendar test. 
public	TokenNamepublic	
void	TokenNamevoid	
testRC2	TokenNameIdentifier	 test R C2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RollingCalendar	TokenNameIdentifier	 Rolling Calendar
rc	TokenNameIdentifier	 rc
=	TokenNameEQUAL	
new	TokenNamenew	
RollingCalendar	TokenNameIdentifier	 Rolling Calendar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rc	TokenNameIdentifier	 rc
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
DailyRollingFileAppender	TokenNameIdentifier	 Daily Rolling File Appender
.	TokenNameDOT	
TOP_OF_HOUR	TokenNameIdentifier	 TOP  OF  HOUR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Calendar	TokenNameIdentifier	 Calendar
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// jan, mar, may, july, aug, oct, dec have 31 days 	TokenNameCOMMENT_LINE	jan, mar, may, july, aug, oct, dec have 31 days 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
M31	TokenNameIdentifier	 M31
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
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
M31	TokenNameIdentifier	 M31
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Month = "	TokenNameStringLiteral	Month = 
+	TokenNamePLUS	
(	TokenNameLPAREN	
M31	TokenNameIdentifier	 M31
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
<=	TokenNameLESS_EQUAL	
31	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
<	TokenNameLESS	
23	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
<=	TokenNameLESS_EQUAL	
59	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
YEAR	TokenNameIdentifier	 YEAR
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MONTH	TokenNameIdentifier	 MONTH
,	TokenNameCOMMA	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
JANUARY	TokenNameIdentifier	 JANUARY
+	TokenNamePLUS	
M31	TokenNameIdentifier	 M31
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
DAY_OF_MONTH	TokenNameIdentifier	 DAY  OF  MONTH
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
HOUR_OF_DAY	TokenNameIdentifier	 HOUR  OF  DAY
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MINUTE	TokenNameIdentifier	 MINUTE
,	TokenNameCOMMA	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
SECOND	TokenNameIdentifier	 SECOND
,	TokenNameCOMMA	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
,	TokenNameCOMMA	
88	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
dltState0	TokenNameIdentifier	 dlt State0
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
inDaylightTime	TokenNameIdentifier	 in Daylight Time
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setTime	TokenNameIdentifier	 set Time
(	TokenNameLPAREN	
rc	TokenNameIdentifier	 rc
.	TokenNameDOT	
getNextCheckDate	TokenNameIdentifier	 get Next Check Date
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
dltState1	TokenNameIdentifier	 dlt State1
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
inDaylightTime	TokenNameIdentifier	 in Daylight Time
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
SECOND	TokenNameIdentifier	 SECOND
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MINUTE	TokenNameIdentifier	 MINUTE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dltState0	TokenNameIdentifier	 dlt State0
==	TokenNameEQUAL_EQUAL	
dltState1	TokenNameIdentifier	 dlt State1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
HOUR_OF_DAY	TokenNameIdentifier	 HOUR  OF  DAY
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// returning to standard time 	TokenNameCOMMENT_LINE	returning to standard time 
if	TokenNameif	
(	TokenNameLPAREN	
dltState0	TokenNameIdentifier	 dlt State0
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
HOUR_OF_DAY	TokenNameIdentifier	 HOUR  OF  DAY
)	TokenNameRPAREN	
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// switching to day light saving time 	TokenNameCOMMENT_LINE	switching to day light saving time 
//System.err.println("m="+m+", h="+h+", d="+d+", i="+i); 	TokenNameCOMMENT_LINE	System.err.println("m="+m+", h="+h+", d="+d+", i="+i); 
//if(h==2) { 	TokenNameCOMMENT_LINE	if(h==2) { 
// System.err.println(c); 	TokenNameCOMMENT_LINE	System.err.println(c); 
//} 	TokenNameCOMMENT_LINE	} 
//assertEquals(c.get(Calendar.HOUR_OF_DAY), (h+2)%24); 	TokenNameCOMMENT_LINE	assertEquals(c.get(Calendar.HOUR_OF_DAY), (h+2)%24); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
==	TokenNameEQUAL_EQUAL	
23	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
DAY_OF_MONTH	TokenNameIdentifier	 DAY  OF  MONTH
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
==	TokenNameEQUAL_EQUAL	
31	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MONTH	TokenNameIdentifier	 MONTH
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
JANUARY	TokenNameIdentifier	 JANUARY
+	TokenNamePLUS	
M31	TokenNameIdentifier	 M31
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MONTH	TokenNameIdentifier	 MONTH
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
JANUARY	TokenNameIdentifier	 JANUARY
+	TokenNamePLUS	
M31	TokenNameIdentifier	 M31
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
DAY_OF_MONTH	TokenNameIdentifier	 DAY  OF  MONTH
)	TokenNameRPAREN	
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MONTH	TokenNameIdentifier	 MONTH
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
JANUARY	TokenNameIdentifier	 JANUARY
+	TokenNamePLUS	
M31	TokenNameIdentifier	 M31
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * RollingCalendar test. */	TokenNameCOMMENT_JAVADOC	 RollingCalendar test. 
public	TokenNamepublic	
void	TokenNamevoid	
testRC3	TokenNameIdentifier	 test R C3
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RollingCalendar	TokenNameIdentifier	 Rolling Calendar
rc	TokenNameIdentifier	 rc
=	TokenNameEQUAL	
new	TokenNamenew	
RollingCalendar	TokenNameIdentifier	 Rolling Calendar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rc	TokenNameIdentifier	 rc
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
DailyRollingFileAppender	TokenNameIdentifier	 Daily Rolling File Appender
.	TokenNameDOT	
TOP_OF_MINUTE	TokenNameIdentifier	 TOP  OF  MINUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
S	TokenNameIdentifier	 S
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
21	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
30	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
59	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
M	TokenNameIdentifier	 M
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
21	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
30	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
59	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
Calendar	TokenNameIdentifier	 Calendar
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// jan, mar, may, july, aug, oct, dec have 31 days 	TokenNameCOMMENT_LINE	jan, mar, may, july, aug, oct, dec have 31 days 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
M31	TokenNameIdentifier	 M31
=	TokenNameEQUAL	
{	TokenNameLBRACE	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
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
M31	TokenNameIdentifier	 M31
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Month = "	TokenNameStringLiteral	Month = 
+	TokenNamePLUS	
(	TokenNameLPAREN	
M31	TokenNameIdentifier	 M31
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
<=	TokenNameLESS_EQUAL	
31	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
<	TokenNameLESS	
23	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
<	TokenNameLESS	
M	TokenNameIdentifier	 M
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
<	TokenNameLESS	
S	TokenNameIdentifier	 S
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
YEAR	TokenNameIdentifier	 YEAR
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MONTH	TokenNameIdentifier	 MONTH
,	TokenNameCOMMA	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
JANUARY	TokenNameIdentifier	 JANUARY
+	TokenNamePLUS	
M31	TokenNameIdentifier	 M31
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
DAY_OF_MONTH	TokenNameIdentifier	 DAY  OF  MONTH
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
HOUR_OF_DAY	TokenNameIdentifier	 HOUR  OF  DAY
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MINUTE	TokenNameIdentifier	 MINUTE
,	TokenNameCOMMA	
M	TokenNameIdentifier	 M
[	TokenNameLBRACKET	
m	TokenNameIdentifier	 m
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
SECOND	TokenNameIdentifier	 SECOND
,	TokenNameCOMMA	
S	TokenNameIdentifier	 S
[	TokenNameLBRACKET	
s	TokenNameIdentifier	 s
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
,	TokenNameCOMMA	
88	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
dltState0	TokenNameIdentifier	 dlt State0
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
inDaylightTime	TokenNameIdentifier	 in Daylight Time
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setTime	TokenNameIdentifier	 set Time
(	TokenNameLPAREN	
rc	TokenNameIdentifier	 rc
.	TokenNameDOT	
getNextCheckDate	TokenNameIdentifier	 get Next Check Date
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
dltState1	TokenNameIdentifier	 dlt State1
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
inDaylightTime	TokenNameIdentifier	 in Daylight Time
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
SECOND	TokenNameIdentifier	 SECOND
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MINUTE	TokenNameIdentifier	 MINUTE
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
M	TokenNameIdentifier	 M
[	TokenNameLBRACKET	
m	TokenNameIdentifier	 m
]	TokenNameRBRACKET	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
60	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
M	TokenNameIdentifier	 M
[	TokenNameLBRACKET	
m	TokenNameIdentifier	 m
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
59	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dltState0	TokenNameIdentifier	 dlt State0
==	TokenNameEQUAL_EQUAL	
dltState1	TokenNameIdentifier	 dlt State1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
HOUR_OF_DAY	TokenNameIdentifier	 HOUR  OF  DAY
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
==	TokenNameEQUAL_EQUAL	
23	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
DAY_OF_MONTH	TokenNameIdentifier	 DAY  OF  MONTH
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
32	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
==	TokenNameEQUAL_EQUAL	
31	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MONTH	TokenNameIdentifier	 MONTH
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
JANUARY	TokenNameIdentifier	 JANUARY
+	TokenNamePLUS	
M31	TokenNameIdentifier	 M31
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MONTH	TokenNameIdentifier	 MONTH
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
JANUARY	TokenNameIdentifier	 JANUARY
+	TokenNamePLUS	
M31	TokenNameIdentifier	 M31
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
DAY_OF_MONTH	TokenNameIdentifier	 DAY  OF  MONTH
)	TokenNameRPAREN	
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// allow discrepancies only if we are switching from std to dls time 	TokenNameCOMMENT_LINE	allow discrepancies only if we are switching from std to dls time 
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
HOUR_OF_DAY	TokenNameIdentifier	 HOUR  OF  DAY
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
HOUR_OF_DAY	TokenNameIdentifier	 HOUR  OF  DAY
,	TokenNameCOMMA	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
dltState2	TokenNameIdentifier	 dlt State2
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
inDaylightTime	TokenNameIdentifier	 in Daylight Time
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dltState1	TokenNameIdentifier	 dlt State1
==	TokenNameEQUAL_EQUAL	
dltState2	TokenNameIdentifier	 dlt State2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"No switch"	TokenNameStringLiteral	No switch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
DAY_OF_MONTH	TokenNameIdentifier	 DAY  OF  MONTH
)	TokenNameRPAREN	
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MONTH	TokenNameIdentifier	 MONTH
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
JANUARY	TokenNameIdentifier	 JANUARY
+	TokenNamePLUS	
M31	TokenNameIdentifier	 M31
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Common test code for 3 parameter constructor. * * @throws IOException if IOException during test. */	TokenNameCOMMENT_JAVADOC	 Common test code for 3 parameter constructor. * @throws IOException if IOException during test. 
public	TokenNamepublic	
void	TokenNamevoid	
test3Param	TokenNameIdentifier	 test3 Param
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
datePattern	TokenNameIdentifier	 date Pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Layout	TokenNameIdentifier	 Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleLayout	TokenNameIdentifier	 Simple Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DailyRollingFileAppender	TokenNameIdentifier	 Daily Rolling File Appender
appender	TokenNameIdentifier	 appender
=	TokenNameEQUAL	
new	TokenNamenew	
DailyRollingFileAppender	TokenNameIdentifier	 Daily Rolling File Appender
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
,	TokenNameCOMMA	
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
datePattern	TokenNameIdentifier	 date Pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
datePattern	TokenNameIdentifier	 date Pattern
,	TokenNameCOMMA	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
getDatePattern	TokenNameIdentifier	 get Date Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getRootLogger	TokenNameIdentifier	 get Root Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Hello, World"	TokenNameStringLiteral	Hello, World
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates an appender with an unrecognized top-of-year pattern. * * @throws IOException if IOException during test. */	TokenNameCOMMENT_JAVADOC	 Creates an appender with an unrecognized top-of-year pattern. * @throws IOException if IOException during test. 
public	TokenNamepublic	
void	TokenNamevoid	
testTopOfYear	TokenNameIdentifier	 test Top Of Year
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
test3Param	TokenNameIdentifier	 test3 Param
(	TokenNameLPAREN	
"'.'yyyy"	TokenNameStringLiteral	'.'yyyy
,	TokenNameCOMMA	
"output/drfa_topOfYear.log"	TokenNameStringLiteral	output/drfa_topOfYear.log
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Expected illegal state exception."	TokenNameStringLiteral	Expected illegal state exception.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Creates an appender with a top-of-month pattern. * * @throws IOException if IOException during test. */	TokenNameCOMMENT_JAVADOC	 Creates an appender with a top-of-month pattern. * @throws IOException if IOException during test. 
public	TokenNamepublic	
void	TokenNamevoid	
testTopOfMonth	TokenNameIdentifier	 test Top Of Month
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
test3Param	TokenNameIdentifier	 test3 Param
(	TokenNameLPAREN	
"'.'yyyy-MM"	TokenNameStringLiteral	'.'yyyy-MM
,	TokenNameCOMMA	
"output/drfa_topOfMonth.log"	TokenNameStringLiteral	output/drfa_topOfMonth.log
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates an appender with a top-of-week pattern. * * @throws IOException if IOException during test. */	TokenNameCOMMENT_JAVADOC	 Creates an appender with a top-of-week pattern. * @throws IOException if IOException during test. 
public	TokenNamepublic	
void	TokenNamevoid	
testTopOfWeek	TokenNameIdentifier	 test Top Of Week
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
test3Param	TokenNameIdentifier	 test3 Param
(	TokenNameLPAREN	
"'.'yyyy-w"	TokenNameStringLiteral	'.'yyyy-w
,	TokenNameCOMMA	
"output/drfa_topOfWeek.log"	TokenNameStringLiteral	output/drfa_topOfWeek.log
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates an appender with a top-of-day pattern. * * @throws IOException if IOException during test. */	TokenNameCOMMENT_JAVADOC	 Creates an appender with a top-of-day pattern. * @throws IOException if IOException during test. 
public	TokenNamepublic	
void	TokenNamevoid	
testTopOfDay	TokenNameIdentifier	 test Top Of Day
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
test3Param	TokenNameIdentifier	 test3 Param
(	TokenNameLPAREN	
"'.'yyyy-MM-dd"	TokenNameStringLiteral	'.'yyyy-MM-dd
,	TokenNameCOMMA	
"output/drfa_topOfDay.log"	TokenNameStringLiteral	output/drfa_topOfDay.log
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates an appender with a half day pattern. * * @throws IOException if IOException during test. */	TokenNameCOMMENT_JAVADOC	 Creates an appender with a half day pattern. * @throws IOException if IOException during test. 
public	TokenNamepublic	
void	TokenNamevoid	
testHalfDay	TokenNameIdentifier	 test Half Day
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
test3Param	TokenNameIdentifier	 test3 Param
(	TokenNameLPAREN	
"'.'yyyy-MM-dd-a"	TokenNameStringLiteral	'.'yyyy-MM-dd-a
,	TokenNameCOMMA	
"output/drfa_halfDay.log"	TokenNameStringLiteral	output/drfa_halfDay.log
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates an appender with a top-of-hour pattern. * * @throws IOException if IOException during test. */	TokenNameCOMMENT_JAVADOC	 Creates an appender with a top-of-hour pattern. * @throws IOException if IOException during test. 
public	TokenNamepublic	
void	TokenNamevoid	
testTopOfHour	TokenNameIdentifier	 test Top Of Hour
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
test3Param	TokenNameIdentifier	 test3 Param
(	TokenNameLPAREN	
"'.'yyyy-MM-dd-HH"	TokenNameStringLiteral	'.'yyyy-MM-dd-HH
,	TokenNameCOMMA	
"output/drfa_topOfHour.log"	TokenNameStringLiteral	output/drfa_topOfHour.log
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates an appender with a top-of-day pattern. * * @throws IOException if IOException during test. */	TokenNameCOMMENT_JAVADOC	 Creates an appender with a top-of-day pattern. * @throws IOException if IOException during test. 
public	TokenNamepublic	
void	TokenNamevoid	
testTopOfMinute	TokenNameIdentifier	 test Top Of Minute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
test3Param	TokenNameIdentifier	 test3 Param
(	TokenNameLPAREN	
"'.'yyyy-MM-dd-HH-mm"	TokenNameStringLiteral	'.'yyyy-MM-dd-HH-mm
,	TokenNameCOMMA	
"output/drfa_topOfMinute.log"	TokenNameStringLiteral	output/drfa_topOfMinute.log
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Attempts to rollOver with no date pattern set. * * @throws IOException if IOException during test. */	TokenNameCOMMENT_JAVADOC	 Attempts to rollOver with no date pattern set. * @throws IOException if IOException during test. 
public	TokenNamepublic	
void	TokenNamevoid	
testRolloverNoPattern	TokenNameIdentifier	 test Rollover No Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Layout	TokenNameIdentifier	 Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleLayout	TokenNameIdentifier	 Simple Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DailyRollingFileAppender	TokenNameIdentifier	 Daily Rolling File Appender
appender	TokenNameIdentifier	 appender
=	TokenNameEQUAL	
new	TokenNamenew	
DailyRollingFileAppender	TokenNameIdentifier	 Daily Rolling File Appender
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
,	TokenNameCOMMA	
"output/drfa_nopattern.log"	TokenNameStringLiteral	output/drfa_nopattern.log
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
VectorErrorHandler	TokenNameIdentifier	 Vector Error Handler
errorHandler	TokenNameIdentifier	 error Handler
=	TokenNameEQUAL	
new	TokenNamenew	
VectorErrorHandler	TokenNameIdentifier	 Vector Error Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setErrorHandler	TokenNameIdentifier	 set Error Handler
(	TokenNameLPAREN	
errorHandler	TokenNameIdentifier	 error Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
rollOver	TokenNameIdentifier	 roll Over
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Missing DatePattern option in rollOver()."	TokenNameStringLiteral	Missing DatePattern option in rollOver().
,	TokenNameCOMMA	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests rollOver with a minute periodicity. * * @throws IOException * @throws InterruptedException */	TokenNameCOMMENT_JAVADOC	 Tests rollOver with a minute periodicity. * @throws IOException @throws InterruptedException 
public	TokenNamepublic	
void	TokenNamevoid	
testMinuteRollover	TokenNameIdentifier	 test Minute Rollover
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
{	TokenNameLBRACE	
Layout	TokenNameIdentifier	 Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleLayout	TokenNameIdentifier	 Simple Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
=	TokenNameEQUAL	
"output/drfa_minuteRollover.log"	TokenNameStringLiteral	output/drfa_minuteRollover.log
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
"'.'yyyy-MM-dd-HH-mm"	TokenNameStringLiteral	'.'yyyy-MM-dd-HH-mm
;	TokenNameSEMICOLON	
DailyRollingFileAppender	TokenNameIdentifier	 Daily Rolling File Appender
appender	TokenNameIdentifier	 appender
=	TokenNameEQUAL	
new	TokenNamenew	
DailyRollingFileAppender	TokenNameIdentifier	 Daily Rolling File Appender
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
,	TokenNameCOMMA	
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getRootLogger	TokenNameIdentifier	 get Root Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
firstFile	TokenNameIdentifier	 first File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
+	TokenNamePLUS	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Hello, World"	TokenNameStringLiteral	Hello, World
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// create a file by that name so it has to be deleted 	TokenNameCOMMENT_LINE	create a file by that name so it has to be deleted 
// on rollover 	TokenNameCOMMENT_LINE	on rollover 
firstFile	TokenNameIdentifier	 first File
.	TokenNameDOT	
createNewFile	TokenNameIdentifier	 create New File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
firstFile	TokenNameIdentifier	 first File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
firstFile	TokenNameIdentifier	 first File
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
now	TokenNameIdentifier	 now
=	TokenNameEQUAL	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
SECOND	TokenNameIdentifier	 SECOND
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
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
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MINUTE	TokenNameIdentifier	 MINUTE
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
until	TokenNameIdentifier	 until
=	TokenNameEQUAL	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
until	TokenNameIdentifier	 until
-	TokenNameMINUS	
now	TokenNameIdentifier	 now
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Hello, World"	TokenNameStringLiteral	Hello, World
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
firstFile	TokenNameIdentifier	 first File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
firstFile	TokenNameIdentifier	 first File
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Naive append method to combine rollover fragments. * @param combined stream to which source is appended. * @param source stream containing bytes to append. * @param buf byte array to use in transfer. * @throws IOException if io error during operation. */	TokenNameCOMMENT_JAVADOC	 Naive append method to combine rollover fragments. @param combined stream to which source is appended. @param source stream containing bytes to append. @param buf byte array to use in transfer. @throws IOException if io error during operation. 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
final	TokenNamefinal	
FileOutputStream	TokenNameIdentifier	 File Output Stream
combined	TokenNameIdentifier	 combined
,	TokenNameCOMMA	
final	TokenNamefinal	
FileInputStream	TokenNameIdentifier	 File Input Stream
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
count1	TokenNameIdentifier	 count1
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
count1	TokenNameIdentifier	 count1
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
combined	TokenNameIdentifier	 combined
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
count1	TokenNameIdentifier	 count1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests rollOver when log file is unabled to be renamed. * See bug 43374. * * @throws IOException if io error. * @throws InterruptedException if test interrupted while waiting for the start of the next minute. */	TokenNameCOMMENT_JAVADOC	 Tests rollOver when log file is unabled to be renamed. See bug 43374. * @throws IOException if io error. @throws InterruptedException if test interrupted while waiting for the start of the next minute. 
public	TokenNamepublic	
void	TokenNamevoid	
testBlockedRollover	TokenNameIdentifier	 test Blocked Rollover
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
{	TokenNameLBRACE	
Layout	TokenNameIdentifier	 Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleLayout	TokenNameIdentifier	 Simple Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
=	TokenNameEQUAL	
"output/drfa_blockedRollover.log"	TokenNameStringLiteral	output/drfa_blockedRollover.log
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
"'.'yyyy-MM-dd-HH-mm"	TokenNameStringLiteral	'.'yyyy-MM-dd-HH-mm
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DailyRollingFileAppender	TokenNameIdentifier	 Daily Rolling File Appender
appender	TokenNameIdentifier	 appender
=	TokenNameEQUAL	
new	TokenNamenew	
DailyRollingFileAppender	TokenNameIdentifier	 Daily Rolling File Appender
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
,	TokenNameCOMMA	
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setAppend	TokenNameIdentifier	 set Append
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getRootLogger	TokenNameIdentifier	 get Root Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// open next two anticipated rollover file names 	TokenNameCOMMENT_LINE	open next two anticipated rollover file names 
// 	TokenNameCOMMENT_LINE	 
File	TokenNameIdentifier	 File
block1	TokenNameIdentifier	 block1
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
+	TokenNamePLUS	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
block2	TokenNameIdentifier	 block2
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
+	TokenNamePLUS	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
60000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileOutputStream	TokenNameIdentifier	 File Output Stream
os1	TokenNameIdentifier	 os1
=	TokenNameEQUAL	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
block1	TokenNameIdentifier	 block1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileOutputStream	TokenNameIdentifier	 File Output Stream
os2	TokenNameIdentifier	 os2
=	TokenNameEQUAL	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
block2	TokenNameIdentifier	 block2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Prior to rollover"	TokenNameStringLiteral	Prior to rollover
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// sleep until three seconds into next minute 	TokenNameCOMMENT_LINE	sleep until three seconds into next minute 
// 	TokenNameCOMMENT_LINE	 
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
63000	TokenNameIntegerLiteral	
-	TokenNameMINUS	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
60000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// should trigger failed rollover 	TokenNameCOMMENT_LINE	should trigger failed rollover 
// 	TokenNameCOMMENT_LINE	 
root	TokenNameIdentifier	 root
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Rollover attempt while blocked"	TokenNameStringLiteral	Rollover attempt while blocked
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
os1	TokenNameIdentifier	 os1
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
os2	TokenNameIdentifier	 os2
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Message after block removed"	TokenNameStringLiteral	Message after block removed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// combine base file and potential rollovers 	TokenNameCOMMENT_LINE	combine base file and potential rollovers 
// since rollover may or may not have been blocked 	TokenNameCOMMENT_LINE	since rollover may or may not have been blocked 
// depending on platform. 	TokenNameCOMMENT_LINE	depending on platform. 
// 	TokenNameCOMMENT_LINE	 
String	TokenNameIdentifier	 String
combinedFilename	TokenNameIdentifier	 combined Filename
=	TokenNameEQUAL	
"output/drfa_blockedRollover.combined"	TokenNameStringLiteral	output/drfa_blockedRollover.combined
;	TokenNameSEMICOLON	
FileOutputStream	TokenNameIdentifier	 File Output Stream
combined	TokenNameIdentifier	 combined
=	TokenNameEQUAL	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
combinedFilename	TokenNameIdentifier	 combined Filename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
500	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
combined	TokenNameIdentifier	 combined
,	TokenNameCOMMA	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
block1	TokenNameIdentifier	 block1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
combined	TokenNameIdentifier	 combined
,	TokenNameCOMMA	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
block2	TokenNameIdentifier	 block2
)	TokenNameRPAREN	
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
combined	TokenNameIdentifier	 combined
,	TokenNameCOMMA	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
,	TokenNameCOMMA	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
combined	TokenNameIdentifier	 combined
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Compare	TokenNameIdentifier	 Compare
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
combinedFilename	TokenNameIdentifier	 combined Filename
,	TokenNameCOMMA	
"witness/drfa_blockedRollover.log"	TokenNameStringLiteral	witness/drfa_blockedRollover.log
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Check that the computed rollover period for a pattern containing a week as the finest unit is set to be * a week. Due to a locale mismatch this was incorrect in non-English locales. See bug 40888. * */	TokenNameCOMMENT_JAVADOC	 Check that the computed rollover period for a pattern containing a week as the finest unit is set to be a week. Due to a locale mismatch this was incorrect in non-English locales. See bug 40888. 
public	TokenNamepublic	
void	TokenNamevoid	
testWeeklyRollover	TokenNameIdentifier	 test Weekly Rollover
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DailyRollingFileAppender	TokenNameIdentifier	 Daily Rolling File Appender
drfa	TokenNameIdentifier	 drfa
=	TokenNameEQUAL	
new	TokenNamenew	
DailyRollingFileAppender	TokenNameIdentifier	 Daily Rolling File Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
drfa	TokenNameIdentifier	 drfa
.	TokenNameDOT	
setDatePattern	TokenNameIdentifier	 set Date Pattern
(	TokenNameLPAREN	
"'.'yyyy-ww"	TokenNameStringLiteral	'.'yyyy-ww
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
checkPeriod	TokenNameIdentifier	 check Period
=	TokenNameEQUAL	
drfa	TokenNameIdentifier	 drfa
.	TokenNameDOT	
computeCheckPeriod	TokenNameIdentifier	 compute Check Period
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
DailyRollingFileAppender	TokenNameIdentifier	 Daily Rolling File Appender
.	TokenNameDOT	
TOP_OF_WEEK	TokenNameIdentifier	 TOP  OF  WEEK
,	TokenNameCOMMA	
checkPeriod	TokenNameIdentifier	 check Period
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
