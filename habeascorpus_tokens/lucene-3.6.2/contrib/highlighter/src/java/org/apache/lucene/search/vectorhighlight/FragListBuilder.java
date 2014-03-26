package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
vectorhighlight	TokenNameIdentifier	 vectorhighlight
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * FragListBuilder is an interface for FieldFragList builder classes. * A FragListBuilder class can be plugged in to Highlighter. */	TokenNameCOMMENT_JAVADOC	 FragListBuilder is an interface for FieldFragList builder classes. A FragListBuilder class can be plugged in to Highlighter. 
public	TokenNamepublic	
interface	TokenNameinterface	
FragListBuilder	TokenNameIdentifier	 Frag List Builder
{	TokenNameLBRACE	
/** * create a FieldFragList. * * @param fieldPhraseList FieldPhraseList object * @param fragCharSize the length (number of chars) of a fragment * @return the created FieldFragList object */	TokenNameCOMMENT_JAVADOC	 create a FieldFragList. * @param fieldPhraseList FieldPhraseList object @param fragCharSize the length (number of chars) of a fragment @return the created FieldFragList object 
public	TokenNamepublic	
FieldFragList	TokenNameIdentifier	 Field Frag List
createFieldFragList	TokenNameIdentifier	 create Field Frag List
(	TokenNameLPAREN	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
fieldPhraseList	TokenNameIdentifier	 field Phrase List
,	TokenNameCOMMA	
int	TokenNameint	
fragCharSize	TokenNameIdentifier	 frag Char Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
