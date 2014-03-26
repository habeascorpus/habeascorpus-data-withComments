/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
thrift	TokenNameIdentifier	 thrift
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
WriteType	TokenNameIdentifier	 Write Type
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
exceptions	TokenNameIdentifier	 exceptions
.	TokenNameDOT	
RequestExecutionException	TokenNameIdentifier	 Request Execution Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
exceptions	TokenNameIdentifier	 exceptions
.	TokenNameDOT	
RequestTimeoutException	TokenNameIdentifier	 Request Timeout Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
exceptions	TokenNameIdentifier	 exceptions
.	TokenNameDOT	
RequestValidationException	TokenNameIdentifier	 Request Validation Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
exceptions	TokenNameIdentifier	 exceptions
.	TokenNameDOT	
WriteTimeoutException	TokenNameIdentifier	 Write Timeout Exception
;	TokenNameSEMICOLON	
/** * Static utility methods to convert internal structure to and from thrift ones. */	TokenNameCOMMENT_JAVADOC	 Static utility methods to convert internal structure to and from thrift ones. 
public	TokenNamepublic	
class	TokenNameclass	
ThriftConversion	TokenNameIdentifier	 Thrift Conversion
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
toThrift	TokenNameIdentifier	 to Thrift
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
cl	TokenNameIdentifier	 cl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
cl	TokenNameIdentifier	 cl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
ANY	TokenNameIdentifier	 ANY
:	TokenNameCOLON	
return	TokenNamereturn	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
.	TokenNameDOT	
ANY	TokenNameIdentifier	 ANY
;	TokenNameSEMICOLON	
case	TokenNamecase	
ONE	TokenNameIdentifier	 ONE
:	TokenNameCOLON	
return	TokenNamereturn	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
.	TokenNameDOT	
ONE	TokenNameIdentifier	 ONE
;	TokenNameSEMICOLON	
case	TokenNamecase	
TWO	TokenNameIdentifier	 TWO
:	TokenNameCOLON	
return	TokenNamereturn	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
.	TokenNameDOT	
TWO	TokenNameIdentifier	 TWO
;	TokenNameSEMICOLON	
case	TokenNamecase	
THREE	TokenNameIdentifier	 THREE
:	TokenNameCOLON	
return	TokenNamereturn	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
.	TokenNameDOT	
THREE	TokenNameIdentifier	 THREE
;	TokenNameSEMICOLON	
case	TokenNamecase	
QUORUM	TokenNameIdentifier	 QUORUM
:	TokenNameCOLON	
return	TokenNamereturn	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
.	TokenNameDOT	
QUORUM	TokenNameIdentifier	 QUORUM
;	TokenNameSEMICOLON	
case	TokenNamecase	
ALL	TokenNameIdentifier	 ALL
:	TokenNameCOLON	
return	TokenNamereturn	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
.	TokenNameDOT	
ALL	TokenNameIdentifier	 ALL
;	TokenNameSEMICOLON	
case	TokenNamecase	
LOCAL_QUORUM	TokenNameIdentifier	 LOCAL  QUORUM
:	TokenNameCOLON	
return	TokenNamereturn	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
.	TokenNameDOT	
LOCAL_QUORUM	TokenNameIdentifier	 LOCAL  QUORUM
;	TokenNameSEMICOLON	
case	TokenNamecase	
EACH_QUORUM	TokenNameIdentifier	 EACH  QUORUM
:	TokenNameCOLON	
return	TokenNamereturn	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
.	TokenNameDOT	
EACH_QUORUM	TokenNameIdentifier	 EACH  QUORUM
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
AssertionError	TokenNameIdentifier	 Assertion Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
fromThrift	TokenNameIdentifier	 from Thrift
(	TokenNameLPAREN	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
cl	TokenNameIdentifier	 cl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
cl	TokenNameIdentifier	 cl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
ANY	TokenNameIdentifier	 ANY
:	TokenNameCOLON	
return	TokenNamereturn	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
.	TokenNameDOT	
ANY	TokenNameIdentifier	 ANY
;	TokenNameSEMICOLON	
case	TokenNamecase	
ONE	TokenNameIdentifier	 ONE
:	TokenNameCOLON	
return	TokenNamereturn	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
.	TokenNameDOT	
ONE	TokenNameIdentifier	 ONE
;	TokenNameSEMICOLON	
case	TokenNamecase	
TWO	TokenNameIdentifier	 TWO
:	TokenNameCOLON	
return	TokenNamereturn	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
.	TokenNameDOT	
TWO	TokenNameIdentifier	 TWO
;	TokenNameSEMICOLON	
case	TokenNamecase	
THREE	TokenNameIdentifier	 THREE
:	TokenNameCOLON	
return	TokenNamereturn	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
.	TokenNameDOT	
THREE	TokenNameIdentifier	 THREE
;	TokenNameSEMICOLON	
case	TokenNamecase	
QUORUM	TokenNameIdentifier	 QUORUM
:	TokenNameCOLON	
return	TokenNamereturn	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
.	TokenNameDOT	
QUORUM	TokenNameIdentifier	 QUORUM
;	TokenNameSEMICOLON	
case	TokenNamecase	
ALL	TokenNameIdentifier	 ALL
:	TokenNameCOLON	
return	TokenNamereturn	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
.	TokenNameDOT	
ALL	TokenNameIdentifier	 ALL
;	TokenNameSEMICOLON	
case	TokenNamecase	
LOCAL_QUORUM	TokenNameIdentifier	 LOCAL  QUORUM
:	TokenNameCOLON	
return	TokenNamereturn	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
.	TokenNameDOT	
LOCAL_QUORUM	TokenNameIdentifier	 LOCAL  QUORUM
;	TokenNameSEMICOLON	
case	TokenNamecase	
EACH_QUORUM	TokenNameIdentifier	 EACH  QUORUM
:	TokenNameCOLON	
return	TokenNamereturn	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
.	TokenNameDOT	
EACH_QUORUM	TokenNameIdentifier	 EACH  QUORUM
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
AssertionError	TokenNameIdentifier	 Assertion Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
rethrow	TokenNameIdentifier	 rethrow
(	TokenNameLPAREN	
RequestExecutionException	TokenNameIdentifier	 Request Execution Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnavailableException	TokenNameIdentifier	 Unavailable Exception
,	TokenNameCOMMA	
TimedOutException	TokenNameIdentifier	 Timed Out Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
instanceof	TokenNameinstanceof	
RequestTimeoutException	TokenNameIdentifier	 Request Timeout Exception
)	TokenNameRPAREN	
throw	TokenNamethrow	
toThrift	TokenNameIdentifier	 to Thrift
(	TokenNameLPAREN	
(	TokenNameLPAREN	
RequestTimeoutException	TokenNameIdentifier	 Request Timeout Exception
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
throw	TokenNamethrow	
new	TokenNamenew	
UnavailableException	TokenNameIdentifier	 Unavailable Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
toThrift	TokenNameIdentifier	 to Thrift
(	TokenNameLPAREN	
RequestValidationException	TokenNameIdentifier	 Request Validation Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
toThrift	TokenNameIdentifier	 to Thrift
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
exceptions	TokenNameIdentifier	 exceptions
.	TokenNameDOT	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
UnavailableException	TokenNameIdentifier	 Unavailable Exception
toThrift	TokenNameIdentifier	 to Thrift
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
exceptions	TokenNameIdentifier	 exceptions
.	TokenNameDOT	
UnavailableException	TokenNameIdentifier	 Unavailable Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
UnavailableException	TokenNameIdentifier	 Unavailable Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
AuthenticationException	TokenNameIdentifier	 Authentication Exception
toThrift	TokenNameIdentifier	 to Thrift
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
exceptions	TokenNameIdentifier	 exceptions
.	TokenNameDOT	
AuthenticationException	TokenNameIdentifier	 Authentication Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
AuthenticationException	TokenNameIdentifier	 Authentication Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
TimedOutException	TokenNameIdentifier	 Timed Out Exception
toThrift	TokenNameIdentifier	 to Thrift
(	TokenNameLPAREN	
RequestTimeoutException	TokenNameIdentifier	 Request Timeout Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TimedOutException	TokenNameIdentifier	 Timed Out Exception
toe	TokenNameIdentifier	 toe
=	TokenNameEQUAL	
new	TokenNamenew	
TimedOutException	TokenNameIdentifier	 Timed Out Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
instanceof	TokenNameinstanceof	
WriteTimeoutException	TokenNameIdentifier	 Write Timeout Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
WriteTimeoutException	TokenNameIdentifier	 Write Timeout Exception
wte	TokenNameIdentifier	 wte
=	TokenNameEQUAL	
(	TokenNameLPAREN	
WriteTimeoutException	TokenNameIdentifier	 Write Timeout Exception
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
toe	TokenNameIdentifier	 toe
.	TokenNameDOT	
setAcknowledged_by	TokenNameIdentifier	 set Acknowledged by
(	TokenNameLPAREN	
wte	TokenNameIdentifier	 wte
.	TokenNameDOT	
received	TokenNameIdentifier	 received
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
wte	TokenNameIdentifier	 wte
.	TokenNameDOT	
writeType	TokenNameIdentifier	 write Type
==	TokenNameEQUAL_EQUAL	
WriteType	TokenNameIdentifier	 Write Type
.	TokenNameDOT	
BATCH_LOG	TokenNameIdentifier	 BATCH  LOG
)	TokenNameRPAREN	
toe	TokenNameIdentifier	 toe
.	TokenNameDOT	
setAcknowledged_by_batchlog	TokenNameIdentifier	 set Acknowledged by batchlog
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
wte	TokenNameIdentifier	 wte
.	TokenNameDOT	
writeType	TokenNameIdentifier	 write Type
==	TokenNameEQUAL_EQUAL	
WriteType	TokenNameIdentifier	 Write Type
.	TokenNameDOT	
BATCH	TokenNameIdentifier	 BATCH
)	TokenNameRPAREN	
toe	TokenNameIdentifier	 toe
.	TokenNameDOT	
setAcknowledged_by_batchlog	TokenNameIdentifier	 set Acknowledged by batchlog
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
toe	TokenNameIdentifier	 toe
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
