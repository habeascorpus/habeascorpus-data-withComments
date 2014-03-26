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
/** * A class to handle the 'indefinite' SMIL timing specifier. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: IndefiniteTimingSpecifier.java 580338 2007-09-28 13:13:46Z cam $ */	TokenNameCOMMENT_JAVADOC	 A class to handle the 'indefinite' SMIL timing specifier. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: IndefiniteTimingSpecifier.java 580338 2007-09-28 13:13:46Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
IndefiniteTimingSpecifier	TokenNameIdentifier	 Indefinite Timing Specifier
extends	TokenNameextends	
TimingSpecifier	TokenNameIdentifier	 Timing Specifier
{	TokenNameLBRACE	
/** * Creates a new IndefiniteTimingSpecifier object. */	TokenNameCOMMENT_JAVADOC	 Creates a new IndefiniteTimingSpecifier object. 
public	TokenNamepublic	
IndefiniteTimingSpecifier	TokenNameIdentifier	 Indefinite Timing Specifier
(	TokenNameLPAREN	
TimedElement	TokenNameIdentifier	 Timed Element
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isBegin	TokenNameIdentifier	 is Begin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
isBegin	TokenNameIdentifier	 is Begin
)	TokenNameRPAREN	
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
"indefinite"	TokenNameStringLiteral	indefinite
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes this timing specifier by adding the initial instance time * to the owner's instance time list or setting up any event listeners. */	TokenNameCOMMENT_JAVADOC	 Initializes this timing specifier by adding the initial instance time to the owner's instance time list or setting up any event listeners. 
public	TokenNamepublic	
void	TokenNamevoid	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isBegin	TokenNameIdentifier	 is Begin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Only end instance lists get an 'indefinite' instance time from 	TokenNameCOMMENT_LINE	Only end instance lists get an 'indefinite' instance time from 
// an indefinite timing specifier. 	TokenNameCOMMENT_LINE	an indefinite timing specifier. 
InstanceTime	TokenNameIdentifier	 Instance Time
instance	TokenNameIdentifier	 instance
=	TokenNameEQUAL	
new	TokenNamenew	
InstanceTime	TokenNameIdentifier	 Instance Time
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
TimedElement	TokenNameIdentifier	 Timed Element
.	TokenNameDOT	
INDEFINITE	TokenNameIdentifier	 INDEFINITE
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
