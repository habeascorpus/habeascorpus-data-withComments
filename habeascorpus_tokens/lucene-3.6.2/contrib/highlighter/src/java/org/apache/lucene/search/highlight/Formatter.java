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
/** * Processes terms found in the original text, typically by applying some form * of mark-up to highlight terms in HTML search results pages. * */	TokenNameCOMMENT_JAVADOC	 Processes terms found in the original text, typically by applying some form of mark-up to highlight terms in HTML search results pages. 
public	TokenNamepublic	
interface	TokenNameinterface	
Formatter	TokenNameIdentifier	 Formatter
{	TokenNameLBRACE	
/** * @param originalText The section of text being considered for markup * @param tokenGroup contains one or several overlapping Tokens along with * their scores and positions. */	TokenNameCOMMENT_JAVADOC	 @param originalText The section of text being considered for markup @param tokenGroup contains one or several overlapping Tokens along with their scores and positions. 
String	TokenNameIdentifier	 String
highlightTerm	TokenNameIdentifier	 highlight Term
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
originalText	TokenNameIdentifier	 original Text
,	TokenNameCOMMA	
TokenGroup	TokenNameIdentifier	 Token Group
tokenGroup	TokenNameIdentifier	 token Group
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
