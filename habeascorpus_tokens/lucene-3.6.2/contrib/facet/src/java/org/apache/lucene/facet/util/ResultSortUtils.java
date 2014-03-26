package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Comparator	TokenNameIdentifier	 Comparator
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
PriorityQueue	TokenNameIdentifier	 Priority Queue
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
Heap	TokenNameIdentifier	 Heap
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
params	TokenNameIdentifier	 params
.	TokenNameDOT	
FacetRequest	TokenNameIdentifier	 Facet Request
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
params	TokenNameIdentifier	 params
.	TokenNameDOT	
FacetRequest	TokenNameIdentifier	 Facet Request
.	TokenNameDOT	
SortOrder	TokenNameIdentifier	 Sort Order
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
results	TokenNameIdentifier	 results
.	TokenNameDOT	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Utilities for generating facet results sorted as required * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Utilities for generating facet results sorted as required * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
ResultSortUtils	TokenNameIdentifier	 Result Sort Utils
{	TokenNameLBRACE	
/** * Create a suitable heap according to facet request being served. * @return heap for maintaining results for specified request. * @throws IllegalArgumentException is provided facet request is not supported */	TokenNameCOMMENT_JAVADOC	 Create a suitable heap according to facet request being served. @return heap for maintaining results for specified request. @throws IllegalArgumentException is provided facet request is not supported 
public	TokenNamepublic	
static	TokenNamestatic	
Heap	TokenNameIdentifier	 Heap
<	TokenNameLESS	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
>	TokenNameGREATER	
createSuitableHeap	TokenNameIdentifier	 create Suitable Heap
(	TokenNameLPAREN	
FacetRequest	TokenNameIdentifier	 Facet Request
facetRequest	TokenNameIdentifier	 facet Request
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nresults	TokenNameIdentifier	 nresults
=	TokenNameEQUAL	
facetRequest	TokenNameIdentifier	 facet Request
.	TokenNameDOT	
getNumResults	TokenNameIdentifier	 get Num Results
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
accending	TokenNameIdentifier	 accending
=	TokenNameEQUAL	
(	TokenNameLPAREN	
facetRequest	TokenNameIdentifier	 facet Request
.	TokenNameDOT	
getSortOrder	TokenNameIdentifier	 get Sort Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
SortOrder	TokenNameIdentifier	 Sort Order
.	TokenNameDOT	
ASCENDING	TokenNameIdentifier	 ASCENDING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nresults	TokenNameIdentifier	 nresults
==	TokenNameEQUAL_EQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
AllValueHeap	TokenNameIdentifier	 All Value Heap
(	TokenNameLPAREN	
accending	TokenNameIdentifier	 accending
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
accending	TokenNameIdentifier	 accending
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
facetRequest	TokenNameIdentifier	 facet Request
.	TokenNameDOT	
getSortBy	TokenNameIdentifier	 get Sort By
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
VALUE	TokenNameIdentifier	 VALUE
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
MaxValueHeap	TokenNameIdentifier	 Max Value Heap
(	TokenNameLPAREN	
nresults	TokenNameIdentifier	 nresults
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
ORDINAL	TokenNameIdentifier	 ORDINAL
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
MaxOrdinalHeap	TokenNameIdentifier	 Max Ordinal Heap
(	TokenNameLPAREN	
nresults	TokenNameIdentifier	 nresults
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
facetRequest	TokenNameIdentifier	 facet Request
.	TokenNameDOT	
getSortBy	TokenNameIdentifier	 get Sort By
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
VALUE	TokenNameIdentifier	 VALUE
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
MinValueHeap	TokenNameIdentifier	 Min Value Heap
(	TokenNameLPAREN	
nresults	TokenNameIdentifier	 nresults
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
ORDINAL	TokenNameIdentifier	 ORDINAL
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
MinOrdinalHeap	TokenNameIdentifier	 Min Ordinal Heap
(	TokenNameLPAREN	
nresults	TokenNameIdentifier	 nresults
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"none supported facet request: "	TokenNameStringLiteral	none supported facet request: 
+	TokenNamePLUS	
facetRequest	TokenNameIdentifier	 facet Request
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
MinValueHeap	TokenNameIdentifier	 Min Value Heap
extends	TokenNameextends	
PriorityQueue	TokenNameIdentifier	 Priority Queue
<	TokenNameLESS	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
>	TokenNameGREATER	
implements	TokenNameimplements	
Heap	TokenNameIdentifier	 Heap
<	TokenNameLESS	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
MinValueHeap	TokenNameIdentifier	 Min Value Heap
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
boolean	TokenNameboolean	
lessThan	TokenNameIdentifier	 less Than
(	TokenNameLPAREN	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
value0	TokenNameIdentifier	 value0
=	TokenNameEQUAL	
arg0	TokenNameIdentifier	 arg0
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
value1	TokenNameIdentifier	 value1
=	TokenNameEQUAL	
arg1	TokenNameIdentifier	 arg1
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
valueCompare	TokenNameIdentifier	 value Compare
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
value0	TokenNameIdentifier	 value0
,	TokenNameCOMMA	
value1	TokenNameIdentifier	 value1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
valueCompare	TokenNameIdentifier	 value Compare
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
arg0	TokenNameIdentifier	 arg0
.	TokenNameDOT	
getOrdinal	TokenNameIdentifier	 get Ordinal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
arg1	TokenNameIdentifier	 arg1
.	TokenNameDOT	
getOrdinal	TokenNameIdentifier	 get Ordinal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
valueCompare	TokenNameIdentifier	 value Compare
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
MaxValueHeap	TokenNameIdentifier	 Max Value Heap
extends	TokenNameextends	
PriorityQueue	TokenNameIdentifier	 Priority Queue
<	TokenNameLESS	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
>	TokenNameGREATER	
implements	TokenNameimplements	
Heap	TokenNameIdentifier	 Heap
<	TokenNameLESS	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
MaxValueHeap	TokenNameIdentifier	 Max Value Heap
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
boolean	TokenNameboolean	
lessThan	TokenNameIdentifier	 less Than
(	TokenNameLPAREN	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
value0	TokenNameIdentifier	 value0
=	TokenNameEQUAL	
arg0	TokenNameIdentifier	 arg0
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
value1	TokenNameIdentifier	 value1
=	TokenNameEQUAL	
arg1	TokenNameIdentifier	 arg1
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
valueCompare	TokenNameIdentifier	 value Compare
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
value0	TokenNameIdentifier	 value0
,	TokenNameCOMMA	
value1	TokenNameIdentifier	 value1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
valueCompare	TokenNameIdentifier	 value Compare
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
arg0	TokenNameIdentifier	 arg0
.	TokenNameDOT	
getOrdinal	TokenNameIdentifier	 get Ordinal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
arg1	TokenNameIdentifier	 arg1
.	TokenNameDOT	
getOrdinal	TokenNameIdentifier	 get Ordinal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
valueCompare	TokenNameIdentifier	 value Compare
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
MinOrdinalHeap	TokenNameIdentifier	 Min Ordinal Heap
extends	TokenNameextends	
PriorityQueue	TokenNameIdentifier	 Priority Queue
<	TokenNameLESS	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
>	TokenNameGREATER	
implements	TokenNameimplements	
Heap	TokenNameIdentifier	 Heap
<	TokenNameLESS	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
MinOrdinalHeap	TokenNameIdentifier	 Min Ordinal Heap
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
boolean	TokenNameboolean	
lessThan	TokenNameIdentifier	 less Than
(	TokenNameLPAREN	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
arg0	TokenNameIdentifier	 arg0
.	TokenNameDOT	
getOrdinal	TokenNameIdentifier	 get Ordinal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
arg1	TokenNameIdentifier	 arg1
.	TokenNameDOT	
getOrdinal	TokenNameIdentifier	 get Ordinal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
MaxOrdinalHeap	TokenNameIdentifier	 Max Ordinal Heap
extends	TokenNameextends	
PriorityQueue	TokenNameIdentifier	 Priority Queue
<	TokenNameLESS	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
>	TokenNameGREATER	
implements	TokenNameimplements	
Heap	TokenNameIdentifier	 Heap
<	TokenNameLESS	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
MaxOrdinalHeap	TokenNameIdentifier	 Max Ordinal Heap
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
boolean	TokenNameboolean	
lessThan	TokenNameIdentifier	 less Than
(	TokenNameLPAREN	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
arg0	TokenNameIdentifier	 arg0
,	TokenNameCOMMA	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
arg0	TokenNameIdentifier	 arg0
.	TokenNameDOT	
getOrdinal	TokenNameIdentifier	 get Ordinal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
arg1	TokenNameIdentifier	 arg1
.	TokenNameDOT	
getOrdinal	TokenNameIdentifier	 get Ordinal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Create a Heap-Look-Alike, which implements {@link Heap}, but uses a * regular <code>ArrayList</code> for holding <b>ALL</b> the objects given, * only sorting upon the first call to {@link #pop()}. */	TokenNameCOMMENT_JAVADOC	 Create a Heap-Look-Alike, which implements {@link Heap}, but uses a regular <code>ArrayList</code> for holding <b>ALL</b> the objects given, only sorting upon the first call to {@link #pop()}. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
AllValueHeap	TokenNameIdentifier	 All Value Heap
implements	TokenNameimplements	
Heap	TokenNameIdentifier	 Heap
<	TokenNameLESS	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
>	TokenNameGREATER	
resultNodes	TokenNameIdentifier	 result Nodes
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
boolean	TokenNameboolean	
accending	TokenNameIdentifier	 accending
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
isReady	TokenNameIdentifier	 is Ready
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
AllValueHeap	TokenNameIdentifier	 All Value Heap
(	TokenNameLPAREN	
boolean	TokenNameboolean	
accending	TokenNameIdentifier	 accending
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
accending	TokenNameIdentifier	 accending
=	TokenNameEQUAL	
accending	TokenNameIdentifier	 accending
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
insertWithOverflow	TokenNameIdentifier	 insert With Overflow
(	TokenNameLPAREN	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resultNodes	TokenNameIdentifier	 result Nodes
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isReady	TokenNameIdentifier	 is Ready
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
resultNodes	TokenNameIdentifier	 result Nodes
,	TokenNameCOMMA	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
o2	TokenNameIdentifier	 o2
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
o1	TokenNameIdentifier	 o1
.	TokenNameDOT	
getOrdinal	TokenNameIdentifier	 get Ordinal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
o2	TokenNameIdentifier	 o2
.	TokenNameDOT	
getOrdinal	TokenNameIdentifier	 get Ordinal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
accending	TokenNameIdentifier	 accending
)	TokenNameRPAREN	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
-	TokenNameMINUS	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isReady	TokenNameIdentifier	 is Ready
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
resultNodes	TokenNameIdentifier	 result Nodes
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
resultNodes	TokenNameIdentifier	 result Nodes
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
top	TokenNameIdentifier	 top
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
resultNodes	TokenNameIdentifier	 result Nodes
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
resultNodes	TokenNameIdentifier	 result Nodes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
frn	TokenNameIdentifier	 frn
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resultNodes	TokenNameIdentifier	 result Nodes
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
frn	TokenNameIdentifier	 frn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resultNodes	TokenNameIdentifier	 result Nodes
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
