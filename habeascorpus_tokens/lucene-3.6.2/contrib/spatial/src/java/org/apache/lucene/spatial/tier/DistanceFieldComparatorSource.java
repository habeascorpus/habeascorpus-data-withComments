/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
spatial	TokenNameIdentifier	 spatial
.	TokenNameDOT	
tier	TokenNameIdentifier	 tier
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
Filter	TokenNameIdentifier	 Filter
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
FieldComparator	TokenNameIdentifier	 Field Comparator
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
FieldComparatorSource	TokenNameIdentifier	 Field Comparator Source
;	TokenNameSEMICOLON	
/** * <p><font color="red"><b>NOTE:</b> This API is still in * flux and might change in incompatible ways in the next * release.</font> */	TokenNameCOMMENT_JAVADOC	 <p><font color="red"><b>NOTE:</b> This API is still in flux and might change in incompatible ways in the next release.</font> 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
DistanceFieldComparatorSource	TokenNameIdentifier	 Distance Field Comparator Source
extends	TokenNameextends	
FieldComparatorSource	TokenNameIdentifier	 Field Comparator Source
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
1L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
DistanceFilter	TokenNameIdentifier	 Distance Filter
distanceFilter	TokenNameIdentifier	 distance Filter
;	TokenNameSEMICOLON	
private	TokenNameprivate	
DistanceScoreDocLookupComparator	TokenNameIdentifier	 Distance Score Doc Lookup Comparator
dsdlc	TokenNameIdentifier	 dsdlc
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DistanceFieldComparatorSource	TokenNameIdentifier	 Distance Field Comparator Source
(	TokenNameLPAREN	
Filter	TokenNameIdentifier	 Filter
distanceFilter	TokenNameIdentifier	 distance Filter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
distanceFilter	TokenNameIdentifier	 distance Filter
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DistanceFilter	TokenNameIdentifier	 Distance Filter
)	TokenNameRPAREN	
distanceFilter	TokenNameIdentifier	 distance Filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
cleanUp	TokenNameIdentifier	 clean Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
distanceFilter	TokenNameIdentifier	 distance Filter
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dsdlc	TokenNameIdentifier	 dsdlc
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dsdlc	TokenNameIdentifier	 dsdlc
.	TokenNameDOT	
cleanUp	TokenNameIdentifier	 clean Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dsdlc	TokenNameIdentifier	 dsdlc
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
FieldComparator	TokenNameIdentifier	 Field Comparator
newComparator	TokenNameIdentifier	 new Comparator
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldname	TokenNameIdentifier	 fieldname
,	TokenNameCOMMA	
int	TokenNameint	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
int	TokenNameint	
sortPos	TokenNameIdentifier	 sort Pos
,	TokenNameCOMMA	
boolean	TokenNameboolean	
reversed	TokenNameIdentifier	 reversed
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
dsdlc	TokenNameIdentifier	 dsdlc
=	TokenNameEQUAL	
new	TokenNamenew	
DistanceScoreDocLookupComparator	TokenNameIdentifier	 Distance Score Doc Lookup Comparator
(	TokenNameLPAREN	
numHits	TokenNameIdentifier	 num Hits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
dsdlc	TokenNameIdentifier	 dsdlc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
DistanceScoreDocLookupComparator	TokenNameIdentifier	 Distance Score Doc Lookup Comparator
extends	TokenNameextends	
FieldComparator	TokenNameIdentifier	 Field Comparator
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
bottom	TokenNameIdentifier	 bottom
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DistanceScoreDocLookupComparator	TokenNameIdentifier	 Distance Score Doc Lookup Comparator
(	TokenNameLPAREN	
int	TokenNameint	
numHits	TokenNameIdentifier	 num Hits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
numHits	TokenNameIdentifier	 num Hits
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
int	TokenNameint	
slot1	TokenNameIdentifier	 slot1
,	TokenNameCOMMA	
int	TokenNameint	
slot2	TokenNameIdentifier	 slot2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot1	TokenNameIdentifier	 slot1
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot2	TokenNameIdentifier	 slot2
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
>	TokenNameGREATER	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
<	TokenNameLESS	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
cleanUp	TokenNameIdentifier	 clean Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
distanceFilter	TokenNameIdentifier	 distance Filter
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
compareBottom	TokenNameIdentifier	 compare Bottom
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
distanceFilter	TokenNameIdentifier	 distance Filter
.	TokenNameDOT	
getDistance	TokenNameIdentifier	 get Distance
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
>	TokenNameGREATER	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
<	TokenNameLESS	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot	TokenNameIdentifier	 slot
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
distanceFilter	TokenNameIdentifier	 distance Filter
.	TokenNameDOT	
getDistance	TokenNameIdentifier	 get Distance
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setBottom	TokenNameIdentifier	 set Bottom
(	TokenNameLPAREN	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
bottom	TokenNameIdentifier	 bottom
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot	TokenNameIdentifier	 slot
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
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
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// each reader in a segmented base 	TokenNameCOMMENT_LINE	each reader in a segmented base 
// has an offset based on the maxDocs of previous readers 	TokenNameCOMMENT_LINE	has an offset based on the maxDocs of previous readers 
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
docBase	TokenNameIdentifier	 doc Base
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Double	TokenNameIdentifier	 Double
value	TokenNameIdentifier	 value
(	TokenNameLPAREN	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot	TokenNameIdentifier	 slot
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
