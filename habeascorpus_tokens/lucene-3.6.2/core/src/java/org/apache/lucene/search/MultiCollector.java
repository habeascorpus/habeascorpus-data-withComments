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
search	TokenNameIdentifier	 search
.	TokenNameDOT	
Collector	TokenNameIdentifier	 Collector
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
Scorer	TokenNameIdentifier	 Scorer
;	TokenNameSEMICOLON	
/** * A {@link Collector} which allows running a search with several * {@link Collector}s. It offers a static {@link #wrap} method which accepts a * list of collectors and wraps them with {@link MultiCollector}, while * filtering out the <code>null</code> null ones. */	TokenNameCOMMENT_JAVADOC	 A {@link Collector} which allows running a search with several {@link Collector}s. It offers a static {@link #wrap} method which accepts a list of collectors and wraps them with {@link MultiCollector}, while filtering out the <code>null</code> null ones. 
public	TokenNamepublic	
class	TokenNameclass	
MultiCollector	TokenNameIdentifier	 Multi Collector
extends	TokenNameextends	
Collector	TokenNameIdentifier	 Collector
{	TokenNameLBRACE	
/** * Wraps a list of {@link Collector}s with a {@link MultiCollector}. This * method works as follows: * <ul> * <li>Filters out the <code>null</code> collectors, so they are not used * during search time. * <li>If the input contains 1 real collector (i.e. non-<code>null</code> ), * it is returned. * <li>Otherwise the method returns a {@link MultiCollector} which wraps the * non-<code>null</code> ones. * </ul> * * @throws IllegalArgumentException * if either 0 collectors were input, or all collectors are * <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Wraps a list of {@link Collector}s with a {@link MultiCollector}. This method works as follows: <ul> <li>Filters out the <code>null</code> collectors, so they are not used during search time. <li>If the input contains 1 real collector (i.e. non-<code>null</code> ), it is returned. <li>Otherwise the method returns a {@link MultiCollector} which wraps the non-<code>null</code> ones. </ul> * @throws IllegalArgumentException if either 0 collectors were input, or all collectors are <code>null</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
Collector	TokenNameIdentifier	 Collector
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
Collector	TokenNameIdentifier	 Collector
...	TokenNameELLIPSIS	
collectors	TokenNameIdentifier	 collectors
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// For the user's convenience, we allow null collectors to be passed. 	TokenNameCOMMENT_LINE	For the user's convenience, we allow null collectors to be passed. 
// However, to improve performance, these null collectors are found 	TokenNameCOMMENT_LINE	However, to improve performance, these null collectors are found 
// and dropped from the array we save for actual collection time. 	TokenNameCOMMENT_LINE	and dropped from the array we save for actual collection time. 
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Collector	TokenNameIdentifier	 Collector
c	TokenNameIdentifier	 c
:	TokenNameCOLON	
collectors	TokenNameIdentifier	 collectors
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
n	TokenNameIdentifier	 n
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"At least 1 collector must not be null"	TokenNameStringLiteral	At least 1 collector must not be null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// only 1 Collector - return it. 	TokenNameCOMMENT_LINE	only 1 Collector - return it. 
Collector	TokenNameIdentifier	 Collector
col	TokenNameIdentifier	 col
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Collector	TokenNameIdentifier	 Collector
c	TokenNameIdentifier	 c
:	TokenNameCOLON	
collectors	TokenNameIdentifier	 collectors
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
col	TokenNameIdentifier	 col
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
col	TokenNameIdentifier	 col
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
collectors	TokenNameIdentifier	 collectors
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
MultiCollector	TokenNameIdentifier	 Multi Collector
(	TokenNameLPAREN	
collectors	TokenNameIdentifier	 collectors
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Collector	TokenNameIdentifier	 Collector
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
colls	TokenNameIdentifier	 colls
=	TokenNameEQUAL	
new	TokenNamenew	
Collector	TokenNameIdentifier	 Collector
[	TokenNameLBRACKET	
n	TokenNameIdentifier	 n
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Collector	TokenNameIdentifier	 Collector
c	TokenNameIdentifier	 c
:	TokenNameCOLON	
collectors	TokenNameIdentifier	 collectors
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
colls	TokenNameIdentifier	 colls
[	TokenNameLBRACKET	
n	TokenNameIdentifier	 n
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
MultiCollector	TokenNameIdentifier	 Multi Collector
(	TokenNameLPAREN	
colls	TokenNameIdentifier	 colls
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Collector	TokenNameIdentifier	 Collector
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
collectors	TokenNameIdentifier	 collectors
;	TokenNameSEMICOLON	
private	TokenNameprivate	
MultiCollector	TokenNameIdentifier	 Multi Collector
(	TokenNameLPAREN	
Collector	TokenNameIdentifier	 Collector
...	TokenNameELLIPSIS	
collectors	TokenNameIdentifier	 collectors
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
collectors	TokenNameIdentifier	 collectors
=	TokenNameEQUAL	
collectors	TokenNameIdentifier	 collectors
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
acceptsDocsOutOfOrder	TokenNameIdentifier	 accepts Docs Out Of Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Collector	TokenNameIdentifier	 Collector
c	TokenNameIdentifier	 c
:	TokenNameCOLON	
collectors	TokenNameIdentifier	 collectors
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
acceptsDocsOutOfOrder	TokenNameIdentifier	 accepts Docs Out Of Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Collector	TokenNameIdentifier	 Collector
c	TokenNameIdentifier	 c
:	TokenNameCOLON	
collectors	TokenNameIdentifier	 collectors
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Collector	TokenNameIdentifier	 Collector
c	TokenNameIdentifier	 c
:	TokenNameCOLON	
collectors	TokenNameIdentifier	 collectors
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
Scorer	TokenNameIdentifier	 Scorer
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Collector	TokenNameIdentifier	 Collector
c	TokenNameIdentifier	 c
:	TokenNameCOLON	
collectors	TokenNameIdentifier	 collectors
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
