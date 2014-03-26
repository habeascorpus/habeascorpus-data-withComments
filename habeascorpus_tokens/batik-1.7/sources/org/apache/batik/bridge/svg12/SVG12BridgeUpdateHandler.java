/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
.	TokenNameDOT	
svg12	TokenNameIdentifier	 svg12
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
.	TokenNameDOT	
BridgeUpdateHandler	TokenNameIdentifier	 Bridge Update Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
/** * A BridgeUpdateHandler interface for SVG 1.2 specific events. This is * for XBL event notification. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: SVG12BridgeUpdateHandler.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 A BridgeUpdateHandler interface for SVG 1.2 specific events. This is for XBL event notification. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: SVG12BridgeUpdateHandler.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
SVG12BridgeUpdateHandler	TokenNameIdentifier	 SV G12 Bridge Update Handler
extends	TokenNameextends	
BridgeUpdateHandler	TokenNameIdentifier	 Bridge Update Handler
{	TokenNameLBRACE	
/** * Invoked when a bindable element's binding has changed. */	TokenNameCOMMENT_JAVADOC	 Invoked when a bindable element's binding has changed. 
void	TokenNamevoid	
handleBindingEvent	TokenNameIdentifier	 handle Binding Event
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
bindableElement	TokenNameIdentifier	 bindable Element
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
shadowTree	TokenNameIdentifier	 shadow Tree
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Invoked when the xblChildNodes property has changed because a * descendant xbl:content element has updated its selected nodes. */	TokenNameCOMMENT_JAVADOC	 Invoked when the xblChildNodes property has changed because a descendant xbl:content element has updated its selected nodes. 
void	TokenNamevoid	
handleContentSelectionChangedEvent	TokenNameIdentifier	 handle Content Selection Changed Event
(	TokenNameLPAREN	
ContentSelectionChangedEvent	TokenNameIdentifier	 Content Selection Changed Event
csce	TokenNameIdentifier	 csce
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
