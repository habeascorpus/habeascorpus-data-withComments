package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
core	TokenNameIdentifier	 core
.	TokenNameDOT	
nodes	TokenNameIdentifier	 nodes
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
NLS	TokenNameIdentifier	 NLS
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
core	TokenNameIdentifier	 core
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
QueryParserMessages	TokenNameIdentifier	 Query Parser Messages
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
core	TokenNameIdentifier	 core
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringUtils	TokenNameIdentifier	 String Utils
;	TokenNameSEMICOLON	
/** * A {@link QueryNodeImpl} is the default implementation of the interface * {@link QueryNode} */	TokenNameCOMMENT_JAVADOC	 A {@link QueryNodeImpl} is the default implementation of the interface {@link QueryNode} 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
QueryNodeImpl	TokenNameIdentifier	 Query Node Impl
implements	TokenNameimplements	
QueryNode	TokenNameIdentifier	 Query Node
,	TokenNameCOMMA	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
5569870883474845989L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/* index default field */	TokenNameCOMMENT_BLOCK	 index default field 
// TODO remove PLAINTEXT_FIELD_NAME replacing it with configuration APIs 	TokenNameCOMMENT_LINE	TODO remove PLAINTEXT_FIELD_NAME replacing it with configuration APIs 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PLAINTEXT_FIELD_NAME	TokenNameIdentifier	 PLAINTEXT  FIELD  NAME
=	TokenNameEQUAL	
"_plain"	TokenNameStringLiteral	_plain
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
isLeaf	TokenNameIdentifier	 is Leaf
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
tags	TokenNameIdentifier	 tags
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
QueryNode	TokenNameIdentifier	 Query Node
>	TokenNameGREATER	
clauses	TokenNameIdentifier	 clauses
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
void	TokenNamevoid	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
clauses	TokenNameIdentifier	 clauses
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
clauses	TokenNameIdentifier	 clauses
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
QueryNode	TokenNameIdentifier	 Query Node
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
QueryNode	TokenNameIdentifier	 Query Node
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isLeaf	TokenNameIdentifier	 is Leaf
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
this	TokenNamethis	
.	TokenNameDOT	
clauses	TokenNameIdentifier	 clauses
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
child	TokenNameIdentifier	 child
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
NLS	TokenNameIdentifier	 NLS
.	TokenNameDOT	
getLocalizedMessage	TokenNameIdentifier	 get Localized Message
(	TokenNameLPAREN	
QueryParserMessages	TokenNameIdentifier	 Query Parser Messages
.	TokenNameDOT	
NODE_ACTION_NOT_SUPPORTED	TokenNameIdentifier	 NODE  ACTION  NOT  SUPPORTED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
QueryNodeImpl	TokenNameIdentifier	 Query Node Impl
)	TokenNameRPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
.	TokenNameDOT	
setParent	TokenNameIdentifier	 set Parent
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
QueryNode	TokenNameIdentifier	 Query Node
>	TokenNameGREATER	
children	TokenNameIdentifier	 children
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isLeaf	TokenNameIdentifier	 is Leaf
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
this	TokenNamethis	
.	TokenNameDOT	
clauses	TokenNameIdentifier	 clauses
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
NLS	TokenNameIdentifier	 NLS
.	TokenNameDOT	
getLocalizedMessage	TokenNameIdentifier	 get Localized Message
(	TokenNameLPAREN	
QueryParserMessages	TokenNameIdentifier	 Query Parser Messages
.	TokenNameDOT	
NODE_ACTION_NOT_SUPPORTED	TokenNameIdentifier	 NODE  ACTION  NOT  SUPPORTED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
QueryNode	TokenNameIdentifier	 Query Node
child	TokenNameIdentifier	 child
:	TokenNameCOLON	
children	TokenNameIdentifier	 children
)	TokenNameRPAREN	
{	TokenNameLBRACE	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isLeaf	TokenNameIdentifier	 is Leaf
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
isLeaf	TokenNameIdentifier	 is Leaf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
QueryNode	TokenNameIdentifier	 Query Node
>	TokenNameGREATER	
children	TokenNameIdentifier	 children
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isLeaf	TokenNameIdentifier	 is Leaf
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
this	TokenNamethis	
.	TokenNameDOT	
clauses	TokenNameIdentifier	 clauses
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
bundle	TokenNameIdentifier	 bundle
=	TokenNameEQUAL	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
.	TokenNameDOT	
getBundle	TokenNameIdentifier	 get Bundle
(	TokenNameLPAREN	
"org.apache.lucene.queryParser.messages.QueryParserMessages"	TokenNameStringLiteral	org.apache.lucene.queryParser.messages.QueryParserMessages
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
bundle	TokenNameIdentifier	 bundle
.	TokenNameDOT	
getObject	TokenNameIdentifier	 get Object
(	TokenNameLPAREN	
"Q0008E.NODE_ACTION_NOT_SUPPORTED"	TokenNameStringLiteral	Q0008E.NODE_ACTION_NOT_SUPPORTED
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// reset parent value 	TokenNameCOMMENT_LINE	reset parent value 
for	TokenNamefor	
(	TokenNameLPAREN	
QueryNode	TokenNameIdentifier	 Query Node
child	TokenNameIdentifier	 child
:	TokenNameCOLON	
children	TokenNameIdentifier	 children
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
QueryNodeImpl	TokenNameIdentifier	 Query Node Impl
)	TokenNameRPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
.	TokenNameDOT	
setParent	TokenNameIdentifier	 set Parent
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// allocate new children list 	TokenNameCOMMENT_LINE	allocate new children list 
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add new children and set parent 	TokenNameCOMMENT_LINE	add new children and set parent 
for	TokenNamefor	
(	TokenNameLPAREN	
QueryNode	TokenNameIdentifier	 Query Node
child	TokenNameIdentifier	 child
:	TokenNameCOLON	
children	TokenNameIdentifier	 children
)	TokenNameRPAREN	
{	TokenNameLBRACE	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
QueryNode	TokenNameIdentifier	 Query Node
cloneTree	TokenNameIdentifier	 clone Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
QueryNodeImpl	TokenNameIdentifier	 Query Node Impl
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
QueryNodeImpl	TokenNameIdentifier	 Query Node Impl
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
isLeaf	TokenNameIdentifier	 is Leaf
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
isLeaf	TokenNameIdentifier	 is Leaf
;	TokenNameSEMICOLON	
// Reset all tags 	TokenNameCOMMENT_LINE	Reset all tags 
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
tags	TokenNameIdentifier	 tags
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// copy children 	TokenNameCOMMENT_LINE	copy children 
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
clauses	TokenNameIdentifier	 clauses
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
QueryNode	TokenNameIdentifier	 Query Node
>	TokenNameGREATER	
localClauses	TokenNameIdentifier	 local Clauses
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
QueryNode	TokenNameIdentifier	 Query Node
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
QueryNode	TokenNameIdentifier	 Query Node
clause	TokenNameIdentifier	 clause
:	TokenNameCOLON	
this	TokenNamethis	
.	TokenNameDOT	
clauses	TokenNameIdentifier	 clauses
)	TokenNameRPAREN	
{	TokenNameLBRACE	
localClauses	TokenNameIdentifier	 local Clauses
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
clause	TokenNameIdentifier	 clause
.	TokenNameDOT	
cloneTree	TokenNameIdentifier	 clone Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
clauses	TokenNameIdentifier	 clauses
=	TokenNameEQUAL	
localClauses	TokenNameIdentifier	 local Clauses
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
cloneTree	TokenNameIdentifier	 clone Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
setLeaf	TokenNameIdentifier	 set Leaf
(	TokenNameLPAREN	
boolean	TokenNameboolean	
isLeaf	TokenNameIdentifier	 is Leaf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
isLeaf	TokenNameIdentifier	 is Leaf
=	TokenNameEQUAL	
isLeaf	TokenNameIdentifier	 is Leaf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return a List for QueryNode object. Returns null, for nodes that do not * contain children. All leaf Nodes return null. */	TokenNameCOMMENT_JAVADOC	 @return a List for QueryNode object. Returns null, for nodes that do not contain children. All leaf Nodes return null. 
public	TokenNamepublic	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
QueryNode	TokenNameIdentifier	 Query Node
>	TokenNameGREATER	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isLeaf	TokenNameIdentifier	 is Leaf
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
this	TokenNamethis	
.	TokenNameDOT	
clauses	TokenNameIdentifier	 clauses
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
clauses	TokenNameIdentifier	 clauses
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @deprecated use {@link #setTag(String, Object)} instead */	TokenNameCOMMENT_JAVADOC	 @deprecated use {@link #setTag(String, Object)} instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
void	TokenNamevoid	
setTag	TokenNameIdentifier	 set Tag
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
tagName	TokenNameIdentifier	 tag Name
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
tags	TokenNameIdentifier	 tags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setTag	TokenNameIdentifier	 set Tag
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tagName	TokenNameIdentifier	 tag Name
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
tags	TokenNameIdentifier	 tags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
unsetTag	TokenNameIdentifier	 unset Tag
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
tags	TokenNameIdentifier	 tags
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @deprecated use {@link #unsetTag(String)} */	TokenNameCOMMENT_JAVADOC	 @deprecated use {@link #unsetTag(String)} 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
void	TokenNamevoid	
unsetTag	TokenNameIdentifier	 unset Tag
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
tags	TokenNameIdentifier	 tags
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * verify if a node contains a tag * * @deprecated use {@link #containsTag(String)} instead */	TokenNameCOMMENT_JAVADOC	 verify if a node contains a tag * @deprecated use {@link #containsTag(String)} instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
boolean	TokenNameboolean	
containsTag	TokenNameIdentifier	 contains Tag
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
tags	TokenNameIdentifier	 tags
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** verify if a node contains a tag */	TokenNameCOMMENT_JAVADOC	 verify if a node contains a tag 
public	TokenNamepublic	
boolean	TokenNameboolean	
containsTag	TokenNameIdentifier	 contains Tag
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
tags	TokenNameIdentifier	 tags
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @deprecated use {@link #getTag(String)} instead */	TokenNameCOMMENT_JAVADOC	 @deprecated use {@link #getTag(String)} instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getTag	TokenNameIdentifier	 get Tag
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
tags	TokenNameIdentifier	 tags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getTag	TokenNameIdentifier	 get Tag
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
tags	TokenNameIdentifier	 tags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
QueryNode	TokenNameIdentifier	 Query Node
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
void	TokenNamevoid	
setParent	TokenNameIdentifier	 set Parent
(	TokenNameLPAREN	
QueryNode	TokenNameIdentifier	 Query Node
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
QueryNode	TokenNameIdentifier	 Query Node
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
boolean	TokenNameboolean	
isRoot	TokenNameIdentifier	 is Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If set to true the the method toQueryString will not write field names */	TokenNameCOMMENT_JAVADOC	 If set to true the the method toQueryString will not write field names 
protected	TokenNameprotected	
boolean	TokenNameboolean	
toQueryStringIgnoreFields	TokenNameIdentifier	 to Query String Ignore Fields
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * This method is use toQueryString to detect if fld is the default field * * @param fld - field name * @return true if fld is the default field */	TokenNameCOMMENT_JAVADOC	 This method is use toQueryString to detect if fld is the default field * @param fld - field name @return true if fld is the default field 
// TODO: remove this method, it's commonly used by {@link 	TokenNameCOMMENT_LINE	TODO: remove this method, it's commonly used by {@link 
// #toQueryString(org.apache.lucene.queryParser.core.parser.EscapeQuerySyntax)} 	TokenNameCOMMENT_LINE	#toQueryString(org.apache.lucene.queryParser.core.parser.EscapeQuerySyntax)} 
// to figure out what is the default field, however, {@link 	TokenNameCOMMENT_LINE	to figure out what is the default field, however, {@link 
// #toQueryString(org.apache.lucene.queryParser.core.parser.EscapeQuerySyntax)} 	TokenNameCOMMENT_LINE	#toQueryString(org.apache.lucene.queryParser.core.parser.EscapeQuerySyntax)} 
// should receive the default field value directly by parameter 	TokenNameCOMMENT_LINE	should receive the default field value directly by parameter 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isDefaultField	TokenNameIdentifier	 is Default Field
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
fld	TokenNameIdentifier	 fld
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
toQueryStringIgnoreFields	TokenNameIdentifier	 to Query String Ignore Fields
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fld	TokenNameIdentifier	 fld
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
QueryNodeImpl	TokenNameIdentifier	 Query Node Impl
.	TokenNameDOT	
PLAINTEXT_FIELD_NAME	TokenNameIdentifier	 PLAINTEXT  FIELD  NAME
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
fld	TokenNameIdentifier	 fld
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Every implementation of this class should return pseudo xml like this: * * For FieldQueryNode: <field start='1' end='2' field='subject' text='foo'/> * * @see org.apache.lucene.queryParser.core.nodes.QueryNode#toString() */	TokenNameCOMMENT_JAVADOC	 Every implementation of this class should return pseudo xml like this: * For FieldQueryNode: <field start='1' end='2' field='subject' text='foo'/> * @see org.apache.lucene.queryParser.core.nodes.QueryNode#toString() 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.lucene.queryParser.core.nodes.QueryNode#getTag(String) * @return a Map with all tags for this QueryNode * * @deprecated use {@link #getTagMap()} instead */	TokenNameCOMMENT_JAVADOC	 @see org.apache.lucene.queryParser.core.nodes.QueryNode#getTag(String) @return a Map with all tags for this QueryNode * @deprecated use {@link #getTagMap()} instead 
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
{	TokenNameLBRACE	
"unchecked"	TokenNameStringLiteral	unchecked
}	TokenNameRBRACE	
)	TokenNameRPAREN	
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
CharSequence	TokenNameIdentifier	 Char Sequence
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
getTags	TokenNameIdentifier	 get Tags
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
tags	TokenNameIdentifier	 tags
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
CharSequence	TokenNameIdentifier	 Char Sequence
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
charSeqMap	TokenNameIdentifier	 char Seq Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
CharSequence	TokenNameIdentifier	 Char Sequence
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
:	TokenNameCOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
charSeqMap	TokenNameIdentifier	 char Seq Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
charSeqMap	TokenNameIdentifier	 char Seq Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a map containing all tags attached to this query node. * * @return a map containing all tags attached to this query node */	TokenNameCOMMENT_JAVADOC	 Returns a map containing all tags attached to this query node. * @return a map containing all tags attached to this query node 
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unchecked"	TokenNameStringLiteral	unchecked
)	TokenNameRPAREN	
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
getTagMap	TokenNameIdentifier	 get Tag Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
tags	TokenNameIdentifier	 tags
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end class QueryNodeImpl 	TokenNameCOMMENT_LINE	end class QueryNodeImpl 
