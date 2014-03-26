/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: DOMOrder.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: DOMOrder.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
/** * @deprecated Since the introduction of the DTM, this class will be removed. * Nodes that implement this index can return a document order index. * Eventually, this will be replaced by DOM 3 methods. * (compareDocumentOrder and/or compareTreePosition.) */	TokenNameCOMMENT_JAVADOC	 @deprecated Since the introduction of the DTM, this class will be removed. Nodes that implement this index can return a document order index. Eventually, this will be replaced by DOM 3 methods. (compareDocumentOrder and/or compareTreePosition.) 
public	TokenNamepublic	
interface	TokenNameinterface	
DOMOrder	TokenNameIdentifier	 DOM Order
{	TokenNameLBRACE	
/** * Get the UID (document order index). * * @return integer whose relative value corresponds to document order * -- that is, if node1.getUid()<node2.getUid(), node1 comes before * node2, and if they're equal node1 and node2 are the same node. No * promises are made beyond that. */	TokenNameCOMMENT_JAVADOC	 Get the UID (document order index). * @return integer whose relative value corresponds to document order -- that is, if node1.getUid()<node2.getUid(), node1 comes before node2, and if they're equal node1 and node2 are the same node. No promises are made beyond that. 
public	TokenNamepublic	
int	TokenNameint	
getUid	TokenNameIdentifier	 get Uid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
