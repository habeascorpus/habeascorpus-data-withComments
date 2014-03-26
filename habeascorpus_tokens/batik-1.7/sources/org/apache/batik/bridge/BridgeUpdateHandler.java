/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
CSSEngineEvent	TokenNameIdentifier	 CSS Engine Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
AnimatedLiveAttributeValue	TokenNameIdentifier	 Animated Live Attribute Value
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
events	TokenNameIdentifier	 events
.	TokenNameDOT	
MutationEvent	TokenNameIdentifier	 Mutation Event
;	TokenNameSEMICOLON	
/** * Interface for objects interested in being notified of updates. * * @author <a href="mailto:vincent.hardy@apache.org">Vincent Hardy</a> * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> * @version $Id: BridgeUpdateHandler.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Interface for objects interested in being notified of updates. * @author <a href="mailto:vincent.hardy@apache.org">Vincent Hardy</a> @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> @version $Id: BridgeUpdateHandler.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
BridgeUpdateHandler	TokenNameIdentifier	 Bridge Update Handler
{	TokenNameLBRACE	
/** * Invoked when an MutationEvent of type 'DOMAttrModified' is fired. */	TokenNameCOMMENT_JAVADOC	 Invoked when an MutationEvent of type 'DOMAttrModified' is fired. 
void	TokenNamevoid	
handleDOMAttrModifiedEvent	TokenNameIdentifier	 handle DOM Attr Modified Event
(	TokenNameLPAREN	
MutationEvent	TokenNameIdentifier	 Mutation Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Invoked when an MutationEvent of type 'DOMNodeInserted' is fired. */	TokenNameCOMMENT_JAVADOC	 Invoked when an MutationEvent of type 'DOMNodeInserted' is fired. 
void	TokenNamevoid	
handleDOMNodeInsertedEvent	TokenNameIdentifier	 handle DOM Node Inserted Event
(	TokenNameLPAREN	
MutationEvent	TokenNameIdentifier	 Mutation Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Invoked when an MutationEvent of type 'DOMNodeRemoved' is fired. */	TokenNameCOMMENT_JAVADOC	 Invoked when an MutationEvent of type 'DOMNodeRemoved' is fired. 
void	TokenNamevoid	
handleDOMNodeRemovedEvent	TokenNameIdentifier	 handle DOM Node Removed Event
(	TokenNameLPAREN	
MutationEvent	TokenNameIdentifier	 Mutation Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Invoked when an MutationEvent of type 'DOMCharacterDataModified' * is fired. */	TokenNameCOMMENT_JAVADOC	 Invoked when an MutationEvent of type 'DOMCharacterDataModified' is fired. 
void	TokenNamevoid	
handleDOMCharacterDataModified	TokenNameIdentifier	 handle DOM Character Data Modified
(	TokenNameLPAREN	
MutationEvent	TokenNameIdentifier	 Mutation Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Invoked when an CSSEngineEvent is fired. */	TokenNameCOMMENT_JAVADOC	 Invoked when an CSSEngineEvent is fired. 
void	TokenNamevoid	
handleCSSEngineEvent	TokenNameIdentifier	 handle CSS Engine Event
(	TokenNameLPAREN	
CSSEngineEvent	TokenNameIdentifier	 CSS Engine Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Invoked when the animated value of an animated attribute has changed. */	TokenNameCOMMENT_JAVADOC	 Invoked when the animated value of an animated attribute has changed. 
void	TokenNamevoid	
handleAnimatedAttributeChanged	TokenNameIdentifier	 handle Animated Attribute Changed
(	TokenNameLPAREN	
AnimatedLiveAttributeValue	TokenNameIdentifier	 Animated Live Attribute Value
alav	TokenNameIdentifier	 alav
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Invoked when an 'other' animation value has changed. */	TokenNameCOMMENT_JAVADOC	 Invoked when an 'other' animation value has changed. 
void	TokenNamevoid	
handleOtherAnimationChanged	TokenNameIdentifier	 handle Other Animation Changed
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Disposes this BridgeUpdateHandler and releases all resources. */	TokenNameCOMMENT_JAVADOC	 Disposes this BridgeUpdateHandler and releases all resources. 
void	TokenNamevoid	
dispose	TokenNameIdentifier	 dispose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
