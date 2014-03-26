/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
CFMetaData	TokenNameIdentifier	 CF Meta Data
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
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
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
AbstractReplicationStrategy	TokenNameIdentifier	 Abstract Replication Strategy
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
NetworkTopologyStrategy	TokenNameIdentifier	 Network Topology Strategy
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
public	TokenNamepublic	
enum	TokenNameenum	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
{	TokenNameLBRACE	
ANY	TokenNameIdentifier	 ANY
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ONE	TokenNameIdentifier	 ONE
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
TWO	TokenNameIdentifier	 TWO
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
THREE	TokenNameIdentifier	 THREE
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
QUORUM	TokenNameIdentifier	 QUORUM
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ALL	TokenNameIdentifier	 ALL
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
LOCAL_QUORUM	TokenNameIdentifier	 LOCAL  QUORUM
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
EACH_QUORUM	TokenNameIdentifier	 EACH  QUORUM
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Used by the binary protocol 	TokenNameCOMMENT_LINE	Used by the binary protocol 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
codeIdx	TokenNameIdentifier	 code Idx
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
int	TokenNameint	
maxCode	TokenNameIdentifier	 max Code
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
cl	TokenNameIdentifier	 cl
:	TokenNameCOLON	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
maxCode	TokenNameIdentifier	 max Code
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
maxCode	TokenNameIdentifier	 max Code
,	TokenNameCOMMA	
cl	TokenNameIdentifier	 cl
.	TokenNameDOT	
code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
codeIdx	TokenNameIdentifier	 code Idx
=	TokenNameEQUAL	
new	TokenNamenew	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
[	TokenNameLBRACKET	
maxCode	TokenNameIdentifier	 max Code
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
cl	TokenNameIdentifier	 cl
:	TokenNameCOLON	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
codeIdx	TokenNameIdentifier	 code Idx
[	TokenNameLBRACKET	
cl	TokenNameIdentifier	 cl
.	TokenNameDOT	
code	TokenNameIdentifier	 code
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"Duplicate code"	TokenNameStringLiteral	Duplicate code
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
codeIdx	TokenNameIdentifier	 code Idx
[	TokenNameLBRACKET	
cl	TokenNameIdentifier	 cl
.	TokenNameDOT	
code	TokenNameIdentifier	 code
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
cl	TokenNameIdentifier	 cl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
(	TokenNameLPAREN	
int	TokenNameint	
code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
fromCode	TokenNameIdentifier	 from Code
(	TokenNameLPAREN	
int	TokenNameint	
code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
code	TokenNameIdentifier	 code
>=	TokenNameGREATER_EQUAL	
codeIdx	TokenNameIdentifier	 code Idx
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ProtocolException	TokenNameIdentifier	 Protocol Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Unknown code %d for a consistency level"	TokenNameStringLiteral	Unknown code %d for a consistency level
,	TokenNameCOMMA	
code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
codeIdx	TokenNameIdentifier	 code Idx
[	TokenNameLBRACKET	
code	TokenNameIdentifier	 code
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
blockFor	TokenNameIdentifier	 block For
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
table	TokenNameIdentifier	 table
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NetworkTopologyStrategy	TokenNameIdentifier	 Network Topology Strategy
strategy	TokenNameIdentifier	 strategy
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
ONE	TokenNameIdentifier	 ONE
:	TokenNameCOLON	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
ANY	TokenNameIdentifier	 ANY
:	TokenNameCOLON	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TWO	TokenNameIdentifier	 TWO
:	TokenNameCOLON	
return	TokenNamereturn	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
THREE	TokenNameIdentifier	 THREE
:	TokenNameCOLON	
return	TokenNamereturn	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
QUORUM	TokenNameIdentifier	 QUORUM
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
)	TokenNameRPAREN	
.	TokenNameDOT	
getReplicationStrategy	TokenNameIdentifier	 get Replication Strategy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getReplicationFactor	TokenNameIdentifier	 get Replication Factor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
ALL	TokenNameIdentifier	 ALL
:	TokenNameCOLON	
return	TokenNamereturn	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
)	TokenNameRPAREN	
.	TokenNameDOT	
getReplicationStrategy	TokenNameIdentifier	 get Replication Strategy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getReplicationFactor	TokenNameIdentifier	 get Replication Factor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LOCAL_QUORUM	TokenNameIdentifier	 LOCAL  QUORUM
:	TokenNameCOLON	
strategy	TokenNameIdentifier	 strategy
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NetworkTopologyStrategy	TokenNameIdentifier	 Network Topology Strategy
)	TokenNameRPAREN	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
)	TokenNameRPAREN	
.	TokenNameDOT	
getReplicationStrategy	TokenNameIdentifier	 get Replication Strategy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
strategy	TokenNameIdentifier	 strategy
.	TokenNameDOT	
getReplicationFactor	TokenNameIdentifier	 get Replication Factor
(	TokenNameLPAREN	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getLocalDataCenter	TokenNameIdentifier	 get Local Data Center
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EACH_QUORUM	TokenNameIdentifier	 EACH  QUORUM
:	TokenNameCOLON	
strategy	TokenNameIdentifier	 strategy
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NetworkTopologyStrategy	TokenNameIdentifier	 Network Topology Strategy
)	TokenNameRPAREN	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
)	TokenNameRPAREN	
.	TokenNameDOT	
getReplicationStrategy	TokenNameIdentifier	 get Replication Strategy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
dc	TokenNameIdentifier	 dc
:	TokenNameCOLON	
strategy	TokenNameIdentifier	 strategy
.	TokenNameDOT	
getDatacenters	TokenNameIdentifier	 get Datacenters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
strategy	TokenNameIdentifier	 strategy
.	TokenNameDOT	
getReplicationFactor	TokenNameIdentifier	 get Replication Factor
(	TokenNameLPAREN	
dc	TokenNameIdentifier	 dc
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"Invalid consistency level: "	TokenNameStringLiteral	Invalid consistency level: 
+	TokenNamePLUS	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
validateForRead	TokenNameIdentifier	 validate For Read
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
table	TokenNameIdentifier	 table
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
ANY	TokenNameIdentifier	 ANY
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
(	TokenNameLPAREN	
"ANY ConsistencyLevel is only supported for writes"	TokenNameStringLiteral	ANY ConsistencyLevel is only supported for writes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LOCAL_QUORUM	TokenNameIdentifier	 LOCAL  QUORUM
:	TokenNameCOLON	
requireNetworkTopologyStrategy	TokenNameIdentifier	 require Network Topology Strategy
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EACH_QUORUM	TokenNameIdentifier	 EACH  QUORUM
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
(	TokenNameLPAREN	
"EACH_QUORUM ConsistencyLevel is only supported for writes"	TokenNameStringLiteral	EACH_QUORUM ConsistencyLevel is only supported for writes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
validateForWrite	TokenNameIdentifier	 validate For Write
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
table	TokenNameIdentifier	 table
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
LOCAL_QUORUM	TokenNameIdentifier	 LOCAL  QUORUM
:	TokenNameCOLON	
case	TokenNamecase	
EACH_QUORUM	TokenNameIdentifier	 EACH  QUORUM
:	TokenNameCOLON	
requireNetworkTopologyStrategy	TokenNameIdentifier	 require Network Topology Strategy
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
validateCounterForWrite	TokenNameIdentifier	 validate Counter For Write
(	TokenNameLPAREN	
CFMetaData	TokenNameIdentifier	 CF Meta Data
metadata	TokenNameIdentifier	 metadata
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
.	TokenNameDOT	
ANY	TokenNameIdentifier	 ANY
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
(	TokenNameLPAREN	
"Consistency level ANY is not yet supported for counter columnfamily "	TokenNameStringLiteral	Consistency level ANY is not yet supported for counter columnfamily 
+	TokenNamePLUS	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
cfName	TokenNameIdentifier	 cf Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
getReplicateOnWrite	TokenNameIdentifier	 get Replicate On Write
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
this	TokenNamethis	
!=	TokenNameNOT_EQUAL	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
.	TokenNameDOT	
ONE	TokenNameIdentifier	 ONE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
(	TokenNameLPAREN	
"cannot achieve CL > CL.ONE without replicate_on_write on columnfamily "	TokenNameStringLiteral	cannot achieve CL > CL.ONE without replicate_on_write on columnfamily 
+	TokenNamePLUS	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
cfName	TokenNameIdentifier	 cf Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
requireNetworkTopologyStrategy	TokenNameIdentifier	 require Network Topology Strategy
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
table	TokenNameIdentifier	 table
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
{	TokenNameLBRACE	
AbstractReplicationStrategy	TokenNameIdentifier	 Abstract Replication Strategy
strategy	TokenNameIdentifier	 strategy
=	TokenNameEQUAL	
Table	TokenNameIdentifier	 Table
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
)	TokenNameRPAREN	
.	TokenNameDOT	
getReplicationStrategy	TokenNameIdentifier	 get Replication Strategy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
strategy	TokenNameIdentifier	 strategy
instanceof	TokenNameinstanceof	
NetworkTopologyStrategy	TokenNameIdentifier	 Network Topology Strategy
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"consistency level %s not compatible with replication strategy (%s)"	TokenNameStringLiteral	consistency level %s not compatible with replication strategy (%s)
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
strategy	TokenNameIdentifier	 strategy
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
