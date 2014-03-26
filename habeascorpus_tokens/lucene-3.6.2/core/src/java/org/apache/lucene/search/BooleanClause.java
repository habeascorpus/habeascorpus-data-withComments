package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** A clause in a BooleanQuery. */	TokenNameCOMMENT_JAVADOC	 A clause in a BooleanQuery. 
public	TokenNamepublic	
class	TokenNameclass	
BooleanClause	TokenNameIdentifier	 Boolean Clause
implements	TokenNameimplements	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
/** Specifies how clauses are to occur in matching documents. */	TokenNameCOMMENT_JAVADOC	 Specifies how clauses are to occur in matching documents. 
public	TokenNamepublic	
static	TokenNamestatic	
enum	TokenNameenum	
Occur	TokenNameIdentifier	 Occur
{	TokenNameLBRACE	
/** Use this operator for clauses that <i>must</i> appear in the matching documents. */	TokenNameCOMMENT_JAVADOC	 Use this operator for clauses that <i>must</i> appear in the matching documents. 
MUST	TokenNameIdentifier	 MUST
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"+"	TokenNameStringLiteral	+
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Use this operator for clauses that <i>should</i> appear in the * matching documents. For a BooleanQuery with no <code>MUST</code> * clauses one or more <code>SHOULD</code> clauses must match a document * for the BooleanQuery to match. * @see BooleanQuery#setMinimumNumberShouldMatch */	TokenNameCOMMENT_JAVADOC	 Use this operator for clauses that <i>should</i> appear in the matching documents. For a BooleanQuery with no <code>MUST</code> clauses one or more <code>SHOULD</code> clauses must match a document for the BooleanQuery to match. @see BooleanQuery#setMinimumNumberShouldMatch 
SHOULD	TokenNameIdentifier	 SHOULD
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Use this operator for clauses that <i>must not</i> appear in the matching documents. * Note that it is not possible to search for queries that only consist * of a <code>MUST_NOT</code> clause. */	TokenNameCOMMENT_JAVADOC	 Use this operator for clauses that <i>must not</i> appear in the matching documents. Note that it is not possible to search for queries that only consist of a <code>MUST_NOT</code> clause. 
MUST_NOT	TokenNameIdentifier	 MUST  NOT
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"-"	TokenNameStringLiteral	-
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The query whose matching documents are combined by the boolean query. */	TokenNameCOMMENT_JAVADOC	 The query whose matching documents are combined by the boolean query. 
private	TokenNameprivate	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Occur	TokenNameIdentifier	 Occur
occur	TokenNameIdentifier	 occur
;	TokenNameSEMICOLON	
/** Constructs a BooleanClause. */	TokenNameCOMMENT_JAVADOC	 Constructs a BooleanClause. 
public	TokenNamepublic	
BooleanClause	TokenNameIdentifier	 Boolean Clause
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
occur	TokenNameIdentifier	 occur
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
query	TokenNameIdentifier	 query
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
occur	TokenNameIdentifier	 occur
=	TokenNameEQUAL	
occur	TokenNameIdentifier	 occur
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Occur	TokenNameIdentifier	 Occur
getOccur	TokenNameIdentifier	 get Occur
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
occur	TokenNameIdentifier	 occur
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setOccur	TokenNameIdentifier	 set Occur
(	TokenNameLPAREN	
Occur	TokenNameIdentifier	 Occur
occur	TokenNameIdentifier	 occur
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
occur	TokenNameIdentifier	 occur
=	TokenNameEQUAL	
occur	TokenNameIdentifier	 occur
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Query	TokenNameIdentifier	 Query
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
query	TokenNameIdentifier	 query
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setQuery	TokenNameIdentifier	 set Query
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
query	TokenNameIdentifier	 query
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isProhibited	TokenNameIdentifier	 is Prohibited
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST_NOT	TokenNameIdentifier	 MUST  NOT
==	TokenNameEQUAL_EQUAL	
occur	TokenNameIdentifier	 occur
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isRequired	TokenNameIdentifier	 is Required
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
==	TokenNameEQUAL_EQUAL	
occur	TokenNameIdentifier	 occur
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns true if <code>o</code> is equal to this. */	TokenNameCOMMENT_JAVADOC	 Returns true if <code>o</code> is equal to this. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
BooleanClause	TokenNameIdentifier	 Boolean Clause
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
BooleanClause	TokenNameIdentifier	 Boolean Clause
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
BooleanClause	TokenNameIdentifier	 Boolean Clause
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
occur	TokenNameIdentifier	 occur
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
occur	TokenNameIdentifier	 occur
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns a hash code value for this object.*/	TokenNameCOMMENT_JAVADOC	 Returns a hash code value for this object.
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
^	TokenNameXOR	
(	TokenNameLPAREN	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
==	TokenNameEQUAL_EQUAL	
occur	TokenNameIdentifier	 occur
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
^	TokenNameXOR	
(	TokenNameLPAREN	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST_NOT	TokenNameIdentifier	 MUST  NOT
==	TokenNameEQUAL_EQUAL	
occur	TokenNameIdentifier	 occur
?	TokenNameQUESTION	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
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
occur	TokenNameIdentifier	 occur
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
