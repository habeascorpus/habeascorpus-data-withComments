package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
;	TokenNameSEMICOLON	
/* * * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. * */	TokenNameCOMMENT_BLOCK	 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
SchemaLoader	TokenNameIdentifier	 Schema Loader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
BloomFilterTracker	TokenNameIdentifier	 Bloom Filter Tracker
;	TokenNameSEMICOLON	
import	TokenNameimport	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertEquals	TokenNameIdentifier	 assert Equals
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
BloomFilterTrackerTest	TokenNameIdentifier	 Bloom Filter Tracker Test
extends	TokenNameextends	
SchemaLoader	TokenNameIdentifier	 Schema Loader
{	TokenNameLBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testAddingFalsePositives	TokenNameIdentifier	 test Adding False Positives
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BloomFilterTracker	TokenNameIdentifier	 Bloom Filter Tracker
bft	TokenNameIdentifier	 bft
=	TokenNameEQUAL	
new	TokenNamenew	
BloomFilterTracker	TokenNameIdentifier	 Bloom Filter Tracker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0L	TokenNameLongLiteral	
,	TokenNameCOMMA	
bft	TokenNameIdentifier	 bft
.	TokenNameDOT	
getFalsePositiveCount	TokenNameIdentifier	 get False Positive Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0L	TokenNameLongLiteral	
,	TokenNameCOMMA	
bft	TokenNameIdentifier	 bft
.	TokenNameDOT	
getRecentFalsePositiveCount	TokenNameIdentifier	 get Recent False Positive Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bft	TokenNameIdentifier	 bft
.	TokenNameDOT	
addFalsePositive	TokenNameIdentifier	 add False Positive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bft	TokenNameIdentifier	 bft
.	TokenNameDOT	
addFalsePositive	TokenNameIdentifier	 add False Positive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2L	TokenNameLongLiteral	
,	TokenNameCOMMA	
bft	TokenNameIdentifier	 bft
.	TokenNameDOT	
getFalsePositiveCount	TokenNameIdentifier	 get False Positive Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2L	TokenNameLongLiteral	
,	TokenNameCOMMA	
bft	TokenNameIdentifier	 bft
.	TokenNameDOT	
getRecentFalsePositiveCount	TokenNameIdentifier	 get Recent False Positive Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0L	TokenNameLongLiteral	
,	TokenNameCOMMA	
bft	TokenNameIdentifier	 bft
.	TokenNameDOT	
getRecentFalsePositiveCount	TokenNameIdentifier	 get Recent False Positive Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2L	TokenNameLongLiteral	
,	TokenNameCOMMA	
bft	TokenNameIdentifier	 bft
.	TokenNameDOT	
getFalsePositiveCount	TokenNameIdentifier	 get False Positive Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// sanity check 	TokenNameCOMMENT_LINE	sanity check 
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testAddingTruePositives	TokenNameIdentifier	 test Adding True Positives
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BloomFilterTracker	TokenNameIdentifier	 Bloom Filter Tracker
bft	TokenNameIdentifier	 bft
=	TokenNameEQUAL	
new	TokenNamenew	
BloomFilterTracker	TokenNameIdentifier	 Bloom Filter Tracker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0L	TokenNameLongLiteral	
,	TokenNameCOMMA	
bft	TokenNameIdentifier	 bft
.	TokenNameDOT	
getTruePositiveCount	TokenNameIdentifier	 get True Positive Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0L	TokenNameLongLiteral	
,	TokenNameCOMMA	
bft	TokenNameIdentifier	 bft
.	TokenNameDOT	
getRecentTruePositiveCount	TokenNameIdentifier	 get Recent True Positive Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bft	TokenNameIdentifier	 bft
.	TokenNameDOT	
addTruePositive	TokenNameIdentifier	 add True Positive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bft	TokenNameIdentifier	 bft
.	TokenNameDOT	
addTruePositive	TokenNameIdentifier	 add True Positive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2L	TokenNameLongLiteral	
,	TokenNameCOMMA	
bft	TokenNameIdentifier	 bft
.	TokenNameDOT	
getTruePositiveCount	TokenNameIdentifier	 get True Positive Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2L	TokenNameLongLiteral	
,	TokenNameCOMMA	
bft	TokenNameIdentifier	 bft
.	TokenNameDOT	
getRecentTruePositiveCount	TokenNameIdentifier	 get Recent True Positive Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0L	TokenNameLongLiteral	
,	TokenNameCOMMA	
bft	TokenNameIdentifier	 bft
.	TokenNameDOT	
getRecentTruePositiveCount	TokenNameIdentifier	 get Recent True Positive Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2L	TokenNameLongLiteral	
,	TokenNameCOMMA	
bft	TokenNameIdentifier	 bft
.	TokenNameDOT	
getTruePositiveCount	TokenNameIdentifier	 get True Positive Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// sanity check 	TokenNameCOMMENT_LINE	sanity check 
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testAddingToOneLeavesTheOtherAlone	TokenNameIdentifier	 test Adding To One Leaves The Other Alone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BloomFilterTracker	TokenNameIdentifier	 Bloom Filter Tracker
bft	TokenNameIdentifier	 bft
=	TokenNameEQUAL	
new	TokenNamenew	
BloomFilterTracker	TokenNameIdentifier	 Bloom Filter Tracker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bft	TokenNameIdentifier	 bft
.	TokenNameDOT	
addFalsePositive	TokenNameIdentifier	 add False Positive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0L	TokenNameLongLiteral	
,	TokenNameCOMMA	
bft	TokenNameIdentifier	 bft
.	TokenNameDOT	
getTruePositiveCount	TokenNameIdentifier	 get True Positive Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0L	TokenNameLongLiteral	
,	TokenNameCOMMA	
bft	TokenNameIdentifier	 bft
.	TokenNameDOT	
getRecentTruePositiveCount	TokenNameIdentifier	 get Recent True Positive Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bft	TokenNameIdentifier	 bft
.	TokenNameDOT	
addTruePositive	TokenNameIdentifier	 add True Positive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
bft	TokenNameIdentifier	 bft
.	TokenNameDOT	
getFalsePositiveCount	TokenNameIdentifier	 get False Positive Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
bft	TokenNameIdentifier	 bft
.	TokenNameDOT	
getRecentFalsePositiveCount	TokenNameIdentifier	 get Recent False Positive Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
