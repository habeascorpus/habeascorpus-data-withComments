package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
suggest	TokenNameIdentifier	 suggest
.	TokenNameDOT	
tst	TokenNameIdentifier	 tst
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * The class creates a TST node. */	TokenNameCOMMENT_JAVADOC	 The class creates a TST node. 
public	TokenNamepublic	
class	TokenNameclass	
TernaryTreeNode	TokenNameIdentifier	 Ternary Tree Node
{	TokenNameLBRACE	
/** the character stored by a node. */	TokenNameCOMMENT_JAVADOC	 the character stored by a node. 
char	TokenNamechar	
splitchar	TokenNameIdentifier	 splitchar
;	TokenNameSEMICOLON	
/** a reference object to the node containing character smaller than this node's character. */	TokenNameCOMMENT_JAVADOC	 a reference object to the node containing character smaller than this node's character. 
TernaryTreeNode	TokenNameIdentifier	 Ternary Tree Node
loKid	TokenNameIdentifier	 lo Kid
;	TokenNameSEMICOLON	
/** * a reference object to the node containing character next to this node's character as * occurring in the inserted token. */	TokenNameCOMMENT_JAVADOC	 a reference object to the node containing character next to this node's character as occurring in the inserted token. 
TernaryTreeNode	TokenNameIdentifier	 Ternary Tree Node
eqKid	TokenNameIdentifier	 eq Kid
;	TokenNameSEMICOLON	
/** a reference object to the node containing character higher than this node's character. */	TokenNameCOMMENT_JAVADOC	 a reference object to the node containing character higher than this node's character. 
TernaryTreeNode	TokenNameIdentifier	 Ternary Tree Node
hiKid	TokenNameIdentifier	 hi Kid
;	TokenNameSEMICOLON	
/** * used by leaf nodes to store the complete tokens to be added to suggest list while * auto-completing the prefix. */	TokenNameCOMMENT_JAVADOC	 used by leaf nodes to store the complete tokens to be added to suggest list while auto-completing the prefix. 
String	TokenNameIdentifier	 String
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
