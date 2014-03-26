package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
surround	TokenNameIdentifier	 surround
.	TokenNameDOT	
query	TokenNameIdentifier	 query
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
Query	TokenNameIdentifier	 Query
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
FieldsQuery	TokenNameIdentifier	 Fields Query
extends	TokenNameextends	
SrndQuery	TokenNameIdentifier	 Srnd Query
{	TokenNameLBRACE	
/* mostly untested */	TokenNameCOMMENT_BLOCK	 mostly untested 
private	TokenNameprivate	
SrndQuery	TokenNameIdentifier	 Srnd Query
q	TokenNameIdentifier	 q
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
fieldNames	TokenNameIdentifier	 field Names
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
char	TokenNamechar	
fieldOp	TokenNameIdentifier	 field Op
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
OrOperatorName	TokenNameIdentifier	 Or Operator Name
=	TokenNameEQUAL	
"OR"	TokenNameStringLiteral	OR
;	TokenNameSEMICOLON	
/* for expanded queries, not normally visible */	TokenNameCOMMENT_BLOCK	 for expanded queries, not normally visible 
public	TokenNamepublic	
FieldsQuery	TokenNameIdentifier	 Fields Query
(	TokenNameLPAREN	
SrndQuery	TokenNameIdentifier	 Srnd Query
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
fieldNames	TokenNameIdentifier	 field Names
,	TokenNameCOMMA	
char	TokenNamechar	
fieldOp	TokenNameIdentifier	 field Op
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
q	TokenNameIdentifier	 q
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fieldNames	TokenNameIdentifier	 field Names
=	TokenNameEQUAL	
fieldNames	TokenNameIdentifier	 field Names
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fieldOp	TokenNameIdentifier	 field Op
=	TokenNameEQUAL	
fieldOp	TokenNameIdentifier	 field Op
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FieldsQuery	TokenNameIdentifier	 Fields Query
(	TokenNameLPAREN	
SrndQuery	TokenNameIdentifier	 Srnd Query
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
char	TokenNamechar	
fieldOp	TokenNameIdentifier	 field Op
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
q	TokenNameIdentifier	 q
;	TokenNameSEMICOLON	
fieldNames	TokenNameIdentifier	 field Names
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldNames	TokenNameIdentifier	 field Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fieldOp	TokenNameIdentifier	 field Op
=	TokenNameEQUAL	
fieldOp	TokenNameIdentifier	 field Op
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isFieldsSubQueryAcceptable	TokenNameIdentifier	 is Fields Sub Query Acceptable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Query	TokenNameIdentifier	 Query
makeLuceneQueryNoBoost	TokenNameIdentifier	 make Lucene Query No Boost
(	TokenNameLPAREN	
BasicQueryFactory	TokenNameIdentifier	 Basic Query Factory
qf	TokenNameIdentifier	 qf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fieldNames	TokenNameIdentifier	 field Names
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* single field name: no new queries needed */	TokenNameCOMMENT_BLOCK	 single field name: no new queries needed 
return	TokenNamereturn	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
makeLuceneQueryFieldNoBoost	TokenNameIdentifier	 make Lucene Query Field No Boost
(	TokenNameLPAREN	
fieldNames	TokenNameIdentifier	 field Names
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
qf	TokenNameIdentifier	 qf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
/* OR query over the fields */	TokenNameCOMMENT_BLOCK	 OR query over the fields 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SrndQuery	TokenNameIdentifier	 Srnd Query
>	TokenNameGREATER	
queries	TokenNameIdentifier	 queries
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
SrndQuery	TokenNameIdentifier	 Srnd Query
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
fni	TokenNameIdentifier	 fni
=	TokenNameEQUAL	
getFieldNames	TokenNameIdentifier	 get Field Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
listIterator	TokenNameIdentifier	 list Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SrndQuery	TokenNameIdentifier	 Srnd Query
qc	TokenNameIdentifier	 qc
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
fni	TokenNameIdentifier	 fni
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
qc	TokenNameIdentifier	 qc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SrndQuery	TokenNameIdentifier	 Srnd Query
)	TokenNameRPAREN	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queries	TokenNameIdentifier	 queries
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
FieldsQuery	TokenNameIdentifier	 Fields Query
(	TokenNameLPAREN	
qc	TokenNameIdentifier	 qc
,	TokenNameCOMMA	
fni	TokenNameIdentifier	 fni
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
fieldOp	TokenNameIdentifier	 field Op
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
OrQuery	TokenNameIdentifier	 Or Query
oq	TokenNameIdentifier	 oq
=	TokenNameEQUAL	
new	TokenNamenew	
OrQuery	TokenNameIdentifier	 Or Query
(	TokenNameLPAREN	
queries	TokenNameIdentifier	 queries
,	TokenNameCOMMA	
true	TokenNametrue	
/* infix OR for field names */	TokenNameCOMMENT_BLOCK	 infix OR for field names 
,	TokenNameCOMMA	
OrOperatorName	TokenNameIdentifier	 Or Operator Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", fields expanded: "	TokenNameStringLiteral	, fields expanded: 
+	TokenNamePLUS	
oq	TokenNameIdentifier	 oq
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* needs testing */	TokenNameCOMMENT_BLOCK	 needs testing 
return	TokenNamereturn	
oq	TokenNameIdentifier	 oq
.	TokenNameDOT	
makeLuceneQueryField	TokenNameIdentifier	 make Lucene Query Field
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
qf	TokenNameIdentifier	 qf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Query	TokenNameIdentifier	 Query
makeLuceneQueryFieldNoBoost	TokenNameIdentifier	 make Lucene Query Field No Boost
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
BasicQueryFactory	TokenNameIdentifier	 Basic Query Factory
qf	TokenNameIdentifier	 qf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
makeLuceneQueryNoBoost	TokenNameIdentifier	 make Lucene Query No Boost
(	TokenNameLPAREN	
qf	TokenNameIdentifier	 qf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* use this.fieldNames instead of fieldName */	TokenNameCOMMENT_BLOCK	 use this.fieldNames instead of fieldName 
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getFieldNames	TokenNameIdentifier	 get Field Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fieldNames	TokenNameIdentifier	 field Names
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
char	TokenNamechar	
getFieldOperator	TokenNameIdentifier	 get Field Operator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fieldOp	TokenNameIdentifier	 field Op
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
StringBuilder	TokenNameIdentifier	 String Builder
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"("	TokenNameStringLiteral	(
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldNamesToString	TokenNameIdentifier	 field Names To String
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
fieldNamesToString	TokenNameIdentifier	 field Names To String
(	TokenNameLPAREN	
StringBuilder	TokenNameIdentifier	 String Builder
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
fni	TokenNameIdentifier	 fni
=	TokenNameEQUAL	
getFieldNames	TokenNameIdentifier	 get Field Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
listIterator	TokenNameIdentifier	 list Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
fni	TokenNameIdentifier	 fni
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fni	TokenNameIdentifier	 fni
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getFieldOperator	TokenNameIdentifier	 get Field Operator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
