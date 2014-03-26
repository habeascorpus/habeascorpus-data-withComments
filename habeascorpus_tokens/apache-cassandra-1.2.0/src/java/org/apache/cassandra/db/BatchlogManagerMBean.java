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
public	TokenNamepublic	
interface	TokenNameinterface	
BatchlogManagerMBean	TokenNameIdentifier	 Batchlog Manager M Bean
{	TokenNameLBRACE	
/** * Counts all batches currently in the batchlog. * * @return total batch count */	TokenNameCOMMENT_JAVADOC	 Counts all batches currently in the batchlog. * @return total batch count 
public	TokenNamepublic	
int	TokenNameint	
countAllBatches	TokenNameIdentifier	 count All Batches
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return total count of batches replayed since node start */	TokenNameCOMMENT_JAVADOC	 @return total count of batches replayed since node start 
public	TokenNamepublic	
long	TokenNamelong	
getTotalBatchesReplayed	TokenNameIdentifier	 get Total Batches Replayed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Forces batchlog replay. Returns immediately if replay is already in progress. */	TokenNameCOMMENT_JAVADOC	 Forces batchlog replay. Returns immediately if replay is already in progress. 
public	TokenNamepublic	
void	TokenNamevoid	
forceBatchlogReplay	TokenNameIdentifier	 force Batchlog Replay
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
