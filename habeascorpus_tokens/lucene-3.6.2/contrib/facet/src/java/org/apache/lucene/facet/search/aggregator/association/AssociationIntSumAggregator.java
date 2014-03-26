package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
aggregator	TokenNameIdentifier	 aggregator
.	TokenNameDOT	
association	TokenNameIdentifier	 association
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
enhancements	TokenNameIdentifier	 enhancements
.	TokenNameDOT	
association	TokenNameIdentifier	 association
.	TokenNameDOT	
AssociationsPayloadIterator	TokenNameIdentifier	 Associations Payload Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
CategoryListParams	TokenNameIdentifier	 Category List Params
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
aggregator	TokenNameIdentifier	 aggregator
.	TokenNameDOT	
Aggregator	TokenNameIdentifier	 Aggregator
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
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * An {@link Aggregator} which updates the weight of a category by summing the * weights of the integer association it finds for every document. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 An {@link Aggregator} which updates the weight of a category by summing the weights of the integer association it finds for every document. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
AssociationIntSumAggregator	TokenNameIdentifier	 Association Int Sum Aggregator
implements	TokenNameimplements	
Aggregator	TokenNameIdentifier	 Aggregator
{	TokenNameLBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sumArray	TokenNameIdentifier	 sum Array
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
AssociationsPayloadIterator	TokenNameIdentifier	 Associations Payload Iterator
associationsPayloadIterator	TokenNameIdentifier	 associations Payload Iterator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
AssociationIntSumAggregator	TokenNameIdentifier	 Association Int Sum Aggregator
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sumArray	TokenNameIdentifier	 sum Array
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
CategoryListParams	TokenNameIdentifier	 Category List Params
.	TokenNameDOT	
DEFAULT_TERM	TokenNameIdentifier	 DEFAULT  TERM
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
sumArray	TokenNameIdentifier	 sum Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
AssociationIntSumAggregator	TokenNameIdentifier	 Association Int Sum Aggregator
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sumArray	TokenNameIdentifier	 sum Array
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
associationsPayloadIterator	TokenNameIdentifier	 associations Payload Iterator
=	TokenNameEQUAL	
new	TokenNamenew	
AssociationsPayloadIterator	TokenNameIdentifier	 Associations Payload Iterator
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
sumArray	TokenNameIdentifier	 sum Array
=	TokenNameEQUAL	
sumArray	TokenNameIdentifier	 sum Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
aggregate	TokenNameIdentifier	 aggregate
(	TokenNameLPAREN	
int	TokenNameint	
ordinal	TokenNameIdentifier	 ordinal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
association	TokenNameIdentifier	 association
=	TokenNameEQUAL	
associationsPayloadIterator	TokenNameIdentifier	 associations Payload Iterator
.	TokenNameDOT	
getAssociation	TokenNameIdentifier	 get Association
(	TokenNameLPAREN	
ordinal	TokenNameIdentifier	 ordinal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
association	TokenNameIdentifier	 association
!=	TokenNameNOT_EQUAL	
AssociationsPayloadIterator	TokenNameIdentifier	 Associations Payload Iterator
.	TokenNameDOT	
NO_ASSOCIATION	TokenNameIdentifier	 NO  ASSOCIATION
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sumArray	TokenNameIdentifier	 sum Array
[	TokenNameLBRACKET	
ordinal	TokenNameIdentifier	 ordinal
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
association	TokenNameIdentifier	 association
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
obj	TokenNameIdentifier	 obj
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
AssociationIntSumAggregator	TokenNameIdentifier	 Association Int Sum Aggregator
that	TokenNameIdentifier	 that
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AssociationIntSumAggregator	TokenNameIdentifier	 Association Int Sum Aggregator
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
return	TokenNamereturn	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
sumArray	TokenNameIdentifier	 sum Array
==	TokenNameEQUAL_EQUAL	
sumArray	TokenNameIdentifier	 sum Array
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
field	TokenNameIdentifier	 field
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setNextDoc	TokenNameIdentifier	 set Next Doc
(	TokenNameLPAREN	
int	TokenNameint	
docid	TokenNameIdentifier	 docid
,	TokenNameCOMMA	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
associationsPayloadIterator	TokenNameIdentifier	 associations Payload Iterator
.	TokenNameDOT	
setNextDoc	TokenNameIdentifier	 set Next Doc
(	TokenNameLPAREN	
docid	TokenNameIdentifier	 docid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
