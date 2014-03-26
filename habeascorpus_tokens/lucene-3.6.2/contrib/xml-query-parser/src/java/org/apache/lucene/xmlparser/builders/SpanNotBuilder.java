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
spans	TokenNameIdentifier	 spans
.	TokenNameDOT	
SpanNotQuery	TokenNameIdentifier	 Span Not Query
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
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
class	TokenNameclass	
SpanNotBuilder	TokenNameIdentifier	 Span Not Builder
extends	TokenNameextends	
SpanBuilderBase	TokenNameIdentifier	 Span Builder Base
{	TokenNameLBRACE	
SpanQueryBuilder	TokenNameIdentifier	 Span Query Builder
factory	TokenNameIdentifier	 factory
;	TokenNameSEMICOLON	
/** * @param factory */	TokenNameCOMMENT_JAVADOC	 @param factory 
public	TokenNamepublic	
SpanNotBuilder	TokenNameIdentifier	 Span Not Builder
(	TokenNameLPAREN	
SpanQueryBuilder	TokenNameIdentifier	 Span Query Builder
factory	TokenNameIdentifier	 factory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
Element	TokenNameIdentifier	 Element
includeElem	TokenNameIdentifier	 include Elem
=	TokenNameEQUAL	
DOMUtils	TokenNameIdentifier	 DOM Utils
.	TokenNameDOT	
getChildByTagOrFail	TokenNameIdentifier	 get Child By Tag Or Fail
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
"Include"	TokenNameStringLiteral	Include
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
includeElem	TokenNameIdentifier	 include Elem
=	TokenNameEQUAL	
DOMUtils	TokenNameIdentifier	 DOM Utils
.	TokenNameDOT	
getFirstChildOrFail	TokenNameIdentifier	 get First Child Or Fail
(	TokenNameLPAREN	
includeElem	TokenNameIdentifier	 include Elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
excludeElem	TokenNameIdentifier	 exclude Elem
=	TokenNameEQUAL	
DOMUtils	TokenNameIdentifier	 DOM Utils
.	TokenNameDOT	
getChildByTagOrFail	TokenNameIdentifier	 get Child By Tag Or Fail
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
"Exclude"	TokenNameStringLiteral	Exclude
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
excludeElem	TokenNameIdentifier	 exclude Elem
=	TokenNameEQUAL	
DOMUtils	TokenNameIdentifier	 DOM Utils
.	TokenNameDOT	
getFirstChildOrFail	TokenNameIdentifier	 get First Child Or Fail
(	TokenNameLPAREN	
excludeElem	TokenNameIdentifier	 exclude Elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SpanQuery	TokenNameIdentifier	 Span Query
include	TokenNameIdentifier	 include
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
getSpanQuery	TokenNameIdentifier	 get Span Query
(	TokenNameLPAREN	
includeElem	TokenNameIdentifier	 include Elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SpanQuery	TokenNameIdentifier	 Span Query
exclude	TokenNameIdentifier	 exclude
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
getSpanQuery	TokenNameIdentifier	 get Span Query
(	TokenNameLPAREN	
excludeElem	TokenNameIdentifier	 exclude Elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SpanNotQuery	TokenNameIdentifier	 Span Not Query
snq	TokenNameIdentifier	 snq
=	TokenNameEQUAL	
new	TokenNamenew	
SpanNotQuery	TokenNameIdentifier	 Span Not Query
(	TokenNameLPAREN	
include	TokenNameIdentifier	 include
,	TokenNameCOMMA	
exclude	TokenNameIdentifier	 exclude
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
snq	TokenNameIdentifier	 snq
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
return	TokenNamereturn	
snq	TokenNameIdentifier	 snq
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
