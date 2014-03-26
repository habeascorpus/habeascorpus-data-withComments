/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
sstable	TokenNameIdentifier	 sstable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
atomic	TokenNameIdentifier	 atomic
.	TokenNameDOT	
AtomicLong	TokenNameIdentifier	 Atomic Long
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
BloomFilterTracker	TokenNameIdentifier	 Bloom Filter Tracker
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
AtomicLong	TokenNameIdentifier	 Atomic Long
falsePositiveCount	TokenNameIdentifier	 false Positive Count
=	TokenNameEQUAL	
new	TokenNamenew	
AtomicLong	TokenNameIdentifier	 Atomic Long
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
AtomicLong	TokenNameIdentifier	 Atomic Long
truePositiveCount	TokenNameIdentifier	 true Positive Count
=	TokenNameEQUAL	
new	TokenNamenew	
AtomicLong	TokenNameIdentifier	 Atomic Long
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
lastFalsePositiveCount	TokenNameIdentifier	 last False Positive Count
=	TokenNameEQUAL	
0L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
lastTruePositiveCount	TokenNameIdentifier	 last True Positive Count
=	TokenNameEQUAL	
0L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
addFalsePositive	TokenNameIdentifier	 add False Positive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
falsePositiveCount	TokenNameIdentifier	 false Positive Count
.	TokenNameDOT	
incrementAndGet	TokenNameIdentifier	 increment And Get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addTruePositive	TokenNameIdentifier	 add True Positive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
truePositiveCount	TokenNameIdentifier	 true Positive Count
.	TokenNameDOT	
incrementAndGet	TokenNameIdentifier	 increment And Get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
getFalsePositiveCount	TokenNameIdentifier	 get False Positive Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
falsePositiveCount	TokenNameIdentifier	 false Positive Count
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
getRecentFalsePositiveCount	TokenNameIdentifier	 get Recent False Positive Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
fpc	TokenNameIdentifier	 fpc
=	TokenNameEQUAL	
getFalsePositiveCount	TokenNameIdentifier	 get False Positive Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
fpc	TokenNameIdentifier	 fpc
-	TokenNameMINUS	
lastFalsePositiveCount	TokenNameIdentifier	 last False Positive Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
lastFalsePositiveCount	TokenNameIdentifier	 last False Positive Count
=	TokenNameEQUAL	
fpc	TokenNameIdentifier	 fpc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
getTruePositiveCount	TokenNameIdentifier	 get True Positive Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
truePositiveCount	TokenNameIdentifier	 true Positive Count
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
getRecentTruePositiveCount	TokenNameIdentifier	 get Recent True Positive Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
tpc	TokenNameIdentifier	 tpc
=	TokenNameEQUAL	
getTruePositiveCount	TokenNameIdentifier	 get True Positive Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
tpc	TokenNameIdentifier	 tpc
-	TokenNameMINUS	
lastTruePositiveCount	TokenNameIdentifier	 last True Positive Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
lastTruePositiveCount	TokenNameIdentifier	 last True Positive Count
=	TokenNameEQUAL	
tpc	TokenNameIdentifier	 tpc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
