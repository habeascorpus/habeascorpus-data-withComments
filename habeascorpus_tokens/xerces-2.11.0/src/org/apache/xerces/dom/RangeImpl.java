/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
CharacterData	TokenNameIdentifier	 Character Data
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DocumentFragment	TokenNameIdentifier	 Document Fragment
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
Range	TokenNameIdentifier	 Range
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
ranges	TokenNameIdentifier	 ranges
.	TokenNameDOT	
RangeException	TokenNameIdentifier	 Range Exception
;	TokenNameSEMICOLON	
/** * The RangeImpl class implements the org.w3c.dom.range.Range interface. * <p> Please see the API documentation for the interface classes * and use the interfaces in your client programs. * * @xerces.internal * * @version $Id: RangeImpl.java 515302 2007-03-06 21:07:10Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 The RangeImpl class implements the org.w3c.dom.range.Range interface. <p> Please see the API documentation for the interface classes and use the interfaces in your client programs. * @xerces.internal * @version $Id: RangeImpl.java 515302 2007-03-06 21:07:10Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
RangeImpl	TokenNameIdentifier	 Range Impl
implements	TokenNameimplements	
Range	TokenNameIdentifier	 Range
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
private	TokenNameprivate	
DocumentImpl	TokenNameIdentifier	 Document Impl
fDocument	TokenNameIdentifier	 f Document
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Node	TokenNameIdentifier	 Node
fStartContainer	TokenNameIdentifier	 f Start Container
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Node	TokenNameIdentifier	 Node
fEndContainer	TokenNameIdentifier	 f End Container
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
fStartOffset	TokenNameIdentifier	 f Start Offset
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
fEndOffset	TokenNameIdentifier	 f End Offset
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
fDetach	TokenNameIdentifier	 f Detach
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Node	TokenNameIdentifier	 Node
fInsertNode	TokenNameIdentifier	 f Insert Node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Node	TokenNameIdentifier	 Node
fDeleteNode	TokenNameIdentifier	 f Delete Node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Node	TokenNameIdentifier	 Node
fSplitNode	TokenNameIdentifier	 f Split Node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Was the Node inserted from the Range or the Document 	TokenNameCOMMENT_LINE	Was the Node inserted from the Range or the Document 
private	TokenNameprivate	
boolean	TokenNameboolean	
fInsertedFromRange	TokenNameIdentifier	 f Inserted From Range
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** The constructor. Clients must use DocumentRange.createRange(), * because it registers the Range with the document, so it can * be fixed-up. */	TokenNameCOMMENT_JAVADOC	 The constructor. Clients must use DocumentRange.createRange(), because it registers the Range with the document, so it can be fixed-up. 
public	TokenNamepublic	
RangeImpl	TokenNameIdentifier	 Range Impl
(	TokenNameLPAREN	
DocumentImpl	TokenNameIdentifier	 Document Impl
document	TokenNameIdentifier	 document
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDocument	TokenNameIdentifier	 f Document
=	TokenNameEQUAL	
document	TokenNameIdentifier	 document
;	TokenNameSEMICOLON	
fStartContainer	TokenNameIdentifier	 f Start Container
=	TokenNameEQUAL	
document	TokenNameIdentifier	 document
;	TokenNameSEMICOLON	
fEndContainer	TokenNameIdentifier	 f End Container
=	TokenNameEQUAL	
document	TokenNameIdentifier	 document
;	TokenNameSEMICOLON	
fStartOffset	TokenNameIdentifier	 f Start Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fEndOffset	TokenNameIdentifier	 f End Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fDetach	TokenNameIdentifier	 f Detach
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getStartContainer	TokenNameIdentifier	 get Start Container
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDetach	TokenNameIdentifier	 f Detach
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INVALID_STATE_ERR	TokenNameIdentifier	 INVALID  STATE  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"INVALID_STATE_ERR"	TokenNameStringLiteral	INVALID_STATE_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fStartContainer	TokenNameIdentifier	 f Start Container
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getStartOffset	TokenNameIdentifier	 get Start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDetach	TokenNameIdentifier	 f Detach
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INVALID_STATE_ERR	TokenNameIdentifier	 INVALID  STATE  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"INVALID_STATE_ERR"	TokenNameStringLiteral	INVALID_STATE_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fStartOffset	TokenNameIdentifier	 f Start Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getEndContainer	TokenNameIdentifier	 get End Container
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDetach	TokenNameIdentifier	 f Detach
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INVALID_STATE_ERR	TokenNameIdentifier	 INVALID  STATE  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"INVALID_STATE_ERR"	TokenNameStringLiteral	INVALID_STATE_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fEndContainer	TokenNameIdentifier	 f End Container
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getEndOffset	TokenNameIdentifier	 get End Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDetach	TokenNameIdentifier	 f Detach
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INVALID_STATE_ERR	TokenNameIdentifier	 INVALID  STATE  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"INVALID_STATE_ERR"	TokenNameStringLiteral	INVALID_STATE_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fEndOffset	TokenNameIdentifier	 f End Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
getCollapsed	TokenNameIdentifier	 get Collapsed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDetach	TokenNameIdentifier	 f Detach
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INVALID_STATE_ERR	TokenNameIdentifier	 INVALID  STATE  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"INVALID_STATE_ERR"	TokenNameStringLiteral	INVALID_STATE_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
fStartContainer	TokenNameIdentifier	 f Start Container
==	TokenNameEQUAL_EQUAL	
fEndContainer	TokenNameIdentifier	 f End Container
&&	TokenNameAND_AND	
fStartOffset	TokenNameIdentifier	 f Start Offset
==	TokenNameEQUAL_EQUAL	
fEndOffset	TokenNameIdentifier	 f End Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getCommonAncestorContainer	TokenNameIdentifier	 get Common Ancestor Container
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDetach	TokenNameIdentifier	 f Detach
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INVALID_STATE_ERR	TokenNameIdentifier	 INVALID  STATE  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"INVALID_STATE_ERR"	TokenNameStringLiteral	INVALID_STATE_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ArrayList	TokenNameIdentifier	 Array List
startV	TokenNameIdentifier	 start V
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
fStartContainer	TokenNameIdentifier	 f Start Container
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
startV	TokenNameIdentifier	 start V
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ArrayList	TokenNameIdentifier	 Array List
endV	TokenNameIdentifier	 end V
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
fEndContainer	TokenNameIdentifier	 f End Container
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
endV	TokenNameIdentifier	 end V
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
startV	TokenNameIdentifier	 start V
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
endV	TokenNameIdentifier	 end V
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
e	TokenNameIdentifier	 e
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
startV	TokenNameIdentifier	 start V
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
endV	TokenNameIdentifier	 end V
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
startV	TokenNameIdentifier	 start V
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
--	TokenNameMINUS_MINUS	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setStart	TokenNameIdentifier	 set Start
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
refNode	TokenNameIdentifier	 ref Node
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
throws	TokenNamethrows	
RangeException	TokenNameIdentifier	 Range Exception
,	TokenNameCOMMA	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDocument	TokenNameIdentifier	 f Document
.	TokenNameDOT	
errorChecking	TokenNameIdentifier	 error Checking
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDetach	TokenNameIdentifier	 f Detach
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INVALID_STATE_ERR	TokenNameIdentifier	 INVALID  STATE  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"INVALID_STATE_ERR"	TokenNameStringLiteral	INVALID_STATE_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isLegalContainer	TokenNameIdentifier	 is Legal Container
(	TokenNameLPAREN	
refNode	TokenNameIdentifier	 ref Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RangeExceptionImpl	TokenNameIdentifier	 Range Exception Impl
(	TokenNameLPAREN	
RangeException	TokenNameIdentifier	 Range Exception
.	TokenNameDOT	
INVALID_NODE_TYPE_ERR	TokenNameIdentifier	 INVALID  NODE  TYPE  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"INVALID_NODE_TYPE_ERR"	TokenNameStringLiteral	INVALID_NODE_TYPE_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDocument	TokenNameIdentifier	 f Document
!=	TokenNameNOT_EQUAL	
refNode	TokenNameIdentifier	 ref Node
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
fDocument	TokenNameIdentifier	 f Document
!=	TokenNameNOT_EQUAL	
refNode	TokenNameIdentifier	 ref Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
WRONG_DOCUMENT_ERR	TokenNameIdentifier	 WRONG  DOCUMENT  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"WRONG_DOCUMENT_ERR"	TokenNameStringLiteral	WRONG_DOCUMENT_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
checkIndex	TokenNameIdentifier	 check Index
(	TokenNameLPAREN	
refNode	TokenNameIdentifier	 ref Node
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fStartContainer	TokenNameIdentifier	 f Start Container
=	TokenNameEQUAL	
refNode	TokenNameIdentifier	 ref Node
;	TokenNameSEMICOLON	
fStartOffset	TokenNameIdentifier	 f Start Offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
// If one boundary-point of a Range is set to have a root container 	TokenNameCOMMENT_LINE	If one boundary-point of a Range is set to have a root container 
// other 	TokenNameCOMMENT_LINE	other 
// than the current one for the Range, the Range should be collapsed to 	TokenNameCOMMENT_LINE	than the current one for the Range, the Range should be collapsed to 
// the new position. 	TokenNameCOMMENT_LINE	the new position. 
// The start position of a Range should never be after the end position. 	TokenNameCOMMENT_LINE	The start position of a Range should never be after the end position. 
if	TokenNameif	
(	TokenNameLPAREN	
getCommonAncestorContainer	TokenNameIdentifier	 get Common Ancestor Container
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
fStartContainer	TokenNameIdentifier	 f Start Container
==	TokenNameEQUAL_EQUAL	
fEndContainer	TokenNameIdentifier	 f End Container
&&	TokenNameAND_AND	
fEndOffset	TokenNameIdentifier	 f End Offset
<	TokenNameLESS	
fStartOffset	TokenNameIdentifier	 f Start Offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
collapse	TokenNameIdentifier	 collapse
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setEnd	TokenNameIdentifier	 set End
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
refNode	TokenNameIdentifier	 ref Node
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
throws	TokenNamethrows	
RangeException	TokenNameIdentifier	 Range Exception
,	TokenNameCOMMA	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDocument	TokenNameIdentifier	 f Document
.	TokenNameDOT	
errorChecking	TokenNameIdentifier	 error Checking
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDetach	TokenNameIdentifier	 f Detach
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INVALID_STATE_ERR	TokenNameIdentifier	 INVALID  STATE  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"INVALID_STATE_ERR"	TokenNameStringLiteral	INVALID_STATE_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isLegalContainer	TokenNameIdentifier	 is Legal Container
(	TokenNameLPAREN	
refNode	TokenNameIdentifier	 ref Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RangeExceptionImpl	TokenNameIdentifier	 Range Exception Impl
(	TokenNameLPAREN	
RangeException	TokenNameIdentifier	 Range Exception
.	TokenNameDOT	
INVALID_NODE_TYPE_ERR	TokenNameIdentifier	 INVALID  NODE  TYPE  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"INVALID_NODE_TYPE_ERR"	TokenNameStringLiteral	INVALID_NODE_TYPE_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDocument	TokenNameIdentifier	 f Document
!=	TokenNameNOT_EQUAL	
refNode	TokenNameIdentifier	 ref Node
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
fDocument	TokenNameIdentifier	 f Document
!=	TokenNameNOT_EQUAL	
refNode	TokenNameIdentifier	 ref Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
WRONG_DOCUMENT_ERR	TokenNameIdentifier	 WRONG  DOCUMENT  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"WRONG_DOCUMENT_ERR"	TokenNameStringLiteral	WRONG_DOCUMENT_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
checkIndex	TokenNameIdentifier	 check Index
(	TokenNameLPAREN	
refNode	TokenNameIdentifier	 ref Node
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fEndContainer	TokenNameIdentifier	 f End Container
=	TokenNameEQUAL	
refNode	TokenNameIdentifier	 ref Node
;	TokenNameSEMICOLON	
fEndOffset	TokenNameIdentifier	 f End Offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
// If one boundary-point of a Range is set to have a root container 	TokenNameCOMMENT_LINE	If one boundary-point of a Range is set to have a root container 
// other 	TokenNameCOMMENT_LINE	other 
// than the current one for the Range, the Range should be collapsed to 	TokenNameCOMMENT_LINE	than the current one for the Range, the Range should be collapsed to 
// the new position. 	TokenNameCOMMENT_LINE	the new position. 
// The start position of a Range should never be after the end position. 	TokenNameCOMMENT_LINE	The start position of a Range should never be after the end position. 
if	TokenNameif	
(	TokenNameLPAREN	
getCommonAncestorContainer	TokenNameIdentifier	 get Common Ancestor Container
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
fStartContainer	TokenNameIdentifier	 f Start Container
==	TokenNameEQUAL_EQUAL	
fEndContainer	TokenNameIdentifier	 f End Container
&&	TokenNameAND_AND	
fEndOffset	TokenNameIdentifier	 f End Offset
<	TokenNameLESS	
fStartOffset	TokenNameIdentifier	 f Start Offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
collapse	TokenNameIdentifier	 collapse
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setStartBefore	TokenNameIdentifier	 set Start Before
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
refNode	TokenNameIdentifier	 ref Node
)	TokenNameRPAREN	
throws	TokenNamethrows	
RangeException	TokenNameIdentifier	 Range Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDocument	TokenNameIdentifier	 f Document
.	TokenNameDOT	
errorChecking	TokenNameIdentifier	 error Checking
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDetach	TokenNameIdentifier	 f Detach
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INVALID_STATE_ERR	TokenNameIdentifier	 INVALID  STATE  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"INVALID_STATE_ERR"	TokenNameStringLiteral	INVALID_STATE_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasLegalRootContainer	TokenNameIdentifier	 has Legal Root Container
(	TokenNameLPAREN	
refNode	TokenNameIdentifier	 ref Node
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
isLegalContainedNode	TokenNameIdentifier	 is Legal Contained Node
(	TokenNameLPAREN	
refNode	TokenNameIdentifier	 ref Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RangeExceptionImpl	TokenNameIdentifier	 Range Exception Impl
(	TokenNameLPAREN	
RangeException	TokenNameIdentifier	 Range Exception
.	TokenNameDOT	
INVALID_NODE_TYPE_ERR	TokenNameIdentifier	 INVALID  NODE  TYPE  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"INVALID_NODE_TYPE_ERR"	TokenNameStringLiteral	INVALID_NODE_TYPE_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDocument	TokenNameIdentifier	 f Document
!=	TokenNameNOT_EQUAL	
refNode	TokenNameIdentifier	 ref Node
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
fDocument	TokenNameIdentifier	 f Document
!=	TokenNameNOT_EQUAL	
refNode	TokenNameIdentifier	 ref Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
WRONG_DOCUMENT_ERR	TokenNameIdentifier	 WRONG  DOCUMENT  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"WRONG_DOCUMENT_ERR"	TokenNameStringLiteral	WRONG_DOCUMENT_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
fStartContainer	TokenNameIdentifier	 f Start Container
=	TokenNameEQUAL	
refNode	TokenNameIdentifier	 ref Node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
refNode	TokenNameIdentifier	 ref Node
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fStartOffset	TokenNameIdentifier	 f Start Offset
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// If one boundary-point of a Range is set to have a root container 	TokenNameCOMMENT_LINE	If one boundary-point of a Range is set to have a root container 
// other 	TokenNameCOMMENT_LINE	other 
// than the current one for the Range, the Range should be collapsed to 	TokenNameCOMMENT_LINE	than the current one for the Range, the Range should be collapsed to 
// the new position. 	TokenNameCOMMENT_LINE	the new position. 
// The start position of a Range should never be after the end position. 	TokenNameCOMMENT_LINE	The start position of a Range should never be after the end position. 
if	TokenNameif	
(	TokenNameLPAREN	
getCommonAncestorContainer	TokenNameIdentifier	 get Common Ancestor Container
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
fStartContainer	TokenNameIdentifier	 f Start Container
==	TokenNameEQUAL_EQUAL	
fEndContainer	TokenNameIdentifier	 f End Container
&&	TokenNameAND_AND	
fEndOffset	TokenNameIdentifier	 f End Offset
<	TokenNameLESS	
fStartOffset	TokenNameIdentifier	 f Start Offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
collapse	TokenNameIdentifier	 collapse
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setStartAfter	TokenNameIdentifier	 set Start After
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
refNode	TokenNameIdentifier	 ref Node
)	TokenNameRPAREN	
throws	TokenNamethrows	
RangeException	TokenNameIdentifier	 Range Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDocument	TokenNameIdentifier	 f Document
.	TokenNameDOT	
errorChecking	TokenNameIdentifier	 error Checking
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDetach	TokenNameIdentifier	 f Detach
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INVALID_STATE_ERR	TokenNameIdentifier	 INVALID  STATE  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"INVALID_STATE_ERR"	TokenNameStringLiteral	INVALID_STATE_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasLegalRootContainer	TokenNameIdentifier	 has Legal Root Container
(	TokenNameLPAREN	
refNode	TokenNameIdentifier	 ref Node
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
isLegalContainedNode	TokenNameIdentifier	 is Legal Contained Node
(	TokenNameLPAREN	
refNode	TokenNameIdentifier	 ref Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RangeExceptionImpl	TokenNameIdentifier	 Range Exception Impl
(	TokenNameLPAREN	
RangeException	TokenNameIdentifier	 Range Exception
.	TokenNameDOT	
INVALID_NODE_TYPE_ERR	TokenNameIdentifier	 INVALID  NODE  TYPE  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"INVALID_NODE_TYPE_ERR"	TokenNameStringLiteral	INVALID_NODE_TYPE_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDocument	TokenNameIdentifier	 f Document
!=	TokenNameNOT_EQUAL	
refNode	TokenNameIdentifier	 ref Node
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
fDocument	TokenNameIdentifier	 f Document
!=	TokenNameNOT_EQUAL	
refNode	TokenNameIdentifier	 ref Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
WRONG_DOCUMENT_ERR	TokenNameIdentifier	 WRONG  DOCUMENT  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"WRONG_DOCUMENT_ERR"	TokenNameStringLiteral	WRONG_DOCUMENT_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
fStartContainer	TokenNameIdentifier	 f Start Container
=	TokenNameEQUAL	
refNode	TokenNameIdentifier	 ref Node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
refNode	TokenNameIdentifier	 ref Node
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fStartOffset	TokenNameIdentifier	 f Start Offset
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
// If one boundary-point of a Range is set to have a root container 	TokenNameCOMMENT_LINE	If one boundary-point of a Range is set to have a root container 
// other 	TokenNameCOMMENT_LINE	other 
// than the current one for the Range, the Range should be collapsed to 	TokenNameCOMMENT_LINE	than the current one for the Range, the Range should be collapsed to 
// the new position. 	TokenNameCOMMENT_LINE	the new position. 
// The start position of a Range should never be after the end position. 	TokenNameCOMMENT_LINE	The start position of a Range should never be after the end position. 
if	TokenNameif	
(	TokenNameLPAREN	
getCommonAncestorContainer	TokenNameIdentifier	 get Common Ancestor Container
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
fStartContainer	TokenNameIdentifier	 f Start Container
==	TokenNameEQUAL_EQUAL	
fEndContainer	TokenNameIdentifier	 f End Container
&&	TokenNameAND_AND	
fEndOffset	TokenNameIdentifier	 f End Offset
<	TokenNameLESS	
fStartOffset	TokenNameIdentifier	 f Start Offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
collapse	TokenNameIdentifier	 collapse
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setEndBefore	TokenNameIdentifier	 set End Before
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
refNode	TokenNameIdentifier	 ref Node
)	TokenNameRPAREN	
throws	TokenNamethrows	
RangeException	TokenNameIdentifier	 Range Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDocument	TokenNameIdentifier	 f Document
.	TokenNameDOT	
errorChecking	TokenNameIdentifier	 error Checking
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDetach	TokenNameIdentifier	 f Detach
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INVALID_STATE_ERR	TokenNameIdentifier	 INVALID  STATE  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"INVALID_STATE_ERR"	TokenNameStringLiteral	INVALID_STATE_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasLegalRootContainer	TokenNameIdentifier	 has Legal Root Container
(	TokenNameLPAREN	
refNode	TokenNameIdentifier	 ref Node
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
isLegalContainedNode	TokenNameIdentifier	 is Legal Contained Node
(	TokenNameLPAREN	
refNode	TokenNameIdentifier	 ref Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RangeExceptionImpl	TokenNameIdentifier	 Range Exception Impl
(	TokenNameLPAREN	
RangeException	TokenNameIdentifier	 Range Exception
.	TokenNameDOT	
INVALID_NODE_TYPE_ERR	TokenNameIdentifier	 INVALID  NODE  TYPE  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"INVALID_NODE_TYPE_ERR"	TokenNameStringLiteral	INVALID_NODE_TYPE_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDocument	TokenNameIdentifier	 f Document
!=	TokenNameNOT_EQUAL	
refNode	TokenNameIdentifier	 ref Node
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
fDocument	TokenNameIdentifier	 f Document
!=	TokenNameNOT_EQUAL	
refNode	TokenNameIdentifier	 ref Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
WRONG_DOCUMENT_ERR	TokenNameIdentifier	 WRONG  DOCUMENT  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"WRONG_DOCUMENT_ERR"	TokenNameStringLiteral	WRONG_DOCUMENT_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
fEndContainer	TokenNameIdentifier	 f End Container
=	TokenNameEQUAL	
refNode	TokenNameIdentifier	 ref Node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
refNode	TokenNameIdentifier	 ref Node
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fEndOffset	TokenNameIdentifier	 f End Offset
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// If one boundary-point of a Range is set to have a root container 	TokenNameCOMMENT_LINE	If one boundary-point of a Range is set to have a root container 
// other 	TokenNameCOMMENT_LINE	other 
// than the current one for the Range, the Range should be collapsed to 	TokenNameCOMMENT_LINE	than the current one for the Range, the Range should be collapsed to 
// the new position. 	TokenNameCOMMENT_LINE	the new position. 
// The start position of a Range should never be after the end position. 	TokenNameCOMMENT_LINE	The start position of a Range should never be after the end position. 
if	TokenNameif	
(	TokenNameLPAREN	
getCommonAncestorContainer	TokenNameIdentifier	 get Common Ancestor Container
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
fStartContainer	TokenNameIdentifier	 f Start Container
==	TokenNameEQUAL_EQUAL	
fEndContainer	TokenNameIdentifier	 f End Container
&&	TokenNameAND_AND	
fEndOffset	TokenNameIdentifier	 f End Offset
<	TokenNameLESS	
fStartOffset	TokenNameIdentifier	 f Start Offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
collapse	TokenNameIdentifier	 collapse
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setEndAfter	TokenNameIdentifier	 set End After
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
refNode	TokenNameIdentifier	 ref Node
)	TokenNameRPAREN	
throws	TokenNamethrows	
RangeException	TokenNameIdentifier	 Range Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDocument	TokenNameIdentifier	 f Document
.	TokenNameDOT	
errorChecking	TokenNameIdentifier	 error Checking
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDetach	TokenNameIdentifier	 f Detach
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INVALID_STATE_ERR	TokenNameIdentifier	 INVALID  STATE  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"INVALID_STATE_ERR"	TokenNameStringLiteral	INVALID_STATE_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasLegalRootContainer	TokenNameIdentifier	 has Legal Root Container
(	TokenNameLPAREN	
refNode	TokenNameIdentifier	 ref Node
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
isLegalContainedNode	TokenNameIdentifier	 is Legal Contained Node
(	TokenNameLPAREN	
refNode	TokenNameIdentifier	 ref Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RangeExceptionImpl	TokenNameIdentifier	 Range Exception Impl
(	TokenNameLPAREN	
RangeException	TokenNameIdentifier	 Range Exception
.	TokenNameDOT	
INVALID_NODE_TYPE_ERR	TokenNameIdentifier	 INVALID  NODE  TYPE  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"INVALID_NODE_TYPE_ERR"	TokenNameStringLiteral	INVALID_NODE_TYPE_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDocument	TokenNameIdentifier	 f Document
!=	TokenNameNOT_EQUAL	
refNode	TokenNameIdentifier	 ref Node
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
fDocument	TokenNameIdentifier	 f Document
!=	TokenNameNOT_EQUAL	
refNode	TokenNameIdentifier	 ref Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
WRONG_DOCUMENT_ERR	TokenNameIdentifier	 WRONG  DOCUMENT  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"WRONG_DOCUMENT_ERR"	TokenNameStringLiteral	WRONG_DOCUMENT_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
fEndContainer	TokenNameIdentifier	 f End Container
=	TokenNameEQUAL	
refNode	TokenNameIdentifier	 ref Node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
refNode	TokenNameIdentifier	 ref Node
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fEndOffset	TokenNameIdentifier	 f End Offset
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
// If one boundary-point of a Range is set to have a root container 	TokenNameCOMMENT_LINE	If one boundary-point of a Range is set to have a root container 
// other 	TokenNameCOMMENT_LINE	other 
// than the current one for the Range, the Range should be collapsed to 	TokenNameCOMMENT_LINE	than the current one for the Range, the Range should be collapsed to 
// the new position. 	TokenNameCOMMENT_LINE	the new position. 
// The start position of a Range should never be after the end position. 	TokenNameCOMMENT_LINE	The start position of a Range should never be after the end position. 
if	TokenNameif	
(	TokenNameLPAREN	
getCommonAncestorContainer	TokenNameIdentifier	 get Common Ancestor Container
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
fStartContainer	TokenNameIdentifier	 f Start Container
==	TokenNameEQUAL_EQUAL	
fEndContainer	TokenNameIdentifier	 f End Container
&&	TokenNameAND_AND	
fEndOffset	TokenNameIdentifier	 f End Offset
<	TokenNameLESS	
fStartOffset	TokenNameIdentifier	 f Start Offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
collapse	TokenNameIdentifier	 collapse
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
collapse	TokenNameIdentifier	 collapse
(	TokenNameLPAREN	
boolean	TokenNameboolean	
toStart	TokenNameIdentifier	 to Start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDetach	TokenNameIdentifier	 f Detach
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INVALID_STATE_ERR	TokenNameIdentifier	 INVALID  STATE  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"INVALID_STATE_ERR"	TokenNameStringLiteral	INVALID_STATE_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
toStart	TokenNameIdentifier	 to Start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fEndContainer	TokenNameIdentifier	 f End Container
=	TokenNameEQUAL	
fStartContainer	TokenNameIdentifier	 f Start Container
;	TokenNameSEMICOLON	
fEndOffset	TokenNameIdentifier	 f End Offset
=	TokenNameEQUAL	
fStartOffset	TokenNameIdentifier	 f Start Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fStartContainer	TokenNameIdentifier	 f Start Container
=	TokenNameEQUAL	
fEndContainer	TokenNameIdentifier	 f End Container
;	TokenNameSEMICOLON	
fStartOffset	TokenNameIdentifier	 f Start Offset
=	TokenNameEQUAL	
fEndOffset	TokenNameIdentifier	 f End Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
selectNode	TokenNameIdentifier	 select Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
refNode	TokenNameIdentifier	 ref Node
)	TokenNameRPAREN	
throws	TokenNamethrows	
RangeException	TokenNameIdentifier	 Range Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDocument	TokenNameIdentifier	 f Document
.	TokenNameDOT	
errorChecking	TokenNameIdentifier	 error Checking
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDetach	TokenNameIdentifier	 f Detach
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INVALID_STATE_ERR	TokenNameIdentifier	 INVALID  STATE  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"INVALID_STATE_ERR"	TokenNameStringLiteral	INVALID_STATE_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isLegalContainer	TokenNameIdentifier	 is Legal Container
(	TokenNameLPAREN	
refNode	TokenNameIdentifier	 ref Node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
isLegalContainedNode	TokenNameIdentifier	 is Legal Contained Node
(	TokenNameLPAREN	
refNode	TokenNameIdentifier	 ref Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RangeExceptionImpl	TokenNameIdentifier	 Range Exception Impl
(	TokenNameLPAREN	
RangeException	TokenNameIdentifier	 Range Exception
.	TokenNameDOT	
INVALID_NODE_TYPE_ERR	TokenNameIdentifier	 INVALID  NODE  TYPE  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"INVALID_NODE_TYPE_ERR"	TokenNameStringLiteral	INVALID_NODE_TYPE_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDocument	TokenNameIdentifier	 f Document
!=	TokenNameNOT_EQUAL	
refNode	TokenNameIdentifier	 ref Node
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
fDocument	TokenNameIdentifier	 f Document
!=	TokenNameNOT_EQUAL	
refNode	TokenNameIdentifier	 ref Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
WRONG_DOCUMENT_ERR	TokenNameIdentifier	 WRONG  DOCUMENT  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"WRONG_DOCUMENT_ERR"	TokenNameStringLiteral	WRONG_DOCUMENT_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
refNode	TokenNameIdentifier	 ref Node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
// REVIST: what to do if it IS null? 	TokenNameCOMMENT_LINE	REVIST: what to do if it IS null? 
{	TokenNameLBRACE	
fStartContainer	TokenNameIdentifier	 f Start Container
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
fEndContainer	TokenNameIdentifier	 f End Container
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
refNode	TokenNameIdentifier	 ref Node
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fStartOffset	TokenNameIdentifier	 f Start Offset
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fEndOffset	TokenNameIdentifier	 f End Offset
=	TokenNameEQUAL	
fStartOffset	TokenNameIdentifier	 f Start Offset
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
selectNodeContents	TokenNameIdentifier	 select Node Contents
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
refNode	TokenNameIdentifier	 ref Node
)	TokenNameRPAREN	
throws	TokenNamethrows	
RangeException	TokenNameIdentifier	 Range Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDocument	TokenNameIdentifier	 f Document
.	TokenNameDOT	
errorChecking	TokenNameIdentifier	 error Checking
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDetach	TokenNameIdentifier	 f Detach
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INVALID_STATE_ERR	TokenNameIdentifier	 INVALID  STATE  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"INVALID_STATE_ERR"	TokenNameStringLiteral	INVALID_STATE_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isLegalContainer	TokenNameIdentifier	 is Legal Container
(	TokenNameLPAREN	
refNode	TokenNameIdentifier	 ref Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RangeExceptionImpl	TokenNameIdentifier	 Range Exception Impl
(	TokenNameLPAREN	
RangeException	TokenNameIdentifier	 Range Exception
.	TokenNameDOT	
INVALID_NODE_TYPE_ERR	TokenNameIdentifier	 INVALID  NODE  TYPE  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"INVALID_NODE_TYPE_ERR"	TokenNameStringLiteral	INVALID_NODE_TYPE_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDocument	TokenNameIdentifier	 f Document
!=	TokenNameNOT_EQUAL	
refNode	TokenNameIdentifier	 ref Node
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
fDocument	TokenNameIdentifier	 f Document
!=	TokenNameNOT_EQUAL	
refNode	TokenNameIdentifier	 ref Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
WRONG_DOCUMENT_ERR	TokenNameIdentifier	 WRONG  DOCUMENT  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"WRONG_DOCUMENT_ERR"	TokenNameStringLiteral	WRONG_DOCUMENT_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
fStartContainer	TokenNameIdentifier	 f Start Container
=	TokenNameEQUAL	
refNode	TokenNameIdentifier	 ref Node
;	TokenNameSEMICOLON	
fEndContainer	TokenNameIdentifier	 f End Container
=	TokenNameEQUAL	
refNode	TokenNameIdentifier	 ref Node
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
refNode	TokenNameIdentifier	 ref Node
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fStartOffset	TokenNameIdentifier	 f Start Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fEndOffset	TokenNameIdentifier	 f End Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
first	TokenNameIdentifier	 first
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fEndOffset	TokenNameIdentifier	 f End Offset
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
compareBoundaryPoints	TokenNameIdentifier	 compare Boundary Points
(	TokenNameLPAREN	
short	TokenNameshort	
how	TokenNameIdentifier	 how
,	TokenNameCOMMA	
Range	TokenNameIdentifier	 Range
sourceRange	TokenNameIdentifier	 source Range
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDocument	TokenNameIdentifier	 f Document
.	TokenNameDOT	
errorChecking	TokenNameIdentifier	 error Checking
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDetach	TokenNameIdentifier	 f Detach
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INVALID_STATE_ERR	TokenNameIdentifier	 INVALID  STATE  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"INVALID_STATE_ERR"	TokenNameStringLiteral	INVALID_STATE_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// WRONG_DOCUMENT_ERR: Raised if the two Ranges are not in the same Document or DocumentFragment. 	TokenNameCOMMENT_LINE	WRONG_DOCUMENT_ERR: Raised if the two Ranges are not in the same Document or DocumentFragment. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fDocument	TokenNameIdentifier	 f Document
!=	TokenNameNOT_EQUAL	
sourceRange	TokenNameIdentifier	 source Range
.	TokenNameDOT	
getStartContainer	TokenNameIdentifier	 get Start Container
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
fDocument	TokenNameIdentifier	 f Document
!=	TokenNameNOT_EQUAL	
sourceRange	TokenNameIdentifier	 source Range
.	TokenNameDOT	
getStartContainer	TokenNameIdentifier	 get Start Container
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
sourceRange	TokenNameIdentifier	 source Range
.	TokenNameDOT	
getStartContainer	TokenNameIdentifier	 get Start Container
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
fDocument	TokenNameIdentifier	 f Document
!=	TokenNameNOT_EQUAL	
sourceRange	TokenNameIdentifier	 source Range
.	TokenNameDOT	
getEndContainer	TokenNameIdentifier	 get End Container
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
fDocument	TokenNameIdentifier	 f Document
!=	TokenNameNOT_EQUAL	
sourceRange	TokenNameIdentifier	 source Range
.	TokenNameDOT	
getEndContainer	TokenNameIdentifier	 get End Container
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
sourceRange	TokenNameIdentifier	 source Range
.	TokenNameDOT	
getStartContainer	TokenNameIdentifier	 get Start Container
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
WRONG_DOCUMENT_ERR	TokenNameIdentifier	 WRONG  DOCUMENT  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"WRONG_DOCUMENT_ERR"	TokenNameStringLiteral	WRONG_DOCUMENT_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
Node	TokenNameIdentifier	 Node
endPointA	TokenNameIdentifier	 end Point A
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
endPointB	TokenNameIdentifier	 end Point B
;	TokenNameSEMICOLON	
int	TokenNameint	
offsetA	TokenNameIdentifier	 offset A
;	TokenNameSEMICOLON	
int	TokenNameint	
offsetB	TokenNameIdentifier	 offset B
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
how	TokenNameIdentifier	 how
==	TokenNameEQUAL_EQUAL	
START_TO_START	TokenNameIdentifier	 START  TO  START
)	TokenNameRPAREN	
{	TokenNameLBRACE	
endPointA	TokenNameIdentifier	 end Point A
=	TokenNameEQUAL	
sourceRange	TokenNameIdentifier	 source Range
.	TokenNameDOT	
getStartContainer	TokenNameIdentifier	 get Start Container
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endPointB	TokenNameIdentifier	 end Point B
=	TokenNameEQUAL	
fStartContainer	TokenNameIdentifier	 f Start Container
;	TokenNameSEMICOLON	
offsetA	TokenNameIdentifier	 offset A
=	TokenNameEQUAL	
sourceRange	TokenNameIdentifier	 source Range
.	TokenNameDOT	
getStartOffset	TokenNameIdentifier	 get Start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offsetB	TokenNameIdentifier	 offset B
=	TokenNameEQUAL	
fStartOffset	TokenNameIdentifier	 f Start Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
how	TokenNameIdentifier	 how
==	TokenNameEQUAL_EQUAL	
START_TO_END	TokenNameIdentifier	 START  TO  END
)	TokenNameRPAREN	
{	TokenNameLBRACE	
endPointA	TokenNameIdentifier	 end Point A
=	TokenNameEQUAL	
sourceRange	TokenNameIdentifier	 source Range
.	TokenNameDOT	
getStartContainer	TokenNameIdentifier	 get Start Container
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endPointB	TokenNameIdentifier	 end Point B
=	TokenNameEQUAL	
fEndContainer	TokenNameIdentifier	 f End Container
;	TokenNameSEMICOLON	
offsetA	TokenNameIdentifier	 offset A
=	TokenNameEQUAL	
sourceRange	TokenNameIdentifier	 source Range
.	TokenNameDOT	
getStartOffset	TokenNameIdentifier	 get Start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offsetB	TokenNameIdentifier	 offset B
=	TokenNameEQUAL	
fEndOffset	TokenNameIdentifier	 f End Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
how	TokenNameIdentifier	 how
==	TokenNameEQUAL_EQUAL	
END_TO_START	TokenNameIdentifier	 END  TO  START
)	TokenNameRPAREN	
{	TokenNameLBRACE	
endPointA	TokenNameIdentifier	 end Point A
=	TokenNameEQUAL	
sourceRange	TokenNameIdentifier	 source Range
.	TokenNameDOT	
getEndContainer	TokenNameIdentifier	 get End Container
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endPointB	TokenNameIdentifier	 end Point B
=	TokenNameEQUAL	
fStartContainer	TokenNameIdentifier	 f Start Container
;	TokenNameSEMICOLON	
offsetA	TokenNameIdentifier	 offset A
=	TokenNameEQUAL	
sourceRange	TokenNameIdentifier	 source Range
.	TokenNameDOT	
getEndOffset	TokenNameIdentifier	 get End Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offsetB	TokenNameIdentifier	 offset B
=	TokenNameEQUAL	
fStartOffset	TokenNameIdentifier	 f Start Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
endPointA	TokenNameIdentifier	 end Point A
=	TokenNameEQUAL	
sourceRange	TokenNameIdentifier	 source Range
.	TokenNameDOT	
getEndContainer	TokenNameIdentifier	 get End Container
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endPointB	TokenNameIdentifier	 end Point B
=	TokenNameEQUAL	
fEndContainer	TokenNameIdentifier	 f End Container
;	TokenNameSEMICOLON	
offsetA	TokenNameIdentifier	 offset A
=	TokenNameEQUAL	
sourceRange	TokenNameIdentifier	 source Range
.	TokenNameDOT	
getEndOffset	TokenNameIdentifier	 get End Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offsetB	TokenNameIdentifier	 offset B
=	TokenNameEQUAL	
fEndOffset	TokenNameIdentifier	 f End Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// The DOM Spec outlines four cases that need to be tested 	TokenNameCOMMENT_LINE	The DOM Spec outlines four cases that need to be tested 
// to compare two range boundary points: 	TokenNameCOMMENT_LINE	to compare two range boundary points: 
// case 1: same container 	TokenNameCOMMENT_LINE	case 1: same container 
// case 2: Child C of container A is ancestor of B 	TokenNameCOMMENT_LINE	case 2: Child C of container A is ancestor of B 
// case 3: Child C of container B is ancestor of A 	TokenNameCOMMENT_LINE	case 3: Child C of container B is ancestor of A 
// case 4: preorder traversal of context tree. 	TokenNameCOMMENT_LINE	case 4: preorder traversal of context tree. 
// case 1: same container 	TokenNameCOMMENT_LINE	case 1: same container 
if	TokenNameif	
(	TokenNameLPAREN	
endPointA	TokenNameIdentifier	 end Point A
==	TokenNameEQUAL_EQUAL	
endPointB	TokenNameIdentifier	 end Point B
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
offsetA	TokenNameIdentifier	 offset A
<	TokenNameLESS	
offsetB	TokenNameIdentifier	 offset B
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
offsetA	TokenNameIdentifier	 offset A
==	TokenNameEQUAL_EQUAL	
offsetB	TokenNameIdentifier	 offset B
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// case 2: Child C of container A is ancestor of B 	TokenNameCOMMENT_LINE	case 2: Child C of container A is ancestor of B 
// This can be quickly tested by walking the parent chain of B 	TokenNameCOMMENT_LINE	This can be quickly tested by walking the parent chain of B 
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
endPointB	TokenNameIdentifier	 end Point B
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
==	TokenNameEQUAL_EQUAL	
endPointA	TokenNameIdentifier	 end Point A
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
endPointA	TokenNameIdentifier	 end Point A
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
offsetA	TokenNameIdentifier	 offset A
<=	TokenNameLESS_EQUAL	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// case 3: Child C of container B is ancestor of A 	TokenNameCOMMENT_LINE	case 3: Child C of container B is ancestor of A 
// This can be quickly tested by walking the parent chain of A 	TokenNameCOMMENT_LINE	This can be quickly tested by walking the parent chain of A 
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
endPointA	TokenNameIdentifier	 end Point A
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
==	TokenNameEQUAL_EQUAL	
endPointB	TokenNameIdentifier	 end Point B
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
endPointB	TokenNameIdentifier	 end Point B
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
offsetB	TokenNameIdentifier	 offset B
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// case 4: preorder traversal of context tree. 	TokenNameCOMMENT_LINE	case 4: preorder traversal of context tree. 
// Instead of literally walking the context tree in pre-order, 	TokenNameCOMMENT_LINE	Instead of literally walking the context tree in pre-order, 
// we use relative node depth walking which is usually faster 	TokenNameCOMMENT_LINE	we use relative node depth walking which is usually faster 
int	TokenNameint	
depthDiff	TokenNameIdentifier	 depth Diff
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
endPointA	TokenNameIdentifier	 end Point A
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
depthDiff	TokenNameIdentifier	 depth Diff
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
endPointB	TokenNameIdentifier	 end Point B
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
depthDiff	TokenNameIdentifier	 depth Diff
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
depthDiff	TokenNameIdentifier	 depth Diff
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
endPointA	TokenNameIdentifier	 end Point A
=	TokenNameEQUAL	
endPointA	TokenNameIdentifier	 end Point A
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
depthDiff	TokenNameIdentifier	 depth Diff
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
depthDiff	TokenNameIdentifier	 depth Diff
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
endPointB	TokenNameIdentifier	 end Point B
=	TokenNameEQUAL	
endPointB	TokenNameIdentifier	 end Point B
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
depthDiff	TokenNameIdentifier	 depth Diff
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
pA	TokenNameIdentifier	 p A
=	TokenNameEQUAL	
endPointA	TokenNameIdentifier	 end Point A
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
pB	TokenNameIdentifier	 p B
=	TokenNameEQUAL	
endPointB	TokenNameIdentifier	 end Point B
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pA	TokenNameIdentifier	 p A
!=	TokenNameNOT_EQUAL	
pB	TokenNameIdentifier	 p B
;	TokenNameSEMICOLON	
pA	TokenNameIdentifier	 p A
=	TokenNameEQUAL	
pA	TokenNameIdentifier	 p A
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
pB	TokenNameIdentifier	 p B
=	TokenNameEQUAL	
pB	TokenNameIdentifier	 p B
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
endPointA	TokenNameIdentifier	 end Point A
=	TokenNameEQUAL	
pA	TokenNameIdentifier	 p A
;	TokenNameSEMICOLON	
endPointB	TokenNameIdentifier	 end Point B
=	TokenNameEQUAL	
pB	TokenNameIdentifier	 p B
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
endPointA	TokenNameIdentifier	 end Point A
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
endPointB	TokenNameIdentifier	 end Point B
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
deleteContents	TokenNameIdentifier	 delete Contents
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
traverseContents	TokenNameIdentifier	 traverse Contents
(	TokenNameLPAREN	
DELETE_CONTENTS	TokenNameIdentifier	 DELETE  CONTENTS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DocumentFragment	TokenNameIdentifier	 Document Fragment
extractContents	TokenNameIdentifier	 extract Contents
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
traverseContents	TokenNameIdentifier	 traverse Contents
(	TokenNameLPAREN	
EXTRACT_CONTENTS	TokenNameIdentifier	 EXTRACT  CONTENTS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DocumentFragment	TokenNameIdentifier	 Document Fragment
cloneContents	TokenNameIdentifier	 clone Contents
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
traverseContents	TokenNameIdentifier	 traverse Contents
(	TokenNameLPAREN	
CLONE_CONTENTS	TokenNameIdentifier	 CLONE  CONTENTS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
insertNode	TokenNameIdentifier	 insert Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
newNode	TokenNameIdentifier	 new Node
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
,	TokenNameCOMMA	
RangeException	TokenNameIdentifier	 Range Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
//throw exception? 	TokenNameCOMMENT_LINE	throw exception? 
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
newNode	TokenNameIdentifier	 new Node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fDocument	TokenNameIdentifier	 f Document
.	TokenNameDOT	
errorChecking	TokenNameIdentifier	 error Checking
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDetach	TokenNameIdentifier	 f Detach
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INVALID_STATE_ERR	TokenNameIdentifier	 INVALID  STATE  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"INVALID_STATE_ERR"	TokenNameStringLiteral	INVALID_STATE_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDocument	TokenNameIdentifier	 f Document
!=	TokenNameNOT_EQUAL	
newNode	TokenNameIdentifier	 new Node
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
WRONG_DOCUMENT_ERR	TokenNameIdentifier	 WRONG  DOCUMENT  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"WRONG_DOCUMENT_ERR"	TokenNameStringLiteral	WRONG_DOCUMENT_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
||	TokenNameOR_OR	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_NODE	TokenNameIdentifier	 ENTITY  NODE
||	TokenNameOR_OR	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
NOTATION_NODE	TokenNameIdentifier	 NOTATION  NODE
||	TokenNameOR_OR	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RangeExceptionImpl	TokenNameIdentifier	 Range Exception Impl
(	TokenNameLPAREN	
RangeException	TokenNameIdentifier	 Range Exception
.	TokenNameDOT	
INVALID_NODE_TYPE_ERR	TokenNameIdentifier	 INVALID  NODE  TYPE  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"INVALID_NODE_TYPE_ERR"	TokenNameStringLiteral	INVALID_NODE_TYPE_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
Node	TokenNameIdentifier	 Node
cloneCurrent	TokenNameIdentifier	 clone Current
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
int	TokenNameint	
currentChildren	TokenNameIdentifier	 current Children
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fInsertedFromRange	TokenNameIdentifier	 f Inserted From Range
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
//boolean MULTIPLE_MODE = false; 	TokenNameCOMMENT_LINE	boolean MULTIPLE_MODE = false; 
if	TokenNameif	
(	TokenNameLPAREN	
fStartContainer	TokenNameIdentifier	 f Start Container
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
fStartContainer	TokenNameIdentifier	 f Start Container
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentChildren	TokenNameIdentifier	 current Children
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getChildNodes	TokenNameIdentifier	 get Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//holds number of kids before insertion 	TokenNameCOMMENT_LINE	holds number of kids before insertion 
// split text node: results is 3 nodes.. 	TokenNameCOMMENT_LINE	split text node: results is 3 nodes.. 
cloneCurrent	TokenNameIdentifier	 clone Current
=	TokenNameEQUAL	
fStartContainer	TokenNameIdentifier	 f Start Container
.	TokenNameDOT	
cloneNode	TokenNameIdentifier	 clone Node
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TextImpl	TokenNameIdentifier	 Text Impl
)	TokenNameRPAREN	
cloneCurrent	TokenNameIdentifier	 clone Current
)	TokenNameRPAREN	
.	TokenNameDOT	
setNodeValueInternal	TokenNameIdentifier	 set Node Value Internal
(	TokenNameLPAREN	
(	TokenNameLPAREN	
cloneCurrent	TokenNameIdentifier	 clone Current
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
fStartOffset	TokenNameIdentifier	 f Start Offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TextImpl	TokenNameIdentifier	 Text Impl
)	TokenNameRPAREN	
fStartContainer	TokenNameIdentifier	 f Start Container
)	TokenNameRPAREN	
.	TokenNameDOT	
setNodeValueInternal	TokenNameIdentifier	 set Node Value Internal
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fStartContainer	TokenNameIdentifier	 f Start Container
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fStartOffset	TokenNameIdentifier	 f Start Offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
fStartContainer	TokenNameIdentifier	 f Start Container
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
,	TokenNameCOMMA	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
cloneCurrent	TokenNameIdentifier	 clone Current
,	TokenNameCOMMA	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
cloneCurrent	TokenNameIdentifier	 clone Current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//update ranges after the insertion 	TokenNameCOMMENT_LINE	update ranges after the insertion 
if	TokenNameif	
(	TokenNameLPAREN	
fEndContainer	TokenNameIdentifier	 f End Container
==	TokenNameEQUAL_EQUAL	
fStartContainer	TokenNameIdentifier	 f Start Container
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fEndContainer	TokenNameIdentifier	 f End Container
=	TokenNameEQUAL	
cloneCurrent	TokenNameIdentifier	 clone Current
;	TokenNameSEMICOLON	
//endContainer is the new Node created 	TokenNameCOMMENT_LINE	endContainer is the new Node created 
fEndOffset	TokenNameIdentifier	 f End Offset
-=	TokenNameMINUS_EQUAL	
fStartOffset	TokenNameIdentifier	 f Start Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
fEndContainer	TokenNameIdentifier	 f End Container
==	TokenNameEQUAL_EQUAL	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//endContainer was not a text Node. 	TokenNameCOMMENT_LINE	endContainer was not a text Node. 
//endOffset + = number_of_children_added 	TokenNameCOMMENT_LINE	endOffset + = number_of_children_added 
fEndOffset	TokenNameIdentifier	 f End Offset
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getChildNodes	TokenNameIdentifier	 get Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
currentChildren	TokenNameIdentifier	 current Children
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// signal other Ranges to update their start/end containers/offsets 	TokenNameCOMMENT_LINE	signal other Ranges to update their start/end containers/offsets 
signalSplitData	TokenNameIdentifier	 signal Split Data
(	TokenNameLPAREN	
fStartContainer	TokenNameIdentifier	 f Start Container
,	TokenNameCOMMA	
cloneCurrent	TokenNameIdentifier	 clone Current
,	TokenNameCOMMA	
fStartOffset	TokenNameIdentifier	 f Start Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// ! TEXT_NODE 	TokenNameCOMMENT_LINE	! TEXT_NODE 
if	TokenNameif	
(	TokenNameLPAREN	
fEndContainer	TokenNameIdentifier	 f End Container
==	TokenNameEQUAL_EQUAL	
fStartContainer	TokenNameIdentifier	 f Start Container
)	TokenNameRPAREN	
//need to remember number of kids 	TokenNameCOMMENT_LINE	need to remember number of kids 
currentChildren	TokenNameIdentifier	 current Children
=	TokenNameEQUAL	
fEndContainer	TokenNameIdentifier	 f End Container
.	TokenNameDOT	
getChildNodes	TokenNameIdentifier	 get Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
fStartContainer	TokenNameIdentifier	 f Start Container
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
fStartOffset	TokenNameIdentifier	 f Start Offset
&&	TokenNameAND_AND	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fStartContainer	TokenNameIdentifier	 f Start Container
.	TokenNameDOT	
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fStartContainer	TokenNameIdentifier	 f Start Container
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//update fEndOffset. ex:<body><p/></body>. Range(start;end): body,0; body,1 	TokenNameCOMMENT_LINE	update fEndOffset. ex:<body><p/></body>. Range(start;end): body,0; body,1 
// insert <h1>: <body></h1><p/></body>. Range(start;end): body,0; body,2 	TokenNameCOMMENT_LINE	insert <h1>: <body></h1><p/></body>. Range(start;end): body,0; body,2 
if	TokenNameif	
(	TokenNameLPAREN	
fEndContainer	TokenNameIdentifier	 f End Container
==	TokenNameEQUAL_EQUAL	
fStartContainer	TokenNameIdentifier	 f Start Container
&&	TokenNameAND_AND	
fEndOffset	TokenNameIdentifier	 f End Offset
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//update fEndOffset if not 0 	TokenNameCOMMENT_LINE	update fEndOffset if not 0 
fEndOffset	TokenNameIdentifier	 f End Offset
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
fEndContainer	TokenNameIdentifier	 f End Container
.	TokenNameDOT	
getChildNodes	TokenNameIdentifier	 get Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
currentChildren	TokenNameIdentifier	 current Children
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
fInsertedFromRange	TokenNameIdentifier	 f Inserted From Range
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
surroundContents	TokenNameIdentifier	 surround Contents
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
newParent	TokenNameIdentifier	 new Parent
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
,	TokenNameCOMMA	
RangeException	TokenNameIdentifier	 Range Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
newParent	TokenNameIdentifier	 new Parent
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
newParent	TokenNameIdentifier	 new Parent
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fDocument	TokenNameIdentifier	 f Document
.	TokenNameDOT	
errorChecking	TokenNameIdentifier	 error Checking
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDetach	TokenNameIdentifier	 f Detach
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INVALID_STATE_ERR	TokenNameIdentifier	 INVALID  STATE  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"INVALID_STATE_ERR"	TokenNameStringLiteral	INVALID_STATE_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
||	TokenNameOR_OR	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_NODE	TokenNameIdentifier	 ENTITY  NODE
||	TokenNameOR_OR	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
NOTATION_NODE	TokenNameIdentifier	 NOTATION  NODE
||	TokenNameOR_OR	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_TYPE_NODE	TokenNameIdentifier	 DOCUMENT  TYPE  NODE
||	TokenNameOR_OR	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
||	TokenNameOR_OR	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_FRAGMENT_NODE	TokenNameIdentifier	 DOCUMENT  FRAGMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RangeExceptionImpl	TokenNameIdentifier	 Range Exception Impl
(	TokenNameLPAREN	
RangeException	TokenNameIdentifier	 Range Exception
.	TokenNameDOT	
INVALID_NODE_TYPE_ERR	TokenNameIdentifier	 INVALID  NODE  TYPE  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"INVALID_NODE_TYPE_ERR"	TokenNameStringLiteral	INVALID_NODE_TYPE_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
Node	TokenNameIdentifier	 Node
realStart	TokenNameIdentifier	 real Start
=	TokenNameEQUAL	
fStartContainer	TokenNameIdentifier	 f Start Container
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
realEnd	TokenNameIdentifier	 real End
=	TokenNameEQUAL	
fEndContainer	TokenNameIdentifier	 f End Container
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fStartContainer	TokenNameIdentifier	 f Start Container
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
realStart	TokenNameIdentifier	 real Start
=	TokenNameEQUAL	
fStartContainer	TokenNameIdentifier	 f Start Container
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fEndContainer	TokenNameIdentifier	 f End Container
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
realEnd	TokenNameIdentifier	 real End
=	TokenNameEQUAL	
fEndContainer	TokenNameIdentifier	 f End Container
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
realStart	TokenNameIdentifier	 real Start
!=	TokenNameNOT_EQUAL	
realEnd	TokenNameIdentifier	 real End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RangeExceptionImpl	TokenNameIdentifier	 Range Exception Impl
(	TokenNameLPAREN	
RangeException	TokenNameIdentifier	 Range Exception
.	TokenNameDOT	
BAD_BOUNDARYPOINTS_ERR	TokenNameIdentifier	 BAD  BOUNDARYPOINTS  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"BAD_BOUNDARYPOINTS_ERR"	TokenNameStringLiteral	BAD_BOUNDARYPOINTS_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
DocumentFragment	TokenNameIdentifier	 Document Fragment
frag	TokenNameIdentifier	 frag
=	TokenNameEQUAL	
extractContents	TokenNameIdentifier	 extract Contents
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
insertNode	TokenNameIdentifier	 insert Node
(	TokenNameLPAREN	
newParent	TokenNameIdentifier	 new Parent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newParent	TokenNameIdentifier	 new Parent
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
frag	TokenNameIdentifier	 frag
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
selectNode	TokenNameIdentifier	 select Node
(	TokenNameLPAREN	
newParent	TokenNameIdentifier	 new Parent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Range	TokenNameIdentifier	 Range
cloneRange	TokenNameIdentifier	 clone Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDetach	TokenNameIdentifier	 f Detach
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INVALID_STATE_ERR	TokenNameIdentifier	 INVALID  STATE  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"INVALID_STATE_ERR"	TokenNameStringLiteral	INVALID_STATE_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Range	TokenNameIdentifier	 Range
range	TokenNameIdentifier	 range
=	TokenNameEQUAL	
fDocument	TokenNameIdentifier	 f Document
.	TokenNameDOT	
createRange	TokenNameIdentifier	 create Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
setStart	TokenNameIdentifier	 set Start
(	TokenNameLPAREN	
fStartContainer	TokenNameIdentifier	 f Start Container
,	TokenNameCOMMA	
fStartOffset	TokenNameIdentifier	 f Start Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
setEnd	TokenNameIdentifier	 set End
(	TokenNameLPAREN	
fEndContainer	TokenNameIdentifier	 f End Container
,	TokenNameCOMMA	
fEndOffset	TokenNameIdentifier	 f End Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
range	TokenNameIdentifier	 range
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDetach	TokenNameIdentifier	 f Detach
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INVALID_STATE_ERR	TokenNameIdentifier	 INVALID  STATE  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"INVALID_STATE_ERR"	TokenNameStringLiteral	INVALID_STATE_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
fStartContainer	TokenNameIdentifier	 f Start Container
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
stopNode	TokenNameIdentifier	 stop Node
=	TokenNameEQUAL	
fEndContainer	TokenNameIdentifier	 f End Container
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fStartContainer	TokenNameIdentifier	 f Start Container
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
||	TokenNameOR_OR	
fStartContainer	TokenNameIdentifier	 f Start Container
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fStartContainer	TokenNameIdentifier	 f Start Container
==	TokenNameEQUAL_EQUAL	
fEndContainer	TokenNameIdentifier	 f End Container
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fStartContainer	TokenNameIdentifier	 f Start Container
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
fStartOffset	TokenNameIdentifier	 f Start Offset
,	TokenNameCOMMA	
fEndOffset	TokenNameIdentifier	 f End Offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fStartContainer	TokenNameIdentifier	 f Start Container
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
fStartOffset	TokenNameIdentifier	 f Start Offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//fEndContainer!=fStartContainer 	TokenNameCOMMENT_LINE	fEndContainer!=fStartContainer 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
//fStartContainer is not a TextNode 	TokenNameCOMMENT_LINE	fStartContainer is not a TextNode 
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fStartOffset	TokenNameIdentifier	 f Start Offset
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//find a first node within a range, specified by fStartOffset 	TokenNameCOMMENT_LINE	find a first node within a range, specified by fStartOffset 
int	TokenNameint	
counter	TokenNameIdentifier	 counter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
counter	TokenNameIdentifier	 counter
<	TokenNameLESS	
fStartOffset	TokenNameIdentifier	 f Start Offset
&&	TokenNameAND_AND	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
counter	TokenNameIdentifier	 counter
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
fStartContainer	TokenNameIdentifier	 f Start Container
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fEndContainer	TokenNameIdentifier	 f End Container
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
&&	TokenNameAND_AND	
fEndContainer	TokenNameIdentifier	 f End Container
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
fEndOffset	TokenNameIdentifier	 f End Offset
;	TokenNameSEMICOLON	
stopNode	TokenNameIdentifier	 stop Node
=	TokenNameEQUAL	
fEndContainer	TokenNameIdentifier	 f End Container
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
stopNode	TokenNameIdentifier	 stop Node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
stopNode	TokenNameIdentifier	 stop Node
=	TokenNameEQUAL	
stopNode	TokenNameIdentifier	 stop Node
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
stopNode	TokenNameIdentifier	 stop Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
stopNode	TokenNameIdentifier	 stop Node
=	TokenNameEQUAL	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
fEndContainer	TokenNameIdentifier	 f End Container
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
stopNode	TokenNameIdentifier	 stop Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//look into all kids of the Range 	TokenNameCOMMENT_LINE	look into all kids of the Range 
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
||	TokenNameOR_OR	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fEndContainer	TokenNameIdentifier	 f End Container
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
||	TokenNameOR_OR	
fEndContainer	TokenNameIdentifier	 f End Container
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fEndContainer	TokenNameIdentifier	 f End Container
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fEndOffset	TokenNameIdentifier	 f End Offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
detach	TokenNameIdentifier	 detach
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDetach	TokenNameIdentifier	 f Detach
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INVALID_STATE_ERR	TokenNameIdentifier	 INVALID  STATE  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"INVALID_STATE_ERR"	TokenNameStringLiteral	INVALID_STATE_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fDetach	TokenNameIdentifier	 f Detach
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
fDocument	TokenNameIdentifier	 f Document
.	TokenNameDOT	
removeRange	TokenNameIdentifier	 remove Range
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Mutation functions 	TokenNameCOMMENT_LINE	Mutation functions 
// 	TokenNameCOMMENT_LINE	 
/** Signal other Ranges to update their start/end * containers/offsets. The data has already been split * into the two Nodes. */	TokenNameCOMMENT_JAVADOC	 Signal other Ranges to update their start/end containers/offsets. The data has already been split into the two Nodes. 
void	TokenNamevoid	
signalSplitData	TokenNameIdentifier	 signal Split Data
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
newNode	TokenNameIdentifier	 new Node
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fSplitNode	TokenNameIdentifier	 f Split Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
// notify document 	TokenNameCOMMENT_LINE	notify document 
fDocument	TokenNameIdentifier	 f Document
.	TokenNameDOT	
splitData	TokenNameIdentifier	 split Data
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
newNode	TokenNameIdentifier	 new Node
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fSplitNode	TokenNameIdentifier	 f Split Node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Fix up this Range if another Range has split a Text Node * into 2 Nodes. */	TokenNameCOMMENT_JAVADOC	 Fix up this Range if another Range has split a Text Node into 2 Nodes. 
void	TokenNamevoid	
receiveSplitData	TokenNameIdentifier	 receive Split Data
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
newNode	TokenNameIdentifier	 new Node
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
newNode	TokenNameIdentifier	 new Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fSplitNode	TokenNameIdentifier	 f Split Node
==	TokenNameEQUAL_EQUAL	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
fStartContainer	TokenNameIdentifier	 f Start Container
&&	TokenNameAND_AND	
fStartContainer	TokenNameIdentifier	 f Start Container
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fStartOffset	TokenNameIdentifier	 f Start Offset
>	TokenNameGREATER	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fStartOffset	TokenNameIdentifier	 f Start Offset
=	TokenNameEQUAL	
fStartOffset	TokenNameIdentifier	 f Start Offset
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
fStartContainer	TokenNameIdentifier	 f Start Container
=	TokenNameEQUAL	
newNode	TokenNameIdentifier	 new Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
fEndContainer	TokenNameIdentifier	 f End Container
&&	TokenNameAND_AND	
fEndContainer	TokenNameIdentifier	 f End Container
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fEndOffset	TokenNameIdentifier	 f End Offset
>	TokenNameGREATER	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fEndOffset	TokenNameIdentifier	 f End Offset
=	TokenNameEQUAL	
fEndOffset	TokenNameIdentifier	 f End Offset
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
fEndContainer	TokenNameIdentifier	 f End Container
=	TokenNameEQUAL	
newNode	TokenNameIdentifier	 new Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** This function inserts text into a Node and invokes * a method to fix-up all other Ranges. */	TokenNameCOMMENT_JAVADOC	 This function inserts text into a Node and invokes a method to fix-up all other Ranges. 
void	TokenNamevoid	
deleteData	TokenNameIdentifier	 delete Data
(	TokenNameLPAREN	
CharacterData	TokenNameIdentifier	 Character Data
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDeleteNode	TokenNameIdentifier	 f Delete Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
deleteData	TokenNameIdentifier	 delete Data
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fDeleteNode	TokenNameIdentifier	 f Delete Node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** This function is called from DOM. * The text has already beeen inserted. * Fix-up any offsets. */	TokenNameCOMMENT_JAVADOC	 This function is called from DOM. The text has already beeen inserted. Fix-up any offsets. 
void	TokenNamevoid	
receiveDeletedText	TokenNameIdentifier	 receive Deleted Text
(	TokenNameLPAREN	
CharacterDataImpl	TokenNameIdentifier	 Character Data Impl
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fDeleteNode	TokenNameIdentifier	 f Delete Node
==	TokenNameEQUAL_EQUAL	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
fStartContainer	TokenNameIdentifier	 f Start Container
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fStartOffset	TokenNameIdentifier	 f Start Offset
>	TokenNameGREATER	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fStartOffset	TokenNameIdentifier	 f Start Offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
(	TokenNameLPAREN	
fStartOffset	TokenNameIdentifier	 f Start Offset
-	TokenNameMINUS	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
fStartOffset	TokenNameIdentifier	 f Start Offset
>	TokenNameGREATER	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fStartOffset	TokenNameIdentifier	 f Start Offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
fEndContainer	TokenNameIdentifier	 f End Container
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fEndOffset	TokenNameIdentifier	 f End Offset
>	TokenNameGREATER	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fEndOffset	TokenNameIdentifier	 f End Offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
(	TokenNameLPAREN	
fEndOffset	TokenNameIdentifier	 f End Offset
-	TokenNameMINUS	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
fEndOffset	TokenNameIdentifier	 f End Offset
>	TokenNameGREATER	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fEndOffset	TokenNameIdentifier	 f End Offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** This function inserts text into a Node and invokes * a method to fix-up all other Ranges. */	TokenNameCOMMENT_JAVADOC	 This function inserts text into a Node and invokes a method to fix-up all other Ranges. 
void	TokenNamevoid	
insertData	TokenNameIdentifier	 insert Data
(	TokenNameLPAREN	
CharacterData	TokenNameIdentifier	 Character Data
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
int	TokenNameint	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
insert	TokenNameIdentifier	 insert
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fInsertNode	TokenNameIdentifier	 f Insert Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
insertData	TokenNameIdentifier	 insert Data
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
insert	TokenNameIdentifier	 insert
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fInsertNode	TokenNameIdentifier	 f Insert Node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This function is called from DOM. * The text has already beeen inserted. * Fix-up any offsets. */	TokenNameCOMMENT_JAVADOC	 This function is called from DOM. The text has already beeen inserted. Fix-up any offsets. 
void	TokenNamevoid	
receiveInsertedText	TokenNameIdentifier	 receive Inserted Text
(	TokenNameLPAREN	
CharacterDataImpl	TokenNameIdentifier	 Character Data Impl
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
int	TokenNameint	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fInsertNode	TokenNameIdentifier	 f Insert Node
==	TokenNameEQUAL_EQUAL	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
fStartContainer	TokenNameIdentifier	 f Start Container
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
fStartOffset	TokenNameIdentifier	 f Start Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fStartOffset	TokenNameIdentifier	 f Start Offset
=	TokenNameEQUAL	
fStartOffset	TokenNameIdentifier	 f Start Offset
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
fEndContainer	TokenNameIdentifier	 f End Container
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
fEndOffset	TokenNameIdentifier	 f End Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fEndOffset	TokenNameIdentifier	 f End Offset
=	TokenNameEQUAL	
fEndOffset	TokenNameIdentifier	 f End Offset
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This function is called from DOM. * The text has already beeen replaced. * Fix-up any offsets. */	TokenNameCOMMENT_JAVADOC	 This function is called from DOM. The text has already beeen replaced. Fix-up any offsets. 
void	TokenNamevoid	
receiveReplacedText	TokenNameIdentifier	 receive Replaced Text
(	TokenNameLPAREN	
CharacterDataImpl	TokenNameIdentifier	 Character Data Impl
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
fStartContainer	TokenNameIdentifier	 f Start Container
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fStartOffset	TokenNameIdentifier	 f Start Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
fEndContainer	TokenNameIdentifier	 f End Container
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fEndOffset	TokenNameIdentifier	 f End Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** This function is called from the DOM. * This node has already been inserted into the DOM. * Fix-up any offsets. */	TokenNameCOMMENT_JAVADOC	 This function is called from the DOM. This node has already been inserted into the DOM. Fix-up any offsets. 
public	TokenNamepublic	
void	TokenNamevoid	
insertedNodeFromDOM	TokenNameIdentifier	 inserted Node From DOM
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fInsertNode	TokenNameIdentifier	 f Insert Node
==	TokenNameEQUAL_EQUAL	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fInsertedFromRange	TokenNameIdentifier	 f Inserted From Range
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// Offsets are adjusted in Range.insertNode 	TokenNameCOMMENT_LINE	Offsets are adjusted in Range.insertNode 
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
==	TokenNameEQUAL_EQUAL	
fStartContainer	TokenNameIdentifier	 f Start Container
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
fStartContainer	TokenNameIdentifier	 f Start Container
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
fStartOffset	TokenNameIdentifier	 f Start Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fStartOffset	TokenNameIdentifier	 f Start Offset
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
==	TokenNameEQUAL_EQUAL	
fEndContainer	TokenNameIdentifier	 f End Container
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
fEndContainer	TokenNameIdentifier	 f End Container
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
fEndOffset	TokenNameIdentifier	 f End Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fEndOffset	TokenNameIdentifier	 f End Offset
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** This function is called within Range * instead of Node.removeChild, * so that the range can remember that it is actively * removing this child. */	TokenNameCOMMENT_JAVADOC	 This function is called within Range instead of Node.removeChild, so that the range can remember that it is actively removing this child. 
private	TokenNameprivate	
Node	TokenNameIdentifier	 Node
fRemoveChild	TokenNameIdentifier	 f Remove Child
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
removeChild	TokenNameIdentifier	 remove Child
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fRemoveChild	TokenNameIdentifier	 f Remove Child
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
removeChild	TokenNameIdentifier	 remove Child
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fRemoveChild	TokenNameIdentifier	 f Remove Child
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** This function must be called by the DOM _BEFORE_ * a node is deleted, because at that time it is * connected in the DOM tree, which we depend on. */	TokenNameCOMMENT_JAVADOC	 This function must be called by the DOM _BEFORE_ a node is deleted, because at that time it is connected in the DOM tree, which we depend on. 
void	TokenNamevoid	
removeNode	TokenNameIdentifier	 remove Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fRemoveChild	TokenNameIdentifier	 f Remove Child
==	TokenNameEQUAL_EQUAL	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
==	TokenNameEQUAL_EQUAL	
fStartContainer	TokenNameIdentifier	 f Start Container
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
fStartContainer	TokenNameIdentifier	 f Start Container
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
fStartOffset	TokenNameIdentifier	 f Start Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fStartOffset	TokenNameIdentifier	 f Start Offset
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
==	TokenNameEQUAL_EQUAL	
fEndContainer	TokenNameIdentifier	 f End Container
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
fEndContainer	TokenNameIdentifier	 f End Container
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
fEndOffset	TokenNameIdentifier	 f End Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fEndOffset	TokenNameIdentifier	 f End Offset
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//startContainer or endContainer or both is/are the ancestor(s) of the Node to be deleted 	TokenNameCOMMENT_LINE	startContainer or endContainer or both is/are the ancestor(s) of the Node to be deleted 
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
!=	TokenNameNOT_EQUAL	
fStartContainer	TokenNameIdentifier	 f Start Container
||	TokenNameOR_OR	
parent	TokenNameIdentifier	 parent
!=	TokenNameNOT_EQUAL	
fEndContainer	TokenNameIdentifier	 f End Container
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isAncestorOf	TokenNameIdentifier	 is Ancestor Of
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
fStartContainer	TokenNameIdentifier	 f Start Container
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fStartContainer	TokenNameIdentifier	 f Start Container
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
fStartOffset	TokenNameIdentifier	 f Start Offset
=	TokenNameEQUAL	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isAncestorOf	TokenNameIdentifier	 is Ancestor Of
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
fEndContainer	TokenNameIdentifier	 f End Container
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fEndContainer	TokenNameIdentifier	 f End Container
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
fEndOffset	TokenNameIdentifier	 f End Offset
=	TokenNameEQUAL	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Utility functions. 	TokenNameCOMMENT_LINE	Utility functions. 
// 	TokenNameCOMMENT_LINE	 
// parameters for traverseContents(int) 	TokenNameCOMMENT_LINE	parameters for traverseContents(int) 
//REVIST: use boolean, since there are only 2 now... 	TokenNameCOMMENT_LINE	REVIST: use boolean, since there are only 2 now... 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
EXTRACT_CONTENTS	TokenNameIdentifier	 EXTRACT  CONTENTS
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CLONE_CONTENTS	TokenNameIdentifier	 CLONE  CONTENTS
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DELETE_CONTENTS	TokenNameIdentifier	 DELETE  CONTENTS
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * This is the master routine invoked to visit the nodes * selected by this range. For each such node, different * actions are taken depending on the value of the * <code>how</code> argument. * * @param how Specifies what type of traversal is being * requested (extract, clone, or delete). * Legal values for this argument are: * * <ol> * <li><code>EXTRACT_CONTENTS</code> - will produce * a document fragment containing the range's content. * Partially selected nodes are copied, but fully * selected nodes are moved. * * <li><code>CLONE_CONTENTS</code> - will leave the * context tree of the range undisturbed, but sill * produced cloned content in a document fragment * * <li><code>DELETE_CONTENTS</code> - will delete from * the context tree of the range, all fully selected * nodes. * </ol> * * @return Returns a document fragment containing any * copied or extracted nodes. If the <code>how</code> * parameter was <code>DELETE_CONTENTS</code>, the * return value is null. */	TokenNameCOMMENT_JAVADOC	 This is the master routine invoked to visit the nodes selected by this range. For each such node, different actions are taken depending on the value of the <code>how</code> argument. * @param how Specifies what type of traversal is being requested (extract, clone, or delete). Legal values for this argument are: * <ol> <li><code>EXTRACT_CONTENTS</code> - will produce a document fragment containing the range's content. Partially selected nodes are copied, but fully selected nodes are moved. * <li><code>CLONE_CONTENTS</code> - will leave the context tree of the range undisturbed, but sill produced cloned content in a document fragment * <li><code>DELETE_CONTENTS</code> - will delete from the context tree of the range, all fully selected nodes. </ol> * @return Returns a document fragment containing any copied or extracted nodes. If the <code>how</code> parameter was <code>DELETE_CONTENTS</code>, the return value is null. 
private	TokenNameprivate	
DocumentFragment	TokenNameIdentifier	 Document Fragment
traverseContents	TokenNameIdentifier	 traverse Contents
(	TokenNameLPAREN	
int	TokenNameint	
how	TokenNameIdentifier	 how
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fStartContainer	TokenNameIdentifier	 f Start Container
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
fEndContainer	TokenNameIdentifier	 f End Container
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// REVIST: Throw exception? 	TokenNameCOMMENT_LINE	REVIST: Throw exception? 
}	TokenNameRBRACE	
//Check for a detached range. 	TokenNameCOMMENT_LINE	Check for a detached range. 
if	TokenNameif	
(	TokenNameLPAREN	
fDetach	TokenNameIdentifier	 f Detach
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INVALID_STATE_ERR	TokenNameIdentifier	 INVALID  STATE  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"INVALID_STATE_ERR"	TokenNameStringLiteral	INVALID_STATE_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* Traversal is accomplished by first determining the relationship between the endpoints of the range. For each of four significant relationships, we will delegate the traversal call to a method that can make appropriate assumptions. */	TokenNameCOMMENT_BLOCK	 Traversal is accomplished by first determining the relationship between the endpoints of the range. For each of four significant relationships, we will delegate the traversal call to a method that can make appropriate assumptions. 
// case 1: same container 	TokenNameCOMMENT_LINE	case 1: same container 
if	TokenNameif	
(	TokenNameLPAREN	
fStartContainer	TokenNameIdentifier	 f Start Container
==	TokenNameEQUAL_EQUAL	
fEndContainer	TokenNameIdentifier	 f End Container
)	TokenNameRPAREN	
return	TokenNamereturn	
traverseSameContainer	TokenNameIdentifier	 traverse Same Container
(	TokenNameLPAREN	
how	TokenNameIdentifier	 how
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// case 2: Child C of start container is ancestor of end container 	TokenNameCOMMENT_LINE	case 2: Child C of start container is ancestor of end container 
// This can be quickly tested by walking the parent chain of 	TokenNameCOMMENT_LINE	This can be quickly tested by walking the parent chain of 
// end container 	TokenNameCOMMENT_LINE	end container 
int	TokenNameint	
endContainerDepth	TokenNameIdentifier	 end Container Depth
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fEndContainer	TokenNameIdentifier	 f End Container
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
==	TokenNameEQUAL_EQUAL	
fStartContainer	TokenNameIdentifier	 f Start Container
)	TokenNameRPAREN	
return	TokenNamereturn	
traverseCommonStartContainer	TokenNameIdentifier	 traverse Common Start Container
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
how	TokenNameIdentifier	 how
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
endContainerDepth	TokenNameIdentifier	 end Container Depth
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// case 3: Child C of container B is ancestor of A 	TokenNameCOMMENT_LINE	case 3: Child C of container B is ancestor of A 
// This can be quickly tested by walking the parent chain of A 	TokenNameCOMMENT_LINE	This can be quickly tested by walking the parent chain of A 
int	TokenNameint	
startContainerDepth	TokenNameIdentifier	 start Container Depth
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fStartContainer	TokenNameIdentifier	 f Start Container
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
==	TokenNameEQUAL_EQUAL	
fEndContainer	TokenNameIdentifier	 f End Container
)	TokenNameRPAREN	
return	TokenNamereturn	
traverseCommonEndContainer	TokenNameIdentifier	 traverse Common End Container
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
how	TokenNameIdentifier	 how
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
startContainerDepth	TokenNameIdentifier	 start Container Depth
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// case 4: There is a common ancestor container. Find the 	TokenNameCOMMENT_LINE	case 4: There is a common ancestor container. Find the 
// ancestor siblings that are children of that container. 	TokenNameCOMMENT_LINE	ancestor siblings that are children of that container. 
int	TokenNameint	
depthDiff	TokenNameIdentifier	 depth Diff
=	TokenNameEQUAL	
startContainerDepth	TokenNameIdentifier	 start Container Depth
-	TokenNameMINUS	
endContainerDepth	TokenNameIdentifier	 end Container Depth
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
startNode	TokenNameIdentifier	 start Node
=	TokenNameEQUAL	
fStartContainer	TokenNameIdentifier	 f Start Container
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
depthDiff	TokenNameIdentifier	 depth Diff
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
startNode	TokenNameIdentifier	 start Node
=	TokenNameEQUAL	
startNode	TokenNameIdentifier	 start Node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
depthDiff	TokenNameIdentifier	 depth Diff
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Node	TokenNameIdentifier	 Node
endNode	TokenNameIdentifier	 end Node
=	TokenNameEQUAL	
fEndContainer	TokenNameIdentifier	 f End Container
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
depthDiff	TokenNameIdentifier	 depth Diff
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
endNode	TokenNameIdentifier	 end Node
=	TokenNameEQUAL	
endNode	TokenNameIdentifier	 end Node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
depthDiff	TokenNameIdentifier	 depth Diff
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ascend the ancestor hierarchy until we have a common parent. 	TokenNameCOMMENT_LINE	ascend the ancestor hierarchy until we have a common parent. 
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
sp	TokenNameIdentifier	 sp
=	TokenNameEQUAL	
startNode	TokenNameIdentifier	 start Node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ep	TokenNameIdentifier	 ep
=	TokenNameEQUAL	
endNode	TokenNameIdentifier	 end Node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sp	TokenNameIdentifier	 sp
!=	TokenNameNOT_EQUAL	
ep	TokenNameIdentifier	 ep
;	TokenNameSEMICOLON	
sp	TokenNameIdentifier	 sp
=	TokenNameEQUAL	
sp	TokenNameIdentifier	 sp
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ep	TokenNameIdentifier	 ep
=	TokenNameEQUAL	
ep	TokenNameIdentifier	 ep
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
startNode	TokenNameIdentifier	 start Node
=	TokenNameEQUAL	
sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
endNode	TokenNameIdentifier	 end Node
=	TokenNameEQUAL	
ep	TokenNameIdentifier	 ep
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
traverseCommonAncestors	TokenNameIdentifier	 traverse Common Ancestors
(	TokenNameLPAREN	
startNode	TokenNameIdentifier	 start Node
,	TokenNameCOMMA	
endNode	TokenNameIdentifier	 end Node
,	TokenNameCOMMA	
how	TokenNameIdentifier	 how
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Visits the nodes selected by this range when we know * a-priori that the start and end containers are the same. * This method is invoked by the generic <code>traverse</code> * method. * * @param how Specifies what type of traversal is being * requested (extract, clone, or delete). * Legal values for this argument are: * * <ol> * <li><code>EXTRACT_CONTENTS</code> - will produce * a document fragment containing the range's content. * Partially selected nodes are copied, but fully * selected nodes are moved. * * <li><code>CLONE_CONTENTS</code> - will leave the * context tree of the range undisturbed, but sill * produced cloned content in a document fragment * * <li><code>DELETE_CONTENTS</code> - will delete from * the context tree of the range, all fully selected * nodes. * </ol> * * @return Returns a document fragment containing any * copied or extracted nodes. If the <code>how</code> * parameter was <code>DELETE_CONTENTS</code>, the * return value is null. */	TokenNameCOMMENT_JAVADOC	 Visits the nodes selected by this range when we know a-priori that the start and end containers are the same. This method is invoked by the generic <code>traverse</code> method. * @param how Specifies what type of traversal is being requested (extract, clone, or delete). Legal values for this argument are: * <ol> <li><code>EXTRACT_CONTENTS</code> - will produce a document fragment containing the range's content. Partially selected nodes are copied, but fully selected nodes are moved. * <li><code>CLONE_CONTENTS</code> - will leave the context tree of the range undisturbed, but sill produced cloned content in a document fragment * <li><code>DELETE_CONTENTS</code> - will delete from the context tree of the range, all fully selected nodes. </ol> * @return Returns a document fragment containing any copied or extracted nodes. If the <code>how</code> parameter was <code>DELETE_CONTENTS</code>, the return value is null. 
private	TokenNameprivate	
DocumentFragment	TokenNameIdentifier	 Document Fragment
traverseSameContainer	TokenNameIdentifier	 traverse Same Container
(	TokenNameLPAREN	
int	TokenNameint	
how	TokenNameIdentifier	 how
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DocumentFragment	TokenNameIdentifier	 Document Fragment
frag	TokenNameIdentifier	 frag
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
how	TokenNameIdentifier	 how
!=	TokenNameNOT_EQUAL	
DELETE_CONTENTS	TokenNameIdentifier	 DELETE  CONTENTS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
frag	TokenNameIdentifier	 frag
=	TokenNameEQUAL	
fDocument	TokenNameIdentifier	 f Document
.	TokenNameDOT	
createDocumentFragment	TokenNameIdentifier	 create Document Fragment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If selection is empty, just return the fragment 	TokenNameCOMMENT_LINE	If selection is empty, just return the fragment 
if	TokenNameif	
(	TokenNameLPAREN	
fStartOffset	TokenNameIdentifier	 f Start Offset
==	TokenNameEQUAL_EQUAL	
fEndOffset	TokenNameIdentifier	 f End Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
frag	TokenNameIdentifier	 frag
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Text, CDATASection, Comment and ProcessingInstruction nodes need special case handling 	TokenNameCOMMENT_LINE	Text, CDATASection, Comment and ProcessingInstruction nodes need special case handling 
final	TokenNamefinal	
short	TokenNameshort	
nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
fStartContainer	TokenNameIdentifier	 f Start Container
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nodeType	TokenNameIdentifier	 node Type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
||	TokenNameOR_OR	
nodeType	TokenNameIdentifier	 node Type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
||	TokenNameOR_OR	
nodeType	TokenNameIdentifier	 node Type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
COMMENT_NODE	TokenNameIdentifier	 COMMENT  NODE
||	TokenNameOR_OR	
nodeType	TokenNameIdentifier	 node Type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
PROCESSING_INSTRUCTION_NODE	TokenNameIdentifier	 PROCESSING  INSTRUCTION  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// get the substring 	TokenNameCOMMENT_LINE	get the substring 
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
fStartContainer	TokenNameIdentifier	 f Start Container
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
sub	TokenNameIdentifier	 sub
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
fStartOffset	TokenNameIdentifier	 f Start Offset
,	TokenNameCOMMA	
fEndOffset	TokenNameIdentifier	 f End Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set the original text node to its new value 	TokenNameCOMMENT_LINE	set the original text node to its new value 
if	TokenNameif	
(	TokenNameLPAREN	
how	TokenNameIdentifier	 how
!=	TokenNameNOT_EQUAL	
CLONE_CONTENTS	TokenNameIdentifier	 CLONE  CONTENTS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CharacterDataImpl	TokenNameIdentifier	 Character Data Impl
)	TokenNameRPAREN	
fStartContainer	TokenNameIdentifier	 f Start Container
)	TokenNameRPAREN	
.	TokenNameDOT	
deleteData	TokenNameIdentifier	 delete Data
(	TokenNameLPAREN	
fStartOffset	TokenNameIdentifier	 f Start Offset
,	TokenNameCOMMA	
fEndOffset	TokenNameIdentifier	 f End Offset
-	TokenNameMINUS	
fStartOffset	TokenNameIdentifier	 f Start Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Nothing is partially selected, so collapse to start point 	TokenNameCOMMENT_LINE	Nothing is partially selected, so collapse to start point 
collapse	TokenNameIdentifier	 collapse
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
how	TokenNameIdentifier	 how
==	TokenNameEQUAL_EQUAL	
DELETE_CONTENTS	TokenNameIdentifier	 DELETE  CONTENTS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nodeType	TokenNameIdentifier	 node Type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
frag	TokenNameIdentifier	 frag
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
fDocument	TokenNameIdentifier	 f Document
.	TokenNameDOT	
createTextNode	TokenNameIdentifier	 create Text Node
(	TokenNameLPAREN	
sub	TokenNameIdentifier	 sub
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
nodeType	TokenNameIdentifier	 node Type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
frag	TokenNameIdentifier	 frag
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
fDocument	TokenNameIdentifier	 f Document
.	TokenNameDOT	
createCDATASection	TokenNameIdentifier	 create CDATA Section
(	TokenNameLPAREN	
sub	TokenNameIdentifier	 sub
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
nodeType	TokenNameIdentifier	 node Type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
COMMENT_NODE	TokenNameIdentifier	 COMMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
frag	TokenNameIdentifier	 frag
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
fDocument	TokenNameIdentifier	 f Document
.	TokenNameDOT	
createComment	TokenNameIdentifier	 create Comment
(	TokenNameLPAREN	
sub	TokenNameIdentifier	 sub
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// nodeType == Node.PROCESSING_INSTRUCTION_NODE 	TokenNameCOMMENT_LINE	nodeType == Node.PROCESSING_INSTRUCTION_NODE 
frag	TokenNameIdentifier	 frag
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
fDocument	TokenNameIdentifier	 f Document
.	TokenNameDOT	
createProcessingInstruction	TokenNameIdentifier	 create Processing Instruction
(	TokenNameLPAREN	
fStartContainer	TokenNameIdentifier	 f Start Container
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
sub	TokenNameIdentifier	 sub
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
frag	TokenNameIdentifier	 frag
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Copy nodes between the start/end offsets. 	TokenNameCOMMENT_LINE	Copy nodes between the start/end offsets. 
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
getSelectedNode	TokenNameIdentifier	 get Selected Node
(	TokenNameLPAREN	
fStartContainer	TokenNameIdentifier	 f Start Container
,	TokenNameCOMMA	
fStartOffset	TokenNameIdentifier	 f Start Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
cnt	TokenNameIdentifier	 cnt
=	TokenNameEQUAL	
fEndOffset	TokenNameIdentifier	 f End Offset
-	TokenNameMINUS	
fStartOffset	TokenNameIdentifier	 f Start Offset
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
cnt	TokenNameIdentifier	 cnt
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
sibling	TokenNameIdentifier	 sibling
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
xferNode	TokenNameIdentifier	 xfer Node
=	TokenNameEQUAL	
traverseFullySelected	TokenNameIdentifier	 traverse Fully Selected
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
how	TokenNameIdentifier	 how
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
frag	TokenNameIdentifier	 frag
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
frag	TokenNameIdentifier	 frag
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
xferNode	TokenNameIdentifier	 xfer Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
cnt	TokenNameIdentifier	 cnt
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
sibling	TokenNameIdentifier	 sibling
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Nothing is partially selected, so collapse to start point 	TokenNameCOMMENT_LINE	Nothing is partially selected, so collapse to start point 
if	TokenNameif	
(	TokenNameLPAREN	
how	TokenNameIdentifier	 how
!=	TokenNameNOT_EQUAL	
CLONE_CONTENTS	TokenNameIdentifier	 CLONE  CONTENTS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
collapse	TokenNameIdentifier	 collapse
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
frag	TokenNameIdentifier	 frag
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Visits the nodes selected by this range when we know * a-priori that the start and end containers are not the * same, but the start container is an ancestor of the * end container. This method is invoked by the generic * <code>traverse</code> method. * * @param endAncestor * The ancestor of the end container that is a direct child * of the start container. * * @param how Specifies what type of traversal is being * requested (extract, clone, or delete). * Legal values for this argument are: * * <ol> * <li><code>EXTRACT_CONTENTS</code> - will produce * a document fragment containing the range's content. * Partially selected nodes are copied, but fully * selected nodes are moved. * * <li><code>CLONE_CONTENTS</code> - will leave the * context tree of the range undisturbed, but sill * produced cloned content in a document fragment * * <li><code>DELETE_CONTENTS</code> - will delete from * the context tree of the range, all fully selected * nodes. * </ol> * * @return Returns a document fragment containing any * copied or extracted nodes. If the <code>how</code> * parameter was <code>DELETE_CONTENTS</code>, the * return value is null. */	TokenNameCOMMENT_JAVADOC	 Visits the nodes selected by this range when we know a-priori that the start and end containers are not the same, but the start container is an ancestor of the end container. This method is invoked by the generic <code>traverse</code> method. * @param endAncestor The ancestor of the end container that is a direct child of the start container. * @param how Specifies what type of traversal is being requested (extract, clone, or delete). Legal values for this argument are: * <ol> <li><code>EXTRACT_CONTENTS</code> - will produce a document fragment containing the range's content. Partially selected nodes are copied, but fully selected nodes are moved. * <li><code>CLONE_CONTENTS</code> - will leave the context tree of the range undisturbed, but sill produced cloned content in a document fragment * <li><code>DELETE_CONTENTS</code> - will delete from the context tree of the range, all fully selected nodes. </ol> * @return Returns a document fragment containing any copied or extracted nodes. If the <code>how</code> parameter was <code>DELETE_CONTENTS</code>, the return value is null. 
private	TokenNameprivate	
DocumentFragment	TokenNameIdentifier	 Document Fragment
traverseCommonStartContainer	TokenNameIdentifier	 traverse Common Start Container
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
endAncestor	TokenNameIdentifier	 end Ancestor
,	TokenNameCOMMA	
int	TokenNameint	
how	TokenNameIdentifier	 how
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DocumentFragment	TokenNameIdentifier	 Document Fragment
frag	TokenNameIdentifier	 frag
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
how	TokenNameIdentifier	 how
!=	TokenNameNOT_EQUAL	
DELETE_CONTENTS	TokenNameIdentifier	 DELETE  CONTENTS
)	TokenNameRPAREN	
frag	TokenNameIdentifier	 frag
=	TokenNameEQUAL	
fDocument	TokenNameIdentifier	 f Document
.	TokenNameDOT	
createDocumentFragment	TokenNameIdentifier	 create Document Fragment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
traverseRightBoundary	TokenNameIdentifier	 traverse Right Boundary
(	TokenNameLPAREN	
endAncestor	TokenNameIdentifier	 end Ancestor
,	TokenNameCOMMA	
how	TokenNameIdentifier	 how
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
frag	TokenNameIdentifier	 frag
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
frag	TokenNameIdentifier	 frag
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
endIdx	TokenNameIdentifier	 end Idx
=	TokenNameEQUAL	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
endAncestor	TokenNameIdentifier	 end Ancestor
,	TokenNameCOMMA	
fStartContainer	TokenNameIdentifier	 f Start Container
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
cnt	TokenNameIdentifier	 cnt
=	TokenNameEQUAL	
endIdx	TokenNameIdentifier	 end Idx
-	TokenNameMINUS	
fStartOffset	TokenNameIdentifier	 f Start Offset
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cnt	TokenNameIdentifier	 cnt
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Collapse to just before the endAncestor, which 	TokenNameCOMMENT_LINE	Collapse to just before the endAncestor, which 
// is partially selected. 	TokenNameCOMMENT_LINE	is partially selected. 
if	TokenNameif	
(	TokenNameLPAREN	
how	TokenNameIdentifier	 how
!=	TokenNameNOT_EQUAL	
CLONE_CONTENTS	TokenNameIdentifier	 CLONE  CONTENTS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setEndBefore	TokenNameIdentifier	 set End Before
(	TokenNameLPAREN	
endAncestor	TokenNameIdentifier	 end Ancestor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
collapse	TokenNameIdentifier	 collapse
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
frag	TokenNameIdentifier	 frag
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
endAncestor	TokenNameIdentifier	 end Ancestor
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
cnt	TokenNameIdentifier	 cnt
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
sibling	TokenNameIdentifier	 sibling
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
xferNode	TokenNameIdentifier	 xfer Node
=	TokenNameEQUAL	
traverseFullySelected	TokenNameIdentifier	 traverse Fully Selected
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
how	TokenNameIdentifier	 how
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
frag	TokenNameIdentifier	 frag
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
frag	TokenNameIdentifier	 frag
.	TokenNameDOT	
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
xferNode	TokenNameIdentifier	 xfer Node
,	TokenNameCOMMA	
frag	TokenNameIdentifier	 frag
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
cnt	TokenNameIdentifier	 cnt
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
sibling	TokenNameIdentifier	 sibling
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Collapse to just before the endAncestor, which 	TokenNameCOMMENT_LINE	Collapse to just before the endAncestor, which 
// is partially selected. 	TokenNameCOMMENT_LINE	is partially selected. 
if	TokenNameif	
(	TokenNameLPAREN	
how	TokenNameIdentifier	 how
!=	TokenNameNOT_EQUAL	
CLONE_CONTENTS	TokenNameIdentifier	 CLONE  CONTENTS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setEndBefore	TokenNameIdentifier	 set End Before
(	TokenNameLPAREN	
endAncestor	TokenNameIdentifier	 end Ancestor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
collapse	TokenNameIdentifier	 collapse
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
frag	TokenNameIdentifier	 frag
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Visits the nodes selected by this range when we know * a-priori that the start and end containers are not the * same, but the end container is an ancestor of the * start container. This method is invoked by the generic * <code>traverse</code> method. * * @param startAncestor * The ancestor of the start container that is a direct * child of the end container. * * @param how Specifies what type of traversal is being * requested (extract, clone, or delete). * Legal values for this argument are: * * <ol> * <li><code>EXTRACT_CONTENTS</code> - will produce * a document fragment containing the range's content. * Partially selected nodes are copied, but fully * selected nodes are moved. * * <li><code>CLONE_CONTENTS</code> - will leave the * context tree of the range undisturbed, but sill * produced cloned content in a document fragment * * <li><code>DELETE_CONTENTS</code> - will delete from * the context tree of the range, all fully selected * nodes. * </ol> * * @return Returns a document fragment containing any * copied or extracted nodes. If the <code>how</code> * parameter was <code>DELETE_CONTENTS</code>, the * return value is null. */	TokenNameCOMMENT_JAVADOC	 Visits the nodes selected by this range when we know a-priori that the start and end containers are not the same, but the end container is an ancestor of the start container. This method is invoked by the generic <code>traverse</code> method. * @param startAncestor The ancestor of the start container that is a direct child of the end container. * @param how Specifies what type of traversal is being requested (extract, clone, or delete). Legal values for this argument are: * <ol> <li><code>EXTRACT_CONTENTS</code> - will produce a document fragment containing the range's content. Partially selected nodes are copied, but fully selected nodes are moved. * <li><code>CLONE_CONTENTS</code> - will leave the context tree of the range undisturbed, but sill produced cloned content in a document fragment * <li><code>DELETE_CONTENTS</code> - will delete from the context tree of the range, all fully selected nodes. </ol> * @return Returns a document fragment containing any copied or extracted nodes. If the <code>how</code> parameter was <code>DELETE_CONTENTS</code>, the return value is null. 
private	TokenNameprivate	
DocumentFragment	TokenNameIdentifier	 Document Fragment
traverseCommonEndContainer	TokenNameIdentifier	 traverse Common End Container
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
startAncestor	TokenNameIdentifier	 start Ancestor
,	TokenNameCOMMA	
int	TokenNameint	
how	TokenNameIdentifier	 how
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DocumentFragment	TokenNameIdentifier	 Document Fragment
frag	TokenNameIdentifier	 frag
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
how	TokenNameIdentifier	 how
!=	TokenNameNOT_EQUAL	
DELETE_CONTENTS	TokenNameIdentifier	 DELETE  CONTENTS
)	TokenNameRPAREN	
frag	TokenNameIdentifier	 frag
=	TokenNameEQUAL	
fDocument	TokenNameIdentifier	 f Document
.	TokenNameDOT	
createDocumentFragment	TokenNameIdentifier	 create Document Fragment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
traverseLeftBoundary	TokenNameIdentifier	 traverse Left Boundary
(	TokenNameLPAREN	
startAncestor	TokenNameIdentifier	 start Ancestor
,	TokenNameCOMMA	
how	TokenNameIdentifier	 how
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
frag	TokenNameIdentifier	 frag
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
frag	TokenNameIdentifier	 frag
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
startIdx	TokenNameIdentifier	 start Idx
=	TokenNameEQUAL	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
startAncestor	TokenNameIdentifier	 start Ancestor
,	TokenNameCOMMA	
fEndContainer	TokenNameIdentifier	 f End Container
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
startIdx	TokenNameIdentifier	 start Idx
;	TokenNameSEMICOLON	
// Because we already traversed it.... 	TokenNameCOMMENT_LINE	Because we already traversed it.... 
int	TokenNameint	
cnt	TokenNameIdentifier	 cnt
=	TokenNameEQUAL	
fEndOffset	TokenNameIdentifier	 f End Offset
-	TokenNameMINUS	
startIdx	TokenNameIdentifier	 start Idx
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
startAncestor	TokenNameIdentifier	 start Ancestor
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
cnt	TokenNameIdentifier	 cnt
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
sibling	TokenNameIdentifier	 sibling
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
xferNode	TokenNameIdentifier	 xfer Node
=	TokenNameEQUAL	
traverseFullySelected	TokenNameIdentifier	 traverse Fully Selected
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
how	TokenNameIdentifier	 how
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
frag	TokenNameIdentifier	 frag
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
frag	TokenNameIdentifier	 frag
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
xferNode	TokenNameIdentifier	 xfer Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
cnt	TokenNameIdentifier	 cnt
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
sibling	TokenNameIdentifier	 sibling
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
how	TokenNameIdentifier	 how
!=	TokenNameNOT_EQUAL	
CLONE_CONTENTS	TokenNameIdentifier	 CLONE  CONTENTS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setStartAfter	TokenNameIdentifier	 set Start After
(	TokenNameLPAREN	
startAncestor	TokenNameIdentifier	 start Ancestor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
collapse	TokenNameIdentifier	 collapse
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
frag	TokenNameIdentifier	 frag
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Visits the nodes selected by this range when we know * a-priori that the start and end containers are not * the same, and we also know that neither the start * nor end container is an ancestor of the other. * This method is invoked by * the generic <code>traverse</code> method. * * @param startAncestor * Given a common ancestor of the start and end containers, * this parameter is the ancestor (or self) of the start * container that is a direct child of the common ancestor. * * @param endAncestor * Given a common ancestor of the start and end containers, * this parameter is the ancestor (or self) of the end * container that is a direct child of the common ancestor. * * @param how Specifies what type of traversal is being * requested (extract, clone, or delete). * Legal values for this argument are: * * <ol> * <li><code>EXTRACT_CONTENTS</code> - will produce * a document fragment containing the range's content. * Partially selected nodes are copied, but fully * selected nodes are moved. * * <li><code>CLONE_CONTENTS</code> - will leave the * context tree of the range undisturbed, but sill * produced cloned content in a document fragment * * <li><code>DELETE_CONTENTS</code> - will delete from * the context tree of the range, all fully selected * nodes. * </ol> * * @return Returns a document fragment containing any * copied or extracted nodes. If the <code>how</code> * parameter was <code>DELETE_CONTENTS</code>, the * return value is null. */	TokenNameCOMMENT_JAVADOC	 Visits the nodes selected by this range when we know a-priori that the start and end containers are not the same, and we also know that neither the start nor end container is an ancestor of the other. This method is invoked by the generic <code>traverse</code> method. * @param startAncestor Given a common ancestor of the start and end containers, this parameter is the ancestor (or self) of the start container that is a direct child of the common ancestor. * @param endAncestor Given a common ancestor of the start and end containers, this parameter is the ancestor (or self) of the end container that is a direct child of the common ancestor. * @param how Specifies what type of traversal is being requested (extract, clone, or delete). Legal values for this argument are: * <ol> <li><code>EXTRACT_CONTENTS</code> - will produce a document fragment containing the range's content. Partially selected nodes are copied, but fully selected nodes are moved. * <li><code>CLONE_CONTENTS</code> - will leave the context tree of the range undisturbed, but sill produced cloned content in a document fragment * <li><code>DELETE_CONTENTS</code> - will delete from the context tree of the range, all fully selected nodes. </ol> * @return Returns a document fragment containing any copied or extracted nodes. If the <code>how</code> parameter was <code>DELETE_CONTENTS</code>, the return value is null. 
private	TokenNameprivate	
DocumentFragment	TokenNameIdentifier	 Document Fragment
traverseCommonAncestors	TokenNameIdentifier	 traverse Common Ancestors
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
startAncestor	TokenNameIdentifier	 start Ancestor
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
endAncestor	TokenNameIdentifier	 end Ancestor
,	TokenNameCOMMA	
int	TokenNameint	
how	TokenNameIdentifier	 how
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DocumentFragment	TokenNameIdentifier	 Document Fragment
frag	TokenNameIdentifier	 frag
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
how	TokenNameIdentifier	 how
!=	TokenNameNOT_EQUAL	
DELETE_CONTENTS	TokenNameIdentifier	 DELETE  CONTENTS
)	TokenNameRPAREN	
frag	TokenNameIdentifier	 frag
=	TokenNameEQUAL	
fDocument	TokenNameIdentifier	 f Document
.	TokenNameDOT	
createDocumentFragment	TokenNameIdentifier	 create Document Fragment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
traverseLeftBoundary	TokenNameIdentifier	 traverse Left Boundary
(	TokenNameLPAREN	
startAncestor	TokenNameIdentifier	 start Ancestor
,	TokenNameCOMMA	
how	TokenNameIdentifier	 how
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
frag	TokenNameIdentifier	 frag
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
frag	TokenNameIdentifier	 frag
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
commonParent	TokenNameIdentifier	 common Parent
=	TokenNameEQUAL	
startAncestor	TokenNameIdentifier	 start Ancestor
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
startOffset	TokenNameIdentifier	 start Offset
=	TokenNameEQUAL	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
startAncestor	TokenNameIdentifier	 start Ancestor
,	TokenNameCOMMA	
commonParent	TokenNameIdentifier	 common Parent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
endOffset	TokenNameIdentifier	 end Offset
=	TokenNameEQUAL	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
endAncestor	TokenNameIdentifier	 end Ancestor
,	TokenNameCOMMA	
commonParent	TokenNameIdentifier	 common Parent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
startOffset	TokenNameIdentifier	 start Offset
;	TokenNameSEMICOLON	
int	TokenNameint	
cnt	TokenNameIdentifier	 cnt
=	TokenNameEQUAL	
endOffset	TokenNameIdentifier	 end Offset
-	TokenNameMINUS	
startOffset	TokenNameIdentifier	 start Offset
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
sibling	TokenNameIdentifier	 sibling
=	TokenNameEQUAL	
startAncestor	TokenNameIdentifier	 start Ancestor
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
cnt	TokenNameIdentifier	 cnt
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
nextSibling	TokenNameIdentifier	 next Sibling
=	TokenNameEQUAL	
sibling	TokenNameIdentifier	 sibling
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
traverseFullySelected	TokenNameIdentifier	 traverse Fully Selected
(	TokenNameLPAREN	
sibling	TokenNameIdentifier	 sibling
,	TokenNameCOMMA	
how	TokenNameIdentifier	 how
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
frag	TokenNameIdentifier	 frag
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
frag	TokenNameIdentifier	 frag
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sibling	TokenNameIdentifier	 sibling
=	TokenNameEQUAL	
nextSibling	TokenNameIdentifier	 next Sibling
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
cnt	TokenNameIdentifier	 cnt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
traverseRightBoundary	TokenNameIdentifier	 traverse Right Boundary
(	TokenNameLPAREN	
endAncestor	TokenNameIdentifier	 end Ancestor
,	TokenNameCOMMA	
how	TokenNameIdentifier	 how
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
frag	TokenNameIdentifier	 frag
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
frag	TokenNameIdentifier	 frag
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
how	TokenNameIdentifier	 how
!=	TokenNameNOT_EQUAL	
CLONE_CONTENTS	TokenNameIdentifier	 CLONE  CONTENTS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setStartAfter	TokenNameIdentifier	 set Start After
(	TokenNameLPAREN	
startAncestor	TokenNameIdentifier	 start Ancestor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
collapse	TokenNameIdentifier	 collapse
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
frag	TokenNameIdentifier	 frag
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Traverses the "right boundary" of this range and * operates on each "boundary node" according to the * <code>how</code> parameter. It is a-priori assumed * by this method that the right boundary does * not contain the range's start container. * <p> * A "right boundary" is best visualized by thinking * of a sample tree:<pre> * A * /|\ * / | \ * / | \ * B C D * /|\ /|\ * E F G H I J * </pre> * Imagine first a range that begins between the * "E" and "F" nodes and ends between the * "I" and "J" nodes. The start container is * "B" and the end container is "D". Given this setup, * the following applies: * <p> * Partially Selected Nodes: B, D<br> * Fully Selected Nodes: F, G, C, H, I * <p> * The "right boundary" is the highest subtree node * that contains the ending container. The root of * this subtree is always partially selected. * <p> * In this example, the nodes that are traversed * as "right boundary" nodes are: H, I, and D. * * @param root The node that is the root of the "right boundary" subtree. * * @param how Specifies what type of traversal is being * requested (extract, clone, or delete). * Legal values for this argument are: * * <ol> * <li><code>EXTRACT_CONTENTS</code> - will produce * a node containing the boundaries content. * Partially selected nodes are copied, but fully * selected nodes are moved. * * <li><code>CLONE_CONTENTS</code> - will leave the * context tree of the range undisturbed, but will * produced cloned content. * * <li><code>DELETE_CONTENTS</code> - will delete from * the context tree of the range, all fully selected * nodes within the boundary. * </ol> * * @return Returns a node that is the result of visiting nodes. * If the traversal operation is * <code>DELETE_CONTENTS</code> the return value is null. */	TokenNameCOMMENT_JAVADOC	 Traverses the "right boundary" of this range and operates on each "boundary node" according to the <code>how</code> parameter. It is a-priori assumed by this method that the right boundary does not contain the range's start container. <p> A "right boundary" is best visualized by thinking of a sample tree:<pre> A /|\ / | \ / | \ B C D /|\ /|\ E F G H I J </pre> Imagine first a range that begins between the "E" and "F" nodes and ends between the "I" and "J" nodes. The start container is "B" and the end container is "D". Given this setup, the following applies: <p> Partially Selected Nodes: B, D<br> Fully Selected Nodes: F, G, C, H, I <p> The "right boundary" is the highest subtree node that contains the ending container. The root of this subtree is always partially selected. <p> In this example, the nodes that are traversed as "right boundary" nodes are: H, I, and D. * @param root The node that is the root of the "right boundary" subtree. * @param how Specifies what type of traversal is being requested (extract, clone, or delete). Legal values for this argument are: * <ol> <li><code>EXTRACT_CONTENTS</code> - will produce a node containing the boundaries content. Partially selected nodes are copied, but fully selected nodes are moved. * <li><code>CLONE_CONTENTS</code> - will leave the context tree of the range undisturbed, but will produced cloned content. * <li><code>DELETE_CONTENTS</code> - will delete from the context tree of the range, all fully selected nodes within the boundary. </ol> * @return Returns a node that is the result of visiting nodes. If the traversal operation is <code>DELETE_CONTENTS</code> the return value is null. 
private	TokenNameprivate	
Node	TokenNameIdentifier	 Node
traverseRightBoundary	TokenNameIdentifier	 traverse Right Boundary
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
int	TokenNameint	
how	TokenNameIdentifier	 how
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
getSelectedNode	TokenNameIdentifier	 get Selected Node
(	TokenNameLPAREN	
fEndContainer	TokenNameIdentifier	 f End Container
,	TokenNameCOMMA	
fEndOffset	TokenNameIdentifier	 f End Offset
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isFullySelected	TokenNameIdentifier	 is Fully Selected
=	TokenNameEQUAL	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
!=	TokenNameNOT_EQUAL	
fEndContainer	TokenNameIdentifier	 f End Container
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
==	TokenNameEQUAL_EQUAL	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
return	TokenNamereturn	
traverseNode	TokenNameIdentifier	 traverse Node
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
,	TokenNameCOMMA	
isFullySelected	TokenNameIdentifier	 is Fully Selected
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
how	TokenNameIdentifier	 how
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
clonedParent	TokenNameIdentifier	 cloned Parent
=	TokenNameEQUAL	
traverseNode	TokenNameIdentifier	 traverse Node
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
how	TokenNameIdentifier	 how
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
prevSibling	TokenNameIdentifier	 prev Sibling
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
clonedChild	TokenNameIdentifier	 cloned Child
=	TokenNameEQUAL	
traverseNode	TokenNameIdentifier	 traverse Node
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
,	TokenNameCOMMA	
isFullySelected	TokenNameIdentifier	 is Fully Selected
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
how	TokenNameIdentifier	 how
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
how	TokenNameIdentifier	 how
!=	TokenNameNOT_EQUAL	
DELETE_CONTENTS	TokenNameIdentifier	 DELETE  CONTENTS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clonedParent	TokenNameIdentifier	 cloned Parent
.	TokenNameDOT	
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
clonedChild	TokenNameIdentifier	 cloned Child
,	TokenNameCOMMA	
clonedParent	TokenNameIdentifier	 cloned Parent
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
isFullySelected	TokenNameIdentifier	 is Fully Selected
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
prevSibling	TokenNameIdentifier	 prev Sibling
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
==	TokenNameEQUAL_EQUAL	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
return	TokenNamereturn	
clonedParent	TokenNameIdentifier	 cloned Parent
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
clonedGrandParent	TokenNameIdentifier	 cloned Grand Parent
=	TokenNameEQUAL	
traverseNode	TokenNameIdentifier	 traverse Node
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
how	TokenNameIdentifier	 how
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
how	TokenNameIdentifier	 how
!=	TokenNameNOT_EQUAL	
DELETE_CONTENTS	TokenNameIdentifier	 DELETE  CONTENTS
)	TokenNameRPAREN	
clonedGrandParent	TokenNameIdentifier	 cloned Grand Parent
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
clonedParent	TokenNameIdentifier	 cloned Parent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clonedParent	TokenNameIdentifier	 cloned Parent
=	TokenNameEQUAL	
clonedGrandParent	TokenNameIdentifier	 cloned Grand Parent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// should never occur 	TokenNameCOMMENT_LINE	should never occur 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Traverses the "left boundary" of this range and * operates on each "boundary node" according to the * <code>how</code> parameter. It is a-priori assumed * by this method that the left boundary does * not contain the range's end container. * <p> * A "left boundary" is best visualized by thinking * of a sample tree:<pre> * * A * /|\ * / | \ * / | \ * B C D * /|\ /|\ * E F G H I J * </pre> * Imagine first a range that begins between the * "E" and "F" nodes and ends between the * "I" and "J" nodes. The start container is * "B" and the end container is "D". Given this setup, * the following applies: * <p> * Partially Selected Nodes: B, D<br> * Fully Selected Nodes: F, G, C, H, I * <p> * The "left boundary" is the highest subtree node * that contains the starting container. The root of * this subtree is always partially selected. * <p> * In this example, the nodes that are traversed * as "left boundary" nodes are: F, G, and B. * * @param root The node that is the root of the "left boundary" subtree. * * @param how Specifies what type of traversal is being * requested (extract, clone, or delete). * Legal values for this argument are: * * <ol> * <li><code>EXTRACT_CONTENTS</code> - will produce * a node containing the boundaries content. * Partially selected nodes are copied, but fully * selected nodes are moved. * * <li><code>CLONE_CONTENTS</code> - will leave the * context tree of the range undisturbed, but will * produced cloned content. * * <li><code>DELETE_CONTENTS</code> - will delete from * the context tree of the range, all fully selected * nodes within the boundary. * </ol> * * @return Returns a node that is the result of visiting nodes. * If the traversal operation is * <code>DELETE_CONTENTS</code> the return value is null. */	TokenNameCOMMENT_JAVADOC	 Traverses the "left boundary" of this range and operates on each "boundary node" according to the <code>how</code> parameter. It is a-priori assumed by this method that the left boundary does not contain the range's end container. <p> A "left boundary" is best visualized by thinking of a sample tree:<pre> * A /|\ / | \ / | \ B C D /|\ /|\ E F G H I J </pre> Imagine first a range that begins between the "E" and "F" nodes and ends between the "I" and "J" nodes. The start container is "B" and the end container is "D". Given this setup, the following applies: <p> Partially Selected Nodes: B, D<br> Fully Selected Nodes: F, G, C, H, I <p> The "left boundary" is the highest subtree node that contains the starting container. The root of this subtree is always partially selected. <p> In this example, the nodes that are traversed as "left boundary" nodes are: F, G, and B. * @param root The node that is the root of the "left boundary" subtree. * @param how Specifies what type of traversal is being requested (extract, clone, or delete). Legal values for this argument are: * <ol> <li><code>EXTRACT_CONTENTS</code> - will produce a node containing the boundaries content. Partially selected nodes are copied, but fully selected nodes are moved. * <li><code>CLONE_CONTENTS</code> - will leave the context tree of the range undisturbed, but will produced cloned content. * <li><code>DELETE_CONTENTS</code> - will delete from the context tree of the range, all fully selected nodes within the boundary. </ol> * @return Returns a node that is the result of visiting nodes. If the traversal operation is <code>DELETE_CONTENTS</code> the return value is null. 
private	TokenNameprivate	
Node	TokenNameIdentifier	 Node
traverseLeftBoundary	TokenNameIdentifier	 traverse Left Boundary
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
int	TokenNameint	
how	TokenNameIdentifier	 how
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
getSelectedNode	TokenNameIdentifier	 get Selected Node
(	TokenNameLPAREN	
getStartContainer	TokenNameIdentifier	 get Start Container
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getStartOffset	TokenNameIdentifier	 get Start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isFullySelected	TokenNameIdentifier	 is Fully Selected
=	TokenNameEQUAL	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
!=	TokenNameNOT_EQUAL	
getStartContainer	TokenNameIdentifier	 get Start Container
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
==	TokenNameEQUAL_EQUAL	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
return	TokenNamereturn	
traverseNode	TokenNameIdentifier	 traverse Node
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
,	TokenNameCOMMA	
isFullySelected	TokenNameIdentifier	 is Fully Selected
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
how	TokenNameIdentifier	 how
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
clonedParent	TokenNameIdentifier	 cloned Parent
=	TokenNameEQUAL	
traverseNode	TokenNameIdentifier	 traverse Node
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
how	TokenNameIdentifier	 how
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
nextSibling	TokenNameIdentifier	 next Sibling
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
clonedChild	TokenNameIdentifier	 cloned Child
=	TokenNameEQUAL	
traverseNode	TokenNameIdentifier	 traverse Node
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
,	TokenNameCOMMA	
isFullySelected	TokenNameIdentifier	 is Fully Selected
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
how	TokenNameIdentifier	 how
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
how	TokenNameIdentifier	 how
!=	TokenNameNOT_EQUAL	
DELETE_CONTENTS	TokenNameIdentifier	 DELETE  CONTENTS
)	TokenNameRPAREN	
clonedParent	TokenNameIdentifier	 cloned Parent
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
clonedChild	TokenNameIdentifier	 cloned Child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isFullySelected	TokenNameIdentifier	 is Fully Selected
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
nextSibling	TokenNameIdentifier	 next Sibling
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
==	TokenNameEQUAL_EQUAL	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
return	TokenNamereturn	
clonedParent	TokenNameIdentifier	 cloned Parent
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
clonedGrandParent	TokenNameIdentifier	 cloned Grand Parent
=	TokenNameEQUAL	
traverseNode	TokenNameIdentifier	 traverse Node
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
how	TokenNameIdentifier	 how
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
how	TokenNameIdentifier	 how
!=	TokenNameNOT_EQUAL	
DELETE_CONTENTS	TokenNameIdentifier	 DELETE  CONTENTS
)	TokenNameRPAREN	
clonedGrandParent	TokenNameIdentifier	 cloned Grand Parent
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
clonedParent	TokenNameIdentifier	 cloned Parent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clonedParent	TokenNameIdentifier	 cloned Parent
=	TokenNameEQUAL	
clonedGrandParent	TokenNameIdentifier	 cloned Grand Parent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// should never occur 	TokenNameCOMMENT_LINE	should never occur 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Utility method for traversing a single node. * Does not properly handle a text node containing both the * start and end offsets. Such nodes should * have been previously detected and been routed to traverseCharacterDataNode. * * @param n The node to be traversed. * * @param isFullySelected * Set to true if the node is fully selected. Should be * false otherwise. * Note that although the DOM 2 specification says that a * text node that is boththe start and end container is not * selected, we treat it here as if it were partially * selected. * * @param isLeft Is true if we are traversing the node as part of navigating * the "left boundary" of the range. If this value is false, * it implies we are navigating the "right boundary" of the * range. * * @param how Specifies what type of traversal is being * requested (extract, clone, or delete). * Legal values for this argument are: * * <ol> * <li><code>EXTRACT_CONTENTS</code> - will simply * return the original node. * * <li><code>CLONE_CONTENTS</code> - will leave the * context tree of the range undisturbed, but will * return a cloned node. * * <li><code>DELETE_CONTENTS</code> - will delete the * node from it's parent, but will return null. * </ol> * * @return Returns a node that is the result of visiting the node. * If the traversal operation is * <code>DELETE_CONTENTS</code> the return value is null. */	TokenNameCOMMENT_JAVADOC	 Utility method for traversing a single node. Does not properly handle a text node containing both the start and end offsets. Such nodes should have been previously detected and been routed to traverseCharacterDataNode. * @param n The node to be traversed. * @param isFullySelected Set to true if the node is fully selected. Should be false otherwise. Note that although the DOM 2 specification says that a text node that is boththe start and end container is not selected, we treat it here as if it were partially selected. * @param isLeft Is true if we are traversing the node as part of navigating the "left boundary" of the range. If this value is false, it implies we are navigating the "right boundary" of the range. * @param how Specifies what type of traversal is being requested (extract, clone, or delete). Legal values for this argument are: * <ol> <li><code>EXTRACT_CONTENTS</code> - will simply return the original node. * <li><code>CLONE_CONTENTS</code> - will leave the context tree of the range undisturbed, but will return a cloned node. * <li><code>DELETE_CONTENTS</code> - will delete the node from it's parent, but will return null. </ol> * @return Returns a node that is the result of visiting the node. If the traversal operation is <code>DELETE_CONTENTS</code> the return value is null. 
private	TokenNameprivate	
Node	TokenNameIdentifier	 Node
traverseNode	TokenNameIdentifier	 traverse Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isFullySelected	TokenNameIdentifier	 is Fully Selected
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isLeft	TokenNameIdentifier	 is Left
,	TokenNameCOMMA	
int	TokenNameint	
how	TokenNameIdentifier	 how
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isFullySelected	TokenNameIdentifier	 is Fully Selected
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
traverseFullySelected	TokenNameIdentifier	 traverse Fully Selected
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
how	TokenNameIdentifier	 how
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
short	TokenNameshort	
nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nodeType	TokenNameIdentifier	 node Type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
||	TokenNameOR_OR	
nodeType	TokenNameIdentifier	 node Type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
||	TokenNameOR_OR	
nodeType	TokenNameIdentifier	 node Type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
COMMENT_NODE	TokenNameIdentifier	 COMMENT  NODE
||	TokenNameOR_OR	
nodeType	TokenNameIdentifier	 node Type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
PROCESSING_INSTRUCTION_NODE	TokenNameIdentifier	 PROCESSING  INSTRUCTION  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
traverseCharacterDataNode	TokenNameIdentifier	 traverse Character Data Node
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
isLeft	TokenNameIdentifier	 is Left
,	TokenNameCOMMA	
how	TokenNameIdentifier	 how
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
traversePartiallySelected	TokenNameIdentifier	 traverse Partially Selected
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
how	TokenNameIdentifier	 how
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Utility method for traversing a single node when * we know a-priori that the node if fully * selected. * * @param n The node to be traversed. * * @param how Specifies what type of traversal is being * requested (extract, clone, or delete). * Legal values for this argument are: * * <ol> * <li><code>EXTRACT_CONTENTS</code> - will simply * return the original node. * * <li><code>CLONE_CONTENTS</code> - will leave the * context tree of the range undisturbed, but will * return a cloned node. * * <li><code>DELETE_CONTENTS</code> - will delete the * node from it's parent, but will return null. * </ol> * * @return Returns a node that is the result of visiting the node. * If the traversal operation is * <code>DELETE_CONTENTS</code> the return value is null. */	TokenNameCOMMENT_JAVADOC	 Utility method for traversing a single node when we know a-priori that the node if fully selected. * @param n The node to be traversed. * @param how Specifies what type of traversal is being requested (extract, clone, or delete). Legal values for this argument are: * <ol> <li><code>EXTRACT_CONTENTS</code> - will simply return the original node. * <li><code>CLONE_CONTENTS</code> - will leave the context tree of the range undisturbed, but will return a cloned node. * <li><code>DELETE_CONTENTS</code> - will delete the node from it's parent, but will return null. </ol> * @return Returns a node that is the result of visiting the node. If the traversal operation is <code>DELETE_CONTENTS</code> the return value is null. 
private	TokenNameprivate	
Node	TokenNameIdentifier	 Node
traverseFullySelected	TokenNameIdentifier	 traverse Fully Selected
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
int	TokenNameint	
how	TokenNameIdentifier	 how
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
how	TokenNameIdentifier	 how
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
CLONE_CONTENTS	TokenNameIdentifier	 CLONE  CONTENTS
:	TokenNameCOLON	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
cloneNode	TokenNameIdentifier	 clone Node
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
EXTRACT_CONTENTS	TokenNameIdentifier	 EXTRACT  CONTENTS
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_TYPE_NODE	TokenNameIdentifier	 DOCUMENT  TYPE  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TBD: This should be a HIERARCHY_REQUEST_ERR 	TokenNameCOMMENT_LINE	TBD: This should be a HIERARCHY_REQUEST_ERR 
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
HIERARCHY_REQUEST_ERR	TokenNameIdentifier	 HIERARCHY  REQUEST  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"HIERARCHY_REQUEST_ERR"	TokenNameStringLiteral	HIERARCHY_REQUEST_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
case	TokenNamecase	
DELETE_CONTENTS	TokenNameIdentifier	 DELETE  CONTENTS
:	TokenNameCOLON	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
removeChild	TokenNameIdentifier	 remove Child
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Utility method for traversing a single node when * we know a-priori that the node if partially * selected and is not a text node. * * @param n The node to be traversed. * * @param how Specifies what type of traversal is being * requested (extract, clone, or delete). * Legal values for this argument are: * * <ol> * <li><code>EXTRACT_CONTENTS</code> - will simply * return the original node. * * <li><code>CLONE_CONTENTS</code> - will leave the * context tree of the range undisturbed, but will * return a cloned node. * * <li><code>DELETE_CONTENTS</code> - will delete the * node from it's parent, but will return null. * </ol> * * @return Returns a node that is the result of visiting the node. * If the traversal operation is * <code>DELETE_CONTENTS</code> the return value is null. */	TokenNameCOMMENT_JAVADOC	 Utility method for traversing a single node when we know a-priori that the node if partially selected and is not a text node. * @param n The node to be traversed. * @param how Specifies what type of traversal is being requested (extract, clone, or delete). Legal values for this argument are: * <ol> <li><code>EXTRACT_CONTENTS</code> - will simply return the original node. * <li><code>CLONE_CONTENTS</code> - will leave the context tree of the range undisturbed, but will return a cloned node. * <li><code>DELETE_CONTENTS</code> - will delete the node from it's parent, but will return null. </ol> * @return Returns a node that is the result of visiting the node. If the traversal operation is <code>DELETE_CONTENTS</code> the return value is null. 
private	TokenNameprivate	
Node	TokenNameIdentifier	 Node
traversePartiallySelected	TokenNameIdentifier	 traverse Partially Selected
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
int	TokenNameint	
how	TokenNameIdentifier	 how
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
how	TokenNameIdentifier	 how
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
DELETE_CONTENTS	TokenNameIdentifier	 DELETE  CONTENTS
:	TokenNameCOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CLONE_CONTENTS	TokenNameIdentifier	 CLONE  CONTENTS
:	TokenNameCOLON	
case	TokenNamecase	
EXTRACT_CONTENTS	TokenNameIdentifier	 EXTRACT  CONTENTS
:	TokenNameCOLON	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
cloneNode	TokenNameIdentifier	 clone Node
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Utility method for traversing a node containing character data * (either a Text, CDATASection, Comment or ProcessingInstruction node) * that we know a-priori to be on a left or right boundary of the range. * This method does not properly handle text nodes that contain * both the start and end points of the range. * * @param n The node to be traversed. * * @param isLeft Is true if we are traversing the node as part of navigating * the "left boundary" of the range. If this value is false, * it implies we are navigating the "right boundary" of the * range. * * @param how Specifies what type of traversal is being * requested (extract, clone, or delete). * Legal values for this argument are: * * <ol> * <li><code>EXTRACT_CONTENTS</code> - will simply * return the original node. * * <li><code>CLONE_CONTENTS</code> - will leave the * context tree of the range undisturbed, but will * return a cloned node. * * <li><code>DELETE_CONTENTS</code> - will delete the * node from it's parent, but will return null. * </ol> * * @return Returns a node that is the result of visiting the node. * If the traversal operation is * <code>DELETE_CONTENTS</code> the return value is null. */	TokenNameCOMMENT_JAVADOC	 Utility method for traversing a node containing character data (either a Text, CDATASection, Comment or ProcessingInstruction node) that we know a-priori to be on a left or right boundary of the range. This method does not properly handle text nodes that contain both the start and end points of the range. * @param n The node to be traversed. * @param isLeft Is true if we are traversing the node as part of navigating the "left boundary" of the range. If this value is false, it implies we are navigating the "right boundary" of the range. * @param how Specifies what type of traversal is being requested (extract, clone, or delete). Legal values for this argument are: * <ol> <li><code>EXTRACT_CONTENTS</code> - will simply return the original node. * <li><code>CLONE_CONTENTS</code> - will leave the context tree of the range undisturbed, but will return a cloned node. * <li><code>DELETE_CONTENTS</code> - will delete the node from it's parent, but will return null. </ol> * @return Returns a node that is the result of visiting the node. If the traversal operation is <code>DELETE_CONTENTS</code> the return value is null. 
private	TokenNameprivate	
Node	TokenNameIdentifier	 Node
traverseCharacterDataNode	TokenNameIdentifier	 traverse Character Data Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isLeft	TokenNameIdentifier	 is Left
,	TokenNameCOMMA	
int	TokenNameint	
how	TokenNameIdentifier	 how
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
txtValue	TokenNameIdentifier	 txt Value
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
newNodeValue	TokenNameIdentifier	 new Node Value
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
oldNodeValue	TokenNameIdentifier	 old Node Value
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isLeft	TokenNameIdentifier	 is Left
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
getStartOffset	TokenNameIdentifier	 get Start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newNodeValue	TokenNameIdentifier	 new Node Value
=	TokenNameEQUAL	
txtValue	TokenNameIdentifier	 txt Value
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
oldNodeValue	TokenNameIdentifier	 old Node Value
=	TokenNameEQUAL	
txtValue	TokenNameIdentifier	 txt Value
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
getEndOffset	TokenNameIdentifier	 get End Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newNodeValue	TokenNameIdentifier	 new Node Value
=	TokenNameEQUAL	
txtValue	TokenNameIdentifier	 txt Value
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
oldNodeValue	TokenNameIdentifier	 old Node Value
=	TokenNameEQUAL	
txtValue	TokenNameIdentifier	 txt Value
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
how	TokenNameIdentifier	 how
!=	TokenNameNOT_EQUAL	
CLONE_CONTENTS	TokenNameIdentifier	 CLONE  CONTENTS
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
setNodeValue	TokenNameIdentifier	 set Node Value
(	TokenNameLPAREN	
oldNodeValue	TokenNameIdentifier	 old Node Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
how	TokenNameIdentifier	 how
==	TokenNameEQUAL_EQUAL	
DELETE_CONTENTS	TokenNameIdentifier	 DELETE  CONTENTS
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
newNode	TokenNameIdentifier	 new Node
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
cloneNode	TokenNameIdentifier	 clone Node
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newNode	TokenNameIdentifier	 new Node
.	TokenNameDOT	
setNodeValue	TokenNameIdentifier	 set Node Value
(	TokenNameLPAREN	
newNodeValue	TokenNameIdentifier	 new Node Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newNode	TokenNameIdentifier	 new Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
checkIndex	TokenNameIdentifier	 check Index
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
refNode	TokenNameIdentifier	 ref Node
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INDEX_SIZE_ERR	TokenNameIdentifier	 INDEX  SIZE  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"INDEX_SIZE_ERR"	TokenNameStringLiteral	INDEX_SIZE_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
refNode	TokenNameIdentifier	 ref Node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If the node contains text, ensure that the 	TokenNameCOMMENT_LINE	If the node contains text, ensure that the 
// offset of the range is <= to the length of the text 	TokenNameCOMMENT_LINE	offset of the range is <= to the length of the text 
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
||	TokenNameOR_OR	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
||	TokenNameOR_OR	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
COMMENT_NODE	TokenNameIdentifier	 COMMENT  NODE
||	TokenNameOR_OR	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
PROCESSING_INSTRUCTION_NODE	TokenNameIdentifier	 PROCESSING  INSTRUCTION  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
>	TokenNameGREATER	
refNode	TokenNameIdentifier	 ref Node
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INDEX_SIZE_ERR	TokenNameIdentifier	 INDEX  SIZE  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"INDEX_SIZE_ERR"	TokenNameStringLiteral	INDEX_SIZE_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Since the node is not text, ensure that the offset 	TokenNameCOMMENT_LINE	Since the node is not text, ensure that the offset 
// is valid with respect to the number of child nodes 	TokenNameCOMMENT_LINE	is valid with respect to the number of child nodes 
if	TokenNameif	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
>	TokenNameGREATER	
refNode	TokenNameIdentifier	 ref Node
.	TokenNameDOT	
getChildNodes	TokenNameIdentifier	 get Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INDEX_SIZE_ERR	TokenNameIdentifier	 INDEX  SIZE  ERR
,	TokenNameCOMMA	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"INDEX_SIZE_ERR"	TokenNameStringLiteral	INDEX_SIZE_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Given a node, calculate what the Range's root container * for that node would be. */	TokenNameCOMMENT_JAVADOC	 Given a node, calculate what the Range's root container for that node would be. 
private	TokenNameprivate	
Node	TokenNameIdentifier	 Node
getRootContainer	TokenNameIdentifier	 get Root Container
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true IFF the given node can serve as a container * for a range's boundary points. */	TokenNameCOMMENT_JAVADOC	 Returns true IFF the given node can serve as a container for a range's boundary points. 
private	TokenNameprivate	
boolean	TokenNameboolean	
isLegalContainer	TokenNameIdentifier	 is Legal Container
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_NODE	TokenNameIdentifier	 ENTITY  NODE
:	TokenNameCOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
NOTATION_NODE	TokenNameIdentifier	 NOTATION  NODE
:	TokenNameCOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_TYPE_NODE	TokenNameIdentifier	 DOCUMENT  TYPE  NODE
:	TokenNameCOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Finds the root container for the given node and determines * if that root container is legal with respect to the * DOM 2 specification. At present, that means the root * container must be either an attribute, a document, * or a document fragment. */	TokenNameCOMMENT_JAVADOC	 Finds the root container for the given node and determines if that root container is legal with respect to the DOM 2 specification. At present, that means the root container must be either an attribute, a document, or a document fragment. 
private	TokenNameprivate	
boolean	TokenNameboolean	
hasLegalRootContainer	TokenNameIdentifier	 has Legal Root Container
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
rootContainer	TokenNameIdentifier	 root Container
=	TokenNameEQUAL	
getRootContainer	TokenNameIdentifier	 get Root Container
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
rootContainer	TokenNameIdentifier	 root Container
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
:	TokenNameCOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
:	TokenNameCOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_FRAGMENT_NODE	TokenNameIdentifier	 DOCUMENT  FRAGMENT  NODE
:	TokenNameCOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true IFF the given node can be contained by * a range. */	TokenNameCOMMENT_JAVADOC	 Returns true IFF the given node can be contained by a range. 
private	TokenNameprivate	
boolean	TokenNameboolean	
isLegalContainedNode	TokenNameIdentifier	 is Legal Contained Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
:	TokenNameCOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
DOCUMENT_FRAGMENT_NODE	TokenNameIdentifier	 DOCUMENT  FRAGMENT  NODE
:	TokenNameCOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
:	TokenNameCOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ENTITY_NODE	TokenNameIdentifier	 ENTITY  NODE
:	TokenNameCOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
NOTATION_NODE	TokenNameIdentifier	 NOTATION  NODE
:	TokenNameCOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Node	TokenNameIdentifier	 Node
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
boolean	TokenNameboolean	
visitChildren	TokenNameIdentifier	 visit Children
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
visitChildren	TokenNameIdentifier	 visit Children
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// if hasSibling, return sibling 	TokenNameCOMMENT_LINE	if hasSibling, return sibling 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// return parent's 1st sibling. 	TokenNameCOMMENT_LINE	return parent's 1st sibling. 
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
parent	TokenNameIdentifier	 parent
!=	TokenNameNOT_EQUAL	
fDocument	TokenNameIdentifier	 f Document
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// while (parent != null && parent != fRoot) { 	TokenNameCOMMENT_LINE	while (parent != null && parent != fRoot) { 
// end of list, return null 	TokenNameCOMMENT_LINE	end of list, return null 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** is a an ancestor of b ? */	TokenNameCOMMENT_JAVADOC	 is a an ancestor of b ? 
boolean	TokenNameboolean	
isAncestorOf	TokenNameIdentifier	 is Ancestor Of
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** what is the index of the child in the parent */	TokenNameCOMMENT_JAVADOC	 what is the index of the child in the parent 
int	TokenNameint	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Utility method to retrieve a child node by index. This method * assumes the caller is trying to find out which node is * selected by the given index. Note that if the index is * greater than the number of children, this implies that the * first node selected is the parent node itself. * * @param container A container node * * @param offset An offset within the container for which a selected node should * be computed. If the offset is less than zero, or if the offset * is greater than the number of children, the container is returned. * * @return Returns either a child node of the container or the * container itself. */	TokenNameCOMMENT_JAVADOC	 Utility method to retrieve a child node by index. This method assumes the caller is trying to find out which node is selected by the given index. Note that if the index is greater than the number of children, this implies that the first node selected is the parent node itself. * @param container A container node * @param offset An offset within the container for which a selected node should be computed. If the offset is less than zero, or if the offset is greater than the number of children, the container is returned. * @return Returns either a child node of the container or the container itself. 
private	TokenNameprivate	
Node	TokenNameIdentifier	 Node
getSelectedNode	TokenNameIdentifier	 get Selected Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
container	TokenNameIdentifier	 container
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
container	TokenNameIdentifier	 container
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
)	TokenNameRPAREN	
return	TokenNamereturn	
container	TokenNameIdentifier	 container
;	TokenNameSEMICOLON	
// This case is an important convenience for 	TokenNameCOMMENT_LINE	This case is an important convenience for 
// traverseRightBoundary() 	TokenNameCOMMENT_LINE	traverseRightBoundary() 
if	TokenNameif	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
container	TokenNameIdentifier	 container
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
container	TokenNameIdentifier	 container
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
offset	TokenNameIdentifier	 offset
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
--	TokenNameMINUS_MINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
return	TokenNamereturn	
container	TokenNameIdentifier	 container
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
