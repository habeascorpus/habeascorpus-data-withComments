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
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
AnimationTargetListener	TokenNameIdentifier	 Animation Target Listener
;	TokenNameSEMICOLON	
/** * Context interface for elements that can be the target of animations. * This exposes the ability to attach {@link AnimationTargetListener}s * to the element. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: SVGAnimationTargetContext.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Context interface for elements that can be the target of animations. This exposes the ability to attach {@link AnimationTargetListener}s to the element. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: SVGAnimationTargetContext.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
SVGAnimationTargetContext	TokenNameIdentifier	 SVG Animation Target Context
extends	TokenNameextends	
SVGContext	TokenNameIdentifier	 SVG Context
{	TokenNameLBRACE	
/** * Adds a listener for changes to the given CSS property. */	TokenNameCOMMENT_JAVADOC	 Adds a listener for changes to the given CSS property. 
void	TokenNamevoid	
addTargetListener	TokenNameIdentifier	 add Target Listener
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pn	TokenNameIdentifier	 pn
,	TokenNameCOMMA	
AnimationTargetListener	TokenNameIdentifier	 Animation Target Listener
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Removes a listener for changes to the given attribute value. */	TokenNameCOMMENT_JAVADOC	 Removes a listener for changes to the given attribute value. 
void	TokenNamevoid	
removeTargetListener	TokenNameIdentifier	 remove Target Listener
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pn	TokenNameIdentifier	 pn
,	TokenNameCOMMA	
AnimationTargetListener	TokenNameIdentifier	 Animation Target Listener
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
