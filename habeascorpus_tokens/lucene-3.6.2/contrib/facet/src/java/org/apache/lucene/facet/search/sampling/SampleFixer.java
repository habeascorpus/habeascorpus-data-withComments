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
sampling	TokenNameIdentifier	 sampling
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
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
ScoredDocIDs	TokenNameIdentifier	 Scored Doc I Ds
;	TokenNameSEMICOLON	
import	TokenNameimport	
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
results	TokenNameIdentifier	 results
.	TokenNameDOT	
FacetResult	TokenNameIdentifier	 Facet Result
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Fixer of sample facet accumulation results * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Fixer of sample facet accumulation results * @lucene.experimental 
public	TokenNamepublic	
interface	TokenNameinterface	
SampleFixer	TokenNameIdentifier	 Sample Fixer
{	TokenNameLBRACE	
/** * Alter the input result, fixing it to account for the sampling. This * implementation can compute accurate or estimated counts for the sampled facets. * For example, a faster correction could just multiply by a compensating factor. * * @param origDocIds * full set of matching documents. * @param fres * sample result to be fixed. * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Alter the input result, fixing it to account for the sampling. This implementation can compute accurate or estimated counts for the sampled facets. For example, a faster correction could just multiply by a compensating factor. * @param origDocIds full set of matching documents. @param fres sample result to be fixed. @throws IOException 
public	TokenNamepublic	
void	TokenNamevoid	
fixResult	TokenNameIdentifier	 fix Result
(	TokenNameLPAREN	
ScoredDocIDs	TokenNameIdentifier	 Scored Doc I Ds
origDocIds	TokenNameIdentifier	 orig Doc Ids
,	TokenNameCOMMA	
FacetResult	TokenNameIdentifier	 Facet Result
fres	TokenNameIdentifier	 fres
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
