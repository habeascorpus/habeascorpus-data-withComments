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
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
NumberFormat	TokenNameIdentifier	 Number Format
;	TokenNameSEMICOLON	
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
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
FieldValuePairQueryNode	TokenNameIdentifier	 Field Value Pair Query Node
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
QueryNodeImpl	TokenNameIdentifier	 Query Node Impl
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
/** * This query node represents a field query that holds a numeric value. It is * similar to {@link org.apache.lucene.queryParser.core.nodes.FieldQueryNode}, * however the {@link #getValue()} returns a {@link Number}. * * @see org.apache.lucene.queryParser.standard.config.NumericConfig */	TokenNameCOMMENT_JAVADOC	 This query node represents a field query that holds a numeric value. It is similar to {@link org.apache.lucene.queryParser.core.nodes.FieldQueryNode}, however the {@link #getValue()} returns a {@link Number}. * @see org.apache.lucene.queryParser.standard.config.NumericConfig 
public	TokenNamepublic	
class	TokenNameclass	
NumericQueryNode	TokenNameIdentifier	 Numeric Query Node
extends	TokenNameextends	
QueryNodeImpl	TokenNameIdentifier	 Query Node Impl
implements	TokenNameimplements	
FieldValuePairQueryNode	TokenNameIdentifier	 Field Value Pair Query Node
<	TokenNameLESS	
Number	TokenNameIdentifier	 Number
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
1969102979874574778L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
NumberFormat	TokenNameIdentifier	 Number Format
numberFormat	TokenNameIdentifier	 number Format
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CharSequence	TokenNameIdentifier	 Char Sequence
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Number	TokenNameIdentifier	 Number
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
/** * Creates a {@link NumericQueryNode} object using the given field, * {@link Number} value and {@link NumberFormat} used to convert the value to * {@link String}. * * @param field the field associated with this query node * @param value the value hold by this node * @param numberFormat the {@link NumberFormat} used to convert the value to {@link String} */	TokenNameCOMMENT_JAVADOC	 Creates a {@link NumericQueryNode} object using the given field, {@link Number} value and {@link NumberFormat} used to convert the value to {@link String}. * @param field the field associated with this query node @param value the value hold by this node @param numberFormat the {@link NumberFormat} used to convert the value to {@link String} 
public	TokenNamepublic	
NumericQueryNode	TokenNameIdentifier	 Numeric Query Node
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
Number	TokenNameIdentifier	 Number
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
NumberFormat	TokenNameIdentifier	 Number Format
numberFormat	TokenNameIdentifier	 number Format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setNumberFormat	TokenNameIdentifier	 set Number Format
(	TokenNameLPAREN	
numberFormat	TokenNameIdentifier	 number Format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setField	TokenNameIdentifier	 set Field
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the field associated with this node. * * @return the field associated with this node */	TokenNameCOMMENT_JAVADOC	 Returns the field associated with this node. * @return the field associated with this node 
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
/** * Sets the field associated with this node. * * @param fieldName the field associated with this node */	TokenNameCOMMENT_JAVADOC	 Sets the field associated with this node. * @param fieldName the field associated with this node 
public	TokenNamepublic	
void	TokenNamevoid	
setField	TokenNameIdentifier	 set Field
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
fieldName	TokenNameIdentifier	 field Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method is used to get the value converted to {@link String} and * escaped using the given {@link EscapeQuerySyntax}. * * @param escaper the {@link EscapeQuerySyntax} used to escape the value {@link String} * * @return the value converte to {@link String} and escaped */	TokenNameCOMMENT_JAVADOC	 This method is used to get the value converted to {@link String} and escaped using the given {@link EscapeQuerySyntax}. * @param escaper the {@link EscapeQuerySyntax} used to escape the value {@link String} * @return the value converte to {@link String} and escaped 
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
NumberFormat	TokenNameIdentifier	 Number Format
.	TokenNameDOT	
getNumberInstance	TokenNameIdentifier	 get Number Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
,	TokenNameCOMMA	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
NORMAL	TokenNameIdentifier	 NORMAL
)	TokenNameRPAREN	
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
escapeSyntaxParser	TokenNameIdentifier	 escape Syntax Parser
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
escapeSyntaxParser	TokenNameIdentifier	 escape Syntax Parser
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Sets the {@link NumberFormat} used to convert the value to {@link String}. * * @param format the {@link NumberFormat} used to convert the value to {@link String} */	TokenNameCOMMENT_JAVADOC	 Sets the {@link NumberFormat} used to convert the value to {@link String}. * @param format the {@link NumberFormat} used to convert the value to {@link String} 
public	TokenNamepublic	
void	TokenNamevoid	
setNumberFormat	TokenNameIdentifier	 set Number Format
(	TokenNameLPAREN	
NumberFormat	TokenNameIdentifier	 Number Format
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
numberFormat	TokenNameIdentifier	 number Format
=	TokenNameEQUAL	
format	TokenNameIdentifier	 format
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the {@link NumberFormat} used to convert the value to {@link String}. * * @return the {@link NumberFormat} used to convert the value to {@link String} */	TokenNameCOMMENT_JAVADOC	 Returns the {@link NumberFormat} used to convert the value to {@link String}. * @return the {@link NumberFormat} used to convert the value to {@link String} 
public	TokenNamepublic	
NumberFormat	TokenNameIdentifier	 Number Format
getNumberFormat	TokenNameIdentifier	 get Number Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
numberFormat	TokenNameIdentifier	 number Format
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the numeric value as {@link Number}. * * @return the numeric value */	TokenNameCOMMENT_JAVADOC	 Returns the numeric value as {@link Number}. * @return the numeric value 
public	TokenNamepublic	
Number	TokenNameIdentifier	 Number
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the numeric value. * * @param value the numeric value */	TokenNameCOMMENT_JAVADOC	 Sets the numeric value. * @param value the numeric value 
public	TokenNamepublic	
void	TokenNamevoid	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
Number	TokenNameIdentifier	 Number
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
"<numeric field='"	TokenNameStringLiteral	<numeric field='
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
+	TokenNamePLUS	
"' number='"	TokenNameStringLiteral	' number='
+	TokenNamePLUS	
numberFormat	TokenNameIdentifier	 number Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
+	TokenNamePLUS	
"'/>"	TokenNameStringLiteral	'/>
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
