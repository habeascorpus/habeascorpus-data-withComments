package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
core	TokenNameIdentifier	 core
.	TokenNameDOT	
config	TokenNameIdentifier	 config
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * An instance of this class represents a key that is used to retrieve a value * from {@link AbstractQueryConfig}. It also holds the value's type, which is * defined in the generic argument. * * @see AbstractQueryConfig */	TokenNameCOMMENT_JAVADOC	 An instance of this class represents a key that is used to retrieve a value from {@link AbstractQueryConfig}. It also holds the value's type, which is defined in the generic argument. * @see AbstractQueryConfig 
final	TokenNamefinal	
public	TokenNamepublic	
class	TokenNameclass	
ConfigurationKey	TokenNameIdentifier	 Configuration Key
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
ConfigurationKey	TokenNameIdentifier	 Configuration Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a new instance. * * @param <T> the value's type * * @return a new instance */	TokenNameCOMMENT_JAVADOC	 Creates a new instance. * @param <T> the value's type * @return a new instance 
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
ConfigurationKey	TokenNameIdentifier	 Configuration Key
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ConfigurationKey	TokenNameIdentifier	 Configuration Key
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
