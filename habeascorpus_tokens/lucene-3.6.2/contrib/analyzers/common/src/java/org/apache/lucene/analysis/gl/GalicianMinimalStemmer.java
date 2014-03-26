package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
gl	TokenNameIdentifier	 gl
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
pt	TokenNameIdentifier	 pt
.	TokenNameDOT	
RSLPStemmerBase	TokenNameIdentifier	 RSLP Stemmer Base
;	TokenNameSEMICOLON	
/** * Minimal Stemmer for Galician * <p> * This follows the "RSLP-S" algorithm, but modified for Galician. * Hence this stemmer only applies the plural reduction step of: * "Regras do lematizador para o galego" * @see RSLPStemmerBase */	TokenNameCOMMENT_JAVADOC	 Minimal Stemmer for Galician <p> This follows the "RSLP-S" algorithm, but modified for Galician. Hence this stemmer only applies the plural reduction step of: "Regras do lematizador para o galego" @see RSLPStemmerBase 
public	TokenNamepublic	
class	TokenNameclass	
GalicianMinimalStemmer	TokenNameIdentifier	 Galician Minimal Stemmer
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
GalicianMinimalStemmer	TokenNameIdentifier	 Galician Minimal Stemmer
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
"galician.rslp"	TokenNameStringLiteral	galician.rslp
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
