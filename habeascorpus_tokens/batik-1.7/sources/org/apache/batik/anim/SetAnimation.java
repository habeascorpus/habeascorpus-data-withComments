/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
anim	TokenNameIdentifier	 anim
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
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
timing	TokenNameIdentifier	 timing
.	TokenNameDOT	
TimedElement	TokenNameIdentifier	 Timed Element
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
AnimatableElement	TokenNameIdentifier	 Animatable Element
;	TokenNameSEMICOLON	
/** * An animation class for 'set' animations. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: SetAnimation.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 An animation class for 'set' animations. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: SetAnimation.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SetAnimation	TokenNameIdentifier	 Set Animation
extends	TokenNameextends	
AbstractAnimation	TokenNameIdentifier	 Abstract Animation
{	TokenNameLBRACE	
/** * The set animation value. */	TokenNameCOMMENT_JAVADOC	 The set animation value. 
protected	TokenNameprotected	
AnimatableValue	TokenNameIdentifier	 Animatable Value
to	TokenNameIdentifier	 to
;	TokenNameSEMICOLON	
/** * Creates a new SetAnimation. */	TokenNameCOMMENT_JAVADOC	 Creates a new SetAnimation. 
public	TokenNamepublic	
SetAnimation	TokenNameIdentifier	 Set Animation
(	TokenNameLPAREN	
TimedElement	TokenNameIdentifier	 Timed Element
timedElement	TokenNameIdentifier	 timed Element
,	TokenNameCOMMA	
AnimatableElement	TokenNameIdentifier	 Animatable Element
animatableElement	TokenNameIdentifier	 animatable Element
,	TokenNameCOMMA	
AnimatableValue	TokenNameIdentifier	 Animatable Value
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
timedElement	TokenNameIdentifier	 timed Element
,	TokenNameCOMMA	
animatableElement	TokenNameIdentifier	 animatable Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
to	TokenNameIdentifier	 to
=	TokenNameEQUAL	
to	TokenNameIdentifier	 to
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called when the element is sampled at the given time. */	TokenNameCOMMENT_JAVADOC	 Called when the element is sampled at the given time. 
protected	TokenNameprotected	
void	TokenNamevoid	
sampledAt	TokenNameIdentifier	 sampled At
(	TokenNameLPAREN	
float	TokenNamefloat	
simpleTime	TokenNameIdentifier	 simple Time
,	TokenNameCOMMA	
float	TokenNamefloat	
simpleDur	TokenNameIdentifier	 simple Dur
,	TokenNameCOMMA	
int	TokenNameint	
repeatIteration	TokenNameIdentifier	 repeat Iteration
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
to	TokenNameIdentifier	 to
;	TokenNameSEMICOLON	
markDirty	TokenNameIdentifier	 mark Dirty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Called when the element is sampled for its "last" value. */	TokenNameCOMMENT_JAVADOC	 Called when the element is sampled for its "last" value. 
protected	TokenNameprotected	
void	TokenNamevoid	
sampledLastValue	TokenNameIdentifier	 sampled Last Value
(	TokenNameLPAREN	
int	TokenNameint	
repeatIteration	TokenNameIdentifier	 repeat Iteration
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
to	TokenNameIdentifier	 to
;	TokenNameSEMICOLON	
markDirty	TokenNameIdentifier	 mark Dirty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
