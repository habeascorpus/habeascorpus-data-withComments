/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
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
UIEvent	TokenNameIdentifier	 UI Event
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
/** * An implementation of the DOM Level 2 <code>UIEvent</code> interface. * * @xerces.internal * * @version $Id: UIEventImpl.java 533574 2007-04-30 00:29:47Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 An implementation of the DOM Level 2 <code>UIEvent</code> interface. * @xerces.internal * @version $Id: UIEventImpl.java 533574 2007-04-30 00:29:47Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
UIEventImpl	TokenNameIdentifier	 UI Event Impl
extends	TokenNameextends	
EventImpl	TokenNameIdentifier	 Event Impl
implements	TokenNameimplements	
UIEvent	TokenNameIdentifier	 UI Event
{	TokenNameLBRACE	
private	TokenNameprivate	
AbstractView	TokenNameIdentifier	 Abstract View
fView	TokenNameIdentifier	 f View
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
fDetail	TokenNameIdentifier	 f Detail
;	TokenNameSEMICOLON	
public	TokenNamepublic	
AbstractView	TokenNameIdentifier	 Abstract View
getView	TokenNameIdentifier	 get View
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fView	TokenNameIdentifier	 f View
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getDetail	TokenNameIdentifier	 get Detail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fDetail	TokenNameIdentifier	 f Detail
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
initUIEvent	TokenNameIdentifier	 init UI Event
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
int	TokenNameint	
detailArg	TokenNameIdentifier	 detail Arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fView	TokenNameIdentifier	 f View
=	TokenNameEQUAL	
viewArg	TokenNameIdentifier	 view Arg
;	TokenNameSEMICOLON	
fDetail	TokenNameIdentifier	 f Detail
=	TokenNameEQUAL	
detailArg	TokenNameIdentifier	 detail Arg
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
initEvent	TokenNameIdentifier	 init Event
(	TokenNameLPAREN	
typeArg	TokenNameIdentifier	 type Arg
,	TokenNameCOMMA	
canBubbleArg	TokenNameIdentifier	 can Bubble Arg
,	TokenNameCOMMA	
cancelableArg	TokenNameIdentifier	 cancelable Arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
