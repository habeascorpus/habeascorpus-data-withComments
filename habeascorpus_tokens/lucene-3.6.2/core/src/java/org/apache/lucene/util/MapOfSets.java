package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
/** * Helper class for keeping Lists of Objects associated with keys. <b>WARNING: THIS CLASS IS NOT THREAD SAFE</b> * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 Helper class for keeping Lists of Objects associated with keys. <b>WARNING: THIS CLASS IS NOT THREAD SAFE</b> @lucene.internal 
public	TokenNamepublic	
class	TokenNameclass	
MapOfSets	TokenNameIdentifier	 Map Of Sets
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>>	TokenNameRIGHT_SHIFT	
theMap	TokenNameIdentifier	 the Map
;	TokenNameSEMICOLON	
/** * @param m the backing store for this object */	TokenNameCOMMENT_JAVADOC	 @param m the backing store for this object 
public	TokenNamepublic	
MapOfSets	TokenNameIdentifier	 Map Of Sets
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>>	TokenNameRIGHT_SHIFT	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
{	TokenNameLBRACE	
theMap	TokenNameIdentifier	 the Map
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return direct access to the map backing this object. */	TokenNameCOMMENT_JAVADOC	 @return direct access to the map backing this object. 
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
K	TokenNameIdentifier	 K
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>>	TokenNameRIGHT_SHIFT	
getMap	TokenNameIdentifier	 get Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
theMap	TokenNameIdentifier	 the Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds val to the Set associated with key in the Map. If key is not * already in the map, a new Set will first be created. * @return the size of the Set associated with key once val is added to it. */	TokenNameCOMMENT_JAVADOC	 Adds val to the Set associated with key in the Map. If key is not already in the map, a new Set will first be created. @return the size of the Set associated with key once val is added to it. 
public	TokenNamepublic	
int	TokenNameint	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
K	TokenNameIdentifier	 K
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
V	TokenNameIdentifier	 V
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
theSet	TokenNameIdentifier	 the Set
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
theMap	TokenNameIdentifier	 the Map
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
theSet	TokenNameIdentifier	 the Set
=	TokenNameEQUAL	
theMap	TokenNameIdentifier	 the Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
theSet	TokenNameIdentifier	 the Set
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
(	TokenNameLPAREN	
23	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
theMap	TokenNameIdentifier	 the Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
theSet	TokenNameIdentifier	 the Set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
theSet	TokenNameIdentifier	 the Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
theSet	TokenNameIdentifier	 the Set
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds multiple vals to the Set associated with key in the Map. * If key is not * already in the map, a new Set will first be created. * @return the size of the Set associated with key once val is added to it. */	TokenNameCOMMENT_JAVADOC	 Adds multiple vals to the Set associated with key in the Map. If key is not already in the map, a new Set will first be created. @return the size of the Set associated with key once val is added to it. 
public	TokenNamepublic	
int	TokenNameint	
putAll	TokenNameIdentifier	 put All
(	TokenNameLPAREN	
K	TokenNameIdentifier	 K
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
vals	TokenNameIdentifier	 vals
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
theSet	TokenNameIdentifier	 the Set
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
theMap	TokenNameIdentifier	 the Map
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
theSet	TokenNameIdentifier	 the Set
=	TokenNameEQUAL	
theMap	TokenNameIdentifier	 the Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
theSet	TokenNameIdentifier	 the Set
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
V	TokenNameIdentifier	 V
>	TokenNameGREATER	
(	TokenNameLPAREN	
23	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
theMap	TokenNameIdentifier	 the Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
theSet	TokenNameIdentifier	 the Set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
theSet	TokenNameIdentifier	 the Set
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
vals	TokenNameIdentifier	 vals
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
theSet	TokenNameIdentifier	 the Set
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
