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
Node	TokenNameIdentifier	 Node
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
NodeList	TokenNameIdentifier	 Node List
;	TokenNameSEMICOLON	
/** * CharacterData is an abstract Node that can carry character data as its * Value. It provides shared behavior for Text, CData, and * possibly other node types. All offsets are 0-based. * <p> * Since ProcessingInstructionImpl inherits from this class to reuse the * setNodeValue method, this class isn't declared as implementing the interface * CharacterData. This is done by relevant subclasses (TexImpl, CommentImpl). * <p> * This class doesn't directly support mutation events, however, it notifies * the document when mutations are performed so that the document class do so. * * @xerces.internal * * @version $Id: CharacterDataImpl.java 447266 2006-09-18 05:57:49Z mrglavas $ * @since PR-DOM-Level-1-19980818. */	TokenNameCOMMENT_JAVADOC	 CharacterData is an abstract Node that can carry character data as its Value. It provides shared behavior for Text, CData, and possibly other node types. All offsets are 0-based. <p> Since ProcessingInstructionImpl inherits from this class to reuse the setNodeValue method, this class isn't declared as implementing the interface CharacterData. This is done by relevant subclasses (TexImpl, CommentImpl). <p> This class doesn't directly support mutation events, however, it notifies the document when mutations are performed so that the document class do so. * @xerces.internal * @version $Id: CharacterDataImpl.java 447266 2006-09-18 05:57:49Z mrglavas $ @since PR-DOM-Level-1-19980818. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
CharacterDataImpl	TokenNameIdentifier	 Character Data Impl
extends	TokenNameextends	
ChildNode	TokenNameIdentifier	 Child Node
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
/** Serialization version. */	TokenNameCOMMENT_JAVADOC	 Serialization version. 
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
7931170150428474230L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
/** Empty child nodes. */	TokenNameCOMMENT_JAVADOC	 Empty child nodes. 
private	TokenNameprivate	
static	TokenNamestatic	
transient	TokenNametransient	
NodeList	TokenNameIdentifier	 Node List
singletonNodeList	TokenNameIdentifier	 singleton Node List
=	TokenNameEQUAL	
new	TokenNamenew	
NodeList	TokenNameIdentifier	 Node List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
public	TokenNamepublic	
CharacterDataImpl	TokenNameIdentifier	 Character Data Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** Factory constructor. */	TokenNameCOMMENT_JAVADOC	 Factory constructor. 
protected	TokenNameprotected	
CharacterDataImpl	TokenNameIdentifier	 Character Data Impl
(	TokenNameLPAREN	
CoreDocumentImpl	TokenNameIdentifier	 Core Document Impl
ownerDocument	TokenNameIdentifier	 owner Document
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
ownerDocument	TokenNameIdentifier	 owner Document
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Node methods 	TokenNameCOMMENT_LINE	Node methods 
// 	TokenNameCOMMENT_LINE	 
/** Returns an empty node list. */	TokenNameCOMMENT_JAVADOC	 Returns an empty node list. 
public	TokenNamepublic	
NodeList	TokenNameIdentifier	 Node List
getChildNodes	TokenNameIdentifier	 get Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
singletonNodeList	TokenNameIdentifier	 singleton Node List
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * returns the content of this node */	TokenNameCOMMENT_BLOCK	 returns the content of this node 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
needsSyncData	TokenNameIdentifier	 needs Sync Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronizeData	TokenNameIdentifier	 synchronize Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Convenience wrapper for calling setNodeValueInternal when * we are not performing a replacement operation */	TokenNameCOMMENT_JAVADOC	 Convenience wrapper for calling setNodeValueInternal when we are not performing a replacement operation 
protected	TokenNameprotected	
void	TokenNamevoid	
setNodeValueInternal	TokenNameIdentifier	 set Node Value Internal
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setNodeValueInternal	TokenNameIdentifier	 set Node Value Internal
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** This function added so that we can distinguish whether * setNodeValue has been called from some other DOM functions. * or by the client.<p> * This is important, because we do one type of Range fix-up, * from the high-level functions in CharacterData, and another * type if the client simply calls setNodeValue(value). */	TokenNameCOMMENT_JAVADOC	 This function added so that we can distinguish whether setNodeValue has been called from some other DOM functions. or by the client.<p> This is important, because we do one type of Range fix-up, from the high-level functions in CharacterData, and another type if the client simply calls setNodeValue(value). 
protected	TokenNameprotected	
void	TokenNamevoid	
setNodeValueInternal	TokenNameIdentifier	 set Node Value Internal
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
boolean	TokenNameboolean	
replace	TokenNameIdentifier	 replace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CoreDocumentImpl	TokenNameIdentifier	 Core Document Impl
ownerDocument	TokenNameIdentifier	 owner Document
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
errorChecking	TokenNameIdentifier	 error Checking
&&	TokenNameAND_AND	
isReadOnly	TokenNameIdentifier	 is Read Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"NO_MODIFICATION_ALLOWED_ERR"	TokenNameStringLiteral	NO_MODIFICATION_ALLOWED_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// revisit: may want to set the value in ownerDocument. 	TokenNameCOMMENT_LINE	revisit: may want to set the value in ownerDocument. 
// Default behavior, overridden in some subclasses 	TokenNameCOMMENT_LINE	Default behavior, overridden in some subclasses 
if	TokenNameif	
(	TokenNameLPAREN	
needsSyncData	TokenNameIdentifier	 needs Sync Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronizeData	TokenNameIdentifier	 synchronize Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// keep old value for document notification 	TokenNameCOMMENT_LINE	keep old value for document notification 
String	TokenNameIdentifier	 String
oldvalue	TokenNameIdentifier	 oldvalue
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
// notify document 	TokenNameCOMMENT_LINE	notify document 
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
modifyingCharacterData	TokenNameIdentifier	 modifying Character Data
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
replace	TokenNameIdentifier	 replace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
// notify document 	TokenNameCOMMENT_LINE	notify document 
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
modifiedCharacterData	TokenNameIdentifier	 modified Character Data
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
oldvalue	TokenNameIdentifier	 oldvalue
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
replace	TokenNameIdentifier	 replace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the content, possibly firing related events, * and updating ranges (via notification to the document) */	TokenNameCOMMENT_JAVADOC	 Sets the content, possibly firing related events, and updating ranges (via notification to the document) 
public	TokenNamepublic	
void	TokenNamevoid	
setNodeValue	TokenNameIdentifier	 set Node Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setNodeValueInternal	TokenNameIdentifier	 set Node Value Internal
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// notify document 	TokenNameCOMMENT_LINE	notify document 
ownerDocument	TokenNameIdentifier	 owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
replacedText	TokenNameIdentifier	 replaced Text
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// CharacterData methods 	TokenNameCOMMENT_LINE	CharacterData methods 
// 	TokenNameCOMMENT_LINE	 
/** * Retrieve character data currently stored in this node. * * @throws DOMExcpetion(DOMSTRING_SIZE_ERR) In some implementations, * the stored data may exceed the permitted length of strings. If so, * getData() will throw this DOMException advising the user to * instead retrieve the data in chunks via the substring() operation. */	TokenNameCOMMENT_JAVADOC	 Retrieve character data currently stored in this node. * @throws DOMExcpetion(DOMSTRING_SIZE_ERR) In some implementations, the stored data may exceed the permitted length of strings. If so, getData() will throw this DOMException advising the user to instead retrieve the data in chunks via the substring() operation. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
needsSyncData	TokenNameIdentifier	 needs Sync Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronizeData	TokenNameIdentifier	 synchronize Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Report number of characters currently stored in this node's * data. It may be 0, meaning that the value is an empty string. */	TokenNameCOMMENT_JAVADOC	 Report number of characters currently stored in this node's data. It may be 0, meaning that the value is an empty string. 
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
needsSyncData	TokenNameIdentifier	 needs Sync Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronizeData	TokenNameIdentifier	 synchronize Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Concatenate additional characters onto the end of the data * stored in this node. Note that this, and insert(), are the paths * by which a DOM could wind up accumulating more data than the * language's strings can easily handle. (See above discussion.) * * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if node is readonly. */	TokenNameCOMMENT_JAVADOC	 Concatenate additional characters onto the end of the data stored in this node. Note that this, and insert(), are the paths by which a DOM could wind up accumulating more data than the language's strings can easily handle. (See above discussion.) * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if node is readonly. 
public	TokenNamepublic	
void	TokenNamevoid	
appendData	TokenNameIdentifier	 append Data
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReadOnly	TokenNameIdentifier	 is Read Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"NO_MODIFICATION_ALLOWED_ERR"	TokenNameStringLiteral	NO_MODIFICATION_ALLOWED_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
needsSyncData	TokenNameIdentifier	 needs Sync Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronizeData	TokenNameIdentifier	 synchronize Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
setNodeValue	TokenNameIdentifier	 set Node Value
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
+	TokenNamePLUS	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// appendData(String) 	TokenNameCOMMENT_LINE	appendData(String) 
/** * Remove a range of characters from the node's value. Throws a * DOMException if the offset is beyond the end of the * string. However, a deletion _count_ that exceeds the available * data is accepted as a delete-to-end request. * * @throws DOMException(INDEX_SIZE_ERR) if offset is negative or * greater than length, or if count is negative. * * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if node is * readonly. */	TokenNameCOMMENT_JAVADOC	 Remove a range of characters from the node's value. Throws a DOMException if the offset is beyond the end of the string. However, a deletion _count_ that exceeds the available data is accepted as a delete-to-end request. * @throws DOMException(INDEX_SIZE_ERR) if offset is negative or greater than length, or if count is negative. * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if node is readonly. 
public	TokenNamepublic	
void	TokenNamevoid	
deleteData	TokenNameIdentifier	 delete Data
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
internalDeleteData	TokenNameIdentifier	 internal Delete Data
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// deleteData(int,int) 	TokenNameCOMMENT_LINE	deleteData(int,int) 
/** NON-DOM INTERNAL: Within DOM actions, we sometimes need to be able * to control which mutation events are spawned. This version of the * deleteData operation allows us to do so. It is not intended * for use by application programs. */	TokenNameCOMMENT_JAVADOC	 NON-DOM INTERNAL: Within DOM actions, we sometimes need to be able to control which mutation events are spawned. This version of the deleteData operation allows us to do so. It is not intended for use by application programs. 
void	TokenNamevoid	
internalDeleteData	TokenNameIdentifier	 internal Delete Data
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
count	TokenNameIdentifier	 count
,	TokenNameCOMMA	
boolean	TokenNameboolean	
replace	TokenNameIdentifier	 replace
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
CoreDocumentImpl	TokenNameIdentifier	 Core Document Impl
ownerDocument	TokenNameIdentifier	 owner Document
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
errorChecking	TokenNameIdentifier	 error Checking
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReadOnly	TokenNameIdentifier	 is Read Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"NO_MODIFICATION_ALLOWED_ERR"	TokenNameStringLiteral	NO_MODIFICATION_ALLOWED_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
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
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INDEX_SIZE_ERR	TokenNameIdentifier	 INDEX  SIZE  ERR
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
needsSyncData	TokenNameIdentifier	 needs Sync Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronizeData	TokenNameIdentifier	 synchronize Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
tailLength	TokenNameIdentifier	 tail Length
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
tailLength	TokenNameIdentifier	 tail Length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
count	TokenNameIdentifier	 count
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
count	TokenNameIdentifier	 count
+	TokenNamePLUS	
tailLength	TokenNameIdentifier	 tail Length
)	TokenNameRPAREN	
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setNodeValueInternal	TokenNameIdentifier	 set Node Value Internal
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
replace	TokenNameIdentifier	 replace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// notify document 	TokenNameCOMMENT_LINE	notify document 
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
deletedText	TokenNameIdentifier	 deleted Text
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
StringIndexOutOfBoundsException	TokenNameIdentifier	 String Index Out Of Bounds Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
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
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INDEX_SIZE_ERR	TokenNameIdentifier	 INDEX  SIZE  ERR
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// internalDeleteData(int,int,boolean) 	TokenNameCOMMENT_LINE	internalDeleteData(int,int,boolean) 
/** * Insert additional characters into the data stored in this node, * at the offset specified. * * @throws DOMException(INDEX_SIZE_ERR) if offset is negative or * greater than length. * * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if node is readonly. */	TokenNameCOMMENT_JAVADOC	 Insert additional characters into the data stored in this node, at the offset specified. * @throws DOMException(INDEX_SIZE_ERR) if offset is negative or greater than length. * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if node is readonly. 
public	TokenNamepublic	
void	TokenNamevoid	
insertData	TokenNameIdentifier	 insert Data
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
internalInsertData	TokenNameIdentifier	 internal Insert Data
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// insertData(int,int) 	TokenNameCOMMENT_LINE	insertData(int,int) 
/** NON-DOM INTERNAL: Within DOM actions, we sometimes need to be able * to control which mutation events are spawned. This version of the * insertData operation allows us to do so. It is not intended * for use by application programs. */	TokenNameCOMMENT_JAVADOC	 NON-DOM INTERNAL: Within DOM actions, we sometimes need to be able to control which mutation events are spawned. This version of the insertData operation allows us to do so. It is not intended for use by application programs. 
void	TokenNamevoid	
internalInsertData	TokenNameIdentifier	 internal Insert Data
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
boolean	TokenNameboolean	
replace	TokenNameIdentifier	 replace
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
CoreDocumentImpl	TokenNameIdentifier	 Core Document Impl
ownerDocument	TokenNameIdentifier	 owner Document
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
errorChecking	TokenNameIdentifier	 error Checking
&&	TokenNameAND_AND	
isReadOnly	TokenNameIdentifier	 is Read Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"NO_MODIFICATION_ALLOWED_ERR"	TokenNameStringLiteral	NO_MODIFICATION_ALLOWED_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
needsSyncData	TokenNameIdentifier	 needs Sync Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronizeData	TokenNameIdentifier	 synchronize Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
.	TokenNameDOT	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setNodeValueInternal	TokenNameIdentifier	 set Node Value Internal
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
replace	TokenNameIdentifier	 replace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// notify document 	TokenNameCOMMENT_LINE	notify document 
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
insertedText	TokenNameIdentifier	 inserted Text
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
StringIndexOutOfBoundsException	TokenNameIdentifier	 String Index Out Of Bounds Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
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
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INDEX_SIZE_ERR	TokenNameIdentifier	 INDEX  SIZE  ERR
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// internalInsertData(int,String,boolean) 	TokenNameCOMMENT_LINE	internalInsertData(int,String,boolean) 
/** * Replace a series of characters at the specified (zero-based) * offset with a new string, NOT necessarily of the same * length. Convenience method, equivalent to a delete followed by an * insert. Throws a DOMException if the specified offset is beyond * the end of the existing data. * * @param offset The offset at which to begin replacing. * * @param count The number of characters to remove, * interpreted as in the delete() method. * * @param data The new string to be inserted at offset in place of * the removed data. Note that the entire string will * be inserted -- the count parameter does not affect * insertion, and the new data may be longer or shorter * than the substring it replaces. * * @throws DOMException(INDEX_SIZE_ERR) if offset is negative or * greater than length, or if count is negative. * * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if node is * readonly. */	TokenNameCOMMENT_JAVADOC	 Replace a series of characters at the specified (zero-based) offset with a new string, NOT necessarily of the same length. Convenience method, equivalent to a delete followed by an insert. Throws a DOMException if the specified offset is beyond the end of the existing data. * @param offset The offset at which to begin replacing. * @param count The number of characters to remove, interpreted as in the delete() method. * @param data The new string to be inserted at offset in place of the removed data. Note that the entire string will be inserted -- the count parameter does not affect insertion, and the new data may be longer or shorter than the substring it replaces. * @throws DOMException(INDEX_SIZE_ERR) if offset is negative or greater than length, or if count is negative. * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if node is readonly. 
public	TokenNamepublic	
void	TokenNamevoid	
replaceData	TokenNameIdentifier	 replace Data
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
count	TokenNameIdentifier	 count
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
CoreDocumentImpl	TokenNameIdentifier	 Core Document Impl
ownerDocument	TokenNameIdentifier	 owner Document
=	TokenNameEQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The read-only check is done by deleteData() 	TokenNameCOMMENT_LINE	The read-only check is done by deleteData() 
// ***** This could be more efficient w/r/t Mutation Events, 	TokenNameCOMMENT_LINE	***** This could be more efficient w/r/t Mutation Events, 
// specifically by aggregating DOMAttrModified and 	TokenNameCOMMENT_LINE	specifically by aggregating DOMAttrModified and 
// DOMSubtreeModified. But mutation events are 	TokenNameCOMMENT_LINE	DOMSubtreeModified. But mutation events are 
// underspecified; I don't feel compelled 	TokenNameCOMMENT_LINE	underspecified; I don't feel compelled 
// to deal with it right now. 	TokenNameCOMMENT_LINE	to deal with it right now. 
if	TokenNameif	
(	TokenNameLPAREN	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
errorChecking	TokenNameIdentifier	 error Checking
&&	TokenNameAND_AND	
isReadOnly	TokenNameIdentifier	 is Read Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
DOMMessageFormatter	TokenNameIdentifier	 DOM Message Formatter
.	TokenNameDOT	
DOM_DOMAIN	TokenNameIdentifier	 DOM  DOMAIN
,	TokenNameCOMMA	
"NO_MODIFICATION_ALLOWED_ERR"	TokenNameStringLiteral	NO_MODIFICATION_ALLOWED_ERR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
needsSyncData	TokenNameIdentifier	 needs Sync Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronizeData	TokenNameIdentifier	 synchronize Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//notify document 	TokenNameCOMMENT_LINE	notify document 
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
replacingData	TokenNameIdentifier	 replacing Data
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// keep old value for document notification 	TokenNameCOMMENT_LINE	keep old value for document notification 
String	TokenNameIdentifier	 String
oldvalue	TokenNameIdentifier	 oldvalue
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
internalDeleteData	TokenNameIdentifier	 internal Delete Data
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
internalInsertData	TokenNameIdentifier	 internal Insert Data
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
replacedCharacterData	TokenNameIdentifier	 replaced Character Data
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
oldvalue	TokenNameIdentifier	 oldvalue
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// replaceData(int,int,String) 	TokenNameCOMMENT_LINE	replaceData(int,int,String) 
/** * Store character data into this node. * * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if node is readonly. */	TokenNameCOMMENT_JAVADOC	 Store character data into this node. * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if node is readonly. 
public	TokenNamepublic	
void	TokenNamevoid	
setData	TokenNameIdentifier	 set Data
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
setNodeValue	TokenNameIdentifier	 set Node Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Substring is more than a convenience function. In some * implementations of the DOM, where the stored data may exceed the * length that can be returned in a single string, the only way to * read it all is to extract it in chunks via this method. * * @param offset Zero-based offset of first character to retrieve. * @param count Number of characters to retrieve. * * If the sum of offset and count exceeds the length, all characters * to end of data are returned. * * @throws DOMException(INDEX_SIZE_ERR) if offset is negative or * greater than length, or if count is negative. * * @throws DOMException(WSTRING_SIZE_ERR) In some implementations, * count may exceed the permitted length of strings. If so, * substring() will throw this DOMException advising the user to * instead retrieve the data in smaller chunks. */	TokenNameCOMMENT_JAVADOC	 Substring is more than a convenience function. In some implementations of the DOM, where the stored data may exceed the length that can be returned in a single string, the only way to read it all is to extract it in chunks via this method. * @param offset Zero-based offset of first character to retrieve. @param count Number of characters to retrieve. * If the sum of offset and count exceeds the length, all characters to end of data are returned. * @throws DOMException(INDEX_SIZE_ERR) if offset is negative or greater than length, or if count is negative. * @throws DOMException(WSTRING_SIZE_ERR) In some implementations, count may exceed the permitted length of strings. If so, substring() will throw this DOMException advising the user to instead retrieve the data in smaller chunks. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
substringData	TokenNameIdentifier	 substring Data
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
needsSyncData	TokenNameIdentifier	 needs Sync Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronizeData	TokenNameIdentifier	 synchronize Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
offset	TokenNameIdentifier	 offset
>	TokenNameGREATER	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
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
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INDEX_SIZE_ERR	TokenNameIdentifier	 INDEX  SIZE  ERR
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
tailIndex	TokenNameIdentifier	 tail Index
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
count	TokenNameIdentifier	 count
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
tailIndex	TokenNameIdentifier	 tail Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// substringData(int,int):String 	TokenNameCOMMENT_LINE	substringData(int,int):String 
}	TokenNameRBRACE	
// class CharacterDataImpl 	TokenNameCOMMENT_LINE	class CharacterDataImpl 
