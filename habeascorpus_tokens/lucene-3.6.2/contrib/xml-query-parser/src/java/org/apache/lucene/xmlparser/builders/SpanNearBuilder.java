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
search	TokenNameIdentifier	 search
.	TokenNameDOT	
spans	TokenNameIdentifier	 spans
.	TokenNameDOT	
SpanNearQuery	TokenNameIdentifier	 Span Near Query
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
spans	TokenNameIdentifier	 spans
.	TokenNameDOT	
SpanQuery	TokenNameIdentifier	 Span Query
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
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
class	TokenNameclass	
SpanNearBuilder	TokenNameIdentifier	 Span Near Builder
extends	TokenNameextends	
SpanBuilderBase	TokenNameIdentifier	 Span Builder Base
{	TokenNameLBRACE	
SpanQueryBuilder	TokenNameIdentifier	 Span Query Builder
factory	TokenNameIdentifier	 factory
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SpanNearBuilder	TokenNameIdentifier	 Span Near Builder
(	TokenNameLPAREN	
SpanQueryBuilder	TokenNameIdentifier	 Span Query Builder
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
public	TokenNamepublic	
SpanQuery	TokenNameIdentifier	 Span Query
getSpanQuery	TokenNameIdentifier	 get Span Query
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParserException	TokenNameIdentifier	 Parser Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
slopString	TokenNameIdentifier	 slop String
=	TokenNameEQUAL	
DOMUtils	TokenNameIdentifier	 DOM Utils
.	TokenNameDOT	
getAttributeOrFail	TokenNameIdentifier	 get Attribute Or Fail
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
"slop"	TokenNameStringLiteral	slop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
slop	TokenNameIdentifier	 slop
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
slopString	TokenNameIdentifier	 slop String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
inOrder	TokenNameIdentifier	 in Order
=	TokenNameEQUAL	
DOMUtils	TokenNameIdentifier	 DOM Utils
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
"inOrder"	TokenNameStringLiteral	inOrder
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
SpanQuery	TokenNameIdentifier	 Span Query
>	TokenNameGREATER	
spans	TokenNameIdentifier	 spans
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
SpanQuery	TokenNameIdentifier	 Span Query
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
kid	TokenNameIdentifier	 kid
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
kid	TokenNameIdentifier	 kid
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
kid	TokenNameIdentifier	 kid
=	TokenNameEQUAL	
kid	TokenNameIdentifier	 kid
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
kid	TokenNameIdentifier	 kid
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
spans	TokenNameIdentifier	 spans
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
getSpanQuery	TokenNameIdentifier	 get Span Query
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
kid	TokenNameIdentifier	 kid
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
SpanQuery	TokenNameIdentifier	 Span Query
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
spanQueries	TokenNameIdentifier	 span Queries
=	TokenNameEQUAL	
spans	TokenNameIdentifier	 spans
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
SpanQuery	TokenNameIdentifier	 Span Query
[	TokenNameLBRACKET	
spans	TokenNameIdentifier	 spans
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SpanNearQuery	TokenNameIdentifier	 Span Near Query
snq	TokenNameIdentifier	 snq
=	TokenNameEQUAL	
new	TokenNamenew	
SpanNearQuery	TokenNameIdentifier	 Span Near Query
(	TokenNameLPAREN	
spanQueries	TokenNameIdentifier	 span Queries
,	TokenNameCOMMA	
slop	TokenNameIdentifier	 slop
,	TokenNameCOMMA	
inOrder	TokenNameIdentifier	 in Order
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
snq	TokenNameIdentifier	 snq
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	