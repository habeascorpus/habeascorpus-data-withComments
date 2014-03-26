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
Collator	TokenNameIdentifier	 Collator
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
FieldQueryNode	TokenNameIdentifier	 Field Query Node
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
ParametricQueryNode	TokenNameIdentifier	 Parametric Query Node
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
ParametricQueryNode	TokenNameIdentifier	 Parametric Query Node
.	TokenNameDOT	
CompareOperator	TokenNameIdentifier	 Compare Operator
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
standard	TokenNameIdentifier	 standard
.	TokenNameDOT	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
StandardQueryConfigHandler	TokenNameIdentifier	 Standard Query Config Handler
.	TokenNameDOT	
ConfigurationKeys	TokenNameIdentifier	 Configuration Keys
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
standard	TokenNameIdentifier	 standard
.	TokenNameDOT	
processors	TokenNameIdentifier	 processors
.	TokenNameDOT	
ParametricRangeQueryNodeProcessor	TokenNameIdentifier	 Parametric Range Query Node Processor
;	TokenNameSEMICOLON	
/** * This query node represents a range query. It also holds which collator will * be used by the range query and if the constant score rewrite is enabled. <br/> * * @see ParametricRangeQueryNodeProcessor * @see ConfigurationKeys#RANGE_COLLATOR * @see org.apache.lucene.search.TermRangeQuery * * @deprecated this class will be removed in future, {@link TermRangeQueryNode} should * be used instead */	TokenNameCOMMENT_JAVADOC	 This query node represents a range query. It also holds which collator will be used by the range query and if the constant score rewrite is enabled. <br/> * @see ParametricRangeQueryNodeProcessor @see ConfigurationKeys#RANGE_COLLATOR @see org.apache.lucene.search.TermRangeQuery * @deprecated this class will be removed in future, {@link TermRangeQueryNode} should be used instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
RangeQueryNode	TokenNameIdentifier	 Range Query Node
extends	TokenNameextends	
TermRangeQueryNode	TokenNameIdentifier	 Term Range Query Node
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
7400866652044314657L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Collator	TokenNameIdentifier	 Collator
collator	TokenNameIdentifier	 collator
;	TokenNameSEMICOLON	
/** * @param lower * @param upper */	TokenNameCOMMENT_JAVADOC	 @param lower @param upper 
public	TokenNamepublic	
RangeQueryNode	TokenNameIdentifier	 Range Query Node
(	TokenNameLPAREN	
ParametricQueryNode	TokenNameIdentifier	 Parametric Query Node
lower	TokenNameIdentifier	 lower
,	TokenNameCOMMA	
ParametricQueryNode	TokenNameIdentifier	 Parametric Query Node
upper	TokenNameIdentifier	 upper
,	TokenNameCOMMA	
Collator	TokenNameIdentifier	 Collator
collator	TokenNameIdentifier	 collator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
lower	TokenNameIdentifier	 lower
,	TokenNameCOMMA	
upper	TokenNameIdentifier	 upper
,	TokenNameCOMMA	
lower	TokenNameIdentifier	 lower
.	TokenNameDOT	
getOperator	TokenNameIdentifier	 get Operator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
CompareOperator	TokenNameIdentifier	 Compare Operator
.	TokenNameDOT	
LE	TokenNameIdentifier	 LE
,	TokenNameCOMMA	
upper	TokenNameIdentifier	 upper
.	TokenNameDOT	
getOperator	TokenNameIdentifier	 get Operator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
CompareOperator	TokenNameIdentifier	 Compare Operator
.	TokenNameDOT	
GE	TokenNameIdentifier	 GE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
collator	TokenNameIdentifier	 collator
=	TokenNameEQUAL	
collator	TokenNameIdentifier	 collator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
ParametricQueryNode	TokenNameIdentifier	 Parametric Query Node
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
ParametricQueryNode	TokenNameIdentifier	 Parametric Query Node
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
ParametricQueryNode	TokenNameIdentifier	 Parametric Query Node
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
ParametricQueryNode	TokenNameIdentifier	 Parametric Query Node
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets lower and upper bounds. The method signature expects * {@link FieldQueryNode} objects as lower and upper, however, * an {@link IllegalArgumentException} will be thrown at runtime * if a non {@link ParametricQueryNode} is passed as lower and upper. * * @param lower a {@link ParametricQueryNode} object * @param upper a {@link ParametricQueryNode} object * @param lowerInclusive <code>true</code> if lower bound is inclusive, otherwise, <code>false</code> * @param upperInclusive <code>true</code> if upper bound is inclusive, otherwise, <code>false</code> * * @throws IllegalArgumentException if lower or upper are not instance of {@link ParametricQueryNode} * * @see AbstractRangeQueryNode#setBounds */	TokenNameCOMMENT_JAVADOC	 Sets lower and upper bounds. The method signature expects {@link FieldQueryNode} objects as lower and upper, however, an {@link IllegalArgumentException} will be thrown at runtime if a non {@link ParametricQueryNode} is passed as lower and upper. * @param lower a {@link ParametricQueryNode} object @param upper a {@link ParametricQueryNode} object @param lowerInclusive <code>true</code> if lower bound is inclusive, otherwise, <code>false</code> @param upperInclusive <code>true</code> if upper bound is inclusive, otherwise, <code>false</code> * @throws IllegalArgumentException if lower or upper are not instance of {@link ParametricQueryNode} * @see AbstractRangeQueryNode#setBounds 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setBounds	TokenNameIdentifier	 set Bounds
(	TokenNameLPAREN	
FieldQueryNode	TokenNameIdentifier	 Field Query Node
lower	TokenNameIdentifier	 lower
,	TokenNameCOMMA	
FieldQueryNode	TokenNameIdentifier	 Field Query Node
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
!	TokenNameNOT	
(	TokenNameLPAREN	
lower	TokenNameIdentifier	 lower
instanceof	TokenNameinstanceof	
ParametricQueryNode	TokenNameIdentifier	 Parametric Query Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"lower should be an instance of "	TokenNameStringLiteral	lower should be an instance of 
+	TokenNamePLUS	
ParametricQueryNode	TokenNameIdentifier	 Parametric Query Node
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getCanonicalName	TokenNameIdentifier	 get Canonical Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", but found "	TokenNameStringLiteral	, but found 
+	TokenNamePLUS	
lower	TokenNameIdentifier	 lower
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCanonicalName	TokenNameIdentifier	 get Canonical Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
upper	TokenNameIdentifier	 upper
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
(	TokenNameLPAREN	
upper	TokenNameIdentifier	 upper
instanceof	TokenNameinstanceof	
ParametricQueryNode	TokenNameIdentifier	 Parametric Query Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"upper should be an instance of "	TokenNameStringLiteral	upper should be an instance of 
+	TokenNamePLUS	
ParametricQueryNode	TokenNameIdentifier	 Parametric Query Node
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getCanonicalName	TokenNameIdentifier	 get Canonical Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", but found "	TokenNameStringLiteral	, but found 
+	TokenNamePLUS	
lower	TokenNameIdentifier	 lower
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCanonicalName	TokenNameIdentifier	 get Canonical Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setBounds	TokenNameIdentifier	 set Bounds
(	TokenNameLPAREN	
lower	TokenNameIdentifier	 lower
,	TokenNameCOMMA	
upper	TokenNameIdentifier	 upper
,	TokenNameCOMMA	
lowerInclusive	TokenNameIdentifier	 lower Inclusive
,	TokenNameCOMMA	
upperInclusive	TokenNameIdentifier	 upper Inclusive
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
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
"<range> "	TokenNameStringLiteral	<range> 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"</range> "	TokenNameStringLiteral	</range> 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the collator */	TokenNameCOMMENT_JAVADOC	 @return the collator 
public	TokenNamepublic	
Collator	TokenNameIdentifier	 Collator
getCollator	TokenNameIdentifier	 get Collator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
collator	TokenNameIdentifier	 collator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
