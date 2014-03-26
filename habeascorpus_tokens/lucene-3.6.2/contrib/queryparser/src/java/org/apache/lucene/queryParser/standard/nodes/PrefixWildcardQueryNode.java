package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
standard	TokenNameIdentifier	 standard
.	TokenNameDOT	
nodes	TokenNameIdentifier	 nodes
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
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
FieldQueryNode	TokenNameIdentifier	 Field Query Node
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * A {@link PrefixWildcardQueryNode} represents wildcardquery that matches abc* * or *. This does not apply to phrases, this is a special case on the original * lucene parser. TODO: refactor the code to remove this special case from the * parser. and probably do it on a Processor */	TokenNameCOMMENT_JAVADOC	 A {@link PrefixWildcardQueryNode} represents wildcardquery that matches abc* or *. This does not apply to phrases, this is a special case on the original lucene parser. TODO: refactor the code to remove this special case from the parser. and probably do it on a Processor 
public	TokenNamepublic	
class	TokenNameclass	
PrefixWildcardQueryNode	TokenNameIdentifier	 Prefix Wildcard Query Node
extends	TokenNameextends	
WildcardQueryNode	TokenNameIdentifier	 Wildcard Query Node
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
6851557641826407515L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * @param field * - field name * @param text * - value including the wildcard * @param begin * - position in the query string * @param end * - position in the query string */	TokenNameCOMMENT_JAVADOC	 @param field - field name @param text - value including the wildcard @param begin - position in the query string @param end - position in the query string 
public	TokenNamepublic	
PrefixWildcardQueryNode	TokenNameIdentifier	 Prefix Wildcard Query Node
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
CharSequence	TokenNameIdentifier	 Char Sequence
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
int	TokenNameint	
begin	TokenNameIdentifier	 begin
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
begin	TokenNameIdentifier	 begin
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PrefixWildcardQueryNode	TokenNameIdentifier	 Prefix Wildcard Query Node
(	TokenNameLPAREN	
FieldQueryNode	TokenNameIdentifier	 Field Query Node
fqn	TokenNameIdentifier	 fqn
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
fqn	TokenNameIdentifier	 fqn
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
fqn	TokenNameIdentifier	 fqn
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
fqn	TokenNameIdentifier	 fqn
.	TokenNameDOT	
getBegin	TokenNameIdentifier	 get Begin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
fqn	TokenNameIdentifier	 fqn
.	TokenNameDOT	
getEnd	TokenNameIdentifier	 get End
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
"<prefixWildcard field='"	TokenNameStringLiteral	<prefixWildcard field='
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
+	TokenNamePLUS	
"' term='"	TokenNameStringLiteral	' term='
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
+	TokenNamePLUS	
"'/>"	TokenNameStringLiteral	'/>
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
PrefixWildcardQueryNode	TokenNameIdentifier	 Prefix Wildcard Query Node
cloneTree	TokenNameIdentifier	 clone Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
PrefixWildcardQueryNode	TokenNameIdentifier	 Prefix Wildcard Query Node
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PrefixWildcardQueryNode	TokenNameIdentifier	 Prefix Wildcard Query Node
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
cloneTree	TokenNameIdentifier	 clone Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// nothing to do here 	TokenNameCOMMENT_LINE	nothing to do here 
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
