/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
engine	TokenNameIdentifier	 engine
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
;	TokenNameSEMICOLON	
/** * An interface for DOM classes that can be navigated for CSS selector * matching and cascade computation. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: CSSNavigableNode.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 An interface for DOM classes that can be navigated for CSS selector matching and cascade computation. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: CSSNavigableNode.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
CSSNavigableNode	TokenNameIdentifier	 CSS Navigable Node
{	TokenNameLBRACE	
/** * Returns the CSS parent node of this node. */	TokenNameCOMMENT_JAVADOC	 Returns the CSS parent node of this node. 
Node	TokenNameIdentifier	 Node
getCSSParentNode	TokenNameIdentifier	 get CSS Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the CSS previous sibling node of this node. */	TokenNameCOMMENT_JAVADOC	 Returns the CSS previous sibling node of this node. 
Node	TokenNameIdentifier	 Node
getCSSPreviousSibling	TokenNameIdentifier	 get CSS Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the CSS next sibling node of this node. */	TokenNameCOMMENT_JAVADOC	 Returns the CSS next sibling node of this node. 
Node	TokenNameIdentifier	 Node
getCSSNextSibling	TokenNameIdentifier	 get CSS Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the CSS first child node of this node. */	TokenNameCOMMENT_JAVADOC	 Returns the CSS first child node of this node. 
Node	TokenNameIdentifier	 Node
getCSSFirstChild	TokenNameIdentifier	 get CSS First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the CSS last child of this node. */	TokenNameCOMMENT_JAVADOC	 Returns the CSS last child of this node. 
Node	TokenNameIdentifier	 Node
getCSSLastChild	TokenNameIdentifier	 get CSS Last Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns whether this node is the root of a (conceptual) hidden tree * that selectors will not work across. */	TokenNameCOMMENT_JAVADOC	 Returns whether this node is the root of a (conceptual) hidden tree that selectors will not work across. 
boolean	TokenNameboolean	
isHiddenFromSelectors	TokenNameIdentifier	 is Hidden From Selectors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
