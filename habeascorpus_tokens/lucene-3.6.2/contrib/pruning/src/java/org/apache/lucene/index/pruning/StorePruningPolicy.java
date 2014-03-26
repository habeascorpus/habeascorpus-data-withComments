package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
pruning	TokenNameIdentifier	 pruning
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
logging	TokenNameIdentifier	 logging
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
FieldSelector	TokenNameIdentifier	 Field Selector
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
FieldSelectorResult	TokenNameIdentifier	 Field Selector Result
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
FieldInfo	TokenNameIdentifier	 Field Info
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
FieldInfos	TokenNameIdentifier	 Field Infos
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
IndexReader	TokenNameIdentifier	 Index Reader
;	TokenNameSEMICOLON	
/** * Pruning policy for removing stored fields from documents. */	TokenNameCOMMENT_JAVADOC	 Pruning policy for removing stored fields from documents. 
public	TokenNamepublic	
class	TokenNameclass	
StorePruningPolicy	TokenNameIdentifier	 Store Pruning Policy
extends	TokenNameextends	
PruningPolicy	TokenNameIdentifier	 Pruning Policy
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
LOG	TokenNameIdentifier	 LOG
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
StorePruningPolicy	TokenNameIdentifier	 Store Pruning Policy
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Pruning in effect for each field */	TokenNameCOMMENT_JAVADOC	 Pruning in effect for each field 
protected	TokenNameprotected	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
fieldFlags	TokenNameIdentifier	 field Flags
;	TokenNameSEMICOLON	
/** Fields to be completely deleted */	TokenNameCOMMENT_JAVADOC	 Fields to be completely deleted 
protected	TokenNameprotected	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
deleteAll	TokenNameIdentifier	 delete All
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
DelFieldSelector	TokenNameIdentifier	 Del Field Selector
fs	TokenNameIdentifier	 fs
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
IndexReader	TokenNameIdentifier	 Index Reader
in	TokenNameIdentifier	 in
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
delFields	TokenNameIdentifier	 del Fields
;	TokenNameSEMICOLON	
// total number of fields deleted 	TokenNameCOMMENT_LINE	total number of fields deleted 
/** * Constructs a policy. * @param in input reader. * @param fieldFlags a map where keys are field names, and flags are * bitwise-OR values of flags defined in {@link PruningPolicy}. */	TokenNameCOMMENT_JAVADOC	 Constructs a policy. @param in input reader. @param fieldFlags a map where keys are field names, and flags are bitwise-OR values of flags defined in {@link PruningPolicy}. 
public	TokenNamepublic	
StorePruningPolicy	TokenNameIdentifier	 Store Pruning Policy
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
fieldFlags	TokenNameIdentifier	 field Flags
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fieldFlags	TokenNameIdentifier	 field Flags
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fieldFlags	TokenNameIdentifier	 field Flags
=	TokenNameEQUAL	
fieldFlags	TokenNameIdentifier	 field Flags
;	TokenNameSEMICOLON	
deleteAll	TokenNameIdentifier	 delete All
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
e	TokenNameIdentifier	 e
:	TokenNameCOLON	
fieldFlags	TokenNameIdentifier	 field Flags
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
PruningPolicy	TokenNameIdentifier	 Pruning Policy
.	TokenNameDOT	
DEL_ALL	TokenNameIdentifier	 DEL  ALL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
deleteAll	TokenNameIdentifier	 delete All
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fieldFlags	TokenNameIdentifier	 field Flags
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
emptyMap	TokenNameIdentifier	 empty Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
deleteAll	TokenNameIdentifier	 delete All
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
emptySet	TokenNameIdentifier	 empty Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fs	TokenNameIdentifier	 fs
=	TokenNameEQUAL	
new	TokenNamenew	
DelFieldSelector	TokenNameIdentifier	 Del Field Selector
(	TokenNameLPAREN	
fieldFlags	TokenNameIdentifier	 field Flags
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compute field infos that should be retained * @param allInfos original field infos * @return those of the original field infos which should not be removed. */	TokenNameCOMMENT_JAVADOC	 Compute field infos that should be retained @param allInfos original field infos @return those of the original field infos which should not be removed. 
public	TokenNamepublic	
FieldInfos	TokenNameIdentifier	 Field Infos
getFieldInfos	TokenNameIdentifier	 get Field Infos
(	TokenNameLPAREN	
FieldInfos	TokenNameIdentifier	 Field Infos
allInfos	TokenNameIdentifier	 all Infos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// for simplicity remove only fields with DEL_ALL 	TokenNameCOMMENT_LINE	for simplicity remove only fields with DEL_ALL 
FieldInfos	TokenNameIdentifier	 Field Infos
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
new	TokenNamenew	
FieldInfos	TokenNameIdentifier	 Field Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
FieldInfo	TokenNameIdentifier	 Field Info
fi	TokenNameIdentifier	 fi
:	TokenNameCOLON	
allInfos	TokenNameIdentifier	 all Infos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
deleteAll	TokenNameIdentifier	 delete All
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
fi	TokenNameIdentifier	 fi
.	TokenNameDOT	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
fi	TokenNameIdentifier	 fi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Prune stored fields of a document. Note that you can also arbitrarily * change values of the retrieved fields, so long as the field names belong * to a list of fields returned from {@link #getFieldInfos(FieldInfos)}. * @param doc document number * @param parent original field selector that limits what fields will be * retrieved. * @return a pruned instance of a Document. * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Prune stored fields of a document. Note that you can also arbitrarily change values of the retrieved fields, so long as the field names belong to a list of fields returned from {@link #getFieldInfos(FieldInfos)}. @param doc document number @param parent original field selector that limits what fields will be retrieved. @return a pruned instance of a Document. @throws IOException 
public	TokenNamepublic	
Document	TokenNameIdentifier	 Document
pruneDocument	TokenNameIdentifier	 prune Document
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
FieldSelector	TokenNameIdentifier	 Field Selector
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fieldFlags	TokenNameIdentifier	 field Flags
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
document	TokenNameIdentifier	 document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fs	TokenNameIdentifier	 fs
.	TokenNameDOT	
setParent	TokenNameIdentifier	 set Parent
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
document	TokenNameIdentifier	 document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
fs	TokenNameIdentifier	 fs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
class	TokenNameclass	
DelFieldSelector	TokenNameIdentifier	 Del Field Selector
implements	TokenNameimplements	
FieldSelector	TokenNameIdentifier	 Field Selector
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
4913592063491685103L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
FieldSelector	TokenNameIdentifier	 Field Selector
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
remove	TokenNameIdentifier	 remove
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DelFieldSelector	TokenNameIdentifier	 Del Field Selector
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
remove	TokenNameIdentifier	 remove
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
=	TokenNameEQUAL	
remove	TokenNameIdentifier	 remove
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setParent	TokenNameIdentifier	 set Parent
(	TokenNameLPAREN	
FieldSelector	TokenNameIdentifier	 Field Selector
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FieldSelectorResult	TokenNameIdentifier	 Field Selector Result
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
remove	TokenNameIdentifier	 remove
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
remove	TokenNameIdentifier	 remove
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
remove	TokenNameIdentifier	 remove
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
&	TokenNameAND	
DEL_STORED	TokenNameIdentifier	 DEL  STORED
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
delFields	TokenNameIdentifier	 del Fields
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
delFields	TokenNameIdentifier	 del Fields
%	TokenNameREMAINDER	
10000	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LOG	TokenNameIdentifier	 LOG
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
" - stored fields: removed "	TokenNameStringLiteral	 - stored fields: removed 
+	TokenNamePLUS	
delFields	TokenNameIdentifier	 del Fields
+	TokenNamePLUS	
" fields."	TokenNameStringLiteral	 fields.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
FieldSelectorResult	TokenNameIdentifier	 Field Selector Result
.	TokenNameDOT	
NO_LOAD	TokenNameIdentifier	 NO  LOAD
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
FieldSelectorResult	TokenNameIdentifier	 Field Selector Result
.	TokenNameDOT	
LOAD	TokenNameIdentifier	 LOAD
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
