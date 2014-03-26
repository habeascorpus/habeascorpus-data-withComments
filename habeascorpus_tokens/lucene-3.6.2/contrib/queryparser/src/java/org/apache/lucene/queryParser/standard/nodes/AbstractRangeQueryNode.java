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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
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
QueryNode	TokenNameIdentifier	 Query Node
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
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
RangeQueryNode	TokenNameIdentifier	 Range Query Node
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringUtils	TokenNameIdentifier	 String Utils
;	TokenNameSEMICOLON	
/** * This class should be extended by nodes intending to represent range queries. * * @param <T> * the type of the range query bounds (lower and upper) */	TokenNameCOMMENT_JAVADOC	 This class should be extended by nodes intending to represent range queries. * @param <T> the type of the range query bounds (lower and upper) 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractRangeQueryNode	TokenNameIdentifier	 Abstract Range Query Node
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
FieldValuePairQueryNode	TokenNameIdentifier	 Field Value Pair Query Node
<	TokenNameLESS	
?	TokenNameQUESTION	
>>	TokenNameRIGHT_SHIFT	
extends	TokenNameextends	
QueryNodeImpl	TokenNameIdentifier	 Query Node Impl
implements	TokenNameimplements	
RangeQueryNode	TokenNameIdentifier	 Range Query Node
<	TokenNameLESS	
FieldValuePairQueryNode	TokenNameIdentifier	 Field Value Pair Query Node
<	TokenNameLESS	
?	TokenNameQUESTION	
>>	TokenNameRIGHT_SHIFT	
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
4475492120315147792L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
lowerInclusive	TokenNameIdentifier	 lower Inclusive
,	TokenNameCOMMA	
upperInclusive	TokenNameIdentifier	 upper Inclusive
;	TokenNameSEMICOLON	
/** * Constructs an {@link AbstractRangeQueryNode}, it should be invoked only by * its extenders. */	TokenNameCOMMENT_JAVADOC	 Constructs an {@link AbstractRangeQueryNode}, it should be invoked only by its extenders. 
protected	TokenNameprotected	
AbstractRangeQueryNode	TokenNameIdentifier	 Abstract Range Query Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setLeaf	TokenNameIdentifier	 set Leaf
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
allocate	TokenNameIdentifier	 allocate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the field associated with this node. * * @return the field associated with this node * * @see org.apache.lucene.queryParser.core.nodes.FieldableNode */	TokenNameCOMMENT_JAVADOC	 Returns the field associated with this node. * @return the field associated with this node * @see org.apache.lucene.queryParser.core.nodes.FieldableNode 
public	TokenNamepublic	
CharSequence	TokenNameIdentifier	 Char Sequence
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CharSequence	TokenNameIdentifier	 Char Sequence
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
T	TokenNameIdentifier	 T
lower	TokenNameIdentifier	 lower
=	TokenNameEQUAL	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
T	TokenNameIdentifier	 T
upper	TokenNameIdentifier	 upper
=	TokenNameEQUAL	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lower	TokenNameIdentifier	 lower
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
lower	TokenNameIdentifier	 lower
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
upper	TokenNameIdentifier	 upper
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
upper	TokenNameIdentifier	 upper
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
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
T	TokenNameIdentifier	 T
lower	TokenNameIdentifier	 lower
=	TokenNameEQUAL	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
T	TokenNameIdentifier	 T
upper	TokenNameIdentifier	 upper
=	TokenNameEQUAL	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lower	TokenNameIdentifier	 lower
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lower	TokenNameIdentifier	 lower
.	TokenNameDOT	
setField	TokenNameIdentifier	 set Field
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
upper	TokenNameIdentifier	 upper
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
upper	TokenNameIdentifier	 upper
.	TokenNameDOT	
setField	TokenNameIdentifier	 set Field
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the lower bound node. * * @return the lower bound node. */	TokenNameCOMMENT_JAVADOC	 Returns the lower bound node. * @return the lower bound node. 
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unchecked"	TokenNameStringLiteral	unchecked
)	TokenNameRPAREN	
public	TokenNamepublic	
T	TokenNameIdentifier	 T
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the upper bound node. * * @return the upper bound node. */	TokenNameCOMMENT_JAVADOC	 Returns the upper bound node. * @return the upper bound node. 
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unchecked"	TokenNameStringLiteral	unchecked
)	TokenNameRPAREN	
public	TokenNamepublic	
T	TokenNameIdentifier	 T
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether the lower bound is inclusive or exclusive. * * @return <code>true</code> if the lower bound is inclusive, otherwise, <code>false</code> */	TokenNameCOMMENT_JAVADOC	 Returns whether the lower bound is inclusive or exclusive. * @return <code>true</code> if the lower bound is inclusive, otherwise, <code>false</code> 
public	TokenNamepublic	
boolean	TokenNameboolean	
isLowerInclusive	TokenNameIdentifier	 is Lower Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lowerInclusive	TokenNameIdentifier	 lower Inclusive
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether the upper bound is inclusive or exclusive. * * @return <code>true</code> if the upper bound is inclusive, otherwise, <code>false</code> */	TokenNameCOMMENT_JAVADOC	 Returns whether the upper bound is inclusive or exclusive. * @return <code>true</code> if the upper bound is inclusive, otherwise, <code>false</code> 
public	TokenNamepublic	
boolean	TokenNameboolean	
isUpperInclusive	TokenNameIdentifier	 is Upper Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
upperInclusive	TokenNameIdentifier	 upper Inclusive
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the lower and upper bounds. * * @param lower the lower bound, <code>null</code> if lower bound is open * @param upper the upper bound, <code>null</code> if upper bound is open * @param lowerInclusive <code>true</code> if the lower bound is inclusive, otherwise, <code>false</code> * @param upperInclusive <code>true</code> if the upper bound is inclusive, otherwise, <code>false</code> * * @see #getLowerBound() * @see #getUpperBound() * @see #isLowerInclusive() * @see #isUpperInclusive() */	TokenNameCOMMENT_JAVADOC	 Sets the lower and upper bounds. * @param lower the lower bound, <code>null</code> if lower bound is open @param upper the upper bound, <code>null</code> if upper bound is open @param lowerInclusive <code>true</code> if the lower bound is inclusive, otherwise, <code>false</code> @param upperInclusive <code>true</code> if the upper bound is inclusive, otherwise, <code>false</code> * @see #getLowerBound() @see #getUpperBound() @see #isLowerInclusive() @see #isUpperInclusive() 
public	TokenNamepublic	
void	TokenNamevoid	
setBounds	TokenNameIdentifier	 set Bounds
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
lower	TokenNameIdentifier	 lower
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
upper	TokenNameIdentifier	 upper
,	TokenNameCOMMA	
boolean	TokenNameboolean	
lowerInclusive	TokenNameIdentifier	 lower Inclusive
,	TokenNameCOMMA	
boolean	TokenNameboolean	
upperInclusive	TokenNameIdentifier	 upper Inclusive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lower	TokenNameIdentifier	 lower
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
upper	TokenNameIdentifier	 upper
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
lowerField	TokenNameIdentifier	 lower Field
=	TokenNameEQUAL	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
lower	TokenNameIdentifier	 lower
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
upperField	TokenNameIdentifier	 upper Field
=	TokenNameEQUAL	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
upper	TokenNameIdentifier	 upper
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
upperField	TokenNameIdentifier	 upper Field
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
lowerField	TokenNameIdentifier	 lower Field
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
upperField	TokenNameIdentifier	 upper Field
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
upperField	TokenNameIdentifier	 upper Field
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
lowerField	TokenNameIdentifier	 lower Field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
lowerField	TokenNameIdentifier	 lower Field
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
upperField	TokenNameIdentifier	 upper Field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"lower and upper bounds should have the same field name!"	TokenNameStringLiteral	lower and upper bounds should have the same field name!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
lowerInclusive	TokenNameIdentifier	 lower Inclusive
=	TokenNameEQUAL	
lowerInclusive	TokenNameIdentifier	 lower Inclusive
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
upperInclusive	TokenNameIdentifier	 upper Inclusive
=	TokenNameEQUAL	
upperInclusive	TokenNameIdentifier	 upper Inclusive
;	TokenNameSEMICOLON	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
QueryNode	TokenNameIdentifier	 Query Node
>	TokenNameGREATER	
children	TokenNameIdentifier	 children
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
QueryNode	TokenNameIdentifier	 Query Node
>	TokenNameGREATER	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
lower	TokenNameIdentifier	 lower
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
upper	TokenNameIdentifier	 upper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
CharSequence	TokenNameIdentifier	 Char Sequence
toQueryString	TokenNameIdentifier	 to Query String
(	TokenNameLPAREN	
EscapeQuerySyntax	TokenNameIdentifier	 Escape Query Syntax
escapeSyntaxParser	TokenNameIdentifier	 escape Syntax Parser
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
T	TokenNameIdentifier	 T
lower	TokenNameIdentifier	 lower
=	TokenNameEQUAL	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
T	TokenNameIdentifier	 T
upper	TokenNameIdentifier	 upper
=	TokenNameEQUAL	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lowerInclusive	TokenNameIdentifier	 lower Inclusive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'['	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'{'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lower	TokenNameIdentifier	 lower
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
lower	TokenNameIdentifier	 lower
.	TokenNameDOT	
toQueryString	TokenNameIdentifier	 to Query String
(	TokenNameLPAREN	
escapeSyntaxParser	TokenNameIdentifier	 escape Syntax Parser
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"..."	TokenNameStringLiteral	...
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
upper	TokenNameIdentifier	 upper
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
upper	TokenNameIdentifier	 upper
.	TokenNameDOT	
toQueryString	TokenNameIdentifier	 to Query String
(	TokenNameLPAREN	
escapeSyntaxParser	TokenNameIdentifier	 escape Syntax Parser
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"..."	TokenNameStringLiteral	...
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
upperInclusive	TokenNameIdentifier	 upper Inclusive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
']'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'}'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
