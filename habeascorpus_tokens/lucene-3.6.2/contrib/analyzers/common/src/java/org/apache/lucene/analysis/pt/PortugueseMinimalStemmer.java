package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
pt	TokenNameIdentifier	 pt
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Minimal Stemmer for Portuguese * <p> * This follows the "RSLP-S" algorithm presented in: * <i>A study on the Use of Stemming for Monolingual Ad-Hoc Portuguese * Information Retrieval</i> (Orengo, et al) * which is just the plural reduction step of the RSLP * algorithm from <i>A Stemming Algorithm for the Portuguese Language</i>, * Orengo et al. * @see RSLPStemmerBase */	TokenNameCOMMENT_JAVADOC	 Minimal Stemmer for Portuguese <p> This follows the "RSLP-S" algorithm presented in: <i>A study on the Use of Stemming for Monolingual Ad-Hoc Portuguese Information Retrieval</i> (Orengo, et al) which is just the plural reduction step of the RSLP algorithm from <i>A Stemming Algorithm for the Portuguese Language</i>, Orengo et al. @see RSLPStemmerBase 
public	TokenNamepublic	
class	TokenNameclass	
PortugueseMinimalStemmer	TokenNameIdentifier	 Portuguese Minimal Stemmer
extends	TokenNameextends	
RSLPStemmerBase	TokenNameIdentifier	 RSLP Stemmer Base
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Step	TokenNameIdentifier	 Step
pluralStep	TokenNameIdentifier	 plural Step
=	TokenNameEQUAL	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
PortugueseMinimalStemmer	TokenNameIdentifier	 Portuguese Minimal Stemmer
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
"portuguese.rslp"	TokenNameStringLiteral	portuguese.rslp
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Plural"	TokenNameStringLiteral	Plural
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
stem	TokenNameIdentifier	 stem
(	TokenNameLPAREN	
char	TokenNamechar	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pluralStep	TokenNameIdentifier	 plural Step
.	TokenNameDOT	
apply	TokenNameIdentifier	 apply
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
