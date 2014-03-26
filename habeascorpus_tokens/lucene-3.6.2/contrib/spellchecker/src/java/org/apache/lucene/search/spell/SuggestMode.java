package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
spell	TokenNameIdentifier	 spell
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Set of strategies for suggesting related terms * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Set of strategies for suggesting related terms @lucene.experimental 
public	TokenNamepublic	
enum	TokenNameenum	
SuggestMode	TokenNameIdentifier	 Suggest Mode
{	TokenNameLBRACE	
/** * Generate suggestions only for terms not in the index (default) */	TokenNameCOMMENT_JAVADOC	 Generate suggestions only for terms not in the index (default) 
SUGGEST_WHEN_NOT_IN_INDEX	TokenNameIdentifier	 SUGGEST  WHEN  NOT  IN  INDEX
,	TokenNameCOMMA	
/** * Return only suggested words that are as frequent or more frequent than the * searched word */	TokenNameCOMMENT_JAVADOC	 Return only suggested words that are as frequent or more frequent than the searched word 
SUGGEST_MORE_POPULAR	TokenNameIdentifier	 SUGGEST  MORE  POPULAR
,	TokenNameCOMMA	
/** * Always attempt to offer suggestions (however, other parameters may limit * suggestions.) */	TokenNameCOMMENT_JAVADOC	 Always attempt to offer suggestions (however, other parameters may limit suggestions.) 
SUGGEST_ALWAYS	TokenNameIdentifier	 SUGGEST  ALWAYS
}	TokenNameRBRACE	
