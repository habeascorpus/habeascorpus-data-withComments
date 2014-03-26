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
events	TokenNameIdentifier	 events
.	TokenNameDOT	
CustomEvent	TokenNameIdentifier	 Custom Event
;	TokenNameSEMICOLON	
/** * A custom event object. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: DOMCustomEvent.java 478769 2006-11-24 04:50:12Z cam $ */	TokenNameCOMMENT_JAVADOC	 A custom event object. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: DOMCustomEvent.java 478769 2006-11-24 04:50:12Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
DOMCustomEvent	TokenNameIdentifier	 DOM Custom Event
extends	TokenNameextends	
DOMEvent	TokenNameIdentifier	 DOM Event
implements	TokenNameimplements	
CustomEvent	TokenNameIdentifier	 Custom Event
{	TokenNameLBRACE	
/** * The custom detail associated with this event. */	TokenNameCOMMENT_JAVADOC	 The custom detail associated with this event. 
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
detail	TokenNameIdentifier	 detail
;	TokenNameSEMICOLON	
/** * Returns the custom detail of this event. */	TokenNameCOMMENT_JAVADOC	 Returns the custom detail of this event. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getDetail	TokenNameIdentifier	 get Detail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
detail	TokenNameIdentifier	 detail
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes this custom event. */	TokenNameCOMMENT_JAVADOC	 Initializes this custom event. 
public	TokenNamepublic	
void	TokenNamevoid	
initCustomEventNS	TokenNameIdentifier	 init Custom Event NS
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURIArg	TokenNameIdentifier	 namespace URI Arg
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
typeArg	TokenNameIdentifier	 type Arg
,	TokenNameCOMMA	
boolean	TokenNameboolean	
canBubbleArg	TokenNameIdentifier	 can Bubble Arg
,	TokenNameCOMMA	
boolean	TokenNameboolean	
cancelableArg	TokenNameIdentifier	 cancelable Arg
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
detailArg	TokenNameIdentifier	 detail Arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initEventNS	TokenNameIdentifier	 init Event NS
(	TokenNameLPAREN	
namespaceURIArg	TokenNameIdentifier	 namespace URI Arg
,	TokenNameCOMMA	
typeArg	TokenNameIdentifier	 type Arg
,	TokenNameCOMMA	
canBubbleArg	TokenNameIdentifier	 can Bubble Arg
,	TokenNameCOMMA	
cancelableArg	TokenNameIdentifier	 cancelable Arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
detail	TokenNameIdentifier	 detail
=	TokenNameEQUAL	
detailArg	TokenNameIdentifier	 detail Arg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
