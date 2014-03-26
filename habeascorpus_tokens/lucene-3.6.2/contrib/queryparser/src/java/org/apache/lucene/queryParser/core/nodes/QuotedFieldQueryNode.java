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
/** * A {@link QuotedFieldQueryNode} represents phrase query. Example: * "life is great" */	TokenNameCOMMENT_JAVADOC	 A {@link QuotedFieldQueryNode} represents phrase query. Example: "life is great" 
public	TokenNamepublic	
class	TokenNameclass	
QuotedFieldQueryNode	TokenNameIdentifier	 Quoted Field Query Node
extends	TokenNameextends	
FieldQueryNode	TokenNameIdentifier	 Field Query Node
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
6675157780051428987L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * @param field * - field name * @param text * - value * @param begin * - position in the query string * @param end * - position in the query string */	TokenNameCOMMENT_JAVADOC	 @param field - field name @param text - value @param begin - position in the query string @param end - position in the query string 
public	TokenNamepublic	
QuotedFieldQueryNode	TokenNameIdentifier	 Quoted Field Query Node
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
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
CharSequence	TokenNameIdentifier	 Char Sequence
toQueryString	TokenNameIdentifier	 to Query String
(	TokenNameLPAREN	
EscapeQuerySyntax	TokenNameIdentifier	 Escape Query Syntax
escaper	TokenNameIdentifier	 escaper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
"""	TokenNameStringLiteral	"
+	TokenNamePLUS	
getTermEscapeQuoted	TokenNameIdentifier	 get Term Escape Quoted
(	TokenNameLPAREN	
escaper	TokenNameIdentifier	 escaper
)	TokenNameRPAREN	
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
+	TokenNamePLUS	
getTermEscapeQuoted	TokenNameIdentifier	 get Term Escape Quoted
(	TokenNameLPAREN	
escaper	TokenNameIdentifier	 escaper
)	TokenNameRPAREN	
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
"<quotedfield start='"	TokenNameStringLiteral	<quotedfield start='
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
begin	TokenNameIdentifier	 begin
+	TokenNamePLUS	
"' end='"	TokenNameStringLiteral	' end='
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
end	TokenNameIdentifier	 end
+	TokenNamePLUS	
"' field='"	TokenNameStringLiteral	' field='
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
QuotedFieldQueryNode	TokenNameIdentifier	 Quoted Field Query Node
cloneTree	TokenNameIdentifier	 clone Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
QuotedFieldQueryNode	TokenNameIdentifier	 Quoted Field Query Node
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
QuotedFieldQueryNode	TokenNameIdentifier	 Quoted Field Query Node
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
