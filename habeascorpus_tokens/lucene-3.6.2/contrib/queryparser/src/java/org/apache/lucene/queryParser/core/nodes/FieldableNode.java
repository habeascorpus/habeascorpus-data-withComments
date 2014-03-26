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
/** * A query node implements {@link FieldableNode} interface to indicate that its * children and itself are associated to a specific field. * * If it has any children which also implements this interface, it must ensure * the children are associated to the same field. * */	TokenNameCOMMENT_JAVADOC	 A query node implements {@link FieldableNode} interface to indicate that its children and itself are associated to a specific field. * If it has any children which also implements this interface, it must ensure the children are associated to the same field. 
public	TokenNamepublic	
interface	TokenNameinterface	
FieldableNode	TokenNameIdentifier	 Fieldable Node
extends	TokenNameextends	
QueryNode	TokenNameIdentifier	 Query Node
{	TokenNameLBRACE	
/** * Returns the field associated to the node and every node under it. * * @return the field name */	TokenNameCOMMENT_JAVADOC	 Returns the field associated to the node and every node under it. * @return the field name 
CharSequence	TokenNameIdentifier	 Char Sequence
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Associates the node to a field. * * @param fieldName * the field name */	TokenNameCOMMENT_JAVADOC	 Associates the node to a field. * @param fieldName the field name 
void	TokenNamevoid	
setField	TokenNameIdentifier	 set Field
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
