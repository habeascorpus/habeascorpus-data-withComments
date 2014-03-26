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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
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
/** * An an LRU cache of mapping from name to int. * Used to cache Ordinals of category paths. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 An an LRU cache of mapping from name to int. Used to cache Ordinals of category paths. * @lucene.experimental 
// Note: Nothing in this class is synchronized. The caller is assumed to be 	TokenNameCOMMENT_LINE	Note: Nothing in this class is synchronized. The caller is assumed to be 
// synchronized so that no two methods of this class are called concurrently. 	TokenNameCOMMENT_LINE	synchronized so that no two methods of this class are called concurrently. 
class	TokenNameclass	
NameIntCacheLRU	TokenNameIdentifier	 Name Int Cache LRU
{	TokenNameLBRACE	
private	TokenNameprivate	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
cache	TokenNameIdentifier	 cache
;	TokenNameSEMICOLON	
long	TokenNamelong	
nMisses	TokenNameIdentifier	 n Misses
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// for debug 	TokenNameCOMMENT_LINE	for debug 
long	TokenNamelong	
nHits	TokenNameIdentifier	 n Hits
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// for debug 	TokenNameCOMMENT_LINE	for debug 
private	TokenNameprivate	
int	TokenNameint	
maxCacheSize	TokenNameIdentifier	 max Cache Size
;	TokenNameSEMICOLON	
NameIntCacheLRU	TokenNameIdentifier	 Name Int Cache LRU
(	TokenNameLPAREN	
int	TokenNameint	
maxCacheSize	TokenNameIdentifier	 max Cache Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
maxCacheSize	TokenNameIdentifier	 max Cache Size
=	TokenNameEQUAL	
maxCacheSize	TokenNameIdentifier	 max Cache Size
;	TokenNameSEMICOLON	
createCache	TokenNameIdentifier	 create Cache
(	TokenNameLPAREN	
maxCacheSize	TokenNameIdentifier	 max Cache Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getMaxSize	TokenNameIdentifier	 get Max Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxCacheSize	TokenNameIdentifier	 max Cache Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
createCache	TokenNameIdentifier	 create Cache
(	TokenNameLPAREN	
int	TokenNameint	
maxSize	TokenNameIdentifier	 max Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
maxSize	TokenNameIdentifier	 max Size
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cache	TokenNameIdentifier	 cache
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
1000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
0.7	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//for LRU 	TokenNameCOMMENT_LINE	for LRU 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
cache	TokenNameIdentifier	 cache
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
1000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
0.7	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//no need for LRU 	TokenNameCOMMENT_LINE	no need for LRU 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
Integer	TokenNameIdentifier	 Integer
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
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
nMisses	TokenNameIdentifier	 n Misses
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
nHits	TokenNameIdentifier	 n Hits
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Subclasses can override this to provide caching by e.g. hash of the string. * @param name * @return */	TokenNameCOMMENT_JAVADOC	 Subclasses can override this to provide caching by e.g. hash of the string. @param name @return 
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Note that a copy constructor (cloning) here is necessary, because a 	TokenNameCOMMENT_LINE	Note that a copy constructor (cloning) here is necessary, because a 
// CategoryPath object is mutable, so we cannot save a reference to an 	TokenNameCOMMENT_LINE	CategoryPath object is mutable, so we cannot save a reference to an 
// existing CategoryPath. Subclasses which override this method can 	TokenNameCOMMENT_LINE	existing CategoryPath. Subclasses which override this method can 
// avoid this cloning by, e.g., hashing the name. 	TokenNameCOMMENT_LINE	avoid this cloning by, e.g., hashing the name. 
return	TokenNamereturn	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
int	TokenNameint	
prefixLen	TokenNameIdentifier	 prefix Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Note that a copy constructor (cloning) here is necessary, because a 	TokenNameCOMMENT_LINE	Note that a copy constructor (cloning) here is necessary, because a 
// CategoryPath object is mutable, so we cannot save a reference to an 	TokenNameCOMMENT_LINE	CategoryPath object is mutable, so we cannot save a reference to an 
// existing CategoryPath. Subclasses which override this method can 	TokenNameCOMMENT_LINE	existing CategoryPath. Subclasses which override this method can 
// avoid this cloning by, e.g., hashing the name. 	TokenNameCOMMENT_LINE	avoid this cloning by, e.g., hashing the name. 
return	TokenNamereturn	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
prefixLen	TokenNameIdentifier	 prefix Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a new value to cache. * Return true if cache became full and some room need to be made. */	TokenNameCOMMENT_JAVADOC	 Add a new value to cache. Return true if cache became full and some room need to be made. 
boolean	TokenNameboolean	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
isCacheFull	TokenNameIdentifier	 is Cache Full
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
int	TokenNameint	
prefixLen	TokenNameIdentifier	 prefix Len
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
prefixLen	TokenNameIdentifier	 prefix Len
)	TokenNameRPAREN	
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
isCacheFull	TokenNameIdentifier	 is Cache Full
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
isCacheFull	TokenNameIdentifier	 is Cache Full
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
maxCacheSize	TokenNameIdentifier	 max Cache Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
stats	TokenNameIdentifier	 stats
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"#miss="	TokenNameStringLiteral	#miss=
+	TokenNamePLUS	
nMisses	TokenNameIdentifier	 n Misses
+	TokenNamePLUS	
" #hit="	TokenNameStringLiteral	 #hit=
+	TokenNamePLUS	
nHits	TokenNameIdentifier	 n Hits
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If cache is full remove least recently used entries from cache. * Return true if anything was removed, false otherwise. * * See comment in {@link DirectoryTaxonomyWriter#addToCache(String, Integer)} * for an explanation why we clean 2/3rds of the cache, and not just one * entry. */	TokenNameCOMMENT_JAVADOC	 If cache is full remove least recently used entries from cache. Return true if anything was removed, false otherwise. * See comment in {@link DirectoryTaxonomyWriter#addToCache(String, Integer)} for an explanation why we clean 2/3rds of the cache, and not just one entry. 
boolean	TokenNameboolean	
makeRoomLRU	TokenNameIdentifier	 make Room LRU
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isCacheFull	TokenNameIdentifier	 is Cache Full
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
maxCacheSize	TokenNameIdentifier	 max Cache Size
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
n	TokenNameIdentifier	 n
&&	TokenNameAND_AND	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
