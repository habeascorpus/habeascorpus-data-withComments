/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
Attributes	TokenNameIdentifier	 Attributes
;	TokenNameSEMICOLON	
/** * An Attributes implementation that can perform more operations * than the attribute list helper supplied with the standard SAX2 * distribution. * * @version $Id: AttributesImpl.java 950355 2010-06-02 03:43:24Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 An Attributes implementation that can perform more operations than the attribute list helper supplied with the standard SAX2 distribution. * @version $Id: AttributesImpl.java 950355 2010-06-02 03:43:24Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
AttributesImpl	TokenNameIdentifier	 Attributes Impl
implements	TokenNameimplements	
Attributes	TokenNameIdentifier	 Attributes
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Head node. */	TokenNameCOMMENT_JAVADOC	 Head node. 
private	TokenNameprivate	
ListNode	TokenNameIdentifier	 List Node
head	TokenNameIdentifier	 head
;	TokenNameSEMICOLON	
/** Tail node. */	TokenNameCOMMENT_JAVADOC	 Tail node. 
private	TokenNameprivate	
ListNode	TokenNameIdentifier	 List Node
tail	TokenNameIdentifier	 tail
;	TokenNameSEMICOLON	
/** Length. */	TokenNameCOMMENT_JAVADOC	 Length. 
private	TokenNameprivate	
int	TokenNameint	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Attributes methods 	TokenNameCOMMENT_LINE	Attributes methods 
// 	TokenNameCOMMENT_LINE	 
/** Returns the number of attributes. */	TokenNameCOMMENT_JAVADOC	 Returns the number of attributes. 
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the index of the specified attribute. */	TokenNameCOMMENT_JAVADOC	 Returns the index of the specified attribute. 
public	TokenNamepublic	
int	TokenNameint	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
raw	TokenNameIdentifier	 raw
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ListNode	TokenNameIdentifier	 List Node
place	TokenNameIdentifier	 place
=	TokenNameEQUAL	
head	TokenNameIdentifier	 head
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
place	TokenNameIdentifier	 place
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
place	TokenNameIdentifier	 place
.	TokenNameDOT	
raw	TokenNameIdentifier	 raw
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
raw	TokenNameIdentifier	 raw
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
place	TokenNameIdentifier	 place
=	TokenNameEQUAL	
place	TokenNameIdentifier	 place
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the index of the specified attribute. */	TokenNameCOMMENT_JAVADOC	 Returns the index of the specified attribute. 
public	TokenNamepublic	
int	TokenNameint	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
local	TokenNameIdentifier	 local
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ListNode	TokenNameIdentifier	 List Node
place	TokenNameIdentifier	 place
=	TokenNameEQUAL	
head	TokenNameIdentifier	 head
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
place	TokenNameIdentifier	 place
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
place	TokenNameIdentifier	 place
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
place	TokenNameIdentifier	 place
.	TokenNameDOT	
local	TokenNameIdentifier	 local
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
local	TokenNameIdentifier	 local
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
place	TokenNameIdentifier	 place
=	TokenNameEQUAL	
place	TokenNameIdentifier	 place
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the attribute URI by index. */	TokenNameCOMMENT_JAVADOC	 Returns the attribute URI by index. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ListNode	TokenNameIdentifier	 List Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
getListNodeAt	TokenNameIdentifier	 get List Node At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getURI(int):String 	TokenNameCOMMENT_LINE	getURI(int):String 
/** Returns the attribute local name by index. */	TokenNameCOMMENT_JAVADOC	 Returns the attribute local name by index. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ListNode	TokenNameIdentifier	 List Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
getListNodeAt	TokenNameIdentifier	 get List Node At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
local	TokenNameIdentifier	 local
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getLocalName(int):String 	TokenNameCOMMENT_LINE	getLocalName(int):String 
/** Returns the attribute raw name by index. */	TokenNameCOMMENT_JAVADOC	 Returns the attribute raw name by index. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getQName	TokenNameIdentifier	 get Q Name
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ListNode	TokenNameIdentifier	 List Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
getListNodeAt	TokenNameIdentifier	 get List Node At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
raw	TokenNameIdentifier	 raw
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getQName(int):String 	TokenNameCOMMENT_LINE	getQName(int):String 
/** Returns the attribute type by index. */	TokenNameCOMMENT_JAVADOC	 Returns the attribute type by index. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ListNode	TokenNameIdentifier	 List Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
getListNodeAt	TokenNameIdentifier	 get List Node At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
type	TokenNameIdentifier	 type
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getType(int):String 	TokenNameCOMMENT_LINE	getType(int):String 
/** Returns the attribute type by uri and local. */	TokenNameCOMMENT_JAVADOC	 Returns the attribute type by uri and local. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
local	TokenNameIdentifier	 local
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ListNode	TokenNameIdentifier	 List Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
getListNode	TokenNameIdentifier	 get List Node
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
local	TokenNameIdentifier	 local
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
type	TokenNameIdentifier	 type
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getType(String,String):String 	TokenNameCOMMENT_LINE	getType(String,String):String 
/** Returns the attribute type by raw name. */	TokenNameCOMMENT_JAVADOC	 Returns the attribute type by raw name. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
raw	TokenNameIdentifier	 raw
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ListNode	TokenNameIdentifier	 List Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
getListNode	TokenNameIdentifier	 get List Node
(	TokenNameLPAREN	
raw	TokenNameIdentifier	 raw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
type	TokenNameIdentifier	 type
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getType(String):String 	TokenNameCOMMENT_LINE	getType(String):String 
/** Returns the attribute value by index. */	TokenNameCOMMENT_JAVADOC	 Returns the attribute value by index. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ListNode	TokenNameIdentifier	 List Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
getListNodeAt	TokenNameIdentifier	 get List Node At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
value	TokenNameIdentifier	 value
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getType(int):String 	TokenNameCOMMENT_LINE	getType(int):String 
/** Returns the attribute value by uri and local. */	TokenNameCOMMENT_JAVADOC	 Returns the attribute value by uri and local. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
local	TokenNameIdentifier	 local
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ListNode	TokenNameIdentifier	 List Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
getListNode	TokenNameIdentifier	 get List Node
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
local	TokenNameIdentifier	 local
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
value	TokenNameIdentifier	 value
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getType(String):String 	TokenNameCOMMENT_LINE	getType(String):String 
/** Returns the attribute value by raw name. */	TokenNameCOMMENT_JAVADOC	 Returns the attribute value by raw name. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
raw	TokenNameIdentifier	 raw
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ListNode	TokenNameIdentifier	 List Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
getListNode	TokenNameIdentifier	 get List Node
(	TokenNameLPAREN	
raw	TokenNameIdentifier	 raw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
value	TokenNameIdentifier	 value
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getType(String):String 	TokenNameCOMMENT_LINE	getType(String):String 
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
/** Adds an attribute. */	TokenNameCOMMENT_JAVADOC	 Adds an attribute. 
public	TokenNamepublic	
void	TokenNamevoid	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
raw	TokenNameIdentifier	 raw
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
raw	TokenNameIdentifier	 raw
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Adds an attribute. */	TokenNameCOMMENT_JAVADOC	 Adds an attribute. 
public	TokenNamepublic	
void	TokenNamevoid	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
local	TokenNameIdentifier	 local
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
raw	TokenNameIdentifier	 raw
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ListNode	TokenNameIdentifier	 List Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
new	TokenNamenew	
ListNode	TokenNameIdentifier	 List Node
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
local	TokenNameIdentifier	 local
,	TokenNameCOMMA	
raw	TokenNameIdentifier	 raw
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
tail	TokenNameIdentifier	 tail
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tail	TokenNameIdentifier	 tail
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
length	TokenNameIdentifier	 length
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// addAttribute(String,StringString,String,String) 	TokenNameCOMMENT_LINE	addAttribute(String,StringString,String,String) 
/** Inserts an attribute. */	TokenNameCOMMENT_JAVADOC	 Inserts an attribute. 
public	TokenNamepublic	
void	TokenNamevoid	
insertAttributeAt	TokenNameIdentifier	 insert Attribute At
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
raw	TokenNameIdentifier	 raw
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
insertAttributeAt	TokenNameIdentifier	 insert Attribute At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
raw	TokenNameIdentifier	 raw
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Inserts an attribute. */	TokenNameCOMMENT_JAVADOC	 Inserts an attribute. 
public	TokenNamepublic	
void	TokenNamevoid	
insertAttributeAt	TokenNameIdentifier	 insert Attribute At
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
local	TokenNameIdentifier	 local
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
raw	TokenNameIdentifier	 raw
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if list is empty, add attribute 	TokenNameCOMMENT_LINE	if list is empty, add attribute 
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
local	TokenNameIdentifier	 local
,	TokenNameCOMMA	
raw	TokenNameIdentifier	 raw
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// insert at beginning of list 	TokenNameCOMMENT_LINE	insert at beginning of list 
ListNode	TokenNameIdentifier	 List Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
new	TokenNamenew	
ListNode	TokenNameIdentifier	 List Node
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
local	TokenNameIdentifier	 local
,	TokenNameCOMMA	
raw	TokenNameIdentifier	 raw
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
head	TokenNameIdentifier	 head
;	TokenNameSEMICOLON	
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ListNode	TokenNameIdentifier	 List Node
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
getListNodeAt	TokenNameIdentifier	 get List Node At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
prev	TokenNameIdentifier	 prev
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
prev	TokenNameIdentifier	 prev
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
length	TokenNameIdentifier	 length
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// insertAttributeAt(int,String,String,String,String,String) 	TokenNameCOMMENT_LINE	insertAttributeAt(int,String,String,String,String,String) 
/** Removes an attribute. */	TokenNameCOMMENT_JAVADOC	 Removes an attribute. 
public	TokenNamepublic	
void	TokenNamevoid	
removeAttributeAt	TokenNameIdentifier	 remove Attribute At
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
head	TokenNameIdentifier	 head
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
head	TokenNameIdentifier	 head
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tail	TokenNameIdentifier	 tail
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
length	TokenNameIdentifier	 length
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ListNode	TokenNameIdentifier	 List Node
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
getListNodeAt	TokenNameIdentifier	 get List Node At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ListNode	TokenNameIdentifier	 List Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
getListNodeAt	TokenNameIdentifier	 get List Node At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prev	TokenNameIdentifier	 prev
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
tail	TokenNameIdentifier	 tail
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tail	TokenNameIdentifier	 tail
=	TokenNameEQUAL	
prev	TokenNameIdentifier	 prev
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
length	TokenNameIdentifier	 length
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// removeAttributeAt(int) 	TokenNameCOMMENT_LINE	removeAttributeAt(int) 
/** Removes the specified attribute. */	TokenNameCOMMENT_JAVADOC	 Removes the specified attribute. 
public	TokenNamepublic	
void	TokenNamevoid	
removeAttribute	TokenNameIdentifier	 remove Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
raw	TokenNameIdentifier	 raw
)	TokenNameRPAREN	
{	TokenNameLBRACE	
removeAttributeAt	TokenNameIdentifier	 remove Attribute At
(	TokenNameLPAREN	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
raw	TokenNameIdentifier	 raw
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Removes the specified attribute. */	TokenNameCOMMENT_JAVADOC	 Removes the specified attribute. 
public	TokenNamepublic	
void	TokenNamevoid	
removeAttribute	TokenNameIdentifier	 remove Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
local	TokenNameIdentifier	 local
)	TokenNameRPAREN	
{	TokenNameLBRACE	
removeAttributeAt	TokenNameIdentifier	 remove Attribute At
(	TokenNameLPAREN	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
local	TokenNameIdentifier	 local
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Private methods 	TokenNameCOMMENT_LINE	Private methods 
// 	TokenNameCOMMENT_LINE	 
/** Returns the node at the specified index. */	TokenNameCOMMENT_JAVADOC	 Returns the node at the specified index. 
private	TokenNameprivate	
ListNode	TokenNameIdentifier	 List Node
getListNodeAt	TokenNameIdentifier	 get List Node At
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
ListNode	TokenNameIdentifier	 List Node
place	TokenNameIdentifier	 place
=	TokenNameEQUAL	
head	TokenNameIdentifier	 head
;	TokenNameSEMICOLON	
place	TokenNameIdentifier	 place
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
place	TokenNameIdentifier	 place
=	TokenNameEQUAL	
place	TokenNameIdentifier	 place
.	TokenNameDOT	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
place	TokenNameIdentifier	 place
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getListNodeAt(int):ListNode 	TokenNameCOMMENT_LINE	getListNodeAt(int):ListNode 
/** Returns the first node with the specified uri and local. */	TokenNameCOMMENT_JAVADOC	 Returns the first node with the specified uri and local. 
public	TokenNamepublic	
ListNode	TokenNameIdentifier	 List Node
getListNode	TokenNameIdentifier	 get List Node
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
local	TokenNameIdentifier	 local
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
local	TokenNameIdentifier	 local
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ListNode	TokenNameIdentifier	 List Node
place	TokenNameIdentifier	 place
=	TokenNameEQUAL	
head	TokenNameIdentifier	 head
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
place	TokenNameIdentifier	 place
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
place	TokenNameIdentifier	 place
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
place	TokenNameIdentifier	 place
.	TokenNameDOT	
local	TokenNameIdentifier	 local
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
place	TokenNameIdentifier	 place
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
place	TokenNameIdentifier	 place
.	TokenNameDOT	
local	TokenNameIdentifier	 local
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
local	TokenNameIdentifier	 local
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
place	TokenNameIdentifier	 place
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
place	TokenNameIdentifier	 place
=	TokenNameEQUAL	
place	TokenNameIdentifier	 place
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getListNode(String,String):ListNode 	TokenNameCOMMENT_LINE	getListNode(String,String):ListNode 
/** Returns the first node with the specified raw name. */	TokenNameCOMMENT_JAVADOC	 Returns the first node with the specified raw name. 
private	TokenNameprivate	
ListNode	TokenNameIdentifier	 List Node
getListNode	TokenNameIdentifier	 get List Node
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
raw	TokenNameIdentifier	 raw
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
raw	TokenNameIdentifier	 raw
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
ListNode	TokenNameIdentifier	 List Node
place	TokenNameIdentifier	 place
=	TokenNameEQUAL	
head	TokenNameIdentifier	 head
;	TokenNameSEMICOLON	
place	TokenNameIdentifier	 place
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
place	TokenNameIdentifier	 place
=	TokenNameEQUAL	
place	TokenNameIdentifier	 place
.	TokenNameDOT	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
place	TokenNameIdentifier	 place
.	TokenNameDOT	
raw	TokenNameIdentifier	 raw
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
place	TokenNameIdentifier	 place
.	TokenNameDOT	
raw	TokenNameIdentifier	 raw
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
raw	TokenNameIdentifier	 raw
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
place	TokenNameIdentifier	 place
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getListNode(String):ListNode 	TokenNameCOMMENT_LINE	getListNode(String):ListNode 
// 	TokenNameCOMMENT_LINE	 
// Object methods 	TokenNameCOMMENT_LINE	Object methods 
// 	TokenNameCOMMENT_LINE	 
/** Returns a string representation of this object. */	TokenNameCOMMENT_JAVADOC	 Returns a string representation of this object. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'['	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"len="	TokenNameStringLiteral	len=
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", {"	TokenNameStringLiteral	, {
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
ListNode	TokenNameIdentifier	 List Node
place	TokenNameIdentifier	 place
=	TokenNameEQUAL	
head	TokenNameIdentifier	 head
;	TokenNameSEMICOLON	
place	TokenNameIdentifier	 place
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
place	TokenNameIdentifier	 place
=	TokenNameEQUAL	
place	TokenNameIdentifier	 place
.	TokenNameDOT	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
place	TokenNameIdentifier	 place
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
place	TokenNameIdentifier	 place
.	TokenNameDOT	
next	TokenNameIdentifier	 next
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", "	TokenNameStringLiteral	, 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"}]"	TokenNameStringLiteral	}]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// toString():String 	TokenNameCOMMENT_LINE	toString():String 
// 	TokenNameCOMMENT_LINE	 
// Classes 	TokenNameCOMMENT_LINE	Classes 
// 	TokenNameCOMMENT_LINE	 
/** * An attribute node. */	TokenNameCOMMENT_JAVADOC	 An attribute node. 
static	TokenNamestatic	
class	TokenNameclass	
ListNode	TokenNameIdentifier	 List Node
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Attribute uri. */	TokenNameCOMMENT_JAVADOC	 Attribute uri. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
/** Attribute local. */	TokenNameCOMMENT_JAVADOC	 Attribute local. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
local	TokenNameIdentifier	 local
;	TokenNameSEMICOLON	
/** Attribute raw. */	TokenNameCOMMENT_JAVADOC	 Attribute raw. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
raw	TokenNameIdentifier	 raw
;	TokenNameSEMICOLON	
/** Attribute type. */	TokenNameCOMMENT_JAVADOC	 Attribute type. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
/** Attribute value. */	TokenNameCOMMENT_JAVADOC	 Attribute value. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
/** Next node. */	TokenNameCOMMENT_JAVADOC	 Next node. 
public	TokenNamepublic	
ListNode	TokenNameIdentifier	 List Node
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Constructs a list node. */	TokenNameCOMMENT_JAVADOC	 Constructs a list node. 
public	TokenNamepublic	
ListNode	TokenNameIdentifier	 List Node
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
local	TokenNameIdentifier	 local
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
raw	TokenNameIdentifier	 raw
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
local	TokenNameIdentifier	 local
=	TokenNameEQUAL	
local	TokenNameIdentifier	 local
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
raw	TokenNameIdentifier	 raw
=	TokenNameEQUAL	
raw	TokenNameIdentifier	 raw
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(String,String,String,String,String) 	TokenNameCOMMENT_LINE	<init>(String,String,String,String,String) 
// 	TokenNameCOMMENT_LINE	 
// Object methods 	TokenNameCOMMENT_LINE	Object methods 
// 	TokenNameCOMMENT_LINE	 
/** Returns string representation of this object. */	TokenNameCOMMENT_JAVADOC	 Returns string representation of this object. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
raw	TokenNameIdentifier	 raw
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
raw	TokenNameIdentifier	 raw
:	TokenNameCOLON	
local	TokenNameIdentifier	 local
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class ListNode 	TokenNameCOMMENT_LINE	class ListNode 
}	TokenNameRBRACE	
// class AttributesImpl 	TokenNameCOMMENT_LINE	class AttributesImpl 
