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
Locale	TokenNameIdentifier	 Locale
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
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
;	TokenNameSEMICOLON	
/** * A {@link FieldQueryNode} represents a element that contains field/text tuple */	TokenNameCOMMENT_JAVADOC	 A {@link FieldQueryNode} represents a element that contains field/text tuple 
public	TokenNamepublic	
class	TokenNameclass	
FieldQueryNode	TokenNameIdentifier	 Field Query Node
extends	TokenNameextends	
QueryNodeImpl	TokenNameIdentifier	 Query Node Impl
implements	TokenNameimplements	
FieldValuePairQueryNode	TokenNameIdentifier	 Field Value Pair Query Node
<	TokenNameLESS	
CharSequence	TokenNameIdentifier	 Char Sequence
>	TokenNameGREATER	
,	TokenNameCOMMA	
TextableQueryNode	TokenNameIdentifier	 Textable Query Node
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
3634521145130758265L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * The term's field */	TokenNameCOMMENT_JAVADOC	 The term's field 
protected	TokenNameprotected	
CharSequence	TokenNameIdentifier	 Char Sequence
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
/** * The term's text. */	TokenNameCOMMENT_JAVADOC	 The term's text. 
protected	TokenNameprotected	
CharSequence	TokenNameIdentifier	 Char Sequence
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
/** * The term's begin position. */	TokenNameCOMMENT_JAVADOC	 The term's begin position. 
protected	TokenNameprotected	
int	TokenNameint	
begin	TokenNameIdentifier	 begin
;	TokenNameSEMICOLON	
/** * The term's end position. */	TokenNameCOMMENT_JAVADOC	 The term's end position. 
protected	TokenNameprotected	
int	TokenNameint	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
/** * The term's position increment. */	TokenNameCOMMENT_JAVADOC	 The term's position increment. 
protected	TokenNameprotected	
int	TokenNameint	
positionIncrement	TokenNameIdentifier	 position Increment
;	TokenNameSEMICOLON	
/** * @param field * - field name * @param text * - value * @param begin * - position in the query string * @param end * - position in the query string */	TokenNameCOMMENT_JAVADOC	 @param field - field name @param text - value @param begin - position in the query string @param end - position in the query string 
public	TokenNamepublic	
FieldQueryNode	TokenNameIdentifier	 Field Query Node
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
this	TokenNamethis	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
begin	TokenNameIdentifier	 begin
=	TokenNameEQUAL	
begin	TokenNameIdentifier	 begin
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setLeaf	TokenNameIdentifier	 set Leaf
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
CharSequence	TokenNameIdentifier	 Char Sequence
getTermEscaped	TokenNameIdentifier	 get Term Escaped
(	TokenNameLPAREN	
EscapeQuerySyntax	TokenNameIdentifier	 Escape Query Syntax
escaper	TokenNameIdentifier	 escaper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
escaper	TokenNameIdentifier	 escaper
.	TokenNameDOT	
escape	TokenNameIdentifier	 escape
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
NORMAL	TokenNameIdentifier	 NORMAL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
CharSequence	TokenNameIdentifier	 Char Sequence
getTermEscapeQuoted	TokenNameIdentifier	 get Term Escape Quoted
(	TokenNameLPAREN	
EscapeQuerySyntax	TokenNameIdentifier	 Escape Query Syntax
escaper	TokenNameIdentifier	 escaper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
escaper	TokenNameIdentifier	 escaper
.	TokenNameDOT	
escape	TokenNameIdentifier	 escape
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
getTermEscaped	TokenNameIdentifier	 get Term Escaped
(	TokenNameLPAREN	
escaper	TokenNameIdentifier	 escaper
)	TokenNameRPAREN	
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
getTermEscaped	TokenNameIdentifier	 get Term Escaped
(	TokenNameLPAREN	
escaper	TokenNameIdentifier	 escaper
)	TokenNameRPAREN	
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
"<field start='"	TokenNameStringLiteral	<field start='
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
"' text='"	TokenNameStringLiteral	' text='
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
+	TokenNamePLUS	
"'/>"	TokenNameStringLiteral	'/>
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the term */	TokenNameCOMMENT_JAVADOC	 @return the term 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTextAsString	TokenNameIdentifier	 get Text As String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
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
text	TokenNameIdentifier	 text
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
public	TokenNamepublic	
int	TokenNameint	
getBegin	TokenNameIdentifier	 get Begin
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
begin	TokenNameIdentifier	 begin
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setBegin	TokenNameIdentifier	 set Begin
(	TokenNameLPAREN	
int	TokenNameint	
begin	TokenNameIdentifier	 begin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
begin	TokenNameIdentifier	 begin
=	TokenNameEQUAL	
begin	TokenNameIdentifier	 begin
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getEnd	TokenNameIdentifier	 get End
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setEnd	TokenNameIdentifier	 set End
(	TokenNameLPAREN	
int	TokenNameint	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
public	TokenNamepublic	
int	TokenNameint	
getPositionIncrement	TokenNameIdentifier	 get Position Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
positionIncrement	TokenNameIdentifier	 position Increment
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setPositionIncrement	TokenNameIdentifier	 set Position Increment
(	TokenNameLPAREN	
int	TokenNameint	
pi	TokenNameIdentifier	 pi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
positionIncrement	TokenNameIdentifier	 position Increment
=	TokenNameEQUAL	
pi	TokenNameIdentifier	 pi
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the term. * * @return The "original" form of the term. */	TokenNameCOMMENT_JAVADOC	 Returns the term. * @return The "original" form of the term. 
public	TokenNamepublic	
CharSequence	TokenNameIdentifier	 Char Sequence
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param text * the text to set */	TokenNameCOMMENT_JAVADOC	 @param text the text to set 
public	TokenNamepublic	
void	TokenNamevoid	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
FieldQueryNode	TokenNameIdentifier	 Field Query Node
cloneTree	TokenNameIdentifier	 clone Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
FieldQueryNode	TokenNameIdentifier	 Field Query Node
fqn	TokenNameIdentifier	 fqn
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FieldQueryNode	TokenNameIdentifier	 Field Query Node
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
cloneTree	TokenNameIdentifier	 clone Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fqn	TokenNameIdentifier	 fqn
.	TokenNameDOT	
begin	TokenNameIdentifier	 begin
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
begin	TokenNameIdentifier	 begin
;	TokenNameSEMICOLON	
fqn	TokenNameIdentifier	 fqn
.	TokenNameDOT	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
fqn	TokenNameIdentifier	 fqn
.	TokenNameDOT	
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
fqn	TokenNameIdentifier	 fqn
.	TokenNameDOT	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
fqn	TokenNameIdentifier	 fqn
.	TokenNameDOT	
positionIncrement	TokenNameIdentifier	 position Increment
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
positionIncrement	TokenNameIdentifier	 position Increment
;	TokenNameSEMICOLON	
fqn	TokenNameIdentifier	 fqn
.	TokenNameDOT	
toQueryStringIgnoreFields	TokenNameIdentifier	 to Query String Ignore Fields
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
toQueryStringIgnoreFields	TokenNameIdentifier	 to Query String Ignore Fields
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fqn	TokenNameIdentifier	 fqn
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CharSequence	TokenNameIdentifier	 Char Sequence
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
