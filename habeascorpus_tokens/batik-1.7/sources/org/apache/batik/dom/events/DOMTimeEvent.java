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
events	TokenNameIdentifier	 events
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
views	TokenNameIdentifier	 views
.	TokenNameDOT	
AbstractView	TokenNameIdentifier	 Abstract View
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
/** * An event class for SMIL timing events. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: DOMTimeEvent.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 An event class for SMIL timing events. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: DOMTimeEvent.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
DOMTimeEvent	TokenNameIdentifier	 DOM Time Event
extends	TokenNameextends	
AbstractEvent	TokenNameIdentifier	 Abstract Event
implements	TokenNameimplements	
TimeEvent	TokenNameIdentifier	 Time Event
{	TokenNameLBRACE	
/** * The view from which the event was generated. */	TokenNameCOMMENT_JAVADOC	 The view from which the event was generated. 
protected	TokenNameprotected	
AbstractView	TokenNameIdentifier	 Abstract View
view	TokenNameIdentifier	 view
;	TokenNameSEMICOLON	
/** * For repeat events this is the repeat iteration. Unused for the * other time events. */	TokenNameCOMMENT_JAVADOC	 For repeat events this is the repeat iteration. Unused for the other time events. 
protected	TokenNameprotected	
int	TokenNameint	
detail	TokenNameIdentifier	 detail
;	TokenNameSEMICOLON	
/** * Returns the view from which the event was generated. */	TokenNameCOMMENT_JAVADOC	 Returns the view from which the event was generated. 
public	TokenNamepublic	
AbstractView	TokenNameIdentifier	 Abstract View
getView	TokenNameIdentifier	 get View
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
view	TokenNameIdentifier	 view
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the repeat iteration if this is a repeat event. */	TokenNameCOMMENT_JAVADOC	 Returns the repeat iteration if this is a repeat event. 
public	TokenNamepublic	
int	TokenNameint	
getDetail	TokenNameIdentifier	 get Detail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
detail	TokenNameIdentifier	 detail
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes the values of the TimeEvent object. */	TokenNameCOMMENT_JAVADOC	 Initializes the values of the TimeEvent object. 
public	TokenNamepublic	
void	TokenNamevoid	
initTimeEvent	TokenNameIdentifier	 init Time Event
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
typeArg	TokenNameIdentifier	 type Arg
,	TokenNameCOMMA	
AbstractView	TokenNameIdentifier	 Abstract View
viewArg	TokenNameIdentifier	 view Arg
,	TokenNameCOMMA	
int	TokenNameint	
detailArg	TokenNameIdentifier	 detail Arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initEvent	TokenNameIdentifier	 init Event
(	TokenNameLPAREN	
typeArg	TokenNameIdentifier	 type Arg
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
view	TokenNameIdentifier	 view
=	TokenNameEQUAL	
viewArg	TokenNameIdentifier	 view Arg
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
detail	TokenNameIdentifier	 detail
=	TokenNameEQUAL	
detailArg	TokenNameIdentifier	 detail Arg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes the values of the TimeEvent object. */	TokenNameCOMMENT_JAVADOC	 Initializes the values of the TimeEvent object. 
public	TokenNamepublic	
void	TokenNamevoid	
initTimeEventNS	TokenNameIdentifier	 init Time Event NS
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURIArg	TokenNameIdentifier	 namespace URI Arg
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
typeArg	TokenNameIdentifier	 type Arg
,	TokenNameCOMMA	
AbstractView	TokenNameIdentifier	 Abstract View
viewArg	TokenNameIdentifier	 view Arg
,	TokenNameCOMMA	
int	TokenNameint	
detailArg	TokenNameIdentifier	 detail Arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initEventNS	TokenNameIdentifier	 init Event NS
(	TokenNameLPAREN	
namespaceURIArg	TokenNameIdentifier	 namespace URI Arg
,	TokenNameCOMMA	
typeArg	TokenNameIdentifier	 type Arg
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
view	TokenNameIdentifier	 view
=	TokenNameEQUAL	
viewArg	TokenNameIdentifier	 view Arg
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
detail	TokenNameIdentifier	 detail
=	TokenNameEQUAL	
detailArg	TokenNameIdentifier	 detail Arg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the timestamp of this time event. This is required for * synchronization of time events in the SMIL timing model. */	TokenNameCOMMENT_JAVADOC	 Sets the timestamp of this time event. This is required for synchronization of time events in the SMIL timing model. 
public	TokenNamepublic	
void	TokenNamevoid	
setTimestamp	TokenNameIdentifier	 set Timestamp
(	TokenNameLPAREN	
long	TokenNamelong	
timeStamp	TokenNameIdentifier	 time Stamp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
timeStamp	TokenNameIdentifier	 time Stamp
=	TokenNameEQUAL	
timeStamp	TokenNameIdentifier	 time Stamp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
