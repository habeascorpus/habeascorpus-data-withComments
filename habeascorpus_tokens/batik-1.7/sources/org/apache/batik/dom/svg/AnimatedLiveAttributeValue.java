/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
AnimatableValue	TokenNameIdentifier	 Animatable Value
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
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
AnimationTarget	TokenNameIdentifier	 Animation Target
;	TokenNameSEMICOLON	
/** * An interface for {@link LiveAttributeValue}s that have an animated value * component. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: AnimatedLiveAttributeValue.java 489964 2006-12-24 01:30:23Z cam $ */	TokenNameCOMMENT_JAVADOC	 An interface for {@link LiveAttributeValue}s that have an animated value component. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: AnimatedLiveAttributeValue.java 489964 2006-12-24 01:30:23Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
AnimatedLiveAttributeValue	TokenNameIdentifier	 Animated Live Attribute Value
extends	TokenNameextends	
LiveAttributeValue	TokenNameIdentifier	 Live Attribute Value
{	TokenNameLBRACE	
/** * Returns the namespace URI of this animated live attribute. */	TokenNameCOMMENT_JAVADOC	 Returns the namespace URI of this animated live attribute. 
String	TokenNameIdentifier	 String
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the local name of this animated live attribute. */	TokenNameCOMMENT_JAVADOC	 Returns the local name of this animated live attribute. 
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the base value of the attribute as an {@link AnimatableValue}. */	TokenNameCOMMENT_JAVADOC	 Returns the base value of the attribute as an {@link AnimatableValue}. 
AnimatableValue	TokenNameIdentifier	 Animatable Value
getUnderlyingValue	TokenNameIdentifier	 get Underlying Value
(	TokenNameLPAREN	
AnimationTarget	TokenNameIdentifier	 Animation Target
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Adds a listener for changes to the animated value. */	TokenNameCOMMENT_JAVADOC	 Adds a listener for changes to the animated value. 
void	TokenNamevoid	
addAnimatedAttributeListener	TokenNameIdentifier	 add Animated Attribute Listener
(	TokenNameLPAREN	
AnimatedAttributeListener	TokenNameIdentifier	 Animated Attribute Listener
aal	TokenNameIdentifier	 aal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Removes a listener for changes to the animated value. */	TokenNameCOMMENT_JAVADOC	 Removes a listener for changes to the animated value. 
void	TokenNamevoid	
removeAnimatedAttributeListener	TokenNameIdentifier	 remove Animated Attribute Listener
(	TokenNameLPAREN	
AnimatedAttributeListener	TokenNameIdentifier	 Animated Attribute Listener
aal	TokenNameIdentifier	 aal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
