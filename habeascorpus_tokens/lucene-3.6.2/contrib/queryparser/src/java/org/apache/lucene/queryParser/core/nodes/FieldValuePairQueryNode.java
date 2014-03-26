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
nodes	TokenNameIdentifier	 nodes
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * This interface should be implemented by {@link QueryNode} that holds a field * and an arbitrary value. * * @see FieldableNode * @see ValueQueryNode */	TokenNameCOMMENT_JAVADOC	 This interface should be implemented by {@link QueryNode} that holds a field and an arbitrary value. * @see FieldableNode @see ValueQueryNode 
public	TokenNamepublic	
interface	TokenNameinterface	
FieldValuePairQueryNode	TokenNameIdentifier	 Field Value Pair Query Node
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
extends	TokenNameextends	
FieldableNode	TokenNameIdentifier	 Fieldable Node
,	TokenNameCOMMA	
ValueQueryNode	TokenNameIdentifier	 Value Query Node
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
{	TokenNameLBRACE	
}	TokenNameRBRACE	