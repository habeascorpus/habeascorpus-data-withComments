package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
spans	TokenNameIdentifier	 spans
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
Query	TokenNameIdentifier	 Query
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
CheckHits	TokenNameIdentifier	 Check Hits
;	TokenNameSEMICOLON	
/** * subclass of TestSimpleExplanations that verifies non matches. */	TokenNameCOMMENT_JAVADOC	 subclass of TestSimpleExplanations that verifies non matches. 
public	TokenNamepublic	
class	TokenNameclass	
TestSpanExplanationsOfNonMatches	TokenNameIdentifier	 Test Span Explanations Of Non Matches
extends	TokenNameextends	
TestSpanExplanations	TokenNameIdentifier	 Test Span Explanations
{	TokenNameLBRACE	
/** * Overrides superclass to ignore matches and focus on non-matches * * @see CheckHits#checkNoMatchExplanations */	TokenNameCOMMENT_JAVADOC	 Overrides superclass to ignore matches and focus on non-matches * @see CheckHits#checkNoMatchExplanations 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
qtest	TokenNameIdentifier	 qtest
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expDocNrs	TokenNameIdentifier	 exp Doc Nrs
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
CheckHits	TokenNameIdentifier	 Check Hits
.	TokenNameDOT	
checkNoMatchExplanations	TokenNameIdentifier	 check No Match Explanations
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
FIELD	TokenNameIdentifier	 FIELD
,	TokenNameCOMMA	
searcher	TokenNameIdentifier	 searcher
,	TokenNameCOMMA	
expDocNrs	TokenNameIdentifier	 exp Doc Nrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
