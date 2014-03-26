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
results	TokenNameIdentifier	 results
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
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
List	TokenNameIdentifier	 List
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
taxonomy	TokenNameIdentifier	 taxonomy
.	TokenNameDOT	
CategoryPath	TokenNameIdentifier	 Category Path
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
taxonomy	TokenNameIdentifier	 taxonomy
.	TokenNameDOT	
TaxonomyReader	TokenNameIdentifier	 Taxonomy Reader
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Mutable implementation for Result of faceted search for a certain taxonomy node. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Mutable implementation for Result of faceted search for a certain taxonomy node. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
MutableFacetResultNode	TokenNameIdentifier	 Mutable Facet Result Node
implements	TokenNameimplements	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
{	TokenNameLBRACE	
/** * Empty sub results to be returned when there are no results. * We never return null, so that code using this can remain simpler. */	TokenNameCOMMENT_JAVADOC	 Empty sub results to be returned when there are no results. We never return null, so that code using this can remain simpler. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
>	TokenNameGREATER	
EMPTY_SUB_RESULTS	TokenNameIdentifier	 EMPTY  SUB  RESULTS
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
ordinal	TokenNameIdentifier	 ordinal
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CategoryPath	TokenNameIdentifier	 Category Path
label	TokenNameIdentifier	 label
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
residue	TokenNameIdentifier	 residue
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
>	TokenNameGREATER	
subResults	TokenNameIdentifier	 sub Results
;	TokenNameSEMICOLON	
/** * Create a Facet Result Node. * * @param ordinal * ordinal in the taxonomy of the category of this result. * @param value * value this result. */	TokenNameCOMMENT_JAVADOC	 Create a Facet Result Node. * @param ordinal ordinal in the taxonomy of the category of this result. @param value value this result. 
public	TokenNamepublic	
MutableFacetResultNode	TokenNameIdentifier	 Mutable Facet Result Node
(	TokenNameLPAREN	
int	TokenNameint	
ordinal	TokenNameIdentifier	 ordinal
,	TokenNameCOMMA	
double	TokenNamedouble	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
ordinal	TokenNameIdentifier	 ordinal
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reset a facet Result Node. * <p> * Used at the population of facet results, not intended for regular use by * applications. * * @param ordinal * ordinal in the taxonomy of the category of this result. * @param value * value of this result. */	TokenNameCOMMENT_JAVADOC	 Reset a facet Result Node. <p> Used at the population of facet results, not intended for regular use by applications. * @param ordinal ordinal in the taxonomy of the category of this result. @param value value of this result. 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
int	TokenNameint	
ordinal	TokenNameIdentifier	 ordinal
,	TokenNameCOMMA	
double	TokenNamedouble	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ordinal	TokenNameIdentifier	 ordinal
=	TokenNameEQUAL	
ordinal	TokenNameIdentifier	 ordinal
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
subResults	TokenNameIdentifier	 sub Results
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
subResults	TokenNameIdentifier	 sub Results
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
label	TokenNameIdentifier	 label
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
residue	TokenNameIdentifier	 residue
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a Facet Result Node. * * @param ordinal * ordinal in the taxonomy of the category of this result. * @param value * value of this result. * @param residue * Value of screened out sub results. * @param label * label of the category path of this result. * @param subResults * - sub results, usually descendants, sometimes child results, of * this result - depending on the request. */	TokenNameCOMMENT_JAVADOC	 Create a Facet Result Node. * @param ordinal ordinal in the taxonomy of the category of this result. @param value value of this result. @param residue Value of screened out sub results. @param label label of the category path of this result. @param subResults - sub results, usually descendants, sometimes child results, of this result - depending on the request. 
public	TokenNamepublic	
MutableFacetResultNode	TokenNameIdentifier	 Mutable Facet Result Node
(	TokenNameLPAREN	
int	TokenNameint	
ordinal	TokenNameIdentifier	 ordinal
,	TokenNameCOMMA	
double	TokenNamedouble	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
double	TokenNamedouble	
residue	TokenNameIdentifier	 residue
,	TokenNameCOMMA	
CategoryPath	TokenNameIdentifier	 Category Path
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
>	TokenNameGREATER	
subResults	TokenNameIdentifier	 sub Results
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ordinal	TokenNameIdentifier	 ordinal
=	TokenNameEQUAL	
ordinal	TokenNameIdentifier	 ordinal
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
residue	TokenNameIdentifier	 residue
=	TokenNameEQUAL	
residue	TokenNameIdentifier	 residue
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
label	TokenNameIdentifier	 label
=	TokenNameEQUAL	
label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
subResults	TokenNameIdentifier	 sub Results
=	TokenNameEQUAL	
subResults	TokenNameIdentifier	 sub Results
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a mutable facet result node from another result node * @param other other result node to copy from * @param takeSubResults set to true to take also sub results of other node */	TokenNameCOMMENT_JAVADOC	 Create a mutable facet result node from another result node @param other other result node to copy from @param takeSubResults set to true to take also sub results of other node 
public	TokenNamepublic	
MutableFacetResultNode	TokenNameIdentifier	 Mutable Facet Result Node
(	TokenNameLPAREN	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
other	TokenNameIdentifier	 other
,	TokenNameCOMMA	
boolean	TokenNameboolean	
takeSubResults	TokenNameIdentifier	 take Sub Results
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getOrdinal	TokenNameIdentifier	 get Ordinal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getResidue	TokenNameIdentifier	 get Residue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
takeSubResults	TokenNameIdentifier	 take Sub Results
?	TokenNameQUESTION	
resultsToList	TokenNameIdentifier	 results To List
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getSubResults	TokenNameIdentifier	 get Sub Results
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
>	TokenNameGREATER	
resultsToList	TokenNameIdentifier	 results To List
(	TokenNameLPAREN	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
>	TokenNameGREATER	
subResults	TokenNameIdentifier	 sub Results
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
subResults	TokenNameIdentifier	 sub Results
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
>	TokenNameGREATER	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
r	TokenNameIdentifier	 r
:	TokenNameCOLON	
subResults	TokenNameIdentifier	 sub Results
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
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
return	TokenNamereturn	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Number of sub results. */	TokenNameCOMMENT_JAVADOC	 Number of sub results. 
private	TokenNameprivate	
int	TokenNameint	
numSubResults	TokenNameIdentifier	 num Sub Results
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
subResults	TokenNameIdentifier	 sub Results
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
subResults	TokenNameIdentifier	 sub Results
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * (non-Javadoc) * * @see * org.apache.lucene.facet.search.results2.FacetResultNode#toString(java.lang. * String) */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) * @see org.apache.lucene.facet.search.results2.FacetResultNode#toString(java.lang. String) 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"Facet Result Node with "	TokenNameStringLiteral	Facet Result Node with 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
numSubResults	TokenNameIdentifier	 num Sub Results
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" sub result nodes. "	TokenNameStringLiteral	 sub result nodes. 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// label 	TokenNameCOMMENT_LINE	label 
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"Name: "	TokenNameStringLiteral	Name: 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// value 	TokenNameCOMMENT_LINE	value 
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"Value: "	TokenNameStringLiteral	Value: 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// residue 	TokenNameCOMMENT_LINE	residue 
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"Residue: "	TokenNameStringLiteral	Residue: 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
residue	TokenNameIdentifier	 residue
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
subResults	TokenNameIdentifier	 sub Results
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
subRes	TokenNameIdentifier	 sub Res
:	TokenNameCOLON	
subResults	TokenNameIdentifier	 sub Results
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"Subresult #"	TokenNameStringLiteral	Subresult #
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
subRes	TokenNameIdentifier	 sub Res
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getOrdinal	TokenNameIdentifier	 get Ordinal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ordinal	TokenNameIdentifier	 ordinal
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
CategoryPath	TokenNameIdentifier	 Category Path
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the label of the category of this result. * @param label the label to set. * @see #getLabel() */	TokenNameCOMMENT_JAVADOC	 Set the label of the category of this result. @param label the label to set. @see #getLabel() 
public	TokenNamepublic	
void	TokenNamevoid	
setLabel	TokenNameIdentifier	 set Label
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
label	TokenNameIdentifier	 label
=	TokenNameEQUAL	
label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
double	TokenNamedouble	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the value of this result. * * @param value * the value to set * @see #getValue() */	TokenNameCOMMENT_JAVADOC	 Set the value of this result. * @param value the value to set @see #getValue() 
public	TokenNamepublic	
void	TokenNamevoid	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
double	TokenNamedouble	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * increase the value for this result. * @param addedValue the value to add * @see #getValue() */	TokenNameCOMMENT_JAVADOC	 increase the value for this result. @param addedValue the value to add @see #getValue() 
public	TokenNamepublic	
void	TokenNamevoid	
increaseValue	TokenNameIdentifier	 increase Value
(	TokenNameLPAREN	
double	TokenNamedouble	
addedValue	TokenNameIdentifier	 added Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
+=	TokenNamePLUS_EQUAL	
addedValue	TokenNameIdentifier	 added Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
double	TokenNamedouble	
getResidue	TokenNameIdentifier	 get Residue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
residue	TokenNameIdentifier	 residue
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the residue. * @param residue the residue to set * @see #getResidue() */	TokenNameCOMMENT_JAVADOC	 Set the residue. @param residue the residue to set @see #getResidue() 
public	TokenNamepublic	
void	TokenNamevoid	
setResidue	TokenNameIdentifier	 set Residue
(	TokenNameLPAREN	
double	TokenNamedouble	
residue	TokenNameIdentifier	 residue
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
residue	TokenNameIdentifier	 residue
=	TokenNameEQUAL	
residue	TokenNameIdentifier	 residue
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * increase the residue for this result. * @param addedResidue the residue to add * @see #getResidue() */	TokenNameCOMMENT_JAVADOC	 increase the residue for this result. @param addedResidue the residue to add @see #getResidue() 
public	TokenNamepublic	
void	TokenNamevoid	
increaseResidue	TokenNameIdentifier	 increase Residue
(	TokenNameLPAREN	
double	TokenNamedouble	
addedResidue	TokenNameIdentifier	 added Residue
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
residue	TokenNameIdentifier	 residue
+=	TokenNamePLUS_EQUAL	
addedResidue	TokenNameIdentifier	 added Residue
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
>	TokenNameGREATER	
getSubResults	TokenNameIdentifier	 get Sub Results
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
subResults	TokenNameIdentifier	 sub Results
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
subResults	TokenNameIdentifier	 sub Results
:	TokenNameCOLON	
EMPTY_SUB_RESULTS	TokenNameIdentifier	 EMPTY  SUB  RESULTS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Trim sub results to a given size. * <p> * Note: Although the {@link #getResidue()} is not guaranteed to be * accurate, it is worth fixing it, as possible, by taking under account the * trimmed sub-nodes. */	TokenNameCOMMENT_JAVADOC	 Trim sub results to a given size. <p> Note: Although the {@link #getResidue()} is not guaranteed to be accurate, it is worth fixing it, as possible, by taking under account the trimmed sub-nodes. 
public	TokenNamepublic	
void	TokenNamevoid	
trimSubResults	TokenNameIdentifier	 trim Sub Results
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
subResults	TokenNameIdentifier	 sub Results
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
subResults	TokenNameIdentifier	 sub Results
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
>	TokenNameGREATER	
trimmed	TokenNameIdentifier	 trimmed
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
>	TokenNameGREATER	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
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
subResults	TokenNameIdentifier	 sub Results
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MutableFacetResultNode	TokenNameIdentifier	 Mutable Facet Result Node
trimmedNode	TokenNameIdentifier	 trimmed Node
=	TokenNameEQUAL	
toImpl	TokenNameIdentifier	 to Impl
(	TokenNameLPAREN	
subResults	TokenNameIdentifier	 sub Results
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
trimmedNode	TokenNameIdentifier	 trimmed Node
.	TokenNameDOT	
trimSubResults	TokenNameIdentifier	 trim Sub Results
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
trimmed	TokenNameIdentifier	 trimmed
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
trimmedNode	TokenNameIdentifier	 trimmed Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * If we are trimming, it means Sampling is in effect and the extra * (over-sampled) results are being trimmed. Although the residue is not * guaranteed to be accurate for Sampling, we try our best to fix it. * The node's residue now will take under account the sub-nodes we're * trimming. */	TokenNameCOMMENT_BLOCK	 If we are trimming, it means Sampling is in effect and the extra (over-sampled) results are being trimmed. Although the residue is not guaranteed to be accurate for Sampling, we try our best to fix it. The node's residue now will take under account the sub-nodes we're trimming. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
subResults	TokenNameIdentifier	 sub Results
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
increaseResidue	TokenNameIdentifier	 increase Residue
(	TokenNameLPAREN	
subResults	TokenNameIdentifier	 sub Results
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
subResults	TokenNameIdentifier	 sub Results
=	TokenNameEQUAL	
trimmed	TokenNameIdentifier	 trimmed
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the sub results. * @param subResults the sub-results to set */	TokenNameCOMMENT_JAVADOC	 Set the sub results. @param subResults the sub-results to set 
public	TokenNamepublic	
void	TokenNamevoid	
setSubResults	TokenNameIdentifier	 set Sub Results
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
>	TokenNameGREATER	
subResults	TokenNameIdentifier	 sub Results
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
subResults	TokenNameIdentifier	 sub Results
=	TokenNameEQUAL	
subResults	TokenNameIdentifier	 sub Results
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Append a sub result (as last). * @param subRes sub-result to be appended */	TokenNameCOMMENT_JAVADOC	 Append a sub result (as last). @param subRes sub-result to be appended 
public	TokenNamepublic	
void	TokenNamevoid	
appendSubResult	TokenNameIdentifier	 append Sub Result
(	TokenNameLPAREN	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
subRes	TokenNameIdentifier	 sub Res
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
subResults	TokenNameIdentifier	 sub Results
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
subResults	TokenNameIdentifier	 sub Results
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
subResults	TokenNameIdentifier	 sub Results
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
subRes	TokenNameIdentifier	 sub Res
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Insert sub result (as first). * @param subRes sub-result to be inserted */	TokenNameCOMMENT_JAVADOC	 Insert sub result (as first). @param subRes sub-result to be inserted 
public	TokenNamepublic	
void	TokenNamevoid	
insertSubResult	TokenNameIdentifier	 insert Sub Result
(	TokenNameLPAREN	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
subRes	TokenNameIdentifier	 sub Res
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
subResults	TokenNameIdentifier	 sub Results
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
subResults	TokenNameIdentifier	 sub Results
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
subResults	TokenNameIdentifier	 sub Results
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
subRes	TokenNameIdentifier	 sub Res
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * (non-Javadoc) * * @see * org.apache.lucene.facet.search.results.FacetResultNode#getLabel(org.apache.lucene * .facet.taxonomy.TaxonomyReader) */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) * @see org.apache.lucene.facet.search.results.FacetResultNode#getLabel(org.apache.lucene .facet.taxonomy.TaxonomyReader) 
public	TokenNamepublic	
final	TokenNamefinal	
CategoryPath	TokenNameIdentifier	 Category Path
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
TaxonomyReader	TokenNameIdentifier	 Taxonomy Reader
taxonomyReader	TokenNameIdentifier	 taxonomy Reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
label	TokenNameIdentifier	 label
=	TokenNameEQUAL	
taxonomyReader	TokenNameIdentifier	 taxonomy Reader
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
ordinal	TokenNameIdentifier	 ordinal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * (non-Javadoc) * * @see org.apache.lucene.facet.search.results.FacetResultNode#getNumSubResults() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) * @see org.apache.lucene.facet.search.results.FacetResultNode#getNumSubResults() 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getNumSubResults	TokenNameIdentifier	 get Num Sub Results
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
subResults	TokenNameIdentifier	 sub Results
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
subResults	TokenNameIdentifier	 sub Results
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Internal utility: turn a result node into an implementation class * with richer API that allows modifying it. * <p> * In case that input result node is already of an implementation * class only casting is done, but in any case we pay the price * of checking "instance of". * @param frn facet result node to be turned into an implementation class object */	TokenNameCOMMENT_JAVADOC	 Internal utility: turn a result node into an implementation class with richer API that allows modifying it. <p> In case that input result node is already of an implementation class only casting is done, but in any case we pay the price of checking "instance of". @param frn facet result node to be turned into an implementation class object 
public	TokenNamepublic	
static	TokenNamestatic	
MutableFacetResultNode	TokenNameIdentifier	 Mutable Facet Result Node
toImpl	TokenNameIdentifier	 to Impl
(	TokenNameLPAREN	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
frn	TokenNameIdentifier	 frn
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
frn	TokenNameIdentifier	 frn
instanceof	TokenNameinstanceof	
MutableFacetResultNode	TokenNameIdentifier	 Mutable Facet Result Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
MutableFacetResultNode	TokenNameIdentifier	 Mutable Facet Result Node
)	TokenNameRPAREN	
frn	TokenNameIdentifier	 frn
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
MutableFacetResultNode	TokenNameIdentifier	 Mutable Facet Result Node
(	TokenNameLPAREN	
frn	TokenNameIdentifier	 frn
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
