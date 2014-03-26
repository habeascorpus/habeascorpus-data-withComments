package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
spans	TokenNameIdentifier	 spans
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Method	TokenNameIdentifier	 Method
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
search	TokenNameIdentifier	 search
.	TokenNameDOT	
MultiTermQuery	TokenNameIdentifier	 Multi Term Query
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
TopTermsRewrite	TokenNameIdentifier	 Top Terms Rewrite
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
ScoringRewrite	TokenNameIdentifier	 Scoring Rewrite
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
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
;	TokenNameSEMICOLON	
// javadocs only 	TokenNameCOMMENT_LINE	javadocs only 
/** * Wraps any {@link MultiTermQuery} as a {@link SpanQuery}, * so it can be nested within other SpanQuery classes. * <p> * The query is rewritten by default to a {@link SpanOrQuery} containing * the expanded terms, but this can be customized. * <p> * Example: * <blockquote><pre> * {@code * WildcardQuery wildcard = new WildcardQuery(new Term("field", "bro?n")); * SpanQuery spanWildcard = new SpanMultiTermQueryWrapper<WildcardQuery>(wildcard); * // do something with spanWildcard, such as use it in a SpanFirstQuery * } * </pre></blockquote> */	TokenNameCOMMENT_JAVADOC	 Wraps any {@link MultiTermQuery} as a {@link SpanQuery}, so it can be nested within other SpanQuery classes. <p> The query is rewritten by default to a {@link SpanOrQuery} containing the expanded terms, but this can be customized. <p> Example: <blockquote><pre> {@code WildcardQuery wildcard = new WildcardQuery(new Term("field", "bro?n")); SpanQuery spanWildcard = new SpanMultiTermQueryWrapper<WildcardQuery>(wildcard); // do something with spanWildcard, such as use it in a SpanFirstQuery } </pre></blockquote> 
public	TokenNamepublic	
class	TokenNameclass	
SpanMultiTermQueryWrapper	TokenNameIdentifier	 Span Multi Term Query Wrapper
<	TokenNameLESS	
Q	TokenNameIdentifier	 Q
extends	TokenNameextends	
MultiTermQuery	TokenNameIdentifier	 Multi Term Query
>	TokenNameGREATER	
extends	TokenNameextends	
SpanQuery	TokenNameIdentifier	 Span Query
{	TokenNameLBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
Q	TokenNameIdentifier	 Q
query	TokenNameIdentifier	 query
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Method	TokenNameIdentifier	 Method
getFieldMethod	TokenNameIdentifier	 get Field Method
=	TokenNameEQUAL	
null	TokenNamenull	
,	TokenNameCOMMA	
getTermMethod	TokenNameIdentifier	 get Term Method
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Create a new SpanMultiTermQueryWrapper. * * @param query Query to wrap. * <p> * NOTE: This will call {@link MultiTermQuery#setRewriteMethod(MultiTermQuery.RewriteMethod)} * on the wrapped <code>query</code>, changing its rewrite method to a suitable one for spans. * Be sure to not change the rewrite method on the wrapped query afterwards! Doing so will * throw {@link UnsupportedOperationException} on rewriting this query! * In Lucene 3.x, MultiTermQuery allows queries to rewrite to different field names, but SpanQuery * needs a fixed field. The wrapped query must therefore support getField() or getTerm(). * @throws IllegalArgumentException if the wrapped query does not provide getField() or getTerm(). */	TokenNameCOMMENT_JAVADOC	 Create a new SpanMultiTermQueryWrapper. * @param query Query to wrap. <p> NOTE: This will call {@link MultiTermQuery#setRewriteMethod(MultiTermQuery.RewriteMethod)} on the wrapped <code>query</code>, changing its rewrite method to a suitable one for spans. Be sure to not change the rewrite method on the wrapped query afterwards! Doing so will throw {@link UnsupportedOperationException} on rewriting this query! In Lucene 3.x, MultiTermQuery allows queries to rewrite to different field names, but SpanQuery needs a fixed field. The wrapped query must therefore support getField() or getTerm(). @throws IllegalArgumentException if the wrapped query does not provide getField() or getTerm(). 
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
{	TokenNameLBRACE	
"rawtypes"	TokenNameStringLiteral	rawtypes
,	TokenNameCOMMA	
"unchecked"	TokenNameStringLiteral	unchecked
}	TokenNameRBRACE	
)	TokenNameRPAREN	
public	TokenNamepublic	
SpanMultiTermQueryWrapper	TokenNameIdentifier	 Span Multi Term Query Wrapper
(	TokenNameLPAREN	
Q	TokenNameIdentifier	 Q
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
query	TokenNameIdentifier	 query
;	TokenNameSEMICOLON	
MultiTermQuery	TokenNameIdentifier	 Multi Term Query
.	TokenNameDOT	
RewriteMethod	TokenNameIdentifier	 Rewrite Method
method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
getRewriteMethod	TokenNameIdentifier	 get Rewrite Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
method	TokenNameIdentifier	 method
instanceof	TokenNameinstanceof	
TopTermsRewrite	TokenNameIdentifier	 Top Terms Rewrite
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
pqsize	TokenNameIdentifier	 pqsize
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TopTermsRewrite	TokenNameIdentifier	 Top Terms Rewrite
)	TokenNameRPAREN	
method	TokenNameIdentifier	 method
)	TokenNameRPAREN	
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setRewriteMethod	TokenNameIdentifier	 set Rewrite Method
(	TokenNameLPAREN	
new	TokenNamenew	
TopTermsSpanBooleanQueryRewrite	TokenNameIdentifier	 Top Terms Span Boolean Query Rewrite
(	TokenNameLPAREN	
pqsize	TokenNameIdentifier	 pqsize
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
setRewriteMethod	TokenNameIdentifier	 set Rewrite Method
(	TokenNameLPAREN	
SCORING_SPAN_QUERY_REWRITE	TokenNameIdentifier	 SCORING  SPAN  QUERY  REWRITE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// In Lucene 3.x, MTQ has no fixed field, we need to get it by reflection. 	TokenNameCOMMENT_LINE	In Lucene 3.x, MTQ has no fixed field, we need to get it by reflection. 
// If the underlying query does not allow to get a constant field, we throw IAE: 	TokenNameCOMMENT_LINE	If the underlying query does not allow to get a constant field, we throw IAE: 
try	TokenNametry	
{	TokenNameLBRACE	
getFieldMethod	TokenNameIdentifier	 get Field Method
=	TokenNameEQUAL	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"getField"	TokenNameStringLiteral	getField
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e1	TokenNameIdentifier	 e1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
getTermMethod	TokenNameIdentifier	 get Term Method
=	TokenNameEQUAL	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"getTerm"	TokenNameStringLiteral	getTerm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e2	TokenNameIdentifier	 e2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
getTermMethod	TokenNameIdentifier	 get Term Method
=	TokenNameEQUAL	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"getPrefix"	TokenNameStringLiteral	getPrefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e3	TokenNameIdentifier	 e3
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"SpanMultiTermQueryWrapper can only wrap MultiTermQueries"	TokenNameStringLiteral	SpanMultiTermQueryWrapper can only wrap MultiTermQueries
+	TokenNamePLUS	
" that can return a field name using getField() or getTerm()"	TokenNameStringLiteral	 that can return a field name using getField() or getTerm()
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Expert: returns the rewriteMethod */	TokenNameCOMMENT_JAVADOC	 Expert: returns the rewriteMethod 
public	TokenNamepublic	
final	TokenNamefinal	
SpanRewriteMethod	TokenNameIdentifier	 Span Rewrite Method
getRewriteMethod	TokenNameIdentifier	 get Rewrite Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
MultiTermQuery	TokenNameIdentifier	 Multi Term Query
.	TokenNameDOT	
RewriteMethod	TokenNameIdentifier	 Rewrite Method
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
getRewriteMethod	TokenNameIdentifier	 get Rewrite Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
instanceof	TokenNameinstanceof	
SpanRewriteMethod	TokenNameIdentifier	 Span Rewrite Method
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"You can only use SpanMultiTermQueryWrapper with a suitable SpanRewriteMethod."	TokenNameStringLiteral	You can only use SpanMultiTermQueryWrapper with a suitable SpanRewriteMethod.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
SpanRewriteMethod	TokenNameIdentifier	 Span Rewrite Method
)	TokenNameRPAREN	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Expert: sets the rewrite method. This only makes sense * to be a span rewrite method. */	TokenNameCOMMENT_JAVADOC	 Expert: sets the rewrite method. This only makes sense to be a span rewrite method. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setRewriteMethod	TokenNameIdentifier	 set Rewrite Method
(	TokenNameLPAREN	
SpanRewriteMethod	TokenNameIdentifier	 Span Rewrite Method
rewriteMethod	TokenNameIdentifier	 rewrite Method
)	TokenNameRPAREN	
{	TokenNameLBRACE	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
setRewriteMethod	TokenNameIdentifier	 set Rewrite Method
(	TokenNameLPAREN	
rewriteMethod	TokenNameIdentifier	 rewrite Method
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Spans	TokenNameIdentifier	 Spans
getSpans	TokenNameIdentifier	 get Spans
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"Query should have been rewritten"	TokenNameStringLiteral	Query should have been rewritten
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getFieldMethod	TokenNameIdentifier	 get Field Method
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
getFieldMethod	TokenNameIdentifier	 get Field Method
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assert	TokenNameassert	
getTermMethod	TokenNameIdentifier	 get Term Method
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
)	TokenNameRPAREN	
getTermMethod	TokenNameIdentifier	 get Term Method
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Cannot invoke getField() or getTerm() on wrapped query."	TokenNameStringLiteral	Cannot invoke getField() or getTerm() on wrapped query.
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
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
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"SpanMultiTermQueryWrapper("	TokenNameStringLiteral	SpanMultiTermQueryWrapper(
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Query	TokenNameIdentifier	 Query
rewrite	TokenNameIdentifier	 rewrite
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
rewrite	TokenNameIdentifier	 rewrite
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
instanceof	TokenNameinstanceof	
SpanQuery	TokenNameIdentifier	 Span Query
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"You can only use SpanMultiTermQueryWrapper with a suitable SpanRewriteMethod."	TokenNameStringLiteral	You can only use SpanMultiTermQueryWrapper with a suitable SpanRewriteMethod.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
q	TokenNameIdentifier	 q
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
return	TokenNamereturn	
31	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
{	TokenNameLBRACE	
"rawtypes"	TokenNameStringLiteral	rawtypes
,	TokenNameCOMMA	
"unchecked"	TokenNameStringLiteral	unchecked
}	TokenNameRBRACE	
)	TokenNameRPAREN	
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
obj	TokenNameIdentifier	 obj
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
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
final	TokenNamefinal	
SpanMultiTermQueryWrapper	TokenNameIdentifier	 Span Multi Term Query Wrapper
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SpanMultiTermQueryWrapper	TokenNameIdentifier	 Span Multi Term Query Wrapper
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
return	TokenNamereturn	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Abstract class that defines how the query is rewritten. */	TokenNameCOMMENT_JAVADOC	 Abstract class that defines how the query is rewritten. 
public	TokenNamepublic	
static	TokenNamestatic	
abstract	TokenNameabstract	
class	TokenNameclass	
SpanRewriteMethod	TokenNameIdentifier	 Span Rewrite Method
extends	TokenNameextends	
MultiTermQuery	TokenNameIdentifier	 Multi Term Query
.	TokenNameDOT	
RewriteMethod	TokenNameIdentifier	 Rewrite Method
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
abstract	TokenNameabstract	
SpanQuery	TokenNameIdentifier	 Span Query
rewrite	TokenNameIdentifier	 rewrite
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
MultiTermQuery	TokenNameIdentifier	 Multi Term Query
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A rewrite method that first translates each term into a SpanTermQuery in a * {@link Occur#SHOULD} clause in a BooleanQuery, and keeps the * scores as computed by the query. * * @see #setRewriteMethod */	TokenNameCOMMENT_JAVADOC	 A rewrite method that first translates each term into a SpanTermQuery in a {@link Occur#SHOULD} clause in a BooleanQuery, and keeps the scores as computed by the query. * @see #setRewriteMethod 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
SpanRewriteMethod	TokenNameIdentifier	 Span Rewrite Method
SCORING_SPAN_QUERY_REWRITE	TokenNameIdentifier	 SCORING  SPAN  QUERY  REWRITE
=	TokenNameEQUAL	
new	TokenNamenew	
SpanRewriteMethod	TokenNameIdentifier	 Span Rewrite Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
ScoringRewrite	TokenNameIdentifier	 Scoring Rewrite
<	TokenNameLESS	
SpanOrQuery	TokenNameIdentifier	 Span Or Query
>	TokenNameGREATER	
delegate	TokenNameIdentifier	 delegate
=	TokenNameEQUAL	
new	TokenNamenew	
ScoringRewrite	TokenNameIdentifier	 Scoring Rewrite
<	TokenNameLESS	
SpanOrQuery	TokenNameIdentifier	 Span Or Query
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
SpanOrQuery	TokenNameIdentifier	 Span Or Query
getTopLevelQuery	TokenNameIdentifier	 get Top Level Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SpanOrQuery	TokenNameIdentifier	 Span Or Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
addClause	TokenNameIdentifier	 add Clause
(	TokenNameLPAREN	
SpanOrQuery	TokenNameIdentifier	 Span Or Query
topLevel	TokenNameIdentifier	 top Level
,	TokenNameCOMMA	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
float	TokenNamefloat	
boost	TokenNameIdentifier	 boost
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
SpanTermQuery	TokenNameIdentifier	 Span Term Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
SpanTermQuery	TokenNameIdentifier	 Span Term Query
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
setBoost	TokenNameIdentifier	 set Boost
(	TokenNameLPAREN	
boost	TokenNameIdentifier	 boost
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
topLevel	TokenNameIdentifier	 top Level
.	TokenNameDOT	
addClause	TokenNameIdentifier	 add Clause
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
SpanQuery	TokenNameIdentifier	 Span Query
rewrite	TokenNameIdentifier	 rewrite
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
MultiTermQuery	TokenNameIdentifier	 Multi Term Query
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
rewrite	TokenNameIdentifier	 rewrite
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Make sure we are still a singleton even after deserializing 	TokenNameCOMMENT_LINE	Make sure we are still a singleton even after deserializing 
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
readResolve	TokenNameIdentifier	 read Resolve
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SCORING_SPAN_QUERY_REWRITE	TokenNameIdentifier	 SCORING  SPAN  QUERY  REWRITE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * A rewrite method that first translates each term into a SpanTermQuery in a * {@link Occur#SHOULD} clause in a BooleanQuery, and keeps the * scores as computed by the query. * * <p> * This rewrite method only uses the top scoring terms so it will not overflow * the boolean max clause count. * * @see #setRewriteMethod */	TokenNameCOMMENT_JAVADOC	 A rewrite method that first translates each term into a SpanTermQuery in a {@link Occur#SHOULD} clause in a BooleanQuery, and keeps the scores as computed by the query. * <p> This rewrite method only uses the top scoring terms so it will not overflow the boolean max clause count. * @see #setRewriteMethod 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
TopTermsSpanBooleanQueryRewrite	TokenNameIdentifier	 Top Terms Span Boolean Query Rewrite
extends	TokenNameextends	
SpanRewriteMethod	TokenNameIdentifier	 Span Rewrite Method
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
TopTermsRewrite	TokenNameIdentifier	 Top Terms Rewrite
<	TokenNameLESS	
SpanOrQuery	TokenNameIdentifier	 Span Or Query
>	TokenNameGREATER	
delegate	TokenNameIdentifier	 delegate
;	TokenNameSEMICOLON	
/** * Create a TopTermsSpanBooleanQueryRewrite for * at most <code>size</code> terms. */	TokenNameCOMMENT_JAVADOC	 Create a TopTermsSpanBooleanQueryRewrite for at most <code>size</code> terms. 
public	TokenNamepublic	
TopTermsSpanBooleanQueryRewrite	TokenNameIdentifier	 Top Terms Span Boolean Query Rewrite
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
delegate	TokenNameIdentifier	 delegate
=	TokenNameEQUAL	
new	TokenNamenew	
TopTermsRewrite	TokenNameIdentifier	 Top Terms Rewrite
<	TokenNameLESS	
SpanOrQuery	TokenNameIdentifier	 Span Or Query
>	TokenNameGREATER	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
int	TokenNameint	
getMaxSize	TokenNameIdentifier	 get Max Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
SpanOrQuery	TokenNameIdentifier	 Span Or Query
getTopLevelQuery	TokenNameIdentifier	 get Top Level Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SpanOrQuery	TokenNameIdentifier	 Span Or Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
addClause	TokenNameIdentifier	 add Clause
(	TokenNameLPAREN	
SpanOrQuery	TokenNameIdentifier	 Span Or Query
topLevel	TokenNameIdentifier	 top Level
,	TokenNameCOMMA	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
float	TokenNamefloat	
boost	TokenNameIdentifier	 boost
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
SpanTermQuery	TokenNameIdentifier	 Span Term Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
SpanTermQuery	TokenNameIdentifier	 Span Term Query
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
setBoost	TokenNameIdentifier	 set Boost
(	TokenNameLPAREN	
boost	TokenNameIdentifier	 boost
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
topLevel	TokenNameIdentifier	 top Level
.	TokenNameDOT	
addClause	TokenNameIdentifier	 add Clause
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** return the maximum priority queue size */	TokenNameCOMMENT_JAVADOC	 return the maximum priority queue size 
public	TokenNamepublic	
int	TokenNameint	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
SpanQuery	TokenNameIdentifier	 Span Query
rewrite	TokenNameIdentifier	 rewrite
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
MultiTermQuery	TokenNameIdentifier	 Multi Term Query
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
rewrite	TokenNameIdentifier	 rewrite
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
query	TokenNameIdentifier	 query
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
return	TokenNamereturn	
31	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
obj	TokenNameIdentifier	 obj
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
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
final	TokenNamefinal	
TopTermsSpanBooleanQueryRewrite	TokenNameIdentifier	 Top Terms Span Boolean Query Rewrite
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TopTermsSpanBooleanQueryRewrite	TokenNameIdentifier	 Top Terms Span Boolean Query Rewrite
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
return	TokenNamereturn	
delegate	TokenNameIdentifier	 delegate
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
delegate	TokenNameIdentifier	 delegate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
