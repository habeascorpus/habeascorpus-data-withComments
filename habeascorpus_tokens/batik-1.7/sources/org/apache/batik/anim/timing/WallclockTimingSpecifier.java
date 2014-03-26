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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Calendar	TokenNameIdentifier	 Calendar
;	TokenNameSEMICOLON	
/** * A class to handle wallclock SMIL timing specifiers. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: WallclockTimingSpecifier.java 580338 2007-09-28 13:13:46Z cam $ */	TokenNameCOMMENT_JAVADOC	 A class to handle wallclock SMIL timing specifiers. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: WallclockTimingSpecifier.java 580338 2007-09-28 13:13:46Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
WallclockTimingSpecifier	TokenNameIdentifier	 Wallclock Timing Specifier
extends	TokenNameextends	
TimingSpecifier	TokenNameIdentifier	 Timing Specifier
{	TokenNameLBRACE	
/** * The wallclock time. */	TokenNameCOMMENT_JAVADOC	 The wallclock time. 
protected	TokenNameprotected	
Calendar	TokenNameIdentifier	 Calendar
time	TokenNameIdentifier	 time
;	TokenNameSEMICOLON	
/** * The instance time. */	TokenNameCOMMENT_JAVADOC	 The instance time. 
protected	TokenNameprotected	
InstanceTime	TokenNameIdentifier	 Instance Time
instance	TokenNameIdentifier	 instance
;	TokenNameSEMICOLON	
/** * Creates a new WallclockTimingSpecifier object. */	TokenNameCOMMENT_JAVADOC	 Creates a new WallclockTimingSpecifier object. 
public	TokenNamepublic	
WallclockTimingSpecifier	TokenNameIdentifier	 Wallclock Timing Specifier
(	TokenNameLPAREN	
TimedElement	TokenNameIdentifier	 Timed Element
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isBegin	TokenNameIdentifier	 is Begin
,	TokenNameCOMMA	
Calendar	TokenNameIdentifier	 Calendar
time	TokenNameIdentifier	 time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
isBegin	TokenNameIdentifier	 is Begin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
time	TokenNameIdentifier	 time
=	TokenNameEQUAL	
time	TokenNameIdentifier	 time
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
"wallclock("	TokenNameStringLiteral	wallclock(
+	TokenNamePLUS	
time	TokenNameIdentifier	 time
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes this timing specifier by adding the initial instance time * to the owner's instance time list or setting up any event listeners. */	TokenNameCOMMENT_JAVADOC	 Initializes this timing specifier by adding the initial instance time to the owner's instance time list or setting up any event listeners. 
public	TokenNamepublic	
void	TokenNamevoid	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
convertWallclockTime	TokenNameIdentifier	 convert Wallclock Time
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
instance	TokenNameIdentifier	 instance
=	TokenNameEQUAL	
new	TokenNamenew	
InstanceTime	TokenNameIdentifier	 Instance Time
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
addInstanceTime	TokenNameIdentifier	 add Instance Time
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
isBegin	TokenNameIdentifier	 is Begin
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
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
