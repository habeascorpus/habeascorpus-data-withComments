/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
exceptions	TokenNameIdentifier	 exceptions
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
transport	TokenNameIdentifier	 transport
.	TokenNameDOT	
ProtocolException	TokenNameIdentifier	 Protocol Exception
;	TokenNameSEMICOLON	
/** * Exceptions code, as defined by the binary protocol. */	TokenNameCOMMENT_JAVADOC	 Exceptions code, as defined by the binary protocol. 
public	TokenNamepublic	
enum	TokenNameenum	
ExceptionCode	TokenNameIdentifier	 Exception Code
{	TokenNameLBRACE	
SERVER_ERROR	TokenNameIdentifier	 SERVER  ERROR
(	TokenNameLPAREN	
0x0000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
PROTOCOL_ERROR	TokenNameIdentifier	 PROTOCOL  ERROR
(	TokenNameLPAREN	
0x000A	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BAD_CREDENTIALS	TokenNameIdentifier	 BAD  CREDENTIALS
(	TokenNameLPAREN	
0x0100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
// 1xx: problem during request execution 	TokenNameCOMMENT_LINE	1xx: problem during request execution 
UNAVAILABLE	TokenNameIdentifier	 UNAVAILABLE
(	TokenNameLPAREN	
0x1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
OVERLOADED	TokenNameIdentifier	 OVERLOADED
(	TokenNameLPAREN	
0x1001	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
IS_BOOTSTRAPPING	TokenNameIdentifier	 IS  BOOTSTRAPPING
(	TokenNameLPAREN	
0x1002	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
TRUNCATE_ERROR	TokenNameIdentifier	 TRUNCATE  ERROR
(	TokenNameLPAREN	
0x1003	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
WRITE_TIMEOUT	TokenNameIdentifier	 WRITE  TIMEOUT
(	TokenNameLPAREN	
0x1100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
READ_TIMEOUT	TokenNameIdentifier	 READ  TIMEOUT
(	TokenNameLPAREN	
0x1200	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
// 2xx: problem validating the request 	TokenNameCOMMENT_LINE	2xx: problem validating the request 
SYNTAX_ERROR	TokenNameIdentifier	 SYNTAX  ERROR
(	TokenNameLPAREN	
0x2000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
UNAUTHORIZED	TokenNameIdentifier	 UNAUTHORIZED
(	TokenNameLPAREN	
0x2100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
INVALID	TokenNameIdentifier	 INVALID
(	TokenNameLPAREN	
0x2200	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
CONFIG_ERROR	TokenNameIdentifier	 CONFIG  ERROR
(	TokenNameLPAREN	
0x2300	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ALREADY_EXISTS	TokenNameIdentifier	 ALREADY  EXISTS
(	TokenNameLPAREN	
0x2400	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
UNPREPARED	TokenNameIdentifier	 UNPREPARED
(	TokenNameLPAREN	
0x2500	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
ExceptionCode	TokenNameIdentifier	 Exception Code
>	TokenNameGREATER	
valueToCode	TokenNameIdentifier	 value To Code
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
ExceptionCode	TokenNameIdentifier	 Exception Code
>	TokenNameGREATER	
(	TokenNameLPAREN	
ExceptionCode	TokenNameIdentifier	 Exception Code
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
ExceptionCode	TokenNameIdentifier	 Exception Code
code	TokenNameIdentifier	 code
:	TokenNameCOLON	
ExceptionCode	TokenNameIdentifier	 Exception Code
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
valueToCode	TokenNameIdentifier	 value To Code
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
.	TokenNameDOT	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
ExceptionCode	TokenNameIdentifier	 Exception Code
(	TokenNameLPAREN	
int	TokenNameint	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
ExceptionCode	TokenNameIdentifier	 Exception Code
fromValue	TokenNameIdentifier	 from Value
(	TokenNameLPAREN	
int	TokenNameint	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ExceptionCode	TokenNameIdentifier	 Exception Code
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
valueToCode	TokenNameIdentifier	 value To Code
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ProtocolException	TokenNameIdentifier	 Protocol Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Unknown error code %d"	TokenNameStringLiteral	Unknown error code %d
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
