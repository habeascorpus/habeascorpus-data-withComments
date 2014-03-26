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
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * A CountingAggregator updates a counter array with the size of the whole * taxonomy, counting the number of times each category appears in the given set * of documents. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 A CountingAggregator updates a counter array with the size of the whole taxonomy, counting the number of times each category appears in the given set of documents. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
CountingAggregator	TokenNameIdentifier	 Counting Aggregator
implements	TokenNameimplements	
Aggregator	TokenNameIdentifier	 Aggregator
{	TokenNameLBRACE	
protected	TokenNameprotected	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
counterArray	TokenNameIdentifier	 counter Array
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
aggregate	TokenNameIdentifier	 aggregate
(	TokenNameLPAREN	
int	TokenNameint	
ordinal	TokenNameIdentifier	 ordinal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
++	TokenNamePLUS_PLUS	
counterArray	TokenNameIdentifier	 counter Array
[	TokenNameLBRACKET	
ordinal	TokenNameIdentifier	 ordinal
]	TokenNameRBRACKET	
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
{	TokenNameLBRACE	
// There's nothing for us to do here since we only increment the count by 1 	TokenNameCOMMENT_LINE	There's nothing for us to do here since we only increment the count by 1 
// in this aggregator. 	TokenNameCOMMENT_LINE	in this aggregator. 
}	TokenNameRBRACE	
public	TokenNamepublic	
CountingAggregator	TokenNameIdentifier	 Counting Aggregator
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
counterArray	TokenNameIdentifier	 counter Array
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
counterArray	TokenNameIdentifier	 counter Array
=	TokenNameEQUAL	
counterArray	TokenNameIdentifier	 counter Array
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
CountingAggregator	TokenNameIdentifier	 Counting Aggregator
that	TokenNameIdentifier	 that
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CountingAggregator	TokenNameIdentifier	 Counting Aggregator
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
return	TokenNamereturn	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
counterArray	TokenNameIdentifier	 counter Array
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
counterArray	TokenNameIdentifier	 counter Array
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
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
=	TokenNameEQUAL	
counterArray	TokenNameIdentifier	 counter Array
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
counterArray	TokenNameIdentifier	 counter Array
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
hashCode	TokenNameIdentifier	 hash Code
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
