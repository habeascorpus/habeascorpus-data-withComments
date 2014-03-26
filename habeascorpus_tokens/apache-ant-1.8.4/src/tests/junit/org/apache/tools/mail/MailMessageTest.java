/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
mail	TokenNameIdentifier	 mail
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedReader	TokenNameIdentifier	 Buffered Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedWriter	TokenNameIdentifier	 Buffered Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
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
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStreamWriter	TokenNameIdentifier	 Output Stream Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintStream	TokenNameIdentifier	 Print Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
InetAddress	TokenNameIdentifier	 Inet Address
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
Socket	TokenNameIdentifier	 Socket
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
ServerSocket	TokenNameIdentifier	 Server Socket
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
mail	TokenNameIdentifier	 mail
.	TokenNameDOT	
MailMessage	TokenNameIdentifier	 Mail Message
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
/** * JUnit 3 testcases for org.apache.tools.mail.MailMessage. * * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 JUnit 3 testcases for org.apache.tools.mail.MailMessage. * @since Ant 1.6 
public	TokenNamepublic	
class	TokenNameclass	
MailMessageTest	TokenNameIdentifier	 Mail Message Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
// 27224 = magic (a random port which is unlikely to be in use) 	TokenNameCOMMENT_LINE	27224 = magic (a random port which is unlikely to be in use) 
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
TEST_PORT	TokenNameIdentifier	 TEST  PORT
=	TokenNameEQUAL	
27224	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
local	TokenNameIdentifier	 local
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MailMessageTest	TokenNameIdentifier	 Mail Message Test
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
try	TokenNametry	
{	TokenNameLBRACE	
local	TokenNameIdentifier	 local
=	TokenNameEQUAL	
InetAddress	TokenNameIdentifier	 Inet Address
.	TokenNameDOT	
getLocalHost	TokenNameIdentifier	 get Local Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getHostName	TokenNameIdentifier	 get Host Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
UnknownHostException	TokenNameIdentifier	 Unknown Host Exception
uhe	TokenNameIdentifier	 uhe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore 	TokenNameCOMMENT_LINE	ignore 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Test an example that is similar to the one given in the API * If this testcase takes >90s to complete, it is very likely that * the two threads are blocked waiting for each other and Thread.join() * timed out. */	TokenNameCOMMENT_JAVADOC	 Test an example that is similar to the one given in the API If this testcase takes >90s to complete, it is very likely that the two threads are blocked waiting for each other and Thread.join() timed out. 
public	TokenNamepublic	
void	TokenNamevoid	
testAPIExample	TokenNameIdentifier	 test API Example
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ServerThread	TokenNameIdentifier	 Server Thread
testMailServer	TokenNameIdentifier	 test Mail Server
=	TokenNameEQUAL	
new	TokenNamenew	
ServerThread	TokenNameIdentifier	 Server Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
server	TokenNameIdentifier	 server
=	TokenNameEQUAL	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
testMailServer	TokenNameIdentifier	 test Mail Server
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ClientThread	TokenNameIdentifier	 Client Thread
testMailClient	TokenNameIdentifier	 test Mail Client
=	TokenNameEQUAL	
new	TokenNamenew	
ClientThread	TokenNameIdentifier	 Client Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testMailClient	TokenNameIdentifier	 test Mail Client
.	TokenNameDOT	
from	TokenNameIdentifier	 from
(	TokenNameLPAREN	
"Mail Message <EmailTaskTest@ant.apache.org>"	TokenNameStringLiteral	Mail Message <EmailTaskTest@ant.apache.org>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testMailClient	TokenNameIdentifier	 test Mail Client
.	TokenNameDOT	
to	TokenNameIdentifier	 to
(	TokenNameLPAREN	
"to@you.com"	TokenNameStringLiteral	to@you.com
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testMailClient	TokenNameIdentifier	 test Mail Client
.	TokenNameDOT	
cc	TokenNameIdentifier	 cc
(	TokenNameLPAREN	
"cc1@you.com"	TokenNameStringLiteral	cc1@you.com
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testMailClient	TokenNameIdentifier	 test Mail Client
.	TokenNameDOT	
cc	TokenNameIdentifier	 cc
(	TokenNameLPAREN	
"cc2@you.com"	TokenNameStringLiteral	cc2@you.com
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testMailClient	TokenNameIdentifier	 test Mail Client
.	TokenNameDOT	
bcc	TokenNameIdentifier	 bcc
(	TokenNameLPAREN	
"bcc@you.com"	TokenNameStringLiteral	bcc@you.com
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testMailClient	TokenNameIdentifier	 test Mail Client
.	TokenNameDOT	
setSubject	TokenNameIdentifier	 set Subject
(	TokenNameLPAREN	
"Test subject"	TokenNameStringLiteral	Test subject
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testMailClient	TokenNameIdentifier	 test Mail Client
.	TokenNameDOT	
setMessage	TokenNameIdentifier	 set Message
(	TokenNameLPAREN	
"test line 1 "	TokenNameStringLiteral	test line 1 
+	TokenNamePLUS	
"test line 2"	TokenNameStringLiteral	test line 2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
client	TokenNameIdentifier	 client
=	TokenNameEQUAL	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
testMailClient	TokenNameIdentifier	 test Mail Client
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
client	TokenNameIdentifier	 client
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
60	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 60s 	TokenNameCOMMENT_LINE	60s 
client	TokenNameIdentifier	 client
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
30	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// a further 30s 	TokenNameCOMMENT_LINE	a further 30s 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"InterruptedException: "	TokenNameStringLiteral	InterruptedException: 
+	TokenNamePLUS	
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
testMailServer	TokenNameIdentifier	 test Mail Server
.	TokenNameDOT	
getResult	TokenNameIdentifier	 get Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
expectedResult	TokenNameIdentifier	 expected Result
=	TokenNameEQUAL	
"220 test SMTP EmailTaskTest "	TokenNameStringLiteral	220 test SMTP EmailTaskTest 
+	TokenNamePLUS	
"HELO "	TokenNameStringLiteral	HELO 
+	TokenNamePLUS	
local	TokenNameIdentifier	 local
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"250 "	TokenNameStringLiteral	250 
+	TokenNamePLUS	
local	TokenNameIdentifier	 local
+	TokenNamePLUS	
" Hello "	TokenNameStringLiteral	 Hello 
+	TokenNamePLUS	
local	TokenNameIdentifier	 local
+	TokenNamePLUS	
" [127.0.0.1], pleased to meet you "	TokenNameStringLiteral	 [127.0.0.1], pleased to meet you 
+	TokenNamePLUS	
"MAIL FROM: <EmailTaskTest@ant.apache.org> "	TokenNameStringLiteral	MAIL FROM: <EmailTaskTest@ant.apache.org> 
+	TokenNamePLUS	
"250 "	TokenNameStringLiteral	250 
+	TokenNamePLUS	
"RCPT TO: <to@you.com> "	TokenNameStringLiteral	RCPT TO: <to@you.com> 
+	TokenNamePLUS	
"250 "	TokenNameStringLiteral	250 
+	TokenNamePLUS	
"RCPT TO: <cc1@you.com> "	TokenNameStringLiteral	RCPT TO: <cc1@you.com> 
+	TokenNamePLUS	
"250 "	TokenNameStringLiteral	250 
+	TokenNamePLUS	
"RCPT TO: <cc2@you.com> "	TokenNameStringLiteral	RCPT TO: <cc2@you.com> 
+	TokenNamePLUS	
"250 "	TokenNameStringLiteral	250 
+	TokenNamePLUS	
"RCPT TO: <bcc@you.com> "	TokenNameStringLiteral	RCPT TO: <bcc@you.com> 
+	TokenNamePLUS	
"250 "	TokenNameStringLiteral	250 
+	TokenNamePLUS	
"DATA "	TokenNameStringLiteral	DATA 
+	TokenNamePLUS	
"354 "	TokenNameStringLiteral	354 
+	TokenNamePLUS	
"Subject: Test subject "	TokenNameStringLiteral	Subject: Test subject 
+	TokenNamePLUS	
"From: Mail Message <EmailTaskTest@ant.apache.org> "	TokenNameStringLiteral	From: Mail Message <EmailTaskTest@ant.apache.org> 
+	TokenNamePLUS	
"To: to@you.com "	TokenNameStringLiteral	To: to@you.com 
+	TokenNamePLUS	
"Cc: cc1@you.com, cc2@you.com "	TokenNameStringLiteral	Cc: cc1@you.com, cc2@you.com 
+	TokenNamePLUS	
"X-Mailer: org.apache.tools.mail.MailMessage (ant.apache.org) "	TokenNameStringLiteral	X-Mailer: org.apache.tools.mail.MailMessage (ant.apache.org) 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"test line 1 "	TokenNameStringLiteral	test line 1 
+	TokenNamePLUS	
"test line 2 "	TokenNameStringLiteral	test line 2 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
". "	TokenNameStringLiteral	. 
+	TokenNamePLUS	
"250 "	TokenNameStringLiteral	250 
+	TokenNamePLUS	
"QUIT "	TokenNameStringLiteral	QUIT 
+	TokenNamePLUS	
"221 "	TokenNameStringLiteral	221 
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
icounter	TokenNameIdentifier	 icounter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
icounter	TokenNameIdentifier	 icounter
<	TokenNameLESS	
expectedResult	TokenNameIdentifier	 expected Result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
icounter	TokenNameIdentifier	 icounter
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
icounter	TokenNameIdentifier	 icounter
<	TokenNameLESS	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
expectedResult	TokenNameIdentifier	 expected Result
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
icounter	TokenNameIdentifier	 icounter
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
icounter	TokenNameIdentifier	 icounter
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"posit "	TokenNameStringLiteral	posit 
+	TokenNamePLUS	
icounter	TokenNameIdentifier	 icounter
+	TokenNamePLUS	
" expected "	TokenNameStringLiteral	 expected 
+	TokenNamePLUS	
expectedResult	TokenNameIdentifier	 expected Result
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
icounter	TokenNameIdentifier	 icounter
)	TokenNameRPAREN	
+	TokenNamePLUS	
" result "	TokenNameStringLiteral	 result 
+	TokenNamePLUS	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
icounter	TokenNameIdentifier	 icounter
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
expectedResult	TokenNameIdentifier	 expected Result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"excedent of expected result "	TokenNameStringLiteral	excedent of expected result 
+	TokenNamePLUS	
expectedResult	TokenNameIdentifier	 expected Result
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
expectedResult	TokenNameIdentifier	 expected Result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"excedent of result "	TokenNameStringLiteral	excedent of result 
+	TokenNamePLUS	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
expectedResult	TokenNameIdentifier	 expected Result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expectedResult	TokenNameIdentifier	 expected Result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expectedResult	TokenNameIdentifier	 expected Result
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// order of headers cannot be guaranteed 	TokenNameCOMMENT_LINE	order of headers cannot be guaranteed 
if	TokenNameif	
(	TokenNameLPAREN	
testMailClient	TokenNameIdentifier	 test Mail Client
.	TokenNameDOT	
isFailed	TokenNameIdentifier	 is Failed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
testMailClient	TokenNameIdentifier	 test Mail Client
.	TokenNameDOT	
getFailMessage	TokenNameIdentifier	 get Fail Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Test a MailMessage with no cc or bcc lines */	TokenNameCOMMENT_JAVADOC	 Test a MailMessage with no cc or bcc lines 
public	TokenNamepublic	
void	TokenNamevoid	
testToOnly	TokenNameIdentifier	 test To Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ServerThread	TokenNameIdentifier	 Server Thread
testMailServer	TokenNameIdentifier	 test Mail Server
=	TokenNameEQUAL	
new	TokenNamenew	
ServerThread	TokenNameIdentifier	 Server Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
server	TokenNameIdentifier	 server
=	TokenNameEQUAL	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
testMailServer	TokenNameIdentifier	 test Mail Server
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ClientThread	TokenNameIdentifier	 Client Thread
testMailClient	TokenNameIdentifier	 test Mail Client
=	TokenNameEQUAL	
new	TokenNamenew	
ClientThread	TokenNameIdentifier	 Client Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testMailClient	TokenNameIdentifier	 test Mail Client
.	TokenNameDOT	
from	TokenNameIdentifier	 from
(	TokenNameLPAREN	
"Mail Message <EmailTaskTest@ant.apache.org>"	TokenNameStringLiteral	Mail Message <EmailTaskTest@ant.apache.org>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testMailClient	TokenNameIdentifier	 test Mail Client
.	TokenNameDOT	
to	TokenNameIdentifier	 to
(	TokenNameLPAREN	
"to@you.com"	TokenNameStringLiteral	to@you.com
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testMailClient	TokenNameIdentifier	 test Mail Client
.	TokenNameDOT	
setSubject	TokenNameIdentifier	 set Subject
(	TokenNameLPAREN	
"Test subject"	TokenNameStringLiteral	Test subject
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testMailClient	TokenNameIdentifier	 test Mail Client
.	TokenNameDOT	
setMessage	TokenNameIdentifier	 set Message
(	TokenNameLPAREN	
"test line 1 "	TokenNameStringLiteral	test line 1 
+	TokenNamePLUS	
"test line 2"	TokenNameStringLiteral	test line 2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
client	TokenNameIdentifier	 client
=	TokenNameEQUAL	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
testMailClient	TokenNameIdentifier	 test Mail Client
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
client	TokenNameIdentifier	 client
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
60	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 60s 	TokenNameCOMMENT_LINE	60s 
client	TokenNameIdentifier	 client
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
30	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// a further 30s 	TokenNameCOMMENT_LINE	a further 30s 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"InterruptedException: "	TokenNameStringLiteral	InterruptedException: 
+	TokenNamePLUS	
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
testMailServer	TokenNameIdentifier	 test Mail Server
.	TokenNameDOT	
getResult	TokenNameIdentifier	 get Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
expectedResult	TokenNameIdentifier	 expected Result
=	TokenNameEQUAL	
"220 test SMTP EmailTaskTest "	TokenNameStringLiteral	220 test SMTP EmailTaskTest 
+	TokenNamePLUS	
"HELO "	TokenNameStringLiteral	HELO 
+	TokenNamePLUS	
local	TokenNameIdentifier	 local
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"250 "	TokenNameStringLiteral	250 
+	TokenNamePLUS	
local	TokenNameIdentifier	 local
+	TokenNamePLUS	
" Hello "	TokenNameStringLiteral	 Hello 
+	TokenNamePLUS	
local	TokenNameIdentifier	 local
+	TokenNamePLUS	
" [127.0.0.1], pleased to meet you "	TokenNameStringLiteral	 [127.0.0.1], pleased to meet you 
+	TokenNamePLUS	
"MAIL FROM: <EmailTaskTest@ant.apache.org> "	TokenNameStringLiteral	MAIL FROM: <EmailTaskTest@ant.apache.org> 
+	TokenNamePLUS	
"250 "	TokenNameStringLiteral	250 
+	TokenNamePLUS	
"RCPT TO: <to@you.com> "	TokenNameStringLiteral	RCPT TO: <to@you.com> 
+	TokenNamePLUS	
"250 "	TokenNameStringLiteral	250 
+	TokenNamePLUS	
"DATA "	TokenNameStringLiteral	DATA 
+	TokenNamePLUS	
"354 "	TokenNameStringLiteral	354 
+	TokenNamePLUS	
"Subject: Test subject "	TokenNameStringLiteral	Subject: Test subject 
+	TokenNamePLUS	
"From: Mail Message <EmailTaskTest@ant.apache.org> "	TokenNameStringLiteral	From: Mail Message <EmailTaskTest@ant.apache.org> 
+	TokenNamePLUS	
"To: to@you.com "	TokenNameStringLiteral	To: to@you.com 
+	TokenNamePLUS	
"X-Mailer: org.apache.tools.mail.MailMessage (ant.apache.org) "	TokenNameStringLiteral	X-Mailer: org.apache.tools.mail.MailMessage (ant.apache.org) 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"test line 1 "	TokenNameStringLiteral	test line 1 
+	TokenNamePLUS	
"test line 2 "	TokenNameStringLiteral	test line 2 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
". "	TokenNameStringLiteral	. 
+	TokenNamePLUS	
"250 "	TokenNameStringLiteral	250 
+	TokenNamePLUS	
"QUIT "	TokenNameStringLiteral	QUIT 
+	TokenNamePLUS	
"221 "	TokenNameStringLiteral	221 
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expectedResult	TokenNameIdentifier	 expected Result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expectedResult	TokenNameIdentifier	 expected Result
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// order of headers cannot be guaranteed 	TokenNameCOMMENT_LINE	order of headers cannot be guaranteed 
if	TokenNameif	
(	TokenNameLPAREN	
testMailClient	TokenNameIdentifier	 test Mail Client
.	TokenNameDOT	
isFailed	TokenNameIdentifier	 is Failed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
testMailClient	TokenNameIdentifier	 test Mail Client
.	TokenNameDOT	
getFailMessage	TokenNameIdentifier	 get Fail Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Test a MailMessage with no to or bcc lines */	TokenNameCOMMENT_JAVADOC	 Test a MailMessage with no to or bcc lines 
public	TokenNamepublic	
void	TokenNamevoid	
testCcOnly	TokenNameIdentifier	 test Cc Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ServerThread	TokenNameIdentifier	 Server Thread
testMailServer	TokenNameIdentifier	 test Mail Server
=	TokenNameEQUAL	
new	TokenNamenew	
ServerThread	TokenNameIdentifier	 Server Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
server	TokenNameIdentifier	 server
=	TokenNameEQUAL	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
testMailServer	TokenNameIdentifier	 test Mail Server
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ClientThread	TokenNameIdentifier	 Client Thread
testMailClient	TokenNameIdentifier	 test Mail Client
=	TokenNameEQUAL	
new	TokenNamenew	
ClientThread	TokenNameIdentifier	 Client Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testMailClient	TokenNameIdentifier	 test Mail Client
.	TokenNameDOT	
from	TokenNameIdentifier	 from
(	TokenNameLPAREN	
"Mail Message <EmailTaskTest@ant.apache.org>"	TokenNameStringLiteral	Mail Message <EmailTaskTest@ant.apache.org>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testMailClient	TokenNameIdentifier	 test Mail Client
.	TokenNameDOT	
cc	TokenNameIdentifier	 cc
(	TokenNameLPAREN	
"cc@you.com"	TokenNameStringLiteral	cc@you.com
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testMailClient	TokenNameIdentifier	 test Mail Client
.	TokenNameDOT	
setSubject	TokenNameIdentifier	 set Subject
(	TokenNameLPAREN	
"Test subject"	TokenNameStringLiteral	Test subject
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testMailClient	TokenNameIdentifier	 test Mail Client
.	TokenNameDOT	
setMessage	TokenNameIdentifier	 set Message
(	TokenNameLPAREN	
"test line 1 "	TokenNameStringLiteral	test line 1 
+	TokenNamePLUS	
"test line 2"	TokenNameStringLiteral	test line 2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
client	TokenNameIdentifier	 client
=	TokenNameEQUAL	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
testMailClient	TokenNameIdentifier	 test Mail Client
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
client	TokenNameIdentifier	 client
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
60	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 60s 	TokenNameCOMMENT_LINE	60s 
client	TokenNameIdentifier	 client
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
30	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// a further 30s 	TokenNameCOMMENT_LINE	a further 30s 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"InterruptedException: "	TokenNameStringLiteral	InterruptedException: 
+	TokenNamePLUS	
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
testMailServer	TokenNameIdentifier	 test Mail Server
.	TokenNameDOT	
getResult	TokenNameIdentifier	 get Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
expectedResult	TokenNameIdentifier	 expected Result
=	TokenNameEQUAL	
"220 test SMTP EmailTaskTest "	TokenNameStringLiteral	220 test SMTP EmailTaskTest 
+	TokenNamePLUS	
"HELO "	TokenNameStringLiteral	HELO 
+	TokenNamePLUS	
local	TokenNameIdentifier	 local
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"250 "	TokenNameStringLiteral	250 
+	TokenNamePLUS	
local	TokenNameIdentifier	 local
+	TokenNamePLUS	
" Hello "	TokenNameStringLiteral	 Hello 
+	TokenNamePLUS	
local	TokenNameIdentifier	 local
+	TokenNamePLUS	
" [127.0.0.1], pleased to meet you "	TokenNameStringLiteral	 [127.0.0.1], pleased to meet you 
+	TokenNamePLUS	
"MAIL FROM: <EmailTaskTest@ant.apache.org> "	TokenNameStringLiteral	MAIL FROM: <EmailTaskTest@ant.apache.org> 
+	TokenNamePLUS	
"250 "	TokenNameStringLiteral	250 
+	TokenNamePLUS	
"RCPT TO: <cc@you.com> "	TokenNameStringLiteral	RCPT TO: <cc@you.com> 
+	TokenNamePLUS	
"250 "	TokenNameStringLiteral	250 
+	TokenNamePLUS	
"DATA "	TokenNameStringLiteral	DATA 
+	TokenNamePLUS	
"354 "	TokenNameStringLiteral	354 
+	TokenNamePLUS	
"Subject: Test subject "	TokenNameStringLiteral	Subject: Test subject 
+	TokenNamePLUS	
"From: Mail Message <EmailTaskTest@ant.apache.org> "	TokenNameStringLiteral	From: Mail Message <EmailTaskTest@ant.apache.org> 
+	TokenNamePLUS	
"Cc: cc@you.com "	TokenNameStringLiteral	Cc: cc@you.com 
+	TokenNamePLUS	
"X-Mailer: org.apache.tools.mail.MailMessage (ant.apache.org) "	TokenNameStringLiteral	X-Mailer: org.apache.tools.mail.MailMessage (ant.apache.org) 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"test line 1 "	TokenNameStringLiteral	test line 1 
+	TokenNamePLUS	
"test line 2 "	TokenNameStringLiteral	test line 2 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
". "	TokenNameStringLiteral	. 
+	TokenNamePLUS	
"250 "	TokenNameStringLiteral	250 
+	TokenNamePLUS	
"QUIT "	TokenNameStringLiteral	QUIT 
+	TokenNamePLUS	
"221 "	TokenNameStringLiteral	221 
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expectedResult	TokenNameIdentifier	 expected Result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expectedResult	TokenNameIdentifier	 expected Result
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
testMailClient	TokenNameIdentifier	 test Mail Client
.	TokenNameDOT	
isFailed	TokenNameIdentifier	 is Failed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
testMailClient	TokenNameIdentifier	 test Mail Client
.	TokenNameDOT	
getFailMessage	TokenNameIdentifier	 get Fail Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Test a MailMessage with no to or cc lines */	TokenNameCOMMENT_JAVADOC	 Test a MailMessage with no to or cc lines 
public	TokenNamepublic	
void	TokenNamevoid	
testBccOnly	TokenNameIdentifier	 test Bcc Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ServerThread	TokenNameIdentifier	 Server Thread
testMailServer	TokenNameIdentifier	 test Mail Server
=	TokenNameEQUAL	
new	TokenNamenew	
ServerThread	TokenNameIdentifier	 Server Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
server	TokenNameIdentifier	 server
=	TokenNameEQUAL	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
testMailServer	TokenNameIdentifier	 test Mail Server
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ClientThread	TokenNameIdentifier	 Client Thread
testMailClient	TokenNameIdentifier	 test Mail Client
=	TokenNameEQUAL	
new	TokenNamenew	
ClientThread	TokenNameIdentifier	 Client Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testMailClient	TokenNameIdentifier	 test Mail Client
.	TokenNameDOT	
from	TokenNameIdentifier	 from
(	TokenNameLPAREN	
"Mail Message <EmailTaskTest@ant.apache.org>"	TokenNameStringLiteral	Mail Message <EmailTaskTest@ant.apache.org>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testMailClient	TokenNameIdentifier	 test Mail Client
.	TokenNameDOT	
bcc	TokenNameIdentifier	 bcc
(	TokenNameLPAREN	
"bcc@you.com"	TokenNameStringLiteral	bcc@you.com
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testMailClient	TokenNameIdentifier	 test Mail Client
.	TokenNameDOT	
setSubject	TokenNameIdentifier	 set Subject
(	TokenNameLPAREN	
"Test subject"	TokenNameStringLiteral	Test subject
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testMailClient	TokenNameIdentifier	 test Mail Client
.	TokenNameDOT	
setMessage	TokenNameIdentifier	 set Message
(	TokenNameLPAREN	
"test line 1 "	TokenNameStringLiteral	test line 1 
+	TokenNamePLUS	
"test line 2"	TokenNameStringLiteral	test line 2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
client	TokenNameIdentifier	 client
=	TokenNameEQUAL	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
testMailClient	TokenNameIdentifier	 test Mail Client
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
client	TokenNameIdentifier	 client
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
60	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 60s 	TokenNameCOMMENT_LINE	60s 
client	TokenNameIdentifier	 client
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
30	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// a further 30s 	TokenNameCOMMENT_LINE	a further 30s 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"InterruptedException: "	TokenNameStringLiteral	InterruptedException: 
+	TokenNamePLUS	
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
testMailServer	TokenNameIdentifier	 test Mail Server
.	TokenNameDOT	
getResult	TokenNameIdentifier	 get Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
expectedResult	TokenNameIdentifier	 expected Result
=	TokenNameEQUAL	
"220 test SMTP EmailTaskTest "	TokenNameStringLiteral	220 test SMTP EmailTaskTest 
+	TokenNamePLUS	
"HELO "	TokenNameStringLiteral	HELO 
+	TokenNamePLUS	
local	TokenNameIdentifier	 local
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"250 "	TokenNameStringLiteral	250 
+	TokenNamePLUS	
local	TokenNameIdentifier	 local
+	TokenNamePLUS	
" Hello "	TokenNameStringLiteral	 Hello 
+	TokenNamePLUS	
local	TokenNameIdentifier	 local
+	TokenNamePLUS	
" [127.0.0.1], pleased to meet you "	TokenNameStringLiteral	 [127.0.0.1], pleased to meet you 
+	TokenNamePLUS	
"MAIL FROM: <EmailTaskTest@ant.apache.org> "	TokenNameStringLiteral	MAIL FROM: <EmailTaskTest@ant.apache.org> 
+	TokenNamePLUS	
"250 "	TokenNameStringLiteral	250 
+	TokenNamePLUS	
"RCPT TO: <bcc@you.com> "	TokenNameStringLiteral	RCPT TO: <bcc@you.com> 
+	TokenNamePLUS	
"250 "	TokenNameStringLiteral	250 
+	TokenNamePLUS	
"DATA "	TokenNameStringLiteral	DATA 
+	TokenNamePLUS	
"354 "	TokenNameStringLiteral	354 
+	TokenNamePLUS	
"Subject: Test subject "	TokenNameStringLiteral	Subject: Test subject 
+	TokenNamePLUS	
"From: Mail Message <EmailTaskTest@ant.apache.org> "	TokenNameStringLiteral	From: Mail Message <EmailTaskTest@ant.apache.org> 
+	TokenNamePLUS	
"X-Mailer: org.apache.tools.mail.MailMessage (ant.apache.org) "	TokenNameStringLiteral	X-Mailer: org.apache.tools.mail.MailMessage (ant.apache.org) 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"test line 1 "	TokenNameStringLiteral	test line 1 
+	TokenNamePLUS	
"test line 2 "	TokenNameStringLiteral	test line 2 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
". "	TokenNameStringLiteral	. 
+	TokenNamePLUS	
"250 "	TokenNameStringLiteral	250 
+	TokenNamePLUS	
"QUIT "	TokenNameStringLiteral	QUIT 
+	TokenNamePLUS	
"221 "	TokenNameStringLiteral	221 
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expectedResult	TokenNameIdentifier	 expected Result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expectedResult	TokenNameIdentifier	 expected Result
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
testMailClient	TokenNameIdentifier	 test Mail Client
.	TokenNameDOT	
isFailed	TokenNameIdentifier	 is Failed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
testMailClient	TokenNameIdentifier	 test Mail Client
.	TokenNameDOT	
getFailMessage	TokenNameIdentifier	 get Fail Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Test a MailMessage with no subject line * Subject is an optional field (RFC 822 s4.1) */	TokenNameCOMMENT_JAVADOC	 Test a MailMessage with no subject line Subject is an optional field (RFC 822 s4.1) 
public	TokenNamepublic	
void	TokenNamevoid	
testNoSubject	TokenNameIdentifier	 test No Subject
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ServerThread	TokenNameIdentifier	 Server Thread
testMailServer	TokenNameIdentifier	 test Mail Server
=	TokenNameEQUAL	
new	TokenNamenew	
ServerThread	TokenNameIdentifier	 Server Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
server	TokenNameIdentifier	 server
=	TokenNameEQUAL	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
testMailServer	TokenNameIdentifier	 test Mail Server
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ClientThread	TokenNameIdentifier	 Client Thread
testMailClient	TokenNameIdentifier	 test Mail Client
=	TokenNameEQUAL	
new	TokenNamenew	
ClientThread	TokenNameIdentifier	 Client Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testMailClient	TokenNameIdentifier	 test Mail Client
.	TokenNameDOT	
from	TokenNameIdentifier	 from
(	TokenNameLPAREN	
"Mail Message <EmailTaskTest@ant.apache.org>"	TokenNameStringLiteral	Mail Message <EmailTaskTest@ant.apache.org>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testMailClient	TokenNameIdentifier	 test Mail Client
.	TokenNameDOT	
to	TokenNameIdentifier	 to
(	TokenNameLPAREN	
"to@you.com"	TokenNameStringLiteral	to@you.com
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testMailClient	TokenNameIdentifier	 test Mail Client
.	TokenNameDOT	
setMessage	TokenNameIdentifier	 set Message
(	TokenNameLPAREN	
"test line 1 "	TokenNameStringLiteral	test line 1 
+	TokenNamePLUS	
"test line 2"	TokenNameStringLiteral	test line 2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
client	TokenNameIdentifier	 client
=	TokenNameEQUAL	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
testMailClient	TokenNameIdentifier	 test Mail Client
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
client	TokenNameIdentifier	 client
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
60	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 60s 	TokenNameCOMMENT_LINE	60s 
client	TokenNameIdentifier	 client
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
30	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// a further 30s 	TokenNameCOMMENT_LINE	a further 30s 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"InterruptedException: "	TokenNameStringLiteral	InterruptedException: 
+	TokenNamePLUS	
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
testMailServer	TokenNameIdentifier	 test Mail Server
.	TokenNameDOT	
getResult	TokenNameIdentifier	 get Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
expectedResult	TokenNameIdentifier	 expected Result
=	TokenNameEQUAL	
"220 test SMTP EmailTaskTest "	TokenNameStringLiteral	220 test SMTP EmailTaskTest 
+	TokenNamePLUS	
"HELO "	TokenNameStringLiteral	HELO 
+	TokenNamePLUS	
local	TokenNameIdentifier	 local
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"250 "	TokenNameStringLiteral	250 
+	TokenNamePLUS	
local	TokenNameIdentifier	 local
+	TokenNamePLUS	
" Hello "	TokenNameStringLiteral	 Hello 
+	TokenNamePLUS	
local	TokenNameIdentifier	 local
+	TokenNamePLUS	
" [127.0.0.1], pleased to meet you "	TokenNameStringLiteral	 [127.0.0.1], pleased to meet you 
+	TokenNamePLUS	
"MAIL FROM: <EmailTaskTest@ant.apache.org> "	TokenNameStringLiteral	MAIL FROM: <EmailTaskTest@ant.apache.org> 
+	TokenNamePLUS	
"250 "	TokenNameStringLiteral	250 
+	TokenNamePLUS	
"RCPT TO: <to@you.com> "	TokenNameStringLiteral	RCPT TO: <to@you.com> 
+	TokenNamePLUS	
"250 "	TokenNameStringLiteral	250 
+	TokenNamePLUS	
"DATA "	TokenNameStringLiteral	DATA 
+	TokenNamePLUS	
"354 "	TokenNameStringLiteral	354 
+	TokenNamePLUS	
"From: Mail Message <EmailTaskTest@ant.apache.org> "	TokenNameStringLiteral	From: Mail Message <EmailTaskTest@ant.apache.org> 
+	TokenNamePLUS	
"To: to@you.com "	TokenNameStringLiteral	To: to@you.com 
+	TokenNamePLUS	
"X-Mailer: org.apache.tools.mail.MailMessage (ant.apache.org) "	TokenNameStringLiteral	X-Mailer: org.apache.tools.mail.MailMessage (ant.apache.org) 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"test line 1 "	TokenNameStringLiteral	test line 1 
+	TokenNamePLUS	
"test line 2 "	TokenNameStringLiteral	test line 2 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
". "	TokenNameStringLiteral	. 
+	TokenNamePLUS	
"250 "	TokenNameStringLiteral	250 
+	TokenNamePLUS	
"QUIT "	TokenNameStringLiteral	QUIT 
+	TokenNamePLUS	
"221 "	TokenNameStringLiteral	221 
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expectedResult	TokenNameIdentifier	 expected Result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expectedResult	TokenNameIdentifier	 expected Result
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
testMailClient	TokenNameIdentifier	 test Mail Client
.	TokenNameDOT	
isFailed	TokenNameIdentifier	 is Failed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
testMailClient	TokenNameIdentifier	 test Mail Client
.	TokenNameDOT	
getFailMessage	TokenNameIdentifier	 get Fail Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Test a MailMessage with empty body message */	TokenNameCOMMENT_JAVADOC	 Test a MailMessage with empty body message 
public	TokenNamepublic	
void	TokenNamevoid	
testEmptyBody	TokenNameIdentifier	 test Empty Body
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ServerThread	TokenNameIdentifier	 Server Thread
testMailServer	TokenNameIdentifier	 test Mail Server
=	TokenNameEQUAL	
new	TokenNamenew	
ServerThread	TokenNameIdentifier	 Server Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
server	TokenNameIdentifier	 server
=	TokenNameEQUAL	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
testMailServer	TokenNameIdentifier	 test Mail Server
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ClientThread	TokenNameIdentifier	 Client Thread
testMailClient	TokenNameIdentifier	 test Mail Client
=	TokenNameEQUAL	
new	TokenNamenew	
ClientThread	TokenNameIdentifier	 Client Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testMailClient	TokenNameIdentifier	 test Mail Client
.	TokenNameDOT	
from	TokenNameIdentifier	 from
(	TokenNameLPAREN	
"Mail Message <EmailTaskTest@ant.apache.org>"	TokenNameStringLiteral	Mail Message <EmailTaskTest@ant.apache.org>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testMailClient	TokenNameIdentifier	 test Mail Client
.	TokenNameDOT	
to	TokenNameIdentifier	 to
(	TokenNameLPAREN	
"to@you.com"	TokenNameStringLiteral	to@you.com
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testMailClient	TokenNameIdentifier	 test Mail Client
.	TokenNameDOT	
setSubject	TokenNameIdentifier	 set Subject
(	TokenNameLPAREN	
"Test subject"	TokenNameStringLiteral	Test subject
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testMailClient	TokenNameIdentifier	 test Mail Client
.	TokenNameDOT	
setMessage	TokenNameIdentifier	 set Message
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
client	TokenNameIdentifier	 client
=	TokenNameEQUAL	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
testMailClient	TokenNameIdentifier	 test Mail Client
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
client	TokenNameIdentifier	 client
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
60	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 60s 	TokenNameCOMMENT_LINE	60s 
client	TokenNameIdentifier	 client
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
30	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// a further 30s 	TokenNameCOMMENT_LINE	a further 30s 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"InterruptedException: "	TokenNameStringLiteral	InterruptedException: 
+	TokenNamePLUS	
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
testMailServer	TokenNameIdentifier	 test Mail Server
.	TokenNameDOT	
getResult	TokenNameIdentifier	 get Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
expectedResult	TokenNameIdentifier	 expected Result
=	TokenNameEQUAL	
"220 test SMTP EmailTaskTest "	TokenNameStringLiteral	220 test SMTP EmailTaskTest 
+	TokenNamePLUS	
"HELO "	TokenNameStringLiteral	HELO 
+	TokenNamePLUS	
local	TokenNameIdentifier	 local
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"250 "	TokenNameStringLiteral	250 
+	TokenNamePLUS	
local	TokenNameIdentifier	 local
+	TokenNamePLUS	
" Hello "	TokenNameStringLiteral	 Hello 
+	TokenNamePLUS	
local	TokenNameIdentifier	 local
+	TokenNamePLUS	
" [127.0.0.1], pleased to meet you "	TokenNameStringLiteral	 [127.0.0.1], pleased to meet you 
+	TokenNamePLUS	
"MAIL FROM: <EmailTaskTest@ant.apache.org> "	TokenNameStringLiteral	MAIL FROM: <EmailTaskTest@ant.apache.org> 
+	TokenNamePLUS	
"250 "	TokenNameStringLiteral	250 
+	TokenNamePLUS	
"RCPT TO: <to@you.com> "	TokenNameStringLiteral	RCPT TO: <to@you.com> 
+	TokenNamePLUS	
"250 "	TokenNameStringLiteral	250 
+	TokenNamePLUS	
"DATA "	TokenNameStringLiteral	DATA 
+	TokenNamePLUS	
"354 "	TokenNameStringLiteral	354 
+	TokenNamePLUS	
"Subject: Test subject "	TokenNameStringLiteral	Subject: Test subject 
+	TokenNamePLUS	
"From: Mail Message <EmailTaskTest@ant.apache.org> "	TokenNameStringLiteral	From: Mail Message <EmailTaskTest@ant.apache.org> 
+	TokenNamePLUS	
"To: to@you.com "	TokenNameStringLiteral	To: to@you.com 
+	TokenNamePLUS	
"X-Mailer: org.apache.tools.mail.MailMessage (ant.apache.org) "	TokenNameStringLiteral	X-Mailer: org.apache.tools.mail.MailMessage (ant.apache.org) 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
". "	TokenNameStringLiteral	. 
+	TokenNamePLUS	
"250 "	TokenNameStringLiteral	250 
+	TokenNamePLUS	
"QUIT "	TokenNameStringLiteral	QUIT 
+	TokenNamePLUS	
"221 "	TokenNameStringLiteral	221 
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expectedResult	TokenNameIdentifier	 expected Result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expectedResult	TokenNameIdentifier	 expected Result
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
testMailClient	TokenNameIdentifier	 test Mail Client
.	TokenNameDOT	
isFailed	TokenNameIdentifier	 is Failed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
testMailClient	TokenNameIdentifier	 test Mail Client
.	TokenNameDOT	
getFailMessage	TokenNameIdentifier	 get Fail Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Test a MailMessage with US-ASCII character set * The next four testcase can be kinda hard to debug as Ant will often * print the junit failure in US-ASCII. */	TokenNameCOMMENT_JAVADOC	 Test a MailMessage with US-ASCII character set The next four testcase can be kinda hard to debug as Ant will often print the junit failure in US-ASCII. 
public	TokenNamepublic	
void	TokenNamevoid	
testAsciiCharset	TokenNameIdentifier	 test Ascii Charset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ServerThread	TokenNameIdentifier	 Server Thread
testMailServer	TokenNameIdentifier	 test Mail Server
=	TokenNameEQUAL	
new	TokenNamenew	
ServerThread	TokenNameIdentifier	 Server Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
server	TokenNameIdentifier	 server
=	TokenNameEQUAL	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
testMailServer	TokenNameIdentifier	 test Mail Server
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ClientThread	TokenNameIdentifier	 Client Thread
testMailClient	TokenNameIdentifier	 test Mail Client
=	TokenNameEQUAL	
new	TokenNamenew	
ClientThread	TokenNameIdentifier	 Client Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testMailClient	TokenNameIdentifier	 test Mail Client
.	TokenNameDOT	
from	TokenNameIdentifier	 from
(	TokenNameLPAREN	
"Mail Message <EmailTaskTest@ant.apache.org>"	TokenNameStringLiteral	Mail Message <EmailTaskTest@ant.apache.org>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testMailClient	TokenNameIdentifier	 test Mail Client
.	TokenNameDOT	
to	TokenNameIdentifier	 to
(	TokenNameLPAREN	
"Ceki Gülcü <abuse@mail-abuse.org>"	TokenNameStringLiteral	Ceki Gülcü <abuse@mail-abuse.org>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testMailClient	TokenNameIdentifier	 test Mail Client
.	TokenNameDOT	
setSubject	TokenNameIdentifier	 set Subject
(	TokenNameLPAREN	
"Test subject"	TokenNameStringLiteral	Test subject
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testMailClient	TokenNameIdentifier	 test Mail Client
.	TokenNameDOT	
setMessage	TokenNameIdentifier	 set Message
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
client	TokenNameIdentifier	 client
=	TokenNameEQUAL	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
testMailClient	TokenNameIdentifier	 test Mail Client
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
client	TokenNameIdentifier	 client
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
server	TokenNameIdentifier	 server
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
60	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 60s 	TokenNameCOMMENT_LINE	60s 
client	TokenNameIdentifier	 client
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
30	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// a further 30s 	TokenNameCOMMENT_LINE	a further 30s 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"InterruptedException: "	TokenNameStringLiteral	InterruptedException: 
+	TokenNamePLUS	
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
testMailServer	TokenNameIdentifier	 test Mail Server
.	TokenNameDOT	
getResult	TokenNameIdentifier	 get Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
expectedResult	TokenNameIdentifier	 expected Result
=	TokenNameEQUAL	
"220 test SMTP EmailTaskTest "	TokenNameStringLiteral	220 test SMTP EmailTaskTest 
+	TokenNamePLUS	
"HELO "	TokenNameStringLiteral	HELO 
+	TokenNamePLUS	
local	TokenNameIdentifier	 local
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"250 "	TokenNameStringLiteral	250 
+	TokenNamePLUS	
local	TokenNameIdentifier	 local
+	TokenNamePLUS	
" Hello "	TokenNameStringLiteral	 Hello 
+	TokenNamePLUS	
local	TokenNameIdentifier	 local
+	TokenNamePLUS	
" [127.0.0.1], pleased to meet you "	TokenNameStringLiteral	 [127.0.0.1], pleased to meet you 
+	TokenNamePLUS	
"MAIL FROM: <EmailTaskTest@ant.apache.org> "	TokenNameStringLiteral	MAIL FROM: <EmailTaskTest@ant.apache.org> 
+	TokenNamePLUS	
"250 "	TokenNameStringLiteral	250 
+	TokenNamePLUS	
"RCPT TO: <abuse@mail-abuse.org> "	TokenNameStringLiteral	RCPT TO: <abuse@mail-abuse.org> 
+	TokenNamePLUS	
"250 "	TokenNameStringLiteral	250 
+	TokenNamePLUS	
"DATA "	TokenNameStringLiteral	DATA 
+	TokenNamePLUS	
"354 "	TokenNameStringLiteral	354 
+	TokenNamePLUS	
"Subject: Test subject "	TokenNameStringLiteral	Subject: Test subject 
+	TokenNamePLUS	
"From: Mail Message <EmailTaskTest@ant.apache.org> "	TokenNameStringLiteral	From: Mail Message <EmailTaskTest@ant.apache.org> 
+	TokenNamePLUS	
"To: Ceki Gülcü <abuse@mail-abuse.org> "	TokenNameStringLiteral	To: Ceki Gülcü <abuse@mail-abuse.org> 
+	TokenNamePLUS	
"X-Mailer: org.apache.tools.mail.MailMessage (ant.apache.org) "	TokenNameStringLiteral	X-Mailer: org.apache.tools.mail.MailMessage (ant.apache.org) 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
". "	TokenNameStringLiteral	. 
+	TokenNamePLUS	
"250 "	TokenNameStringLiteral	250 
+	TokenNamePLUS	
"QUIT "	TokenNameStringLiteral	QUIT 
+	TokenNamePLUS	
"221 "	TokenNameStringLiteral	221 
;	TokenNameSEMICOLON	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
baos1	TokenNameIdentifier	 baos1
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
baos2	TokenNameIdentifier	 baos2
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PrintStream	TokenNameIdentifier	 Print Stream
bos1	TokenNameIdentifier	 bos1
=	TokenNameEQUAL	
new	TokenNamenew	
PrintStream	TokenNameIdentifier	 Print Stream
(	TokenNameLPAREN	
baos1	TokenNameIdentifier	 baos1
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PrintStream	TokenNameIdentifier	 Print Stream
bos2	TokenNameIdentifier	 bos2
=	TokenNameEQUAL	
new	TokenNamenew	
PrintStream	TokenNameIdentifier	 Print Stream
(	TokenNameLPAREN	
baos2	TokenNameIdentifier	 baos2
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bos1	TokenNameIdentifier	 bos1
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
expectedResult	TokenNameIdentifier	 expected Result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bos2	TokenNameIdentifier	 bos2
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"expected message length != actual message length "	TokenNameStringLiteral	expected message length != actual message length 
+	TokenNamePLUS	
"in testAsciiCharset()"	TokenNameStringLiteral	in testAsciiCharset()
,	TokenNameCOMMA	
expectedResult	TokenNameIdentifier	 expected Result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"baos1 and baos2 should be the same in testAsciiCharset()"	TokenNameStringLiteral	baos1 and baos2 should be the same in testAsciiCharset()
,	TokenNameCOMMA	
baos1	TokenNameIdentifier	 baos1
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
baos2	TokenNameIdentifier	 baos2
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// order of headers cannot be guaranteed 	TokenNameCOMMENT_LINE	order of headers cannot be guaranteed 
if	TokenNameif	
(	TokenNameLPAREN	
testMailClient	TokenNameIdentifier	 test Mail Client
.	TokenNameDOT	
isFailed	TokenNameIdentifier	 is Failed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
testMailClient	TokenNameIdentifier	 test Mail Client
.	TokenNameDOT	
getFailMessage	TokenNameIdentifier	 get Fail Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * A private test class that pretends to be a mail transfer agent */	TokenNameCOMMENT_JAVADOC	 A private test class that pretends to be a mail transfer agent 
private	TokenNameprivate	
class	TokenNameclass	
ServerThread	TokenNameIdentifier	 Server Thread
implements	TokenNameimplements	
Runnable	TokenNameIdentifier	 Runnable
{	TokenNameLBRACE	
private	TokenNameprivate	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
loop	TokenNameIdentifier	 loop
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
ServerSocket	TokenNameIdentifier	 Server Socket
ssock	TokenNameIdentifier	 ssock
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Socket	TokenNameIdentifier	 Socket
sock	TokenNameIdentifier	 sock
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
BufferedWriter	TokenNameIdentifier	 Buffered Writer
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
BufferedReader	TokenNameIdentifier	 Buffered Reader
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// state engine: false=envelope, true=message 	TokenNameCOMMENT_LINE	state engine: false=envelope, true=message 
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ssock	TokenNameIdentifier	 ssock
=	TokenNameEQUAL	
new	TokenNamenew	
ServerSocket	TokenNameIdentifier	 Server Socket
(	TokenNameLPAREN	
TEST_PORT	TokenNameIdentifier	 TEST  PORT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sock	TokenNameIdentifier	 sock
=	TokenNameEQUAL	
ssock	TokenNameIdentifier	 ssock
.	TokenNameDOT	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// wait for connection 	TokenNameCOMMENT_LINE	wait for connection 
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
sock	TokenNameIdentifier	 sock
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedWriter	TokenNameIdentifier	 Buffered Writer
(	TokenNameLPAREN	
new	TokenNamenew	
OutputStreamWriter	TokenNameIdentifier	 Output Stream Writer
(	TokenNameLPAREN	
sock	TokenNameIdentifier	 sock
.	TokenNameDOT	
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
send	TokenNameIdentifier	 send
(	TokenNameLPAREN	
"220 test SMTP EmailTaskTest "	TokenNameStringLiteral	220 test SMTP EmailTaskTest 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
loop	TokenNameIdentifier	 loop
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
loop	TokenNameIdentifier	 loop
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
response	TokenNameIdentifier	 response
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
response	TokenNameIdentifier	 response
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
loop	TokenNameIdentifier	 loop
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
response	TokenNameIdentifier	 response
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
data	TokenNameIdentifier	 data
&&	TokenNameAND_AND	
response	TokenNameIdentifier	 response
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"HELO"	TokenNameStringLiteral	HELO
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
send	TokenNameIdentifier	 send
(	TokenNameLPAREN	
"250 "	TokenNameStringLiteral	250 
+	TokenNamePLUS	
local	TokenNameIdentifier	 local
+	TokenNamePLUS	
" Hello "	TokenNameStringLiteral	 Hello 
+	TokenNamePLUS	
local	TokenNameIdentifier	 local
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"[127.0.0.1], pleased to meet you "	TokenNameStringLiteral	[127.0.0.1], pleased to meet you 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
data	TokenNameIdentifier	 data
&&	TokenNameAND_AND	
response	TokenNameIdentifier	 response
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"MAIL"	TokenNameStringLiteral	MAIL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
send	TokenNameIdentifier	 send
(	TokenNameLPAREN	
"250 "	TokenNameStringLiteral	250 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
data	TokenNameIdentifier	 data
&&	TokenNameAND_AND	
response	TokenNameIdentifier	 response
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"RCPT"	TokenNameStringLiteral	RCPT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
send	TokenNameIdentifier	 send
(	TokenNameLPAREN	
"250 "	TokenNameStringLiteral	250 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
data	TokenNameIdentifier	 data
&&	TokenNameAND_AND	
response	TokenNameIdentifier	 response
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"DATA"	TokenNameStringLiteral	DATA
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
send	TokenNameIdentifier	 send
(	TokenNameLPAREN	
"354 "	TokenNameStringLiteral	354 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
&&	TokenNameAND_AND	
response	TokenNameIdentifier	 response
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
send	TokenNameIdentifier	 send
(	TokenNameLPAREN	
"250 "	TokenNameStringLiteral	250 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
data	TokenNameIdentifier	 data
&&	TokenNameAND_AND	
response	TokenNameIdentifier	 response
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"QUIT"	TokenNameStringLiteral	QUIT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
send	TokenNameIdentifier	 send
(	TokenNameLPAREN	
"221 "	TokenNameStringLiteral	221 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
loop	TokenNameIdentifier	 loop
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//throw new IllegalStateException("Command unrecognized: " 	TokenNameCOMMENT_LINE	throw new IllegalStateException("Command unrecognized: " 
// + response); 	TokenNameCOMMENT_LINE	+ response); 
send	TokenNameIdentifier	 send
(	TokenNameLPAREN	
"500 5.5.1 Command unrecognized: ""	TokenNameStringLiteral	500 5.5.1 Command unrecognized: "
+	TokenNamePLUS	
response	TokenNameIdentifier	 response
+	TokenNamePLUS	
"" "	TokenNameStringLiteral	" 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
loop	TokenNameIdentifier	 loop
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// sb.append( response + "\r\n" ); 	TokenNameCOMMENT_LINE	sb.append( response + "\r\n" ); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// while 	TokenNameCOMMENT_LINE	while 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
disconnect	TokenNameIdentifier	 disconnect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
send	TokenNameIdentifier	 send
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
retmsg	TokenNameIdentifier	 retmsg
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
retmsg	TokenNameIdentifier	 retmsg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
retmsg	TokenNameIdentifier	 retmsg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
disconnect	TokenNameIdentifier	 disconnect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore 	TokenNameCOMMENT_LINE	ignore 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore 	TokenNameCOMMENT_LINE	ignore 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sock	TokenNameIdentifier	 sock
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
sock	TokenNameIdentifier	 sock
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sock	TokenNameIdentifier	 sock
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore 	TokenNameCOMMENT_LINE	ignore 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ssock	TokenNameIdentifier	 ssock
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ssock	TokenNameIdentifier	 ssock
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ssock	TokenNameIdentifier	 ssock
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore 	TokenNameCOMMENT_LINE	ignore 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
String	TokenNameIdentifier	 String
getResult	TokenNameIdentifier	 get Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
loop	TokenNameIdentifier	 loop
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * A private test class that wraps MailMessage */	TokenNameCOMMENT_JAVADOC	 A private test class that wraps MailMessage 
private	TokenNameprivate	
class	TokenNameclass	
ClientThread	TokenNameIdentifier	 Client Thread
implements	TokenNameimplements	
Runnable	TokenNameIdentifier	 Runnable
{	TokenNameLBRACE	
private	TokenNameprivate	
MailMessage	TokenNameIdentifier	 Mail Message
msg	TokenNameIdentifier	 msg
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
fail	TokenNameIdentifier	 fail
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
failMessage	TokenNameIdentifier	 fail Message
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
from	TokenNameIdentifier	 from
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
subject	TokenNameIdentifier	 subject
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Vector	TokenNameIdentifier	 Vector
replyToList	TokenNameIdentifier	 reply To List
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Vector	TokenNameIdentifier	 Vector
toList	TokenNameIdentifier	 to List
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Vector	TokenNameIdentifier	 Vector
ccList	TokenNameIdentifier	 cc List
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Vector	TokenNameIdentifier	 Vector
bccList	TokenNameIdentifier	 bcc List
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
new	TokenNamenew	
MailMessage	TokenNameIdentifier	 Mail Message
(	TokenNameLPAREN	
"localhost"	TokenNameStringLiteral	localhost
,	TokenNameCOMMA	
TEST_PORT	TokenNameIdentifier	 TEST  PORT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
ConnectException	TokenNameIdentifier	 Connect Exception
ce	TokenNameIdentifier	 ce
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore 	TokenNameCOMMENT_LINE	ignore 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
failMessage	TokenNameIdentifier	 fail Message
=	TokenNameEQUAL	
"IOException: "	TokenNameStringLiteral	IOException: 
+	TokenNamePLUS	
ioe	TokenNameIdentifier	 ioe
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
failMessage	TokenNameIdentifier	 fail Message
=	TokenNameEQUAL	
"java.net.ConnectException: Connection refused"	TokenNameStringLiteral	java.net.ConnectException: Connection refused
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
from	TokenNameIdentifier	 from
(	TokenNameLPAREN	
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
replyToList	TokenNameIdentifier	 reply To List
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
replyto	TokenNameIdentifier	 replyto
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
toList	TokenNameIdentifier	 to List
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
to	TokenNameIdentifier	 to
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
ccList	TokenNameIdentifier	 cc List
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
cc	TokenNameIdentifier	 cc
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
bccList	TokenNameIdentifier	 bcc List
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
bcc	TokenNameIdentifier	 bcc
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
subject	TokenNameIdentifier	 subject
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
setSubject	TokenNameIdentifier	 set Subject
(	TokenNameLPAREN	
subject	TokenNameIdentifier	 subject
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PrintStream	TokenNameIdentifier	 Print Stream
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
getPrintStream	TokenNameIdentifier	 get Print Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
sendAndClose	TokenNameIdentifier	 send And Close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
failMessage	TokenNameIdentifier	 fail Message
=	TokenNameEQUAL	
"IOException: "	TokenNameStringLiteral	IOException: 
+	TokenNamePLUS	
ioe	TokenNameIdentifier	 ioe
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isFailed	TokenNameIdentifier	 is Failed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fail	TokenNameIdentifier	 fail
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getFailMessage	TokenNameIdentifier	 get Fail Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
failMessage	TokenNameIdentifier	 fail Message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
replyTo	TokenNameIdentifier	 reply To
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
replyTo	TokenNameIdentifier	 reply To
)	TokenNameRPAREN	
{	TokenNameLBRACE	
replyToList	TokenNameIdentifier	 reply To List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
replyTo	TokenNameIdentifier	 reply To
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
to	TokenNameIdentifier	 to
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
{	TokenNameLBRACE	
toList	TokenNameIdentifier	 to List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
cc	TokenNameIdentifier	 cc
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
cc	TokenNameIdentifier	 cc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ccList	TokenNameIdentifier	 cc List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
cc	TokenNameIdentifier	 cc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
bcc	TokenNameIdentifier	 bcc
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
bcc	TokenNameIdentifier	 bcc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bccList	TokenNameIdentifier	 bcc List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
bcc	TokenNameIdentifier	 bcc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setSubject	TokenNameIdentifier	 set Subject
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
subject	TokenNameIdentifier	 subject
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
subject	TokenNameIdentifier	 subject
=	TokenNameEQUAL	
subject	TokenNameIdentifier	 subject
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
from	TokenNameIdentifier	 from
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
from	TokenNameIdentifier	 from
=	TokenNameEQUAL	
from	TokenNameIdentifier	 from
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMessage	TokenNameIdentifier	 set Message
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
