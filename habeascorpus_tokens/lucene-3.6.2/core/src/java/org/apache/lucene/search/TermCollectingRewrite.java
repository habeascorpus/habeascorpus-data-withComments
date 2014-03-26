package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
index	TokenNameIdentifier	 index
.	TokenNameDOT	
IndexReader	TokenNameIdentifier	 Index Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
Term	TokenNameIdentifier	 Term
;	TokenNameSEMICOLON	
abstract	TokenNameabstract	
class	TokenNameclass	
TermCollectingRewrite	TokenNameIdentifier	 Term Collecting Rewrite
<	TokenNameLESS	
Q	TokenNameIdentifier	 Q
extends	TokenNameextends	
Query	TokenNameIdentifier	 Query
>	TokenNameGREATER	
extends	TokenNameextends	
MultiTermQuery	TokenNameIdentifier	 Multi Term Query
.	TokenNameDOT	
RewriteMethod	TokenNameIdentifier	 Rewrite Method
{	TokenNameLBRACE	
/** Return a suitable top-level Query for holding all expanded terms. */	TokenNameCOMMENT_JAVADOC	 Return a suitable top-level Query for holding all expanded terms. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
Q	TokenNameIdentifier	 Q
getTopLevelQuery	TokenNameIdentifier	 get Top Level Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Add a MultiTermQuery term to the top-level query */	TokenNameCOMMENT_JAVADOC	 Add a MultiTermQuery term to the top-level query 
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
addClause	TokenNameIdentifier	 add Clause
(	TokenNameLPAREN	
Q	TokenNameIdentifier	 Q
topLevel	TokenNameIdentifier	 top Level
,	TokenNameCOMMA	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
float	TokenNamefloat	
boost	TokenNameIdentifier	 boost
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
void	TokenNamevoid	
collectTerms	TokenNameIdentifier	 collect Terms
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
MultiTermQuery	TokenNameIdentifier	 Multi Term Query
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
TermCollector	TokenNameIdentifier	 Term Collector
collector	TokenNameIdentifier	 collector
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
FilteredTermEnum	TokenNameIdentifier	 Filtered Term Enum
enumerator	TokenNameIdentifier	 enumerator
=	TokenNameEQUAL	
getTermsEnum	TokenNameIdentifier	 get Terms Enum
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
final	TokenNamefinal	
Term	TokenNameIdentifier	 Term
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
enumerator	TokenNameIdentifier	 enumerator
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
collector	TokenNameIdentifier	 collector
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
enumerator	TokenNameIdentifier	 enumerator
.	TokenNameDOT	
difference	TokenNameIdentifier	 difference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
enumerator	TokenNameIdentifier	 enumerator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
enumerator	TokenNameIdentifier	 enumerator
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
interface	TokenNameinterface	
TermCollector	TokenNameIdentifier	 Term Collector
{	TokenNameLBRACE	
/** return false to stop collecting */	TokenNameCOMMENT_JAVADOC	 return false to stop collecting 
boolean	TokenNameboolean	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
float	TokenNamefloat	
boost	TokenNameIdentifier	 boost
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
