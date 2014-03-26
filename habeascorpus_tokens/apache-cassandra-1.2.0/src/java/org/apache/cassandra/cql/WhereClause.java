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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
charset	TokenNameIdentifier	 charset
.	TokenNameDOT	
CharacterCodingException	TokenNameIdentifier	 Character Coding Exception
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
LinkedHashSet	TokenNameIdentifier	 Linked Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
CFMetaData	TokenNameIdentifier	 CF Meta Data
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
;	TokenNameSEMICOLON	
/** * WhereClauses encapsulate all of the predicates of a SELECT query. * */	TokenNameCOMMENT_JAVADOC	 WhereClauses encapsulate all of the predicates of a SELECT query. 
public	TokenNamepublic	
class	TokenNameclass	
WhereClause	TokenNameIdentifier	 Where Clause
{	TokenNameLBRACE	
// all relations (except for `<key> IN (.., .., ..)` which can be directly interpreted) from parser 	TokenNameCOMMENT_LINE	all relations (except for `<key> IN (.., .., ..)` which can be directly interpreted) from parser 
// are stored into this array and are filtered to the keys/columns by extractKeysFromColumns(...) 	TokenNameCOMMENT_LINE	are stored into this array and are filtered to the keys/columns by extractKeysFromColumns(...) 
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Relation	TokenNameIdentifier	 Relation
>	TokenNameGREATER	
clauseRelations	TokenNameIdentifier	 clause Relations
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Relation	TokenNameIdentifier	 Relation
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Relation	TokenNameIdentifier	 Relation
>	TokenNameGREATER	
columns	TokenNameIdentifier	 columns
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Relation	TokenNameIdentifier	 Relation
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// added to either by the parser from an IN clause or by extractKeysFromColumns 	TokenNameCOMMENT_LINE	added to either by the parser from an IN clause or by extractKeysFromColumns 
private	TokenNameprivate	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedHashSet	TokenNameIdentifier	 Linked Hash Set
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Term	TokenNameIdentifier	 Term
startKey	TokenNameIdentifier	 start Key
,	TokenNameCOMMA	
finishKey	TokenNameIdentifier	 finish Key
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
includeStartKey	TokenNameIdentifier	 include Start Key
=	TokenNameEQUAL	
false	TokenNamefalse	
,	TokenNameCOMMA	
includeFinishKey	TokenNameIdentifier	 include Finish Key
=	TokenNameEQUAL	
false	TokenNamefalse	
,	TokenNameCOMMA	
multiKey	TokenNameIdentifier	 multi Key
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// set by extractKeysFromColumns 	TokenNameCOMMENT_LINE	set by extractKeysFromColumns 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
keyAlias	TokenNameIdentifier	 key Alias
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Create a new WhereClause with the first parsed relation. * * @param firstRelation key or column relation */	TokenNameCOMMENT_JAVADOC	 Create a new WhereClause with the first parsed relation. * @param firstRelation key or column relation 
public	TokenNamepublic	
WhereClause	TokenNameIdentifier	 Where Clause
(	TokenNameLPAREN	
Relation	TokenNameIdentifier	 Relation
firstRelation	TokenNameIdentifier	 first Relation
)	TokenNameRPAREN	
{	TokenNameLBRACE	
and	TokenNameIdentifier	 and
(	TokenNameLPAREN	
firstRelation	TokenNameIdentifier	 first Relation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
WhereClause	TokenNameIdentifier	 Where Clause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Add an additional relation to this WHERE clause. * * @param relation the relation to add. */	TokenNameCOMMENT_JAVADOC	 Add an additional relation to this WHERE clause. * @param relation the relation to add. 
public	TokenNamepublic	
void	TokenNamevoid	
and	TokenNameIdentifier	 and
(	TokenNameLPAREN	
Relation	TokenNameIdentifier	 Relation
relation	TokenNameIdentifier	 relation
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clauseRelations	TokenNameIdentifier	 clause Relations
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
relation	TokenNameIdentifier	 relation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The same as KEY = <key> to avoid using Relation object * @param key key to include into clause */	TokenNameCOMMENT_JAVADOC	 The same as KEY = <key> to avoid using Relation object @param key key to include into clause 
public	TokenNamepublic	
void	TokenNamevoid	
andKeyEquals	TokenNameIdentifier	 and Key Equals
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Relation	TokenNameIdentifier	 Relation
>	TokenNameGREATER	
getColumnRelations	TokenNameIdentifier	 get Column Relations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
columns	TokenNameIdentifier	 columns
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isKeyRange	TokenNameIdentifier	 is Key Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
startKey	TokenNameIdentifier	 start Key
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Term	TokenNameIdentifier	 Term
getStartKey	TokenNameIdentifier	 get Start Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
startKey	TokenNameIdentifier	 start Key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Term	TokenNameIdentifier	 Term
getFinishKey	TokenNameIdentifier	 get Finish Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
finishKey	TokenNameIdentifier	 finish Key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
getKeys	TokenNameIdentifier	 get Keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
keys	TokenNameIdentifier	 keys
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
includeStartKey	TokenNameIdentifier	 include Start Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
includeStartKey	TokenNameIdentifier	 include Start Key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
includeFinishKey	TokenNameIdentifier	 include Finish Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
includeFinishKey	TokenNameIdentifier	 include Finish Key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setKeyAlias	TokenNameIdentifier	 set Key Alias
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
alias	TokenNameIdentifier	 alias
)	TokenNameRPAREN	
{	TokenNameLBRACE	
keyAlias	TokenNameIdentifier	 key Alias
=	TokenNameEQUAL	
alias	TokenNameIdentifier	 alias
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isMultiKey	TokenNameIdentifier	 is Multi Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
multiKey	TokenNameIdentifier	 multi Key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMultiKey	TokenNameIdentifier	 set Multi Key
(	TokenNameLPAREN	
boolean	TokenNameboolean	
multiKey	TokenNameIdentifier	 multi Key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
multiKey	TokenNameIdentifier	 multi Key
=	TokenNameEQUAL	
multiKey	TokenNameIdentifier	 multi Key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getKeyAlias	TokenNameIdentifier	 get Key Alias
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO fix special casing here, key alias should always be set post-extract 	TokenNameCOMMENT_LINE	TODO fix special casing here, key alias should always be set post-extract 
// key alias as not related to keys in here, it can be unset when we have a query like 	TokenNameCOMMENT_LINE	key alias as not related to keys in here, it can be unset when we have a query like 
// SELECT * FROM <CF> WHERE key = 1 and col > 2 and col < 3; 	TokenNameCOMMENT_LINE	SELECT * FROM <CF> WHERE key = 1 and col > 2 and col < 3; 
// it will be always set when statement looks like this 	TokenNameCOMMENT_LINE	it will be always set when statement looks like this 
// SELECT * FROM <CF> WHERE <key> IN (.., .., ..); 	TokenNameCOMMENT_LINE	SELECT * FROM <CF> WHERE <key> IN (.., .., ..); 
// key is NULL when KEY keyword is used or when key alias given by user was not recognized 	TokenNameCOMMENT_LINE	key is NULL when KEY keyword is used or when key alias given by user was not recognized 
// validateKeyAlias will throw an exception for us in that case 	TokenNameCOMMENT_LINE	validateKeyAlias will throw an exception for us in that case 
return	TokenNamereturn	
keyAlias	TokenNameIdentifier	 key Alias
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
QueryProcessor	TokenNameIdentifier	 Query Processor
.	TokenNameDOT	
DEFAULT_KEY_NAME	TokenNameIdentifier	 DEFAULT  KEY  NAME
:	TokenNameCOLON	
keyAlias	TokenNameIdentifier	 key Alias
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
extractKeysFromColumns	TokenNameIdentifier	 extract Keys From Columns
(	TokenNameLPAREN	
CFMetaData	TokenNameIdentifier	 CF Meta Data
cfm	TokenNameIdentifier	 cfm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
realKeyAlias	TokenNameIdentifier	 real Key Alias
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// ThriftValidation ensures that key_alias is ascii 	TokenNameCOMMENT_LINE	ThriftValidation ensures that key_alias is ascii 
realKeyAlias	TokenNameIdentifier	 real Key Alias
=	TokenNameEQUAL	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
string	TokenNameIdentifier	 string
(	TokenNameLPAREN	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getKeyName	TokenNameIdentifier	 get Key Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CharacterCodingException	TokenNameIdentifier	 Character Coding Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// we already have key(s) set (<key> IN (.., ...) construction used) 	TokenNameCOMMENT_LINE	we already have key(s) set (<key> IN (.., ...) construction used) 
for	TokenNamefor	
(	TokenNameLPAREN	
Relation	TokenNameIdentifier	 Relation
relation	TokenNameIdentifier	 relation
:	TokenNameCOLON	
clauseRelations	TokenNameIdentifier	 clause Relations
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
relation	TokenNameIdentifier	 relation
.	TokenNameDOT	
getEntity	TokenNameIdentifier	 get Entity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
realKeyAlias	TokenNameIdentifier	 real Key Alias
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
keyAlias	TokenNameIdentifier	 key Alias
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
// setting found key as an alias 	TokenNameCOMMENT_LINE	setting found key as an alias 
keyAlias	TokenNameIdentifier	 key Alias
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
relation	TokenNameIdentifier	 relation
.	TokenNameDOT	
operator	TokenNameIdentifier	 operator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
RelationType	TokenNameIdentifier	 Relation Type
.	TokenNameDOT	
EQ	TokenNameIdentifier	 EQ
)	TokenNameRPAREN	
{	TokenNameLBRACE	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
relation	TokenNameIdentifier	 relation
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
relation	TokenNameIdentifier	 relation
.	TokenNameDOT	
operator	TokenNameIdentifier	 operator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
RelationType	TokenNameIdentifier	 Relation Type
.	TokenNameDOT	
GT	TokenNameIdentifier	 GT
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
relation	TokenNameIdentifier	 relation
.	TokenNameDOT	
operator	TokenNameIdentifier	 operator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
RelationType	TokenNameIdentifier	 Relation Type
.	TokenNameDOT	
GTE	TokenNameIdentifier	 GTE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
startKey	TokenNameIdentifier	 start Key
=	TokenNameEQUAL	
relation	TokenNameIdentifier	 relation
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
includeStartKey	TokenNameIdentifier	 include Start Key
=	TokenNameEQUAL	
relation	TokenNameIdentifier	 relation
.	TokenNameDOT	
operator	TokenNameIdentifier	 operator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
RelationType	TokenNameIdentifier	 Relation Type
.	TokenNameDOT	
GTE	TokenNameIdentifier	 GTE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
relation	TokenNameIdentifier	 relation
.	TokenNameDOT	
operator	TokenNameIdentifier	 operator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
RelationType	TokenNameIdentifier	 Relation Type
.	TokenNameDOT	
LT	TokenNameIdentifier	 LT
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
relation	TokenNameIdentifier	 relation
.	TokenNameDOT	
operator	TokenNameIdentifier	 operator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
RelationType	TokenNameIdentifier	 Relation Type
.	TokenNameDOT	
LTE	TokenNameIdentifier	 LTE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
finishKey	TokenNameIdentifier	 finish Key
=	TokenNameEQUAL	
relation	TokenNameIdentifier	 relation
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
includeFinishKey	TokenNameIdentifier	 include Finish Key
=	TokenNameEQUAL	
relation	TokenNameIdentifier	 relation
.	TokenNameDOT	
operator	TokenNameIdentifier	 operator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
RelationType	TokenNameIdentifier	 Relation Type
.	TokenNameDOT	
LTE	TokenNameIdentifier	 LTE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
relation	TokenNameIdentifier	 relation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
"WhereClause [keys=%s, startKey=%s, finishKey=%s, columns=%s, includeStartKey=%s, includeFinishKey=%s, multiKey=%s, keyAlias=%s]"	TokenNameStringLiteral	WhereClause [keys=%s, startKey=%s, finishKey=%s, columns=%s, includeStartKey=%s, includeFinishKey=%s, multiKey=%s, keyAlias=%s]
,	TokenNameCOMMA	
keys	TokenNameIdentifier	 keys
,	TokenNameCOMMA	
startKey	TokenNameIdentifier	 start Key
,	TokenNameCOMMA	
finishKey	TokenNameIdentifier	 finish Key
,	TokenNameCOMMA	
columns	TokenNameIdentifier	 columns
,	TokenNameCOMMA	
includeStartKey	TokenNameIdentifier	 include Start Key
,	TokenNameCOMMA	
includeFinishKey	TokenNameIdentifier	 include Finish Key
,	TokenNameCOMMA	
multiKey	TokenNameIdentifier	 multi Key
,	TokenNameCOMMA	
keyAlias	TokenNameIdentifier	 key Alias
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
