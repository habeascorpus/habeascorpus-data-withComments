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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
UUID	TokenNameIdentifier	 UUID
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
tracing	TokenNameIdentifier	 tracing
.	TokenNameDOT	
Tracing	TokenNameIdentifier	 Tracing
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
FBUtilities	TokenNameIdentifier	 FB Utilities
;	TokenNameSEMICOLON	
/** * Represents the state related to a given query. */	TokenNameCOMMENT_JAVADOC	 Represents the state related to a given query. 
public	TokenNamepublic	
class	TokenNameclass	
QueryState	TokenNameIdentifier	 Query State
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
ClientState	TokenNameIdentifier	 Client State
clientState	TokenNameIdentifier	 client State
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
long	TokenNamelong	
clock	TokenNameIdentifier	 clock
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
UUID	TokenNameIdentifier	 UUID
preparedTracingSession	TokenNameIdentifier	 prepared Tracing Session
;	TokenNameSEMICOLON	
public	TokenNamepublic	
QueryState	TokenNameIdentifier	 Query State
(	TokenNameLPAREN	
ClientState	TokenNameIdentifier	 Client State
clientState	TokenNameIdentifier	 client State
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
clientState	TokenNameIdentifier	 client State
=	TokenNameEQUAL	
clientState	TokenNameIdentifier	 client State
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ClientState	TokenNameIdentifier	 Client State
getClientState	TokenNameIdentifier	 get Client State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
clientState	TokenNameIdentifier	 client State
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This clock guarantees that updates for the same QueryState will be ordered * in the sequence seen, even if multiple updates happen in the same millisecond. */	TokenNameCOMMENT_JAVADOC	 This clock guarantees that updates for the same QueryState will be ordered in the sequence seen, even if multiple updates happen in the same millisecond. 
public	TokenNamepublic	
long	TokenNamelong	
getTimestamp	TokenNameIdentifier	 get Timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
clock	TokenNameIdentifier	 clock
=	TokenNameEQUAL	
clock	TokenNameIdentifier	 clock
>=	TokenNameGREATER_EQUAL	
current	TokenNameIdentifier	 current
?	TokenNameQUESTION	
clock	TokenNameIdentifier	 clock
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
return	TokenNamereturn	
clock	TokenNameIdentifier	 clock
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
traceNextQuery	TokenNameIdentifier	 trace Next Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
preparedTracingSession	TokenNameIdentifier	 prepared Tracing Session
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
double	TokenNamedouble	
tracingProbability	TokenNameIdentifier	 tracing Probability
=	TokenNameEQUAL	
StorageService	TokenNameIdentifier	 Storage Service
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getTracingProbability	TokenNameIdentifier	 get Tracing Probability
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
tracingProbability	TokenNameIdentifier	 tracing Probability
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
threadLocalRandom	TokenNameIdentifier	 thread Local Random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
nextDouble	TokenNameIdentifier	 next Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
tracingProbability	TokenNameIdentifier	 tracing Probability
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
prepareTracingSession	TokenNameIdentifier	 prepare Tracing Session
(	TokenNameLPAREN	
UUID	TokenNameIdentifier	 UUID
sessionId	TokenNameIdentifier	 session Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
preparedTracingSession	TokenNameIdentifier	 prepared Tracing Session
=	TokenNameEQUAL	
sessionId	TokenNameIdentifier	 session Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
createTracingSession	TokenNameIdentifier	 create Tracing Session
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
preparedTracingSession	TokenNameIdentifier	 prepared Tracing Session
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Tracing	TokenNameIdentifier	 Tracing
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
newSession	TokenNameIdentifier	 new Session
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
UUID	TokenNameIdentifier	 UUID
session	TokenNameIdentifier	 session
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
preparedTracingSession	TokenNameIdentifier	 prepared Tracing Session
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
preparedTracingSession	TokenNameIdentifier	 prepared Tracing Session
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Tracing	TokenNameIdentifier	 Tracing
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
newSession	TokenNameIdentifier	 new Session
(	TokenNameLPAREN	
session	TokenNameIdentifier	 session
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
