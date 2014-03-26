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
/** * A {@link ProximityQueryNode} represents a query where the terms should meet * specific distance conditions. (a b c) WITHIN [SENTENCE|PARAGRAPH|NUMBER] * [INORDER] ("a" "b" "c") WITHIN [SENTENCE|PARAGRAPH|NUMBER] [INORDER] * * TODO: Add this to the future standard Lucene parser/processor/builder */	TokenNameCOMMENT_JAVADOC	 A {@link ProximityQueryNode} represents a query where the terms should meet specific distance conditions. (a b c) WITHIN [SENTENCE|PARAGRAPH|NUMBER] [INORDER] ("a" "b" "c") WITHIN [SENTENCE|PARAGRAPH|NUMBER] [INORDER] * TODO: Add this to the future standard Lucene parser/processor/builder 
public	TokenNamepublic	
class	TokenNameclass	
ProximityQueryNode	TokenNameIdentifier	 Proximity Query Node
extends	TokenNameextends	
BooleanQueryNode	TokenNameIdentifier	 Boolean Query Node
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
9018220596680832916L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
enum	TokenNameenum	
Type	TokenNameIdentifier	 Type
{	TokenNameLBRACE	
PARAGRAPH	TokenNameIdentifier	 PARAGRAPH
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
CharSequence	TokenNameIdentifier	 Char Sequence
toQueryString	TokenNameIdentifier	 to Query String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"WITHIN PARAGRAPH"	TokenNameStringLiteral	WITHIN PARAGRAPH
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
SENTENCE	TokenNameIdentifier	 SENTENCE
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
CharSequence	TokenNameIdentifier	 Char Sequence
toQueryString	TokenNameIdentifier	 to Query String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"WITHIN SENTENCE"	TokenNameStringLiteral	WITHIN SENTENCE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
NUMBER	TokenNameIdentifier	 NUMBER
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
CharSequence	TokenNameIdentifier	 Char Sequence
toQueryString	TokenNameIdentifier	 to Query String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"WITHIN"	TokenNameStringLiteral	WITHIN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
abstract	TokenNameabstract	
CharSequence	TokenNameIdentifier	 Char Sequence
toQueryString	TokenNameIdentifier	 to Query String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// utility class 	TokenNameCOMMENT_LINE	utility class 
static	TokenNamestatic	
public	TokenNamepublic	
class	TokenNameclass	
ProximityType	TokenNameIdentifier	 Proximity Type
{	TokenNameLBRACE	
int	TokenNameint	
pDistance	TokenNameIdentifier	 p Distance
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Type	TokenNameIdentifier	 Type
pType	TokenNameIdentifier	 p Type
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ProximityType	TokenNameIdentifier	 Proximity Type
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ProximityType	TokenNameIdentifier	 Proximity Type
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
int	TokenNameint	
distance	TokenNameIdentifier	 distance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
pType	TokenNameIdentifier	 p Type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
pDistance	TokenNameIdentifier	 p Distance
=	TokenNameEQUAL	
distance	TokenNameIdentifier	 distance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
Type	TokenNameIdentifier	 Type
proximityType	TokenNameIdentifier	 proximity Type
=	TokenNameEQUAL	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
SENTENCE	TokenNameIdentifier	 SENTENCE
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
distance	TokenNameIdentifier	 distance
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
inorder	TokenNameIdentifier	 inorder
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CharSequence	TokenNameIdentifier	 Char Sequence
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * @param clauses * - QueryNode children * @param field * - field name * @param type * - type of proximity query * @param distance * - positive integer that specifies the distance * @param inorder * - true, if the tokens should be matched in the order of the * clauses */	TokenNameCOMMENT_JAVADOC	 @param clauses - QueryNode children @param field - field name @param type - type of proximity query @param distance - positive integer that specifies the distance @param inorder - true, if the tokens should be matched in the order of the clauses 
public	TokenNamepublic	
ProximityQueryNode	TokenNameIdentifier	 Proximity Query Node
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
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
int	TokenNameint	
distance	TokenNameIdentifier	 distance
,	TokenNameCOMMA	
boolean	TokenNameboolean	
inorder	TokenNameIdentifier	 inorder
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
clauses	TokenNameIdentifier	 clauses
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setLeaf	TokenNameIdentifier	 set Leaf
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
proximityType	TokenNameIdentifier	 proximity Type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
inorder	TokenNameIdentifier	 inorder
=	TokenNameEQUAL	
inorder	TokenNameIdentifier	 inorder
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
NUMBER	TokenNameIdentifier	 NUMBER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
distance	TokenNameIdentifier	 distance
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
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
"distance"	TokenNameStringLiteral	distance
,	TokenNameCOMMA	
distance	TokenNameIdentifier	 distance
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
distance	TokenNameIdentifier	 distance
=	TokenNameEQUAL	
distance	TokenNameIdentifier	 distance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
clearFields	TokenNameIdentifier	 clear Fields
(	TokenNameLPAREN	
clauses	TokenNameIdentifier	 clauses
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param clauses * - QueryNode children * @param field * - field name * @param type * - type of proximity query * @param inorder * - true, if the tokens should be matched in the order of the * clauses */	TokenNameCOMMENT_JAVADOC	 @param clauses - QueryNode children @param field - field name @param type - type of proximity query @param inorder - true, if the tokens should be matched in the order of the clauses 
public	TokenNamepublic	
ProximityQueryNode	TokenNameIdentifier	 Proximity Query Node
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
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
boolean	TokenNameboolean	
inorder	TokenNameIdentifier	 inorder
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
clauses	TokenNameIdentifier	 clauses
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
inorder	TokenNameIdentifier	 inorder
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
private	TokenNameprivate	
void	TokenNamevoid	
clearFields	TokenNameIdentifier	 clear Fields
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
QueryNode	TokenNameIdentifier	 Query Node
>	TokenNameGREATER	
nodes	TokenNameIdentifier	 nodes
,	TokenNameCOMMA	
CharSequence	TokenNameIdentifier	 Char Sequence
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nodes	TokenNameIdentifier	 nodes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
QueryNode	TokenNameIdentifier	 Query Node
clause	TokenNameIdentifier	 clause
:	TokenNameCOLON	
nodes	TokenNameIdentifier	 nodes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
clause	TokenNameIdentifier	 clause
instanceof	TokenNameinstanceof	
FieldQueryNode	TokenNameIdentifier	 Field Query Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
FieldQueryNode	TokenNameIdentifier	 Field Query Node
)	TokenNameRPAREN	
clause	TokenNameIdentifier	 clause
)	TokenNameRPAREN	
.	TokenNameDOT	
toQueryStringIgnoreFields	TokenNameIdentifier	 to Query String Ignore Fields
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
FieldQueryNode	TokenNameIdentifier	 Field Query Node
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
public	TokenNamepublic	
Type	TokenNameIdentifier	 Type
getProximityType	TokenNameIdentifier	 get Proximity Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
proximityType	TokenNameIdentifier	 proximity Type
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
String	TokenNameIdentifier	 String
distanceSTR	TokenNameIdentifier	 distance STR
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
distance	TokenNameIdentifier	 distance
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
" distance='"	TokenNameStringLiteral	 distance='
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
distance	TokenNameIdentifier	 distance
)	TokenNameRPAREN	
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
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
return	TokenNamereturn	
"<proximity field='"	TokenNameStringLiteral	<proximity field='
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
+	TokenNamePLUS	
"' inorder='"	TokenNameStringLiteral	' inorder='
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
inorder	TokenNameIdentifier	 inorder
+	TokenNamePLUS	
"' type='"	TokenNameStringLiteral	' type='
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
proximityType	TokenNameIdentifier	 proximity Type
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
+	TokenNamePLUS	
distanceSTR	TokenNameIdentifier	 distance STR
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
"<proximity field='"	TokenNameStringLiteral	<proximity field='
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
+	TokenNamePLUS	
"' inorder='"	TokenNameStringLiteral	' inorder='
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
inorder	TokenNameIdentifier	 inorder
+	TokenNamePLUS	
"' type='"	TokenNameStringLiteral	' type='
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
proximityType	TokenNameIdentifier	 proximity Type
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
+	TokenNamePLUS	
distanceSTR	TokenNameIdentifier	 distance STR
+	TokenNamePLUS	
">"	TokenNameStringLiteral	>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
QueryNode	TokenNameIdentifier	 Query Node
child	TokenNameIdentifier	 child
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
child	TokenNameIdentifier	 child
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
" </proximity>"	TokenNameStringLiteral	 </proximity>
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
withinSTR	TokenNameIdentifier	 within STR
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
proximityType	TokenNameIdentifier	 proximity Type
.	TokenNameDOT	
toQueryString	TokenNameIdentifier	 to Query String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
distance	TokenNameIdentifier	 distance
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
distance	TokenNameIdentifier	 distance
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
inorder	TokenNameIdentifier	 inorder
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
" INORDER"	TokenNameStringLiteral	 INORDER
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
// no children case 	TokenNameCOMMENT_LINE	no children case 
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
child	TokenNameIdentifier	 child
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
child	TokenNameIdentifier	 child
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
withinSTR	TokenNameIdentifier	 within STR
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
withinSTR	TokenNameIdentifier	 within STR
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
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
ProximityQueryNode	TokenNameIdentifier	 Proximity Query Node
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ProximityQueryNode	TokenNameIdentifier	 Proximity Query Node
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
cloneTree	TokenNameIdentifier	 clone Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
proximityType	TokenNameIdentifier	 proximity Type
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
proximityType	TokenNameIdentifier	 proximity Type
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
distance	TokenNameIdentifier	 distance
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
distance	TokenNameIdentifier	 distance
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the distance */	TokenNameCOMMENT_JAVADOC	 @return the distance 
public	TokenNamepublic	
int	TokenNameint	
getDistance	TokenNameIdentifier	 get Distance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
distance	TokenNameIdentifier	 distance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * returns null if the field was not specified in the query string * * @return the field */	TokenNameCOMMENT_JAVADOC	 returns null if the field was not specified in the query string * @return the field 
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
/** * returns null if the field was not specified in the query string * * @return the field */	TokenNameCOMMENT_JAVADOC	 returns null if the field was not specified in the query string * @return the field 
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
/** * @param field * the field to set */	TokenNameCOMMENT_JAVADOC	 @param field the field to set 
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
/** * @return terms must be matched in the specified order */	TokenNameCOMMENT_JAVADOC	 @return terms must be matched in the specified order 
public	TokenNamepublic	
boolean	TokenNameboolean	
isInOrder	TokenNameIdentifier	 is In Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
inorder	TokenNameIdentifier	 inorder
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
