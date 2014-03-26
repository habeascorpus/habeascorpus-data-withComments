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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Closeable	TokenNameIdentifier	 Closeable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
final	TokenNamefinal	
class	TokenNameclass	
FormatPostingsTermsWriter	TokenNameIdentifier	 Format Postings Terms Writer
extends	TokenNameextends	
FormatPostingsTermsConsumer	TokenNameIdentifier	 Format Postings Terms Consumer
implements	TokenNameimplements	
Closeable	TokenNameIdentifier	 Closeable
{	TokenNameLBRACE	
final	TokenNamefinal	
FormatPostingsFieldsWriter	TokenNameIdentifier	 Format Postings Fields Writer
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
final	TokenNamefinal	
FormatPostingsDocsWriter	TokenNameIdentifier	 Format Postings Docs Writer
docsWriter	TokenNameIdentifier	 docs Writer
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TermInfosWriter	TokenNameIdentifier	 Term Infos Writer
termsOut	TokenNameIdentifier	 terms Out
;	TokenNameSEMICOLON	
FieldInfo	TokenNameIdentifier	 Field Info
fieldInfo	TokenNameIdentifier	 field Info
;	TokenNameSEMICOLON	
FormatPostingsTermsWriter	TokenNameIdentifier	 Format Postings Terms Writer
(	TokenNameLPAREN	
SegmentWriteState	TokenNameIdentifier	 Segment Write State
state	TokenNameIdentifier	 state
,	TokenNameCOMMA	
FormatPostingsFieldsWriter	TokenNameIdentifier	 Format Postings Fields Writer
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
termsOut	TokenNameIdentifier	 terms Out
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
termsOut	TokenNameIdentifier	 terms Out
;	TokenNameSEMICOLON	
docsWriter	TokenNameIdentifier	 docs Writer
=	TokenNameEQUAL	
new	TokenNamenew	
FormatPostingsDocsWriter	TokenNameIdentifier	 Format Postings Docs Writer
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
setField	TokenNameIdentifier	 set Field
(	TokenNameLPAREN	
FieldInfo	TokenNameIdentifier	 Field Info
fieldInfo	TokenNameIdentifier	 field Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fieldInfo	TokenNameIdentifier	 field Info
=	TokenNameEQUAL	
fieldInfo	TokenNameIdentifier	 field Info
;	TokenNameSEMICOLON	
docsWriter	TokenNameIdentifier	 docs Writer
.	TokenNameDOT	
setField	TokenNameIdentifier	 set Field
(	TokenNameLPAREN	
fieldInfo	TokenNameIdentifier	 field Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
currentTerm	TokenNameIdentifier	 current Term
;	TokenNameSEMICOLON	
int	TokenNameint	
currentTermStart	TokenNameIdentifier	 current Term Start
;	TokenNameSEMICOLON	
long	TokenNamelong	
freqStart	TokenNameIdentifier	 freq Start
;	TokenNameSEMICOLON	
long	TokenNamelong	
proxStart	TokenNameIdentifier	 prox Start
;	TokenNameSEMICOLON	
/** Adds a new term in this field */	TokenNameCOMMENT_JAVADOC	 Adds a new term in this field 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
FormatPostingsDocsConsumer	TokenNameIdentifier	 Format Postings Docs Consumer
addTerm	TokenNameIdentifier	 add Term
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentTerm	TokenNameIdentifier	 current Term
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
currentTermStart	TokenNameIdentifier	 current Term Start
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
// TODO: this is abstraction violation -- ideally this 	TokenNameCOMMENT_LINE	TODO: this is abstraction violation -- ideally this 
// terms writer is not so "invasive", looking for file 	TokenNameCOMMENT_LINE	terms writer is not so "invasive", looking for file 
// pointers in its child consumers. 	TokenNameCOMMENT_LINE	pointers in its child consumers. 
freqStart	TokenNameIdentifier	 freq Start
=	TokenNameEQUAL	
docsWriter	TokenNameIdentifier	 docs Writer
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
docsWriter	TokenNameIdentifier	 docs Writer
.	TokenNameDOT	
posWriter	TokenNameIdentifier	 pos Writer
.	TokenNameDOT	
out	TokenNameIdentifier	 out
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
proxStart	TokenNameIdentifier	 prox Start
=	TokenNameEQUAL	
docsWriter	TokenNameIdentifier	 docs Writer
.	TokenNameDOT	
posWriter	TokenNameIdentifier	 pos Writer
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
skipListWriter	TokenNameIdentifier	 skip List Writer
.	TokenNameDOT	
resetSkip	TokenNameIdentifier	 reset Skip
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
docsWriter	TokenNameIdentifier	 docs Writer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Called when we are done adding terms to this field */	TokenNameCOMMENT_JAVADOC	 Called when we are done adding terms to this field 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
void	TokenNamevoid	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
docsWriter	TokenNameIdentifier	 docs Writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
