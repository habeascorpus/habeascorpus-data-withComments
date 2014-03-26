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
TextEvent	TokenNameIdentifier	 Text Event
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
/** * Class to implement DOM 3 Text events. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: DOMTextEvent.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Class to implement DOM 3 Text events. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: DOMTextEvent.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
DOMTextEvent	TokenNameIdentifier	 DOM Text Event
extends	TokenNameextends	
DOMUIEvent	TokenNameIdentifier	 DOMUI Event
implements	TokenNameimplements	
TextEvent	TokenNameIdentifier	 Text Event
{	TokenNameLBRACE	
/** * The text data. */	TokenNameCOMMENT_JAVADOC	 The text data. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
/** * Returns the text data. */	TokenNameCOMMENT_JAVADOC	 Returns the text data. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Initializes this TextEvent. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Initializes this TextEvent. 
public	TokenNamepublic	
void	TokenNamevoid	
initTextEvent	TokenNameIdentifier	 init Text Event
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
typeArg	TokenNameIdentifier	 type Arg
,	TokenNameCOMMA	
boolean	TokenNameboolean	
canBubbleArg	TokenNameIdentifier	 can Bubble Arg
,	TokenNameCOMMA	
boolean	TokenNameboolean	
cancelableArg	TokenNameIdentifier	 cancelable Arg
,	TokenNameCOMMA	
AbstractView	TokenNameIdentifier	 Abstract View
viewArg	TokenNameIdentifier	 view Arg
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
dataArg	TokenNameIdentifier	 data Arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initUIEvent	TokenNameIdentifier	 init UI Event
(	TokenNameLPAREN	
typeArg	TokenNameIdentifier	 type Arg
,	TokenNameCOMMA	
canBubbleArg	TokenNameIdentifier	 can Bubble Arg
,	TokenNameCOMMA	
cancelableArg	TokenNameIdentifier	 cancelable Arg
,	TokenNameCOMMA	
viewArg	TokenNameIdentifier	 view Arg
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
dataArg	TokenNameIdentifier	 data Arg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Initializes this TextEvent. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Initializes this TextEvent. 
public	TokenNamepublic	
void	TokenNamevoid	
initTextEventNS	TokenNameIdentifier	 init Text Event NS
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
AbstractView	TokenNameIdentifier	 Abstract View
viewArg	TokenNameIdentifier	 view Arg
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
dataArg	TokenNameIdentifier	 data Arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initUIEventNS	TokenNameIdentifier	 init UI Event NS
(	TokenNameLPAREN	
namespaceURIArg	TokenNameIdentifier	 namespace URI Arg
,	TokenNameCOMMA	
typeArg	TokenNameIdentifier	 type Arg
,	TokenNameCOMMA	
canBubbleArg	TokenNameIdentifier	 can Bubble Arg
,	TokenNameCOMMA	
cancelableArg	TokenNameIdentifier	 cancelable Arg
,	TokenNameCOMMA	
viewArg	TokenNameIdentifier	 view Arg
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
dataArg	TokenNameIdentifier	 data Arg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
