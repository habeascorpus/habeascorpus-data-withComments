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
/** Abstract API that consumes terms, doc, freq, prox and * payloads postings. Concrete implementations of this * actually do "something" with the postings (write it into * the index in a specific format). * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Abstract API that consumes terms, doc, freq, prox and payloads postings. Concrete implementations of this actually do "something" with the postings (write it into the index in a specific format). * @lucene.experimental 
abstract	TokenNameabstract	
class	TokenNameclass	
FormatPostingsFieldsConsumer	TokenNameIdentifier	 Format Postings Fields Consumer
{	TokenNameLBRACE	
/** Add a new field */	TokenNameCOMMENT_JAVADOC	 Add a new field 
abstract	TokenNameabstract	
FormatPostingsTermsConsumer	TokenNameIdentifier	 Format Postings Terms Consumer
addField	TokenNameIdentifier	 add Field
(	TokenNameLPAREN	
FieldInfo	TokenNameIdentifier	 Field Info
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Called when we are done adding everything. */	TokenNameCOMMENT_JAVADOC	 Called when we are done adding everything. 
abstract	TokenNameabstract	
void	TokenNamevoid	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
