/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ExpressionNode.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ExpressionNode.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
SourceLocator	TokenNameIdentifier	 Source Locator
;	TokenNameSEMICOLON	
/** * A class that implements this interface can construct expressions, * give information about child and parent expressions, * and give the originating source information. A class that implements * this interface does not lay any claim to being directly executable. * * <p>Note: This interface should not be considered stable. Only exprSetParent * and exprGetParent can be counted on to work reliably. Work in progress.</p> */	TokenNameCOMMENT_JAVADOC	 A class that implements this interface can construct expressions, give information about child and parent expressions, and give the originating source information. A class that implements this interface does not lay any claim to being directly executable. * <p>Note: This interface should not be considered stable. Only exprSetParent and exprGetParent can be counted on to work reliably. Work in progress.</p> 
public	TokenNamepublic	
interface	TokenNameinterface	
ExpressionNode	TokenNameIdentifier	 Expression Node
extends	TokenNameextends	
SourceLocator	TokenNameIdentifier	 Source Locator
{	TokenNameLBRACE	
/** This pair of methods are used to inform the node of its parent. */	TokenNameCOMMENT_JAVADOC	 This pair of methods are used to inform the node of its parent. 
public	TokenNamepublic	
void	TokenNamevoid	
exprSetParent	TokenNameIdentifier	 expr Set Parent
(	TokenNameLPAREN	
ExpressionNode	TokenNameIdentifier	 Expression Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ExpressionNode	TokenNameIdentifier	 Expression Node
exprGetParent	TokenNameIdentifier	 expr Get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** This method tells the node to add its argument to the node's list of children. */	TokenNameCOMMENT_JAVADOC	 This method tells the node to add its argument to the node's list of children. 
public	TokenNamepublic	
void	TokenNamevoid	
exprAddChild	TokenNameIdentifier	 expr Add Child
(	TokenNameLPAREN	
ExpressionNode	TokenNameIdentifier	 Expression Node
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** This method returns a child node. The children are numbered from zero, left to right. */	TokenNameCOMMENT_JAVADOC	 This method returns a child node. The children are numbered from zero, left to right. 
public	TokenNamepublic	
ExpressionNode	TokenNameIdentifier	 Expression Node
exprGetChild	TokenNameIdentifier	 expr Get Child
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Return the number of children the node has. */	TokenNameCOMMENT_JAVADOC	 Return the number of children the node has. 
public	TokenNamepublic	
int	TokenNameint	
exprGetNumChildren	TokenNameIdentifier	 expr Get Num Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
