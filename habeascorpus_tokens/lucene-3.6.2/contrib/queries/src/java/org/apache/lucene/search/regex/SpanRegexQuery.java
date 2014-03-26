package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
spans	TokenNameIdentifier	 spans
.	TokenNameDOT	
SpanMultiTermQueryWrapper	TokenNameIdentifier	 Span Multi Term Query Wrapper
;	TokenNameSEMICOLON	
/** * A SpanQuery version of {@link RegexQuery} allowing regular expression * queries to be nested within other SpanQuery subclasses. * @deprecated Use <code>new SpanMultiTermQueryWrapper&lt;RegexQuery&gt;(new RegexQuery())</code> instead. * This query will be removed in Lucene 4.0 */	TokenNameCOMMENT_JAVADOC	 A SpanQuery version of {@link RegexQuery} allowing regular expression queries to be nested within other SpanQuery subclasses. @deprecated Use <code>new SpanMultiTermQueryWrapper&lt;RegexQuery&gt;(new RegexQuery())</code> instead. This query will be removed in Lucene 4.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
SpanRegexQuery	TokenNameIdentifier	 Span Regex Query
extends	TokenNameextends	
SpanMultiTermQueryWrapper	TokenNameIdentifier	 Span Multi Term Query Wrapper
<	TokenNameLESS	
RegexQuery	TokenNameIdentifier	 Regex Query
>	TokenNameGREATER	
implements	TokenNameimplements	
RegexQueryCapable	TokenNameIdentifier	 Regex Query Capable
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
RegexCapabilities	TokenNameIdentifier	 Regex Capabilities
regexImpl	TokenNameIdentifier	 regex Impl
=	TokenNameEQUAL	
new	TokenNamenew	
JavaUtilRegexCapabilities	TokenNameIdentifier	 Java Util Regex Capabilities
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SpanRegexQuery	TokenNameIdentifier	 Span Regex Query
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
new	TokenNamenew	
RegexQuery	TokenNameIdentifier	 Regex Query
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Term	TokenNameIdentifier	 Term
getTerm	TokenNameIdentifier	 get Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
getTerm	TokenNameIdentifier	 get Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setRegexImplementation	TokenNameIdentifier	 set Regex Implementation
(	TokenNameLPAREN	
RegexCapabilities	TokenNameIdentifier	 Regex Capabilities
impl	TokenNameIdentifier	 impl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
setRegexImplementation	TokenNameIdentifier	 set Regex Implementation
(	TokenNameLPAREN	
impl	TokenNameIdentifier	 impl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
RegexCapabilities	TokenNameIdentifier	 Regex Capabilities
getRegexImplementation	TokenNameIdentifier	 get Regex Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
getRegexImplementation	TokenNameIdentifier	 get Regex Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
