package	TokenNamepackage	
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
writercache	TokenNameIdentifier	 writercache
.	TokenNameDOT	
cl2o	TokenNameIdentifier	 cl2o
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
writercache	TokenNameIdentifier	 writercache
.	TokenNameDOT	
TaxonomyWriterCache	TokenNameIdentifier	 Taxonomy Writer Cache
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * {@link TaxonomyWriterCache} using {@link CompactLabelToOrdinal}. Although * called cache, it maintains in memory all the mappings from category to * ordinal, relying on that {@link CompactLabelToOrdinal} is an efficient * mapping for this purpose. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 {@link TaxonomyWriterCache} using {@link CompactLabelToOrdinal}. Although called cache, it maintains in memory all the mappings from category to ordinal, relying on that {@link CompactLabelToOrdinal} is an efficient mapping for this purpose. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
Cl2oTaxonomyWriterCache	TokenNameIdentifier	 Cl2o Taxonomy Writer Cache
implements	TokenNameimplements	
TaxonomyWriterCache	TokenNameIdentifier	 Taxonomy Writer Cache
{	TokenNameLBRACE	
private	TokenNameprivate	
CompactLabelToOrdinal	TokenNameIdentifier	 Compact Label To Ordinal
cache	TokenNameIdentifier	 cache
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Cl2oTaxonomyWriterCache	TokenNameIdentifier	 Cl2o Taxonomy Writer Cache
(	TokenNameLPAREN	
int	TokenNameint	
initialCapcity	TokenNameIdentifier	 initial Capcity
,	TokenNameCOMMA	
float	TokenNamefloat	
loadFactor	TokenNameIdentifier	 load Factor
,	TokenNameCOMMA	
int	TokenNameint	
numHashArrays	TokenNameIdentifier	 num Hash Arrays
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
cache	TokenNameIdentifier	 cache
=	TokenNameEQUAL	
new	TokenNamenew	
CompactLabelToOrdinal	TokenNameIdentifier	 Compact Label To Ordinal
(	TokenNameLPAREN	
initialCapcity	TokenNameIdentifier	 initial Capcity
,	TokenNameCOMMA	
loadFactor	TokenNameIdentifier	 load Factor
,	TokenNameCOMMA	
numHashArrays	TokenNameIdentifier	 num Hash Arrays
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cache	TokenNameIdentifier	 cache
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasRoom	TokenNameIdentifier	 has Room
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This cache is unlimited, so we always have room for remembering more: 	TokenNameCOMMENT_LINE	This cache is unlimited, so we always have room for remembering more: 
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
categoryPath	TokenNameIdentifier	 category Path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
getOrdinal	TokenNameIdentifier	 get Ordinal
(	TokenNameLPAREN	
categoryPath	TokenNameIdentifier	 category Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
categoryPath	TokenNameIdentifier	 category Path
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
categoryPath	TokenNameIdentifier	 category Path
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
categoryPath	TokenNameIdentifier	 category Path
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
getOrdinal	TokenNameIdentifier	 get Ordinal
(	TokenNameLPAREN	
categoryPath	TokenNameIdentifier	 category Path
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
categoryPath	TokenNameIdentifier	 category Path
,	TokenNameCOMMA	
int	TokenNameint	
ordinal	TokenNameIdentifier	 ordinal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
addLabel	TokenNameIdentifier	 add Label
(	TokenNameLPAREN	
categoryPath	TokenNameIdentifier	 category Path
,	TokenNameCOMMA	
ordinal	TokenNameIdentifier	 ordinal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Tell the caller we didn't clear part of the cache, so it doesn't 	TokenNameCOMMENT_LINE	Tell the caller we didn't clear part of the cache, so it doesn't 
// have to flush its on-disk index now 	TokenNameCOMMENT_LINE	have to flush its on-disk index now 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
categoryPath	TokenNameIdentifier	 category Path
,	TokenNameCOMMA	
int	TokenNameint	
prefixLen	TokenNameIdentifier	 prefix Len
,	TokenNameCOMMA	
int	TokenNameint	
ordinal	TokenNameIdentifier	 ordinal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
addLabel	TokenNameIdentifier	 add Label
(	TokenNameLPAREN	
categoryPath	TokenNameIdentifier	 category Path
,	TokenNameCOMMA	
prefixLen	TokenNameIdentifier	 prefix Len
,	TokenNameCOMMA	
ordinal	TokenNameIdentifier	 ordinal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Tell the caller we didn't clear part of the cache, so it doesn't 	TokenNameCOMMENT_LINE	Tell the caller we didn't clear part of the cache, so it doesn't 
// have to flush its on-disk index now 	TokenNameCOMMENT_LINE	have to flush its on-disk index now 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the number of bytes in memory used by this object. * @return Number of bytes in memory used by this object. */	TokenNameCOMMENT_JAVADOC	 Returns the number of bytes in memory used by this object. @return Number of bytes in memory used by this object. 
public	TokenNamepublic	
int	TokenNameint	
getMemoryUsage	TokenNameIdentifier	 get Memory Usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
memoryUsage	TokenNameIdentifier	 memory Usage
=	TokenNameEQUAL	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
cache	TokenNameIdentifier	 cache
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
this	TokenNamethis	
.	TokenNameDOT	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
getMemoryUsage	TokenNameIdentifier	 get Memory Usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
memoryUsage	TokenNameIdentifier	 memory Usage
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
