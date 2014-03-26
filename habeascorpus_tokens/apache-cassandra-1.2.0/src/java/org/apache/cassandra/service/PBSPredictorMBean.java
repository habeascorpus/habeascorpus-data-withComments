/** * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
service	TokenNameIdentifier	 service
;	TokenNameSEMICOLON	
public	TokenNamepublic	
interface	TokenNameinterface	
PBSPredictorMBean	TokenNameIdentifier	 PBS Predictor M Bean
{	TokenNameLBRACE	
public	TokenNamepublic	
PBSPredictionResult	TokenNameIdentifier	 PBS Prediction Result
doPrediction	TokenNameIdentifier	 do Prediction
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
int	TokenNameint	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
int	TokenNameint	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
float	TokenNamefloat	
timeSinceWrite	TokenNameIdentifier	 time Since Write
,	TokenNameCOMMA	
int	TokenNameint	
numberVersionsStale	TokenNameIdentifier	 number Versions Stale
,	TokenNameCOMMA	
float	TokenNamefloat	
percentileLatency	TokenNameIdentifier	 percentile Latency
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
enableConsistencyPredictionLogging	TokenNameIdentifier	 enable Consistency Prediction Logging
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
disableConsistencyPredictionLogging	TokenNameIdentifier	 disable Consistency Prediction Logging
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setMaxLoggedLatenciesForConsistencyPrediction	TokenNameIdentifier	 set Max Logged Latencies For Consistency Prediction
(	TokenNameLPAREN	
int	TokenNameint	
maxLogged	TokenNameIdentifier	 max Logged
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setNumberTrialsForConsistencyPrediction	TokenNameIdentifier	 set Number Trials For Consistency Prediction
(	TokenNameLPAREN	
int	TokenNameint	
numTrials	TokenNameIdentifier	 num Trials
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
