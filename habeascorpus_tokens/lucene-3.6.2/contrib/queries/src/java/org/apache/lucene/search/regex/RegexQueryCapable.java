package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Defines methods for regular expression supporting Querys to use. */	TokenNameCOMMENT_JAVADOC	 Defines methods for regular expression supporting Querys to use. 
public	TokenNamepublic	
interface	TokenNameinterface	
RegexQueryCapable	TokenNameIdentifier	 Regex Query Capable
{	TokenNameLBRACE	
void	TokenNamevoid	
setRegexImplementation	TokenNameIdentifier	 set Regex Implementation
(	TokenNameLPAREN	
RegexCapabilities	TokenNameIdentifier	 Regex Capabilities
impl	TokenNameIdentifier	 impl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RegexCapabilities	TokenNameIdentifier	 Regex Capabilities
getRegexImplementation	TokenNameIdentifier	 get Regex Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
