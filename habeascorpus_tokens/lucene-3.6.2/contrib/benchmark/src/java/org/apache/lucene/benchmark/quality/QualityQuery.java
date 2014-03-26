/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
quality	TokenNameIdentifier	 quality
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
/** * A QualityQuery has an ID and some name-value pairs. * <p> * The ID allows to map the quality query with its judgements. * <p> * The name-value pairs are used by a * {@link org.apache.lucene.benchmark.quality.QualityQueryParser} * to create a Lucene {@link org.apache.lucene.search.Query}. * <p> * It is very likely that name-value-pairs would be mapped into fields in a Lucene query, * but it is up to the QualityQueryParser how to map - e.g. all values in a single field, * or each pair as its own field, etc., - and this of course must match the way the * searched index was constructed. */	TokenNameCOMMENT_JAVADOC	 A QualityQuery has an ID and some name-value pairs. <p> The ID allows to map the quality query with its judgements. <p> The name-value pairs are used by a {@link org.apache.lucene.benchmark.quality.QualityQueryParser} to create a Lucene {@link org.apache.lucene.search.Query}. <p> It is very likely that name-value-pairs would be mapped into fields in a Lucene query, but it is up to the QualityQueryParser how to map - e.g. all values in a single field, or each pair as its own field, etc., - and this of course must match the way the searched index was constructed. 
public	TokenNamepublic	
class	TokenNameclass	
QualityQuery	TokenNameIdentifier	 Quality Query
implements	TokenNameimplements	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
QualityQuery	TokenNameIdentifier	 Quality Query
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
queryID	TokenNameIdentifier	 query ID
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
nameValPairs	TokenNameIdentifier	 name Val Pairs
;	TokenNameSEMICOLON	
/** * Create a QualityQuery with given ID and name-value pairs. * @param queryID ID of this quality query. * @param nameValPairs the contents of this quality query. */	TokenNameCOMMENT_JAVADOC	 Create a QualityQuery with given ID and name-value pairs. @param queryID ID of this quality query. @param nameValPairs the contents of this quality query. 
public	TokenNamepublic	
QualityQuery	TokenNameIdentifier	 Quality Query
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
queryID	TokenNameIdentifier	 query ID
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
nameValPairs	TokenNameIdentifier	 name Val Pairs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
queryID	TokenNameIdentifier	 query ID
=	TokenNameEQUAL	
queryID	TokenNameIdentifier	 query ID
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
nameValPairs	TokenNameIdentifier	 name Val Pairs
=	TokenNameEQUAL	
nameValPairs	TokenNameIdentifier	 name Val Pairs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return all the names of name-value-pairs in this QualityQuery. */	TokenNameCOMMENT_JAVADOC	 Return all the names of name-value-pairs in this QualityQuery. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getNames	TokenNameIdentifier	 get Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nameValPairs	TokenNameIdentifier	 name Val Pairs
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the value of a certain name-value pair. * @param name the name whose value should be returned. */	TokenNameCOMMENT_JAVADOC	 Return the value of a certain name-value pair. @param name the name whose value should be returned. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nameValPairs	TokenNameIdentifier	 name Val Pairs
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the ID of this query. * The ID allows to map the quality query with its judgements. */	TokenNameCOMMENT_JAVADOC	 Return the ID of this query. The ID allows to map the quality query with its judgements. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getQueryID	TokenNameIdentifier	 get Query ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
queryID	TokenNameIdentifier	 query ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* for a nicer sort of input queries before running them. * Try first as ints, fall back to string if not int. */	TokenNameCOMMENT_BLOCK	 for a nicer sort of input queries before running them. Try first as ints, fall back to string if not int. 
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
QualityQuery	TokenNameIdentifier	 Quality Query
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// compare as ints when ids ints 	TokenNameCOMMENT_LINE	compare as ints when ids ints 
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
queryID	TokenNameIdentifier	 query ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nOther	TokenNameIdentifier	 n Other
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
queryID	TokenNameIdentifier	 query ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
nOther	TokenNameIdentifier	 n Other
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// fall back to string comparison 	TokenNameCOMMENT_LINE	fall back to string comparison 
return	TokenNamereturn	
queryID	TokenNameIdentifier	 query ID
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
queryID	TokenNameIdentifier	 query ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
