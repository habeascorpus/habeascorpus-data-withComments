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
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * An an LRU cache of mapping from name to int. * Used to cache Ordinals of category paths. * It uses as key, hash of the path instead of the path. * This way the cahce takes less RAM, but correctness depends on * assuming no collisions. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 An an LRU cache of mapping from name to int. Used to cache Ordinals of category paths. It uses as key, hash of the path instead of the path. This way the cahce takes less RAM, but correctness depends on assuming no collisions. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
NameHashIntCacheLRU	TokenNameIdentifier	 Name Hash Int Cache LRU
extends	TokenNameextends	
NameIntCacheLRU	TokenNameIdentifier	 Name Int Cache LRU
{	TokenNameLBRACE	
NameHashIntCacheLRU	TokenNameIdentifier	 Name Hash Int Cache LRU
(	TokenNameLPAREN	
int	TokenNameint	
maxCacheSize	TokenNameIdentifier	 max Cache Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
maxCacheSize	TokenNameIdentifier	 max Cache Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
longHashCode	TokenNameIdentifier	 long Hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
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
return	TokenNamereturn	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
longHashCode	TokenNameIdentifier	 long Hash Code
(	TokenNameLPAREN	
prefixLen	TokenNameIdentifier	 prefix Len
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
