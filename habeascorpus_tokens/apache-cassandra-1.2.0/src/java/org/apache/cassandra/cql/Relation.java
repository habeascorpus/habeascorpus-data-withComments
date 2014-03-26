/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql	TokenNameIdentifier	 cql
;	TokenNameSEMICOLON	
/** * Relations encapsulate the relationship between an entity of some kind, and * a value (term). For example, <key> > "start" or "colname1" = "somevalue". * */	TokenNameCOMMENT_JAVADOC	 Relations encapsulate the relationship between an entity of some kind, and a value (term). For example, <key> > "start" or "colname1" = "somevalue". 
public	TokenNamepublic	
class	TokenNameclass	
Relation	TokenNameIdentifier	 Relation
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Term	TokenNameIdentifier	 Term
entity	TokenNameIdentifier	 entity
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
RelationType	TokenNameIdentifier	 Relation Type
relationType	TokenNameIdentifier	 relation Type
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Term	TokenNameIdentifier	 Term
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
/** * Creates a new relation. * * @param entity the kind of relation this is; what the term is being compared to. * @param type the type that describes how this entity relates to the value. * @param value the value being compared. */	TokenNameCOMMENT_JAVADOC	 Creates a new relation. * @param entity the kind of relation this is; what the term is being compared to. @param type the type that describes how this entity relates to the value. @param value the value being compared. 
public	TokenNamepublic	
Relation	TokenNameIdentifier	 Relation
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
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
.	TokenNameDOT	
entity	TokenNameIdentifier	 entity
=	TokenNameEQUAL	
entity	TokenNameIdentifier	 entity
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
relationType	TokenNameIdentifier	 relation Type
=	TokenNameEQUAL	
RelationType	TokenNameIdentifier	 Relation Type
.	TokenNameDOT	
forString	TokenNameIdentifier	 for String
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
RelationType	TokenNameIdentifier	 Relation Type
operator	TokenNameIdentifier	 operator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
relationType	TokenNameIdentifier	 relation Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Term	TokenNameIdentifier	 Term
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
return	TokenNamereturn	
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
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Relation(%s, %s, %s)"	TokenNameStringLiteral	Relation(%s, %s, %s)
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
enum	TokenNameenum	
RelationType	TokenNameIdentifier	 Relation Type
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
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
RelationType	TokenNameIdentifier	 Relation Type
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
