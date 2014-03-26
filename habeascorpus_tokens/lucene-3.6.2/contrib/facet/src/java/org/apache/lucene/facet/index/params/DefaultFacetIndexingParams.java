package	TokenNamepackage	
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
index	TokenNameIdentifier	 index
.	TokenNameDOT	
categorypolicy	TokenNameIdentifier	 categorypolicy
.	TokenNameDOT	
DefaultOrdinalPolicy	TokenNameIdentifier	 Default Ordinal Policy
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
categorypolicy	TokenNameIdentifier	 categorypolicy
.	TokenNameDOT	
DefaultPathPolicy	TokenNameIdentifier	 Default Path Policy
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
categorypolicy	TokenNameIdentifier	 categorypolicy
.	TokenNameDOT	
OrdinalPolicy	TokenNameIdentifier	 Ordinal Policy
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
categorypolicy	TokenNameIdentifier	 categorypolicy
.	TokenNameDOT	
PathPolicy	TokenNameIdentifier	 Path Policy
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
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Default implementation for {@link FacetIndexingParams}. * <p> * Getters for <em>partition-size</em>, {@link OrdinalPolicy} and * {@link PathPolicy} are all final, and so the proper way to modify them when * extending this class is through {@link #fixedPartitionSize()}, * {@link #fixedOrdinalPolicy()} or {@link #fixedPathPolicy()} accordingly. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Default implementation for {@link FacetIndexingParams}. <p> Getters for <em>partition-size</em>, {@link OrdinalPolicy} and {@link PathPolicy} are all final, and so the proper way to modify them when extending this class is through {@link #fixedPartitionSize()}, {@link #fixedOrdinalPolicy()} or {@link #fixedPathPolicy()} accordingly. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
DefaultFacetIndexingParams	TokenNameIdentifier	 Default Facet Indexing Params
implements	TokenNameimplements	
FacetIndexingParams	TokenNameIdentifier	 Facet Indexing Params
{	TokenNameLBRACE	
/** * delimiter between a categories in a path, e.g. Products FACET_DELIM * Consumer FACET_DELIM Tv. This should be a character not found in any path * component */	TokenNameCOMMENT_JAVADOC	 delimiter between a categories in a path, e.g. Products FACET_DELIM Consumer FACET_DELIM Tv. This should be a character not found in any path component 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
DEFAULT_FACET_DELIM_CHAR	TokenNameIdentifier	 DEFAULT  FACET  DELIM  CHAR
=	TokenNameEQUAL	
'?'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
CategoryListParams	TokenNameIdentifier	 Category List Params
clpParams	TokenNameIdentifier	 clp Params
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
OrdinalPolicy	TokenNameIdentifier	 Ordinal Policy
ordinalPolicy	TokenNameIdentifier	 ordinal Policy
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
PathPolicy	TokenNameIdentifier	 Path Policy
pathPolicy	TokenNameIdentifier	 path Policy
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
partitionSize	TokenNameIdentifier	 partition Size
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DefaultFacetIndexingParams	TokenNameIdentifier	 Default Facet Indexing Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
new	TokenNamenew	
CategoryListParams	TokenNameIdentifier	 Category List Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DefaultFacetIndexingParams	TokenNameIdentifier	 Default Facet Indexing Params
(	TokenNameLPAREN	
CategoryListParams	TokenNameIdentifier	 Category List Params
categoryListParams	TokenNameIdentifier	 category List Params
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clpParams	TokenNameIdentifier	 clp Params
=	TokenNameEQUAL	
categoryListParams	TokenNameIdentifier	 category List Params
;	TokenNameSEMICOLON	
ordinalPolicy	TokenNameIdentifier	 ordinal Policy
=	TokenNameEQUAL	
fixedOrdinalPolicy	TokenNameIdentifier	 fixed Ordinal Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pathPolicy	TokenNameIdentifier	 path Policy
=	TokenNameEQUAL	
fixedPathPolicy	TokenNameIdentifier	 fixed Path Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
partitionSize	TokenNameIdentifier	 partition Size
=	TokenNameEQUAL	
fixedPartitionSize	TokenNameIdentifier	 fixed Partition Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CategoryListParams	TokenNameIdentifier	 Category List Params
getCategoryListParams	TokenNameIdentifier	 get Category List Params
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
category	TokenNameIdentifier	 category
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
clpParams	TokenNameIdentifier	 clp Params
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
drillDownTermText	TokenNameIdentifier	 drill Down Term Text
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
copyToCharArray	TokenNameIdentifier	 copy To Char Array
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
getFacetDelimChar	TokenNameIdentifier	 get Facet Delim Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * "fixed" partition size. * @see #getPartitionSize() */	TokenNameCOMMENT_JAVADOC	 "fixed" partition size. @see #getPartitionSize() 
protected	TokenNameprotected	
int	TokenNameint	
fixedPartitionSize	TokenNameIdentifier	 fixed Partition Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * "fixed" ordinal policy. * @see #getOrdinalPolicy() */	TokenNameCOMMENT_JAVADOC	 "fixed" ordinal policy. @see #getOrdinalPolicy() 
protected	TokenNameprotected	
OrdinalPolicy	TokenNameIdentifier	 Ordinal Policy
fixedOrdinalPolicy	TokenNameIdentifier	 fixed Ordinal Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DefaultOrdinalPolicy	TokenNameIdentifier	 Default Ordinal Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * "fixed" path policy. * @see #getPathPolicy() */	TokenNameCOMMENT_JAVADOC	 "fixed" path policy. @see #getPathPolicy() 
protected	TokenNameprotected	
PathPolicy	TokenNameIdentifier	 Path Policy
fixedPathPolicy	TokenNameIdentifier	 fixed Path Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DefaultPathPolicy	TokenNameIdentifier	 Default Path Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getPartitionSize	TokenNameIdentifier	 get Partition Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
partitionSize	TokenNameIdentifier	 partition Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * (non-Javadoc) * * @see * org.apache.lucene.facet.index.params.FacetIndexingParams#getAllCategoryListParams * () */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) * @see org.apache.lucene.facet.index.params.FacetIndexingParams#getAllCategoryListParams () 
public	TokenNamepublic	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
CategoryListParams	TokenNameIdentifier	 Category List Params
>	TokenNameGREATER	
getAllCategoryListParams	TokenNameIdentifier	 get All Category List Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
CategoryListParams	TokenNameIdentifier	 Category List Params
>	TokenNameGREATER	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
CategoryListParams	TokenNameIdentifier	 Category List Params
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
clpParams	TokenNameIdentifier	 clp Params
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
OrdinalPolicy	TokenNameIdentifier	 Ordinal Policy
getOrdinalPolicy	TokenNameIdentifier	 get Ordinal Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ordinalPolicy	TokenNameIdentifier	 ordinal Policy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
PathPolicy	TokenNameIdentifier	 Path Policy
getPathPolicy	TokenNameIdentifier	 get Path Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pathPolicy	TokenNameIdentifier	 path Policy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see java.lang.Object#hashCode() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see java.lang.Object#hashCode() 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
prime	TokenNameIdentifier	 prime
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
clpParams	TokenNameIdentifier	 clp Params
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
clpParams	TokenNameIdentifier	 clp Params
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ordinalPolicy	TokenNameIdentifier	 ordinal Policy
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
ordinalPolicy	TokenNameIdentifier	 ordinal Policy
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
partitionSize	TokenNameIdentifier	 partition Size
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
pathPolicy	TokenNameIdentifier	 path Policy
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
pathPolicy	TokenNameIdentifier	 path Policy
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
CategoryListParams	TokenNameIdentifier	 Category List Params
clp	TokenNameIdentifier	 clp
:	TokenNameCOLON	
getAllCategoryListParams	TokenNameIdentifier	 get All Category List Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
^=	TokenNameXOR_EQUAL	
clp	TokenNameIdentifier	 clp
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see java.lang.Object#equals(java.lang.Object) */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see java.lang.Object#equals(java.lang.Object) 
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
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
instanceof	TokenNameinstanceof	
DefaultFacetIndexingParams	TokenNameIdentifier	 Default Facet Indexing Params
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
DefaultFacetIndexingParams	TokenNameIdentifier	 Default Facet Indexing Params
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DefaultFacetIndexingParams	TokenNameIdentifier	 Default Facet Indexing Params
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
clpParams	TokenNameIdentifier	 clp Params
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
clpParams	TokenNameIdentifier	 clp Params
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
clpParams	TokenNameIdentifier	 clp Params
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
clpParams	TokenNameIdentifier	 clp Params
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ordinalPolicy	TokenNameIdentifier	 ordinal Policy
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
ordinalPolicy	TokenNameIdentifier	 ordinal Policy
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ordinalPolicy	TokenNameIdentifier	 ordinal Policy
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
ordinalPolicy	TokenNameIdentifier	 ordinal Policy
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
partitionSize	TokenNameIdentifier	 partition Size
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
partitionSize	TokenNameIdentifier	 partition Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pathPolicy	TokenNameIdentifier	 path Policy
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
pathPolicy	TokenNameIdentifier	 path Policy
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
pathPolicy	TokenNameIdentifier	 path Policy
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
pathPolicy	TokenNameIdentifier	 path Policy
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
CategoryListParams	TokenNameIdentifier	 Category List Params
>	TokenNameGREATER	
cLs	TokenNameIdentifier	 c Ls
=	TokenNameEQUAL	
getAllCategoryListParams	TokenNameIdentifier	 get All Category List Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
CategoryListParams	TokenNameIdentifier	 Category List Params
>	TokenNameGREATER	
otherCLs	TokenNameIdentifier	 other C Ls
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getAllCategoryListParams	TokenNameIdentifier	 get All Category List Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cLs	TokenNameIdentifier	 c Ls
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
otherCLs	TokenNameIdentifier	 other C Ls
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Use {@link #DEFAULT_FACET_DELIM_CHAR} as the delimiter. */	TokenNameCOMMENT_JAVADOC	 Use {@link #DEFAULT_FACET_DELIM_CHAR} as the delimiter. 
public	TokenNamepublic	
char	TokenNamechar	
getFacetDelimChar	TokenNameIdentifier	 get Facet Delim Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DEFAULT_FACET_DELIM_CHAR	TokenNameIdentifier	 DEFAULT  FACET  DELIM  CHAR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
