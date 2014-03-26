/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
timing	TokenNameIdentifier	 timing
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
Event	TokenNameIdentifier	 Event
;	TokenNameSEMICOLON	
/** * Abstract class from which all event-like timing specifier classes derive. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: EventLikeTimingSpecifier.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Abstract class from which all event-like timing specifier classes derive. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: EventLikeTimingSpecifier.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
EventLikeTimingSpecifier	TokenNameIdentifier	 Event Like Timing Specifier
extends	TokenNameextends	
OffsetTimingSpecifier	TokenNameIdentifier	 Offset Timing Specifier
{	TokenNameLBRACE	
/** * Creates a new EventLikeTimingSpecifier object. */	TokenNameCOMMENT_JAVADOC	 Creates a new EventLikeTimingSpecifier object. 
public	TokenNamepublic	
EventLikeTimingSpecifier	TokenNameIdentifier	 Event Like Timing Specifier
(	TokenNameLPAREN	
TimedElement	TokenNameIdentifier	 Timed Element
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isBegin	TokenNameIdentifier	 is Begin
,	TokenNameCOMMA	
float	TokenNamefloat	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
isBegin	TokenNameIdentifier	 is Begin
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether this timing specifier is event-like (i.e., if it is * an eventbase, accesskey or a repeat timing specifier). */	TokenNameCOMMENT_JAVADOC	 Returns whether this timing specifier is event-like (i.e., if it is an eventbase, accesskey or a repeat timing specifier). 
public	TokenNamepublic	
boolean	TokenNameboolean	
isEventCondition	TokenNameIdentifier	 is Event Condition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invoked to resolve an event-like timing specifier into an instance time. */	TokenNameCOMMENT_JAVADOC	 Invoked to resolve an event-like timing specifier into an instance time. 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
Event	TokenNameIdentifier	 Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
