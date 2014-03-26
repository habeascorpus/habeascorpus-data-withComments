package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
cli	TokenNameIdentifier	 cli
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
text	TokenNameIdentifier	 text
.	TokenNameDOT	
DecimalFormat	TokenNameIdentifier	 Decimal Format
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
DecimalFormatSymbols	TokenNameIdentifier	 Decimal Format Symbols
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
transfer	TokenNameIdentifier	 transfer
.	TokenNameDOT	
AbstractTransferListener	TokenNameIdentifier	 Abstract Transfer Listener
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
transfer	TokenNameIdentifier	 transfer
.	TokenNameDOT	
TransferCancelledException	TokenNameIdentifier	 Transfer Cancelled Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
transfer	TokenNameIdentifier	 transfer
.	TokenNameDOT	
TransferEvent	TokenNameIdentifier	 Transfer Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
transfer	TokenNameIdentifier	 transfer
.	TokenNameDOT	
TransferResource	TokenNameIdentifier	 Transfer Resource
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractMavenTransferListener	TokenNameIdentifier	 Abstract Maven Transfer Listener
extends	TokenNameextends	
AbstractTransferListener	TokenNameIdentifier	 Abstract Transfer Listener
{	TokenNameLBRACE	
protected	TokenNameprotected	
PrintStream	TokenNameIdentifier	 Print Stream
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
AbstractMavenTransferListener	TokenNameIdentifier	 Abstract Maven Transfer Listener
(	TokenNameLPAREN	
PrintStream	TokenNameIdentifier	 Print Stream
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
out	TokenNameIdentifier	 out
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
transferInitiated	TokenNameIdentifier	 transfer Initiated
(	TokenNameLPAREN	
TransferEvent	TokenNameIdentifier	 Transfer Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getRequestType	TokenNameIdentifier	 get Request Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
TransferEvent	TokenNameIdentifier	 Transfer Event
.	TokenNameDOT	
RequestType	TokenNameIdentifier	 Request Type
.	TokenNameDOT	
PUT	TokenNameIdentifier	 PUT
?	TokenNameQUESTION	
"Uploading"	TokenNameStringLiteral	Uploading
:	TokenNameCOLON	
"Downloading"	TokenNameStringLiteral	Downloading
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getRepositoryUrl	TokenNameIdentifier	 get Repository Url
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getResourceName	TokenNameIdentifier	 get Resource Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
transferCorrupted	TokenNameIdentifier	 transfer Corrupted
(	TokenNameLPAREN	
TransferEvent	TokenNameIdentifier	 Transfer Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransferCancelledException	TokenNameIdentifier	 Transfer Cancelled Exception
{	TokenNameLBRACE	
TransferResource	TokenNameIdentifier	 Transfer Resource
resource	TokenNameIdentifier	 resource
=	TokenNameEQUAL	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"[WARNING] "	TokenNameStringLiteral	[WARNING] 
+	TokenNamePLUS	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" for "	TokenNameStringLiteral	 for 
+	TokenNamePLUS	
resource	TokenNameIdentifier	 resource
.	TokenNameDOT	
getRepositoryUrl	TokenNameIdentifier	 get Repository Url
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
resource	TokenNameIdentifier	 resource
.	TokenNameDOT	
getResourceName	TokenNameIdentifier	 get Resource Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
transferSucceeded	TokenNameIdentifier	 transfer Succeeded
(	TokenNameLPAREN	
TransferEvent	TokenNameIdentifier	 Transfer Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TransferResource	TokenNameIdentifier	 Transfer Resource
resource	TokenNameIdentifier	 resource
=	TokenNameEQUAL	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
contentLength	TokenNameIdentifier	 content Length
=	TokenNameEQUAL	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getTransferredBytes	TokenNameIdentifier	 get Transferred Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
contentLength	TokenNameIdentifier	 content Length
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getRequestType	TokenNameIdentifier	 get Request Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
TransferEvent	TokenNameIdentifier	 Transfer Event
.	TokenNameDOT	
RequestType	TokenNameIdentifier	 Request Type
.	TokenNameDOT	
PUT	TokenNameIdentifier	 PUT
?	TokenNameQUESTION	
"Uploaded"	TokenNameStringLiteral	Uploaded
:	TokenNameCOLON	
"Downloaded"	TokenNameStringLiteral	Downloaded
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
contentLength	TokenNameIdentifier	 content Length
>=	TokenNameGREATER_EQUAL	
1024	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
toKB	TokenNameIdentifier	 to KB
(	TokenNameLPAREN	
contentLength	TokenNameIdentifier	 content Length
)	TokenNameRPAREN	
+	TokenNamePLUS	
" KB"	TokenNameStringLiteral	 KB
:	TokenNameCOLON	
contentLength	TokenNameIdentifier	 content Length
+	TokenNamePLUS	
" B"	TokenNameStringLiteral	 B
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
throughput	TokenNameIdentifier	 throughput
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
long	TokenNamelong	
duration	TokenNameIdentifier	 duration
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
resource	TokenNameIdentifier	 resource
.	TokenNameDOT	
getTransferStartTime	TokenNameIdentifier	 get Transfer Start Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
duration	TokenNameIdentifier	 duration
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DecimalFormat	TokenNameIdentifier	 Decimal Format
format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
new	TokenNamenew	
DecimalFormat	TokenNameIdentifier	 Decimal Format
(	TokenNameLPAREN	
"0.0"	TokenNameStringLiteral	0.0
,	TokenNameCOMMA	
new	TokenNamenew	
DecimalFormatSymbols	TokenNameIdentifier	 Decimal Format Symbols
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
kbPerSec	TokenNameIdentifier	 kb Per Sec
=	TokenNameEQUAL	
(	TokenNameLPAREN	
contentLength	TokenNameIdentifier	 content Length
/	TokenNameDIVIDE	
1024.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
duration	TokenNameIdentifier	 duration
/	TokenNameDIVIDE	
1000.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throughput	TokenNameIdentifier	 throughput
=	TokenNameEQUAL	
" at "	TokenNameStringLiteral	 at 
+	TokenNamePLUS	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
kbPerSec	TokenNameIdentifier	 kb Per Sec
)	TokenNameRPAREN	
+	TokenNamePLUS	
" KB/sec"	TokenNameStringLiteral	 KB/sec
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
resource	TokenNameIdentifier	 resource
.	TokenNameDOT	
getRepositoryUrl	TokenNameIdentifier	 get Repository Url
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
resource	TokenNameIdentifier	 resource
.	TokenNameDOT	
getResourceName	TokenNameIdentifier	 get Resource Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" ("	TokenNameStringLiteral	 (
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
+	TokenNamePLUS	
throughput	TokenNameIdentifier	 throughput
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
long	TokenNamelong	
toKB	TokenNameIdentifier	 to KB
(	TokenNameLPAREN	
long	TokenNamelong	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
+	TokenNamePLUS	
1023	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
