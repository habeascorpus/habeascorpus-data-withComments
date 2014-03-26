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
/** * A {@link OpaqueQueryNode} is used for specify values that are not supposed to * be parsed by the parser. For example: and XPATH query in the middle of a * query string a b @xpath:'/bookstore/book[1]/title' c d */	TokenNameCOMMENT_JAVADOC	 A {@link OpaqueQueryNode} is used for specify values that are not supposed to be parsed by the parser. For example: and XPATH query in the middle of a query string a b @xpath:'/bookstore/book[1]/title' c d 
public	TokenNamepublic	
class	TokenNameclass	
OpaqueQueryNode	TokenNameIdentifier	 Opaque Query Node
extends	TokenNameextends	
QueryNodeImpl	TokenNameIdentifier	 Query Node Impl
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
0L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CharSequence	TokenNameIdentifier	 Char Sequence
schema	TokenNameIdentifier	 schema
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CharSequence	TokenNameIdentifier	 Char Sequence
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * @param schema * - schema identifier * @param value * - value that was not parsed */	TokenNameCOMMENT_JAVADOC	 @param schema - schema identifier @param value - value that was not parsed 
public	TokenNamepublic	
OpaqueQueryNode	TokenNameIdentifier	 Opaque Query Node
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
schema	TokenNameIdentifier	 schema
,	TokenNameCOMMA	
CharSequence	TokenNameIdentifier	 Char Sequence
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
setLeaf	TokenNameIdentifier	 set Leaf
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
schema	TokenNameIdentifier	 schema
=	TokenNameEQUAL	
schema	TokenNameIdentifier	 schema
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
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
"<opaque schema='"	TokenNameStringLiteral	<opaque schema='
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
schema	TokenNameIdentifier	 schema
+	TokenNamePLUS	
"' value='"	TokenNameStringLiteral	' value='
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
+	TokenNamePLUS	
"'/>"	TokenNameStringLiteral	'/>
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
return	TokenNamereturn	
"@"	TokenNameStringLiteral	@
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
schema	TokenNameIdentifier	 schema
+	TokenNamePLUS	
":'"	TokenNameStringLiteral	:'
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
;	TokenNameSEMICOLON	
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
OpaqueQueryNode	TokenNameIdentifier	 Opaque Query Node
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
OpaqueQueryNode	TokenNameIdentifier	 Opaque Query Node
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
cloneTree	TokenNameIdentifier	 clone Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
schema	TokenNameIdentifier	 schema
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
schema	TokenNameIdentifier	 schema
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the schema */	TokenNameCOMMENT_JAVADOC	 @return the schema 
public	TokenNamepublic	
CharSequence	TokenNameIdentifier	 Char Sequence
getSchema	TokenNameIdentifier	 get Schema
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
schema	TokenNameIdentifier	 schema
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the value */	TokenNameCOMMENT_JAVADOC	 @return the value 
public	TokenNamepublic	
CharSequence	TokenNameIdentifier	 Char Sequence
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
