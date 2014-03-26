/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
;	TokenNameSEMICOLON	
import	TokenNameimport	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
PBSPredictorTest	TokenNameIdentifier	 PBS Predictor Test
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
PBSPredictor	TokenNameIdentifier	 PBS Predictor
predictor	TokenNameIdentifier	 predictor
=	TokenNameEQUAL	
PBSPredictor	TokenNameIdentifier	 PBS Predictor
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
void	TokenNamevoid	
createWriteResponse	TokenNameIdentifier	 create Write Response
(	TokenNameLPAREN	
long	TokenNamelong	
W	TokenNameIdentifier	 W
,	TokenNameCOMMA	
long	TokenNamelong	
A	TokenNameIdentifier	 A
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
predictor	TokenNameIdentifier	 predictor
.	TokenNameDOT	
startWriteOperation	TokenNameIdentifier	 start Write Operation
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
predictor	TokenNameIdentifier	 predictor
.	TokenNameDOT	
logWriteResponse	TokenNameIdentifier	 log Write Response
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
W	TokenNameIdentifier	 W
,	TokenNameCOMMA	
W	TokenNameIdentifier	 W
+	TokenNamePLUS	
A	TokenNameIdentifier	 A
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
createReadResponse	TokenNameIdentifier	 create Read Response
(	TokenNameLPAREN	
long	TokenNamelong	
R	TokenNameIdentifier	 R
,	TokenNameCOMMA	
long	TokenNamelong	
S	TokenNameIdentifier	 S
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
predictor	TokenNameIdentifier	 predictor
.	TokenNameDOT	
startReadOperation	TokenNameIdentifier	 start Read Operation
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
predictor	TokenNameIdentifier	 predictor
.	TokenNameDOT	
logReadResponse	TokenNameIdentifier	 log Read Response
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
R	TokenNameIdentifier	 R
,	TokenNameCOMMA	
R	TokenNameIdentifier	 R
+	TokenNamePLUS	
S	TokenNameIdentifier	 S
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testDoPrediction	TokenNameIdentifier	 test Do Prediction
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
predictor	TokenNameIdentifier	 predictor
.	TokenNameDOT	
enableConsistencyPredictionLogging	TokenNameIdentifier	 enable Consistency Prediction Logging
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
predictor	TokenNameIdentifier	 predictor
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* Ensure accuracy given a set of basic latencies Predictions here match a prior Python implementation */	TokenNameCOMMENT_BLOCK	 Ensure accuracy given a set of basic latencies Predictions here match a prior Python implementation 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createWriteResponse	TokenNameIdentifier	 create Write Response
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"W%d"	TokenNameStringLiteral	W%d
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createReadResponse	TokenNameIdentifier	 create Read Response
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"R%d"	TokenNameStringLiteral	R%d
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createWriteResponse	TokenNameIdentifier	 create Write Response
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"WS%d"	TokenNameStringLiteral	WS%d
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 10ms after write 	TokenNameCOMMENT_LINE	10ms after write 
PBSPredictionResult	TokenNameIdentifier	 PBS Prediction Result
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
predictor	TokenNameIdentifier	 predictor
.	TokenNameDOT	
doPrediction	TokenNameIdentifier	 do Prediction
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0.99f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getConsistencyProbability	TokenNameIdentifier	 get Consistency Probability
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2.5	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getAverageWriteLatency	TokenNameIdentifier	 get Average Write Latency
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 0ms after write 	TokenNameCOMMENT_LINE	0ms after write 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
predictor	TokenNameIdentifier	 predictor
.	TokenNameDOT	
doPrediction	TokenNameIdentifier	 do Prediction
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0.99f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
.75	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getConsistencyProbability	TokenNameIdentifier	 get Consistency Probability
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0.05	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// k=5 versions staleness 	TokenNameCOMMENT_LINE	k=5 versions staleness 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
predictor	TokenNameIdentifier	 predictor
.	TokenNameDOT	
doPrediction	TokenNameIdentifier	 do Prediction
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0.99f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
.98	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getConsistencyProbability	TokenNameIdentifier	 get Consistency Probability
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0.05	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2.5	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getAverageWriteLatency	TokenNameIdentifier	 get Average Write Latency
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createWriteResponse	TokenNameIdentifier	 create Write Response
(	TokenNameLPAREN	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"WL%d"	TokenNameStringLiteral	WL%d
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 5ms after write 	TokenNameCOMMENT_LINE	5ms after write 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
predictor	TokenNameIdentifier	 predictor
.	TokenNameDOT	
doPrediction	TokenNameIdentifier	 do Prediction
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0.99f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
.67	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getConsistencyProbability	TokenNameIdentifier	 get Consistency Probability
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
.05	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// N = 5 	TokenNameCOMMENT_LINE	N = 5 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
predictor	TokenNameIdentifier	 predictor
.	TokenNameDOT	
doPrediction	TokenNameIdentifier	 do Prediction
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0.99f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
.42	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getConsistencyProbability	TokenNameIdentifier	 get Consistency Probability
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
.05	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1.33	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getAverageWriteLatency	TokenNameIdentifier	 get Average Write Latency
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createWriteResponse	TokenNameIdentifier	 create Write Response
(	TokenNameLPAREN	
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"WVL%d"	TokenNameStringLiteral	WVL%d
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createReadResponse	TokenNameIdentifier	 create Read Response
(	TokenNameLPAREN	
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"RL%d"	TokenNameStringLiteral	RL%d
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
predictor	TokenNameIdentifier	 predictor
.	TokenNameDOT	
doPrediction	TokenNameIdentifier	 do Prediction
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0.99f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
.860	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getConsistencyProbability	TokenNameIdentifier	 get Consistency Probability
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
.05	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
26.5	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getAverageWriteLatency	TokenNameIdentifier	 get Average Write Latency
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
100.33	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getAverageReadLatency	TokenNameIdentifier	 get Average Read Latency
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
predictor	TokenNameIdentifier	 predictor
.	TokenNameDOT	
doPrediction	TokenNameIdentifier	 do Prediction
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0.99f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getConsistencyProbability	TokenNameIdentifier	 get Consistency Probability
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
