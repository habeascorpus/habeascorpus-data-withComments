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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
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
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
core	TokenNameIdentifier	 core
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
EscapeQuerySyntax	TokenNameIdentifier	 Escape Query Syntax
;	TokenNameSEMICOLON	
/** * A {@link QueryNode} is a interface implemented by all nodes on a QueryNode * tree. */	TokenNameCOMMENT_JAVADOC	 A {@link QueryNode} is a interface implemented by all nodes on a QueryNode tree. 
public	TokenNamepublic	
interface	TokenNameinterface	
QueryNode	TokenNameIdentifier	 Query Node
extends	TokenNameextends	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
/** convert to a query string understood by the query parser */	TokenNameCOMMENT_JAVADOC	 convert to a query string understood by the query parser 
// TODO: this interface might be changed in the future 	TokenNameCOMMENT_LINE	TODO: this interface might be changed in the future 
public	TokenNamepublic	
CharSequence	TokenNameIdentifier	 Char Sequence
toQueryString	TokenNameIdentifier	 to Query String
(	TokenNameLPAREN	
EscapeQuerySyntax	TokenNameIdentifier	 Escape Query Syntax
escapeSyntaxParser	TokenNameIdentifier	 escape Syntax Parser
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** for printing */	TokenNameCOMMENT_JAVADOC	 for printing 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** get Children nodes */	TokenNameCOMMENT_JAVADOC	 get Children nodes 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
QueryNode	TokenNameIdentifier	 Query Node
>	TokenNameGREATER	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** verify if a node is a Leaf node */	TokenNameCOMMENT_JAVADOC	 verify if a node is a Leaf node 
public	TokenNamepublic	
boolean	TokenNameboolean	
isLeaf	TokenNameIdentifier	 is Leaf
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** verify if a node contains a tag */	TokenNameCOMMENT_JAVADOC	 verify if a node contains a tag 
public	TokenNamepublic	
boolean	TokenNameboolean	
containsTag	TokenNameIdentifier	 contains Tag
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** verify if a node contains a tag * @deprecated use {@link #containsTag(String)} instead */	TokenNameCOMMENT_JAVADOC	 verify if a node contains a tag @deprecated use {@link #containsTag(String)} instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
boolean	TokenNameboolean	
containsTag	TokenNameIdentifier	 contains Tag
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @param tagName * @return of stored on under that tag name */	TokenNameCOMMENT_JAVADOC	 @param tagName @return of stored on under that tag name 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getTag	TokenNameIdentifier	 get Tag
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @param tagName * @return of stored on under that tag name * * @deprecated use {@link #getTag(String)} instead */	TokenNameCOMMENT_JAVADOC	 @param tagName @return of stored on under that tag name * @deprecated use {@link #getTag(String)} instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getTag	TokenNameIdentifier	 get Tag
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
QueryNode	TokenNameIdentifier	 Query Node
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Recursive clone the QueryNode tree The tags are not copied to the new tree * when you call the cloneTree() method * * @return the cloned tree * @throws CloneNotSupportedException */	TokenNameCOMMENT_JAVADOC	 Recursive clone the QueryNode tree The tags are not copied to the new tree when you call the cloneTree() method * @return the cloned tree @throws CloneNotSupportedException 
public	TokenNamepublic	
QueryNode	TokenNameIdentifier	 Query Node
cloneTree	TokenNameIdentifier	 clone Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
;	TokenNameSEMICOLON	
// Below are the methods that can change state of a QueryNode 	TokenNameCOMMENT_LINE	Below are the methods that can change state of a QueryNode 
// Write Operations (not Thread Safe) 	TokenNameCOMMENT_LINE	Write Operations (not Thread Safe) 
// add a new child to a non Leaf node 	TokenNameCOMMENT_LINE	add a new child to a non Leaf node 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
QueryNode	TokenNameIdentifier	 Query Node
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
QueryNode	TokenNameIdentifier	 Query Node
>	TokenNameGREATER	
children	TokenNameIdentifier	 children
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// reset the children of a node 	TokenNameCOMMENT_LINE	reset the children of a node 
public	TokenNamepublic	
void	TokenNamevoid	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
QueryNode	TokenNameIdentifier	 Query Node
>	TokenNameGREATER	
children	TokenNameIdentifier	 children
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Associate the specified value with the specified tagName. If the tagName * already exists, the old value is replaced. The tagName and value cannot be * null. tagName will be converted to lowercase. * * @param tagName * @param value */	TokenNameCOMMENT_JAVADOC	 Associate the specified value with the specified tagName. If the tagName already exists, the old value is replaced. The tagName and value cannot be null. tagName will be converted to lowercase. * @param tagName @param value 
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
;	TokenNameSEMICOLON	
/** * Associate the specified value with the specified tagName. If the tagName * already exists, the old value is replaced. The tagName and value cannot be * null. tagName will be converted to lowercase. * * @param tagName * @param value * * @deprecated use {@link #setTag(String, Object)} instead */	TokenNameCOMMENT_JAVADOC	 Associate the specified value with the specified tagName. If the tagName already exists, the old value is replaced. The tagName and value cannot be null. tagName will be converted to lowercase. * @param tagName @param value * @deprecated use {@link #setTag(String, Object)} instead 
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
;	TokenNameSEMICOLON	
/** * Unset a tag. tagName will be converted to lowercase. * * @param tagName */	TokenNameCOMMENT_JAVADOC	 Unset a tag. tagName will be converted to lowercase. * @param tagName 
public	TokenNamepublic	
void	TokenNamevoid	
unsetTag	TokenNameIdentifier	 unset Tag
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Unset a tag. tagName will be converted to lowercase. * * @param tagName * * @deprecated use {@link #unsetTag(String)} instead */	TokenNameCOMMENT_JAVADOC	 Unset a tag. tagName will be converted to lowercase. * @param tagName * @deprecated use {@link #unsetTag(String)} instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
void	TokenNamevoid	
unsetTag	TokenNameIdentifier	 unset Tag
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns a map containing all tags attached to this query node. * * @return a map containing all tags attached to this query node * * @deprecated use {@link #getTagMap()} */	TokenNameCOMMENT_JAVADOC	 Returns a map containing all tags attached to this query node. * @return a map containing all tags attached to this query node * @deprecated use {@link #getTagMap()} 
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
;	TokenNameSEMICOLON	
/** * Returns a map containing all tags attached to this query node. * * @return a map containing all tags attached to this query node */	TokenNameCOMMENT_JAVADOC	 Returns a map containing all tags attached to this query node. * @return a map containing all tags attached to this query node 
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
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
