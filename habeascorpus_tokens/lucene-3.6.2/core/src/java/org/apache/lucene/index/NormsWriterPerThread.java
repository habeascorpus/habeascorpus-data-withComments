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
NormsWriterPerThread	TokenNameIdentifier	 Norms Writer Per Thread
extends	TokenNameextends	
InvertedDocEndConsumerPerThread	TokenNameIdentifier	 Inverted Doc End Consumer Per Thread
{	TokenNameLBRACE	
final	TokenNamefinal	
NormsWriter	TokenNameIdentifier	 Norms Writer
normsWriter	TokenNameIdentifier	 norms Writer
;	TokenNameSEMICOLON	
final	TokenNamefinal	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
DocState	TokenNameIdentifier	 Doc State
docState	TokenNameIdentifier	 doc State
;	TokenNameSEMICOLON	
public	TokenNamepublic	
NormsWriterPerThread	TokenNameIdentifier	 Norms Writer Per Thread
(	TokenNameLPAREN	
DocInverterPerThread	TokenNameIdentifier	 Doc Inverter Per Thread
docInverterPerThread	TokenNameIdentifier	 doc Inverter Per Thread
,	TokenNameCOMMA	
NormsWriter	TokenNameIdentifier	 Norms Writer
normsWriter	TokenNameIdentifier	 norms Writer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
normsWriter	TokenNameIdentifier	 norms Writer
=	TokenNameEQUAL	
normsWriter	TokenNameIdentifier	 norms Writer
;	TokenNameSEMICOLON	
docState	TokenNameIdentifier	 doc State
=	TokenNameEQUAL	
docInverterPerThread	TokenNameIdentifier	 doc Inverter Per Thread
.	TokenNameDOT	
docState	TokenNameIdentifier	 doc State
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
InvertedDocEndConsumerPerField	TokenNameIdentifier	 Inverted Doc End Consumer Per Field
addField	TokenNameIdentifier	 add Field
(	TokenNameLPAREN	
DocInverterPerField	TokenNameIdentifier	 Doc Inverter Per Field
docInverterPerField	TokenNameIdentifier	 doc Inverter Per Field
,	TokenNameCOMMA	
final	TokenNamefinal	
FieldInfo	TokenNameIdentifier	 Field Info
fieldInfo	TokenNameIdentifier	 field Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
NormsWriterPerField	TokenNameIdentifier	 Norms Writer Per Field
(	TokenNameLPAREN	
docInverterPerField	TokenNameIdentifier	 doc Inverter Per Field
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
abort	TokenNameIdentifier	 abort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
void	TokenNamevoid	
finishDocument	TokenNameIdentifier	 finish Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
freeRAM	TokenNameIdentifier	 free RAM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
