package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
highlight	TokenNameIdentifier	 highlight
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** Lightweight class to hold term and a weight value used for scoring this term */	TokenNameCOMMENT_JAVADOC	 Lightweight class to hold term and a weight value used for scoring this term 
public	TokenNamepublic	
class	TokenNameclass	
WeightedTerm	TokenNameIdentifier	 Weighted Term
{	TokenNameLBRACE	
float	TokenNamefloat	
weight	TokenNameIdentifier	 weight
;	TokenNameSEMICOLON	
// multiplier 	TokenNameCOMMENT_LINE	multiplier 
String	TokenNameIdentifier	 String
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
//stemmed form 	TokenNameCOMMENT_LINE	stemmed form 
public	TokenNamepublic	
WeightedTerm	TokenNameIdentifier	 Weighted Term
(	TokenNameLPAREN	
float	TokenNamefloat	
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
weight	TokenNameIdentifier	 weight
=	TokenNameEQUAL	
weight	TokenNameIdentifier	 weight
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the term value (stemmed) */	TokenNameCOMMENT_JAVADOC	 @return the term value (stemmed) 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTerm	TokenNameIdentifier	 get Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the weight associated with this term */	TokenNameCOMMENT_JAVADOC	 @return the weight associated with this term 
public	TokenNamepublic	
float	TokenNamefloat	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
weight	TokenNameIdentifier	 weight
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param term the term value (stemmed) */	TokenNameCOMMENT_JAVADOC	 @param term the term value (stemmed) 
public	TokenNamepublic	
void	TokenNamevoid	
setTerm	TokenNameIdentifier	 set Term
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param weight the weight associated with this term */	TokenNameCOMMENT_JAVADOC	 @param weight the weight associated with this term 
public	TokenNamepublic	
void	TokenNamevoid	
setWeight	TokenNameIdentifier	 set Weight
(	TokenNameLPAREN	
float	TokenNamefloat	
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
weight	TokenNameIdentifier	 weight
=	TokenNameEQUAL	
weight	TokenNameIdentifier	 weight
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
