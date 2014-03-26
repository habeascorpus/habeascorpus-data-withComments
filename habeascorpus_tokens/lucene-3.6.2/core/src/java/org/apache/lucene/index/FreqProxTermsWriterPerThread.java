package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
final	TokenNamefinal	
class	TokenNameclass	
FreqProxTermsWriterPerThread	TokenNameIdentifier	 Freq Prox Terms Writer Per Thread
extends	TokenNameextends	
TermsHashConsumerPerThread	TokenNameIdentifier	 Terms Hash Consumer Per Thread
{	TokenNameLBRACE	
final	TokenNamefinal	
TermsHashPerThread	TokenNameIdentifier	 Terms Hash Per Thread
termsHashPerThread	TokenNameIdentifier	 terms Hash Per Thread
;	TokenNameSEMICOLON	
final	TokenNamefinal	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
DocState	TokenNameIdentifier	 Doc State
docState	TokenNameIdentifier	 doc State
;	TokenNameSEMICOLON	
public	TokenNamepublic	
FreqProxTermsWriterPerThread	TokenNameIdentifier	 Freq Prox Terms Writer Per Thread
(	TokenNameLPAREN	
TermsHashPerThread	TokenNameIdentifier	 Terms Hash Per Thread
perThread	TokenNameIdentifier	 per Thread
)	TokenNameRPAREN	
{	TokenNameLBRACE	
docState	TokenNameIdentifier	 doc State
=	TokenNameEQUAL	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
docState	TokenNameIdentifier	 doc State
;	TokenNameSEMICOLON	
termsHashPerThread	TokenNameIdentifier	 terms Hash Per Thread
=	TokenNameEQUAL	
perThread	TokenNameIdentifier	 per Thread
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TermsHashConsumerPerField	TokenNameIdentifier	 Terms Hash Consumer Per Field
addField	TokenNameIdentifier	 add Field
(	TokenNameLPAREN	
TermsHashPerField	TokenNameIdentifier	 Terms Hash Per Field
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
,	TokenNameCOMMA	
FieldInfo	TokenNameIdentifier	 Field Info
fieldInfo	TokenNameIdentifier	 field Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FreqProxTermsWriterPerField	TokenNameIdentifier	 Freq Prox Terms Writer Per Field
(	TokenNameLPAREN	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
fieldInfo	TokenNameIdentifier	 field Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
void	TokenNamevoid	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
DocWriter	TokenNameIdentifier	 Doc Writer
finishDocument	TokenNameIdentifier	 finish Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
abort	TokenNameIdentifier	 abort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
