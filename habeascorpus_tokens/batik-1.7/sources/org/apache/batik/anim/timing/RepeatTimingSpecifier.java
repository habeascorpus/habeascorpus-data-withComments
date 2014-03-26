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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
smil	TokenNameIdentifier	 smil
.	TokenNameDOT	
TimeEvent	TokenNameIdentifier	 Time Event
;	TokenNameSEMICOLON	
/** * A class to handle repeat event SMIL timing specifiers. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: RepeatTimingSpecifier.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 A class to handle repeat event SMIL timing specifiers. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: RepeatTimingSpecifier.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
RepeatTimingSpecifier	TokenNameIdentifier	 Repeat Timing Specifier
extends	TokenNameextends	
EventbaseTimingSpecifier	TokenNameIdentifier	 Eventbase Timing Specifier
{	TokenNameLBRACE	
/** * The repeat iteration. */	TokenNameCOMMENT_JAVADOC	 The repeat iteration. 
protected	TokenNameprotected	
int	TokenNameint	
repeatIteration	TokenNameIdentifier	 repeat Iteration
;	TokenNameSEMICOLON	
/** * Whether a repeat iteration was specified. */	TokenNameCOMMENT_JAVADOC	 Whether a repeat iteration was specified. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
repeatIterationSpecified	TokenNameIdentifier	 repeat Iteration Specified
;	TokenNameSEMICOLON	
/** * Creates a new RepeatTimingSpecifier object without a repeat iteration. */	TokenNameCOMMENT_JAVADOC	 Creates a new RepeatTimingSpecifier object without a repeat iteration. 
public	TokenNamepublic	
RepeatTimingSpecifier	TokenNameIdentifier	 Repeat Timing Specifier
(	TokenNameLPAREN	
TimedElement	TokenNameIdentifier	 Timed Element
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isBegin	TokenNameIdentifier	 is Begin
,	TokenNameCOMMA	
float	TokenNamefloat	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
syncbaseID	TokenNameIdentifier	 syncbase ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
isBegin	TokenNameIdentifier	 is Begin
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
syncbaseID	TokenNameIdentifier	 syncbase ID
,	TokenNameCOMMA	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getRepeatEventName	TokenNameIdentifier	 get Repeat Event Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new RepeatTimingSpecifier object with a repeat iteration. */	TokenNameCOMMENT_JAVADOC	 Creates a new RepeatTimingSpecifier object with a repeat iteration. 
public	TokenNamepublic	
RepeatTimingSpecifier	TokenNameIdentifier	 Repeat Timing Specifier
(	TokenNameLPAREN	
TimedElement	TokenNameIdentifier	 Timed Element
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isBegin	TokenNameIdentifier	 is Begin
,	TokenNameCOMMA	
float	TokenNamefloat	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
syncbaseID	TokenNameIdentifier	 syncbase ID
,	TokenNameCOMMA	
int	TokenNameint	
repeatIteration	TokenNameIdentifier	 repeat Iteration
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
isBegin	TokenNameIdentifier	 is Begin
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
syncbaseID	TokenNameIdentifier	 syncbase ID
,	TokenNameCOMMA	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getRepeatEventName	TokenNameIdentifier	 get Repeat Event Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
repeatIteration	TokenNameIdentifier	 repeat Iteration
=	TokenNameEQUAL	
repeatIteration	TokenNameIdentifier	 repeat Iteration
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
repeatIterationSpecified	TokenNameIdentifier	 repeat Iteration Specified
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a string representation of this timing specifier. */	TokenNameCOMMENT_JAVADOC	 Returns a string representation of this timing specifier. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
eventbaseID	TokenNameIdentifier	 eventbase ID
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
eventbaseID	TokenNameIdentifier	 eventbase ID
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
+	TokenNamePLUS	
"repeat"	TokenNameStringLiteral	repeat
+	TokenNamePLUS	
(	TokenNameLPAREN	
repeatIterationSpecified	TokenNameIdentifier	 repeat Iteration Specified
?	TokenNameQUESTION	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
repeatIteration	TokenNameIdentifier	 repeat Iteration
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
super	TokenNamesuper	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// EventListener ///////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	EventListener ///////////////////////////////////////////////////////// 
/** * Handles an event fired on the eventbase element. */	TokenNameCOMMENT_JAVADOC	 Handles an event fired on the eventbase element. 
public	TokenNamepublic	
void	TokenNamevoid	
handleEvent	TokenNameIdentifier	 handle Event
(	TokenNameLPAREN	
Event	TokenNameIdentifier	 Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TimeEvent	TokenNameIdentifier	 Time Event
evt	TokenNameIdentifier	 evt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TimeEvent	TokenNameIdentifier	 Time Event
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
repeatIterationSpecified	TokenNameIdentifier	 repeat Iteration Specified
||	TokenNameOR_OR	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
getDetail	TokenNameIdentifier	 get Detail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
repeatIteration	TokenNameIdentifier	 repeat Iteration
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
handleEvent	TokenNameIdentifier	 handle Event
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
