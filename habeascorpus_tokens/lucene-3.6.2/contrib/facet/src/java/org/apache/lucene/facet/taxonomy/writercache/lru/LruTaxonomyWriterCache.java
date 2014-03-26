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
lru	TokenNameIdentifier	 lru
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
/** * LRU {@link TaxonomyWriterCache} - good choice for huge taxonomies. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 LRU {@link TaxonomyWriterCache} - good choice for huge taxonomies. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
LruTaxonomyWriterCache	TokenNameIdentifier	 Lru Taxonomy Writer Cache
implements	TokenNameimplements	
TaxonomyWriterCache	TokenNameIdentifier	 Taxonomy Writer Cache
{	TokenNameLBRACE	
public	TokenNamepublic	
enum	TokenNameenum	
LRUType	TokenNameIdentifier	 LRU Type
{	TokenNameLBRACE	
LRU_HASHED	TokenNameIdentifier	 LRU  HASHED
,	TokenNameCOMMA	
LRU_STRING	TokenNameIdentifier	 LRU  STRING
}	TokenNameRBRACE	
private	TokenNameprivate	
NameIntCacheLRU	TokenNameIdentifier	 Name Int Cache LRU
cache	TokenNameIdentifier	 cache
;	TokenNameSEMICOLON	
public	TokenNamepublic	
LruTaxonomyWriterCache	TokenNameIdentifier	 Lru Taxonomy Writer Cache
(	TokenNameLPAREN	
int	TokenNameint	
cacheSize	TokenNameIdentifier	 cache Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO (Facet): choose between NameHashIntCacheLRU and NameIntCacheLRU. 	TokenNameCOMMENT_LINE	TODO (Facet): choose between NameHashIntCacheLRU and NameIntCacheLRU. 
// For guaranteed correctness - not relying on no-collisions in the hash 	TokenNameCOMMENT_LINE	For guaranteed correctness - not relying on no-collisions in the hash 
// function, NameIntCacheLRU should be used: 	TokenNameCOMMENT_LINE	function, NameIntCacheLRU should be used: 
// On the other hand, NameHashIntCacheLRU takes less RAM but if there 	TokenNameCOMMENT_LINE	On the other hand, NameHashIntCacheLRU takes less RAM but if there 
// are collisions (which we never found) two different paths would be 	TokenNameCOMMENT_LINE	are collisions (which we never found) two different paths would be 
// mapped to the same ordinal... 	TokenNameCOMMENT_LINE	mapped to the same ordinal... 
this	TokenNamethis	
(	TokenNameLPAREN	
cacheSize	TokenNameIdentifier	 cache Size
,	TokenNameCOMMA	
LRUType	TokenNameIdentifier	 LRU Type
.	TokenNameDOT	
LRU_HASHED	TokenNameIdentifier	 LRU  HASHED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
LruTaxonomyWriterCache	TokenNameIdentifier	 Lru Taxonomy Writer Cache
(	TokenNameLPAREN	
int	TokenNameint	
cacheSize	TokenNameIdentifier	 cache Size
,	TokenNameCOMMA	
LRUType	TokenNameIdentifier	 LRU Type
lruType	TokenNameIdentifier	 lru Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO (Facet): choose between NameHashIntCacheLRU and NameIntCacheLRU. 	TokenNameCOMMENT_LINE	TODO (Facet): choose between NameHashIntCacheLRU and NameIntCacheLRU. 
// For guaranteed correctness - not relying on no-collisions in the hash 	TokenNameCOMMENT_LINE	For guaranteed correctness - not relying on no-collisions in the hash 
// function, NameIntCacheLRU should be used: 	TokenNameCOMMENT_LINE	function, NameIntCacheLRU should be used: 
// On the other hand, NameHashIntCacheLRU takes less RAM but if there 	TokenNameCOMMENT_LINE	On the other hand, NameHashIntCacheLRU takes less RAM but if there 
// are collisions (which we never found) two different paths would be 	TokenNameCOMMENT_LINE	are collisions (which we never found) two different paths would be 
// mapped to the same ordinal... 	TokenNameCOMMENT_LINE	mapped to the same ordinal... 
if	TokenNameif	
(	TokenNameLPAREN	
lruType	TokenNameIdentifier	 lru Type
==	TokenNameEQUAL_EQUAL	
LRUType	TokenNameIdentifier	 LRU Type
.	TokenNameDOT	
LRU_HASHED	TokenNameIdentifier	 LRU  HASHED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
cache	TokenNameIdentifier	 cache
=	TokenNameEQUAL	
new	TokenNamenew	
NameHashIntCacheLRU	TokenNameIdentifier	 Name Hash Int Cache LRU
(	TokenNameLPAREN	
cacheSize	TokenNameIdentifier	 cache Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
cache	TokenNameIdentifier	 cache
=	TokenNameEQUAL	
new	TokenNamenew	
NameIntCacheLRU	TokenNameIdentifier	 Name Int Cache LRU
(	TokenNameLPAREN	
cacheSize	TokenNameIdentifier	 cache Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasRoom	TokenNameIdentifier	 has Room
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
<=	TokenNameLESS_EQUAL	
(	TokenNameLPAREN	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
getMaxSize	TokenNameIdentifier	 get Max Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cache	TokenNameIdentifier	 cache
=	TokenNameEQUAL	
null	TokenNamenull	
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
Integer	TokenNameIdentifier	 Integer
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
categoryPath	TokenNameIdentifier	 category Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
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
// TODO (Facet): unfortunately, we make a copy here! we can avoid part of 	TokenNameCOMMENT_LINE	TODO (Facet): unfortunately, we make a copy here! we can avoid part of 
// the copy by creating a wrapper object (but this still creates a new 	TokenNameCOMMENT_LINE	the copy by creating a wrapper object (but this still creates a new 
// object). A better implementation of the cache would not use Java's 	TokenNameCOMMENT_LINE	object). A better implementation of the cache would not use Java's 
// hash table, but rather some other hash table we can control, and 	TokenNameCOMMENT_LINE	hash table, but rather some other hash table we can control, and 
// pass the length parameter into it... 	TokenNameCOMMENT_LINE	pass the length parameter into it... 
Integer	TokenNameIdentifier	 Integer
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
categoryPath	TokenNameIdentifier	 category Path
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
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
boolean	TokenNameboolean	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
categoryPath	TokenNameIdentifier	 category Path
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
ordinal	TokenNameIdentifier	 ordinal
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If the cache is full, we need to clear one or more old entries 	TokenNameCOMMENT_LINE	If the cache is full, we need to clear one or more old entries 
// from the cache. However, if we delete from the cache a recent 	TokenNameCOMMENT_LINE	from the cache. However, if we delete from the cache a recent 
// addition that isn't yet in our reader, for this entry to be 	TokenNameCOMMENT_LINE	addition that isn't yet in our reader, for this entry to be 
// visible to us we need to make sure that the changes have been 	TokenNameCOMMENT_LINE	visible to us we need to make sure that the changes have been 
// committed and we reopen the reader. Because this is a slow 	TokenNameCOMMENT_LINE	committed and we reopen the reader. Because this is a slow 
// operation, we don't delete entries one-by-one but rather in bulk 	TokenNameCOMMENT_LINE	operation, we don't delete entries one-by-one but rather in bulk 
// (put() removes the 2/3rd oldest entries). 	TokenNameCOMMENT_LINE	(put() removes the 2/3rd oldest entries). 
if	TokenNameif	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
makeRoomLRU	TokenNameIdentifier	 make Room LRU
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
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
boolean	TokenNameboolean	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
categoryPath	TokenNameIdentifier	 category Path
,	TokenNameCOMMA	
prefixLen	TokenNameIdentifier	 prefix Len
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
ordinal	TokenNameIdentifier	 ordinal
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If the cache is full, we need to clear one or more old entries 	TokenNameCOMMENT_LINE	If the cache is full, we need to clear one or more old entries 
// from the cache. However, if we delete from the cache a recent 	TokenNameCOMMENT_LINE	from the cache. However, if we delete from the cache a recent 
// addition that isn't yet in our reader, for this entry to be 	TokenNameCOMMENT_LINE	addition that isn't yet in our reader, for this entry to be 
// visible to us we need to make sure that the changes have been 	TokenNameCOMMENT_LINE	visible to us we need to make sure that the changes have been 
// committed and we reopen the reader. Because this is a slow 	TokenNameCOMMENT_LINE	committed and we reopen the reader. Because this is a slow 
// operation, we don't delete entries one-by-one but rather in bulk 	TokenNameCOMMENT_LINE	operation, we don't delete entries one-by-one but rather in bulk 
// (put() removes the 2/3rd oldest entries). 	TokenNameCOMMENT_LINE	(put() removes the 2/3rd oldest entries). 
if	TokenNameif	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
makeRoomLRU	TokenNameIdentifier	 make Room LRU
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
