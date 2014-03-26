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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
Fieldable	TokenNameIdentifier	 Fieldable
;	TokenNameSEMICOLON	
/** * Holds all per thread, per field state. */	TokenNameCOMMENT_JAVADOC	 Holds all per thread, per field state. 
final	TokenNamefinal	
class	TokenNameclass	
DocFieldProcessorPerField	TokenNameIdentifier	 Doc Field Processor Per Field
{	TokenNameLBRACE	
final	TokenNamefinal	
DocFieldConsumerPerField	TokenNameIdentifier	 Doc Field Consumer Per Field
consumer	TokenNameIdentifier	 consumer
;	TokenNameSEMICOLON	
final	TokenNamefinal	
FieldInfo	TokenNameIdentifier	 Field Info
fieldInfo	TokenNameIdentifier	 field Info
;	TokenNameSEMICOLON	
DocFieldProcessorPerField	TokenNameIdentifier	 Doc Field Processor Per Field
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
int	TokenNameint	
lastGen	TokenNameIdentifier	 last Gen
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
fieldCount	TokenNameIdentifier	 field Count
;	TokenNameSEMICOLON	
Fieldable	TokenNameIdentifier	 Fieldable
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fields	TokenNameIdentifier	 fields
=	TokenNameEQUAL	
new	TokenNamenew	
Fieldable	TokenNameIdentifier	 Fieldable
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DocFieldProcessorPerField	TokenNameIdentifier	 Doc Field Processor Per Field
(	TokenNameLPAREN	
final	TokenNamefinal	
DocFieldProcessorPerThread	TokenNameIdentifier	 Doc Field Processor Per Thread
perThread	TokenNameIdentifier	 per Thread
,	TokenNameCOMMA	
final	TokenNamefinal	
FieldInfo	TokenNameIdentifier	 Field Info
fieldInfo	TokenNameIdentifier	 field Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
consumer	TokenNameIdentifier	 consumer
=	TokenNameEQUAL	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
addField	TokenNameIdentifier	 add Field
(	TokenNameLPAREN	
fieldInfo	TokenNameIdentifier	 field Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fieldInfo	TokenNameIdentifier	 field Info
=	TokenNameEQUAL	
fieldInfo	TokenNameIdentifier	 field Info
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
abort	TokenNameIdentifier	 abort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
abort	TokenNameIdentifier	 abort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
