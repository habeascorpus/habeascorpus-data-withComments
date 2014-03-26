/* * Created on 25-Jan-2006 */	TokenNameCOMMENT_BLOCK	 Created on 25-Jan-2006 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
xmlparser	TokenNameIdentifier	 xmlparser
.	TokenNameDOT	
builders	TokenNameIdentifier	 builders
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
BooleanQuery	TokenNameIdentifier	 Boolean Query
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
xmlparser	TokenNameIdentifier	 xmlparser
.	TokenNameDOT	
DOMUtils	TokenNameIdentifier	 DOM Utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
xmlparser	TokenNameIdentifier	 xmlparser
.	TokenNameDOT	
ParserException	TokenNameIdentifier	 Parser Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
xmlparser	TokenNameIdentifier	 xmlparser
.	TokenNameDOT	
QueryBuilder	TokenNameIdentifier	 Query Builder
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
NodeList	TokenNameIdentifier	 Node List
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
class	TokenNameclass	
BooleanQueryBuilder	TokenNameIdentifier	 Boolean Query Builder
implements	TokenNameimplements	
QueryBuilder	TokenNameIdentifier	 Query Builder
{	TokenNameLBRACE	
private	TokenNameprivate	
QueryBuilder	TokenNameIdentifier	 Query Builder
factory	TokenNameIdentifier	 factory
;	TokenNameSEMICOLON	
public	TokenNamepublic	
BooleanQueryBuilder	TokenNameIdentifier	 Boolean Query Builder
(	TokenNameLPAREN	
QueryBuilder	TokenNameIdentifier	 Query Builder
factory	TokenNameIdentifier	 factory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
factory	TokenNameIdentifier	 factory
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see org.apache.lucene.xmlparser.QueryObjectBuilder#process(org.w3c.dom.Element) */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.lucene.xmlparser.QueryObjectBuilder#process(org.w3c.dom.Element) 
public	TokenNamepublic	
Query	TokenNameIdentifier	 Query
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParserException	TokenNameIdentifier	 Parser Exception
{	TokenNameLBRACE	
BooleanQuery	TokenNameIdentifier	 Boolean Query
bq	TokenNameIdentifier	 bq
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanQuery	TokenNameIdentifier	 Boolean Query
(	TokenNameLPAREN	
DOMUtils	TokenNameIdentifier	 DOM Utils
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
"disableCoord"	TokenNameStringLiteral	disableCoord
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bq	TokenNameIdentifier	 bq
.	TokenNameDOT	
setMinimumNumberShouldMatch	TokenNameIdentifier	 set Minimum Number Should Match
(	TokenNameLPAREN	
DOMUtils	TokenNameIdentifier	 DOM Utils
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
"minimumNumberShouldMatch"	TokenNameStringLiteral	minimumNumberShouldMatch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bq	TokenNameIdentifier	 bq
.	TokenNameDOT	
setBoost	TokenNameIdentifier	 set Boost
(	TokenNameLPAREN	
DOMUtils	TokenNameIdentifier	 DOM Utils
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
"boost"	TokenNameStringLiteral	boost
,	TokenNameCOMMA	
1.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NodeList	TokenNameIdentifier	 Node List
nl	TokenNameIdentifier	 nl
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getChildNodes	TokenNameIdentifier	 get Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nl	TokenNameIdentifier	 nl
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
nl	TokenNameIdentifier	 nl
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"Clause"	TokenNameStringLiteral	Clause
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
clauseElem	TokenNameIdentifier	 clause Elem
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
occurs	TokenNameIdentifier	 occurs
=	TokenNameEQUAL	
getOccursValue	TokenNameIdentifier	 get Occurs Value
(	TokenNameLPAREN	
clauseElem	TokenNameIdentifier	 clause Elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
clauseQuery	TokenNameIdentifier	 clause Query
=	TokenNameEQUAL	
DOMUtils	TokenNameIdentifier	 DOM Utils
.	TokenNameDOT	
getFirstChildOrFail	TokenNameIdentifier	 get First Child Or Fail
(	TokenNameLPAREN	
clauseElem	TokenNameIdentifier	 clause Elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
clauseQuery	TokenNameIdentifier	 clause Query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bq	TokenNameIdentifier	 bq
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
BooleanClause	TokenNameIdentifier	 Boolean Clause
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
occurs	TokenNameIdentifier	 occurs
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
bq	TokenNameIdentifier	 bq
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
getOccursValue	TokenNameIdentifier	 get Occurs Value
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
clauseElem	TokenNameIdentifier	 clause Elem
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParserException	TokenNameIdentifier	 Parser Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
occs	TokenNameIdentifier	 occs
=	TokenNameEQUAL	
clauseElem	TokenNameIdentifier	 clause Elem
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"occurs"	TokenNameStringLiteral	occurs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
occurs	TokenNameIdentifier	 occurs
=	TokenNameEQUAL	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
"must"	TokenNameStringLiteral	must
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
occs	TokenNameIdentifier	 occs
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
occurs	TokenNameIdentifier	 occurs
=	TokenNameEQUAL	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
"mustNot"	TokenNameStringLiteral	mustNot
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
occs	TokenNameIdentifier	 occs
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
occurs	TokenNameIdentifier	 occurs
=	TokenNameEQUAL	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST_NOT	TokenNameIdentifier	 MUST  NOT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
"should"	TokenNameStringLiteral	should
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
occs	TokenNameIdentifier	 occs
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
occs	TokenNameIdentifier	 occs
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
occurs	TokenNameIdentifier	 occurs
=	TokenNameEQUAL	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
occs	TokenNameIdentifier	 occs
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParserException	TokenNameIdentifier	 Parser Exception
(	TokenNameLPAREN	
"Invalid value for "occurs" attribute of clause:"	TokenNameStringLiteral	Invalid value for "occurs" attribute of clause:
+	TokenNamePLUS	
occs	TokenNameIdentifier	 occs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
occurs	TokenNameIdentifier	 occurs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
