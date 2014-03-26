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
EventTarget	TokenNameIdentifier	 Event Target
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
MouseEvent	TokenNameIdentifier	 Mouse Event
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
/** * An implementation of the DOM Level 2 <code>MouseEvent</code> interface. * * @xerces.internal * * @version $Id: MouseEventImpl.java 533574 2007-04-30 00:29:47Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 An implementation of the DOM Level 2 <code>MouseEvent</code> interface. * @xerces.internal * @version $Id: MouseEventImpl.java 533574 2007-04-30 00:29:47Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
MouseEventImpl	TokenNameIdentifier	 Mouse Event Impl
extends	TokenNameextends	
UIEventImpl	TokenNameIdentifier	 UI Event Impl
implements	TokenNameimplements	
MouseEvent	TokenNameIdentifier	 Mouse Event
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
fScreenX	TokenNameIdentifier	 f Screen X
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
fScreenY	TokenNameIdentifier	 f Screen Y
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
fClientX	TokenNameIdentifier	 f Client X
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
fClientY	TokenNameIdentifier	 f Client Y
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
fCtrlKey	TokenNameIdentifier	 f Ctrl Key
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
fAltKey	TokenNameIdentifier	 f Alt Key
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
fShiftKey	TokenNameIdentifier	 f Shift Key
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
fMetaKey	TokenNameIdentifier	 f Meta Key
;	TokenNameSEMICOLON	
private	TokenNameprivate	
short	TokenNameshort	
fButton	TokenNameIdentifier	 f Button
;	TokenNameSEMICOLON	
private	TokenNameprivate	
EventTarget	TokenNameIdentifier	 Event Target
fRelatedTarget	TokenNameIdentifier	 f Related Target
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
getScreenX	TokenNameIdentifier	 get Screen X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fScreenX	TokenNameIdentifier	 f Screen X
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getScreenY	TokenNameIdentifier	 get Screen Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fScreenY	TokenNameIdentifier	 f Screen Y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getClientX	TokenNameIdentifier	 get Client X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fClientX	TokenNameIdentifier	 f Client X
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getClientY	TokenNameIdentifier	 get Client Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fClientY	TokenNameIdentifier	 f Client Y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
getCtrlKey	TokenNameIdentifier	 get Ctrl Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fCtrlKey	TokenNameIdentifier	 f Ctrl Key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
getAltKey	TokenNameIdentifier	 get Alt Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fAltKey	TokenNameIdentifier	 f Alt Key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
getShiftKey	TokenNameIdentifier	 get Shift Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fShiftKey	TokenNameIdentifier	 f Shift Key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
getMetaKey	TokenNameIdentifier	 get Meta Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fMetaKey	TokenNameIdentifier	 f Meta Key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
getButton	TokenNameIdentifier	 get Button
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fButton	TokenNameIdentifier	 f Button
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
EventTarget	TokenNameIdentifier	 Event Target
getRelatedTarget	TokenNameIdentifier	 get Related Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fRelatedTarget	TokenNameIdentifier	 f Related Target
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
initMouseEvent	TokenNameIdentifier	 init Mouse Event
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
,	TokenNameCOMMA	
int	TokenNameint	
screenXArg	TokenNameIdentifier	 screen X Arg
,	TokenNameCOMMA	
int	TokenNameint	
screenYArg	TokenNameIdentifier	 screen Y Arg
,	TokenNameCOMMA	
int	TokenNameint	
clientXArg	TokenNameIdentifier	 client X Arg
,	TokenNameCOMMA	
int	TokenNameint	
clientYArg	TokenNameIdentifier	 client Y Arg
,	TokenNameCOMMA	
boolean	TokenNameboolean	
ctrlKeyArg	TokenNameIdentifier	 ctrl Key Arg
,	TokenNameCOMMA	
boolean	TokenNameboolean	
altKeyArg	TokenNameIdentifier	 alt Key Arg
,	TokenNameCOMMA	
boolean	TokenNameboolean	
shiftKeyArg	TokenNameIdentifier	 shift Key Arg
,	TokenNameCOMMA	
boolean	TokenNameboolean	
metaKeyArg	TokenNameIdentifier	 meta Key Arg
,	TokenNameCOMMA	
short	TokenNameshort	
buttonArg	TokenNameIdentifier	 button Arg
,	TokenNameCOMMA	
EventTarget	TokenNameIdentifier	 Event Target
relatedTargetArg	TokenNameIdentifier	 related Target Arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fScreenX	TokenNameIdentifier	 f Screen X
=	TokenNameEQUAL	
screenXArg	TokenNameIdentifier	 screen X Arg
;	TokenNameSEMICOLON	
fScreenY	TokenNameIdentifier	 f Screen Y
=	TokenNameEQUAL	
screenYArg	TokenNameIdentifier	 screen Y Arg
;	TokenNameSEMICOLON	
fClientX	TokenNameIdentifier	 f Client X
=	TokenNameEQUAL	
clientXArg	TokenNameIdentifier	 client X Arg
;	TokenNameSEMICOLON	
fClientY	TokenNameIdentifier	 f Client Y
=	TokenNameEQUAL	
clientYArg	TokenNameIdentifier	 client Y Arg
;	TokenNameSEMICOLON	
fCtrlKey	TokenNameIdentifier	 f Ctrl Key
=	TokenNameEQUAL	
ctrlKeyArg	TokenNameIdentifier	 ctrl Key Arg
;	TokenNameSEMICOLON	
fAltKey	TokenNameIdentifier	 f Alt Key
=	TokenNameEQUAL	
altKeyArg	TokenNameIdentifier	 alt Key Arg
;	TokenNameSEMICOLON	
fShiftKey	TokenNameIdentifier	 f Shift Key
=	TokenNameEQUAL	
shiftKeyArg	TokenNameIdentifier	 shift Key Arg
;	TokenNameSEMICOLON	
fMetaKey	TokenNameIdentifier	 f Meta Key
=	TokenNameEQUAL	
metaKeyArg	TokenNameIdentifier	 meta Key Arg
;	TokenNameSEMICOLON	
fButton	TokenNameIdentifier	 f Button
=	TokenNameEQUAL	
buttonArg	TokenNameIdentifier	 button Arg
;	TokenNameSEMICOLON	
fRelatedTarget	TokenNameIdentifier	 f Related Target
=	TokenNameEQUAL	
relatedTargetArg	TokenNameIdentifier	 related Target Arg
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
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
detailArg	TokenNameIdentifier	 detail Arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
