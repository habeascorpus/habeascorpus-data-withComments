/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: NodeTestFilter.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: NodeTestFilter.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
patterns	TokenNameIdentifier	 patterns
;	TokenNameSEMICOLON	
/** * This interface should be implemented by Nodes and/or iterators, * when they need to know what the node test is before they do * getNextChild, etc. */	TokenNameCOMMENT_JAVADOC	 This interface should be implemented by Nodes and/or iterators, when they need to know what the node test is before they do getNextChild, etc. 
public	TokenNamepublic	
interface	TokenNameinterface	
NodeTestFilter	TokenNameIdentifier	 Node Test Filter
{	TokenNameLBRACE	
/** * Set the node test for this filter. * * * @param nodeTest Reference to a NodeTest that may be used to predetermine * what nodes to return. */	TokenNameCOMMENT_JAVADOC	 Set the node test for this filter. * @param nodeTest Reference to a NodeTest that may be used to predetermine what nodes to return. 
void	TokenNamevoid	
setNodeTest	TokenNameIdentifier	 set Node Test
(	TokenNameLPAREN	
NodeTest	TokenNameIdentifier	 Node Test
nodeTest	TokenNameIdentifier	 node Test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
