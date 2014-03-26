/** * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
streaming	TokenNameIdentifier	 streaming
;	TokenNameSEMICOLON	
/** * Callback interface for streaming session success/failure. */	TokenNameCOMMENT_JAVADOC	 Callback interface for streaming session success/failure. 
public	TokenNamepublic	
interface	TokenNameinterface	
IStreamCallback	TokenNameIdentifier	 I Stream Callback
{	TokenNameLBRACE	
/** * called when stream session is finished successfully. */	TokenNameCOMMENT_JAVADOC	 called when stream session is finished successfully. 
public	TokenNamepublic	
void	TokenNamevoid	
onSuccess	TokenNameIdentifier	 on Success
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * called when streaming somehow got in trouble. */	TokenNameCOMMENT_JAVADOC	 called when streaming somehow got in trouble. 
public	TokenNamepublic	
void	TokenNamevoid	
onFailure	TokenNameIdentifier	 on Failure
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
