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
/** * This interface should be implemented by classes that wants to listen for * field configuration requests. The implementation receives a * {@link FieldConfig} object and may add/change its configuration. * * @see FieldConfig * @see QueryConfigHandler */	TokenNameCOMMENT_JAVADOC	 This interface should be implemented by classes that wants to listen for field configuration requests. The implementation receives a {@link FieldConfig} object and may add/change its configuration. * @see FieldConfig @see QueryConfigHandler 
public	TokenNamepublic	
interface	TokenNameinterface	
FieldConfigListener	TokenNameIdentifier	 Field Config Listener
{	TokenNameLBRACE	
/** * This method is called ever time a field configuration is requested. * * @param fieldConfig * the field configuration requested, should never be null */	TokenNameCOMMENT_JAVADOC	 This method is called ever time a field configuration is requested. * @param fieldConfig the field configuration requested, should never be null 
void	TokenNamevoid	
buildFieldConfig	TokenNameIdentifier	 build Field Config
(	TokenNameLPAREN	
FieldConfig	TokenNameIdentifier	 Field Config
fieldConfig	TokenNameIdentifier	 field Config
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
