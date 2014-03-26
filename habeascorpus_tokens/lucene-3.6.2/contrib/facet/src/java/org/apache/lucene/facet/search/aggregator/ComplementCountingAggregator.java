package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
aggregator	TokenNameIdentifier	 aggregator
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * A {@link CountingAggregator} used during complement counting. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 A {@link CountingAggregator} used during complement counting. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
ComplementCountingAggregator	TokenNameIdentifier	 Complement Counting Aggregator
extends	TokenNameextends	
CountingAggregator	TokenNameIdentifier	 Counting Aggregator
{	TokenNameLBRACE	
public	TokenNamepublic	
ComplementCountingAggregator	TokenNameIdentifier	 Complement Counting Aggregator
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
counterArray	TokenNameIdentifier	 counter Array
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
counterArray	TokenNameIdentifier	 counter Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
aggregate	TokenNameIdentifier	 aggregate
(	TokenNameLPAREN	
int	TokenNameint	
ordinal	TokenNameIdentifier	 ordinal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
counterArray	TokenNameIdentifier	 counter Array
[	TokenNameLBRACKET	
ordinal	TokenNameIdentifier	 ordinal
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"complement aggregation: count is about to become negative for ordinal "	TokenNameStringLiteral	complement aggregation: count is about to become negative for ordinal 
+	TokenNamePLUS	
ordinal	TokenNameIdentifier	 ordinal
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
counterArray	TokenNameIdentifier	 counter Array
[	TokenNameLBRACKET	
ordinal	TokenNameIdentifier	 ordinal
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
