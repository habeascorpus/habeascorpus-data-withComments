/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cache	TokenNameIdentifier	 cache
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
/** * This is similar to the Map interface, but requires maintaining a given capacity * and does not require put or remove to return values, which lets SerializingCache * be more efficient by avoiding deserialize except on get. */	TokenNameCOMMENT_JAVADOC	 This is similar to the Map interface, but requires maintaining a given capacity and does not require put or remove to return values, which lets SerializingCache be more efficient by avoiding deserialize except on get. 
public	TokenNamepublic	
interface	TokenNameinterface	
ICache	TokenNameIdentifier	 I Cache
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
long	TokenNamelong	
capacity	TokenNameIdentifier	 capacity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setCapacity	TokenNameIdentifier	 set Capacity
(	TokenNameLPAREN	
long	TokenNamelong	
capacity	TokenNameIdentifier	 capacity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
K	TokenNameIdentifier	 K
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
putIfAbsent	TokenNameIdentifier	 put If Absent
(	TokenNameLPAREN	
K	TokenNameIdentifier	 K
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
K	TokenNameIdentifier	 K
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
old	TokenNameIdentifier	 old
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
V	TokenNameIdentifier	 V
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
K	TokenNameIdentifier	 K
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
K	TokenNameIdentifier	 K
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
long	TokenNamelong	
weightedSize	TokenNameIdentifier	 weighted Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
K	TokenNameIdentifier	 K
>	TokenNameGREATER	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
K	TokenNameIdentifier	 K
>	TokenNameGREATER	
hotKeySet	TokenNameIdentifier	 hot Key Set
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
K	TokenNameIdentifier	 K
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return true if the cache implementation inherently copies the cached values; otherwise, * the caller should copy manually before caching shared values like Thrift ByteBuffers. */	TokenNameCOMMENT_JAVADOC	 @return true if the cache implementation inherently copies the cached values; otherwise, the caller should copy manually before caching shared values like Thrift ByteBuffers. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isPutCopying	TokenNameIdentifier	 is Put Copying
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
