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
List	TokenNameIdentifier	 List
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
/** * A {@link AnyQueryNode} represents an ANY operator performed on a list of * nodes. */	TokenNameCOMMENT_JAVADOC	 A {@link AnyQueryNode} represents an ANY operator performed on a list of nodes. 
public	TokenNamepublic	
class	TokenNameclass	
AnyQueryNode	TokenNameIdentifier	 Any Query Node
extends	TokenNameextends	
AndQueryNode	TokenNameIdentifier	 And Query Node
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
1000791433562954187L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CharSequence	TokenNameIdentifier	 Char Sequence
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
minimumMatchingmElements	TokenNameIdentifier	 minimum Matchingm Elements
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * @param clauses * - the query nodes to be or'ed */	TokenNameCOMMENT_JAVADOC	 @param clauses - the query nodes to be or'ed 
public	TokenNamepublic	
AnyQueryNode	TokenNameIdentifier	 Any Query Node
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
QueryNode	TokenNameIdentifier	 Query Node
>	TokenNameGREATER	
clauses	TokenNameIdentifier	 clauses
,	TokenNameCOMMA	
CharSequence	TokenNameIdentifier	 Char Sequence
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
int	TokenNameint	
minimumMatchingElements	TokenNameIdentifier	 minimum Matching Elements
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
clauses	TokenNameIdentifier	 clauses
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
minimumMatchingmElements	TokenNameIdentifier	 minimum Matchingm Elements
=	TokenNameEQUAL	
minimumMatchingElements	TokenNameIdentifier	 minimum Matching Elements
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
clauses	TokenNameIdentifier	 clauses
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
QueryNode	TokenNameIdentifier	 Query Node
clause	TokenNameIdentifier	 clause
:	TokenNameCOLON	
clauses	TokenNameIdentifier	 clauses
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
clause	TokenNameIdentifier	 clause
instanceof	TokenNameinstanceof	
FieldQueryNode	TokenNameIdentifier	 Field Query Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
clause	TokenNameIdentifier	 clause
instanceof	TokenNameinstanceof	
QueryNodeImpl	TokenNameIdentifier	 Query Node Impl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
QueryNodeImpl	TokenNameIdentifier	 Query Node Impl
)	TokenNameRPAREN	
clause	TokenNameIdentifier	 clause
)	TokenNameRPAREN	
.	TokenNameDOT	
toQueryStringIgnoreFields	TokenNameIdentifier	 to Query String Ignore Fields
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
clause	TokenNameIdentifier	 clause
instanceof	TokenNameinstanceof	
FieldableNode	TokenNameIdentifier	 Fieldable Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
FieldableNode	TokenNameIdentifier	 Fieldable Node
)	TokenNameRPAREN	
clause	TokenNameIdentifier	 clause
)	TokenNameRPAREN	
.	TokenNameDOT	
setField	TokenNameIdentifier	 set Field
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getMinimumMatchingElements	TokenNameIdentifier	 get Minimum Matching Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
minimumMatchingmElements	TokenNameIdentifier	 minimum Matchingm Elements
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * returns null if the field was not specified * * @return the field */	TokenNameCOMMENT_JAVADOC	 returns null if the field was not specified * @return the field 
public	TokenNamepublic	
CharSequence	TokenNameIdentifier	 Char Sequence
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * returns - null if the field was not specified * * @return the field as a String */	TokenNameCOMMENT_JAVADOC	 returns - null if the field was not specified * @return the field as a String 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getFieldAsString	TokenNameIdentifier	 get Field As String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param field * - the field to set */	TokenNameCOMMENT_JAVADOC	 @param field - the field to set 
public	TokenNamepublic	
void	TokenNamevoid	
setField	TokenNameIdentifier	 set Field
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
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
AnyQueryNode	TokenNameIdentifier	 Any Query Node
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AnyQueryNode	TokenNameIdentifier	 Any Query Node
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
cloneTree	TokenNameIdentifier	 clone Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
minimumMatchingmElements	TokenNameIdentifier	 minimum Matchingm Elements
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
minimumMatchingmElements	TokenNameIdentifier	 minimum Matchingm Elements
;	TokenNameSEMICOLON	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
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
if	TokenNameif	
(	TokenNameLPAREN	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
"<any field='"	TokenNameStringLiteral	<any field='
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
+	TokenNamePLUS	
"' matchelements="	TokenNameStringLiteral	' matchelements=
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
minimumMatchingmElements	TokenNameIdentifier	 minimum Matchingm Elements
+	TokenNamePLUS	
"/>"	TokenNameStringLiteral	/>
;	TokenNameSEMICOLON	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"<any field='"	TokenNameStringLiteral	<any field='
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
+	TokenNamePLUS	
"' matchelements="	TokenNameStringLiteral	' matchelements=
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
minimumMatchingmElements	TokenNameIdentifier	 minimum Matchingm Elements
+	TokenNamePLUS	
">"	TokenNameStringLiteral	>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
QueryNode	TokenNameIdentifier	 Query Node
clause	TokenNameIdentifier	 clause
:	TokenNameCOLON	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
clause	TokenNameIdentifier	 clause
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" </any>"	TokenNameStringLiteral	 </any>
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
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
CharSequence	TokenNameIdentifier	 Char Sequence
toQueryString	TokenNameIdentifier	 to Query String
(	TokenNameLPAREN	
EscapeQuerySyntax	TokenNameIdentifier	 Escape Query Syntax
escapeSyntaxParser	TokenNameIdentifier	 escape Syntax Parser
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
anySTR	TokenNameIdentifier	 any STR
=	TokenNameEQUAL	
"ANY "	TokenNameStringLiteral	ANY 
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
minimumMatchingmElements	TokenNameIdentifier	 minimum Matchingm Elements
;	TokenNameSEMICOLON	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no childs case 	TokenNameCOMMENT_LINE	no childs case 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
filler	TokenNameIdentifier	 filler
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
QueryNode	TokenNameIdentifier	 Query Node
clause	TokenNameIdentifier	 clause
:	TokenNameCOLON	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
filler	TokenNameIdentifier	 filler
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
clause	TokenNameIdentifier	 clause
.	TokenNameDOT	
toQueryString	TokenNameIdentifier	 to Query String
(	TokenNameLPAREN	
escapeSyntaxParser	TokenNameIdentifier	 escape Syntax Parser
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filler	TokenNameIdentifier	 filler
=	TokenNameEQUAL	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isDefaultField	TokenNameIdentifier	 is Default Field
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"( "	TokenNameStringLiteral	( 
+	TokenNamePLUS	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" ) "	TokenNameStringLiteral	 ) 
+	TokenNamePLUS	
anySTR	TokenNameIdentifier	 any STR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
+	TokenNamePLUS	
":(( "	TokenNameStringLiteral	:(( 
+	TokenNamePLUS	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" ) "	TokenNameStringLiteral	 ) 
+	TokenNamePLUS	
anySTR	TokenNameIdentifier	 any STR
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
