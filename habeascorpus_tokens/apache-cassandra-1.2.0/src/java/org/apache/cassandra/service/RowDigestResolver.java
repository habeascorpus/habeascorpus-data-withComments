/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
service	TokenNameIdentifier	 service
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
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
ColumnFamily	TokenNameIdentifier	 Column Family
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
ReadResponse	TokenNameIdentifier	 Read Response
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
Row	TokenNameIdentifier	 Row
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MessageIn	TokenNameIdentifier	 Message In
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
RowDigestResolver	TokenNameIdentifier	 Row Digest Resolver
extends	TokenNameextends	
AbstractRowResolver	TokenNameIdentifier	 Abstract Row Resolver
{	TokenNameLBRACE	
public	TokenNamepublic	
RowDigestResolver	TokenNameIdentifier	 Row Digest Resolver
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
table	TokenNameIdentifier	 table
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
table	TokenNameIdentifier	 table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Special case of resolve() so that CL.ONE reads never throw DigestMismatchException in the foreground */	TokenNameCOMMENT_JAVADOC	 Special case of resolve() so that CL.ONE reads never throw DigestMismatchException in the foreground 
public	TokenNamepublic	
Row	TokenNameIdentifier	 Row
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
MessageIn	TokenNameIdentifier	 Message In
<	TokenNameLESS	
ReadResponse	TokenNameIdentifier	 Read Response
>	TokenNameGREATER	
message	TokenNameIdentifier	 message
:	TokenNameCOLON	
replies	TokenNameIdentifier	 replies
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ReadResponse	TokenNameIdentifier	 Read Response
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
payload	TokenNameIdentifier	 payload
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
isDigestQuery	TokenNameIdentifier	 is Digest Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
row	TokenNameIdentifier	 row
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
AssertionError	TokenNameIdentifier	 Assertion Error
(	TokenNameLPAREN	
"getData should not be invoked when no data is present"	TokenNameStringLiteral	getData should not be invoked when no data is present
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * This method handles two different scenarios: * * a) we're handling the initial read, of data from the closest replica + digests * from the rest. In this case we check the digests against each other, * throw an exception if there is a mismatch, otherwise return the data row. * * b) we're checking additional digests that arrived after the minimum to handle * the requested ConsistencyLevel, i.e. asynchronous read repair check */	TokenNameCOMMENT_BLOCK	 This method handles two different scenarios: * a) we're handling the initial read, of data from the closest replica + digests from the rest. In this case we check the digests against each other, throw an exception if there is a mismatch, otherwise return the data row. * b) we're checking additional digests that arrived after the minimum to handle the requested ConsistencyLevel, i.e. asynchronous read repair check 
public	TokenNamepublic	
Row	TokenNameIdentifier	 Row
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DigestMismatchException	TokenNameIdentifier	 Digest Mismatch Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"resolving "	TokenNameStringLiteral	resolving 
+	TokenNamePLUS	
replies	TokenNameIdentifier	 replies
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" responses"	TokenNameStringLiteral	 responses
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
startTime	TokenNameIdentifier	 start Time
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// validate digests against each other; throw immediately on mismatch. 	TokenNameCOMMENT_LINE	validate digests against each other; throw immediately on mismatch. 
// also extract the data reply, if any. 	TokenNameCOMMENT_LINE	also extract the data reply, if any. 
ColumnFamily	TokenNameIdentifier	 Column Family
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
digest	TokenNameIdentifier	 digest
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
MessageIn	TokenNameIdentifier	 Message In
<	TokenNameLESS	
ReadResponse	TokenNameIdentifier	 Read Response
>	TokenNameGREATER	
message	TokenNameIdentifier	 message
:	TokenNameCOLON	
replies	TokenNameIdentifier	 replies
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ReadResponse	TokenNameIdentifier	 Read Response
response	TokenNameIdentifier	 response
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
payload	TokenNameIdentifier	 payload
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
response	TokenNameIdentifier	 response
.	TokenNameDOT	
isDigestQuery	TokenNameIdentifier	 is Digest Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
digest	TokenNameIdentifier	 digest
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
digest	TokenNameIdentifier	 digest
=	TokenNameEQUAL	
response	TokenNameIdentifier	 response
.	TokenNameDOT	
digest	TokenNameIdentifier	 digest
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
digest2	TokenNameIdentifier	 digest2
=	TokenNameEQUAL	
response	TokenNameIdentifier	 response
.	TokenNameDOT	
digest	TokenNameIdentifier	 digest
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
digest	TokenNameIdentifier	 digest
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
digest2	TokenNameIdentifier	 digest2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
DigestMismatchException	TokenNameIdentifier	 Digest Mismatch Exception
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
digest	TokenNameIdentifier	 digest
,	TokenNameCOMMA	
digest2	TokenNameIdentifier	 digest2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
response	TokenNameIdentifier	 response
.	TokenNameDOT	
row	TokenNameIdentifier	 row
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
cf	TokenNameIdentifier	 cf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Compare digest (only one, since we threw earlier if there were different replies) 	TokenNameCOMMENT_LINE	Compare digest (only one, since we threw earlier if there were different replies) 
// with the data response. If there is a mismatch then throw an exception so that read repair can happen. 	TokenNameCOMMENT_LINE	with the data response. If there is a mismatch then throw an exception so that read repair can happen. 
// 	TokenNameCOMMENT_LINE	 
// It's important to note that we do not consider the possibility of multiple data responses -- 	TokenNameCOMMENT_LINE	It's important to note that we do not consider the possibility of multiple data responses -- 
// that can only happen when we're doing the repair post-mismatch, and will be handled by RowRepairResolver. 	TokenNameCOMMENT_LINE	that can only happen when we're doing the repair post-mismatch, and will be handled by RowRepairResolver. 
if	TokenNameif	
(	TokenNameLPAREN	
digest	TokenNameIdentifier	 digest
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
digest2	TokenNameIdentifier	 digest2
=	TokenNameEQUAL	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
digest	TokenNameIdentifier	 digest
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
digest	TokenNameIdentifier	 digest
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
digest2	TokenNameIdentifier	 digest2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
DigestMismatchException	TokenNameIdentifier	 Digest Mismatch Exception
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
digest	TokenNameIdentifier	 digest
,	TokenNameCOMMA	
digest2	TokenNameIdentifier	 digest2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"digests verified"	TokenNameStringLiteral	digests verified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"resolve: "	TokenNameStringLiteral	resolve: 
+	TokenNamePLUS	
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
startTime	TokenNameIdentifier	 start Time
)	TokenNameRPAREN	
+	TokenNamePLUS	
" ms."	TokenNameStringLiteral	 ms.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Row	TokenNameIdentifier	 Row
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isDataPresent	TokenNameIdentifier	 is Data Present
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
MessageIn	TokenNameIdentifier	 Message In
<	TokenNameLESS	
ReadResponse	TokenNameIdentifier	 Read Response
>	TokenNameGREATER	
message	TokenNameIdentifier	 message
:	TokenNameCOLON	
replies	TokenNameIdentifier	 replies
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
payload	TokenNameIdentifier	 payload
.	TokenNameDOT	
isDigestQuery	TokenNameIdentifier	 is Digest Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
