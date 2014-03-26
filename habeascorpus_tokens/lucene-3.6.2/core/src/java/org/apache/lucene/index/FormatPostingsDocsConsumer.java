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
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 @lucene.experimental 
abstract	TokenNameabstract	
class	TokenNameclass	
FormatPostingsDocsConsumer	TokenNameIdentifier	 Format Postings Docs Consumer
{	TokenNameLBRACE	
/** Adds a new doc in this term. If this returns null * then we just skip consuming positions/payloads. */	TokenNameCOMMENT_JAVADOC	 Adds a new doc in this term. If this returns null then we just skip consuming positions/payloads. 
abstract	TokenNameabstract	
FormatPostingsPositionsConsumer	TokenNameIdentifier	 Format Postings Positions Consumer
addDoc	TokenNameIdentifier	 add Doc
(	TokenNameLPAREN	
int	TokenNameint	
docID	TokenNameIdentifier	 doc ID
,	TokenNameCOMMA	
int	TokenNameint	
termDocFreq	TokenNameIdentifier	 term Doc Freq
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Called when we are done adding docs to this term */	TokenNameCOMMENT_JAVADOC	 Called when we are done adding docs to this term 
abstract	TokenNameabstract	
void	TokenNamevoid	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
