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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
Term	TokenNameIdentifier	 Term
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ToStringUtils	TokenNameIdentifier	 To String Utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Implements the wildcard search query. Supported wildcards are <code>*</code>, which * matches any character sequence (including the empty one), and <code>?</code>, * which matches any single character. Note this query can be slow, as it * needs to iterate over many terms. In order to prevent extremely slow WildcardQueries, * a Wildcard term should not start with one of the wildcards <code>*</code> or * <code>?</code>. * * <p>This query uses the {@link * MultiTermQuery#CONSTANT_SCORE_AUTO_REWRITE_DEFAULT} * rewrite method. * * @see WildcardTermEnum */	TokenNameCOMMENT_JAVADOC	 Implements the wildcard search query. Supported wildcards are <code>*</code>, which matches any character sequence (including the empty one), and <code>?</code>, which matches any single character. Note this query can be slow, as it needs to iterate over many terms. In order to prevent extremely slow WildcardQueries, a Wildcard term should not start with one of the wildcards <code>*</code> or <code>?</code>. * <p>This query uses the {@link MultiTermQuery#CONSTANT_SCORE_AUTO_REWRITE_DEFAULT} rewrite method. * @see WildcardTermEnum 
public	TokenNamepublic	
class	TokenNameclass	
WildcardQuery	TokenNameIdentifier	 Wildcard Query
extends	TokenNameextends	
MultiTermQuery	TokenNameIdentifier	 Multi Term Query
{	TokenNameLBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
termContainsWildcard	TokenNameIdentifier	 term Contains Wildcard
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
termIsPrefix	TokenNameIdentifier	 term Is Prefix
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
public	TokenNamepublic	
WildcardQuery	TokenNameIdentifier	 Wildcard Query
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
termContainsWildcard	TokenNameIdentifier	 term Contains Wildcard
=	TokenNameEQUAL	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'*'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
termIsPrefix	TokenNameIdentifier	 term Is Prefix
=	TokenNameEQUAL	
termContainsWildcard	TokenNameIdentifier	 term Contains Wildcard
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'*'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
FilteredTermEnum	TokenNameIdentifier	 Filtered Term Enum
getEnum	TokenNameIdentifier	 get Enum
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
termIsPrefix	TokenNameIdentifier	 term Is Prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
PrefixTermEnum	TokenNameIdentifier	 Prefix Term Enum
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
createTerm	TokenNameIdentifier	 create Term
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'*'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
termContainsWildcard	TokenNameIdentifier	 term Contains Wildcard
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
WildcardTermEnum	TokenNameIdentifier	 Wildcard Term Enum
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
getTerm	TokenNameIdentifier	 get Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SingleTermEnum	TokenNameIdentifier	 Single Term Enum
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
getTerm	TokenNameIdentifier	 get Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the pattern term. */	TokenNameCOMMENT_JAVADOC	 Returns the pattern term. 
public	TokenNamepublic	
Term	TokenNameIdentifier	 Term
getTerm	TokenNameIdentifier	 get Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Prints a user-readable version of this query. */	TokenNameCOMMENT_JAVADOC	 Prints a user-readable version of this query. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ToStringUtils	TokenNameIdentifier	 To String Utils
.	TokenNameDOT	
boost	TokenNameIdentifier	 boost
(	TokenNameLPAREN	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
prime	TokenNameIdentifier	 prime
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
super	TokenNamesuper	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
WildcardQuery	TokenNameIdentifier	 Wildcard Query
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
WildcardQuery	TokenNameIdentifier	 Wildcard Query
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
term	TokenNameIdentifier	 term
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
