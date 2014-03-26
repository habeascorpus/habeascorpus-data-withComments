/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: TransformStateSetter.java 468654 2006-10-28 07:09:23Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: TransformStateSetter.java 468654 2006-10-28 07:09:23Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
Transformer	TokenNameIdentifier	 Transformer
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
/** * This interface is meant to be used by a base interface to * TransformState, but which as only the setters which have non Xalan * specific types in their signature, so that there are no dependancies * of the serializer on Xalan. * * This interface is not a public API, it is only public because it is * used by Xalan. * * @see org.apache.xalan.transformer.TransformState * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 This interface is meant to be used by a base interface to TransformState, but which as only the setters which have non Xalan specific types in their signature, so that there are no dependancies of the serializer on Xalan. * This interface is not a public API, it is only public because it is used by Xalan. * @see org.apache.xalan.transformer.TransformState @xsl.usage internal 
public	TokenNamepublic	
interface	TokenNameinterface	
TransformStateSetter	TokenNameIdentifier	 Transform State Setter
{	TokenNameLBRACE	
/** * Set the current node. * * @param n The current node. */	TokenNameCOMMENT_JAVADOC	 Set the current node. * @param n The current node. 
void	TokenNamevoid	
setCurrentNode	TokenNameIdentifier	 set Current Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Reset the state on the given transformer object. * * @param transformer */	TokenNameCOMMENT_JAVADOC	 Reset the state on the given transformer object. * @param transformer 
void	TokenNamevoid	
resetState	TokenNameIdentifier	 reset State
(	TokenNameLPAREN	
Transformer	TokenNameIdentifier	 Transformer
transformer	TokenNameIdentifier	 transformer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
