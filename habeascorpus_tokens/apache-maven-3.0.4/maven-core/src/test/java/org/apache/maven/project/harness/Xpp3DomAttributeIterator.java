package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
harness	TokenNameIdentifier	 harness
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
commons	TokenNameIdentifier	 commons
.	TokenNameDOT	
jxpath	TokenNameIdentifier	 jxpath
.	TokenNameDOT	
ri	TokenNameIdentifier	 ri
.	TokenNameDOT	
QName	TokenNameIdentifier	 Q Name
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
commons	TokenNameIdentifier	 commons
.	TokenNameDOT	
jxpath	TokenNameIdentifier	 jxpath
.	TokenNameDOT	
ri	TokenNameIdentifier	 ri
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
NodeIterator	TokenNameIdentifier	 Node Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
commons	TokenNameIdentifier	 commons
.	TokenNameDOT	
jxpath	TokenNameIdentifier	 jxpath
.	TokenNameDOT	
ri	TokenNameIdentifier	 ri
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
NodePointer	TokenNameIdentifier	 Node Pointer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
;	TokenNameSEMICOLON	
/** * An attribute iterator for JXPath to support <code>Xpp3Dom</code>. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 An attribute iterator for JXPath to support <code>Xpp3Dom</code>. * @author Benjamin Bentmann 
class	TokenNameclass	
Xpp3DomAttributeIterator	TokenNameIdentifier	 Xpp3 Dom Attribute Iterator
implements	TokenNameimplements	
NodeIterator	TokenNameIdentifier	 Node Iterator
{	TokenNameLBRACE	
private	TokenNameprivate	
NodePointer	TokenNameIdentifier	 Node Pointer
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>>	TokenNameRIGHT_SHIFT	
attributes	TokenNameIdentifier	 attributes
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
attribute	TokenNameIdentifier	 attribute
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Xpp3DomAttributeIterator	TokenNameIdentifier	 Xpp3 Dom Attribute Iterator
(	TokenNameLPAREN	
NodePointer	TokenNameIdentifier	 Node Pointer
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
QName	TokenNameIdentifier	 Q Name
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
)	TokenNameRPAREN	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
:	TokenNameCOLON	
this	TokenNamethis	
.	TokenNameDOT	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getAttributeNames	TokenNameIdentifier	 get Attribute Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
"*"	TokenNameStringLiteral	*
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
attributes	TokenNameIdentifier	 attributes
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
NodePointer	TokenNameIdentifier	 Node Pointer
getNodePointer	TokenNameIdentifier	 get Node Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setPosition	TokenNameIdentifier	 set Position
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
attribute	TokenNameIdentifier	 attribute
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
new	TokenNamenew	
Xpp3DomAttributePointer	TokenNameIdentifier	 Xpp3 Dom Attribute Pointer
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
setPosition	TokenNameIdentifier	 set Position
(	TokenNameLPAREN	
int	TokenNameint	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
attribute	TokenNameIdentifier	 attribute
=	TokenNameEQUAL	
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
position	TokenNameIdentifier	 position
<=	TokenNameLESS_EQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
attribute	TokenNameIdentifier	 attribute
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
