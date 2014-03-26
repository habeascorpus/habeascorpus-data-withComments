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
List	TokenNameIdentifier	 List
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
MessageImpl	TokenNameIdentifier	 Message Impl
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
QueryNodeError	TokenNameIdentifier	 Query Node Error
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
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
EscapeQuerySyntax	TokenNameIdentifier	 Escape Query Syntax
;	TokenNameSEMICOLON	
/** * A {@link ModifierQueryNode} indicates the modifier value (+,-,?,NONE) for * each term on the query string. For example "+t1 -t2 t3" will have a tree of: * <blockquote> * &lt;BooleanQueryNode&gt; &lt;ModifierQueryNode modifier="MOD_REQ"&gt; &lt;t1/&gt; * &lt;/ModifierQueryNode&gt; &lt;ModifierQueryNode modifier="MOD_NOT"&gt; &lt;t2/&gt; * &lt;/ModifierQueryNode&gt; &lt;t3/&gt; &lt;/BooleanQueryNode&gt; * </blockquote> */	TokenNameCOMMENT_JAVADOC	 A {@link ModifierQueryNode} indicates the modifier value (+,-,?,NONE) for each term on the query string. For example "+t1 -t2 t3" will have a tree of: <blockquote> &lt;BooleanQueryNode&gt; &lt;ModifierQueryNode modifier="MOD_REQ"&gt; &lt;t1/&gt; &lt;/ModifierQueryNode&gt; &lt;ModifierQueryNode modifier="MOD_NOT"&gt; &lt;t2/&gt; &lt;/ModifierQueryNode&gt; &lt;t3/&gt; &lt;/BooleanQueryNode&gt; </blockquote> 
public	TokenNamepublic	
class	TokenNameclass	
ModifierQueryNode	TokenNameIdentifier	 Modifier Query Node
extends	TokenNameextends	
QueryNodeImpl	TokenNameIdentifier	 Query Node Impl
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
391209837953928169L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
enum	TokenNameenum	
Modifier	TokenNameIdentifier	 Modifier
{	TokenNameLBRACE	
MOD_NONE	TokenNameIdentifier	 MOD  NONE
,	TokenNameCOMMA	
MOD_NOT	TokenNameIdentifier	 MOD  NOT
,	TokenNameCOMMA	
MOD_REQ	TokenNameIdentifier	 MOD  REQ
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
MOD_NONE	TokenNameIdentifier	 MOD  NONE
:	TokenNameCOLON	
return	TokenNamereturn	
"MOD_NONE"	TokenNameStringLiteral	MOD_NONE
;	TokenNameSEMICOLON	
case	TokenNamecase	
MOD_NOT	TokenNameIdentifier	 MOD  NOT
:	TokenNameCOLON	
return	TokenNamereturn	
"MOD_NOT"	TokenNameStringLiteral	MOD_NOT
;	TokenNameSEMICOLON	
case	TokenNamecase	
MOD_REQ	TokenNameIdentifier	 MOD  REQ
:	TokenNameCOLON	
return	TokenNamereturn	
"MOD_REQ"	TokenNameStringLiteral	MOD_REQ
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// this code is never executed 	TokenNameCOMMENT_LINE	this code is never executed 
return	TokenNamereturn	
"MOD_DEFAULT"	TokenNameStringLiteral	MOD_DEFAULT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toDigitString	TokenNameIdentifier	 to Digit String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
MOD_NONE	TokenNameIdentifier	 MOD  NONE
:	TokenNameCOLON	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
case	TokenNamecase	
MOD_NOT	TokenNameIdentifier	 MOD  NOT
:	TokenNameCOLON	
return	TokenNamereturn	
"-"	TokenNameStringLiteral	-
;	TokenNameSEMICOLON	
case	TokenNamecase	
MOD_REQ	TokenNameIdentifier	 MOD  REQ
:	TokenNameCOLON	
return	TokenNamereturn	
"+"	TokenNameStringLiteral	+
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// this code is never executed 	TokenNameCOMMENT_LINE	this code is never executed 
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toLargeString	TokenNameIdentifier	 to Large String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
MOD_NONE	TokenNameIdentifier	 MOD  NONE
:	TokenNameCOLON	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
case	TokenNamecase	
MOD_NOT	TokenNameIdentifier	 MOD  NOT
:	TokenNameCOLON	
return	TokenNamereturn	
"NOT "	TokenNameStringLiteral	NOT 
;	TokenNameSEMICOLON	
case	TokenNamecase	
MOD_REQ	TokenNameIdentifier	 MOD  REQ
:	TokenNameCOLON	
return	TokenNamereturn	
"+"	TokenNameStringLiteral	+
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// this code is never executed 	TokenNameCOMMENT_LINE	this code is never executed 
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
Modifier	TokenNameIdentifier	 Modifier
modifier	TokenNameIdentifier	 modifier
=	TokenNameEQUAL	
Modifier	TokenNameIdentifier	 Modifier
.	TokenNameDOT	
MOD_NONE	TokenNameIdentifier	 MOD  NONE
;	TokenNameSEMICOLON	
/** * Used to store the modifier value on the original query string * * @param query * - QueryNode subtree * @param mod * - Modifier Value */	TokenNameCOMMENT_JAVADOC	 Used to store the modifier value on the original query string * @param query - QueryNode subtree @param mod - Modifier Value 
public	TokenNamepublic	
ModifierQueryNode	TokenNameIdentifier	 Modifier Query Node
(	TokenNameLPAREN	
QueryNode	TokenNameIdentifier	 Query Node
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
Modifier	TokenNameIdentifier	 Modifier
mod	TokenNameIdentifier	 mod
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
QueryNodeError	TokenNameIdentifier	 Query Node Error
(	TokenNameLPAREN	
new	TokenNamenew	
MessageImpl	TokenNameIdentifier	 Message Impl
(	TokenNameLPAREN	
QueryParserMessages	TokenNameIdentifier	 Query Parser Messages
.	TokenNameDOT	
PARAMETER_VALUE_NOT_SUPPORTED	TokenNameIdentifier	 PARAMETER  VALUE  NOT  SUPPORTED
,	TokenNameCOMMA	
"query"	TokenNameStringLiteral	query
,	TokenNameCOMMA	
"null"	TokenNameStringLiteral	null
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setLeaf	TokenNameIdentifier	 set Leaf
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
modifier	TokenNameIdentifier	 modifier
=	TokenNameEQUAL	
mod	TokenNameIdentifier	 mod
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
QueryNode	TokenNameIdentifier	 Query Node
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Modifier	TokenNameIdentifier	 Modifier
getModifier	TokenNameIdentifier	 get Modifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
modifier	TokenNameIdentifier	 modifier
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"<modifier operation='"	TokenNameStringLiteral	<modifier operation='
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
modifier	TokenNameIdentifier	 modifier
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"'>"	TokenNameStringLiteral	'>
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" </modifier>"	TokenNameStringLiteral	 </modifier>
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CharSequence	TokenNameIdentifier	 Char Sequence
toQueryString	TokenNameIdentifier	 to Query String
(	TokenNameLPAREN	
EscapeQuerySyntax	TokenNameIdentifier	 Escape Query Syntax
escapeSyntaxParser	TokenNameIdentifier	 escape Syntax Parser
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
leftParenthensis	TokenNameIdentifier	 left Parenthensis
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
rightParenthensis	TokenNameIdentifier	 right Parenthensis
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
ModifierQueryNode	TokenNameIdentifier	 Modifier Query Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
leftParenthensis	TokenNameIdentifier	 left Parenthensis
=	TokenNameEQUAL	
"("	TokenNameStringLiteral	(
;	TokenNameSEMICOLON	
rightParenthensis	TokenNameIdentifier	 right Parenthensis
=	TokenNameEQUAL	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
BooleanQueryNode	TokenNameIdentifier	 Boolean Query Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
modifier	TokenNameIdentifier	 modifier
.	TokenNameDOT	
toLargeString	TokenNameIdentifier	 to Large String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
leftParenthensis	TokenNameIdentifier	 left Parenthensis
+	TokenNamePLUS	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toQueryString	TokenNameIdentifier	 to Query String
(	TokenNameLPAREN	
escapeSyntaxParser	TokenNameIdentifier	 escape Syntax Parser
)	TokenNameRPAREN	
+	TokenNamePLUS	
rightParenthensis	TokenNameIdentifier	 right Parenthensis
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
modifier	TokenNameIdentifier	 modifier
.	TokenNameDOT	
toDigitString	TokenNameIdentifier	 to Digit String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
leftParenthensis	TokenNameIdentifier	 left Parenthensis
+	TokenNamePLUS	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toQueryString	TokenNameIdentifier	 to Query String
(	TokenNameLPAREN	
escapeSyntaxParser	TokenNameIdentifier	 escape Syntax Parser
)	TokenNameRPAREN	
+	TokenNamePLUS	
rightParenthensis	TokenNameIdentifier	 right Parenthensis
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
QueryNode	TokenNameIdentifier	 Query Node
cloneTree	TokenNameIdentifier	 clone Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
ModifierQueryNode	TokenNameIdentifier	 Modifier Query Node
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ModifierQueryNode	TokenNameIdentifier	 Modifier Query Node
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
cloneTree	TokenNameIdentifier	 clone Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
modifier	TokenNameIdentifier	 modifier
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
modifier	TokenNameIdentifier	 modifier
;	TokenNameSEMICOLON	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param child */	TokenNameCOMMENT_JAVADOC	 @param child 
public	TokenNamepublic	
void	TokenNamevoid	
setChild	TokenNameIdentifier	 set Child
(	TokenNameLPAREN	
QueryNode	TokenNameIdentifier	 Query Node
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
QueryNode	TokenNameIdentifier	 Query Node
>	TokenNameGREATER	
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
QueryNode	TokenNameIdentifier	 Query Node
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
