/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql3	TokenNameIdentifier	 cql3
;	TokenNameSEMICOLON	
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
/** * Relations encapsulate the relationship between an entity of some kind, and * a value (term). For example, <key> > "start" or "colname1" = "somevalue". * */	TokenNameCOMMENT_JAVADOC	 Relations encapsulate the relationship between an entity of some kind, and a value (term). For example, <key> > "start" or "colname1" = "somevalue". 
public	TokenNamepublic	
class	TokenNameclass	
Relation	TokenNameIdentifier	 Relation
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
entity	TokenNameIdentifier	 entity
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Type	TokenNameIdentifier	 Type
relationType	TokenNameIdentifier	 relation Type
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Term	TokenNameIdentifier	 Term
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
inValues	TokenNameIdentifier	 in Values
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
onToken	TokenNameIdentifier	 on Token
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
enum	TokenNameenum	
Type	TokenNameIdentifier	 Type
{	TokenNameLBRACE	
EQ	TokenNameIdentifier	 EQ
,	TokenNameCOMMA	
LT	TokenNameIdentifier	 LT
,	TokenNameCOMMA	
LTE	TokenNameIdentifier	 LTE
,	TokenNameCOMMA	
GTE	TokenNameIdentifier	 GTE
,	TokenNameCOMMA	
GT	TokenNameIdentifier	 GT
,	TokenNameCOMMA	
IN	TokenNameIdentifier	 IN
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
Type	TokenNameIdentifier	 Type
forString	TokenNameIdentifier	 for String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"="	TokenNameStringLiteral	=
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
EQ	TokenNameIdentifier	 EQ
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"<"	TokenNameStringLiteral	<
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
LT	TokenNameIdentifier	 LT
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"<="	TokenNameStringLiteral	<=
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
LTE	TokenNameIdentifier	 LTE
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
">="	TokenNameStringLiteral	>=
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
GTE	TokenNameIdentifier	 GTE
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
">"	TokenNameStringLiteral	>
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
GT	TokenNameIdentifier	 GT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
Relation	TokenNameIdentifier	 Relation
(	TokenNameLPAREN	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
entity	TokenNameIdentifier	 entity
,	TokenNameCOMMA	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
Term	TokenNameIdentifier	 Term
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
inValues	TokenNameIdentifier	 in Values
,	TokenNameCOMMA	
boolean	TokenNameboolean	
onToken	TokenNameIdentifier	 on Token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
entity	TokenNameIdentifier	 entity
=	TokenNameEQUAL	
entity	TokenNameIdentifier	 entity
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
relationType	TokenNameIdentifier	 relation Type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
inValues	TokenNameIdentifier	 in Values
=	TokenNameEQUAL	
inValues	TokenNameIdentifier	 in Values
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
onToken	TokenNameIdentifier	 on Token
=	TokenNameEQUAL	
onToken	TokenNameIdentifier	 on Token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new relation. * * @param entity the kind of relation this is; what the term is being compared to. * @param type the type that describes how this entity relates to the value. * @param value the value being compared. */	TokenNameCOMMENT_JAVADOC	 Creates a new relation. * @param entity the kind of relation this is; what the term is being compared to. @param type the type that describes how this entity relates to the value. @param value the value being compared. 
public	TokenNamepublic	
Relation	TokenNameIdentifier	 Relation
(	TokenNameLPAREN	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
entity	TokenNameIdentifier	 entity
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
Term	TokenNameIdentifier	 Term
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
entity	TokenNameIdentifier	 entity
,	TokenNameCOMMA	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
forString	TokenNameIdentifier	 for String
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Relation	TokenNameIdentifier	 Relation
(	TokenNameLPAREN	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
entity	TokenNameIdentifier	 entity
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
Term	TokenNameIdentifier	 Term
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
boolean	TokenNameboolean	
onToken	TokenNameIdentifier	 on Token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
entity	TokenNameIdentifier	 entity
,	TokenNameCOMMA	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
forString	TokenNameIdentifier	 for String
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
onToken	TokenNameIdentifier	 on Token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Relation	TokenNameIdentifier	 Relation
createInRelation	TokenNameIdentifier	 create In Relation
(	TokenNameLPAREN	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
entity	TokenNameIdentifier	 entity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Relation	TokenNameIdentifier	 Relation
(	TokenNameLPAREN	
entity	TokenNameIdentifier	 entity
,	TokenNameCOMMA	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
IN	TokenNameIdentifier	 IN
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Type	TokenNameIdentifier	 Type
operator	TokenNameIdentifier	 operator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
relationType	TokenNameIdentifier	 relation Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
getEntity	TokenNameIdentifier	 get Entity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
entity	TokenNameIdentifier	 entity
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Term	TokenNameIdentifier	 Term
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
relationType	TokenNameIdentifier	 relation Type
!=	TokenNameNOT_EQUAL	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
IN	TokenNameIdentifier	 IN
;	TokenNameSEMICOLON	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
getInValues	TokenNameIdentifier	 get In Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
relationType	TokenNameIdentifier	 relation Type
==	TokenNameEQUAL_EQUAL	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
IN	TokenNameIdentifier	 IN
;	TokenNameSEMICOLON	
return	TokenNamereturn	
inValues	TokenNameIdentifier	 in Values
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addInValue	TokenNameIdentifier	 add In Value
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
inValues	TokenNameIdentifier	 in Values
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
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
if	TokenNameif	
(	TokenNameLPAREN	
relationType	TokenNameIdentifier	 relation Type
==	TokenNameEQUAL_EQUAL	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
IN	TokenNameIdentifier	 IN
)	TokenNameRPAREN	
return	TokenNamereturn	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"%s IN %s"	TokenNameStringLiteral	%s IN %s
,	TokenNameCOMMA	
entity	TokenNameIdentifier	 entity
,	TokenNameCOMMA	
inValues	TokenNameIdentifier	 in Values
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"%s %s %s"	TokenNameStringLiteral	%s %s %s
,	TokenNameCOMMA	
entity	TokenNameIdentifier	 entity
,	TokenNameCOMMA	
relationType	TokenNameIdentifier	 relation Type
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
